
public class Work40 {

	public static void main(String[] args) {

		String[] str = { "a", "ad", "m", "ma", "na" };
		
//使用下冒泡排序，将最小的存在最后一个数
//使用compareTo（）函数
/*		分析：字符串用ASCII码比较大小，规则是：
		1、比较首字母的ASCII码大小
		2、若是前面的字母相同，则比较之后的字母的ASCII码值
		3、若是一个字符串从首字母开始包含另一个字符串，则认为字符串长度较长的大；例 ：ab > a
		备注：Java中String类有一个compareTo方法，该方法返回一个int类型的数据。其比较规则是：拿出字符串的第一个字符与参数的第一个字符进行比较，如果两者不等，比较结束，返回两者的ascii差，即字符串的第一个字符减去参数的第一个字符的ascii码值.如果相等，则比较第二个字符，以此类推。比较到最后还是相等的，方法返回值为0。
		比如下面的代码：“abc”.compareTo(“cad”)==-2
		这里有一点需要注意：如果两个字符串的长度不同，并且一个字符串与另一个字符串的前面N个字符相等，那么这个方法返回返回两个字符串长度之差。
		比如下面的代码：“fa”.compareTo(“f”)==1*/
	
	for (int i = 0; i < str.length-1; i++) {
		for(int j=0;j<str.length-1-i;j++){
			if(str[j+1].compareTo(str[j])>0){//第二个比第一个大
				String string=str[j+1];
				str[j+1]=str[j];
				str[j]=string;
			}
		}
		
	}
	for (int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
	}
	}

}

/*
na
ma
m
ad
a
*/

