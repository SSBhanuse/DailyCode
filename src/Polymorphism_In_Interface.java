interface Car1{
    void startCar();
    void stopCar();
    private void startEngine(){
        System.out.println("Engine is starting");
    }
    default void honk(){
        startEngine();
        System.out.println("Car is honking");
    }
}

interface Bike1{
    void startBike();
    void stopBike();
}

class Plane1{
    public void fly() {
        System.out.println("Plane is flying");
    }
}

class Vehicle1 extends Plane1 implements Car1, Bike1{
    @Override
    public void startCar() {
        System.out.println("Car is starting");
    }

    @Override
    public void stopCar() {
        System.out.println("Car is stopping");
    }

    @Override
    public void startBike() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stopBike() {
        System.out.println("Bike is stopping");
    }

    public void totalVehicle(int numVehicles) {
        System.out.println("Total number of vehicles: " + numVehicles);
    }
}

public class Polymorphism_In_Interface {
    public static void main(String[] args) {
        Vehicle1 vehicle = new Vehicle1(); //Run all methods of Vehicle1 class
        Car1 car = new Vehicle1(); // Polymorphism: Run only Car1 methods
    }
}
