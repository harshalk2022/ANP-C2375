package model;

import java.util.Scanner;

public class Array {
	
	public int getSecondSmallest(int array[]) {
		int temp;
		
		for(int i=0; i<array.length; i++) {
			
			for(int j=i+1; j<array.length; j++) {
				
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
			
		}
		return array[1];
	}
	
	public static void main(String [] args) {
		int [] marks = new int [5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter five array element :");
		for(int i=0; i<marks.length; i++) {
			marks[i]= sc.nextInt();
		}
		
		Array num = new Array();
		System.out.println("Second Smallest number of array is : "+num.getSecondSmallest(marks));	
	}
}
