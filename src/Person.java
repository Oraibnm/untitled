public class Person implements test {

    private final int id;
    private String name ;
    private String email;
    final int x = 10 ;

    private transient String description;

    public Person() {
        this.id = 0;
    }

    public Person (String name) {
        this.name= name ;
        this.id=0;
    }
    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void printTest() {
        System.out.println("Print person info using test interface :)");
    }

    @Override
    public int sum(int a , int b ) {
        return a + b ;
    }
}
