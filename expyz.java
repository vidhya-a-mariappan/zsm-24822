import java.util.*;
public class expyz
{
	public static void main(String[] args)
	{
		int y=10,z=(++y * (y++ + 5));
		System.out.println("Let us understood how the below expression works");
		System.out.println("z=(++y * (y++ + 5) = " + z);
	}
}