//Write a program to demonstrate static variables, methods, and blocks.

package Assignment_day_1;

public class Static_members {
	
	static int m = 20 ; 
	
	public static void hello() {
		System.out.println("This is a static method");
	}
	
	static
	{
		System.out.println("Hi this are the static members and this is from a static block");
	}

	public static void main(String[] args) {
		hello();
		System.out.println("The static variable is : "+ m  );
	}
}
