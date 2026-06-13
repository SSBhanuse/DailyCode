//If we're defining abstract method in a class then that class should be abstract

abstract class Car2{
    public abstract void driveCar();
    public abstract void ejectCar();

    public void playMusic(){
        System.out.println("Playing music in the car");
    }
}

abstract class Creta extends Car2{
    @Override
    //If we're extending abstract class and in that class we have an abstract method then that abstract method need to define in that class
    public void driveCar() {
        System.out.println("Driving the Creta");
    }
}

// Concrete class
class Thar extends Creta{
    @Override
    public void ejectCar() {
        System.out.println("Ejecting the Thar");
    }
}

public class Abstract {
    public static void main(String[] args) {
        //We cannot create aboject of abstract class
        Car2 c2 = new Thar();
        c2.driveCar();
        c2.playMusic();
        c2.ejectCar();
    }
}