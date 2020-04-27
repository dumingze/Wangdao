import java.util.Scanner;

public class Work12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入当月利润：");
		long profit = scan.nextLong();
		scan.close();
		System.out.println("应发奖金：" + prize(profit));
	}

	// 计算奖金
	private static double prize(double profit) {
		double prize = 0;
		if (profit <= 100000) {// 低于或等于10万元时
			prize = profit * 0.1;
		} else if (profit < 200000) {// 高于10万元，低于20万元时
			prize = (profit - 100000) * 0.075 + 100000 * 0.1;
		} else if (profit < 400000) {// 20万到40万之间时
			prize = (profit - 200000) * 0.05 + 100000 * 0.75 + 100000 * 0.1;
		} else if (profit < 600000) {// 40万到60万之间时
			prize = (profit - 400000) * 0.03 + 200000 * 0.05 + 100000 * 0.75 + 100000 * 0.1;
		} else if (profit < 1000000) {// 60万到100万之间时
			prize = (profit - 600000) * 0.015 + 200000 * 0.03 + 200000 * 0.05 + 100000 * 0.75 + 100000 * 0.1;
		} else {// 高于100万元时
			prize = (prize - 1000000) * 0.01 + 400000 * 0.015 + 200000 * 0.03 + 200000 * 0.05 + 100000 * 0.75
					+ 100000 * 0.1;
		}
		return prize;

	}
}
/*请输入当月利润：
800000
应发奖金：104000.0*/