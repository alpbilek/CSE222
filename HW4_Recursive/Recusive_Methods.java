public class Recusive_Methods {
    /**
     * Helper Methods
     * Used for the convert loops to recursive calls
     */
    /**
     * This method for iterate to right direction
     * @param arr which is going to print!
     * @param start index of the iterator's
     * @param end index of the iterator's
     * @param i constant for the printing an index of the array
     */

    public void right(int[][] arr,int start,int end,int i){
        if(start==end){
            return;

        }
        else{
            System.out.println(arr[i][start]);
            start++;
        }
        right(arr,start,end,i);
        }
    /**
     * This method for iterate to down direction
     * @param arr which is going to print!
     * @param start index of the iterator's
     * @param end index of the iterator's
     * @param i constant for the printing an index of the array
     */

    public  void down(int[][] arr,int start,int end,int i){
        if(start==end){
            return;
        }
        else{
            System.out.println(arr[start][i]);
            start++;
        }
        down(arr,start,end,i);
        }
    /**
     * This method for iterate to left direction
     * @param arr which is going to print!
     * @param start index of the iterator's
     * @param end index of the iterator's
     * @param i constant for the printing an index of the array
     */
    public   void left(int[][] arr,int start,int end,int i){
        if(start==end){
            return;
        }
        else{
            System.out.println(arr[i][start]);
            start--;
        }
        left(arr,start,end,i);
    }
    /**
     * This method for iterate to up direction
     * @param arr which is going to print!
     * @param start index of the iterator's
     * @param end index of the iterator's
     * @param i constant for the printing an index of the array
     */
    public void up(int[][] arr,int start,int end,int i){
        if(start==end){
            return;
        }
        else{
            System.out.println(arr[start][i]);
            start--;
        }
        up(arr,start,end,i);
    }

    /**
     * Printer for the given 2D Array
     * @param arr given Array
     * @param xS starter for the X axis
     * @param yS starter for the Y axis
     * @param yL length of the second dimension of the Array
     * @param xL length of the first dimension of the Array
     * @param counter for the stop the recursive call!
     */
    public void printer(int[][] arr, int xS, int yS, int yL,  int xL,int counter) {
        if (counter == yL * xL) {
            return;
        }
        else {
            right(arr, xS, yL + 1, xS);
            down(arr, xS + 1, xL + 1, yL);
            if (xL >= xS + 1) {
                left(arr, yL - 1, yS - 1, xL);
            }

            if (yL >= yS + 1) {
                up(arr, yL, xS, yS);
            }
            if (xL - 1 >= xS + 1 && yL - 1 >= yS + 1) {
                printer(arr, xS + 1, yS + 1, yL - 1, xL - 1, counter++);
            }
        }
    }

    /**
     * Helper function for the reverse a String
     */
    /**
     * Cover Method for the reverse!
     * @param x given String array!
     */
    public void reverser(String[] x){
        reverse(x, 0, x.length -1);
    }

    /**
     * Reverse the given String array'
     * @param x given Array
     * @param i iterate the Array
     * @param j iterate the Array
     */
    public void reverse(String[] x, int i, int j){
        if(i<j){
            String tmp = x[i];
            x[i] = x[j];
            x[j] = tmp;
            reverse(x, ++i, --j);
        }
    }

    /**
     *
     * Takes a String.Pushes it to a String array.Reverses it and makes it String again!
     * @param parameter given string for the reverse
     */
    public void StringReverse(String parameter){
        String str=parameter;
        String[] arr=str.split("\\s+");
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i].replaceAll("[^\\w]", "");
        }
        reverser(arr);

        String output=new String();
        for(int i=0;i<arr.length;i++){
            output=output+arr[i]+" ";
        }
        System.out.println(output);
    }

    /**
     * Checks given String is an elfish or not!
     * @param str given String
     * @param countL For the count the L's in String
     * @param countE For the count the E's in String
     * @param countF For the count the F's in String
     */
    public void elfish(String str,int countL,int countE,int countF) {
        if (str.length() == 0 ) {
            if((countE>0 &&countF>0 && countL>0)){
                System.out.println("This is an elfish word!");
            }
            else{
                System.out.println("This is not an elfish word!");
            }
            return;
        }
        if (str.substring(0, 1).equals("l")) {
            countL ++;
        }
        else if(str.substring(0,1).equals("e")){
            countE++;
        }
        else if(str.substring(0,1).equals("f")){
            countF++;
        }

        elfish(str.substring(1),countL,countE,countF);
    }

    /**
     * Constructor is used for call the all methods!
     */
    public Recusive_Methods(){
        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20},
        };
        printer(array,0,0,array[0].length-1,array.length-1,0);

        StringReverse("this function writes the sentence in reverse");
        StringReverse("selam alp emir bilek ben");

        elfish("alpemir",0,0,0);
        elfish("leaf",0,0,0);
        elfish("waffles",0,0,0);
    }
}
