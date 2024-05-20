package task11;
import java.util.*;
public class division_exception {
	
	public static void main(String args[] ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numerator");
		
		double a = sc.nextDouble();
		
		System.out.println("Enter denominator");
		
		double b = sc.nextDouble();
		
		try {
			
			if(b==0) {
				throw new ArithmeticException("Division by zero is not possible");
			}
			double result =a/b;
			
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e){
			
			System.out.println("Error: "+e.getMessage());
			
		}
		
		
	}

}
