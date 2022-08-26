import java.util.*;
public class exprs
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number say x");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		x = x++ * 2 + 3 * --x;
		System.out.println("Let us understood how the below expressions works");
		System.out.println("x = x++ * 2 + 3 * --x = " + x);
	}
}
