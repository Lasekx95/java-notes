//import the scanner class
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		//init the scanner class object
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?:");
		//asks for input and stores in variable 
		String name = scanner.nextLine();
		
		//prints "hello" and the name input stored in variable name
		System.out.println("hello " +name);
	}

}
