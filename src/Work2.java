


public class Work2 {
   public static void main(String[] args) {
	int count=0;
    for(int i=101;i<200;i++){
    	int j;
//下面这个写法是判断是否为素数的普遍写法
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
/*101是素数
103是素数
107是素数
109是素数
113是素数
127是素数
131是素数
137是素数
139是素数
149是素数
151是素数
157是素数
163是素数
167是素数
173是素数
179是素数
181是素数
191是素数
193是素数
197是素数
199是素数
一共有21个素数*/
