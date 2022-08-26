import java.util.*;
public class asc
{
	public static void main(String[] args)
	{
		System.out.println("Enter the character to find ascii value");
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
	    	int ascii= c;
	    	System.out.println("ASCII value for "+ c + " is "+ascii);
	 }
}