import java.util.*;
public class soa
{
	public static void main(String[] args)
	{
		//Getting array length from user
		System.out.println("Enter the length of an array");
		Scanner s=new Scanner(System.in);
	    	int n=s.nextInt();
	    	int[] array=new int[n];
	    	int sum=0;
		//Getting elements of array from user
		System.out.println("Enter "+n+" elements of an array");
		//Iteration to find the sum of array
	    	for(int i=0;i<n;i++)
	    	{
	        	array[i]=s.nextInt();
	        	sum+=array[i];
	    	}
		//Printing the sum of array
	    	System.out.println("Sum of all elements in an array is "+sum);
	}
}
