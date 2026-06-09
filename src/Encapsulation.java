class Encapsulate{
    private int age = 25;
    private String name = "Sanket";

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encapsulate e = new Encapsulate();
        System.out.println(e.getAge());
        System.out.println(e.getName());
    }
}
