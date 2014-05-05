package dice_package;

import java.util.Scanner;

public class DiceTester {

	public static void main(String[] args) {
		Dice die = new Dice();
		ClassTools tools = new ClassTools();
		Scanner input = new Scanner(System.in);
		
		do {
			int bounces = tools.getInt("How many times do you want the die to bounce? ", input);
			die.setBounces(bounces);
			die.Throw();
			System.out.printf("You rolled a %d\n", die.Throw());
			die.incrementNumberOfThrows();
		} while (tools.getBool("Do you want to roll again? ", input));
		
		System.out.println("Your roll history was:");
		die.printHistory();
	}
}
