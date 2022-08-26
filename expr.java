import java.util.*;
public class expr
{
	public static void main(String[] args)
	{
		int a=28;
		a+=a++ + ++a + --a + a--;
		System.out.println("Let us understood how the below expression works");
		System.out.println("a+=a++ + ++a + --a + a--" + a);
	}
}