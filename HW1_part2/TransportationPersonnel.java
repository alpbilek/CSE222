import java.util.ArrayList;

public class TransportationPersonnel extends CargoCompany implements SG {

    /**
     * Fields of the Transportation Personnel class
      */
    private String name;
    private ArrayList<Shipment> SArr=new ArrayList<Shipment>();

    /**
     * Adder method for the Shipment ArrayList
     * @param obj is the object which is going to push to ArrayList
     */
    public void addS(Shipment obj){SArr.add(obj);
        System.out.println("Shipment added successfully");}

    /**
     * Remover method for the Shipment ArrayList
     * @param index is index that is going to delete from the ArrayList
     */
    public void removeS(int index){SArr.remove(index);System.out.println("Shipment removed successfully");}

    /**
     * Checks the statu of the Shipment
     * @param index is index that is going to check
     */
    void checkShipment(int index){
        if(SArr.get(index).statu==1){
            System.out.println("Your shipment has been delivered!!");
            removeS(index);
        }
        else{
            System.out.println("Your shipment has not been delivered yet!!");
        }
    }

    /**
     * Changes the statues for the shiments
     * @param index for the array
     */
    void changeStatu(int index){
        SArr.get(index).statu=1;
    }

    /**
     * Virtual function from the CargoCompany
     */
    @Override
    public void test() {
        Shipment S=new Shipment();
        Shipment S2=new Shipment();
        S.setname("firstShipment");
        S2.setname("secondShipment");

        /**
         * Testing the adding and removing processes for the Shipment
         */
        addS(S);
        addS(S2);
        addS(S2);
        addS(S);
        for(int i=0;i<SArr.size();i++){
            System.out.println(SArr.get(i).getname());
        }

        removeS(0);
        for(int i=0;i<SArr.size();i++){
            System.out.println(SArr.get(i).getname());
        }
        checkShipment(2);
        changeStatu(2);
        checkShipment(2);
    }
    @Override
    public void setname(String name) {
        if(this.name==null){
            this.name=name;
        }
        else{
            System.out.println("You have already initialized a data to this variable!");
        }
    }
    public String getname(){
        return name;
    }
}
