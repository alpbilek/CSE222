public class TransportationPersonnel {
    /**
     * fields for the TransportationPewrsonnel
     */
    int a;
    String nameTP;
    private Shipment Sarr[];
    private Shipment TempSarr[];
    int s=0;

    /**
     * Constructor for TransportationPersonnel
     * Creating Shipment arrays for the data storage!
     */
    public TransportationPersonnel(){
        Sarr=new Shipment[14];
        TempSarr=new Shipment[14];
        for(int i=0;i<14;i++){
            Sarr[i]=new Shipment();
            TempSarr[i]=new Shipment();
        }
    }

    /**
     * getter
     * @param indexx takes it for the return value
     * @return array's an index
     */
    public Shipment getS(int indexx){
        return Sarr[indexx];
    }

    /**
     * Adder for Shipment
     * @param obj puts the obj to the Shipment array and increment the index!
     */
    public void addS(Shipment obj){
        Sarr[s]=obj;
        s++;
        System.out.println("Shipment added successfully!");
    }

    /**
     * Remover for the Shipment
     * We use temp array for the remove
     * @param ind takes it for which index going to remove from the array
     */
    public void removeS(int ind) {
        int u = 0;
        for (int j = 0; j < s; j++) {

            if (j == ind) {
                TempSarr[u] = Sarr[++j];
                u++;
            } else {
                TempSarr[u] = Sarr[j];
                u++;
            }
        }
        s--;
        for (int k = 0; k < s; k++) {
            Sarr[k] =TempSarr[k];
        }
        System.out.println("Shipment removed successfully!");
    }

    /**
     * Checks the shipments statues!
     * @param index for the array
     */
    void checkShipment(int index){
        if(Sarr[index].statu==1){
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
        Sarr[index].statu=1;
    }
}
