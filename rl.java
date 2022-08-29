import java.util.*;
public class rl
{  
	public static void main(String[] args)
	{  
       		//Getting array length from user and times to rotate left
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
        	//Rotate the given array by n times toward left  
        	for(int i=0; i<n;i++)
		{  
                	int j, fst;  
            		//Stores the first element of the array  
            		fst = arr[0];  
            		for(j=0; j<arr.length-1;j++) 
                	//Shift element of array by one  
                	arr[j] = arr[j+1];  
                        //First element of array will be added to the end  
            		arr[j] = fst;  
       		}  
        	System.out.println();  
        	//Displays resulting array after rotation  
        	System.out.println("Array after left rotation: ");  
        	for(int i = 0; i< arr.length; i++) 
            	System.out.print(arr[i] + " ");  
	}  
}  