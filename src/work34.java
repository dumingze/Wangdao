import java.util.Scanner;

public class work34 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("您要几个数进行排序");
		n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("请输入一个数");
			a[i] = scanner.nextInt();
		}
		scanner.close();

// 这里的话使用一下冒泡排序吧
		Bubblesort(a);
		System.out.println("排序结果为");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);

		}
	}

	public static void Bubblesort(int a[]) {
		int i, j;
		for (i = 0; i < a.length - 1; i++) {// 执行n-1次循环
			for (j = 0; j < a.length - 1 - i; j++) {// 最后一个是最大的
				if (a[j] > a[j + 1]) {
					int x = a[j];
					a[j] = a[j + 1];
					a[j + 1] = x;
				}
			}
		}

	}
}
/*您要几个数进行排序
5
请输入一个数
3
请输入一个数
2
请输入一个数
4
请输入一个数
8
请输入一个数
7
排序结果为
23478*/
