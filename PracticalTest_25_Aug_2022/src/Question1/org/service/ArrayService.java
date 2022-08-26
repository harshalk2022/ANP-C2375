package Question1.org.service;

public class ArrayService {
	public double calculateAvg(int array[]) {
		int sum= 0;
		int i;
		//for(i=1; i<=5; i++);
		for(int element : array){
			sum = sum + element;
		}
		System.out.println("sum : "+sum);
		double avg = sum/5;
		return avg;
	}
}
