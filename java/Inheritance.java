
/*
class Superclass-name{
    // methods and fields
        }
class Subclass-name extends Superclass-name
        {
        //methods and fields
        }
*/
class Base {
    public int x;

    public int getX() {
        return x;
    }

     void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
    class Derived extends Base{
        public int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
public class Inheritance {
    public static void main(String[] args) {
// Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        d.printMe();
        System.out.println(d.getY());
    }
}
