package Exercise1.service;

public class Addition {
	
	public int calculateSum(int n) {
		
		int sum = 0;
		System.out.print("Numbers which is divisible by 3 and 5 are : ");
		
		for(int i=1; i <= n; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+ " ");
				sum = sum + i;
			}
		}
		System.out.println();
		return sum;
	}

}
