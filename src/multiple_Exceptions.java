import java.util.Scanner;

public class multiple_Exceptions {
    public static void main(String[] args) {
        int [] arr = new int[4];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        arr [3] = 4;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of the array element you want to access: ");
        int index = sc.nextInt();

        System.out.println("Enter the number you want to divide the array element by: ");
        int divisor = sc.nextInt();

        try {
            System.out.println("You have entered index number: " + arr[index]);
            System.out.println("The result is: " + arr[index] / divisor);
        } catch (ArrayIndexOutOfBoundsException e) { // This catch block will handle the ArrayIndexOutOfBoundsException that may occur if the user enters an index that is out of bounds for the array.
            System.out.println("Error: " + e);
        } catch (ArithmeticException e) { // This catch block will handle the ArithmeticException that may occur if the user enters zero as the divisor, which is not allowed in Java.
            System.out.println("Error: " + e);
        } catch (Exception e) { // This catch block will handle any other exceptions that may occur during the execution of the try block, such as InputMismatchException if the user enters a non-integer value for the index or divisor.
            System.out.println("other exception occurred");
            System.out.println(e);
        }
    }
}
