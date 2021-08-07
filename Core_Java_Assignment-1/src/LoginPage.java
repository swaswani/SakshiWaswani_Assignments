
public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username = "Admin";
		String password = "Admin@123";
		int count=1;
		
		while(count<=3)
		{
		if(username!="Admin" || password!="Admin@123")
		{
			System.out.println("Invalid username or password, please try again!!");
			
		}
		else
		{
			System.out.println("Welcome "+username);
		}
		
		count++;
		
		break;
		}
		
		if(count>3)
		{
			System.out.println("Contact Admin!!");
			System.exit(0);
		}
		
		
		
		
		
		
	}

}
