import java.util.Scanner;

public class Eight {
 
	public static void main(String[] args) {
		System.out.println("求s=a+aa+aaa+aaaa+...的值，请输入a的值：");
		Scanner sc1=new Scanner(System.in);
		int a=sc1.nextInt();
	
		System.out.println("你想要几个数相加，请输入一个整数：");
		Scanner sc2=new Scanner(System.in);
		int n=sc1.nextInt();
		System.out.println(add(a, n));//直接在输出函数中输出
	
	}
	private static int add(int a,int n) {
		int evesum=0;//每一项的值
		int sum=0;//总的式子的值
		
		for(int i=1;i<=n;i++){
			
			evesum=evesum*10+a;
			sum=sum+evesum;
		}
		return sum;
		
	}
}
