import java.util.*;
import java.lang.Math.*;
public class qe
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three co-efficient of polynominal equation");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		double r1,r2;
		float d=(b*b)- (4*a*c);
		if(d>0)
		{
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("First root is "+r1);
			System.out.println("Second root is "+r2);
		}
		else
		{
			System.out.println("Oops! Discriminant is negative.No roots!");
		}
	}
}
		
		

                
 
