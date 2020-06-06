public interface SearchTree {
    /**
     * ADDER FOR THE SEARCHTREES
     * @param item ADDS THE GIVEN SOFTWARE OBJECT
     */
    public void add(Software item);

    /**
     * REMOVER FOR THE SEARCHTREES
     * @param price REMOVES BY PRICE
     */
    public void remove(int price);

    /**
     * UPDATER FOR THE SEARCHTREES
     * @param price FINDS THE WONDERED NODE BY PRICE
     * @param Name NEW NAME
     * @param quantity NEW QUANTITY
     */
    public void update(int price,String Name,int quantity);
}
