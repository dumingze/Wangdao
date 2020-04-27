
public class Work42 {
	public static void main(String[] args) {
	boolean bool=isExist();
	System.out.println(bool);
		
	}
	public static boolean isExist() {
		for (int i = 0; i < 100; i++) {
			
			if(809*i==800*i+9*i+1){
			
				if((8*i<100)&&(9*i>100)){return true;}
			}
			
		}
		return false;
		
	}

}
/*false*/