
public class Work41 {

	public static void main(String[] args) {
	int sum=fun(1);
	System.out.println(sum);
	}
	
	 //递归函数
	//fun(1)=fun(2)*5+1 fun(2)=fun(3)*5+1 .........fun(5)=6
    public static int fun(int i) {
        if(i==5) {
            return 6;//轮到第五只猴子分桃时，至少得6个桃
        }else {
            return fun(i+1)*5+1;
        }
    }
}
/*3906*/