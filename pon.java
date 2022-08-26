import java.util.*;
public class pon
{
	public static void main(String[] args)
	{
		System.out.println("Enter any integer");
		Scanner s=new Scanner(System.in);
	        int a =s.nextInt();
	    if(a>0)
	    {
	        System.out.println(a+" is a positive integer");
	    }
	    else if(a==0)
            	System.out.println(a+" is neither positive nor negative integer");
	    else 
	    {
	        System.out.println(a+" is a negative integer");
	    }
	}
}