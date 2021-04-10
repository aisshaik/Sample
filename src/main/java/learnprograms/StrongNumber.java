package learnprograms;

public class StrongNumber {

	public static void main(String[] args) {
		int num = 145, sum = 0, tmp = num, s;
		while (num > 0) {
			int fact = 1;
			s = num % 10;
			for (int i = s; i >= 1; i--) {
				fact = fact * i;
			}
			sum = sum + fact;
			num = num / 10;
		}
		if (tmp == sum) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not Strong Number");
		}
	}
}