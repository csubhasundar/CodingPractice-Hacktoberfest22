import java.util.Calendar;
import java.util.GregorianCalendar;

//Gregorian Calender
       /*
       GregorianCalendar object = new GregorianCalendar();
        */

//Constructor
        /*
        GregorianCalendar():
         This constructor is used to initialize an object with the current time in the default time zone.

        GregorianCalendar(int year, int month, int day):
        This constructor is used to initialize an object with the date-set specified as parameters in the default time zone and default locale.

        GregorianCalendar(int year, int month, int day, int hours, int minutes):
        This constructor initializes an object with the given date and time set in the default locale and time zone.

        GregorianCalendar(int year, int month, int day, int hours, int minutes, int seconds):
        This constructor initializes an object with the more specific time and date-set passed as a parameter in the default locale and time zone.

        GregorianCalendar(Locale locale):
         Initializes a GregorianCalendar object with the current date and time in the default time zone and the specified locale.

        GregorianCalendar(TimeZone timeZone):
        Initializes a GregorianCalendar object with the current date and time in the default locale and the specified time zone.

        GregorianCalendar(TimeZone timeZone, Locale locale):
        Initializes an object with the locale and timezone passed as parameters.
         */

//Methods
        /*
        isLeapYear():
                check if the parameter is leap year or not

        roll(int field , boolean up)
                add/subtract a single unit of time to it
                true = rolls up value by 1
                false = rolls dowm value by 1
         */
public class CalendarGregorian {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Current time is: "+gc.getTime());

        //LeapYear():
        System.out.println("2020 is a leap year: "+ gc.isLeapYear(2020));
        System.out.println("2021 is a leap year: "+ gc.isLeapYear(2021));

        //Roll method
        System.out.println("Date before rolling:"+gc.getTime());
        gc.roll(Calendar.YEAR , true);
        gc.roll(Calendar.MONTH , true);
        gc.roll(Calendar.DATE , false);
        gc.roll(Calendar.HOUR , true);

        System.out.println("Time after rolling is: "+ gc.getTime());
    }
}
