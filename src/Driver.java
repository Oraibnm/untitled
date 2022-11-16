 class Bike {
    void run (){
        System.out.println("ruunnn");
    }
}

class Splendor extends Bike {
    void run(){
        System.out.println("run safety with 10km");
    }
    public static void main(String[] args) {
        Bike b = new Splendor();
        b.run();
    }
}


