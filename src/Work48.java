import java.util.Scanner;

public class Work48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[]a=new int[4];
		System.out.println("请输入4个数字");
		for (int i = 0; i < a.length; i++) {
		System.out.println("请输入第"+(i+1)+"个数字");
			a[i]=scanner.nextInt();
		}
		scanner.close();
		System.out.println("你输入的数组为");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);	
		}
		System.out.println();
		System.out.println("加密过后的数组为");
		
		a=jiami(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
	public static int[] jiami(int[] a) {
		int[]b=new int[4];
		for (int i = 0; i < 4; i++) {
			b[i]=(a[i]+5)%10;
			
		}
		for (int i = 0; i < (b.length)/2; i++) {
			int x=b[i];
			b[i]=b[b.length-i-1];
			b[b.length-i-1]=x;
		}
		
		return b;
		
	}

}
/*请输入4个数字
请输入第1个数字
1
请输入第2个数字
2
请输入第3个数字
3
请输入第4个数字
4
你输入的数组为
1234
加密过后的数组为
9876*/
