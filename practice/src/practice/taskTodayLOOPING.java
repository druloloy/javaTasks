package practice;

public class taskTodayLOOPING {
	public static void main(String[] args)
	{
		for(int x = 5;x >= 1;x--)
		{
			System.out.println(" ");
			
			for(int y = 1;y <= x;y++)
			{
				System.out.print(y);
			}
		}
		for(int x = 5;x >= 1;x--)
		{
			System.out.println(" ");
			for(int y = 5;y >= x;y--)
			{
				System.out.print(y);
			}
		}
	}
}
