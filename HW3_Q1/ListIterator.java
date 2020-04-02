public class ListIterator<E> {
    /**
     * Implementing a generic ListIterator!
     */
    private Node<E> current;

    /**
     * Setter for the current Node!
     * @param List Takes the head of the given List!
     * @return For the Test cases it returns initialized or not!
     */
    public boolean setCurrent(LinkedArrayList List) {
        this.current = List.gethead();
        return current!=null;
    }

    /**
     * Getter for the current Node!
     * @return return the current Node!
     */
    public Node getCurrent(){return current;}

    /**
     * Getter for the next Node
     * @return returns the next Node!
     */
    public Node getnext(){
        current=current.getNext();
        return current;
    }

    /**
     *Checks the next node is null or not!
     * @return returns a boolean value!
     */
    public boolean  hasnext(){
        if(current.getNext()==null){
            return false;
        }
        else{
            return  true;
        }
    }

    /**
     * Sets a new node to given index
     * @param data new node's data
     * @param cap new node's capacity
     * @return returns the new node created or not!
     */
    public boolean set(E data[],int cap){
        Node newNode=new Node();
        Node newtemp=new Node();
        if(cap>newNode.getCapacity()){
            newNode.adder(data,newNode.getCapacity());
            int temp=cap-newNode.getCapacity();
            int j=newNode.getCapacity();
            Object datatemp[]=new Object[5];
            for(int i=0;i<cap-newNode.getCapacity();i++){
                datatemp[i]=data[j];
                j++;
            }
            newtemp.adder(datatemp,newNode.getCapacity());
            newNode.setNext(newtemp);
            newtemp.setNext(null);
        }
        else{
            newNode.adder(data,cap);
            newNode.setNext(null);
        }
        Node n=current;
        while(n.getNext()!=null){
            n=n.getNext();
        }
        n.setNext(newNode);
        return  newNode!=null;
    }

    /**
     * adds a new node to given index
     * @param data new node's data
     * @param cap new node's capacity
     * @return returns the new node created or not!
     */
    public boolean add(E data[],int cap){
        Node newNode=new Node();
        Node newtemp=new Node();
        if(cap>newNode.getCapacity()){
            newNode.adder(data,newNode.getCapacity());
            int temp=cap-newNode.getCapacity();
            int j=newNode.getCapacity();
            Object datatemp[]=new Object[5];
            for(int i=0;i<cap-newNode.getCapacity();i++){
                datatemp[i]=data[j];
                j++;
            }
            newtemp.adder(datatemp,newNode.getCapacity());
            newNode.setNext(newtemp);
            newtemp.setNext(null);

        }
        else{
            newNode.adder(data,cap);
            newNode.setNext(null);
        }
        if(current==null){
            current=newNode;
        }
        else{
            Node n=current;
            while(n.getNext()!=null){
                n=n.getNext();
            }
            n.setNext(newNode);
        }

        return newNode!=null;
    }
}