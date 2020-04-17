import java.util.Scanner;

public class Fourteen {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = scan2.nextInt();
		Scanner scan3 = new Scanner(System.in);
		System.out.println("请输入几号：");
		int date = scan3.nextInt();
		System.out.println(year + "年" + month + "月" + date + "日" + "是这一年的第" + dijitian(year, month, date) + "天");
	}

	private static int dijitian(int year, int month, int date) {

		int n = 0;
		int[] month_date = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
		if ((year % 400) == 0 || ((year % 4) == 0) && ((year % 100) != 0))// 判断闰年的条件
			month_date[2] = 29;
		for (int i = 0; i < month; i++)
			n += month_date[i];
		n = n + date;
		return n;
	}
}
