import java.util.*;
public class freq
{  
	public static void main(String[] args)
	{  
        	//Getting element of array from user
	  	System.out.println("Enter the length of an array");
		Scanner s=new Scanner(System.in);
	    	int n=s.nextInt();
	    	int[] arr=new int[n];
	    	System.out.println("Enter "+n+" elements of an array");
	 	for(int i=0;i<n;i++)
	    	  	arr[i]=s.nextInt();
		//Array fr will store frequencies of respective element  
        	int[] fr = new int [arr.length];  
        	int viewed = -1;  
        	for(int i=0;i<arr.length;i++)
		{  
            		int count=1;  
            		for(int j=i+1;j< arr.length;j++)
			{  
                		if(arr[i]==arr[j])
				{  
                    			count++;  
                    			//To avoid counting same element again  
                    			fr[j] = viewed;  
                		}  
            		}  
            		if(fr[i]!=viewed)  
                	fr[i]=count;  
        	}  
  		//Displays the frequency of each element present in array  
        	System.out.println("------------------------");  
        	System.out.println(" Element | Frequency");  
        	System.out.println("-------------------------");  
        	for(int i = 0; i<fr.length; i++)
		{  
            		if(fr[i]!=viewed)  
                	System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        	}  
        	System.out.println("---------------------------);  
    }
}  
