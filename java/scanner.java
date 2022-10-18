import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter number 1");

        // Taking int as input as 1st number
        int a = sc.nextInt();
 //       int b = sc.nextInt();

        System.out.println("Enter number 2");

        //Taking float as input as 2nd number
//        float a = sc.nextFloat();
        float b = sc.nextFloat();

//        int sum = a +b;
        float sum = a +b;

        System.out.println("The sum of these numbers is");
        System.out.println(sum);

        //Taking boolean whether input is int
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        //Taking string as input
//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
    }
}
