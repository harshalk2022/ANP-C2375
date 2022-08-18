package Question1.service;
import Question1.model.Costumer;

public class CostumerService {
	
	public boolean checkEligiblity(Costumer obj) {
		boolean result = false;
		
		if (obj.getCostumerage()>=18) {
			result = true;
		}
		return result;
	}

}
