package CS112;

import java.util.Scanner;

public class Rock_Paper_Scissors {
	
	static final int ROCK = 1;
	static final int PAPER = 2;
	static final int SCISSORS = 3;
	static final int UNKNOWN_COMMAND = 0;
	
	private int userChoice;
	private int cpuChoice;
	private Scanner input;
	
	Rock_Paper_Scissors() {
		
		userChoice = UNKNOWN_COMMAND;
		cpuChoice = UNKNOWN_COMMAND;
		input = new Scanner(System.in);
	}
	
	public void runGame() {
		System.out.println("Welcome to Clarence's rock-paper-scissors game.\n");
		
		do {
			setUserChoice();
			processGameState();
		} while ( getBool("Do you want to play again? ") );
	}
	
	private void setUserChoice() {
		do {
			String choice = getString("ENTER rock, paper, or scissors: ");
			switch (choice) {
			case "rock": 	case "ROCK": 	userChoice = 1; break;
			case "paper": 	case "PAPER": 	userChoice = 2; break;
			case "scissors":case "SCISSORS":userChoice = 3; break; 
				default: 
					System.out.println("You didn't enter rock, paper, or scissors.");
			}
		} while ( userChoice == UNKNOWN_COMMAND );
	}
	
	private void setCPUChoice() {
		cpuChoice = boundedR_N_G(ROCK,SCISSORS);
	}
	
	private void processGameState() {
		setCPUChoice();
		compareChoices();
	}
	
	private void compareChoices() {
		if ( userChoice == cpuChoice ) {
			System.out.println("I chose " + toString(userChoice) +  " as well.");
			return;
		}
		compareChoice(ROCK,PAPER);
		compareChoice(PAPER,SCISSORS);
		compareChoice(SCISSORS,ROCK);
	}
	
	private void compareChoice(int choiceToCompare, int losingUserChoice) {
		if ( userChoice == choiceToCompare ) {
			if ( cpuChoice == losingUserChoice ) 
				System.out.println("I chose " + toString(cpuChoice) +  ", you lose");
			else 
				System.out.println("I chose " + toString(cpuChoice) +  ", YOU WIN!");
		}
	}

	private int boundedR_N_G(int lowerBound, int upperBound) {
		return lowerBound + (int)( Math.random() * upperBound );
	}
	
	private String toString(int choice) {
		switch (choice) {
			case 1: return "rock";
			case 2: return "paper";
			case 3: return "scissors";
		}
		return "unknown choice";
	}
	
	private char getChar(String prompt) {
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
	
	private boolean getBool(String prompt) {
		do {
			switch ( getChar(prompt) ) {
				case 'y': case 'Y': return true;
				case 'n': case 'N': return false;
			}
			System.out.println("Please enter y or n.");
		} while (true);
	}
	
	private String getString(String prompt) {
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
}
