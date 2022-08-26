package question2.org.service;

public abstract class RBI {
	private Account accout;
	private Costumer costumer;
	
	double interestRate;
	static final double minimumInterestRate = 4;
	static final int minimumBalanced = 3000;
	static final double maximumWithdraw = 50000;
	
	public abstract double getInterestRate();
	public abstract double getWithdrawLimit();
}
