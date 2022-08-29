import java.util.*;
public class rs
{
	public static void main(String[] args)
	{  
         	//Getting user input to print reverse
		System.out.println("Enter the numbers to print reverse");
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int rev=0,rem=0;  
		while(n!=0)   
		{  
			rem=n%10;  
			rev=rev*10+rem;  
			n=n/10;  
		}  
		System.out.println("The reverse of the given number is " + rev);  
         }  
}  
