/* Encapsulation is a fundamental concept in object-oriented programming that involves
bundling data (variables) and methods (functions) that operate on the data into a single unit, typically a class.
It also restricts direct access to some of the object's components,
which can help prevent unintended interference and misuse of the data.*/

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
