import javax.swing.*;

public class Main extends  Languages{
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Person p [] = new Person[100];
        p[0] = new Person(0 , "test0" , "test0@gmail.com");

        test.multiply();
       // test n = new Person();


        Person person = new Person(10 , "oraib" , "oraibnidal@gmail.com");
        System.out.println( "" + person.toString());
        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getEmail());
        person.setEmail("test@gmail.com"); // because email is private we use setEmail ,  if email final can't change value
        System.out.println(person.getEmail());

        //this method must be static to call it in main
        firstMethod();

        Person p2 = new Person( "nidal");
        System.out.println( "p2 = " + p2.getName());

        //can't create object if class is abstract
       // Languages obj = new Languages();

        Main main = new Main();
        main.method2();
       // Main.method2();
        main.MyAbstractMethod();


        // abstract int x = 3 ; abstract attributes just in abstract class

        final int y = 10 ;
        //y = 30 ; //we can't change value of y


        //Polymorphism
        A a = new A();
        A b = new B();
        A c = new C();

        A a2 = new B();//upcasting

        a.soundA();
        b.soundA();
        c.soundA();
        //////////////////////////////
        //enum class
        Evaluation evaluation = Evaluation.Excellent;
        System.out.println( " enum class : " + evaluation);


        Person test = new Person("oraibnidal");
        System.out.println( "sum method from test interface : "+test.sum(2 , 5));

        test.printTest();
        switch (evaluation) {
            case Good:
                System.out.println("Good evaluation");
                break;
            case Excellent:
                System.out.println("Excellent evaluation");
                break;
            case VeryGood:
                System.out.println("VeryGood evaluation");
                break;


        }

    }

    static void firstMethod () {
        System.out.println("firstMethod");

    }



//this method in Languages abstract class
    @Override
    void MyAbstractMethod() {
        System.out.println("test MyAbstractMethod after implements it ");
    }


    static  class A {
        public void soundA(){
            System.out.println("sound form a ");
        }
    }
    static class  B extends A {
        public void soundA(){
            System.out.println("sound form b ");
        }
    }
    static class C extends A {
        public void soundA(){
            System.out.println("sound form c ");
        }
    }
}