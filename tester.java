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
	}
}
