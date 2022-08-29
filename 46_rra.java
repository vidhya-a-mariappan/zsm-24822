import java.util.*;
public class rra
{  
	public static void main(String[] args)
	{  
       		//Getting array length from user and times to rotate right
		System.out.println("Enter the length of an array and number of times to rotate left");
		Scanner s=new Scanner(System.in);
	    	int len=s.nextInt();
		int n=s.nextInt();
	    	int[] arr=new int[len];
	    	//Getting elements of array from user
		System.out.println("Enter "+len+" elements of an array");
		for(int i=0;i<len;i++)
	    		arr[i]=s.nextInt();  
      		System.out.println("Original array: ");  
        	for (int i = 0; i < arr.length; i++)  
                	System.out.print(arr[i] + " ");    
        	//Rotate the given array by n times toward right
        	for(int i=0; i<n;i++)
		{  
                	int j,last;  
            		//Stores the first element of the array  
            		last= arr[arr.length-1];  
            		for(j=arr.length-1;j>0;j--) 
                	//Shift element of array by one  
                	arr[j] = arr[j-1];  
                        //First element of array will be added to the end  
            		arr[j] = last;  
       		}  
        	System.out.println();  
        	//Displays resulting array after rotation  
        	System.out.println("Array after right rotation: ");  
        	for(int i = 0; i< arr.length; i++) 
            	System.out.print(arr[i] + " ");  
	}  
}  
