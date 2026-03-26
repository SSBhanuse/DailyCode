import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class hashSetTry {
    public static void main(String[] args) {
        //Capacity of HashSet is not fixed, it can grow dynamically as we add more elements to it, and it does not have a default capacity like ArrayList
        HashSet <Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(1); //HashSet does not allow duplicate elements, so this element will not be added to the set
        System.out.println(s1); //HashSet does not maintain the order of the elements, so the output may not be in the same order as we added


        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getClass()); //getClass() method is used to get the class of the object, it will return the class of the object as a string
        System.out.println(date.getTime()); //getTime() method is used to get the time in milliseconds since January 1, 1970, 00:00:00 GMT

        Calendar cal = Calendar.getInstance(); //getInstance() method is used to get a calendar object that is initialized with the current date and time
        System.out.println(cal); //Calendar class does not have a toString() method, so it will print the memory address of the object
        System.out.println(cal.getTimeZone().getID()); //getTimeZone() method is used to get the time zone of the calendar, and getID() method is used to get the ID of the time zone
    }
}
