import java.util.*;
public class caon
{
	public static void main(String[] args)
	{
		System.out.println("Enter any character");
	        Scanner s=new Scanner(System.in);
	        char c=s.next().charAt(0);
	    	if((c>=65 && c<=90) ||(c>=97 && c<=122))
	        {
	        	System.out.println(c+" is an alphabet");
	        }
	        else
	        {
	                System.out.println(c+" is not an alphabet");
	        }
	 }
}