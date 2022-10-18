import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
//The long number holds miliseconds passed from 1 jan 1970.
//Java assumes the world has been started from 1900.

//Constructor
/*
Date() :
 The constructor is used to find the current date and time

Date(long milliseconds):
The constructor create date object from number of milliseconds since 1 jan 1970
 */


//Methods
/*
System.currentTimeMilis() :
returns the number of miliseconds

compareTo():
check the equality of two dates
returns 0 if equal else 1.

getTime():
returns the number of milliseconds since 1 jan 1970.

getSeconds():
returns the number of seconds since 1 jan 1970.

getYear():
returns the number of years since 1 jan 1970.

getDate():
returns the number of date since 1 jan 1970.
 */
// --------------------------------------------------------------------------------------------------------------------
public class Date_Time {
    public static void main(String[] args) {

        //Printing the current time in milis from 1 jan 1970
        System.out.println("Current time in milis is: "+ System.currentTimeMillis());
        System.out.println("Current time in year is: "+ System.currentTimeMillis()/1000/3600/24/365);

        Date d = new Date();
        Date d1 = new Date(1629863635841l);
        System.out.println("current date using constructor: "+d);
        System.out.println("current date using parameterized constructor: "+d1);

        //compareTo()
        System.out.println("The two dates are equal: "+ d.compareTo(d1));

        //getTime()
        System.out.println("Current Time in millis: "+ d.getTime());

        //getSeconds
        System.out.println("Current Seconds: " +d.getSeconds());

        //getDate
        System.out.println("Current date: "+d.getDate());

        //getYear
        System.out.println("Current year from 1900: "+d.getYear());

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    }
}
