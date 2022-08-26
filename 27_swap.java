import java.util.*;
public class swap
{
	public static void main(String[] args)
	{
		System.out.println("Enter two numbers for swapping");
		Scanner s=new Scanner(System.in);
	        int a=s.nextInt();
	        int b=s.nextInt();
	        int temp=a;
	        a=b;
	        b=temp;
	        System.out.println("Two numbers after swapping "+a+"  "+b);
	    }
}
