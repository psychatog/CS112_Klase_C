package CS112;

public class GameHistory {

	int numberOfGamesWon;
	int numberOfGamesLost;
	int numberOfTieGames;
	
	GameHistory() {
		numberOfGamesWon = 0;
		numberOfGamesLost = 0;
		numberOfTieGames = 0;
	}
	
	public void incrementGamesWon() {
		++numberOfGamesWon;
	}
	
	public void incrementGamesLost() {
		++numberOfGamesLost;
	}
	
	public void incrementTieGames() {
		++numberOfTieGames;
	}
	
	public int getGamesWon() {
		return numberOfGamesWon;
	}
	
	public int getGamesLost() {
		return numberOfGamesLost;
	}
	
	public int getTieGames() {
		return numberOfTieGames;
	}
	
	public int getTotalGamesPlayed() {
		return numberOfGamesWon + numberOfGamesLost + numberOfTieGames;
	}
	
	public void printStats() {
		double winPercent = getWinPercent();
		int totalGamesPlayed = getTotalGamesPlayed();
		System.out.printf("You won a total of %d.\n", numberOfGamesWon);
		System.out.printf("You tied a total of %d.\n", numberOfTieGames);
		System.out.printf("You lost a total of %d.\n", numberOfGamesLost);
		System.out.printf("You played a total of %d.\n", totalGamesPlayed);
		System.out.printf("You have a %.2f percent win rate.", winPercent);
	}
	
	private double getWinPercent() {
		return ( (double)numberOfGamesWon / (numberOfGamesWon + numberOfGamesLost + numberOfTieGames) ) * 100;
	}
}

