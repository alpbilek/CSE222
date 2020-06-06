public class SoftwareStore {
    /**
     * FIELDS
     */
    private Software root=new Software();
    Admin admin;

    /**
     * FOR THE ADMIN'S MANIPULATION ON THE TREE
     */
    SoftwareStore(){
        admin=new Admin(root);
    }

    /**
     * PRINTS THE TREE
     */
    public void printer(){
        traverser(root);
    }

    /**
     * INORDER TRAVERSAL
     * @param head ROOT OF THE TREE
     */
    private void traverser(Software head){
        if(head==null){
            return;
        }
        traverser(head.left);
        if(head.getQuantity()!=0){
            System.out.println("Product Name:"+head.getName()+", Quantity:"+head.getQuantity()+", Price:"+head.getPrice()+"$");
        }
        traverser(head.right);
    }

    /**
     * SEARCH BY NAME
     * @param name GIVEN NAME
     */
    public void searchByName(String name){
        searchByNameRec(root,name);
    }

    /**
     * HELPER FOR THE SEARCHBYNAME METHOD
     * @param head ROOT OF THE TREE
     * @param name GIVEN NAME
     */
    private void searchByNameRec(Software head,String name){
        if(head==null){
            return;
        }
        else{
            if(name.equals(head.getName())){
                System.out.println("Searched software products info is\nQuantity:"+head.getQuantity()+"\nPrice:"+head.getPrice());
                return;
            }
            searchByNameRec(head.left,name);
            searchByNameRec(head.right,name);
        }
    }

    /**
     * SEARCH BY PRICE
     * @param price GIVEN PRICE
     */
    public void searchByPrice(int price){
        Software temp=searchByPriceRec(root,price);
        if(temp==null){
            System.out.println("----Not found----");
        }
        else{
            System.out.println("Searched software products info is\nName:"+temp.getName()+"\nQuantity:"+temp.getQuantity());
        }
    }

    /**
     * HELPER FOR THE SEARCHBYPRICE
     * @param head ROOT OF THE TREE
     * @param price GIVEN KEY
     * @return FOUND NODE OF THE TREE
     */
    private Software searchByPriceRec(Software head,int price){
        if(head==null){
            return  null;
        }
        int comparer=price-head.getPrice();
        if(comparer==0){
            return head;
        }
        else if(comparer<0){
            return  searchByPriceRec(head.left,price);
        }
        else{
            return  searchByPriceRec(head.right,price);
        }
    }

    /**
     * SEARCH BY QUANTITY
     * @param Quantity GIVEN QUANTITY
     */
    public void searchByQuantity(int Quantity){
        searchByQuantityRec(root,Quantity);
    }

    /**
     * HELPER FOR SEARCHBYQUANTITY
     * @param head ROOT OF THE TREE
     * @param Quantity GIVEN QUANTITY
     */
    private  void searchByQuantityRec(Software head,int Quantity){
        if(head==null){
            return;
        }
        else{
            if(head.getQuantity()==Quantity){
                System.out.println("Searched software products info is\nName:"+head.getName()+"\nPrice:"+head.getPrice());
            }
            searchByQuantityRec(head.left,Quantity);
            searchByQuantityRec(head.right,Quantity);
        }
    }
}

