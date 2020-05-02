public class AgeSearchTree<E>extends BinarySearchTree {
    /**
     * Fields
     * Holds a root of the Tree
     */
    private AgeData root;
    private int elementnumbert = 0;

    /**
     * Getter for the root of the Tree
     * @return root
     */
    public AgeData getRoot() {
        return root;
    }

    /**
     * ElementNumber used for the count the number of the values on youngerThan an olderThan methods.
     * Getter for ElementNumber
     * @return ElementNumber
     */
    public int getElementnumbert() {
        return elementnumbert;
    }

    /**
     * Adds a AgeData Node to the tree
     * @param item given AgeData Node
     * @return a boolean value for the given data added or not!
     */
    @Override
    public boolean add(Comparable item) {
        AgeData temp=(AgeData) item;
        root=addRec(root,temp.data);
        return  root!=null;
    }

    /**
     * Helper for the add Method
     * @param head takes a AgeData Object for the iteration of the tree
     * @param data inserts a data to the given tree
     * @return the whole tree
     */
    private AgeData addRec(AgeData head, int data) {
        if (head == null) {
            head = new AgeData(data);
            return head;
        }
        if (data < head.data) {
            head.left = addRec(head.left, data);
        } else if (data > head.data) {
            head.right = addRec(head.right, data);
        }
        else if(data==head.data){
            head.counter++;
            return head;
        }
        return head;
    }

    /**
     * Prints the tree in intended form
     * @return a String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        traverser(root, 1, sb);
        return sb.toString();
    }

    /**
     * Traverses the whole tree and appends it to a StringBuilder
     * @param head given AgeData OBject for the iteration of the tree
     * @param dept for the appending operatoin
     * @param sb a StringBuilder for the printTree
     */
    private void traverser(AgeData head, int dept, StringBuilder sb) {
        if (head == null) {
            sb.append("null\n");
        } else {
            sb.append(head.data+" - "+head.counter);
            sb.append("\n");
            traverser(head.left, dept + 1, sb);
            traverser(head.right, dept + 1, sb);
        }
    }

    /**
     * Counts the smaller values than given data
     * @param key given data
     * @return number of the smaller values
     */
    public int youngerThan(int key){
        elementnumbert=0;
        young(root,key);
        return elementnumbert;
    }

    /**
     * Helper for the youngerThan method
     * @param head given Agedata Object for the iteration of the tree
     * @param key givend ata
     */
    private void young(AgeData head,int key){
        if (head == null) {
            return;
        }
        else {
            if(head.data<key){
                elementnumbert+=head.counter;
            }
            young(head.left,key);
            young(head.right,key);
        }
    }

    /**
     * Helper for the olderThan method
     * @param head given AgeData Object for the iteration of the tree
     * @param key given data
     */
    private void old(AgeData head,int key){
        if (head == null) {
            return;
        }
        else {
            if(head.data>key){
                elementnumbert+=head.counter;
            }
            old(head.left,key);
            old(head.right,key);
        }
    }

    /**
     * Counts the greater values than given data
     * @param key given data
     * @return number of the greater values
     */
    public int olderThan(int key){
        elementnumbert=0;
        old(root,key);
        return elementnumbert;
    }

    /**
     * Finds the given AgeData in tree
     * @param item given AgeData object
     * @return the AgeData from tree
     */
    @Override
    public Comparable find(Comparable item) {
        AgeData temp1=(AgeData)item;
        AgeData temp=find(root,temp1.data);
        if(temp==null){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found");
        }
        return temp;
    }

    /**
     * Helper for the Find method
     * @param head given AgeData Object for the iteration of the tree
     * @param key given key
     * @return founded AgeData Object
     */
    private AgeData find(AgeData head,int key){
        if(head==null){
            return null;
        }
        int comparer=key-head.data;
        if(comparer==0){
            return head;
        }
        else if(comparer<0){
            return  find(head.left,key);
        }
        else{
            return find(head.right,key);
        }
    }

    /**
     * Deletes a Node from tree
     * @param item given AgeData Object for deletion process
     * @return the deleted AgeData Object
     */
    @Override
    public Comparable delete(Comparable item) {
        AgeData temp=(AgeData) item;
        root=removeRec(root,temp.data);
        return root;
    }

    /**
     * Helper method for the delete Method
     * @param head given AgeData Object for the iteration of the tree
     * @param key given data
     * @return deleted AgeData Object
     */
    private AgeData removeRec(AgeData head,int key){
        if(head==null){
            return null;
        }
        if(head.data>key){
            head.left=removeRec(head.left,key);
        }
        else if(head.data<key){
            head.right=removeRec(head.right,key);
        }
        else{
            if(head.left!=null && head.right!=null){
                AgeData temp=head;
                AgeData temp2=minelement(temp.right);
                head.data=temp2.data;
                head.right=removeRec(head.right,temp2.data);
            }
            else if(head.left!=null){
                head=head.left;
            }
            else if(head.right!=null){
                head=head.right;
            }
            else{
                head=null;
            }
        }
        return head;
    }

    /**
     * Finds the minimum value of the tree
     * @param head given AgeData Object
     * @return a Minimum valued AgeData Object.
     */
    private AgeData minelement(AgeData head){
        if(head.left==null){
            return head;
        }
        else{
            return minelement(head.left);
        }
    }
}
