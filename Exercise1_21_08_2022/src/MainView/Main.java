package MainView;

import java.util.Scanner;

import Exercise1.service.Addition;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		Addition obj = new Addition();
		System.out.println("Sum is : "+obj.calculateSum(num));
	}

}
