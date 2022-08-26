package Question1.org.service;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int marks[] = new int[5];
		System.out.println("enter Marks of five subject : ");
		Scanner obj = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			marks[i] = obj.nextInt();		
		}
		
		ArrayService average = new ArrayService();
		System.out.print("Average is : "+average.calculateAvg(marks));
		
	}

}