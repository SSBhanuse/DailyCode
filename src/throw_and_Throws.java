class NegativeNumberException extends Exception{

    public String toString() {
        return "Negative numbers are not allowed.";
    }

    public String getMessage() {
        return "Negative numbers are not allowed.";
    }
}

public class throw_and_Throws {

    public static double area(int r) throws NegativeNumberException {
        if (r < 0) {
            throw new NegativeNumberException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        /*try {
            int c = divide(10, 0);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("exception occurred");
        }*/

        try {
            double c = area(1);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println("exception occurred");
        }
    }
}