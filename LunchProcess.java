// Clarence Klase
// 03/16/2014
// Week05 Homework
// Prints steps involved in attaining lunch in school

import java.util.Scanner;

public class LunchProcess 
{
	public static void main( String[] args ) 
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Hungry" );
		System.out.println( "Get in line" );
		System.out.println( "Buy lunch" );
		
		System.out.print( "Are you thirsty?(enter yes or no): " );
		String thirstAnswer = input.next();
		
		// this assumes the input is a yes or a no
		if ( thirstAnswer.equalsIgnoreCase("no") ) 
			System.out.println( "Get water" );
		else 
		{
			System.out.print( "Did you have breakfast?(enter yes or no): " );
			String breakfastAnswer = input.next();
			
			if ( breakfastAnswer.equalsIgnoreCase("yes") )
				System.out.println( "Buy diet coke" );
			else
				System.out.println( "Buy coke" );
		}
		
		System.out.println( "Eat lunch" );
		System.out.println( "Return tray" );
		System.out.println( "Leave" );

		input.close();
	}
}
