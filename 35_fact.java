import java.util.*;
public class fact
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int fact=1;
	        for(int i=1;i<=n;i++)
	        {
	        	fact=fact*i;  
	        }
	        System.out.println(n+"! is "+ fact);
       	        int r=0,sum=0;
	        while(fact>0)
	        {
	        	r=fact%10;
	        	sum=sum+r;
	        	fact=fact/10;
	    	}
	    	System.out.println("Sum of digits is "+sum);
	}
}
