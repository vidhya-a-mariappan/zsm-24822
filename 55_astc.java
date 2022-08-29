import java.util.*;
public class astc
{
	public static void main(String args[])
	{
		//getting number to print c character
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of asterisk to be used in row and column to print in form of Character c");
		int n=s.nextInt();
		//Iterating to print the letter c
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==0)||(j==0)||(i==n-1))
					System.out.print("*"+" ");
			}
		System.out.println(" ");
		}
	}
}
