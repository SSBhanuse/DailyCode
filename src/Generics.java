import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        //Generics in Java is a powerful feature that allows us to create classes, interfaces, and methods that can operate on any type of data.
        //It provides type safety at compile time and eliminates the need for type casting.
        //Generics are implemented using angle brackets <> and can be used with classes, interfaces, and methods.
        //Here we are using Generics to specify that the ArrayList will only hold Integer objects.
        //This provides type safety, as we cannot add any other type of object to the list.
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(22);
        arrayList.add(33);
        int a = arrayList.get(2);
        System.out.println(a);
    }
}
