package question2.org.service;

public class SBI extends RBI {
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return 0;
	}

	@Override
	public double getWithdrawLimit() {
		return 0;
	}
}
