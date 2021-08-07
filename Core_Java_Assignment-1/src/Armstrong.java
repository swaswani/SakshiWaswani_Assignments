
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153, rem, res=0;
		int copy_n=n;
		
		while(n != 0)
		{
			rem = n % 10;
			res = res+ (rem*rem*rem);
			n = n/10;
			
		}
		
		if(res==copy_n)
		{
			System.out.println("Number is Armstrong");
			
		}
		
		else
		{
			System.out.println("Number is Not Armstrong");
		}
		

	}

}
