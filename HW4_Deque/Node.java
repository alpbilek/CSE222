public class Node<E> {
    private Object data;
    Node<E> next,tail;

    /**
     * Setter for the Next
     * @param next given object!
     */
    public void setNext(Node<E> next){
        this.next=next;
    }

    /**
     * Setter for the Tail
     * @param tail given object
     */
    public void setTail(Node<E> tail){
        this.tail=tail;
    }

    /**
     * Getter for the next
     * @return next of the Node
     */
    Node getNext(){return next;}

    /**
     * Getter for the tail
     * @return  tail of the Node
     */
    Node getTail(){return tail;}

    /**
     * Setter for the Node's data
     * @param data given data
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Getter for the data of the Node
     * @return the data
     */
    public Object getData() {
        return data;
    }
}
