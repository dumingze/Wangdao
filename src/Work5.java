import java.util.Scanner;

public class Work5 {
	
	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("请输入你的成绩：");
	        int fenshu = sc.nextInt();
	        sc.close();
	        Work5.grade(fenshu);
	    }
	  private static void grade(int n)
	   {
	       if(n>100||n<0)
	       {
	           System.out.println("输入无效");
	       }else {
	           String str = (n>=90)?"分，属于A等":((n>60)?"分，属于B等":"分，属于C等");
	           System.out.println(n+str);
	       }
	   }
}
/*请输入你的成绩：
80
80分，属于B等*/
