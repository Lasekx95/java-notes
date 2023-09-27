
public class StringFormatting {

	public static void main(String[] args) {
		
		//printf 
		int yearBorn = 2000;
		double weightKg = 120.129;
		String firstName = "Tiger";
		System.out.printf("The golfer %s weighs %.2f kg and was born in %d!!!",
		firstName, weightKg, yearBorn);

		//sysout string using the printf method. ("string here", variables)
		//("The golfer %s weighs %.2f kg and was born in %d!!!", firstName, weightKg, yearBorn);
		
		//%s uses the declared String variable(firstName)
		//%.2f uses the declared double variable(weightKG)
		//%d uses the declared int variable(yearBorn)
		//%n creates a line break
		
		//Put a negative sign after the % to left-justify the text.
		//Precede the letter s with a number to specify field width.
		
		String s;
		s = String.format("The golfer %s weighs %.2f kg and was born in %d!!!", firstName, weightKg, yearBorn);
		System.out.println(s);
	}

}
