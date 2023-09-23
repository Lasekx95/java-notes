
public class TwoDArrays {

	public static void main(String[] args) {
		// 2D array = is an array within an array { {0,1,2}, {0,1,2 }}
		
		//Need to specify the indexes for 2D arrays IE String[3][3]
		String[][] cars = new String[3][3];
	
		//first array within the cars array
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "mustang";
		//Second Array within the cars array
		cars[1][0] = "Ford";
		cars[1][1] = "Shelby";
		cars[1][2] = "Golf";
		//third array within the cars array
		cars[2][0] = "Tesla";
		cars[2][1] = "F-150";
		cars[2][2] = "Sunfire";
	
	
		//Nested for for loops display contents of the cars array

		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.println(cars[i][j]+ " ");
			}
		
		//Another way of writing a 2D array
		String[][] cars1 = {
				{"Camaro", "Corvette", "mustang"},
				{"Ford", "Shelby", "Golf"},
				{"Tesla", "F-150", "Sunfire"}
		};	
		
		}
	}

}
