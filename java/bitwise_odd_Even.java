import java.util.*;


public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Wrong Number entered");
            System.exit(1);
        }
        
        if((num & 1) == 1){
            System.out.println("ODD");
        }else{
            System.out.println("EVEN");
        }
    }
}
