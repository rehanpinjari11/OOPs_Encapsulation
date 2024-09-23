package encapsulation;

// Encapsulation Using Constructor

class Car {

    private String model;
    private double price;

    // Constructor to initialize the fields
    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

public class EncapsulationCons {

    public static void main(String[] args)
    {
        Car car = new Car("Hyundai i20", 850000);
        System.out.println("Car model: " + car.getModel() + ", Price: ₹" + car.getPrice());
    }
}
