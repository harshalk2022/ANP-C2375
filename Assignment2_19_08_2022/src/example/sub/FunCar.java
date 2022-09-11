package example.sub;

import example.base.Car;

public class FunCar extends Car {
	
	public FunCar() {
		super();
	}
	
	public FunCar(String colour, String body) {
		super(colour, body);
	}
	
	public String playCD() {
		return "Beautiful music is played.";
	}
	
}
