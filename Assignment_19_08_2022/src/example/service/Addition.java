package example.service;

public class Addition {
	
	public int add (int a) {
		a++;
		return a;
	}
		
	public double add(int a, double b) {
		Double result = a + b ;
		return result;
	}
	
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
}
