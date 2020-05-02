import java.util.Arrays;

/**
 * General Tree for the FileSystem!
 */
public class FileSystemTree {
    FileNode root;

    /**
     * Constructor
     * @param head a string for the root of the Tree
     */
    FileSystemTree(String head){
        FileNode fn=new FileNode();
        fn.str=head;
        this.root=fn;
    }

    /**
     * An helper methods for almost all methods
     * @param arr takes a String array for the finding the correct Node
     * @param head given Node for the itertate the tree
     * @return the founded Node
     */
    private FileNode findHelper(String[] arr,FileNode head){
        if(arr.length<2){
            return head;
        }
        else  {
            for(int i=0;i<head.childs.size();i++){
                if(arr[1].equals(head.childs.get(i).str)){
                    return findHelper((Arrays.copyOfRange(arr,1,arr.length)),head.childs.get(i));
                }
            }
        }
        return null;

    }

    /**
     * Adds a new Directory to the tree
     * @param s a String and spilits it to a String array
     * Calls the findHelper method with the root of the tree
     * Adds it to the founded Nodes Chils Method
     */
    public void addDir(String s){
        String[] Temparray = s.split("/");
        String[] array = new String[Temparray.length - 1];
        String str = Temparray[Temparray.length - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Temparray[i];
        }

        FileNode temp=findHelper(array,root);
        if(temp==null){
            System.out.println("Directory has not found in tree");
        }
        else if(temp.type=="file"){
            System.out.println("This directory has a file at the and of the tree.So you cant add a new file to this directory");
        }
        else{
            FileNode added=new FileNode();
            added.str=str;
            added.type="dir";
            temp.childs.add(added);
        }
    }

    /**
     * Prints the whole FileSystem
     * Traverses it INORDER!!
     */
    public void printFileSystem(){
        indorder(root);
    }

    /**
     * Helper for the printFileSystem method
     * @param head given Node for the iterate the tree
     */
    private void indorder(FileNode head){
        System.out.println(head.str);
        if(head==null){
            return;
        }
        for(int i=0;i<head.childs.size();i++){
            indorder(head.childs.get(i));
        }

    }
    /**
     * Adds a new File to the tree
     * @param s a String and spilits it to a String array
     * Calls the findHelper method with the root of the tree
     * Adds it to the founded Nodes Chils Method
     */

    public void addFile(String s){
        String[] Temparray = s.split("/");
        String[] array = new String[Temparray.length - 1];
        String str = Temparray[Temparray.length - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Temparray[i];
        }
        FileNode temp=findHelper(array,root);
        if(temp==null){
            System.out.println("Directory has not found in tree");
        }
        else if(temp.isLeaf()){
            FileNode added=new FileNode();
            added.str=str;
            added.type="file";
            temp.childs.add(added);
        }
        else{
            System.out.println("node has at least one sub dir!");
        }
    }

    /**
     * Searches the tree according to given String and prints the founded Nodes
     * @param head given Node for the iterate the tree
     * @param key given String
     */
    private void searchHelper(FileNode head,String key){
        if(head==null){
            return;
        }
        if(head.str.contains(key)){
            System.out.println("-"+head.type+" "+head.str);
        }
        for(int i=0;i<head.childs.size();i++){
            searchHelper(head.childs.get(i),key);
        }
    }

    /**
     * Calls the searchHelper!
     * @param s given String
     */
    public void search(String s){
        searchHelper(root,s);
    }

    /**
     * Removes a child from the Tree
     * @param s given String
     */
    public void remove(String s){
        String[] Temparray = s.split("/");
        String[] array = new String[Temparray.length - 1];
        String str = Temparray[Temparray.length - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Temparray[i];
        }
        FileNode temp=findHelper(array,root);
        if(temp==null){
            System.out.println("Directory ha not found in tree");
        }
        else{
            for(int i=0;i<temp.childs.size();i++){
                if(temp.childs.get(i).str.equals(str)){
                    temp.childs.remove(i);
                }
            }
        }
    }
}
