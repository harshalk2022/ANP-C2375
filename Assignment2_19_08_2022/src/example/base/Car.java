package example.base;

public class Car {
	private String colour;
	private String body;
	
	public Car() {
		this.colour = "blue";
		this.body = "wagon";
	}
	
	public Car(String colour, String body) {
		this.colour = colour;
		this.body = body;
	}
	
	public String playRadio() {
		return "Radio is played.";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}
