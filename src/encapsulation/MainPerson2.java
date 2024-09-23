package encapsulation;

// Encapsulation using Write-Only

// Class "Person"
class Person2 {

    private String name;
    private int age;

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

}

public class MainPerson2 {

    public static void main(String[] args) {
        // Object to Person class
        Person2 per = new Person2();

        // Setting the values
        per.setName("Robert");
        per.setAge(21);

    }
}
