package learnprograms;

public class LearnPrime {

	public static void main(String[] args) {
		int a = 70;
		for (int i = 2; i <= a; i++) {
			int flag = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag++;
					break;
				}
			}
			if (flag == 1) {
				System.out.println("The Prime Numbers are:" + i);
			}
		}
	}
}
