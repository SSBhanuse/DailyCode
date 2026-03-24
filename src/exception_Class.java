import java.util.Scanner;

class myException extends Exception {

    /*The toString() method is a method of the Object class that returns a string representation of the object.
    In this case, it is overridden in the myException class to return a custom message when the exception is printed.*/
    public String toString() {
        return "This is my toString().";
    }

    // The getMessage() method is a method of the Exception class that returns a detailed message about the exception.
    public String getMessage() {
        return "This is my getMessage().";
    }
}

public class exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        if (a < 0) {
            try {
                throw new myException();
            }
            catch (myException e) {
                // This will call the toString() method of the myException class and print its return value, which is "This is my toString().".
                System.out.println(e);

                // This will call the getMessage() method of the myException class and print its return value, which is "This is my getMessage().".
                System.out.println(e.getMessage());

                // This will call the getStackTrace() method of the Exception class (which is the superclass of myException) and print the stack trace of the exception,
                // which is an array of StackTraceElement objects that represent the call stack at the point where the exception was thrown.
                System.out.println(e.getStackTrace());
            }
        }
        System.out.println("Condition is not satisfied");
    }
}
