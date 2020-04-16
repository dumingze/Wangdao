
public class One {

	public static void main(String[] args) {
	    int[] arr = new int[20];
	    arr[0] = 1; // 第一个月兔子的数量，1对
	    arr[1] = 1; // 第二个月兔子的数量，1对
	    int sum = 2; // 用于记录兔子总数量，现在初始化为前两个月兔子的总数，2对
	    for (int i = 2; i < arr.length; i++) {
	        arr[i] = arr[i - 2] + arr[i - 1];
	        System.out.println("第" + (i + 1) + "个月兔子对数为：" + arr[i]);
	        sum += arr[i];
	    }
	    System.out.println("兔子总对数：" + sum);
	}
}
