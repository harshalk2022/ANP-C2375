package com.mybank.service;

public class LoanAccountService {
	private int loanId;
	private float loanAmount;
	private float rateOfInterest;
	private int timeperiod;
	
	public float CalculateInterest(int loanid, float loanAmount, float rateOfInterest, int timePeriod) {
		float interestAmount=(loanAmount*rateOfInterest*timePeriod)/100;
		return interestAmount;
	}

}
