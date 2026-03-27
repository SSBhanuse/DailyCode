import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class dateTime {
    public static void main(String[] args) {


        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getClass()); //getClass() method is used to get the class of the object, it will return the class of the object as a string
        System.out.println(date.getTime()); //getTime() method is used to get the time in milliseconds since January 1, 1970, 00:00:00 GMT

        Calendar cal = Calendar.getInstance(); //getInstance() method is used to get a calendar object that is initialized with the current date and time
        System.out.println(cal); //Calendar class does not have a toString() method, so it will print the memory address of the object
        System.out.println(cal.getTimeZone().getID()); //getTimeZone() method is used to get the time zone of the calendar, and getID() method is used to get the ID of the time zone

        LocalDate localDate = LocalDate.now(); //now() method is used to get the current date
        System.out.println(localDate); //toString() method is used to get the string representation of the localDate object, it will return the date in the format of YYYY-MM-DD

        LocalTime localTime = LocalTime.now(); //now() method is used to get the current time
        System.out.println(localTime); //toString() method is used to get the string representation of the localTime object, it will return the time in the format of HH:MM:SS

        LocalDateTime localDateTime = LocalDateTime.now(); //now() method is used to get the current date and time
        System.out.println(localDateTime); //toString() method is used to get the string representation of the localDateTime object, it will return the date and time in the format of YYYY
    }
}
