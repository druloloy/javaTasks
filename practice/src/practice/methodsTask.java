/*
 * Andrew Loloy - https://www.github.com/druloloy/
 * October 2, 2019
 * BSCS-B11AM-JAVA
 * */

package practice; // remove or change if necessary

import java.util.Scanner; // Import this to use scanner for inputs

public class methodsTask 
{	
	/*Initialize objects*/
	static Scanner sc = new Scanner(System.in);
	static int firstNum,secondNum,thirdNum;
	static char select;
	
	/*Create methods to be used*/
	static int AreaRect(int firstNum, int secondNum) // Method for Getting the Area of Rectangle [a]
		{
			return firstNum * secondNum;
		}
	static int SqrNum(int firstNum) // Method for getting the Square root of a number [b]
		{
			return firstNum*firstNum;
		}
	static int sumNum(int firstNum,int secondNum, int thirdNum) // Method for getting the sum of 3 nums [c] 
		{
			return firstNum+secondNum+thirdNum;
		}
	
	static void operations(char select) // Method for selecting from menu depending on inputed char
		{
			switch(select)
				{
				case 'a': // If char select = 'a'
					System.out.print("Enter Length: ");
						firstNum = sc.nextInt();
					System.out.print("Enter Width: ");
						secondNum = sc.nextInt();
					System.out.print("The Area is: "+ AreaRect(firstNum,secondNum));
						
					break;
				
				case 'b': // If char select = 'b'
					System.out.print("Enter Number: ");
						firstNum = sc.nextInt();
					System.out.printf("The Square of %d is: "+ SqrNum(firstNum),firstNum);
						
					break;
				
				case 'c': // If char select = 'c'
					System.out.print("Enter First Num: ");
						firstNum = sc.nextInt();
					System.out.print("Enter Second Num: ");
						secondNum = sc.nextInt();
					System.out.print("Enter Third Num: ");
						thirdNum = sc.nextInt();
					System.out.print("The Area is: "+sumNum(firstNum,secondNum,thirdNum));
						
					break;
					
				default: // Default if entered undefined key (ex.char select = 'x')
					System.out.println("Invalid Input!");
				}
		}
	
		/*Main Method*/
	public static void main(String[] args)
		{
			System.out.print("MENU\n"); // Options
			System.out.print("[a] Area of Rectangle\n");
			System.out.print("[b] Square of Number\n");
			System.out.print("[c] Sum of 3 Numbers\n");
			
			System.out.print("Choice: ");
				select = sc.next().charAt(0);// Select from menu
		
			operations(select); // method operations is called to do the main process
			
		
		}
}

