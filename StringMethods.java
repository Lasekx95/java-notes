
public class StringMethods {

	public static void main(String[] args) {
		//String = a reference data type that can be used to store 1 or more characters
		
		String name = "Bro";
		
		//Checks to see if two strings match
		boolean result = name.equals("Bro");
		boolean result1 = name.equals("bro");
		//name.equalsIgnoreCase("bro") to ignore case
		System.out.println(result + " " + result1);
		
		//length of string
		int result2 =  name.length();
		System.out.println(result2);

		//character at specified index: [0]
		char result3 = name.charAt(0);
		System.out.println(result3);
		
		//specifies index of character: "o"
		int result4 = name.indexOf("o");
		System.out.println(result4);
	}

}
