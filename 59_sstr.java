import java.util.*;
public class sstr
{
	public static void main(String[] args)
	{
		//Getting two string from user
        	System.out.println("Enter two words");
		Scanner s=new Scanner(System.in);
		System.out.println("String 1 : ");
		String str1=s.nextLine();
		System.out.println("String2 : ");
		String str2=s.nextLine();
		//returns the index of the sub string starting position or else return -1	
		int i=str1.indexOf(str2);
		if(i== -1)
			System.out.println("String 2 is not a substring of String 1 " + i);
		else
			System.out.println("String 2 is substring of String 1 and index of first occurrence is " + i);
				
	}
}


        	
