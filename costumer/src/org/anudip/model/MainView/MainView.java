package org.anudip.model.MainView;
import org.anudip.model.*;

public class MainView {

	public static void main(String[] args) {
		Costumer obj=new Costumer();
		Costumer obj1=new Costumer(4,"Samir");
		
		MainView obj3=new MainView();
		
		System.out.println("costumer id = "+obj.getCostumerId());
		
		int a=obj3.getCostumerIdFromCostumer(obj1);
		
		System.out.println("costumerId = "+a);
		
		String CostumerName=obj3.getCostumerNameFromCostumer(obj1);
		System.out.println("costumerName = "+CostumerName);
	}
	
	int getCostumerIdFromCostumer(Costumer costumer1) {
		return costumer1.getCostumerId();
	}
	
	String getCostumerNameFromCostumer(Costumer costumer2) {
		return costumer2.getCostumerName();
	}

}
