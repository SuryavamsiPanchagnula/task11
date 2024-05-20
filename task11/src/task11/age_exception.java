package task11;
class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class age_exception {
	
	private static final int Age = 16;
	
	private static void checkAge() throws InvalidAgeException{
		
		if(Age<18) {
			throw new InvalidAgeException("Invalid Age");
		}
		else {
			System.out.println("Eligible Age");
		}
		
	}
	
	public static void main(String args[]) {
		
		try {
			
			checkAge();
		}
		catch(InvalidAgeException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
