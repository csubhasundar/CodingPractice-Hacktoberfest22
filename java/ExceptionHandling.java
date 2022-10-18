import java.util.Scanner;
//Try - catch block
/*
try{
//code that can throw an exception
}catch(exception e){
sout(e)
}
 */

//Multiple catch block
/*
try{
//code
}
catch(exception e){
sout(e)
}
catch(exception e){
sout(e)
}
 */

/*
We can write our custom Exceptions using the Exception class in java.

public class MyException extends Exception {
       // Overridden methods
}

/*
The Exception class has the following important methods:

1) Strings toString() executed when sout (e) is ran

2) Void printStackTrace() - prints Stack trace

3) String getMessage() - prints the exception message
 */

/*
 The throw keyword is used to throw an exception explicitly by the programmer
//  throw new My Exception ( "Exception throw" );

Throws java throws keyword is used to declare an exception.
//public void methods() throws Exception {
        // code
//        }
*/

//Create custom exception
/*
class myexception extends Exception{
//code
}
 */
class sideExceptions extends Exception{
    public String negative(){
        return "side cannot be negative";
    }
    public String zeroArea(){
        return "Area cannot be 0";
    }
}
public class ExceptionHandling {
    public static  void area(int a) throws sideExceptions{
        if(a<0){
            throw new sideExceptions();
        }
        else if(a==0){
            throw new sideExceptions();
        }
        else {
            System.out.println("The area of the square is "+ a*a);
        }
    }
    public static void main(String[] args) {

                int [] marks = new int[3];
                marks[0] = 7;
                marks[1] = 56;
                marks[2] = 6;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the array index");
                int ind = sc.nextInt();

                System.out.println("Enter the number you want to divide the value with");
                int number = sc.nextInt();
                try{
                    System.out.println("The value at array index entered is: " + marks[ind]);
                    System.out.println("The value of array-value/number is: " + marks[ind]/number);
                }
                catch (ArithmeticException e){
                    System.out.println("ArithmeticException occured!");
                    System.out.println(e);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("ArrayIndexOutOfBoundsException occured!");
                    System.out.println(e);
                }
                catch (Exception e){
                    System.out.println("Some other exception occured!");
                    System.out.println(e);
                }
        System.out.println("Enter the side of the square: ");
                int a = sc.nextInt();
                try {
                    area(a);
                }catch (sideExceptions e){
                    System.out.println(e.negative());
                    System.out.println(e.zeroArea());
                }
   //finally block is always executed whether the exception is handled or not
   /*
   try{
   //Code
   }
   fianlly{
   sout("rest of the code")
   }
    */
        int i= 4;
        int i2 =2;
        try{
            System.out.println(i/i2);
        }
        finally {
            System.out.println("Rest of the code");
        }
            }
        }



