// Problem 1
//abstract class Pen {
//    abstract void write();
//    abstract void refill();
//}
//
//class FountainPen extends Pen {
//    void write() {
//        System.out.println("Writing with fountain pen");
//    }
//
//    void refill() {
//        System.out.println("Refilling fountain pen");
//    }
//
//    void changeNib() {
//        System.out.println("Changing nib of fountain pen");
//    }
//}
//
//public class PracticeSetAbstractionAndInterface {
//    public static void main(String[] args) {
//        FountainPen fp = new FountainPen();
//        fp.write();
//        fp.refill();
//        fp.changeNib();
//    }
//}

// Problem 2
//interface BasicAnimal {
//    void eat();
//    void sleep();
//}
//
//class Monkey {
//    void jump() {
//        System.out.println("Monkey can jump");
//    }
//
//    void bite() {
//        System.out.println("Monkey can bite");
//    }
//}
//
//class Human extends Monkey implements BasicAnimal {
//    public void eat() {
//        System.out.println("Human can eat");
//    }
//
//    public void sleep() {
//        System.out.println("Human can sleep");
//    }
//
//    public void humanInfo() {
//        System.out.println("Humans are intelligent beings.");
//    }
//}
//public class PracticeSetAbstractionAndInterface {
//    public static void main(String[] args) {
//        Human human = new Human();
//        human.eat();
//        human.sleep();
//        human.jump();
//        human.bite();
//        human.humanInfo();
//    }
//}

// Problem 3
abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    void ring() {
        System.out.println("Smart telephone is ringing");
    }

    void lift() {
        System.out.println("Lifting the smart telephone");
    }

    void disconnect() {
        System.out.println("Disconnecting the smart telephone");
    }
}
public class PracticeSetAbstractionAndInterface {
    public static void main(String[] args) {
        Telephone t = new SmartTelephone();
        t.ring();
        t.lift();
        t.disconnect();
    }
}