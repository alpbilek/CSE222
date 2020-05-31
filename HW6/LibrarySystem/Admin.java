import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Admin
{
    private boolean Login=false;
    private final Map<String, HashMap<String,String>> book ;

    /**
     * Takes a map for the manipulation of the HashMap of the LibrarySystem.
     * @param map Book HashMap
     */
    public Admin(Map<String, HashMap<String,String>> map){
        book=map;
    }

    /**
     * Adds a book to the System
     * @param AuthorName Author's Name
     * @param BookName    Book's Name
     * @param shelf    Location
     * @param corridor Location
     */
    public void add(String AuthorName,String BookName,int shelf,int corridor){
        if(Login==true){
            if(book.get(AuthorName)==null){
                HashMap<String,String> location=new HashMap<>();
                String loc="c"+corridor+"s"+shelf;
                location.put(BookName,loc);
                book.put(AuthorName,location);
            }
            else{
                String loc="c"+corridor+"s"+shelf;
                book.get(AuthorName).put(BookName,loc);
            }
        }
        else{
            System.out.println("Please LOGIN!");
        }
    }
    public void remove(String BookName){
        for(Map.Entry<String,HashMap<String,String>> entry:book.entrySet()) {
            if (entry.getKey() == null) {
                System.out.println("Book has not found");
            }
            else {
                entry.getValue().remove(BookName);
            }
        }
    }

    /**
     * Admin Logs in to the System
     * @param ID UserID
     * @param pass Password
     */
    public void login(String ID,String pass){
        if(ID.equals(username) &&pass.equals(password)){
            Login=true;
        }
    }

    /**
     * Fields
     */
    private String username,password;

    /**
     * Getter for password
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Getter for UserID
     * @return UserID
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter for password
     * @param password given password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Setter for UserID
     * @param username given UserID
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Updates the location of the title's given books
     * @param key BookName
     * @param val Updated Location
     */
    public void update(String key,String val){
        for(Map.Entry<String,HashMap<String,String>> entry:book.entrySet()){
            if(entry.getKey()==null){
                System.out.println("Book has not found");
            }
            else{
            entry.getValue().replace(key,val);
            }
        }
    }
}
