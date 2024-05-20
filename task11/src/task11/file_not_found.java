package task11;
import java.io.*;
import java.util.*;
public class file_not_found {
	
	public static void main(String args[]) {
		
		try {
			
			File a = new File("example.txt");
			Scanner sc = new Scanner(a);
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found: "+e.getMessage());
			
		}
	}
	

}
