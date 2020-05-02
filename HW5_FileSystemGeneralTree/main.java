public class main {
    static public void main(String abs[]){
        FileSystemTree fst=new FileSystemTree("root");
        fst.addDir("root/alp");
        fst.addDir("root/a");
        fst.addDir("root/a/e");
        fst.addDir("root/a/e/t");
        fst.addDir("root/a/e/t/q");
        fst.addDir("root/alp/emir");
        fst.addDir("root/alp/emir/bilek");
        fst.addFile("root/alp/emir/bilek/alp.txt");
        fst.search("a");
        fst.printFileSystem();
        fst.remove("root/alp/emir/bilek/alp.txt");
        fst.printFileSystem();
    }
}
