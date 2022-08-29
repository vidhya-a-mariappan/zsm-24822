import java.util.Scanner;
public class ap
{
	public static void main(String[] args)
	{
		//Getting alphabet from user
		System.out.println("Enter alphabet to form a pattern");
		Scanner s=new Scanner(System.in);
		char c = s.next().charAt(0);
		int cn = (int)c;
		//Checking for uppercase alphabet
		if(cn>64 && cn<91)
		{	
			for(int i=cn;i>64;i--)
			{
				for(int j=64;j<i;j++)
					//Printing character till the ascii value of A
					System.out.print((char)(i));
			//end of iteration go to new line
			System.out.println(" ");
			}
		}
		//Checking for lowercase alphabet
		else if(cn>96 && cn<123)
		{
			for(int i=cn;i>96;i--)
			{
				for(int j=96;j<i;j++)
					//Printing character till the ascii value of a
					System.out.print((char)(i));
			//end of iteration go to new line
			System.out.println(" ");
			}
		}
	}			
}
