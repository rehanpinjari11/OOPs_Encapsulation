package encapsulation;

// Encapsulation using modification in setter Method

class Employee {

    private String name;   // Private field
    private double salary; // Private field

    // Constructor to initialize the fields

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter methods to access and modify private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

public class EmployeeMain {

    public static void main(String[] args) {

        Employee emp = new Employee("John", 50000); // Object creation

        // Accessing private fields through public methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Modifying private fields through setter methods
        emp.setSalary(55000);
        System.out.println("Updated Employee Salary: " + emp.getSalary());
    }
}
