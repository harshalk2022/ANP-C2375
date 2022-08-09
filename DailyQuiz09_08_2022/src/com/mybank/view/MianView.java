package com.mybank.view;

import com.mybank.service.LoanAccountService;

public class MianView {
	
	public static void main(String[] args){
		LoanAccountService loanAccountService=new LoanAccountService();
		
		float interestAmount=loanAccountService.CalculateInterest(1, 1200, 5, 4);
		
		System.out.println("Interest Amount = "+interestAmount);
	}
	
}
