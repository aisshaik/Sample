package learnprograms;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0, b = 1, count = 10, sum;
		System.out.print(a + " " + b);
		for (int i = 3; i <= count; i++) {
			sum = a + b;
			System.out.print(" "+sum);
			a = b;
			b = sum;
		}
	}
}
