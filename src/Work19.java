
public class Work19 {
	public static void main(String[] args) {
		int size =4;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");//输出下一列
		}
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * (size - i - 2) + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}
}
/**
***
*****
*******
*****
***
**/
