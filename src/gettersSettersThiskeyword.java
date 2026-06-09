/* this is a keyword which represents the current instance of the class.
It is used to refer to the current object's fields, methods, and constructors.*/

class Test {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a; // 'this' refers to the current instance of the class
    }

    public int getA() {
        return this.a; // 'this' is optional here, but it can be used for clarity
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return this.b;
    }
}

public class gettersSettersThiskeyword {
    public static void main(String[] args) {
        Test t = new Test();
        t.setA(10);
        t.setB(20);
        System.out.println(t.getA());
        System.out.println(t.getB());
    }
}
