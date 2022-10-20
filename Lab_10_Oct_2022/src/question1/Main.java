package question1;

public class Main {
	public static void main(String[] args) {
				
			Customer customer1 = new Customer();
			Customer customer2 = new Customer();

			
			customer1.createAccount(458494, "Harshal", 2500);
			customer1.getAmount();
			customer1.setAmount(300);
			customer1.getAmount();
			customer1.withDrawnAmount(700);
			customer1.getAmount();
			
			
			customer2.createAccount(458712, "Samir", 2500);
			customer2.getAmount();
			customer2.setAmount(200);
			customer2.getAmount();
			customer2.withDrawnAmount(900);
			customer2.getAmount();	
		
	}
}

