import java.util.*;
public class qnr
{
	public static void main(String[] args)
	{
		System.out.println("Enter the two numbers to get Quotient and Remainder");
		Scanner s=new Scanner(System.in);
	    	int a=s.nextInt();
	    	int b=s.nextInt();
		if(a>=b)
		{
	    		System.out.println("Quotient= "+(a/b));
	    		System.out.println("Reminder= "+(a%b));
		}
		else if((a==0)||(b==0))
		{
			System.out.println("Number cant be Zero!Enter the valid numbers");
		}
		else
		{
			System.out.println("First number should be greater than second number");
		}		
	 }
}
