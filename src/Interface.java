// This code demonstrates the concept of inheritance in Java.
// The AdvancedCalculator class inherits from the Calculator class, allowing it to use the add() method defined in the Calculator class.

class Calculator {
    public void add() {
        System.out.println("I am in Calculator class");;
    }
}

class AdvancedCalculator extends Calculator {
    public void add1() {
        System.out.println("I am in AdvancedCalculator class");
    }
}

public class Interface {
    public static void main(String[] args) {
        AdvancedCalculator ac = new AdvancedCalculator();
        ac.add();
    }
}
