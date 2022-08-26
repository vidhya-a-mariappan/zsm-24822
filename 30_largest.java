import java.util.*;
public class largest
{
	public static void main(String[] args)
	{
		System.out.println("Enter the three numbers");
	        Scanner s=new Scanner(System.in);
	        int a=s.nextInt();
	        int b=s.nextInt();
	        int c=s.nextInt();
		if (a==b && a==c)
	    	{
			System.out.println("All are same");
            	}
	    	else if(a>=b && a>=c)
	    	{
			if(a==b)
	        	System.out.println(a+b+" are same");
			else if(a==c)
			System.out.println(a+c+" are same");
			else
			System.out.println(a+" is largest");
	    	}
	    	else if(b>=a && b>=c)
	    	{
			if(b==c)
			System.out.println(b+c+" are same");
			else
	        	System.out.println(b+" is largest");
	    	}
	    	else
	    	{
	        	System.out.println(c+" is largest");
	    	}
	    }
}
