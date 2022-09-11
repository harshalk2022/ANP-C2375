package example.view;

import example.sub.FunCar;

public class main {
	
	public static void main(String[] args) {
		FunCar object = new FunCar();
		System.out.println(object.playRadio());
		System.out.println(object.playCD());
	}	
}