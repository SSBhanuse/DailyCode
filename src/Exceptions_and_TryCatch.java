public class Exceptions_and_TryCatch {
    public static void main(String[] args) {
        //ArithmeticException
        int a = 10;
        int b = 0;
        /*int c = a/b; // This line will throw an ArithmeticException because division by zero is not allowed in Java.
        System.out.println("The result is: " + c);*/

        //Try Catch Block
        try{
            int c = a/b; // This line will throw an ArithmeticException because division by zero is not allowed in Java.
            System.out.println("The result is: " + c);
        } catch(Exception e) {
            System.out.print("Cannot divide because of: " );
            System.out.println(e);
        }
        System.out.println("Program continues after handling the exception.");
    }
}
