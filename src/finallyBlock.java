public class finallyBlock {
    public static int check() {
        try {
            int a = 10;
            int b = 2;
            int result = a / b; // This will throw an ArithmeticException
            return result;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        // The finally block will execute regardless of whether an exception was thrown or caught in the try block.
        // It is typically used for cleanup activities, such as closing resources or releasing locks,
        // that need to be performed regardless of the outcome of the try block.
        finally {
            System.out.println("This block will always execute.");
        }
        return 0;
    }
    public static void main(String[] args) {
        int result = check();
        System.out.println(result);
    }
}
