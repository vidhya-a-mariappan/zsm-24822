import java.util.*;
public class aep
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of elements in array");
        	Scanner s=new Scanner(System.in);
	   	int n=s.nextInt();
	        int[] array=new int[n];
                for(int i=0;i<n;i++)
	        {
	        	array[i]=s.nextInt();
	        }
                System.out.println("Elements of an array present on even position are");
                for(int j=1;j<n;j=j+2)
	        	System.out.println(array[j]);
        }
}
