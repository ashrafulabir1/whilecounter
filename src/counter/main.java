package counter;

import java.io.PrintStream;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	}
	public static void counter(String message) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		message = keyboard.nextLine();

		int n = 0;
		while ( n < 5 )
		{
			//increment in last line works until it false. here 0 <5, 1 <5, 2<5, 3<5, 4<5 is true
			System.out.println( (n+1) + ". " + message );
			n++;
		}
	}
		public static void noncounter(String message) {
			//non counter no increment stucked on counting 0
			Scanner keyboard = new Scanner(System.in);

			System.out.println( "Type in a message, and I'll display it five times." );
			System.out.print( "Message: " );
			message = keyboard.nextLine();

			int n = 0;
			while ( n < 5 )
			{
				System.out.println( (n+1) + ". " + message );
				
			}
	}

}
