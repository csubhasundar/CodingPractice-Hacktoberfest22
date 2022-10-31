import java.io.*;
class Hcf_Lcm
{
 int n1,n2,hcf,lcm;
 public static void main(String args[]) throws IOException
 {
 Hcf_Lcm call = new Hcf_Lcm();
 call.readData();
 call.display();
 }
 public void readData() throws IOException
 {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter 1st number : ");
 n1 = Integer.parseInt(br.readLine());
 System.out.print("Enter 2nd number : ");
 n2 = Integer.parseInt(br.readLine());
 }
 public int findHCF(int a, int b)
 {
 if(a==0)
  return b;
 else
  return findHCF(b%a,a);
 }
 public int findLCM(int a, int b, int hcf)
 {
 return (a*b)/hcf;
 }
 public void display()
 {
 hcf = findHCF(n1,n2);
 lcm = findLCM(n1,n2,hcf);
 System.out.println("\nHCF = " +hcf);
 System.out.println("LCM = " +lcm);
 }
}
