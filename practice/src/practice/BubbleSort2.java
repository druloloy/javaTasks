package practice;

import java.util.Scanner;

public class BubbleSort2 
{
	static Scanner sc = new Scanner(System.in);
	static int maxArray,max,min;
	static int[] sort;
	static void bubbleSorting(int[] sort)
	{

		for(int x = 0; x < sort.length;x++)
		{
			for(int y = 1; y < sort.length - x;y++)
			{
				if(sort[y] > sort[y-1])
				{
					max = sort[y-1];
					sort[y-1] = sort[y];
					sort[y] = max;
				}
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.print("Input Max Array: ");
		maxArray = sc.nextInt();
		sort = new int[maxArray];
		for(int ctr = 0; ctr < sort.length;ctr++ )
		{
			System.out.print("Input value: ");
			sort[ctr] = sc.nextInt();
		}
		// Without sorting
		System.out.println("Without Sorting");
		for(int ctr = 0; ctr < sort.length;ctr++ )
		{
			System.out.print(sort[ctr]+" ");
		}
		
		bubbleSorting(sort);
		
		// With sorting
				System.out.println("\nGreater to Lesser");
				for(int ctr = 0; ctr < sort.length;ctr++ )
				{
					System.out.print(sort[ctr]+" ");
				}

	}
}
