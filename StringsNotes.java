
public class StringsNotes {

	public static void main(String[] args) {
		//Reference Types (such as String) store the address of their object 
		//Comparing two String objects using == compares their address, not 
		//not their contents and you rarely if ever want to compare two String addresses
		
		String example = "demo"; //Example of a String literal
		
		//Use String .equals() and equalsIgnoreCase() methods to compare contents
		
		String a = "Dog";
		String b = "Cat";
		
		if(a.equals(b)) {	// EXAMPLE
			System.out.println("Srings are equal");
		} else {
			System.out.println("String are not equal");
		}
		
		if(a.equalsIgnoreCase(b)) {	// EXAMPLE, but ignores case
		System.out.println("Srings are equal");
		} else {
			System.out.println("String are not equal");
		}
		
		//null = is a String reference type (no object)
		//null String is NOT the same as "" 
		
		//A NullPointerException will occur by attempting to call methods on a null String reference
		
		String s = null;
		System.out.println(s.toUpperCase()); // NullPointerException
		
		String m = "";
		System.out.println(s.toUpperCase()); // Prints ""; no problem)
		
		//to call the address of the String m
		System.out.println(Integer.toHexString(m.hashCode()));
		
		String name = "Brady"; //String name = new String("Brady")
		name = "Lily"; //name = new String("Lily")
		
		String nameNew = "Brady"; 
		String nom = "Brady"; // String nom = nameNew ("Brady"), same memory address
	}

}
