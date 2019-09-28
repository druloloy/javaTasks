package practice;

import java.util.Scanner;

public class taskToday2 {
	private static Scanner sc = new Scanner(System.in);
	private static int inputNum,x,max = 0;
	
	public static void main(String[] args)
	{
		
		for( x = 1; x <= 5;x++ )
		{
			System.out.printf("Enter num %d: ",x);
			inputNum = sc.nextInt();
			if(inputNum > max)
			{
				max = inputNum;
			}		
		}
		System.out.println("Highest digit: "+max);
				
	}
}
