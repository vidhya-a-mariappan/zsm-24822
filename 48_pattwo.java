import java.util.*;
public class pattwo
{
	public static void main(String[] args)
	{
		//Getting user input to print pattern
		System.out.println("Enter a number to form pattern");
		Scanner s=new Scanner(System.in);
	    	int n=s.nextInt();
		//Iterating till n (entered by user) rows
        	for(int i=0;i<n;i++)
		{
            		int cl=n-i,cr=n-1;
			//iterating to print space until reaching n
            		for(int j=i;j<n-1;j++)
                		System.out.print("  ");
			//iterating to print number increment at left side
                	for(int j=0;j<=i;j++)
                		System.out.print(cl++ +" ");
			//iterating to print number decrement at right side 
                        for(int j=0;j<i;j++)
                		System.out.print(cr-- +" ");
            	        System.out.println("");
        	}
   	 }
}
