package task11;
import java.util.*;

class loginexception extends Exception{
	
	public loginexception(String message) {
		super(message);
	}
}
public class login_exception {
	
	private static final String username = "vamsi";
	private static final String password = "vamsi2000";
	
	private static boolean login_validate(String name, String code) throws loginexception{
		
		if(!name.equals(username) || !code.equals(password)) {
			throw new loginexception("Invalid username or passowrd");
		}
		return true;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		
		String enter_username = sc.next();
		
		System.out.println("Enter password: ");
		
		String enter_password = sc.next();
		
		try {
			login_validate(enter_username,enter_password);
			System.out.println("Login Successful");
		}
		catch(loginexception e) {
			System.out.println("Error login: "+e.getMessage());
		}
		
	}

}
