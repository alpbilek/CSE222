public class Admin {
    /**
     * Member fields for the Admin
     */
    public int p;
    private Branch Temp[];
    private Branch Barr[];
    private TransportationPersonnel[] TParr;
    private TransportationPersonnel[] TPtemp;
    private BranchEmployee BEArray[];
    private BranchEmployee TempBE[];

    /**
     * Getter for the BEArrays indexes
     * @param indexx arrays index
     * @return returns the BE object
     */
    public BranchEmployee getBE(int indexx){
        return BEArray[indexx];
    }
    /**
     * Getter for the Barr indexes
     * @param indexx arrays index
     * @return returns the B object
     */
    public Branch getB(int indexx){
        return Barr[indexx];
    }
    /**
     * Getter for the TParr indexes
     * @param indexx arrays index
     * @return returns the TP object
     */
    public TransportationPersonnel getTP(int indexx){
        return TParr[indexx];
    }
    int i=0;
    int t=0;
    int index=0;

    /**
     * Constructor of the Admin
     * Creates Branch,BranchEmployee and TranportationPersonnel arrays
     * @param index It's for the capacity of the all arrays
     */
    Admin(int index){
        TParr=new TransportationPersonnel[index];
        TPtemp=new TransportationPersonnel[index];
        Barr=new Branch[index];
        Temp=new Branch[index];
        TempBE=new BranchEmployee[14];
        BEArray=new BranchEmployee[14];
        for(int l=0;l<index;l++){
            Barr[l]=new Branch();
            Temp[l]=new Branch();
            TParr[l]=new TransportationPersonnel();
            TPtemp[l]=new TransportationPersonnel();
            BEArray[l]=new BranchEmployee();
            TempBE[l]=new BranchEmployee();
        }
    }

    /**
     * Adder for the TransportationPersonnel
     * @param obj adds to array obj
     */
    public void addTP(TransportationPersonnel obj){
        TParr[t]=obj;
        t++;
        System.out.println("Transportation Personnel added successfully!");
    }

    /**
     * Remover for the TransportaionPersonnel
     * @param ind its the which index is going to be removed
     */
    public void removeTP(int ind){
        int u=0;
        for(int j=0;j<t;j++){

            if(j==ind){
                TPtemp[u]=TParr[++j];
                u++;
            }
            else{
                TPtemp[u]=TParr[j];
                u++;
            }
        }
        t--;
        for(int k=0;k<t;k++){
            TParr[k]=TPtemp[k];
        }
        System.out.println("Transportation Personnel removed successfully!");
    }

    /**
     * Adder for the Branch
     * @param obj adds to array obj
     */
    public void addB(Branch obj){
        Barr[i]=obj;
        i++;
        System.out.println("Branch added successfully!");
    }

    /**
     * Remover for the Branch
     * @param ind its the which index is going to be removed
     */
    public void removeB(int ind){
        int u=0;
        for(int j=0;j<i;j++){
            if(j==ind){
                Temp[u]=Barr[++j];
                u++;
            }
            else {
                Temp[u] = Barr[j];
                u++;
            }
        }
        i--;
        for(int z=0;z<i;z++){
            Barr[z]=Temp[z];
        }
        System.out.println("Branch removed successfully!");
    }

    /**
     * Adder for the BranchEmployee
     * @param obj adds to array obj
     */
    public void addBE(BranchEmployee obj){
        BEArray[index]=obj;
        index++;
        System.out.println("Branch Employee added successfully!");
    }

    /**
     * Remover for the BranchEmployee
     * @param ind its the which index is going to be removed
     */
    public void removeBE(int ind){
        for(int j=0;j<index;j++){
            if(j==ind){
                TempBE[j]=BEArray[j+1];
            }
            else {
                TempBE[j] = BEArray[j];
            }
        }
        index--;
        for(int t=0;t<index;t++){
            BEArray[t]=TempBE[t];
        }
        System.out.println("Branch Employee removed successfully!");
    }
}
