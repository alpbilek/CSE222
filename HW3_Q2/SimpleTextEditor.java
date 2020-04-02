import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class SimpleTextEditor{
    private List<Character> list=new ArrayList<>();
    private String pathname;

    /**
     * Setter for the pathname which file is going to be read.
     * @param pathname file path
     */
    public void setPathname(String pathname) {
        this.pathname = pathname;
    }

    /**
     * Reader with loop
     * @throws Exception for the BufferedReader type.
     */
    public void readLOOP() throws Exception{
        File file = new File(pathname);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        st=br.readLine();
        char c;
        for(int i=0;i<st.length();i++){
            c=st.charAt(i);
            list.add(c);
        }
    }

    /**
     * Reader with ListIterator
     * @throws Exception for the BufferedReader type.
     */
    public void readITERATOR() throws Exception{
        File file=new File(pathname);
        BufferedReader br=new BufferedReader(new FileReader(file));
        String st;
        st=br.readLine();
        ListIterator iterator = list.listIterator();
        char c;
        int flag=0;
        while(flag<st.length()){
            c=st.charAt(flag);
            iterator.add(c);
            flag++;
        }
    }

    /**
     * List printer
     */
    public void printer(){
        System.out.println(list);
    }

    /**
     * Adds a String to list with LOOP
     * @param str which string is about to push to list
     * @param index where string is about to push to list
     */
    public void adderLOOP(String str,int index){
        char tempC;
        for(int i=0;i<str.length();i++){
            tempC=str.charAt(i);
            list.add(index+i,tempC);
        }
    }

    /**
     * Adds a String to list with ListIterator
     * @param str which string is about to push to list
     * @param index where string is about to push to list
     */
    public void adderITERATOR(String str,int index){
        ListIterator iterator = list.listIterator();
        int flag=0;
        while(flag<index){
            flag++;
            iterator.next();
        }
        char tempC;
        for(int i=0;i<str.length();i++){
            tempC=str.charAt(i);
            iterator.add(tempC);
        }

    }

    /**
     * An helper method that takes some character from the list and pushes to a new String
     * @param index is observes the characters are going to start from which index.
     * @param size is a number of the how many characters are going to push to a new String
     * @return A String which is pushed by list elements.
     */
    public String chartoString(int index,int size){
        StringBuilder sb=new StringBuilder();
        for(int i=index;i<size+index;i++){
            sb.append(list.get(i));
        }
        String str=sb.toString();
        return str;
    }

    /**
     * Tries to find given String in list,does that with LOOP
     * @param str given String
     * @return index that head of the given String
     */
    public int finderLOOP(String str){
        int i_holder=0;
        String temp;
        for(int i=0;i<list.size();i++){
            temp=chartoString(i,str.length());
            if(temp.equals(str)){
                i_holder=i;
                break;
            }
        }
        return i_holder;
    }

    /**
     * Tries to find given String in list,does that with ListIterator
     * @param str given String
     * @return index that head of the given String
     */
    public int finderITERATOR(String  str){
        int flag=0;
        int i_holder=0;
        String temp;
        ListIterator iterator=list.listIterator();
        while(flag<list.size()){
            iterator.next();
            temp=chartoString(flag,str.length());
            if(temp.equals(str)){
                i_holder=flag;
                break;
            }
            flag++;
        }
        return  i_holder;
    }

    /**
     * Replaces an index with the given Character,does that with LOOP
     * @param index given index
     * @param c given Character
     */
    public void replacerLOOP(int index,char c){
        char temp=list.get(index);
        for(int i=0;i<list.size();i++){
            if(temp==list.get(i)){
                list.set(i,c);
            }
        }
    }

    /**
     * Replaces all the Characters with the given Character does it with ListIterator
     * @param index given index
     * @param c given Character
     */
    public void replacerITERATOR(int index,char c){
        Character temp=list.get(index);
        ListIterator iterator=list.listIterator();
        while(iterator.hasNext()){
            if(iterator.next()==temp){
                iterator.set(c);
            }
        }
    }
}

