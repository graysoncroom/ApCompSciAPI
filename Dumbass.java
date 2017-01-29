import java.util.Scanner;
import lib.*;

/**
 * @author Grayson Croom
 *
 */
public class Dumbass {
	
	/**
	 * 
	 * @param fileName
	 * @param lineNumber
	 * @return the text (the whole line) at 'lineNumber' in file 'fileName'
	 *
	 */
	public static String readFileAt(String fileName, int lineNumber) { 
		return (new FileReader(fileName)).readLine(lineNumber);
	}

	@SuppressWarnings("resource")
	public static String readStringFromConsole(){
		return (new Scanner( System.in )).nextLine();
	}
	
	@SuppressWarnings("resource")
	public static int readIntFromConsole(){
		return (new Scanner( System.in )).nextInt();
	}
	
	@SuppressWarnings("resource")
	public static char readCharFromConsole(){
		return ((new Scanner( System.in )).next()).charAt(0);
	}

}
