import java.util.*;
public class patone
{
	public static void main(String[] args)
	{
		//Getting user input to print pattern
		System.out.println("Enter a number to form pattern");
		Scanner s=new Scanner(System.in);
	    	int n=s.nextInt();
		//Iterating till n (entered by user) rows
        	for(int i=1;i<=n;i++)
		{
            		int c=1;//to store the number to print
			//iterating to print space until reaching n
            		for(int j=i;j<n;j++)
                		System.out.print("  ");
			//iterating to print number increment at left side
                	for(int j=1;j<i;j++)
                		System.out.print(c++ +" ");
			//iterating to print number decrement at right side 
                        for(int j=1;j<=i;j++)
                		System.out.print(c-- +" ");
            	        System.out.println("");
        	}
   	 }
}
