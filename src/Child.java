public class Child extends Parent{

    int bonus = 1994;

    public Child() {
    }

    void printChild(){
        System.out.println("print form child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("parent salary = " + c.salary);
        System.out.println("child  bonus = " + c.bonus);

        c.printChild();
        c.PrintParent();
    }
}
