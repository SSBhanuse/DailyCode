interface LambdaInterface {
    void add(String str);
}
public class LambdaExpression {
    public static void main(String[] args) {
        // Creating an instance of the LambdaInterface using a lambda expression
        // Lambda expressions are a concise way to implement functional interfaces (interfaces with a single abstract method) in Java.
        LambdaInterface obj = (str) -> {
            System.out.println("Add " + str);
        };
        obj.add("Lambda Expression");
    }
}
