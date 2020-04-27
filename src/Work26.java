import java.util.Scanner;

public class Work26 {
	 public static void main(String[] args) {
	        //判断第一个字母
	        Scanner scannert=new Scanner(System.in);
	        System.out.println("请输入星期的第一个大小字母：");
	        String string1=scannert.nextLine();
	        switch(string1) {
	            case "M":
	                System.out.println("星期一");
	                break;
	            case "W":
	                System.out.println("星期三");
	                break;
	            case "F":
	                System.out.println("星期五");
	                break;
	            case "T":
	                System.out.println("请输入星期的第二个小写字母：");
	                String string2=scannert.nextLine();
	                if(string2.equals("u")) {
	                    System.out.println("星期二");
	                }
	                if(string2.equals("h")) {
	                    System.out.println("星期四");
	                }
	                break;
	            case "S":
	                System.out.println("请输入星期的第二个小写字母：");
	                String letter3=scannert.nextLine();
	                if(letter3.equals("a")) {
	                    System.out.println("星期六");
	                }
	                if(letter3.equals("u")) {
	                    System.out.println("星期日");
	                }
	                break;
	            default:
	                System.out.println("输入有误！");
	                break;
	        }
	        scannert.close();

	 }
}
/*请输入星期的第一个大小字母：
S
请输入星期的第二个小写字母：
a
星期六*/
