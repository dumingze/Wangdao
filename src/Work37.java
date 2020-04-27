import java.util.Scanner;

public class Work37 {

	public static void main(String[] args){
        System.out.println("请输入排成一圈的人数：");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        //定义数组变量标识某人是否还在圈内
        boolean[] isIn=new boolean[n];
        for(int i=0;i<isIn.length;i++) {//给数组赋值都为true
            isIn[i]=true;
        }
        //定义圈内人数、报数和索引
        int inCount=n;//定义圈内人数
        int countNum=0;//定义报数
        int index=0;//标志循环位
        //去掉报数为3的人
        while(inCount>1) {
            if(isIn[index]) {
                countNum++;//开始报数
                if(countNum==3) {//当报数累加到3时
                    countNum=0;//从下一位开始将报数归于0，从1开始重新报数
                    isIn[index]=false;//将此时索引值对应的数改为false
                    inCount--;//圈内一个人改为false后，下次此人便不再进行报数，所以inCount-1
                }
            }
            index++;//索引值+1进行下一次if判断
            if(index==n) {
                index=0;
            }
        }
        //遍历数组中最后还是true的值，表示此人还在留在圈中
        for(int i=0;i<n;i++) {
            if(isIn[i]) {
                System.out.println("最后留下的是原来第"+(i+1)+"号");
            }
        }
	}

}
/*请输入排成一圈的人数：
8
最后留下的是原来第7号*/
