package learnprograms;

public class Polindrome {

	public static void main(String[] args) {
		int a = 121, sum = 0, tmp = a, s;
		while (a > 0) {
			s = a % 10;
			sum = sum * 10 + s;
			a = a / 10;
		}
		if (tmp == sum) {
			System.out.println("Polindrome");
		} else {
			System.out.println("Not Polindrome");
		}
	}
}
