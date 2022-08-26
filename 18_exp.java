import java.util.*;
public class exp
{
	public static void main(String[] args)
	{
		System.out.println("Enter two numbers say a and b");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int x=69>>>2,m=++a-b--,n=a%b++;
		System.out.println("Let us understood how the below expressions works");
		System.out.println("(i)++a-b-- = " + m);
		System.out.println("(ii)a%b++ = " + n);
		System.out.println("(iii)a*=b+5 = " + a);
		System.out.println("(iv)x=69>>>2 = " + x);
	}
}
