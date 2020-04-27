
public class Work43 {

	public static void main(String[] args) {

		//本题计数的为满足条件且无重复数字的奇数个数
		//本题的时间复杂度为n的3次方，太高了
		// 0-7能组成的所有不重复的数的最大值是76543210
		// 0-76543210中所有的奇数个数为76543210/2
		String[] s = new String[76543210 / 2];// 定义一个字符串数组存储0-7能组成的所有奇数
		int n = 0;// 定义一个变量为满足条件的奇数计数
		int count = 0;
		// 将所有奇数转换成字符串存入字符串数组s中
		for (int i = 1; i <= 76543210; i++) {
			if ((i + 1) % 2 == 0) {
				s[n] = String.valueOf(i);
				n++;
			}
		}
		// 将所有的字符串数组中的元素取出分别存入一个字符数组c中
		for (int j = 0; j < n; j++) {
			char[] c = s[j].toCharArray();
//break跳出一层循环，所以需要outer限定break的跳出范围，但是，这个算法的时间复杂度也太高了吧
			outer: for (int k = 0; k < c.length; k++) {
				for (int m = 1; m < c.length; m++) {
					if (c[k] == c[m]) {// 将字符数组中的每个元素取出，一旦发现重复值退出循环
						break outer;
					}
				}
				count++;// 若该字符数组中不存在重复的元素，则该奇数为满足条件的奇数
			}
		}
		System.out.println("0-7所能组成的不包含重复数字的奇数个数共有：" + count + "个");

	}

}
