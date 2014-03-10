// Clarence Klase
// 03/09/2014
// Week04 Homework
// This class prompts user to enter ints and prints them to screen.

import java.util.Scanner;

public class Echo 
{

	public static void main( String[] args ) 
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a number: " );
		int aNumber = input.nextInt();
		
		System.out.print( "Please enter another number: " );
		int anotherNumber = input.nextInt();
		
		System.out.printf( "Hello, you entered %d and %d.", aNumber, anotherNumber );
		
		input.close();
	}

}

// Looks good.  Were you able to integrate GitHub with the IDE?
