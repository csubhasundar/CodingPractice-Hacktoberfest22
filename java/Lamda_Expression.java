
//class object = (parameter) -> {
//Code
// };

//Interface calss must have 1 method
interface man{
    public void sleep();
}
interface maths{
    public void add(int a ,int b);
}
public class Lamda_Expression {
    public static void main(String[] args) {
        //Non Parameter
        man m = ()->{
            System.out.println("Man is sleeping");
        };
        m.sleep();

        //Parameter
        maths ma = (a , b)->{
            System.out.println("Addition of these numbers are: "+ (a+b));
        };
        ma.add(10 , 5);
    }
}
