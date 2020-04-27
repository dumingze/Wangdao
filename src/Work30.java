import java.util.Arrays;
import java.util.Scanner;

public class Work30 {

	public static void main(String[] args) {
	//直接利用Array.sort(),底层使用快排实现的
		
		        int[] array = {0,1,2,3,5,7,9};//定义一个升序数组
		        System.out.println("定义的数组为：");
		        for(int j=0;j<array.length;j++) {//遍历定义好的数组
		            System.out.print(array[j]+" ");
		        }
		        //获取用户输入的数
		        Scanner input=new Scanner(System.in);
		        System.out.println();//换行
		        System.out.println("请输入一个整数：");
		        int n=input.nextInt();
		        input.close();
		        //默认将添加的元素加到数组末尾，原始数组扩容1
		        array=Arrays.copyOf(array, array.length+1);
		        array[array.length-1]=n;
		        //当定义的数组为升序数组时
		        if(array[0]<=array[array.length-2]) {
		            System.out.println("插入一个数之后的数组为：");
		            Arrays.sort(array);//重新排序
		            for(int k=0;k<array.length;k++) {//遍历新数组
		                System.out.print(array[k]+" ");
		            }
		        }
		      
		    }
	

}
/*定义的数组为：
0 1 2 3 5 7 9 
请输入一个整数：
8
插入一个数之后的数组为：
0 1 2 3 5 7 8 9 */
