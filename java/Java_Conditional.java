public class Java_Conditional {
    public static void main(String[] args) {

        //If-else

        /* if (condition-to-be-checked) {
	statements-if-condition-true;
      }
         else {
	statements-if-condition-false;
      }
      */

        int a = 29;
        if (a>18) {
            System.out.println("You can drive");
        }
        else{
            System.out.println("You are underage!");
        }

        // If-else ladder

        /* if (condition1) {

            //Statements;

          else if {

            // Statements;

           }

          else {

            //Statements

           }
           */

        if (a>18) {
            System.out.println("You are going to get a job");
        }
        else if(a>60){
            System.out.println("You are retired");
        }
        else{
            System.out.println("You are underage!");
        }
    }
}
