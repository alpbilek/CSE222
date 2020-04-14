import java.util.Collection;
import java.util.Iterator;
import java.util.Deque;
/*
    Printer CHECK
    Clear CHECK
    isEmpty CHECK
    size CHECK
    remove CHECK
    add CHECK
    get CHECK
    element CHECK
    pop CHECK
    push CHECK
    peek CHECK
    poll  CHECK
    offer CHECK
 */

/**
 * Deque data structure which implements Ceque Interface!
 * @param <E> Generic data structure
 */

public class Dequer<E> implements Deque {
    /**
     * Head is the main list!
     * Removed is list of the elements which are deleted from the Head List!
     */
    Node<E> head=new Node<>();
    Node<E> removed=new Node<>();
    private int size=0;
    public iterator Literator(){
        iterator a=new iterator();
        a.setCurrent(head);
        if(a!=null){
            System.out.println("Iterator initialized successfully!");
        }
        return a;
    }

    /**
     * Printer for the HEAD and Removed Lists
     */
    void printerHEAD(){
        System.out.println("HEAD LIST!!");
        Node no=head;
        while(no!=null){
            System.out.println(no.getData());
            no=no.next;
        }
    }
    void printerREMOVED(){
        System.out.println("REMOVED LIST!!");
        Node no=removed;
        while(no!=null){
            if(no.getData()==null){
                no=no.next;
            }
            else {
                System.out.println(no.getData());
                no = no.next;
            }
        }
    }

    /**
     * Clears the Head List
     */
    @Override
    public void clear() {
        head=null;
        size=0;
    }
    @Override
    public boolean retainAll(Collection c) {
        return false;
    }
    @Override
    public boolean removeAll(Collection c) {
        return false;
    }
    @Override
    public boolean containsAll(Collection c) {
        return false;
    }
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    /**
     * Checks the Head List is Empty or not!
     * @return a bool value
     */
    @Override
    public boolean isEmpty() {
        return size!=0;
    }

    @Override
    public Iterator descendingIterator() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    /**
     * Size of the list
     * @return size!
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks the given Object contains the Head list
     * @param o given Object
     * @return a bool value
     */
    @Override
    public boolean contains(Object o) {
        Node temp=(Node) o;
        Node no=head;
        boolean returner=false;
        while(no.next!=null){
            if(no==o){
                returner=true;
                break;
            }
            no=no.next;
        }
        return returner;
    }

    @Override
    public boolean remove(Object o){

        return false;
    }

    /**
     * Pop method,deletes teh first element of the List
     * @return deleted object
     */
    @Override
    public Object pop() {
        Node temp=new Node<>();
        temp.setData(head.getData());
        head=head.next;
        if(removed==null){
            removed=temp;
            removed.setNext(null);
        }
        else{
            Node no=removed;
            while(no.next!=null){
                no=no.next;
            }
            temp.setTail(no);
            no.setNext(temp);
        }
        size--;
        if(temp!=null){
            System.out.println("pop worked successfully!");
        }
        return temp;
    }

    /**
     * Push method,add to the list
     * @param o given object
     */
    @Override
    public void push(Object o) {
        Node temp=(Node) o;
        if(head==null){
            head=temp;
        }
        else{
            Node no=head;
            while(no.next!=null){
                no=no.next;
            }
            temp.setTail(no);
            no.setNext(temp);

        }
        if(temp!=null){
            System.out.println("push worked successfully!");
        }
        size++;
    }
    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    /**
     * Takes the first element of the Lİst
     * @return the first Element
     */
    @Override
    public Object peek() {
        if(head!=null){
            System.out .println("peek worked successfully!");
        }
        return head;
    }
    /**
     * Takes the first element of the Lİst
     * @return the first Element
     */
    @Override
    public Object peekFirst() {
        if(head!=null){
            System.out .println("peekFirst worked successfully!");
        }
        return head;
    }
    /**
     * Takes the last element of the Lİst
     * @return the last Element
     */
    @Override
    public Object peekLast() {
        Node temp=head;
        for(int i=0;i<size-1;i++){
            temp=temp.next;
        }

        if(temp!=null){
            System.out.println("peekLast worked successfully!");
        }
        return temp;
    }

    /**
     * Removes the first element of the List
     * @return deleted element
     */
    @Override
    public Object poll() {
        Node temp=new Node<>();
        temp.setData(head.getData());
        head=head.next;
        if(removed==null){
            removed=temp;
            removed.setNext(null);
        }
        else{
            Node no=removed;
            while(no.next!=null){
                no=no.next;
            }
            temp.setTail(no);
            no.setNext(temp);
        }

        if(temp!=null){
            System.out.println("poll worked successfully!");
        }
        size--;
        return temp;
    }
    /**
     * Removes the first element of the List
     * @return deleted element
     */
    @Override
    public Object pollFirst() {
        Node temp=new Node<>();
        temp.setData(head.getData());
        head=head.next;
        if(removed==null){
            removed=temp;
            removed.setNext(null);
        }
        else{
            Node no=removed;
            while(no.next!=null){
                no=no.next;
            }
            temp.setTail(no);
            no.setNext(temp);
        }
        size--;

        if(temp!=null){
            System.out.println("pollFirst worked successfully!");
        }
        return temp;
    }
    /**
     * Removes the last element of the List
     * @return deleted element
     */
    @Override
    public Object pollLast() {
        Node temp=new Node<>();
        Node no=head;
        for(int i=0;i<size-2;i++){
            no=no.next;
        }
        temp.setData(no.next.getData());
        no.setNext(null);
        if(removed==null){
            removed=temp;
            removed.setNext(null);
        }
        else {
            Node no1=removed;
            while(no1.next!=null){
                no1=no1.next;
            }
            temp.setTail(no1);
            no1.setNext(temp);
        }
        size--;

        if(temp!=null){
            System.out.println("pollLast worked successfully!");
        }
        return temp;
    }
    /**
     * Removes the first element of the List
     * @return deleted element
     */
    @Override
    public Object remove() {
        Node temp=new Node<>();
        temp.setData(head.getData());
        head=head.next;
        if(removed==null){
            removed=temp;
            removed.setNext(null);
        }
        else{
            Node no=removed;
            while(no.next!=null){
                no=no.next;
            }
            temp.setTail(no);
            no.setNext(temp);
        }
        size--;

        if(temp!=null){
            System.out.println("remove worked successfully!");
        }
        return temp;
    }
    /**
     * Removes the first element of the List
     * @return deleted element
     */
    @Override
    public Object removeFirst() {
        Node temp=new Node<>();
        temp.setData(head.getData());
        head=head.next;
        if(removed==null){
            removed=temp;
            removed.setNext(null);
        }
        else{
            Node no=removed;
            while(no.next!=null){
                no=no.next;
            }
            temp.setTail(no);
            no.setNext(temp);
        }
        size--;

        if(temp!=null){
            System.out.println("removeFirst worked successfully!");
        }
        return temp;
    }
    /**
     * Removes the last element of the List
     * @return deleted element
     */
    @Override
    public Object removeLast() {
        Node temp=new Node<>();
        Node no=head;
        for(int i=0;i<size-2;i++){
            no=no.next;
        }
        temp.setData(no.next.getData());
        no.setNext(null);
        if(removed==null){
            removed=temp;
            removed.setNext(null);
        }
        else {
            Node no1=removed;
            while(no1.next!=null){
                no1=no1.next;
            }
            temp.setTail(no1);
            no1.setNext(temp);
        }
        size--;
        if(temp!=null){
            System.out.println("removeLast worked successfully!");
        }
        return temp;
    }

    /**
     * Adds a object to the List
     * @param o given object
     * @return object added or not!
     */
    @Override
    public boolean offer(Object o) {
        boolean returner=true;
        Node temp=(Node) o;
        Node no=head;
        while(no.next!=null){
            no=no.next;
        }
        temp.setTail(no);
        no.setNext(temp);
        if(no.next==null){
            returner=false;
        }
        size++;
        return returner;
    }
    /**
     * Adds a object to the List as a first element
     * @param o given object
     * @return object added or not!
     */
    @Override
    public boolean offerFirst(Object o) {
        boolean returner=true;
        Node temp=(Node) o;
        Node no=temp;
        no.setNext(head);
        head=no;
        size++;
        if(head==null){
            returner=false;
        }
        return returner;
    }
    /**
     * Adds a object to the List as a last element
     * @param o given object
     * @return object added or not!
     */
    @Override
    public boolean offerLast(Object o) {
        Node temp=(Node) o;
        boolean returner=true;
        temp.setNext(null);
        Node no=head;
        while(no.next!=null){
            no=no.next;
        }
        temp.setTail(no);
        no.setNext(temp);
        size++;
        if(no.next==null){
            returner =false;
        }
        return returner;
    }
    /**
     * Adds a object to the List
     * @param o given object
     * @return object added or not!
     */
    @Override
    public boolean add(Object o) {
        boolean returner=true;
        Node temp=(Node) o;
        Node no=head;
        while(no.next!=null){
            no=no.next;
        }
        temp.setTail(no);
        no.setNext(temp);
        if(no.next==null){
            returner=false;
        }
        size++;
        return returner;
    }

    /**
     * Adds a object to the List as a First element
     * @param o given object
     */
    @Override
    public void addFirst(Object o) {
        Node temp=(Node) o;
        head=temp;
        head.setNext(null);
        head.setTail(null);
        size++;
        if(head!=null){
            System.out.println("addFirst method worked successfully!!");
        }
    }

    /**
     * Adds a object to the List as a Last element
     * @param o given object
     */
    @Override
    public void addLast(Object o) {
        Node temp=(Node) o;
        temp.setNext(null);
        Node no=head;
        while(no.next!=null){
            no=no.next;
        }
        temp.setTail(no);
        no.setNext(temp);
        size++;
        if(temp!=null){
            System.out.println("addLast method worked successfully!");
        }
    }

    /**
     * For the take the List's head
     * @return head
     */
    @Override
    public Object getFirst() {
        if(head!=null){
            System.out.println("getFirst worked successfully!");
        }
        return head;
    }

    /**
     * For the take Last element of the List
     * @return last element
     */
    @Override
    public Object getLast() {
        Node no=head;
        while(no.next!=null){
            no=no.next;
        }
        if(no!=null){
            System.out.println("getLast worked successfully!");
        }
        return no;
    }


    @Override
    public boolean removeFirstOccurrence(Object o) { return false; }
    @Override
    public boolean removeLastOccurrence(Object o) { return false; }
    /**
     * For the take the List's head
     * @return head
     */
    @Override
    public Object element() {
        if(head!=null){
            System.out.println("element worked successfully!");
        }
        return head;
    }
}
