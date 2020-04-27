import java.util.Scanner;

public class Work49 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个字符串");
		String string1 = scanner.nextLine();
		System.out.println("请输入子字符串");
		String string2 = scanner.nextLine();

		countString(string1, string2);
		scanner.close();
	}

	public static void countString(String str, String s) {
		int count = 0;
		// public int indexOf(int ch): 返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回
		// -1
		while (str.indexOf(s) != -1) {
			// public String substring(int beginIndex, int endIndex)
			// beginIndex -- 起始索引（包括）, 索引从 0 开始。 endIndex -- 结束索引（不包括）,相当于截取字符串。
			str = str.substring(str.indexOf(s) + 1, str.length());
			count++;
		}
		System.out.println("此字符串有" + count + "个" + s);
	}

}
/*请输入第一个字符串
abcabc
请输入子字符串
abc
此字符串有2个abc*/

