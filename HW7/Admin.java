public class Admin  implements SearchTree{
    /**
     * ADMIN OF THE SYSTEM
     */
    private Software root;

    /**
     * FOR THE MANIPULATION OF THE TREE
     * @param map GIVES THE TREE TO THE ADMIN
     */
    Admin(Software map){
        root=map;
    }

    /**
     * FOR LOGIN
     */
    private String password="161044049";
    public String getPassword() {
        return password;
    }

    /**
     * ADDS A SOFTWARE TO THE TREE
     * @param item GIVEN NEW SOFTWARE PRODUCT
     */
    @Override
    public void add(Software item) {root=addRec(root,item.getName(),item.getQuantity(),item.getPrice());}

    /**
     * HELPER FOR THE ADD
     * @param head ROOT OF THE TREE
     * @param name NAME OF THE PRODUCT
     * @param quantity QUANTITY OF THE PRODUCT
     * @param price PRICE OF THE PRODUCT
     * @return NEW TREE
     */
    private Software addRec(Software head, String name, int quantity, int price){
        if(head==null){
            head=new Software(name,quantity,price);
            return head;
        }
        if(price<head.getPrice()){
            head.left=addRec(head.left,name, quantity,price);
        }
        else if(price>head.getPrice()){
            head.right=addRec(head.right,name,quantity,price);
        }
        else if(price==head.getPrice()){
            head.setQuantity(head.getQuantity()+1);
            return head;
        }
        return head;
    }

    /**
     * REMOVES A NODE FROM TREE
     * @param price GIVEN PRICE
     */
    @Override
    public void remove(int price) {
        Software temp=find(root,price);
        if(temp==null){
            System.out.println("----Given product could not find on database----");
        }
        else if(temp.getQuantity()>1){
            temp.setQuantity( temp.getQuantity()-1);
        }

        else{
            root=removeRec(root,price);
        }
    }

    /**
     * HELPER FOR THE REMOVE
     * @param head ROOT OF THE TREE
     * @param price GIVEN PRICE
     * @return FOUND NODE OF THE TREE
     */
    private Software removeRec(Software head, int price){
        if(head==null){
            return null;
        }
        if(head.getPrice()>price){
            head.left=removeRec(head.left,price);
        }
        else if(head.getPrice()<price){
            head.right=removeRec(head.right,price);
        }
        else{
            if(head.left!=null && head.right!=null){
                Software temp=head;
                Software temp2=minelement(temp.right);
                head.setPrice(temp2.getPrice());
                head.right=removeRec(head.right,temp2.getPrice());
            }
            else if(head.left!=null){
                head=head.left;
            }
            else if(head.right!=null){
                head=head.right;
            }
            else{
                head=null;
            }
        }
        return head;
    }

    /**
     * HELPER FOR THE REMOVE METHOD
     * GETS THE SMALLEST VALUE OF THE TREE'S RIGHT
     * @param head ROOT OF THE TREE
     * @return SMALLEST VALUE OF THE TREE'S RIGHT
     */
    private Software minelement(Software head){
        if(head.left==null){
            return head;
        }
        else{
            return minelement(head.left);
        }
    }

    /**
     * FINDS THE WONDERED NODE
     * @param head ROOT OF THE TREE
     * @param price FINDS BY THEIR PRICE
     * @return FOUND NODE OF THE TREE
     */
    private Software find(Software head,int price){
        if(head==null){
            return null;
        }
        int comparer=price-head.getPrice();
        if(comparer==0){
            return head;
        }
        else if(comparer<0){
            return  find(head.left,price);
        }
        else{
            return find(head.right,price);
        }

    }

    /**
     * UPDATES THE NAME AND QUANTTIY INFO
     * @param price FINDS THE WONDERED NODE BY PRICE
     * @param Name NEW NAME
     * @param quantity NEW QUANTITY
     */
    @Override
    public void update(int price, String Name, int quantity) {
            Software temp=find(root,price);
            if(temp!=null){
                temp.setName(Name);
                temp.setQuantity(quantity);
                System.out.println("Product information has updated");
            }
            else{
                System.out.println("Product could not find");
            }
    }
}
