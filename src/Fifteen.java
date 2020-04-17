import java.util.Scanner;

public class Fifteen {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		int x = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int y = scan2.nextInt();
		Scanner scan3 = new Scanner(System.in);
		int z = scan3.nextInt();
		System.out.println("最小的数字为" + minNum(x, y, z));

	}

	private static int minNum(int x, int y, int z) {
		int min = x;
		if (min > y) {
			int p;
			p = min;
			min = y;
			y = p;
		}
		if (min > z) {
			int q;
			q = min;
			min = z;
			z = q;
		}
		return min;

	}
}
