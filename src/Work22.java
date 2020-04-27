
public class Work22 {
	
	public static void main(String[] args) {
		System.out.println(fn(5));
		
	}
	//运用递归解决问题，注意此处返回值的使用
	private static int fn( int x) {
	
		if(x==1||x==0){
			return 1;//return1之后，结束函数的递归调用
		}
		return x*fn(x-1);
	
	}
}
/*120*/
