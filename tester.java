public class tester {
	public static void main(String[] args) {
		
		System.out.println();
		
		System.out.println("[ Testing Dumbass.printRightTriangle(\"top left\", 10, \'*\') ]");
		Dumbass.printRightTriangle("top left", 10, '*');
		
		System.out.println();
		
		System.out.println("[ Testing Dumbass.printRightTriangle(\"bottom left\", 10, \'*\') ]");
		Dumbass.printRightTriangle("bottom left", 10, '*');
		
		System.out.println();
		
		System.out.println("[ Testing Dumbass.stringToInt(\"45\") ]");
		System.out.println( Dumbass.stringToInt("45") );
		
		System.out.println();
		
		System.out.println("[ Testing Dumbass.readStringFromConsole() ]");
		System.out.println( Dumbass.readStringFromConsole() );
		
		System.out.println();
	}
}
