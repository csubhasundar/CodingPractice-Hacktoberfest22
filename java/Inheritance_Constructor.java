
/*
In Java, constructor of base class with no argument gets automatically called in derived class constructor. For example, output of following program is:
Base Class Constructor Called
Derived Class Constructor Called

But, if we want to call parameterized constructor of base class, then we can call it using super().
 */
class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}

public class Inheritance_Constructor {
    public static void main(String[] args) {
        ChildOfDerived c = new ChildOfDerived();
        ChildOfDerived c1 = new ChildOfDerived(10,20,30);


    }
}
