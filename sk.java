import java.util.*;
public class sk
{
	//Demonstrating the use of static variable  
	int rollno;//instance variable  
   	String name;//instance variable 
   	static String college ="AKCE";//static variable and also it can be updated for all objects by single line sk."ZSM"
	public static void main(String[ ] args)
	{
		//show the values of objects
 		sk s1 = new sk(1,"Abhinav");  
 		sk s2 = new sk(2,"Ashvitha");
		System.out.println("Hit 1 to know the use of Static Keyword,Hit 2 to know the functionality of Static Method");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a==1)
		{
			System.out.println("Use of Static Keyword");
			System.out.println("Unique data can be stored as instant data member,whereas common property of all items can be stored as static data member,to make program memory efficient"); // Main method  
 			s1.display();  
 			s2.display();
		}
		else if (a==2)
		{
	    		System.out.println("Functionality of using Static method");
			// Call the static method 
			myStaticMethod();
			// Creating an object of sk
    			//sk myObj = new sk();
			//Call the public method. myPublicMethod();output an error
    			//myObj.myPublicMethod();	
		}
	}
	// To demonstrate Static method
	static void myStaticMethod() 
	{
		System.out.println("Static methods can be called without creating objects");
		System.out.println("Public methods must be called only by creating objects of class");
  	}
	/* Public method
  	public void myPublicMethod()
	{
    		System.out.println("Public methods must be called only by creating objects of main");
  	}*/
	//constructor  
   	sk(int r, String n)
	{  
   		rollno = r;  
   		name = n;  
   	}  
   	//method to display the values  
   	void display ()
	{
		System.out.println(rollno+" "+name+" "+college); 
	}
} 
  

	
