package practice;

public class currencyPH 
{
	static double amount = 2887.50;
	
	static int oneThousand = 1000;
	static int fiveHundred = 500;
	static int twoHundred = 200;
	static int oneHundred = 100;
	static int fifty = 50;
	static int twenty = 20;
	static int ten = 10;
	static int five = 5;
	static int one = 1;
	static double fiftyCent = 0.5;
	static double twentyFiveCent = 0.25;
	public static void main(String[] args)
	{
		System.out.println("Amount: "+amount);
		
		if(amount >= oneThousand)
		{
			int count = (int)Math.floor(amount / oneThousand); 
			amount-=count*oneThousand;
			System.out.println("1000: "+count+"\n");
		}
		if(amount >= fiveHundred)
		{
			int count = (int)Math.floor(amount / fiveHundred); 
			amount-=count*fiveHundred;
			System.out.println("500: "+count+"\n");
		}
		if(amount >= twoHundred)
		{
			int count = (int)Math.floor(amount / twoHundred); 
			amount-=count*twoHundred;
			System.out.println("200: "+count+"\n");
		}
		if(amount >= oneHundred)
		{
			int count = (int)Math.floor(amount / oneHundred); 
			amount-=count*oneHundred;
			System.out.println("100: "+count+"\n");
		}
		if(amount >= fifty)
		{
			int count = (int)Math.floor(amount / fifty); 
			amount-=count*fifty;
			System.out.println("50: "+count+"\n");
		}
		if(amount >= twenty)
		{
			int count = (int)Math.floor(amount / twenty); 
			amount-=count*twenty;
			System.out.println("20: "+count+"\n");
		}
		if(amount >= ten)
		{
			int count = (int)Math.floor(amount / ten); 
			amount-=count*ten;
			System.out.println("10: "+count+"\n");
		}
		if(amount >= five)
		{
			int count = (int)Math.floor(amount / five); 
			amount-=count*five;
			System.out.println("5: "+count+"\n");
		}
		if(amount >= one)
		{
			int count = (int)Math.floor(amount / one); 
			amount-=count*one;
			System.out.println("1: "+count+"\n");
		}
		if(amount >= fiftyCent)
		{
			int count = (int)Math.floor(amount / fiftyCent); 
			amount-=count*fiftyCent;
			System.out.println("0.50: "+count+"\n");
		}
		if(amount >= twentyFiveCent)
		{
			int count = (int)Math.floor(amount / twentyFiveCent); 
			amount-=count*twentyFiveCent;
			System.out.println("0.25: "+count+"\n");
		}
		
		
	}

}
