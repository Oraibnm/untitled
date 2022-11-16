package Exception;

//Exception to handle the runtime errors

//three types :
//Checked Exception
//Unchecked Exception
//Error

//1-ArithmeticException
//2-NullPointerException
//3-NumberFormatException
//4-ArrayIndexOutOfBoundsException
public class TestException {
    public static void main(String[] args) {

        try {
            int array[] = new int [5];
            array[5]  =14/0; //ArithmeticException
            // NOTE : if we add some code here , can't execute , the compiler execute catch statement
        }
        //add 2 exception on one object
//        catch (ArithmeticException  | ArrayIndexOutOfBoundsException) {
//            System.out.println("Arithmetic Exception | ArrayIndexOutOfBoundsException ");
//        }
        //order is important
        catch (ArithmeticException e ) {
            System.out.println("Arithmetic Exception ");
        }
        catch (Exception e) {
            System.out.println("Exception in general ");
            return ;
        }


        ////////////////////////////////////////////////

        //NullPointerException
        String str1 = null ;
        // System.out.println(str1.length());
        //////////////////////////////////////////////////

        //NumberFormatException
        String str2 = "oraib nidal";
        //  int i = Integer.parseInt(str2); // string to integer , mismatched

        //////////////////////////////////////////////////
        //ArrayIndexOutOfBoundsException
        int array[] = new int[10];
//        array[15] = 99;
        //////////////////////////////////////////////////

        try {
            int [] arr = new int []{1,2,3};
            System.out.println(arr[5]);
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e ) {
            System.out.println(e.toString());//e object as default e.toString
        }

        /////////////////////////////////////////////////

        //finally block : cleanup code , close connection ot close file
        //execute in all cases , but if we calling System.exit() , will not executed

        try {
            int test = 100/5 ;
            System.out.println( "division : " +test );


        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally ");
        }

        System.out.println("test");

        System.out.println(getNum());
    }



    //example finally block
    static  int getNum (){
        try {
            return 1 ;
        }
        catch (Exception e){
            return 2 ;
          //System.exit(0);
        }
        finally {
            return 3 ;
        }
    }}
