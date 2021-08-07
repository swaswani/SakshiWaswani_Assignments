
public class Simple_Compound {
	
	public static void main(String[] args) 
	{
		
		int p=5000 , t=2;
		double r= 1.8;
		
		double SI = (p*t*r)/100.0;
		
		double CI = p* Math.pow(1.0+r/100.0,t) - p;
		
		System.out.println("Simple Interest is : "+SI);
		System.out.println("Compound Interest is : "+CI);
		
	}

}
