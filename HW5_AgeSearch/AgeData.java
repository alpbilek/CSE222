public class AgeData implements Comparable{
    /**
     * Constructor for the AgeData Node!
     * @param data takes an integer value and initializes to the object!
     */
    AgeData(int data){
        right=null;
        left=null;
        this.data=data;
    }

    /**
     *Fields
     * Tree's childs
     */
    AgeData right,left;
    int data;
    int counter=1;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    /**
     * Prints the a AgeData's info!
     * @return a String form as info
     */
    @Override
    public String toString() {
        String to=data+" - "+counter;
        return to;
    }
}
