class MethOverloading {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, int b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MethOverloading mo = new MethOverloading();
        //System.out.println(mo.add(2, 3, 4));

        /*double sum1 = mo.add(2.5, 3);
        System.out.println(sum1);*/

        int sum1 = mo.add(2, 3);
        System.out.println(sum1);
    }
}
