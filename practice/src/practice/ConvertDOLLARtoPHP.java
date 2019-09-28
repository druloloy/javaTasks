package practice;

import java.util.Scanner;

public class ConvertDOLLARtoPHP {
	static Scanner sc = new Scanner(System.in);
	static double inputDollar,pesoCurrentValue = 52.00;
	public static void main(String[] args) {
		System.out.print("Input Dollar to Convert: ");
		inputDollar = sc.nextDouble();
		
		System.out.println("Dollar to Peso: "+inputDollar*pesoCurrentValue);
	}

}
