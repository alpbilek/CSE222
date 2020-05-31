public class main {
    static public void main(String abs[]){

        LibrarySystem LibrarySystem =new LibrarySystem();
        LibrarySystem.admin.setPassword("alpbilek23");
        LibrarySystem.admin.setUsername("alpbilek");
        LibrarySystem.admin.login("alpbilek","alpbilek23");

        LibrarySystem.admin.add("Alp Emir Bilek","c++/c",3,5);

        LibrarySystem.admin.add("Alp Emir Bilek","Java",34,5);

        LibrarySystem.admin.add("Alp Emir Bilek","Algorithms and Design",24,8);

        LibrarySystem.admin.add("Umur Bilek","Physics",9,17);

        LibrarySystem.admin.add("Umur Bilek","Biology",7,5);

        LibrarySystem.admin.add("Mustafa Bilek","Automative",4,6);

        LibrarySystem.searchByAuthorName("Alp Emir Bilek");

        LibrarySystem.searchByBookTitle("Java");
        LibrarySystem.admin.remove("Algorithms and Design");
        LibrarySystem.admin.update("Java","c9s9");
        LibrarySystem.searchByAuthorName("Alp Emir Bilek");


    }
}
