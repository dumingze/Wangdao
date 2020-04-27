
public class Work20 {

	public static void main(String[] args) {
		double x = 2;
		double y = 1;
		double z = x / y;
		double Sn = 0;
		for (int i = 0; i < 20; i++) {
			double t1 = x;
			double t2 = y;
			x = t1 + t2;// 下一个分数的分子等于上一个分数的分子和分母之和
			y = t1;// 下一个分数的分母等于上一个分数的分子
			z = x / y;// 下一个分数
			Sn += z;
		}
		System.out.print(Sn);
	}

}
/*32.278294788817234*/