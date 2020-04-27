import java.util.Scanner;

public class Work46 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入第一个字符串");
		String string1=scanner.nextLine();
		System.out.println("请输入第二个字符串");
		String string2=scanner.nextLine();
		scanner.close();
		String string3=string1+string2;
		System.out.println(string3);
		

	}

}
/*请输入第一个字符串
dm
请输入第二个字符串
z
dmz
*/