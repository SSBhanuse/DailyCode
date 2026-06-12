//If we're defining abstract method in a class then that class should be abstract

abstract class Car2{
    public abstract void driveCar();

    public void playMusic(){
        System.out.println("Playing music in the car");
    }
}

class Creta extends Car2{
    @Override
    //If we're extending abstract class then need to define abstract method in that class
    public void driveCar() {
        System.out.println("Driving the Creta");
    }
}

public class Abstract {
    public static void main(String[] args) {
        //We cannot create aboject of abstract class
        Car2 c2 = new Creta();
        c2.driveCar();
        c2.playMusic();
    }
}
