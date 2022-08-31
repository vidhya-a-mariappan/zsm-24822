import java.util.*;
public class sos
{
	public static void main(String args[])
    	{
		//Getting number to form a series if number is 2,then 1+11=12 and so on
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();    
        	int sum=0,a=1;
		System.out.println("The Sum of Series is ");
        	for (int i=1;i<=n;i++)
        	{
            		System.out.print(a + " " );
			sum=sum+a;
            		a=(a*10)+1;
			if(i<n)
			System.out.print(" + ");
	      	}
 		System.out.print(" = "+sum);
   	}
}
