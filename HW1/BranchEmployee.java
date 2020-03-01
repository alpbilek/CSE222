public class BranchEmployee {
    /**
     * Member field for the BranchEmployee
     */
    private String name;


    int p=0;
    private Customer arrCustomer[];
    private Customer arrTemp[];
    /**
     * setter name
     * @param name sets the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter name
     * @return returns the name
     */
    public String getName() {
        return name;
    }

    /**
     * Constructor of the BranchEmployee
     * Creates the customer arrays for the adding and removing processes
     */
    BranchEmployee(){
        arrCustomer=new Customer[14];
        arrTemp=new Customer[14];
        for(int i=0;i<14;i++){
            arrTemp[i]=new Customer();
            arrCustomer[i]=new Customer();
        }
    }

    /**
     * getter for the array's special index
     * @param indexx for the array
     * @return returns the BranchEmployee object
     */
    public Customer getC(int indexx){
        return arrCustomer[indexx];
    }

    /**
     * Adds the obj to the Customer array
     * @param obj for the array
     */
    void addCustomer(Customer obj){
        arrCustomer[p]=obj;
        p++;
        System.out.println("Customer added successfully!");
    }

    /**
     * Remover for the Customer array
     * @param index for the which index going to be removed!
     */
    void removeCustomer(int index){
        int u = 0;
        for (int j = 0; j < p; j++) {

            if (j == index) {
                arrTemp[u] = arrCustomer[++j];
                u++;
            } else {
                arrTemp[u] = arrCustomer[j];
                u++;
            }
        }
        p--;
        for (int k = 0; k < p; k++) {
            arrCustomer[k] =arrTemp[k];
        }
        System.out.println("Customer removed successfully!");
    }
}

