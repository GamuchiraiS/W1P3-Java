import java.util.*;


public class oneOfThree {
	public static void main(String [] args){

		int humanDogAge; 
		int dogAge; 

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the dog's age (human years): ");
		humanDogAge = Integer.parseInt(sc.nextLine());

		if (humanDogAge < 0) {
			System.out.println("Please enter a valid number.");
		}

		else if (humanDogAge <= 2){
			dogAge = humanDogAge * (int)10.5;
		}

		else {
			dogAge = 21 + (humanDogAge - 2) *4;
			System.out.println("The dog's age in dog years is " + dogAge);
		}

	}
}