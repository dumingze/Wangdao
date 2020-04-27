import java.util.Scanner;

public class Work7 {
//没有使用while循环
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一行字符串：");
		String str = input.nextLine();
		input.close();
		account(str);
	}

	public static void account(String str) {
		int acc1 = 0; // 统计英文字母个数
		int acc2 = 0; // 统计空格个数
		int acc3 = 0; // 统计数字个数
		int acc4 = 0; // 统计其他字符个数

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				acc1 += 1;
			else if (Character.isDigit(str.charAt(i)))
				acc3 += 1;
			else if (Character.isSpaceChar(str.charAt(i)))
				acc2 += 1;
			else
				acc4 += 1;
		}
		System.out.println("英文字母有" + acc1 + "个");
		System.out.println("数字有" + acc3 + "个");
		System.out.println("空格母有" + acc2 + "个");
		System.out.println("其他字符有" + acc4 + "个");
	}

}
/*输入一行字符串：
wang dao . ,
英文字母有7个
数字有0个
空格母有3个
其他字符有2个*/
