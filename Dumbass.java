import java.util.Scanner;
import java.util.Arrays;
import lib.*;

/**Dumbass is a collection of static methods that were born out of the frustration
 * sophomores have when learning java. A couple things in here are redundant wrappers
 * for previously existent java methods, but in this library the intention of every method
 * is made more clear to a novice.
 * @author Grayson Croom
 * @version 0.1
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
		return (new FileReader(fileName)).readLine(lineNumber);}

	@SuppressWarnings("resource")
	public static String readStringFromConsole() {
		return (new Scanner( System.in )).nextLine();}
	
	@SuppressWarnings("resource")
	public static int readIntFromConsole() {
		while(true) {
			try {
				return (new Scanner( System.in )).nextInt();
			} catch(Exception e){
				System.out.println("Please enter an integer");
				
			}
		}
	}
	@SuppressWarnings("resource")
	public static char readCharFromConsole() {
		return ((new Scanner( System.in )).next()).charAt(0);}
	
	// 'string to x' conversions
	public static int stringToInt(String x) {return Integer.parseInt(x);}
	
	public static char stringToChar(String x) {return x.charAt(0);}

	public static Double stringToDouble(String x) {return Double.parseDouble(x);}

	public static char[] stringToCharArray(String x) {
		char[] output = new char[x.length()];
		for(int i = 0; i < x.length(); i++)
			output[i] = x.charAt(i);
		return output;
	}
	
	// 'int to x' conversions
	public static String intToString(int x) {return "" + x;}
	
	public static double intToDouble(int x) {return (double) x;}

	public static char intToChar(int x) {return (char) x;}

	// 'double to x' conversions
	public static String doubleToString(double x) {return "" + x;}

	public static int doubleToInt(double x) {return (int) x;}

	// 'char to x' conversions
	public static String charToString(char x) {return "" + x;}

	public static int charToInt(char x) {return (int) x;}

	
	// triangles
	public static char[][] createRightTriangle(String rightAngleOrientation, int size, char symbol) {
		String x = rightAngleOrientation;

		char[][] output = new char[size][size];
		
		if( x.equalsIgnoreCase("top left")) {
			for(int i = 0; i < size; i++)
				for(int j = 0; j < output[i].length - i; j++) output[i][j] = symbol;
		} else if( x.equalsIgnoreCase("bottom left")) {	
			for(int i = 0; i < size; i++)
				for(int j = 0; j <= i; j++) output[i][j] = symbol;
		} else if( x.equalsIgnoreCase("top right")) {
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < i; j++) output[i][j] = ' ';
				for(int j = size - 1; j >= i; j--) output[i][j] = symbol;
			}
		} else if( x.equalsIgnoreCase("bottom right")) {
			for(int i = 0; i < size; i++){
				for(int j = 0; j < size - i - 1; j++) output[i][j] = ' ';
				for(int j = size - i - 1; j < size; j++) output[i][j] = '*';	
			}
		} else {
			System.out.println("not a valid triangle parameter: " + rightAngleOrientation);
			System.out.println("useage for 1st parameter: \"top left\", \"top right\", \"bottom left\", \"bottom right\"");	
		}
		
		return output;
	}

	public static void printRightTriangle(String rightAngleOrientation, int size, char symbol) {

		char[][] output = createRightTriangle(rightAngleOrientation, size, symbol);

		for(char[] row : output) {
			for( char element : row )
				System.out.print( element );
			System.out.println();
		}
	}
	// array printing
	public static void printArray(Object[] arr) {
		for(Object x : arr) System.out.println( x );}

	public static void printArray(int[] arr) {
		for(int x : arr) System.out.println( x );}
	
	public static void printArray(char[] arr) {
		for(char x : arr) System.out.println( x );}
	
	public static void printArray(double[] arr) {
		for(double x : arr) System.out.println( x );}

	// math operations
	public static double roundUp(double x) {return Math.ceil(x);}
	public static double roundDown(double x) {return Math.floor(x);}
	public static double power(double num, int exponent) {return Math.pow(num, exponent);}
	public static double power(int num, int exponent) {return Math.pow(num, exponent);}
	public static double squareRoot(double num) {return Math.sqrt(num); }
	
	//search methods
	public static int linearSearch(int arr[], int find) {
		for(int i = 0; i < arr.length; i++)
			if(arr[i] == find) return i;
		
		return -1;
	}
	
	public static int linearSearch(String arr[], String find) {
		for(int i = 0; i < arr.length; i++)
			if(arr[i].equals(find)) return i;
		
		return -1;
	}
	
	//sort methods
	// O(n^2)
	public static void selectionSort(int arr[]) {
		for( int i = 0; i < arr.length; i++ ) {
			int min = i;
			for( int j = i+1; j < arr.length; j++ )
				if( arr[j] < arr[min] ) min = j;
			
			arr[i]   ^= arr[min]
			arr[min] ^= arr[i]
			arr[i]   ^= arr[min]
		}
	}

	public static void insertionSort(int arr[]) {
		for( int i = 1; i < arr.length; i++ ) {
			int j = i, index = arr[i];
			while( j > 0 && arr[j-1] > index ) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = index;
		}
	}

	// O(n log n)
	public static void mergeSort(int arr[]) {Arrays.sort(arr);}

}
