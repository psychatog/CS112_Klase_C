import java.util.Scanner;

public class LunchProcessSwitch 
{
	public static void main( String[] args ) 
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Hungry" );
		System.out.println( "Get in line" );
		System.out.println( "Buy lunch" );
		
		System.out.print( "Are you thirsty?(enter yes or no): " );
		char thirstAnswer = input.next().charAt(0);
		
		switch ( thirstAnswer )
		{
		case 'n': case 'N': System.out.println( "Get water" ); break;
		case 'y': case 'Y': 
			System.out.print( "Did you have breakfast?(enter yes or no): " );
			char breakfastAnswer = input.next().charAt(0);
			
			switch ( breakfastAnswer )
			{
			case 'y': case 'Y': System.out.println( "Buy diet coke" );  break;
			case 'n': case 'N': System.out.println( "Buy coke" ); 	
			} 
		}
		
		System.out.println( "Eat lunch" );
		System.out.println( "Return tray" );
		System.out.println( "Leave" );
		
		input.close();
	}
}
