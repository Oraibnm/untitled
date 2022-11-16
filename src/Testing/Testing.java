package Testing;

public class Testing {
    public static void main(String[] args) {
//        String str = username("yyyadmin");
//        System.out.println(str);
        Testing testing = new Testing();
        String actual_result=testing.username("admin");
        System.out.println("first testing :" + actual_result);
        String actual_result2= testing.username("oraib");
        System.out.println("second testing :" + actual_result2);


    }



    public String username (String username ){
        String expected_res = null;
        if (username.equals("admin")){
            expected_res="valid username";

        }
        else {
            expected_res="invalid username";
        }
        return expected_res;
    }
}
