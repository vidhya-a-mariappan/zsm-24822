import java.util.*;
public class rev
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number to find difference with its reverse");
		Scanner s=new Scanner(System.in);
	        int num=s.nextInt();
	        int rem=0,rev=0,rn=num;
	        while(rn!=0)
	        {
	        	rem=rn%10;
	        	rev=(rev*10)+rem;
	        	rn=rn/10;
	    	}
	        System.out.println("The difference between number entered "+ num + " and its reverse " + rev +" is " + (num-rev));
	}
}