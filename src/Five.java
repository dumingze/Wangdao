import java.util.Scanner;

public class Five {
	
	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("请输入你的成绩：");
	        int fenshu = sc.nextInt();
	        Five.grade(fenshu);
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
