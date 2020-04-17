
public class Ten {

	public static void main(String[] args) {
		
	Ziyouluoti();	
		
	}
	public static void Ziyouluoti() {
		int hight=100;
		int sum=0;
		for(int j=0;j<10;j++){
			sum=sum+(2*hight);
			hight=hight/2;
			
		}
		sum=sum-100;
		System.out.println("总高度为"+sum);
		System.out.println("第十次高度为"+hight);
		
		
	}
}
