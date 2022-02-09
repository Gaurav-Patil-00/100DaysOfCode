class Vehicle {

    protected int wheels;
    protected String vehicleName;
    protected double price;
    protected String colour;

    public Vehicle(int wheels, String vehicleName, double price, String colour) {
        this.wheels = wheels;
        this.colour = colour;
        this.vehicleName = vehicleName;
        this.price = price;
    }

}

class Car extends Vehicle {
    private String wipers;
    private int cameras;

    public Car(int wheels, String vehicleName, double price, String colour, int cameras, String wipers) {
        super(wheels, vehicleName, price, colour);
        this.wipers = wipers;
        this.cameras = cameras;
    }

    public String toString() {
        return String.format("Car[ wheels=%d, vehicleName=%s, price=%.2f, colour=%s, wipers=%s, cameras=%d]",
                super.wheels, super.vehicleName, super.price, super.colour, wipers, cameras);
    }
}

class MotorCycle extends Vehicle {
    private double enginePower;

    public MotorCycle(int wheels, String vehicleName, double price, String colour, double enginePower) {
        super(wheels, vehicleName, price, colour);
        this.enginePower = enginePower;
    }

    public String toString() {
        return String.format("MotorCycle[wheels=%d, vehicleName=%s, price=%.2f, colour=%s, Engine Power=%.2f ]",
                super.wheels, super.vehicleName, super.price, super.colour, enginePower);
    }

}

public class InheritanceDemo {
    public static void main(String[] args) {
        Vehicle bike = new MotorCycle(2, "Honda Unicorn", 130000.0, "Black", 150.5);
        System.out.println(bike);
        Vehicle car = new Car(4, "Tata Punch", 900000.0, "Grey", 2, "rear and front");
        System.out.println(car);
    }
}
