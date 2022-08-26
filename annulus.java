import java.util.*;
import java.lang.Math.*;
public class annulus
{
	public static void main(String[] args)
	{
		final float pi=3.14;
		System.out.println("Enter the Outer and Inner circle radius in cm");
		Scanner s=new Scanner(System.in);
		float R=s.nextFloat();
		float r=s.nextFloat();
		if(R>r)
		{
			float a=pi*(R*R-r*r);  
			System.out.println("Area of the space between two concentric circle is "+ a + " sqcm");
		}
		else
		System.out.println("Outer radius should be greater than inner radius");	
	}
}