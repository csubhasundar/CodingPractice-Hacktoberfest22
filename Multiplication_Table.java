import java.util.Scanner;
public class Multiplication_Table {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();
       System.out.println("Enter upto which number");
       int m=sc.nextInt();
       System.out.println("Multiplication Table of n is :");
       for(int i=1; i<=m; i++)
       {
          System.out.println(n+" * "+i+" = "+n*i);
       }
   }   
}
