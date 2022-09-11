package Exercise4.service;

public class PowerOfTwo {
	
		public boolean checkNumber(int num) {
			if (num == 0) {
				return false;
			}
			
			while (num != 1) {
				if (num % 2 != 0) {
					return false;
				}
				num = num / 2;
			}
			
			return true;
	}

}
