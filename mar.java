import java.util.*;
public class mar
{
	public static void main(String[] args)
	{
		//Getting length of multidimensional array from user
	    	Scanner s=new Scanner(System.in);
		System.out.println("Enter length of multidimensional array");
	    	int l=s.nextInt();
	    	int[][] a=new int[l][l];
		//Getting elements of array
		System.out.println("Enter " + (l*l) + " elements");
		for(int i=0;i<l;i++)
	   		{
	        	for(int j=0;j<l;j++)
	        		a[i][j]=s.nextInt();
	       		}
		//printing original multidimensional array
	        System.out.println("Original Multidimensional array: \n");  
		for(int i=0;i<l;i++)  
		{  
			for(int j=0;j<l;j++)  
			{  
				System.out.print(" "+a[i][j]+"\t");  
			}  
			System.out.println("\n");  
		} 
		//printing after anticlockwise rotation 
		System.out.println("Multidimensional Array left Rotation");  
		for(int i=l-1;i>=0;i--)  
		{  
			for(int j=0;j<=l-1;j++)  
			{  
				System.out.print(""+a[j][i]+"\t");  
			}  
			System.out.println("\n");  
		}  
	}  
}  