package question4.org.service;

public class Main {
	public static void main(String[] args) {
		Gun gun = new Gun();
		Knife knife = new Knife();
		Sword sword = new Sword();
		
		gun.attack();
		knife.attack();
		sword.attack();
	}
}
