import java.util.*;
public class uptoz
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Uppercase letter to display upto Z");
	    	char c=s.next().charAt(0);
	    	if(c>=65 && c<=90)
	    	{
			System.out.println("Letters from "+ c + " to Z are as follows");
    	    		for(int i=c;i<=90;i++)
    	    		{
    	        	System.out.print((char)i);
    	    		}
	    	}
		else
		{
			System.out.println("Enter the valid Uppercase letter from A - Z");
		}
	}
}