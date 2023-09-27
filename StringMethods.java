
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
		
		int a = Integer.parseInt("123"); // 123
		int b = Integer.valueOf("123"); // 123
		int c = Integer.valueOf("hello"); // NumberFormatException
		double cc = Double.parseDouble("123.456"); // 123.456
		double dd = Double.valueOf("123.456"); // 123.456
		
		String s1 = "TiGEr wooDs ";
		String s2 = "My name is ".concat(s1);
		String s3 = "My name is " + s1;
		System.out.println(s2); // My name is TiGEr wooDs
		System.out.println(s3); // My name is TiGEr wooDs
		
		System.out.println(s1.charAt(0)); // T
		//bools
		System.out.println(s1.contains("ig")); // false
		System.out.println(s1.contains("iG")); // true
		System.out.println(s1.endsWith("oDs")); // false; note the space at the end of s1
		System.out.println(s1.strip().endsWith("oDs")); // true; spaces stripped off ends of s1
		System.out.println(s1.equals("Tiger Woods")); // false
		System.out.println(s1.equalsIgnoreCase("Tiger Woods ")); // true
	
		System.out.println(s1.indexOf('o')); // 7; the first o occurs at the 8th char
		System.out.println(s1.length()); // 12
		System.out.println(s1.strip().length()); // 11	
		
		System.out.println(s1.replace('o', 'x')); // TiGEr wxxDs
		System.out.println(s1.startsWith("Ti")); // true
		System.out.println(s1.toLowerCase()); // tiger woods
		System.out.println(s1.toUpperCase()); // TIGER WOODS
		
		/*
		 
		 endsWith() e.g. if(s.endsWith(“xYz”)) or if(s.toLowerCase().endsWith(“xyz”) 
		 equals() e.g. “hello”.equals(“Hello”) is false; “hello”.equals(“hello”) is true
		 equalsIgnoreCase() e.g. “hello”.equalsIgnoreCase(“Hello”) is true
		 replace() e.g. “hello”.replace(‘l’, ‘T’) creates heTTo
		 strip() e.g. “\nhello world \t ” becomes “hello world”
		 
		 */
	}

}
