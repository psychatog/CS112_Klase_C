package dice_package;

public class Dice {
	static final int LOWER_BOUND_FOR_DIE = 1;
	static final int UPPER_BOUND_FOR_DIE = 6;
	
	private RollHistory history;
	private int numberOfThrows;
	private int diceValue;
	private int bounces;
	
	Dice() {
		history = new RollHistory();
		numberOfThrows = 0;
		diceValue = boundedR_N_G(LOWER_BOUND_FOR_DIE,UPPER_BOUND_FOR_DIE);
		bounces = 0;
	}
	
	Dice(int value) {
		history = new RollHistory();
		numberOfThrows = 0;
		diceValue = boundedR_N_G(LOWER_BOUND_FOR_DIE,UPPER_BOUND_FOR_DIE);
		bounces = value;
	}
	
	public void setBounces( int value ) {
		bounces = value;
	}
	
	public void incrementNumberOfThrows() {
		++numberOfThrows;
	}
	
	public int Throw() {
		int totalDiceValue = 0;
		for ( int timesBounced = bounces; timesBounced > 0; --timesBounced )
			totalDiceValue += boundedR_N_G(LOWER_BOUND_FOR_DIE,UPPER_BOUND_FOR_DIE);
		history.incrementNumberThrown(totalDiceValue/bounces);
		return totalDiceValue/bounces;
	}
	
	public int getValue() {
		return diceValue;
	}
	
	public void printHistory() {
		history.printHistory();
		System.out.printf("total rolls - %d", numberOfThrows);
	}
	
	private int boundedR_N_G(int lowerBound, int upperBound) {
		return lowerBound + (int)( Math.random() * upperBound );
	}
}
