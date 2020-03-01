public class main {
    public static void test(){
        Admin x=new Admin(14);
        Customer c=new Customer();
        Shipment s=new Shipment();
        Branch B=new Branch();
        BranchEmployee BE=new BranchEmployee();
        TransportationPersonnel TP=new TransportationPersonnel();
        /**
         * Initilazing datas to the variables for the testing!!
         */

        c.setName("firstCustomer");
        s.strS="firstShipment";
        B.setName("firstBranch");
        BE.setName("firstBranchEmployee");
        TP.nameTP="firstTP";
        Customer c2=new Customer();
        Shipment s2=new Shipment();
        Branch B2=new Branch();
        BranchEmployee BE2=new BranchEmployee();
        TransportationPersonnel TP2=new TransportationPersonnel();
        c2.setName("secondCustomer");
        s2.strS="secondShipment";
        B2.setName("secondBranch");
        BE2.setName("secondBranchEmployee");
        TP2.nameTP="secondTP";


        /**
         * Testing adding and removing methods for the Branch!!
         */
        x.addB(B);
        x.addB(B2);

        for(int i=0;i<x.i;i++){
            System.out.println(x.getB(i).getName());
        }
        x.removeB(0);
        for(int i=0;i<x.i;i++){
            System.out.println(x.getB(i).getName());
        }

        /**
         * Testing adding and removing methods for the BranchEmployee
         */

        x.addBE(BE);
        x.addBE(BE2);
        for(int i=0;i<x.index;i++){
            System.out.println(x.getBE(i).getName());
        }
        x.removeBE(1);
        for(int i=0;i<x.i;i++){
            System.out.println(x.getBE(i).getName());
        }
        /**
         * Testing adding and removing methods for the TransportationPersonnel
         */
        x.addTP(TP);
        x.addTP(TP2);
        x.addTP(TP2);

        for(int i=0;i<x.t;i++){
            System.out.println(x.getTP(i).nameTP);
        }
        x.removeTP(1);
        for(int i=0;i<x.t;i++){
            System.out.println(x.getTP(i).nameTP);
        }


        /**
         * Testing adding and removing methods for the Customer!
         */
        x.getBE(0).addCustomer(c);
        x.getBE(0).addCustomer(c2);

        for(int i=0;i<x.getBE(0).p;i++){
            System.out.println(x.getBE(0).getC(i).getName());
        }
        x.getBE(0).removeCustomer(1);
        for(int i=0;i<x.getBE(0).p;i++){
            System.out.println(x.getBE(0).getC(i).getName());
        }

        /**
         * Testing adding and removing methods for the Shipment!!
         */
        x.getTP(0).addS(s);
        x.getTP(0).addS(s2);
        for(int i=0;i<x.getTP(0).s;i++){
            System.out.println(x.getTP(0).getS(i).strS);
        }
        x.getTP(0).removeS(0);
        for(int i=0;i<x.getTP(0).s;i++){
            System.out.println(x.getTP(0).getS(i).strS);
        }
        /**
         * Statu changing and checkng of shipments
         */
        x.getTP(0).changeStatu(0);
        x.getTP(0).checkShipment(0);

    }
    public static  void main(String[] abs){
        test();
    }

}
