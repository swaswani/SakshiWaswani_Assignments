
public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salary=600000;
		double tax;
		
		if(salary<=180000)
		{
			System.out.println("No tax paying for Slab A");
		}
		else if(salary>=181001 && salary<=300000)
		{
			tax=salary*10/100;
			System.out.println("Income Tax to be payed by Slab B : "+tax);
		}
		else if(salary>=300001 && salary<=500000)
		{
			tax=salary*20/100;
			System.out.println("Income Tax to be payed by Slab C : "+tax);
		}
		else if(salary>=500001 && salary<=1000000)
		{
			tax=salary*30/100;
			System.out.println("Income Tax to be payed by Slab D : "+tax);
		}

	}

}
