package practice;

import java.util.Scanner;

public class ConvertRadius {
	static Scanner sc = new Scanner(System.in);
	static double radiusValue,area,circumference;
	final static double PI = 3.1415;
	public static void main(String [] args)
	{
		System.out.print("Enter radius value: ");
		radiusValue = sc.nextDouble();
		
		area = PI*(radiusValue*radiusValue);
		circumference = 2*(PI*radiusValue);
		
		System.out.println("The area is: "+ area);
		System.out.println("The circumference is: "+ circumference);
	}
}
