
/*
class superclass{}
class subclass extends superclass{}

superclass obj = new subclass(); //creating an object for super class using upcasting that can access the super class methods and sub class overridden methods
 */

class phone{
    public void showTime(){
        System.out.println("This is the current Time...");
    }
    public void turnOn(){
        System.out.println("Phone is turning on...");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("Playing Music...");
    }
    public void turnOn(){
        System.out.println("SmartPhone is turning on...");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        phone p = new phone(); //Object of class phone
        //calling Parent class methods using parent class object
        p.showTime();
        p.turnOn();

        smartphone sp  = new smartphone(); //Object of class smartphone
        //calling child class methods using child class object
        sp.music();
        sp.turnOn();

        //Upcasting
        phone ph = new smartphone();
        ph.showTime(); //Method of parent class
        ph.turnOn(); //Overridden method of subclass
    }
}
