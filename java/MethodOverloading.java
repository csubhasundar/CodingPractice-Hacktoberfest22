public class MethodOverloading {

        /*In Java, method overloading can be performed by two ways listed below :

By changing the return type of the different methods
By changing the number of arguments accepted by the method
*/

    // By changing the return type
    static class calculate {
        int multiply(int a, int b) {
            return a * b;
        }

        double multiply(double a, double b) {
            return a * b;
        }

        public static void main(String[] args) {

            calculate obj = new calculate();
            int c = obj.multiply(5, 4);
            calculates OBJ = new calculates();
            int i = OBJ.multiply(5, 4, 7);
            Varags v = new Varags();
            System.out.println("Var arg method: " +v.add(4,5,6,3,9));
            System.out.println("Mutiply method : returns integer : " + c);
            System.out.println("Mutiply method : returns double : " + i);

        }

        // By changing the number of arguments passed
        static class calculates {
            int multiply(int a, int b) {
                return a * b;
            }

            int multiply(int a, int b, int c) {
                return a * b * c;
            }
        }

        //Var args

        /*
        public static void foo(int … arr)
        {
        // arr is available here as int[] arr
           }
*/

        static class Varags{
           static int  add(int... arr){
                int result = 0;
                for(int element:arr){
                    result += element;
                }
               return result;
            }
        }
    }
}

