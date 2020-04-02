public class main {
    static public void main(String abs[]){
        /***
         * Testing with a TestDriver!!!
         */
        Node<Integer> no=new Node<>();
        Node<Integer> n2o=new Node<>();
        LinkedArrayList<Integer> t2=new LinkedArrayList<>();
        Integer[] intArray = new Integer[]{ 1,2,3,4,5};
        Integer[] int5Array = new Integer[]{ 1,2,9,4,5,8,9,10};
        Integer[] int1Array = new Integer[]{ 8,2,3,4,5};
        Integer[] int2Array = new Integer[]{ 1,2,9,4,5};
        Test t=new Test();
        no.adder(int1Array,5);
        t.testwithBoolean("isEmpty ",t2.isEmpty(),true);
        t.testwithBoolean("add ",t2.add(intArray,5),true);
        t.testwithBoolean("add ",t2.add(int5Array,5),true);
        t.testwithBoolean("add ",t2.add(int5Array,5),true);
        t.testwithBoolean("add ",t2.add(intArray,5),true);
        t.testwithBoolean("contains ",t2.contains(no),false);
        t.testwithBoolean("isEmpty ",t2.isEmpty(),false);
        t.testwithInteger("size ",t2.size(),4);
        t.testwithNode("addstart ",t2.addstart(int1Array,5),no);
        no.adder(int2Array,5);
        t.testwithNode("addafter ",t2.addAfter(2,int2Array,5),no);
        no.adder(int1Array,5);
        t.testwithNode("getHead ",t2.gethead(),no);
        int a=(int)t2.RemoveAnElementArray(2,2);
        t.testwithInteger("removewtihindex ",a,9);
        int b=(int)t2.RemoveAnElementArray(1,3);
        t.testwithInteger("removewtihindex ",b,4);
        t2.remove(2);
        ListIterator<Integer> iterator=new ListIterator<>();
        t.testwithBoolean("Iterator SetCurrent ",iterator.setCurrent(t2),true);
        t.testwithBoolean("Iterator Set ",iterator.set(int1Array,5),true);
        t.testwithBoolean("İterator Add ",iterator.add(int5Array,7),true);
        t.testwithBoolean("Iterator HasNext ",iterator.hasnext(),true);
        iterator.getnext();
        System.out.println("Before set process-------------------------");
        t2.printer();
        iterator.set(int5Array,8);
        System.out.println("After set process------------------");
        t2.printer();
        LinkedArrayList<String> t4=new LinkedArrayList<>();
        String temp[]=new String[]{"sea","ase","alp","emir","bilek"};
        String temp2[]=new String[]{"sea1","ase2","alp3","emir4","bilek5"};
        t.testwithBoolean("isEmpty ",t4.isEmpty(),true);
        t.testwithBoolean("add ",t4.add(temp,5),true);
        t.testwithBoolean("add ",t4.add(temp2,5),true);
        t.testwithBoolean("isEmpty ",t4.isEmpty(),false);
        String str=(String)t4.RemoveAnElementArray(0,3);
        t.testwithString("RemoveAnElementArray ",str,"emir");


    }
}
