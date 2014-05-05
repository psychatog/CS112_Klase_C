package dice_package;
import java.util.Scanner;

public class ClassTools {
	
	boolean getBool( String prompt, Scanner input ) {
		do {
			switch ( getChar(prompt,input) ) {
				case 'y': case 'Y': return true;
				case 'n': case 'N': return false;
			}
			System.out.println("Please enter Y or N.");
		} while (true);
	}

	int getInt( String prompt, Scanner input ) {
		do {
			int userInput;
			System.out.print(prompt);
			while ( !input.hasNextInt() ){
				System.out.println("Please enter a integer.");
				input.next();
			}
			userInput = input.nextInt();
			return userInput;
		} while (true);
	}
	
	String getString( String prompt, Scanner input ) {
		do {
			String userInput;
			System.out.print(prompt);
			while ( !input.hasNext() ) {
				System.out.println("Please enter a string.");
				input.next();
			}
			userInput = input.next();
			return userInput;
		} while (true);
	}

	char getChar( String prompt, Scanner input ) {
		do {
			char userInput;
			System.out.print(prompt);
			while ( !input.hasNext() ) {
				System.out.println("Input Error, please try again.");
				input.next();
			}
			userInput = input.next().charAt(0);
			return userInput;
		} while (true);
	}
	
	int random( int lowerBound, int upperBound ) {
		return lowerBound + (int)( Math.random() * upperBound );
	}
}
