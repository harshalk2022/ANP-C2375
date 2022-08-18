package Question3.model;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		Scanner swap = new Scanner(System.in);
	
		System.out.print("A : ");
		int a = swap.nextInt();
		
		System.out.print("B : ");
		int b = swap.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swaping : ");
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}

}
