
public class Wrappers {

	public static void main(String[] args) {
		// wrapper class = provides a way to use primitive data types as reference date types
		//				reference data types contain useful methods
		//				can be used with collections (ex. ArrayList)
		//				reference data types can be slower to access
		
		//primitive			//wrapper
		//---------			//--------
		//boolean			//Boolean
		//char 				//Character
		//int				//Integer
		//double			//Double
		
		//autoboxing = the automatic conversion that the java compiler makes between the primitive their
		//										corresponding wrapper class ie: int to Integer
		//autoboxing example int to Integer
		//unboxing = reverse of autoboxing. Automatic conversion of wrapper class to primitive

		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Bro";
		
		//Even though reference data type, will still behave as a primitive due to autoboxing
		if(a==true) {
			System.out.println("This is true");
		}
	}

}
