// Method overriding is a feature in object-oriented programming that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.

class Cars{
    public void start(){
        System.out.println("Car is starting");
    }
}

class Tesla extends Cars{
    @Override
    public void start() {
        System.out.println("Tesla is starting silently");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.start();
        // This demonstrates method overriding,
        // where the start() method in the Tesla class overrides the start() method in the Cars class.
        // Output: Tesla is starting silently
    }
}
