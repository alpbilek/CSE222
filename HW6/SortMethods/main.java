import java.util.Random;

public class main {
    static public void main(String abs[]){
        sortMethods sm=new sortMethods();
        sm.list.add(5);
        sm.list.add(1);
        sm.list.add(4);
        sm.list.add(7);
        sm.list.add(13);
        sm.list.add(0);
        sm.list.add(14);
        sm.list.add(15);
        sm.list.add(2);
        System.out.println("Before MergeSort---"+sm.list);
        long StartTime=System.nanoTime();
        sm.MergeSortLL(0,sm.list.size()-1);
        long EndTime=System.nanoTime();
        System.out.println("After MergeSort---"+sm.list);
        double time=EndTime-StartTime;

        sortMethods smQ=new sortMethods();
        smQ.list.add(5);
        smQ.list.add(1);
        smQ.list.add(4);
        smQ.list.add(7);
        smQ.list.add(13);
        smQ.list.add(0);
        smQ.list.add(14);
        smQ.list.add(15);
        smQ.list.add(2);
        System.out.println("Before QuickSort---"+smQ.list);
        long StartTimeQ=System.nanoTime();
        smQ.QuickSortLL(0,smQ.list.size()-1);
        long EndTimeQ=System.nanoTime();
        System.out.println("After QuickSort---"+smQ.list);
        double timeQ=EndTimeQ-StartTimeQ;
        System.out.println("QuickSort execution time in seconds:"+timeQ/1000000);
        System.out.println("MergeSort Execution time in Seconds:"+time/1000000);
        Comparable[][] arr=new Comparable[6][10000];
        Random rand = new Random();
        for(int i=0;i<6;i++) {
            for(int j=0;j<10000;j++){
                arr[i][j]=rand.nextInt(1000);
            }
        }
        long StartS=System.currentTimeMillis();
        sm.Shellsort(arr[0]);
        long EndS=System.currentTimeMillis();
        double Shell=EndS-StartS;
        System.out.println("ShellSort execution time in seconds"+Shell/1000);
        StartS=System.currentTimeMillis();
        sm.QuickSort(arr[5]);
        EndS=System.currentTimeMillis();
        Shell=EndS-StartS;
        System.out.println("QuickSort execution time in seconds"+Shell/1000);
        StartS=System.currentTimeMillis();
        sm.HeapSort(arr[1]);
        EndS=System.currentTimeMillis();
        Shell=EndS-StartS;
        System.out.println("HeapSort execution time in seconds"+Shell/1000);
        StartS=System.currentTimeMillis();
        sm.SelectionSort(arr[2]);
        EndS=System.currentTimeMillis();
        Shell=EndS-StartS;
        System.out.println("SelectionSort execution time in seconds"+Shell/1000);
        StartS=System.currentTimeMillis();
        sm.InsertionSort(arr[4]);
        EndS=System.currentTimeMillis();
        Shell=EndS-StartS;
        System.out.println("InsertionSort execution time in seconds"+Shell/1000);
        StartS=System.currentTimeMillis();
        sm.BubbleSort(arr[3]);
        EndS=System.currentTimeMillis();
        Shell=EndS-StartS;
        System.out.println("BubbleSort execution time in seconds"+Shell/1000);

    }

}
