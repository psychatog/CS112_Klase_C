package dice_package;

public class RollHistory {
	
	private int numberOfOnesThrown;
	private int numberOfTwosThrown;
	private int numberOfThreesThrown;
	private int numberOfFoursThrown;
	private int numberOfFivesThrown;
	private int numberOfSixesThrown;
	
	RollHistory() {
		numberOfOnesThrown   = 0;
		numberOfTwosThrown   = 0;
		numberOfThreesThrown = 0;
		numberOfFoursThrown  = 0;
		numberOfFivesThrown  = 0;
		numberOfSixesThrown  = 0;
	}

	public void incrementNumberThrown( int value ) {
		switch (value) {
		case 1: ++numberOfOnesThrown;   break;
		case 2: ++numberOfTwosThrown;   break;
		case 3: ++numberOfThreesThrown; break;
		case 4: ++numberOfFoursThrown;  break;
		case 5: ++numberOfFivesThrown;  break;
		case 6: ++numberOfSixesThrown;  break;
		}
	}
	
	public void printHistory() {
		System.out.printf("1 - %d\n",numberOfOnesThrown	 );
		System.out.printf("2 - %d\n",numberOfTwosThrown  );
		System.out.printf("3 - %d\n",numberOfThreesThrown);
		System.out.printf("4 - %d\n",numberOfFoursThrown );
		System.out.printf("5 - %d\n",numberOfFivesThrown );
		System.out.printf("6 - %d\n",numberOfSixesThrown );
	}
}
