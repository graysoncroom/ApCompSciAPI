public class tester {
	public static void main(String[] args) {
		
		System.out.println();
		
		System.out.println("[ Testing Dumbass.printRightTriangle(\"top left\", 10, \'*\') ]");
		Dumbass.printRightTriangle("top left", 10, '*');
		
		System.out.println();
		
		System.out.println("[ Testing Dumbass.printRightTriangle(\"bottom left\", 10, \'*\') ]");
		Dumbass.printRightTriangle("bottom left", 10, '*');
		
		System.out.println();
		
		System.out.println("[ Testing Dumbass.printRightTriangle(\"top right\", 10, \'*\') ]");
		Dumbass.printRightTriangle("top right", 10, '*');

		System.out.println();
		
		System.out.println("[ Testing Dumbass.printRightTriangle(\"bottom right\", 10, \'*\') ]");
		Dumbass.printRightTriangle("bottom right", 10, '*');

		System.out.println();

		System.out.println("[ Testing Dumbass.stringToInt(\"45\") ]");
		System.out.println( Dumbass.stringToInt("45") );
		
		System.out.println();
		
//		System.out.println("[ Testing Dumbass.readStringFromConsole() ]");
//		System.out.println( Dumbass.readStringFromConsole() );
//		
//		System.out.println();
//
//		System.out.println("[ Testing Dumbass.readIntFromConsole() ]");
//		System.out.println( Dumbass.readIntFromConsole() );
//
//		System.out.println();

		System.out.println("[ Testing Dumbass.power(2,3) ]");
		System.out.println( Dumbass.power(2,3) );

		System.out.println();

		System.out.println("[ Testing Dumbass.squareRoot(16) ]");
		System.out.println( Dumbass.squareRoot(16) );

		System.out.println();

		System.out.println("[ Testing Dumbass.roundUp(5.56) ]");
		System.out.println( Dumbass.roundUp(5.56) );

		System.out.println();

		System.out.println("[ Testing Dumbass.roundDown(5.33) ]");
		System.out.println( Dumbass.roundDown(5.33) );

		System.out.println();
		
		System.out.println("[ Testing Dumbass.linearSearch(new int[]{5, 87, 3, 34, 23, 2, 7}, 3) ]");
		System.out.println( Dumbass.linearSearch(new int[]{5, 87, 3, 34, 23, 2, 7}, 3) );
		
		System.out.println();
		
		System.out.println("[ Testing Dumbass.selectionSort(new int[]{5, 54, 89, 8, 2, 32, 122, 12, 1, 7, 4, 987}) ]");
		int array[] = new int[]{5, 54, 89, 8, 2, 32, 122, 12, 1, 7, 4, 987}; 
		System.out.println("Before selection sort:");
		Dumbass.printArray( array );
		Dumbass.selectionSort( array );
		System.out.println("After selection sort:");
		Dumbass.printArray( array );
		array = null;
		
		System.out.println();

		System.out.println("[ Testing Dumbass.insertionSort(new int[]{5, 54, 89, 8, 2, 32, 122, 12, 1, 7, 4, 987}) ]");
		array = new int[]{5, 54, 89, 8, 2, 32, 122, 12, 1, 7, 4, 987};
		System.out.println("Before inserstion sort:");
		Dumbass.printArray( array );
		Dumbass.insertionSort( array );
		System.out.println("After inserstion sort:");
		Dumbass.printArray( array );
		array = null;

		System.out.println();

		System.out.println("[ Testing Dumbass.mergeSort(new int[]{5, 54, 89, 8, 2, 32, 122, 12, 1, 7, 4, 987}) ]");
		array =  new int[]{5, 54, 89, 8, 2, 32, 122, 12, 1, 7, 4, 987};
		System.out.println("Before merge sort:");
		Dumbass.printArray( array );
		Dumbass.mergeSort( array );
		System.out.println("After merge sort:");
		Dumbass.printArray( array );
		array = null;	

		System.out.println();
	}
}
