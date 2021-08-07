
public class Student_result {

	public static void main(String[] args) {
		
		int m1=65,m2=80,m3=92;
		
		if(m1>60 && m2>60 && m3>60)
		{
			System.out.println("Student is passed");
			
		}
		else if(m1>60 && m2>60 || m2>60 && m3>60 || m1>60 && m3>60)
		{
			System.out.println("Student is promoted");
			
		}
		else 
		{
			System.out.println("Student is Failed");
		}
			
		

	}

}
