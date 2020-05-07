
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Work50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
		int stuid1,stuid2,stuid3;
		
		String name1;
		String name2;
		String name3;
		int[] grade1=new int[3];
		int[] grade2=new int[3];
		int[] grade3=new int[3];
		double avarage1, avarage2, avarage3;
		System.out.println("请输入第一个学生的学号");
		stuid1=scanner.nextInt();
		System.out.println("请输入第二个学生的学号");
		stuid2=scanner.nextInt();
		System.out.println("请输入第三个学生的学号");
		stuid3=scanner.nextInt();
		
		System.out.println("请出入第一个学生的姓名");
		name1=scanner.nextLine();
		
		System.out.println("请出入第二个学生的姓名");
		name2=scanner.nextLine();
		System.out.println("请出入第三个学生的姓名");
		name3=scanner.nextLine();
		
		System.out.println("请输入第一个学生的成绩");
		int sum1=0;
		for (int i = 0; i < grade1.length; i++) {
			grade1[i]=scanner.nextInt();
			sum1=sum1+grade1[i];
			
		}
		System.out.println("请输入第二个学生的成绩");
		int sum2=0;
		for (int i = 0; i < grade2.length; i++) {
			grade2[i]=scanner.nextInt();
			sum2=sum2+grade2[i];
		}
		System.out.println("请输入第三个学生的成绩");
		int sum3=0;
		for (int i = 0; i < grade3.length; i++) {
			grade3[i]=scanner.nextInt();
			sum3=sum3+grade3[i];
		}
		avarage1=(double)sum1/3;
		avarage2=(double)sum2/3;
		avarage3=(double)sum3/3;
		
		Student student1=new Student(stuid1, name1, grade1, avarage1);
		Student student2=new Student(stuid2, name2, grade2, avarage2);
		Student student3=new Student(stuid3, name3, grade3, avarage3);
		
		List<Student> list=new ArrayList<Student>(3);
		list.add(student1);
		list.add(student2);
		list.add(student3);
		System.out.println(list.get(1).getName());
		
		scanner.close();
/*		try {
			FileWriter fw=new FileWriter("/Users/dumingze/desktop/stud.txt");
			for(Student s:list){
				fw.write((int)s.getAverage());
				}
				fw.close();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			FileWriter fileWriter=new FileWriter("/Users/dumingze/desktop/stud.txt");

	        BufferedWriter bw = new BufferedWriter(fileWriter);
	        bw.write("No.  "+"Name  "+"grade1  "+"grade2  "+"grade3  "+"average");
	     
	        for (int i = 0; i < list.size(); i++) {
	        	bw.write((int)list.get(i).getAverage());
				
			}
	        bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
/*请输入第一个学生的学号
1
请输入第二个学生的学号
2
请输入第三个学生的学号
3
请出入第一个学生的姓名
请出入第二个学生的姓名
dmz
请出入第三个学生的姓名
zrw
请输入第一个学生的成绩
1
1
1
请输入第二个学生的成绩
2
2
2
请输入第三个学生的成绩
3
3
3*/
//程序运行起来有BUG，没有调试成功
