
/* class interface{
void method();
}
class subclass implements interface{
void method(){
}
}
 */

interface bicycle{
    public void applyBrake(int decrement);
    void speedup(int increment);
}
interface hornBicycle{
//    private void hornBI(){ //Cannot be accessed
//        System.out.println("I am HornBicycle");
//    }
    default void hornBI(){
        System.out.println("I am HornBicycle");
    }
//    static void cycle(){
//        System.out.println();
//    }
     void hornPI();
    public void hornSI();
}

/*
FOR INHERITANCE --
        interface bicycle{
        //methods without body
        }
        interface hornBicycle extends bicycle{
        //methods without body
        }
        class AvonCycle implements hornBicycle{
        //methods of both the interface
        }
 */
class AvonCycle implements bicycle,hornBicycle{
    public void applyBrake(int increment){
        System.out.println("The cycle is speeding");
    }
    public void speedup(int increment){
        System.out.println("The cycle is speeding up");
    }
    public void hornPI(){
        System.out.println("pii...pii...ppiii...");
    }
    public void hornSI(){
        System.out.println("Siii...SIII..SIII");
    }
}
public class Interfaces {
    public static void main(String[] args) {
AvonCycle av= new AvonCycle();
av.speedup(5);
av.applyBrake(1);
av.hornBI();
av.hornPI();
av.hornSI();

    }
}
