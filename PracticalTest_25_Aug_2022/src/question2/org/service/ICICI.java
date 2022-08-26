package question2.org.service;

public class ICICI extends RBI{
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return interestRate;
	}

	@Override
	public double getWithdrawLimit() {
		// TODO Auto-generated method stub
		return maximumWithdraw;
	}

}
