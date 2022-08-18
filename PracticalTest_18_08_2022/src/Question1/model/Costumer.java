package Question1.model;

public class Costumer {
	private int costumerId;
	private String costumerName;
	private int costumerage;
	
	public Costumer(){
		
	}

	public Costumer(int costumerId, String costumerName, int costumerage) {
		super();
		this.costumerId = costumerId;
		this.costumerName = costumerName;
		this.costumerage = costumerage;
	}

	public int getCostumerId() {
		return costumerId;
	}

	public void setCostumerId(int costumerId) {
		this.costumerId = costumerId;
	}

	public String getCostumerName() {
		return costumerName;
	}

	public void setCostumerName(String costumerName) {
		this.costumerName = costumerName;
	}

	public int getCostumerage() {
		return costumerage;
	}

	public void setCostumerage(int costumerage) {
		this.costumerage = costumerage;
	}

}
