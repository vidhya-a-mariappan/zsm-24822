import java.util.*;
public class lng
{
	public static void main(String args[])  
        {  
		long num='a';
		long num1=10L;//long keyword for positive integer 
		long num2=-10L;//long keyword for negative integer
		//long num3=10.5;throw an error long cant hold double
		//long num4=10f;throw an error long cant hold float
		long min=-9223372036854775808L;  
        	long max=9223372036854775807L; 
		System.out.println("Working of Long Keyword");
		System.out.println("For String returns ASCII value of given character say for 'a' is  "+num);  
		System.out.println("Positive Integer "+num1);  
		System.out.println("Negative Integer "+num2);
                System.out.println("For Double : Throw an error long cant hold double"); 
		System.out.println("For Float : Throw an error long cant hold float"); 
		System.out.println("Minimum value that the long can hold "+min);
		System.out.println("Maximum value that the long can hold "+max);
	}
}