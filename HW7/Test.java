public class Test {
    /**
     * TEST CLASS
     */
    SoftwareStore SBST=new SoftwareStore();

    /**
     * FOR THE ADMIN LOGIN
     * @param pass ADMIN'S PASSWORD
     */
    public void Login(String pass){
        /**
         * IF PASSWORD IS CORRECT WE CAN TEST THE SYSTEM
         */
        if(pass.equals(SBST.admin.getPassword())){
            SBST.admin.add(new Software("Adobe Photoshop 6.0",1,16));
            SBST.admin.add(new Software("Adobe Photoshop 6.2",1,15));
            SBST.admin.add(new Software("Norton 4.5,",1,10));
            SBST.admin.add(new Software("Norton 5.5",1,19));
            SBST.admin.add(new Software("Adobe Flash 3.3",1,9));
            SBST.admin.add(new Software("Adobe Flash 4.0",1,24));
            SBST.admin.add(new Software("Adobe Photoshop 6.0",1,16));
            SBST.admin.add(new Software("Adobe Photoshop 6.0",1,16));
            SBST.admin.add(new Software("Adobe Photoshop 6.0",1,16));
            SBST.admin.add(new Software("Adobe Photoshop 6.2,",1,15));
            SBST.admin.add(new Software("Adobe Photoshop 6.2,",1,15));
            SBST.admin.add(new Software("Norton 4.5,",1,10));
            SBST.admin.add(new Software("Adobe Flash 3.3",1,9));
            System.out.println("----ADDITION----");
            SBST.printer();
            System.out.println("----DELETION----");
            SBST.admin.remove(15);
            SBST.admin.remove(1);
            SBST.admin.remove(16);
            SBST.printer();
            System.out.println("----SEARCHES----");
            SBST.searchByName("Adobe Photoshop 6.2");
            SBST.searchByPrice(16);
            SBST.searchByPrice(2408);
            SBST.searchByQuantity(1);
            System.out.println("----UPDATE----");
            SBST.admin.update(9,"ALP EMIR BILEK",8);
            SBST.admin.update(2408,"AAAAAAA",24);
            SBST.printer();
        }
        /**
         * IF IT IS NOT,NO WAY TO TEST THE SYSTEM
         */
        else{
            System.out.println("Wrong password!");
        }
    }
}
