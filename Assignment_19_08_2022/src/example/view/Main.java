package example.view;

import example.service.Addition;

public class Main {
	public static void main(String[] args) {
		
		Addition Harshal = new Addition(); 
		
		System.out.println("Increment of 45 : " +Harshal.add(45));
		
		System.out.println("Addition of 5 and 15.2 : "+Harshal.add(5, 15.2));
		
		System.out.println("Addition of 7 and 13 : "+Harshal.add(7, 13));
	}
}
