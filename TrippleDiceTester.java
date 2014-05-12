package dice_package;

import java.util.Scanner;

public class TrippleDiceTester {

	public static void main(String[] args) {
		TrippleDice dice = new TrippleDice(2);
		ClassTools tools = new ClassTools();
		Scanner input = new Scanner(System.in);
		
		System.out.println("You throw 3 dice\n\n");
		System.out.printf( "Your average of the roll of the three dice was: %d", dice.Throw() );

	}

}
