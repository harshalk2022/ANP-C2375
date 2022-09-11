package Exercise2;

public class CalculateTheDiff {
	int sumOfsq = 0;
	int sqOfSum = 0;
	
	public int calculatedifference(int n) {
		
		for(int i=1; i<=n; i++) {
			sqOfSum = sqOfSum + i;
			int sq = i*i;
			sumOfsq = sumOfsq + sq;
		}
		
		int difference = sqOfSum*sqOfSum - sumOfsq;
		return difference;
	}
}
