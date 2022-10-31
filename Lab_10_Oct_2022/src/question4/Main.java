package question4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the target : ");
		int target = sc.nextInt();
		
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		
		int array[] = new int [size];
		System.out.println("Enter elements of Array :");
		
		// Accepting Array Element
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}							
		
		for(int i=0; i<size; i++) { 
			for(int j=i+1; j<size; j++) {
				if(array[i] + array[j] == target) {
					System.out.print("Indices are : ");
					System.out.println("["+ i + " " + j+"]");
				}
			}
		}
	}

}
