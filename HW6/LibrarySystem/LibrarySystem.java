import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Alp Emir BİLEK
 *           161044049
 */
public class LibrarySystem {
    private Map<String, HashMap<String,String>> book =new HashMap<>();
    public Admin admin;
    LibrarySystem(){
      admin=new Admin(book);
    }

    /**
     * Search Method by AuthorName
     * @param AuthorName Author's Name
     */
    public void searchByAuthorName(String AuthorName){
        int i=0;
        for(Map.Entry<String,String > books:book.get(AuthorName).entrySet()){
            System.out.println(++i+")"+ books.getKey());
        }
        System.out.println("Please make a selection:");
        Scanner sc= new Scanner(System.in);
        String choice=sc.next();
        if(book.get(AuthorName).get(choice)==null){
            System.out.println("Book cannot found");
        }
        else{
            System.out.println("Location of the Boook->"+book.get(AuthorName).get(choice));

        }

    }

    /**
     * Search Method by Book Title
     * @param BookName Book's Title
     */
    public void searchByBookTitle(String BookName){
        for(Map.Entry<String,HashMap<String,String>> entry:book.entrySet()){
            HashMap<String ,String> temp= entry.getValue();
            for(Map.Entry<String ,String> tempEntry:temp.entrySet()){
                if(BookName.equals(tempEntry.getKey())){
                    if(tempEntry.getValue()==null){
                        System.out.println("Book cannot found");
                    }
                    else {
                        System.out.println("Author Name-" + entry.getKey() + " Location-" + tempEntry.getValue());
                    }
                }
            }
        }
    }
}
