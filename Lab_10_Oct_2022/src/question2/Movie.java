package question2;

import java.time.LocalTime;
import java.util.Scanner;

public class Movie {
	static Scanner sc = new Scanner(System.in);
	public static void addMovie() {
		System.out.println("Enter Movie Dtails :");
		System.out.print("Name : ");
		String name = sc.next();
		sc.nextLine();
		
		System.out.print("Movie Start Time : ");
		String startTime = sc.nextLine();
		
		System.out.print("Movie End Time : ");
		String endTime = sc.nextLine();
		
		System.out.print("Movie Ticket Price : ");
		float price = sc.nextFloat();
		
		MovieTheatre movie = new MovieTheatre(name, LocalTime.parse(startTime),LocalTime.parse(endTime), price);
		displayMovie(movie);
	}
	
	public static void displayMovie(MovieTheatre movie) {
		System.out.println(movie);
	}
	
	//  main method
	public static void main(String[] args) {
		
		do {
			System.out.println("1. Add Movie \n2. Exit");
			System.out.print("Enter your choice :");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				addMovie();
				break;
			case 2: 
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}while(true);
		
	}
}
