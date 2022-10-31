import java.io.*;
class Frequency
{
static String n;
static int l;
 public static void main(String args[]) throws IOException
 {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter a String : ");
 n = br.readLine();
 l = n.length();
 freq();
 }
 public static void freq()
 {
 int s=0,f=-1;
 for(int i=0;i<l;i++)
 {
  // Find frequecy
  for(int j=0;j<l;j++)
  {
   if(n.charAt(i)==n.charAt(j))
   s++;
  }

  // Check if the letter has occured before
  for(int k=0;k<i;k++)
  {
   if(n.charAt(i)==n.charAt(k))
   f = 1;
  }

  // Print the letter's frequency
  if(f==-1)
   System.out.println(n.charAt(i) +" = " +s);
  s=0;
  f=-1;
 }
 }
}
