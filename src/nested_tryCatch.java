import java.util.Scanner;

public class nested_tryCatch {
    public static void main(String[] args) {
        int [] arr = new int [5];
        arr [0] = 10;
        arr [1] = 20;
        arr [2] = 30;
        arr [3] = 40;
        arr [4] = 50;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of the array element you want to access: ");
        int index = sc.nextInt();

        try{
            System.out.println("You have entered index number: " + arr[index]);
            System.out.println("Enter the number you want to divide the array element by: ");
            int divisor = sc.nextInt();
            try {
                System.out.println("The result is: " + arr[index] / divisor);
            } catch (ArithmeticException e) {
                System.out.println("Error occurred in the inner try block");
                System.out.println("Error: " + e);
            }
        } catch (Exception e) {
            System.out.println("Error occurred in the outer try block");
            System.out.println(e);
        }
    }
}
