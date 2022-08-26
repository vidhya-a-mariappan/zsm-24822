import java.util.*;
public class leia
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of elements in an array");    
	    	Scanner s=new Scanner(System.in);
	    	int n=s.nextInt();
	    	int[] arr=new int[n];
	    	int i=0,lar=0;
		System.out.println("Enter "+n+" elements in an array");
	    	while(i<n)
	    	{
	        	arr[i]=s.nextInt();
	        	if(arr[i]>lar)
	            	lar=arr[i];
			i++;
	    	}
	    	System.out.println("Largest element in an array is "+lar);
	}
}