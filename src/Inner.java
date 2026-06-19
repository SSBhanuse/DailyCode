class A{
    public void method1(){
        System.out.println("method 1 is running");
    }

    class B{
        public void method2(){
            System.out.println("method 2 is running");
        }
    }
}

public class Inner {
    public static void main(String[] args) {
        A a = new A();
        a.method1();

        //Inner classes are tied to instances of their outer class.
        // You can't use new B() directly; you must use outerInstance.new B() instead.
        // This allows the inner class to access members of the outer class instance a.
        A.B b = a.new B();
        b.method2();
    }
}
