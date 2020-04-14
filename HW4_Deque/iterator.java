import java.util.ListIterator;

/**
 * Iterator For The Deque!
 * Implements the ListIterator Interface!
 */
public class iterator implements ListIterator {
    Node current=new Node();

    /**
     * For the get the head Node of the List
     * @param current given Node
     */
    public void setCurrent(Node current) {
        this.current = current;
    }
    int nextsize=0,previoussize=0;

    /**
     * Adds a element
     * @param o given Object
     */
    @Override
    public void add(Object o) {
        Node temp=(Node)o;
        Node no=current;
        while(no.next!=null){
            no=no.next;
        }
        temp.setTail(no);
        no.setNext(temp);
        if(temp!=null){
            System.out.println("add method worked successfully!");
        }
    }

    /**
     * Replaces the given object with the Last element of the List
     * @param o given object
     */
    @Override
    public void set(Object o) {
        current.setNext((Node)o);
        if(current!=null){
            System.out.println("set method worked successfully!");
        }
    }

    /**
     * Checks the current Node has a next Node or not!
     * @return a bool value
     */
    @Override
    public boolean hasNext() {
        return current.next!=null;
    }

    /**
     * Gets the next Node of the Current
     * @return next Node!
     */
    @Override
    public Object next() {
        nextsize++;
        current=current.next;
        if(current!=null){
            System.out.println("next worked successfully!");
        }
        return current;
    }
    /**
     * Checks the current Node has a previous Node or not!
     * @return a bool value
     */
    @Override
    public boolean hasPrevious() {
        return current.tail!=null;
    }
    /**
     * Gets the previous Node of the Current
     * @return previous Node!
     */
    @Override
    public Object previous() {
        previoussize++;
        current=current.tail;
        if(current!=null){
            System.out.println("previous worked successfully!");
        }
        return current;
    }

    @Override
    public int nextIndex() {
        return nextsize;
    }

    @Override
    public int previousIndex() {
        return previoussize;
    }

    @Override
    public void remove() {
    }
}
