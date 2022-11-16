public class BabyChild extends Child{

    void printBabyChild(){
        super.printChild();
        System.out.println("Print from Baby Child :P");
    }
    public static void main(String[] args) {
        BabyChild babyChild = new BabyChild();

        babyChild.PrintParent();
        babyChild.printChild();
        babyChild.printBabyChild();
    }
}
