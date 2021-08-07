
public class Armstrong_range {
	public static void main(String[] args) {
		
		int n=100, rem;
		
		
		while(n < 1000)
		{
			int i=n, res=0;
		
			while(i != 0)
			{
			rem = i % 10;
			res = res+ (rem*rem*rem);
			i = i/10;
			}
			
		
		if(res==n)
		{
			System.out.println(n);
		
			
		}
		n++;
		}
		
	}

}
