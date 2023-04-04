//Write a program to check two strings are equal or not. 

package Assignment_day_1;

import java.util.Scanner;

public class String_Equal {
	public static void main(String[] args) {
		System.out.println("This is a program to determine whether 2 Strings are same or not");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first String: ");
			String String_1 = sc.nextLine() ; 
			System.out.println("Enter the second String : ");
			String String_2 = sc.nextLine() ;
			
			System.out.println("Are both the string same ? ");
			
			if (String_1.equals(String_2) == true) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
