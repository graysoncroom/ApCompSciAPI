# DumbassApi
A collection of static methods located in the file 'Dumbass' that Computer Science 1 students can use to make their easy lives even easier!

If you are having trouble using this API please contact me at: grayson.croom@gmail.com

<h3>The Following Methods can be used by putting the 'Dumbass' file and the 'lib' folder in the directory your code is in.</h3>

Usage:
```
public class tester {
	public static void main(String[] args){
		
		// The following method returns the text at 'lineNumber' in the file 'fileName'
		// Method Header: public String readFileAt(String fileName, int lineNumber)
		// Example usage for printing a line of text from a file to the console:
		
		String line6 = Dumbass.readFileAt( "fileName.txt", 6 );
		System.out.println( line6 ); 
		
		
		
		// The following method returns a String of user input from the console
		// Method Header: public String readStringFromConsole()
		// Example usage for taking in user input as a string:
		
		System.out.println( "What is your name?" ); // asking the user a question
		String name = Dumbass.readStringFromConsole(); // storing the user's name in a string called 'name'
		System.out.println( "Your name is: " + name ); // printing the user's name
		
		
		
		// The following method returns a int of user input from the console
		// Method Header: public int readIntFromConsole()
		// Example usage for taking in user input as an int:
		
		System.out.println( "What is your age?" ); // asking the user a question
		String age = Dumbass.readIntFromConsole(); // soring the user's age in an int called 'age'
		System.out.println( "Your age is: " + age ); // printing the user's age
		
		
		
		// The following method returns a char of user input from the console
		// Method Header: public char readCharFromConsole()
		// Example usage for taking in user input as a char:
		
		System.out.println( "What is your favorite letter?" ); // asking the user a question
		char favoriteLetter = Dumbass.readCharFromConsole(); // storing the user's responce in a char 'favoriteLetter'
		System.out.println( "Your favorite letter is: " + favoriteLetter ); // printing the user's favorite letter
	}
}
```
