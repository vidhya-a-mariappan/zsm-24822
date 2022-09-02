import java.util.*;
public class npyr
{
   public static void main(String args[])
	{
		System.out.println(" Enter the number of rows ");
   		Scanner s=new Scanner(System.in);
   		int r=s.nextInt();
   		int count=1;
   		int sr=r+4-1;
   		for(int i=1;i<=r;i++)
   		{
         		for(int j=sr;j>=1;j--)
              			System.out.print(" ");
         		for(int k=1;k<=i;k++)
	      			System.out.print(count++ + " ");
			System.out.println(" ");
    			sr--;
   		}
 	}
}
