import java.util.*;
public class patfour
{
	public static void main(String[] args)
	{
		//Getting user input to print pattern
		System.out.println("Enter a number to form number traingle");
		Scanner s=new Scanner(System.in);
	    	int n=s.nextInt();
		//Iterating till n (entered by user) rows
        	for(int i=0;i<n;i++)
		{
            		for(int j=0;j<i;j++)//Iteration for printing space
		    	    System.out.print(" ");
		        for(int k=n;k>i;k--)//Iteration for printing n by decrement
		   	     System.out.print(n-i +" ");
		    	System.out.println();
		}
	}
}
