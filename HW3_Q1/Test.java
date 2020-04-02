public class Test {
    public void testwithBoolean(String methodName,boolean functionCall,boolean expected){
        if(functionCall==expected){
            System.out.println(methodName+"passed the test");
        }
        else{
            System.out.println(methodName+"failed the test");
        }
    }
    public void testwithInteger(String methodName,int functioncall,int expected){
        if(functioncall==expected){
            System.out.println(methodName+"passed the test");
        }
        else{
            System.out.println(methodName+"failed the test");
        }
    }
    public void testwithString(String methodName,String functioncall,String expected){
        if(functioncall.equals(expected)){
            System.out.println(methodName+"passed the test");
        }
        else{
            System.out.println(methodName+"failed the test");
        }
    }
    public void testwithNode(String methodName,Node functioncall,Node expected){
        int counter=0;
        for(int i=0;i<functioncall.getCapacity();i++){
            if(functioncall.data[i]==expected.data[i]){
                counter++;
            }
        }
        if(counter==functioncall.getCapacity()){
            System.out.println(methodName+"passed the test");
        }
        else{
            System.out.println(methodName+"failed the test");
        }
    }
    public void testINTEGERARRAY(String methodName,Object data[],Object expected[]){
        int counter=0;
        for(int i=0;i<5;i++){
            if(data[i]==expected[i]){
                counter++;
            }
        }
        if(counter==5){
            System.out.println(methodName+"passed the test");
        }
        else{
            System.out.println(methodName+"failed the test");
        }
    }
}
