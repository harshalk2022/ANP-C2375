package question1;

public class Customer {
	private int accountNumber;
	private String accountName;
	private double accountBalance;

	
	// Creating  Account 
	public void createAccount(int accNumber,String accName,double accBalance) {
		this.accountBalance=accBalance;
		this.accountName=accName;
		this.accountNumber=accNumber;
		System.out.println("Customer Created.");
	}
	
	
	// Set Amount 
	public void setAmount(int amount) {
		this.accountBalance += amount;
		System.out.println("Amount Added Succecfully.");
	}
	
	
	// WithDraw Amount
	public void withDrawnAmount(int withDrawnMoney) {
		this.accountBalance -= withDrawnMoney ;
		System.out.println("Amount Withdraw Succecfully.");
	
		
	}
	
	// Get Amount 
	public void getAmount() {
		System.out.println("Hello "+accountName+" your account balance is  "+accountBalance);
	}

}
