import java.util.*;
public class vc
{
	public static void main(String[] args)
	{
		System.out.println("Enter the character to check for vowel or consonant");
		Scanner s=new Scanner(System.in);
	        char c=s.next().charAt(0);
	    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	    {
	        System.out.println(c+" is vowel");
	    }
	    else
	    {
	        System.out.println(c+" is consonant");
	    }
	}
}