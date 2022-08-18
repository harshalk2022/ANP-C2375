package Question1.view;

import Question1.model.Costumer;
import Question1.service.CostumerService;

public class CostumerView {
	public static void main(String[] args) {
		//Costumer costumer1 = new Costumer(3, "Harshal", 34); 
		
		Costumer costumer1=new Costumer();
		costumer1.setCostumerage(2);
		CostumerService isEligible = new CostumerService();
		boolean criateria = isEligible.checkEligiblity(costumer1);
		
		if(criateria==true) {
			System.out.println("You are Eligible for voting");
		}
		else {
			System.out.println("You are not Eligible for voting");
		}
		
	}

}
