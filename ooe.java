import java.util.*;
public class ooe
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number to check whether it is even or odd");
		Scanner s=new Scanner(System.in);
	        int x=s.nextInt();
	    if(x%2==0)
	    {
	        System.out.println(x+" is an even number");
	    }
	    else
	    {
	        System.out.println(x+" is an odd number");
	    }
	}
}