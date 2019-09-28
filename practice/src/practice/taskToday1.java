package practice;

import java.util.Scanner;

public class taskToday1 {
	public static int numInput;
	public static char choice;
	public static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args)
	{
		do
		{
			System.out.println("Enter a number: ");
			numInput = sc.nextInt();
		    System.out.println("Answer: "+ numInput*numInput*numInput);
			System.out.println("Do you want to Continue[y][Y]: ");
			choice = sc.next().charAt(0);
		}
		while (choice==('y')||choice==('Y'));
		
	}
}
