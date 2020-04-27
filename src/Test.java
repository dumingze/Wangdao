
public class Test {

	public static void main(String[] args) {
//引入一个概念：栈、堆、常量池是独立的概念
		/*1.寄存器：最快的存储区, 由编译器根据需求进行分配,我们在程序中无法控制.
		2. 栈(stack)：存放基本类型的变量数据和对象的引用，但对象本身不存放在栈中，而是存放在堆（new 出来的对象）或者常量池中（字符串常量对象存放在常量池中。）
		3. 堆(heap)：存放所有new出来的对象。
		4. 静态域：存放静态成员（static定义的）
		5. 常量池：存放字符串常量和基本类型常量（public static final）。
		6. 非RAM存储：硬盘等永久存储空间*/
		
		//==比较的是两个对象的地址
		/*
		 * 1."=="
		 * 的作用是判断两个对象的地址是不是相等。即判断两个对象是不是同一个对象。
		 * (基本数据类型==比较的是值，引用数据类型==比较的是内存地址)
		 * 2.equals() : 它的作用也是判断两个对象是否相等。但它一般有两种使用情况：
		 * 3.类没有覆盖equals()方法。则通过equals()比较该类的两个对象时，等价于通过“==”比较这两个对象。
		 * 4.类（特指的是String？）覆盖了equals()方法。一般，我们都覆盖equals()方法来两个对象的内容相等；
		 * 若它们的内容相等，则返回true(即，认为这两个对象相等)。
		 */  
		
//下面这个是String类里面重写的equals（）方法，
//如果地址相同的情况，那就是String s="123",这种，直接在常量池里找，不通过堆。常量池中地址相同返回ture
//地址不相同，没关系，我还能判断内容，若内容相同我也返回ture
//如何地址和内容都不相同，那我没办法啦，返回flase。
/*		public boolean equals(Object anObject) {
	        if (this == anObject) {//注意！==这里就是判断地址是否相同（我写的）
	            return true;
	        }
	        if (anObject instanceof String) {//接着判断是否为string类，下面为字符比较（我写的）
	            String anotherString = (String)anObject;
	            int n = value.length;
	            if (n == anotherString.value.length) {
	                char v1[] = value;
	                char v2[] = anotherString.value;
	                int i = 0;
	                while (n-- != 0) {
	                    if (v1[i] != v2[i])
	                        return false;
	                    i++;
	                }
	                return true;
	            }
	        }
	        return false;
	    }*/

		int[]a=new int[1];
		int[]b=new int[1];
		System.out.println(a==b);//堆中地址不同，flase
		
		int[]a1=new int[]{1};
		int[]b1=new int[]{1};
		System.out.println(a1.equals(b1));/*对于非String类使用equals（）方法，等价于使用"==" flase
		堆中的地址不同*/
		
		
		String str1 = new String("str");
		/*对于通过new产生一个字符串（假设为”str”）时，会先去常量池中查找是否已经有了”china”对象，
		如果没有则在常量池中创建一个此字符串对象，然后堆中再创建一个常量池中此”str”对象的拷贝对象。存的是“str”
		这也就是有道面试题：String s = new String(“xyz”);产生几个对象？一个或两个，如果常量池中原来没有”xyz”,
		就是两个。*/
		String str2 = new String("str");
		System.out.println(str1==str2);//比较堆,都是“str”,但是堆中地址不同，肯定为flase
		System.out.println(str1.equals(str2));//被String重写的equals方法，返回值ture
		
		String string1="red";
		String string2="red";
		System.out.println(string1.equals(string2));//被String重写的equals方法，返回值ture
		System.out.println(string1==string2);/*!!!!!!!!这里，特殊之处在于，
		"red"在常量池中，不通过堆，比较的是常量池中的地址所以相等，返回ture*/
	}


}
