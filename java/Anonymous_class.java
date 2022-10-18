
// Demo can be interface or abstract class.
//The Anonymous class in Java can be created by two ways :
/*
1. By extending a class
2. By implementing an interface
/*
Demo t = new Demo()
        {
// data members and methods
public void Demo_method()
        {
        ........
        ........
        }
        };

 */

//By implementing an interface
interface animal{
    public void bark();
}

//By extending class
abstract class vechile{
    abstract void car();
}

//Concretre class
class monkey{
    public void jump(){
        System.out.println("it is jumping");
    }
}
public class Anonymous_class {
    public static void main(String[] args) {
        //implementing an interface
        animal bruno = new animal() {
            @Override
            public void bark() {
                System.out.println("Bruno is barking");
            }
        };
        bruno.bark();

        //By extending class
        vechile v = new vechile(){
            void car(){
                System.out.println("I am driving a car");
            }
        };
        v.car();

        //Concrete class
        monkey m = new monkey(){
            public void jump(){
                System.out.println("The monkey is jumping");
            }
        };
        m.jump();
    }
}
