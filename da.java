import java.util.*;
public class da
{  
	public static void main(String[] args)
	{  
       		//Getting array length from user 
		System.out.println("Enter the length of an array");
		Scanner s=new Scanner(System.in);
	    	int len=s.nextInt();
		int[] arr=new int[len];
	    	//Getting elements of array from user
		System.out.println("Enter "+len+" elements of an array");
		for(int i=0;i<len;i++)
	    		arr[i]=s.nextInt();  
      		System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element by comparing with next element  
		//Iterating till end of an array
        	for(int i=0;i<arr.length;i++)
		{  
            		for(int j=i+1;j<arr.length;j++)
			{  
                		if(arr[i] == arr[j])  
                    		System.out.print(arr[j] + " ");  
                   	}  
        	}  
        }  
}  