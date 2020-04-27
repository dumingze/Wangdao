import java.util.Scanner;

public class Work47 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
	
		int[]a=new int[7];
		System.out.println("请输入1-50的7个数字");
		for (int i = 0; i < a.length; i++) {
		System.out.println("请输入第"+(i+1)+"个数字");
			a[i]=scanner.nextInt();
			for (int j = 0; j < a[i]; j++) {
				System.out.print("*");	
			}
			System.out.println();	
		}
		scanner.close();

	}

}
/*请输入1-50的7个数字
请输入第1个数字
3
***
请输入第2个数字
4
****
请输入第3个数字
5
*****
请输入第4个数字
6
******
请输入第5个数字
7
*******
请输入第6个数字
8
********
请输入第7个数字
5
*****
*/

