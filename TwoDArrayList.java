import java.util.*;

public class TwoDArrayList {

	public static void main(String[] args) {
		
		//2D ArrayList =  a dynamic list of lists
		//You can change the size of the these lists during runtime
		
		//same idea as an ArrayList, but you enclose ArrayList within the angle brackets of another ArrayList 
		//			2D ArrayList --> ArrayList< (inner ArrayList) ArrayList<String>>
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Pasta");
		bakeryList.add("Garlic Bread");
		bakeryList.add("Doughnuts");
		
		ArrayList<String> produceList = new ArrayList();		
		produceList.add("Tomato");
		produceList.add("Garlic");
		produceList.add("Peppers");

		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("coffee");
		drinksList.add("Soda");

		//Adds seperate ArrayLists to the main ArrayList(groceryList)
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);

		//retrieves first index of the outer ArrayList, the first inner ArrayList
		System.out.println(groceryList.get(0));
		
		//retrieves first index of the specified index, similar to array[0][0]
		System.out.println(groceryList.get(0).get(0));
	}

}
