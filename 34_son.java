import java.util.*;
public class son
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number to find the sum of natural numbers");
		Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int sum=(n *(n+1))/2;
	    	System.out.println("sum of "+n+" natural numbers is "+sum);
	    	int l=0,r=0,sum1=sum;
	        while(sum1>0)
	        {
	        	r=sum1%10;
	        	if(r>=l)
			{
	            		l=r;
	       	        	sum1=sum1/10;
			}
	    	}
	    	System.out.println("Largest digit of the "+ sum +" is "+l);
	 }
}
