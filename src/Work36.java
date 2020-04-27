import java.util.Scanner;

public class Work36 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("您要输入几个数");
		n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("请输入一个数");
			a[i] = scanner.nextInt();
		}

		// 这里把输入的数组打印一下
		System.out.println("你输入的数组为");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);

		}
		System.out.println();
		System.out.println("输入移动的位数");
		int m = scanner.nextInt();
		scanner.close();
	/*	int[] c = move(a, m);*/
		a=move(a, m);
		

		// 这里把输入的数组打印一下
		System.out.println("你的输出的数组为");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);

		}

	}

	public static int[] move(int[] a, int m) {
		// 这里，使用在看数据结构的时候，实现循环队列的里面的一点关于绝对值的思想，这里绝对值是数组的长度
		int length = a.length;
		int[] b = new int[length];// 使用数组b来保存修改过后的数组
		for (int i = 0; i < length; i++) {
			b[i] = a[((i - m-1) + length )% length];

		}
		return b;

	}
}
/*您要输入几个数
5
请输入一个数
1
请输入一个数
2
请输入一个数
3
请输入一个数
4
请输入一个数
5
你输入的数组为
12345
输入移动的位数
2
你的输出的数组为
34512*/
