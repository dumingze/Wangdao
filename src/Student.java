
public class Student {

	private int stuid;
	private String name;
	private int[]grade;
	private double average;
	public Student(int stuid, String name, int[] grade, double average) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.grade = grade;
		this.average = average;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getGrade() {
		return grade;
	}
	public void setGrade(int[] grade) {
		this.grade = grade;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	
	
	
}
