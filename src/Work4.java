
public class Work4 {

	public static void main(String[] args) {
	
		 int n=90;
		 int m=6;
	     decompose(n);
	     System.out.println();
	     decompose(m);  
	}
	 //因数分解函数
    private static void decompose(int n)
    {
        System.out.print(n+"=");
        for(int i=2;i<=n;i++)
        {
            while (n%i==0&&n!=i)
            {
                n/=i;
                System.out.print(i+"*");
            }
            if(n==i){
                System.out.print(i);
                break;
            }
        }
    }

}
/*90=2*3*3*5
6=2*3*/
