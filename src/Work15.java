import java.util.Scanner;

public class Work15 {
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		int x = scan1.nextInt();
		int y = scan1.nextInt();
		int z = scan1.nextInt();
		scan1.close();
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
/*1
3
5
最小的数字为1*/

