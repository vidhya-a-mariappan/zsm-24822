import java.util.*;
public class rr
{
	public static void main(String[] args)
	{  
         	//Getting user input to print reverse word in a string
		System.out.println("Enter the sentence");
        	Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println("Reversed String:");
		reverse(str);
	}
	public static void reverse(String str)
	{
        	//return string if the input string is null or empty
		if (str == null || str.isEmpty())
		{
			System.out.print(str);
			return;
		}
		//splitting word into 2 parts until whitespace
		String[] temp = str.split(" ");
		//storing fst string in temp
		System.out.print(temp[temp.length-1] + " ");
        	// recursive  calling method to append fst word to last until string is empty
		reverse(String.join(" ", Arrays.asList(temp).subList(0,temp.length-1)));
	} 
}
