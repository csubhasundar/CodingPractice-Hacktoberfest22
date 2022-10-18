
//Clock class
/*
Methods-

abstract Zoned getZone():
This method returns timezone being used to create date and time object

abstract Instant instant() :
This methods returns the current instant of the clocks.
 */


//Duration Class
//This class is used to measure time in seconds and nano seconds.
  //      This class is immutable.
/*
Some Methods of the duration class :
boolean isNegative() :
This method is used to check if the duration is negative.

isZero() :
This method is used to check if the duration is zero. Returns boolean value.
 */


//LocalDate class
/*
This class is useful for representing the dates in the year-month-day format.
With the help of LocalDate class, dates can be represented without time.
 */
/*
Methods-

compareTo() :
This method compares the equality of the two dates. Returns boolean value.

withYear(int Year) :
This method returns a copy of the LocaleDate but alters the year with the value of year passed as argument.
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//LocalTime class
//This class helps us to represent the time without the dates.
  //      Instances of LocalTime class are mutable.
/*
localTime plusHours(long hoursToAdd) :
 This method returns a copy of the LocalTime but with the specified number of hours added.

 LocalTime minusMinutes(long minutesToSubtract) :
  This method returns a copy of the LocalTime but with the specified number of minutes subtracted.
 */
public class Clockk {
    public static void main(String[] args) {

        //Date class
        //LocalDare object = localDate.now();
        LocalDate d = LocalDate.now();
        System.out.println("Today's date is: "+d);

        //Time class
        //LocalTime object = LocalTime.now();
        LocalTime t = LocalTime.now();
        System.out.println("Now the time is: "+t);

        //dateTime class
        //LocalDateTime object = LocalDateTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Todays date and time is: "+dt);

        //DateTimeFormatter
        /*
        DateTimeFormatter object = dateTimeFormatter.ofPattern("format -- char for different operation");  // This is the format
        String object2 = defaultObject.format(object);
        System.out.println(object2);  // Creating date string using date and format
         */

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String newFormat = dt.format(df);
        System.out.println("The new format of date is: "+newFormat);

        LocalDateTime dt2 = LocalDateTime.now();
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("HH:mm a E dd/MM/yyyy");
        String f2 = dt2.format(df2);
        System.out.println("Current date and time is: "+f2);
    }
}
