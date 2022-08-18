package Question1.view;

import Question1.model.Costumer;
import Question1.service.CostumerService;

public class CostumerView {
	public static void main(String[] args) {
		//Costumer costumer1 = new Costumer(3, "Harshal", 34); //For calling paramiterize constructor
		
		Costumer costumer1=new Costumer(); // for calling empty constructor
		costumer1.setCostumerage(56);
		
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
