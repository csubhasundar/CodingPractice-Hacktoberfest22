import java.util.*;
public class vowelsCount
{
	public static void main(String []args)
	{
        Scanner sc = new Scanner(System.in);
			String str;
			int countWords=0;
			System.out.println("Enter the Word : ");
			while((str=sc.nextLine())!=null)
			{
				String words[]=str.split(" ");
				countWords=countWords+words.length;
				for(String s:words)
				{
					int vowel=0;
					for(int i=0;i<s.length();i++)
					{
						char ch=Character.toLowerCase(s.charAt(i));
						if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
						    {vowel++;}
					}
					System.out.println("Vowels in the word "+s+": "+vowel);
				}
                System.exit(1);
			}
        
	}
}
