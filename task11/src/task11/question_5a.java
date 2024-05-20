package task11;
import java.util.*;
public class question_5a {
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size =sc.nextInt();
	
	int[] array= new int[size];
	
	Random a = new Random();
	
	for(int i=0;i<size;i++) {
		
		array [i] = a.nextInt(100);
	}
	
	System.out.println("Random array: ");
	for(int j=0;j<size;j++) {
	System.out.println(array[j]);
	}
	
	System.out.println("Enter specific element number: ");
	
	int k = sc.nextInt();
	
		try {
			int z = array[k];
			System.out.println("Elements at index: "+z);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Invalid array element");
		}
		
	}
}
