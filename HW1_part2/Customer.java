public class Customer implements SG {
    /**
     * Field of the Customer class
     */

    private String  name;

    /**
     * Virtual function from SG interface
     * @param name name
     */
    @Override
    public void setname(String name) {
        if(this.name==null){
            this.name=name;
        }
        else{
            System.out.println("You have already initialized a data to this variable!");
        }
    }

    /**
     * Virtual function from SG interface
     * @return name
     */
    @Override
    public String getname() {
        return name;
    }
}
