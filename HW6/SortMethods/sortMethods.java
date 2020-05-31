import java.util.LinkedList;

public class sortMethods {
    public LinkedList<Integer> list=new LinkedList<>();

    /**
     * Helper for the QuickSortLL method
     * @param low for the swapping process Left pointer
     * @param high for the swapping process Right pointer
     * @return Pivot
     */
    int quickHelper(int low, int high){
        int pivot=list.get(high);
        int i=low-1;
        for(int j=low;j<high;j++){
            if(list.get(j)<pivot){
                i++;
                int temp=list.get(i);
                list.set(i,list.get(j));
                list.set(j,temp);
            }
        }
        int temp=list.get(i+1);
        list.set(i+1,list.get(high));
        list.set(high,temp);
        return i+1;
    }

    /**
     * QuickSort
     * @param low for the swapping process Left pointer
     * @param high for the swapping process Right pointer
     */
    void QuickSortLL(int low,int high){
        if(low<high){
            int pi=quickHelper(low,high);


            QuickSortLL(low,pi-1);
            QuickSortLL(pi+1,high);
        }
    }

    /**
     * Helper for MergeSort
     * @param beg for the dividing process head of the list
     * @param mid where to divide
     * @param end for the dividing process end of the list
     */
    void merge(int beg,int mid,int end){

        int i=beg,j=mid+1,k,index = beg;
        int[] temp=new int[10];
        while(i<=mid && j<=end)
        {
            if(list.get(i)<list.get(j))
            {
                temp[index] = list.get(i);
                i = i+1;
            }
            else
            {
                temp[index] = list.get(j);
                j = j+1;
            }
            index++;
        }
        if(i>mid)
        {
            while(j<=end)
            {
                temp[index] = list.get(j);
                index++;
                j++;
            }
        }
        else
        {
            while(i<=mid)
            {
                temp[index] = list.get(i);
                index++;
                i++;
            }
        }
        k = beg;
        while(k<index)
        {
            list.set(k,temp[k]);
            k++;
        }

    }

    /**
     * MergeSort
     * @param l head of the list
     * @param r end of the list
     */
    void MergeSortLL(int l,int r){
        if(l<r){
            int m=(l+r)/2;
            MergeSortLL(l,m);
            MergeSortLL(m+1,r);
            merge(l,m,r);
        }
    }

    /**
     * SelectionSort from the book
     * @param table sorted array
     */
    public  void SelectionSort(Comparable[] table) {
        int n = table.length;
        for (int fill= 0; fill < n-1; fill++) {
            // Invariant: table[0 . . . fill – 1] is sorted.
            int posMin = fill;
            for (int next = fill + 1; next < n; next++) {

                if (table[next].compareTo(table[posMin]) < 0) {
                    posMin = next;
                }
            }
            Comparable temp = table[fill];
            table[fill] = table[posMin];
            table[posMin] = temp;
        }

    }

    /**
     * Helper for the SelectionSort
     * @param table sorted array
     * @param nextPos from book
     * @param <T> from book
     */
    private  <T extends Comparable<T>> void insert(T[] table,   int nextPos) {
        T nextVal = table[nextPos];

        while (nextPos > 0 && nextVal.compareTo(table
                [nextPos -1]) < 0) {
            table[nextPos] = table[nextPos-1];

            nextPos--;

        }

        table[nextPos] = nextVal;
    }

    /**
     * InsertionSort
     * @param table sorted array
     * @param <T> from book
     */
    public  <T extends Comparable<T>> void InsertionSort(T[] table) {
        for (int nextPos = 1; nextPos < table.length; nextPos++) {

            insert(table, nextPos);
        }
    }

    /**
     * ShellSort helper
     * @param table sorted array
     * @param nextPos from book
     * @param gap from book
     * @param <T> from book
     */
    private  <T extends Comparable<T>> void Shellinsert(T[] table,int nextPos, int gap) {
        T nextVal = table[nextPos];

        while ((nextPos > gap-1) && (nextVal.compareTo
                (table [nextPos-gap]) < 0)) {

            table[nextPos] = table[nextPos-gap];

            nextPos-= gap;

        }
        table[nextPos] = nextVal;

    }

    /**
     * Shellsort
     * @param table sorted array
     * @param <T> from book
     */
    public  <T extends Comparable<T>> void Shellsort(T[] table) {

        int gap = table.length / 2;
        while (gap > 0) {
            for (int nextPos = gap; nextPos < table.length; nextPos++) {

                Shellinsert(table, nextPos, gap);
            }
            if (gap == 2) {
                gap = 1;
            } else {
                gap = (int) (gap / 2.2);
            }
        }
    }

    /**
     * Helper for HeapSort
     * @param table sorted array
     * @param i iterator
     * @param j iterator
     * @param <T> from book
     */
    private  <T extends Comparable<T>> void swap(T[] table,int i, int j) {
        T temp = table[i];
        table[i] = table[j];
        table[j] = temp;
    }

    /**
     * Helper for HeapSort
     * @param table sorted array
     * @param <T> from book
     */
    private  <T extends Comparable<T>> void shrinkHeap(T[] table) {
        int n = table.length;

        while (n > 0) {
            n--;
            swap(table, 0, n);

            int parent = 0;
            while (true) {
                int leftChild = 2 * parent + 1;
                if (leftChild >= n) {
                    break;
                }
                int rightChild = leftChild + 1;

                int maxChild = leftChild;
                if (rightChild < n
                        && table[leftChild].compareTo(table[rightChild]) < 0) {
                    maxChild = rightChild;
                }

                if (table[parent].compareTo(table[maxChild]) < 0) {

                    swap(table, parent, maxChild);

                    parent = maxChild;
                } else {
                    break;
                }
            }
        }
    }

    /**
     * HeapSort
     * @param table sorted array
     * @param <T> from book
     */
    public  <T extends Comparable<T>> void HeapSort(T[] table) {
        buildHeap(table);
        shrinkHeap(table);
    }

    /**
     * Helper for HeapSort
     * @param table sorted Array
     * @param <T> from book
     */
    private  <T extends Comparable<T>> void buildHeap(T[] table) {
        int n = 1;

        while (n < table.length) {
            n++;
            int child = n -1;
            int parent = (child-1) / 2;
            while (parent >= 0
                    && table[parent].compareTo(table[child]) < 0) {
                swap(table, parent, child);
                child = parent;
                parent = (child - 1) / 2;
            }
        }
    }

    /**
     * Bubble sort
     * @param table sorted array
     * @param <T> from book
     */
    public <T extends Comparable<T>> void BubbleSort(T[] table){
        int pass=1;
        boolean exchanges=false;
        do{
            exchanges=false;
            for(int i=0;i<table.length-pass;i++){
                if(table[i].compareTo(table[i+1])>0){
                    T temp=table[i];
                    table[i]=table[i+1];
                    table[i+1]=temp;
                    exchanges=true;
                }

            }
            pass++;
        }while (exchanges);
    }

    /**
     * helper for QuickSort
     * @param table sorted arrray
     * @param first First pointer
     * @param last last pointer
     * @param <T> from book
     */
    private  <T extends Comparable<T>> void quickSort(T[] table,int first, int last) {
        if (first < last) {
            int pivIndex = partition(table, first, last);

            quickSort(table, first, pivIndex -1);

            quickSort(table, pivIndex + 1, last);
        }
    }

    /**
     * Helper for the QuickSort
     * @param table sorted array
     * @param first firts pointer
     * @param last last pointer
     * @param <T> from book
     * @return from book
     */
    private  <T extends Comparable<T>> int partition(T[] table,int first, int last) {

        T pivot = table[first];
        int up = first;
        int down = last;
        do {

            while ((up < last) && (pivot.compareTo(table[up]) >= 0)) {
                up++;
            }

            while (pivot.compareTo(table[down]) < 0) {
                down--;
            }

            if (up < down) {
                swap(table, up, down);
            }
        } while (up < down);
        swap(table, first, down);

        return down;
    }

    /**
     * QuicSort
     * @param table sorted array
     * @param <T> from book
     */
    public  <T extends Comparable<T>> void QuickSort(T[] table) {

        quickSort(table, 0, table.length-1);
    }

}

