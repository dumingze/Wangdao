import java.util.Scanner;

public class work29 {
	public static void main(String[] args) {
		int[][]a=new int[3][3];
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		System.out.println("输入9个数字");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j]=scanner.nextInt();
			}
			
		}
		int count=1;
		System.out.println("你输入的二维数组为");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
				if (count%3==0) {
					System.out.println();
					
				}
				count++;
			}
			
		}
		for (int i = 0; i < 3; i++) {
			sum=sum+a[i][i];
		}
		System.out.println("对角线相加为");
		System.out.println(sum);
		scanner.close();
		
	}

}
/*输入9个数字
1
2
3
4
5
6
7
8
9
你输入的二维数组为
1 2 3 
4 5 6 
7 8 9 
对角线相加为
15*/
