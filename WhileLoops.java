import java.util.Scanner;


public class WhileLoops {

	public static void main(String[] args) {
		// while loop = executes a block of code as  long as it's condition is true
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		//while loop runs why the name variable is blank/empty
		while(name.isBlank()) {
			System.out.println("enter your name: ");
			name = scanner.nextLine();
		
		}
		//executes upon entering name or string
		System.out.println("Hello " +name);
		
		
		
		//Example of do loop
		do {
			System.out.println("enter your name: ");
			name = scanner.nextLine();
		}while(name.isBlank()); 
		//executes upon entering name or string
		System.out.println("Hello " +name);
		
	};
}
