import java.util.*;
public class mulnsubtable
{
	public static void main(String[] args) 
	{
	   	Scanner s=new Scanner(System.in);
                System.out.println("Enter the number to generate corresponding Multiplication and subraction Table");
	    	int num=s.nextInt();
	    	System.out.println("Multiplication table for number " + num);
	    	for(int i=0;i<=20;i++)
	    	{
	        	System.out.println(num+" * "+i+" = "+ num*i);
	   	 }
		System.out.println("Subtraction table for number " + num);
		for(int j=num;j<=20;j++)
		{
			System.out.println(j+" - "+ num +" = "+ (j-num));
		}
	}
}
