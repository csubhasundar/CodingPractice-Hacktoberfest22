public class Recursion {

    /*
        RecursiveMethod(parameter){
       if(exceptional or end condition){
           return finalValue of iterative;
       }
       else{
           return 1stParameter - operator - RecursiveMethod(Update);
       }
   }
        */

   static int factorial(int n ){
       int r = 1;
        if(n==0 || n == 1){
            return 1;
        }
        else{

            r = n * factorial(n-1);
        }
       return r;
    }
    public static void main(String[] args) {

        int num = 5;
        System.out.println("The Factorial of "+ num + " is "+ factorial(num));

    }
}
