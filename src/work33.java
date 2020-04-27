
public class work33 {
	public static void main(String[] args) {
		int rows = 10;
 
		for (int i = 0; i < rows; i++) {
			int number = 1;
			// 打印空格字符串
			System.out.format("%" + (rows - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.format("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
/*1
1   1
1   2   1
1   3   3   1
1   4   6   4   1
1   5  10  10   5   1
1   6  15  20  15   6   1
1   7  21  35  35  21   7   1
1   8  28  56  70  56  28   8   1
1   9  36  84 126 126  84  36   9   1*/
