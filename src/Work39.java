import java.util.Scanner;

public class Work39 {

	public static void main(String[] args) {
	
		System.out.println("请输入一个数");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.close();
		if(n%2==0){System.out.println("你输的是一个偶数，结果为"+isOushu(n));}
		else {
			System.out.println("你输的是一个奇数，结果为"+isJishu(n));
		}
		

	}
	public static double isOushu (int n) {
		double sum=0;
		for (int i = 2; i <= n; i=i+2) {
			sum=sum+1.0/i;//注意，这里要写1.0
			
		}
		return sum;
		
		
	}
	public static double isJishu (int n) {
		double sum=0;
		for (int i = 1; i <= n; i=i+2) {
			sum=sum+1.0/i;//注意，这里要写1.0
			
		}
		return sum;
		
		
	}

}
/*请输入一个数
7
你输的是一个奇数，结果为1.676190476190476*/

