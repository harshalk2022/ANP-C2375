package org.Assignment;
import java.util.Scanner;

public class Demo {
	
	void start() {
		System.out.println("Start");	
	}
	
	void displayInstruction() {
		System.out.println("DisplayInstruction");
	}
	
	void exit() {
		System.out.println("exit");
	}
	
	public static void main(String[] args) {
		
		System.out.print("Type number : ");
		Scanner sc = new Scanner(System.in);
		int mainInput = sc.nextInt();
		
		Demo d1 = new Demo();
		
		switch(mainInput) {
		
		case 1:
				d1.start();
				break;
			
		case 2:
				d1.displayInstruction();
				break;
			
		case 3:
				d1.exit();
				break;
		
		default :
				System.out.println("Invalid Number");
		}
	}
}
