
public class Work27 {
	public static void main(String[] args) {
		for (int n = 2; n <= 100; n++) {
			if (isPrime(n)) {
				System.out.print(n + " ");
			}
		}

	}

	public static boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}
}
/*2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 */
