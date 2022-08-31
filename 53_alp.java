import java.util.*;
public class alp
{
	public static void main(String[] args)
	{
		//Getting string from user
        	System.out.println("Enter a word such a way alphabet and number(range from 1 to 99) should be in alternate eg:a1b10d15");
		Scanner s=new Scanner(System.in);
		String str=s.next();
        	char[] temp = new char[str.length()];
        	char res;
        	for (int i=0;i<str.length();i++)
   			temp[i]=str.charAt(i);
      		for(int i=0;i<str.length();i++)
		{
            		int count=0;
			//condition for checking number
            		if(temp[i]>='0'&&temp[i]<='9')
			{
                 		res = temp[i-1];
                     		while(temp[i]>='0'&&temp[i]<='9')//checking for 2nd digit number
				{
                         		count=(count*10)+(temp[i]-'0');//returns character's ascii value
                         		i++;
					if(i>str.length()-1)
						break;
                         	}
                 		for(int j=0;j<count;j++)
                     			System.out.print(res);
                 	}
             	}
        }
}
    	
