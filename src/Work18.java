
public class Work18 {

	public static void main(String[] args) {
		char i,j,k;//a的对手是i,b的对手是j,c的对手是j
		for(i='x';i<='z';i++){
			for (j='x'; j <='z'; j++) {
				if(i!=j){
					for(k='x';k<='z';k++){
						if (k!=i&&k!=j) {
							if (i!='x'&&k!='x'&&k!='z') {
								System.out.println("a的对手是"+i+"\tb的对手是"+j+"\tc的对手是"+j);
								
							}
							
						}
					}
				}
				
			}
			
		}
		
	}
}
/*a的对手是z	b的对手是x	c的对手是x*/