
public class Work13 {

	public static void main(String[] args) {
		int n = 0;
		for (int i = 0; i <= 100000; i++) // 先确定一个在100000内的大概范围
		{
			if (isCompSqrt(i + 100) && isCompSqrt(i + 168)) {
				n = i;
				break;
			}
		}
		System.out.println("所求的数是:" + n);
	
	}

	public static boolean isCompSqrt(int x) {
		boolean flag = false;
		double fsqrt = Math.sqrt(x); // 先将数开平方
		int q = (int) fsqrt; // 转换成整数，另q为开平方且转换为整数的结果。
		if (x == Math.pow(q, 2)) // pow(x,y) 就是计算 x 的 y 次幂。
		{
			flag = true;
		}
		return flag;
	}

}
/*所求的数是:156*/