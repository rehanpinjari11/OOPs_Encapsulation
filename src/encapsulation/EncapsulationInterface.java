package encapsulation;

// Encapsulation Using Interface

interface Shape {

    double calculateArea();
}

class Circle implements Shape {

    private double radius;

    // Constructor to initialize radius

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius

    public double getRadius() {
        return radius;
    }

    // Overriding method to calculate area

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


public class EncapsulationInterface {

    public static void main(String[] args)
    {
        Circle circle = new Circle(7.5);
        System.out.println("Radius: " + circle.getRadius() + ", Area: " + circle.calculateArea());
    }

}
