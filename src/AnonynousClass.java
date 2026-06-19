class C{
    public void show(){
        System.out.println("show method is running");
    }
}
public class AnonynousClass {
    public static void main(String[] args) {
        // Anonymous class is a class without a name and it is used to create an object of a class without creating a separate class file for it.
        C c = new C(){
            @Override
            public void show() {
                System.out.println("show method is running in anonymous class");
            }
        };
        c.show();
    }
}
