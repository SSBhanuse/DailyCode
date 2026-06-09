/* A constructor is a special method that is called when an object is instantiated.
It is used to initialize the object and set its initial state.
The constructor has the same name as the class and does not have a return type.*/

class Test1 {
    int x;
    // Default constructor
    public Test1()
    {
        System.out.println("Constructor called");
    }

    // Parameterized constructor
    public Test1(int x)
    {
        System.out.println("Parametarized called");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1(3);
    }
}
