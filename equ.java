import java.util.*;
import java.lang.Math.*;
public class equ
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three co-efficient of quadratic equation ax2+bx+c=0 say a,b,c");
		double a=s.nextDouble();
		double b=s.nextDouble();
		double c=s.nextDouble();
		double r1,r2;
		double d=(b*b)- (4*a*c);
		// check if determinant (d) is greater than 0
    		if (d>0)
		{
			// two real and distinct roots
      			r1=(-b+Math.sqrt(d))/(2*a);
      			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.format("root1 = %.2f and root2 = %.2f", r1, r2);
    		}
		// check if determinant (d) is equal to 0
    		else if (d==0)
		{
		      //two real and equal roots since -b+0==-b
                      r1=r2=-b/(2*a);
                      System.out.format("root1 = root2 = %.2f;", r1);
    		}
		// if determinant (d) is less than zero
    		else
		{
			// roots are complex number and distinct
      			double real=-b/(2*a);
      			double imaginary=Math.sqrt(-d)/(2*a);
      			System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      			System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    		}
	}
}