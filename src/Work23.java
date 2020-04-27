
public class Work23 {

    public static void main(String[] args) {
        System.out.println(age(5));
    }
    //递归求年龄
    public static int age(int i) {
        if(i==1) {
            return 10;//此处，return之后，结束函数的递归使用
        }
        return age(i-1)+2;
    }
}

/*18*/
