public class Software {
    /**
     * BASIC NODE FOR BINARY SEARCH TREE
     */
    /**
     * FIELDS
     */
    private String name;
    private int quantity,price;
    Software left,right;
    Software(String name,int quantity,int price){
        left=null;
        right=null;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    Software(){}

    /**
     * NAME SETTER
     * @param name GIVEN NAME
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * PRICE SETTER
     * @param price GIVEN PRICE
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * QUANTITY SETTER
     * @param quantity GIVEN QUANTITY
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * QUANTITY GETTER
     * @return QUANTITY
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * NAME GETTER
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * PRICE GETTER
     * @return PRICE
     */
    public int getPrice() {
        return price;
    }
}
