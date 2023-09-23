import java.util.ArrayList;
public class ArrayLists {
	

	public static void main(String[] args) {
		
		//ArrayList = a resizable array;
		//			Elements can be added and removed after the compilation phase
		//			Store reference data types IE Integer, String, ETC
		
		//list reference data type within angle brackets <>
		//if you need to store primitive data types, use wrapper classes
		ArrayList<String> food = new ArrayList<String>();
		
		//Use the add method to add items to the ArrayList
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hotdog");
		
		//The set method changes the index of the corresponding value with the item (index, item)
		food.set(0, "sushi");
		
		//removes the item from the specified index [2]
		food.remove(2);
		
		//   method for clearing the Arraylist
		//   food.clear();
		
		
		//Displaying elements of the ArrayList
		//ArrayLists use size() instead of length(), which arrays use
		for(int i = 0; i<food.size(); i++) {
			
			//the get method gets the item from the corresponding index
			System.out.println(food.get(i));
		}
	}	
}
