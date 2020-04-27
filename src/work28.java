
public class work28 {
	public static void main(String[] args) {
// 选择排序问题
		int[] numbers = new int[] { 1, 7, 6, 2, 3, 6, 8 };
		sort(numbers);
		System.out.println("从小到大排序后的结果是:");
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
	}

	private static void sort(int[] numbers) {
		int i, j;
		for (i = 0; i < numbers.length - 1; i++) {
			for (j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}	
			}
		
			
		}
	}
}
/*从小到大排序后的结果是:
1 2 3 6 6 7 8 */
