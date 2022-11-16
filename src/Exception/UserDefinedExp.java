package Exception;
// Exception handling is managed via try, catch, throw, throws, and finally

//try
//catch
//catch
//..
//optional -> finally (executed after try block ends)
public class UserDefinedExp {
    public static void main(String[] args) {
//        int [] array = new int [5]; // 0-4
//        int i = array[5];//array index out of bounds
//        System.out.println("test");

        try {
            fun();
        }catch (NullPointerException e){
            System.out.println("catch in main");
        }

    }
    static void test (){

    }

    static void fun(){
        try{
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e){
            System.out.println("catch inside fun");
            throw e;
        }
    }
}
