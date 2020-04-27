import java.util.Scanner;

public class Work38 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		scanner.close();
		System.out.println("您输入的字符串为"+string);
		int length=length(string);
		System.out.println("长度为"+length);
		

	}
	public static int length(String s) {
		char[]ch=s.toCharArray();
		return ch.length;
		
	}

}
/*dmz1234
您输入的字符串为dmz1234
长度为7*/

