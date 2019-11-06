package practice;

import java.util.Scanner;

public class nov06 {
	// TABLE DATAS WILL BE STORED HERE
	final static int ARRAY_LIMIT = 100;
	static String[] ITEM_ID = new String[ARRAY_LIMIT];
	static String[] ITEM_NAME = new String[ARRAY_LIMIT];
	static String[] ITEM_TYPE = new String[ARRAY_LIMIT];
	static int[] ITEM_QUANTITY = new int[ARRAY_LIMIT];
	static double[] ITEM_PRICE = new double[ARRAY_LIMIT];
	
	//INITIALIZED OBJECTS
	static Scanner sc = new Scanner(System.in);
	
	//CHOOSE OPERATION
	static void menu()
	{
		System.out.print("@@@@@-MENU-@@@@@");
		System.out.print("\n[1] ADD ITEM"
				+ "\n[2] UPDATE ITEM"
				+ "\n[3] SHOW ITEM"
				+ "\n[4] SHOW ITEM BY TYPE"
				+ "\n[5] FIND ITEM"
				+ "\n\nCHOOSE OPTION: ");	
	}
	//OPERATIONS THAT WERE SELECTED
	static void MAIN_ACTION()
	{	
		boolean load_page = true;
		int ctr = 0;
			do {
				menu(); // SHOW MENU CHOICES
				int choose_option = sc.nextInt();
		
			
				switch(choose_option)
				{
					case 1:
							System.out.print("INPUT ITEM ID: ");
							sc.nextLine();
							ITEM_ID[ctr] = sc.nextLine();
							System.out.print("INPUT ITEM NAME: ");
							ITEM_NAME[ctr] = sc.nextLine();
							System.out.print("INPUT ITEM TYPE: ");
							ITEM_TYPE[ctr] = sc.nextLine();
							System.out.print("INPUT ITEM QUANTITY: ");
							ITEM_QUANTITY[ctr] = sc.nextInt();
							System.out.print("INPUT ITEM PRICE: ");
							ITEM_PRICE[ctr] = sc.nextDouble();
							ctr++; // INCREMENT INDEX FOR NEXT QUERIES
							System.out.println("\nITEM ADDED SUCCESSFULLY!\n");
							break;
							
					case 2:
							System.out.print("ENTER ITEM ID: ");
							sc.nextLine();
							String FIND_ITEMID = sc.nextLine();
							for(int i = 0; i < ctr; i++)
							{
								if(FIND_ITEMID.equals(ITEM_ID[i]))
								{
									
									System.out.print("INPUT NEW ITEM NAME: ");
									ITEM_NAME[i] = sc.nextLine();
									System.out.print("INPUT NEW ITEM TYPE: ");
									ITEM_TYPE[i] = sc.nextLine();
									System.out.print("INPUT NEW ITEM QUANTITY: ");
									ITEM_QUANTITY[i] = sc.nextInt();
									System.out.print("INPUT NEW ITEM PRICE: ");
									ITEM_PRICE[i] = sc.nextDouble();
									
									System.out.println("\nITEM UPDATED!\n");
								}
						
							break;
							
					case 3:
							for(int i = 0; i < ctr; i++)
							{
								System.out.println("ITEM_ID\t\tITEM_NAME\t\tITEM_TYPE\t\tITEM_QUANTITY"
										+ "\t\tITEM_PRICE");
								System.out.println(ITEM_ID[i]+"\t\t"+ITEM_NAME[i]+"\t\t"+ITEM_TYPE[i]+"\t\t"+ITEM_QUANTITY[i]
										+ "\t\t"+ITEM_PRICE[i]+"\n");
							}
							break;
					case 4:
							int result = 0;
							System.out.print("ENTER ITEM TYPE: ");
							sc.nextLine();
							String FIND_ITEMTYPE = sc.nextLine();
							for(int j = 0; j < ctr; j++)
							{
								if(FIND_ITEMTYPE.equals(ITEM_TYPE[j]))
								{
									result++;
								}
							}
							System.out.printf("---%d RESULT FOUND---\n",result);
							System.out.println("ITEM_ID\t\tITEM_NAME\t\tITEM_TYPE\t\tITEM_QUANTITY"
									+ "\t\tITEM_PRICE");
								for(int i = 0; i < ctr; i++)
								{		
									if(FIND_ITEMTYPE.equals(ITEM_TYPE[i]))
									{
										
										System.out.println(ITEM_ID[i]+"\t\t"+ITEM_NAME[i]+"\t\t"+ITEM_TYPE[i]+"\t\t"+ITEM_QUANTITY[i]
												+ "\t\t"+ITEM_PRICE[i]);
									}
								}
							
							break;
					case 5:
						int find = 0;
						System.out.print("ENTER ITEM ID: ");
						sc.nextLine();
						String itemID_find = sc.nextLine();
						for(int j = 0; j < ctr; j++)
						{
							if(itemID_find.equals(ITEM_ID[j]))
							{
								find++;
							}
						}
						System.out.printf("---%d RESULT FOUND---\n",find);
						System.out.println("ITEM_ID\t\tITEM_NAME\t\tITEM_TYPE\t\tITEM_QUANTITY"
								+ "\t\tITEM_PRICE");
						for(int i = 0; i < ctr; i++)
						{
							if(itemID_find.equals(ITEM_ID[i]))
							{

								System.out.println(ITEM_ID[i]+"\t\t"+ITEM_NAME[i]+"\t\t"+ITEM_TYPE[i]+"\t\t"+ITEM_QUANTITY[i]
										+ "\t\t"+ITEM_PRICE[i]);
							}
							
						}
						
						break;
				  default:
					  System.out.println("INVALID INPUT");
					  
				}
			  }
			while(load_page == true);
		
	}
	public static void main(String[] args)
	{
		MAIN_ACTION(); // THE METHOD
	}
}
