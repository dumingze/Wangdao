import java.util.Scanner;

public class Work45 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个数");
		int a = scanner.nextInt();
		scanner.close();
		int count = 0;
		for (int n = 1; n <= a / 9; n++)// 最多不会超过a/9个
		{
			if ((a % (9 * n) == 0) && (a != 0)) {
				System.out.println("能被" + n + "*" + 9 + "整除");
				count++;
			}
		}
		System.out.println("可以被" + count + "个9整除");
	}
}
/*
输入一个数
45
能被1*9整除
能被5*9整除
可以被2个9整除*/
