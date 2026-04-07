interface Anonymous{
        void add1();
        void add2();
    }

public class AnonymousClass {
    public static void main(String[] args) {
        // Creating an instance of the Anonymous class using an anonymous class implementation
        // Anonymous classes are used to create a one-time use class that implements an interface or extends a class without explicitly naming it.
        Anonymous obj = new Anonymous(){
            @Override
            public void add1() {
                System.out.println("Add 1");
            }

            @Override
            public void add2() {
                System.out.println("Add 2");
            }
        };
        obj.add1();
        obj.add2();
    }
}
