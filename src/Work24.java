import java.util.Random;

public class Work24 {
	public static void main(String[] args) {
		/*
		 * 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。 和 String
		 * 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
		 * StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder
		 * 的方法不是线程安全的（不能同步访问）。
		 */
		// 产生[1,99999]之间的一个正整数n
		Random random = new Random();
		int n = random.nextInt(99999) + 1;// random生成的随机数包头不包尾，所以此处写99999只能产生[0,99999)之间的数，要使得生成[1,99999]的数需要加1
		System.out.println("产生的随机数是：" + n);
		String s = String.valueOf(n);// 将产生的随机数转换成字符串
		System.out.println("产生的随机数是：" + s.length() + "位数");
		StringBuffer buffer = new StringBuffer(s);
		System.out.println("逆序打印出来是：" + buffer.reverse());
	}
}
/*产生的随机数是：63192
产生的随机数是：5位数
逆序打印出来是：29136*/

