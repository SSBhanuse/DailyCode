// Final keyword in Java is used to restrict the user. It can be applied to variables, methods, and classes.
// 1. Final variable: A final variable cannot be changed once it is initialized. It is a constant.
// 2. Final method: A final method cannot be overridden by subclasses. It is used to prevent method overriding.
// 3. Final class: A final class cannot be extended (inherited) by any other class. It is used to prevent inheritance.

class finaKeyword {
    // final class cannot be extended (inherit)
    final int a = 10; // final variable

    // final method cannot be overridden
    public final void display() { // final method
        System.out.println("This is a final method.");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        finaKeyword fk = new finaKeyword();
        System.out.println(fk.a);
        fk.display();
    }
}
