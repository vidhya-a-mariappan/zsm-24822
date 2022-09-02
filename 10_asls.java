import java.util.*;
public class asls
{
	public static void main(String[] args)
	{
		//Getting length and element of an array from user
		System.out.println("Enter the length of an array");
		Scanner s=new Scanner(System.in);
	   	int n=s.nextInt();
	    	int[] arr=new int[n];
		System.out.println("Enter " + n + " elements");
	    	for(int i=0;i<n;i++)
	    		arr[i]=s.nextInt();
		Arrays.sort(arr);
		int i=0,j=n-1;
	        while(i<j)
		{
            		System.out.print(arr[j--]+" ");
            		System.out.print(arr[i++]+" ");
        	}
        	if (n%2!=0)//if no. of element is odd then it will print middle no
            		System.out.print(arr[i]);
	}
}
