package task11;
import java.util.*;
public class question_5b {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		
		String a = sc.next();
		
		int b = a.length();
		
		System.out.println("Enter the String index value: ");
	
		int c = sc.nextInt();
		
		try {
			char d = a.charAt(c);
			System.out.println("String element of Index value "+d);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Invaid String Index Value");
		}
	}
}
