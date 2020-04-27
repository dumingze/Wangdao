import java.util.Scanner;

public class Work6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int n = sc.nextInt();
		System.out.println("请输入第二个数");
		int m = sc.nextInt();
		sc.close();
		max_min(n, m);
	}

	// 求最大公约数和最小公倍数
	private static void max_min(int m, int n) {
		int temp = 1;
		int gys = 1;
		int gbs = m * n;
		if (n < m) {
			temp = n;
			n = m;
			m = temp;
		}
		while (m != 0) {
			temp = n % m;
			n = m;
			m = temp;
		}
		gys = n;
		gbs /= n;
		System.out.println("最大公约数为" + gys);
		System.out.println("最小公倍数为" + gbs);

	}
}
/*请输入第一个数
25
请输入第二个数
10
最大公约数为5
最小公倍数为50*/

