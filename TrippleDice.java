package dice_package;

public class TrippleDice extends Dice {
	private Dice die;
	
	public TrippleDice() {
		die = new Dice();
	}
	
	public TrippleDice( int bounces ) {
		die = new Dice(bounces);
	}
	
	@Override
	public int Throw() {
		return ( die.Throw() + die.Throw() + die.Throw() ) / 3;
	}

}
