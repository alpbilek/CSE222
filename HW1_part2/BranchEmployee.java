import java.util.ArrayList;

public class BranchEmployee extends CargoCompany implements SG {
    /**
     * Fields of the BranchEmployee class!
     */
    private String name;
    private ArrayList<Customer> CArr=new ArrayList<Customer>();
    public void addC(Customer obj){CArr.add(obj);
        System.out.println("Customer added successfully");}
    public void removeC(int index){CArr.remove(index);
        System.out.println("Customer removed successfully");}

    /**
     * Virtual function from the SG interface
      * @return name
     */
    @Override
    public String getname() {
        return name;
    }

    /**
     * Virtual function from the SG interface
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
     * Virtual function from the CargoCompany base(super) class
     */
    @Override
    public void test() {
        Customer C=new Customer();
        Customer C2=new Customer();
        C.setname("firstCustomer");
        C2.setname("secondCustomer");

        /**
         * Testing adding and removing processes for the Customer!
         */
        addC(C);
        addC(C2);


        for(int i=0;i<CArr.size();i++){
            System.out.println(CArr.get(i).getname());
        }

        removeC(0);
        for(int i=0;i<CArr.size();i++){
            System.out.println(CArr.get(i).getname());
        }


    }
}
