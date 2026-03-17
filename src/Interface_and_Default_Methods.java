interface Car{
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

interface Bike{
    void startBike();
    void stopBike();
}

class Plane{
    public void fly() {
        System.out.println("Plane is flying");
    }
}

class Vehicle extends Plane implements Car, Bike{
    @Override
    public void startCar() {
        System.out.println("Car is starting");
    }

    @Override
    public void stopCar() {
        System.out.println("Car is stopping");
    }

//    This method is overriding the default method from the Car interface.
//    @Override
//    public void honk(){
//        System.out.println("Car is honking loudly");
//    }

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

public class Interface_and_Default_Methods {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.startCar();
        vehicle.honk();
        vehicle.totalVehicle(5);
    }
}
