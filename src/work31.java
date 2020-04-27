
public class work31 {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 7, 6, 2, 3, 6, 8 };
		arrayReverse(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	public static void arrayReverse(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length / 2; i++) {// 执行数组长度一半的次数
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
	}

}
/*8632671*/
