import java.util.*;
import java.lang.Math.*;
public class aoc
{
	public static void main(String[] args)
	{
	final double pi=3.14;
	System.out.println("Enter the radius and height of cylinder in m");
	Scanner s=new Scanner(System.in);
        float r=s.nextFloat();
	float h=s.nextFloat();	   
	System.out.println("Area of the cylinder is "+ 2*pi*r*(r+h) + " sqm");
	}
}
