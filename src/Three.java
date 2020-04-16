
public class Three {

	public static void main(String[] args) {
		for (int i = 100; i < 999; i++) {
			
			int gewei=i%10;
			int shiwei=(i/10)%10;
			int baiwei=i/100;
			if (gewei*gewei*gewei+shiwei*shiwei*shiwei+baiwei*baiwei*baiwei==i) {
				System.out.println(+i+"是水仙花数");
				
			}
			
		}
		
	}

}
