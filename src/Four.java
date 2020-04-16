
public class Four {

	public static void main(String[] args) {
	
		 int n=900;
	       decompose(n);
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
