


public class Two {
   public static void main(String[] args) {
	int count=0;
    for(int i=101;i<200;i++){
    	
    	int j;
    	for(j=2;j<=Math.sqrt(i);j++){
    		if(i%j==0)break;
    	}
    	if(j>Math.sqrt(i)){
    		count++;
    		System.out.println(i+"是素数");
    		
    	}
    }
	System.out.println("一共有"+count+"个素数");
		
	}
   
	
	   

}
