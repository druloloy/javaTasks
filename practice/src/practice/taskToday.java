package practice;

import java.util.Scanner;

public class taskToday {
	public static String username = "admin",password="1234";
	public static String userInput,passInput;
	public static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args)
	{
		//First output
		System.out.print("Enter Username: ");
		userInput = sc.nextLine();
		System.out.print("Enter Password: ");
		passInput = sc.nextLine();
		
		
		while (!(username.equals(userInput)) || 
				(!(password.equals(passInput))))
		{
			System.out.println("ACCESS DENIED!");
			System.out.print("Enter Username: ");
			userInput = sc.nextLine();
			System.out.print("Enter Password: ");
			passInput = sc.nextLine();
			
		}
		System.out.println("ACCESS GRANTED!");

	
	}
}
