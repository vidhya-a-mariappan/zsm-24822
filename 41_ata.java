import java.util.*;
public class ata
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	        int[] a1={5,10,15,20,25,30,35,40,45,50};
	        int[] a2=new int[a1.length];
	        int i=0,j=0;
		//Printing elements of first array
		System.out.println("Elements of first array ");
		while(i<a1.length)
		{
			System.out.print(a1[i]+" ");
			i++;
		}
		//Copying from one array to another array
		System.out.println("Copying elements from first array to second array");
		System.out.println("Elements of second array ");
		//Printing second array
	        while(j<a1.length)
	        {
	   		a2[j]=a1[j];
	        	System.out.print(a2[j]+" ");
			j++;
	   	}    
	}
}
