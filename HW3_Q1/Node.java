public class Node<E> {
    /**
     * Generic data array !
     */
    Object data[];

    /**
     * Creates the generic array!
     */
    Node(){
        data=new Object[5];
    }

    /**
     * Fields for the Nodes
     */
    private int capacity=5;
    public Node<E> next;
    public Node<E> prev;

    /**
     * Setter for the next Nodes
     * @param next given Node
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }

    /**
     * Setter for the previous Nodes
     * @param prev given Node!
     */
    public void setPrev(Node<E> prev){this.prev=prev;}

    /**
     * Getter for the Next Node
     * @return next Node
     */
    Node getNext(){return next;}

    /**
     * Getter for the node's data arrays capacity
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Adds the given datas to the data array
     * @param dataLAL given data
     * @param cap given capacity
     */
    public void adder(E dataLAL[],int cap){
        data=dataLAL;
    }

    /**
     * Removes the given index from array
     * @param index given index
     * @return the removed index
     */
    public Object remover(int index){
        int u=0;
        Object temp=data[index];
        Object temparr[]= new Object[5];
        for(int j=0;j<capacity;j++){
            if(j==index){
                temparr[u]=data[++j];
                u++;
            }
            else{
                temparr[u]=data[j];
                u++;
            }
        }
        for(int k=0;k<capacity;k++){
            data[k]=temparr[k];
        }

        return temp;
    }
}
