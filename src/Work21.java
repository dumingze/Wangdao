
public class Work21 {

	public static void main(String[] args) {
		long sum = 1;
		
		for (int i = 2; i <=20; i++) {
			long e=1;//e的意思是当前数字的阶乘
			for (int j=i;j>=1; j--) {
			e=e*j;
			}
			sum=sum+e;
		}
		System.out.println(sum);

	}
}
/*2561327494111820313*/

