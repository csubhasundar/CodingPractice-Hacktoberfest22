public class Loops {
    public static void main(String[] args) {

        //While Loop

        /*
        while (Boolean condition)
        {
        // Statements    -> This keeps executing as long as the condition is true.

        increment or decrement
        }
        */

        int i = 0;
        while(i<=200){
            System.out.println(i);
            i++;
        }
        System.out.println("Finish Running While Loop!");

        //        while(true){
        //            System.out.println("I am an infinite while loop!");
        //        }


        //  do-while Loop

        /* do {

            //code

            increment or decrement
        } while (condition);
         */

        int b = 10;
        do {
            System.out.println(b);
            b++;
        }while(b<5);

        int c = 1;
        do{
            System.out.println(c);
            c++;
        }while(c<=45);
        System.out.println(" Finished while running do-while loop");

        // for loop

        /* for (initialize; check_bool_expression; update){

            //code;

           }
           */

        for (int j=1; j<=10; j++){
            System.out.println(j);
        }
        System.out.println("This is the end of for loop");
    }

}
