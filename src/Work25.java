import java.util.Scanner;

public class Work25 {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个数字，判断是否回文");
		n=scanner.nextInt();
		isHunwen(n);
		scanner.close();
		
	}
	public static void isHunwen(int n) {
		int count=0;//用count来标记判断到哪一位了
		String string=String.valueOf(n);//先变成字符串
		char[] a=string.toCharArray();//再从字符串变为字符数组
		for (int i = 0; i < (a.length)/2; i++) {
			if (a[i]!=a[a.length-1-i]) {
				System.out.println("不是回文数字");
				break;
			}
			else {
				count++;
			}	
		}
		if (count==(a.length/2)) {
			System.out.println("是回文字符串");
			
		}	
	}	
}
/*请输入一个数字，判断是否回文
1234321
是回文字符串*/

