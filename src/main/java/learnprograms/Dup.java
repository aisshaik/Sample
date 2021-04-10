package learnprograms;

public class Dup {
	public static void main(String[] args) {
		int[] a = { 1, 1, 3, 6, 4, 3, 4, 5, 6, 7, 4, 4, 2, 3, 5 };
		int len = a.length;
		for (int i = 0; i < len; i++) {
			int dup = 1;
			for (int j = i + 1; j < len; j++) {
				if (a[i] == a[j]) {
					dup++;
					for (int k = j + 1; k < len; k++) {
						a[j] = a[k];
					}
					len--;
					j--;
				}
				
			}
			System.out.println("Repeated Numbers are: " + a[i] + " for " + dup);
		}
	}
}
