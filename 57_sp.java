import java.util.*;
public class sp
{
	public static void main(String[] args)
	{
		//Getting old length string from user
		System.out.println("Enter the length of the String in odd number");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		//Iterating till end of string
		for (int i=0; i<str.length();i++)
		{
			for (int j=0;j<str.length();j++)
			{
				//Printing respective character of string only when i==j   
				if (i==j)
					System.out.print(str.charAt(i));
				else if ((i+j)==str.length()-1)
					//printing respective character of string only when i+j is length of string
					System.out.print(str.charAt((i+j)-i));
				else
					System.out.print(" ");
			}
			//moving to new line
			System.out.println();
		}
	}
}
