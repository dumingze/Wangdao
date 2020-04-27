import java.util.Scanner;

public class Work35 {

	public static void main(String[] args) {
		int n;
		int min;
		int max;
		Scanner scanner = new Scanner(System.in);
		System.out.println("您要输入几个数");
		n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("请输入一个数");
			a[i] = scanner.nextInt();
		}
		scanner.close();
//这里把输入的数组打印一下
		System.out.println("你输入的数组为");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);

		}
		System.out.println();
		max=a[0];
		min=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]>max){max=a[i];};
			if(a[i]<min){min=a[i];};
			
		}
		a[a.length-1]=max;
		a[0]=min;
//这里把输出的数组打印一下
		System.out.println("交换次序之后的数组为");
				for (int i = 0; i < a.length; i++) {
					System.out.print(a[i]);

				}
	}

}
/*您要输入几个数
5
请输入一个数
1
请输入一个数
5
请输入一个数
3
请输入一个数
2
请输入一个数
9
你输入的数组为
15329
交换次序之后的数组为
15329*/
