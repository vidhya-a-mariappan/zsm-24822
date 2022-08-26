import java.util.*;
public class seia
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of elements in an array");    
	    	Scanner s=new Scanner(System.in);
	    	int n=s.nextInt();
	    	int[] arr=new int[n];
	    	int i=0,small=0;
		System.out.println("Enter "+n+" elements in an array");
	    	while(i<n)
	    	{
	        	arr[i]=s.nextInt();
	        	if(small>arr[i])
	            	small=arr[i];
			i++;
	    	}
	    	System.out.println("Smallest element in an array is "+small);
	}
}