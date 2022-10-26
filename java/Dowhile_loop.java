import java.util.Scanner;
public class Dowhile_loop {

	public static void main(String[] args) {
		
		int i;
		System.out.print("Enter the num=");
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		

	}

}
