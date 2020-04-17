
public class Eleven {

	public static void main(String[] args) {
		int count = 0;// 总共有count个数字
		int n = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (j == i) {
					continue;
				} // 若i=j,则跳出本次循环
				for (int k = 1; k < 5; k++) {
					if (k != i && k != j) {
						n = i * 100 + j * 10 + k;
						System.out.print(n + " ");
						count++;
					}
				}

			}
		}
		System.out.println();
		System.out.println("符合条件的数共：" + count + "个");

	}

}
