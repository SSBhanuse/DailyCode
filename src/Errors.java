public class Errors {
    public static void main(String[] args) {
        /*SYNTAX ERRORS: This occurs when the code violates the syntax rules of the programming language.
        For example, missing a semicolon at the end of a statement or using an undeclared variable.*/
        // int x = 10

        /*LOGIC ERRORS: This occurs when the code runs without any syntax errors but produces incorrect results.
        For example, using the wrong operator in a calculation or implementing an algorithm incorrectly.*/
        int a = 5;
        int b = 10;
        int sum = a - b; // This will produce an incorrect result because the operator used is subtraction instead of addition.
        System.out.println("The sum is: " + sum);

        /*RUNTIME ERRORS: This occurs when the code encounters an error during execution,
        such as dividing by zero or accessing an array index that is out of bounds.*/
        int c = 10;
        int d = 0;
        int result = c / d; // This will throw an ArithmeticException because division by zero is not allowed in Java.
        System.out.println("The result is: " + result);

        /*COMPILATION ERRORS: This occurs when the code fails to compile due to errors in the code,
        such as missing import statements or incorrect method signatures.*/
        // System.out.println("Hello World") // This will produce a compilation error because of the missing semicolon at the end of the statement.
    }
}
