import java.util.AbstractList;
import java.util.List;

public class LinkedArrayList<E> extends AbstractList implements List {
    /**
     * Node for the LinkedList
     */
    Node<E> head;
    private int size=0;

    /**
     * Ovirriden method,getter for the linkedlist
     * @param index rgiven index on the linkledlist
     * @return a Node
     */
    @Override
    public Node get(int index) {
        int flag=0;
        Node<E> no=head;
        while(flag<index){
            flag++;
            no=no.getNext();
        }
        return no;
    }

    /**
     * Overriden method,getter for the size
     * @return the size
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks the List empty or not
     * @return a boolean value
     */
    @Override
    public boolean isEmpty() {
        if(head==null){return true;}
        else{return false;}
    }

    /**
     * Checks the given Node contains the list or not
     * @param o given Node
     * @return a boolean value
     */
    @Override
    public boolean contains(Object o) {
        Node<E> no=head;

        while(no!=null){
            if(no==o){
                return true;
            }
            no=no.getNext();
        }
        return false;
    }
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    /**
     * Adder for the LinkedList
     * @param data given data for the new Node
     * @param cap given capacity for the new Node
     * @return a boolean value for the tester
     */
    public boolean add(E data[],int cap) {
        Node newNode=new Node();
        Node newtemp=new Node();
        Node temp=new Node();
        boolean returner=true;
        if(cap>newNode.getCapacity()){
            newNode.adder(data,newNode.getCapacity());
            int temp1=cap-newNode.getCapacity();
            int j=newNode.getCapacity();
            Object datatemp[]=new Object[5];
            for(int i=0;i<cap-newNode.getCapacity();i++){
                datatemp[i]=data[j];
                j++;
            }
            newtemp.adder(datatemp,newNode.getCapacity());
            newNode.setNext(newtemp);
            newtemp.setNext(null);
            size++;
        }
        else{
            newNode.adder(data,cap);
            newNode.setNext(null);
        }
        if(head==null){
            head=newNode;
            head.setPrev(null);
        }
        else{
            Node n=head;
            while(n.getNext()!=null){
                n=n.getNext();
            }
            temp=n;
            n.setNext(newNode);
            n.getNext().setPrev(temp);
            if(n.getNext()!=null){
                returner=true;
            }
            else{
                returner=false;
            }
        }
        size++;
        return returner;
    }

    /**
     * Removes a Node from the LinkedList
     * @param index given index
     * @return a boolean value for the tester
     */
    @Override
    public Node<E> remove(int index) {
        int flag=0;
        Node<E> temp;
        Node<E> temp2;
        Node<E> n=head;
        while(flag<index){
            n=n.getNext();
            flag++;
        }
        temp2=n.getNext();
        temp=n.getNext().getNext();
        n.setNext(temp);
        size--;
        return temp2;
    }

    /**
     * Prints the List
     */
    public void printer(){
        Node no=head;
        while(no!=null){
            for(int i=0;i<no.getCapacity();i++){
                if(no.data[i]==null){
                    System.out.println(0);
                }
                else{
                System.out.println(no.data[i]);
                }
            }
            System.out.println("------------\n");
            no=no.getNext();
        }
    }

    /**
     * Adds a new Node to the begining of the LinkedList
     * @param data given data for the new Node
     * @param cap given capacity for the new Node
     * @return a boolean value for the tester
     */
    public Node addstart(E[] data, int cap){
        Node newNode=new Node();
        Node newtemp=new Node();
        if(cap>newNode.getCapacity()){
            newNode.adder(data,newNode.getCapacity());
            int temo=cap-newNode.getCapacity();
            int j=newNode.getCapacity();
            Object datatemp[]=new Object[5];
            for(int i=0;i<temo;i++){
                datatemp[i]=data[j];
                j++;
            }
            newtemp.adder(datatemp,newNode.getCapacity());
            newNode.setNext(newtemp);
            newtemp.setNext(null);
            Node n=head;
            newtemp.setNext(n);
            head=newNode;
            size++;
        }
        else{
            newNode.adder(data,cap);
            newNode.setNext(null);
            Node n=head;
            newNode.setNext(n);
            head=newNode;
        }
        size++;
        return newNode;
    }

    /**
     * Adds  a new Node after a given index
     * @param index given index for the addition proccess to the LinkedList
     * @param data given data
     * @param cap given capacity
     * @return a boolean value for the tester
     */
    public Node addAfter(int index,E[] data,int cap){
        Node newNode=new Node();
        Node newtemp=new Node();
        int flag=0;
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
            size++;
        }
        else{
            newNode.adder(data,cap);
            newNode.setNext(null);
        }
        Node n=head;
        while(flag<index){
            n=n.getNext();
            flag++;
        }
        Node temp=n.getNext();
        n.setNext(newNode);
        newNode.setNext(temp);
        size++;
        return newNode;
    }

    /**
     * Getter for the head of the LinkedList
     * @return the head of the LinkedList,it's about to use by Listİterator
     */
    public Node gethead(){return head;}

    /**
     * Removes an element from the given Node's index
     * @param ind Node's data index
     * @param indexfornode remove from which Node
     * @return an integer value for the tester!
     */
    public Object RemoveAnElementArray(int ind, int indexfornode) {
        int flag=0;
        Node n=head;
        while(flag<ind){
            n=n.getNext();
            flag++;
        }
       return n.remover(indexfornode);
    }
}
