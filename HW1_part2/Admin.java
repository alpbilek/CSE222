import java.util.ArrayList;

/**
 * extends from CargoCompany and implements from the SG
 */
public class Admin extends CargoCompany implements SG {
    /**
     * Fields of the Admin Class
     */

    private String  name;
    private ArrayList<Branch> BArr=new ArrayList<Branch>();
    private ArrayList<BranchEmployee> BEArr=new ArrayList<BranchEmployee>();
    private ArrayList<TransportationPersonnel> TPArr=new ArrayList<TransportationPersonnel>();

    /**
     * Adder for the Branch ArrayList
     * @param obj is the object which is going to push to ArrayList
     */
    private void addB(Branch obj){BArr.add(obj);
        System.out.println("Branch added successfully!");}

    /**
     * REmover for the Branch ArrayList
     * @param index is the index that is going to delete from the ArrayList
     */
    private void removeB(int index){BArr.remove(index);
        System.out.println("Branch removed successfully!");}

    /**
     * Adder for the BranchEmployee ArrayList
     * @param obj is the object which is going to push to ArrayList
     */
    private void addBE(BranchEmployee obj){BEArr.add(obj);
        System.out.println("Branch Employee added successfully!");}

    /**
     * Remover for the BranchEmployee ArrayList
     * @param index is the index that is going to delete from the ArrayList
     */
    private void removeBE(int index){BEArr.remove(index);
    System.out.println("Branch Employee removed successfully!");}

    /**
     * Adder for the TransportationPersonnel ArrayList
     * @param obj is the object which is going to push to ArrayList
     */
    private void addTP(TransportationPersonnel obj){TPArr.add(obj);
    System.out.println("Transportation Personnel added successfully!");}

    /**
     * REmover for the TransportationPersonnel ArrayList
     * @param index is the index that is going to delete from the ArrayList
     */
    private void removeTP(int index){
        TPArr.remove(index);
        System.out.println("Transportation Personnel removed successfully!");}

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
        Branch B=new Branch();
        BranchEmployee BE=new BranchEmployee();
        TransportationPersonnel TP=new TransportationPersonnel();
        Branch B2=new Branch();
        BranchEmployee BE2=new BranchEmployee();
        TransportationPersonnel TP2=new TransportationPersonnel();
        BE.setname("firstBranchEmployee");
        B.setname("firstBranch");
        TP.setname("firstTP");
        B2.setname("secondBranch");
        BE2.setname("secondBranchEmployee");
        TP2.setname("secondTP");
        /**
         * Testing the adding and removing processes for the Branch
         */
        addB(B);
        addB(B2);
        for(int i=0;i<BArr.size();i++){
            System.out.println(BArr.get(i).getname());
        }
        removeB(0);
        for(int i=0;i<BArr.size();i++){
            System.out.println(BArr.get(i).getname());
        }

        /**
         * Testing the adding and removing processes for the BranchEmployee
         */

        addBE(BE);
        addBE(BE2);
        for(int i=0;i<BEArr.size();i++){
            System.out.println(BEArr.get(i).getname());
        }
        removeBE(1);

        for(int i=0;i<BEArr.size();i++){
            System.out.println(BEArr.get(i).getname());
        }

        /**
         * Testing the adding and removing processes for the Transportation Personnel
         */

        addTP(TP);
        addTP(TP2);
        addTP(TP);
        for(int i=0;i<TPArr.size();i++){
            System.out.println(TPArr.get(i).getname());
        }
        removeTP(1);
        for(int i=0;i<TPArr.size();i++){
            System.out.println(TPArr.get(i).getname());
        }
    }

}
