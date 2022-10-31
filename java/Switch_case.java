public class Switch_case {
    public static void main(String[] args) {

       /*
        Switch(var) {
        Case C1:
            //Code;
            break;
        Case C2:
            //Code;
            break;
        Case C3:
            //Code
            break;
         default:
             //Code
        */

        //New way
        /*
        Switch(var) {
            Case C1 ->{//Code};
            Case C2 ->//Code;
            default -> //Default code;
            }
         */
        String var = "Saurabh";
        switch (var) {
            case "Shubham" -> {System.out.println("You are going to become an Adult!");}
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");
        }
}
