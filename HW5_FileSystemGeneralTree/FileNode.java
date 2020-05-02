import java.util.Vector;

/**
 * Node Class for the FileTreeSystem
 */
public class FileNode {
    /**
     * Fields
     */
    String type;
    String str;
    Vector<FileNode> childs=new Vector<>();

    /**
     * Checks the Node is a Leaf or not!
     * @return a booelan value!
     */
    boolean isLeaf(){
        return childs.isEmpty();
    }
}
