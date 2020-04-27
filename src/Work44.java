
import java.util.Scanner;

public class Work44 {

	public static void main(String[] args) {
		System.out.println("请输入一个偶数");
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		scanner.close();
		for (int i = 2; i < x; i++) {
			if (isPrime(i)) {
				if (isPrime(x-i)) {
					System.out.print(i);
					System.out.print("和");
					System.out.print(x-i);
					System.out.println();
				}
				
			}

		}

	}

	public static boolean isPrime(int x) {
		int j = 2;
		for (; j <= Math.sqrt(x); j++) {
			if (x % j == 0) {
				return false;
			}
		}
		return true;
	}
}

/*请输入一个偶数
8
3和5
5和3
7和1
*/