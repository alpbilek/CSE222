public class main {
    public static void main(String abs[]){
        AgeSearchTree<AgeData> ageTree=new AgeSearchTree<>();
        ageTree.add(new AgeData(10));
        ageTree.add(new AgeData(20));
        ageTree.add(new AgeData(5));
        ageTree.add(new AgeData(15));
        ageTree.add(new AgeData(21));
        ageTree.add(new AgeData(10));
        ageTree.add(new AgeData(5));
        ageTree.add(new AgeData(10));

        System.out.println(ageTree.toString());
        ageTree.delete(new AgeData(20));
        System.out.println("--------After Deletion Process!!--------");
        System.out.println(ageTree.toString());
        System.out.println("youngerThan Method Result->"+ageTree.youngerThan(19));
        System.out.println("olderThan Method Result->"+ageTree.olderThan(5));
        ageTree.find(new AgeData(6));
        System.out.println(ageTree.find(new AgeData(15)).toString());

    }
}
