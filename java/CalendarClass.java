import java.util.Calendar;

//Calendar Class

//Calendar obj = Calendar.getInstance();
//Constructor
/*
Calendar():
This construct a calendar with default timezone and locale

Calendar(TimeZone, locale):
This is used to create in specific timezone and locale
 */

//Methods
/*
get(int field):
 This methods returns the value of the specified calendar field

 add(int field , int amount):
 This method is useful for calculating time after or before specified calendar field

 getWeeksInWeeksYear():
 returns the number of weeks

 getMaximum(int field):
 retuns the maximum value of specified calender field
 */
public class CalendarClass {
    public static void main(String[] args) {
        //Calender
    Calendar c = Calendar.getInstance();

    //get() method:
        System.out.println("Current year is: "+ c.get(Calendar.YEAR));
        System.out.println("Current month is: "+c.get(Calendar.MONTH));
        System.out.println("Current day of the week is: "+ c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current date is: "+c.get(Calendar.DATE));
        System.out.println("Current hour is: "+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is: "+c.get(Calendar.MINUTE));
        System.out.println("Current second is: "+c.get(Calendar.SECOND));


    //add(int field, int amount):
    Calendar c1 = Calendar.getInstance();
        System.out.println("Current date is: "+ c1.getTime());
        c1.add(Calendar.YEAR , 3);
        System.out.println("Time after 3 years is: "+c1.getTime());
        c1.add(Calendar.YEAR , -13);
        System.out.println("Time before 10 years was: "+c1.getTime());
        c1.add(Calendar.MONTH , 4);
        c1.add(Calendar.DATE , 2);
        c1.add(Calendar.YEAR  , 10);
        System.out.println("Time after 4 months is: "+c1.getTime());

    //getWeeksInWeekYear()
        System.out.println("Number of weeks in a year is: "+ c1.getWeeksInWeekYear());

    //getMaximum()
        System.out.println("Maximum months of a year is: "+ c.getMaximum(Calendar.MONTH));
        System.out.println("Maximum weeks of a year is: "+c.getMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("Maximum weeks of month is: "+ c.getMaximum(Calendar.WEEK_OF_MONTH));
        System.out.println("Maximum days of the month is: "+ c.getMaximum(Calendar.DAY_OF_MONTH));
}
}