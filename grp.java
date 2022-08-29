import java.util.*;
public class grp
{
	public static void main(String[] args)
	{
		// Initialising starting roll no as 101
		int sn=101;
		int gn=1;
		// Iteration to form 4 group
		for (int i=sn;i<=104;i++)
		{
			gn+=1;
			System.out.println("Group " +gn + ":");
			// Iterating the loop to print no's in each group with jump of 4
			for (int j=i;j<=120;j=j+4)
				System.out.println(j);
		}
	}
}