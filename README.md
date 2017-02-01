# DumbassApi
A collection of static methods located in the file 'Dumbass' that Computer Science 1 students can use to make their easy lives even easier!

If you are having trouble using this API please contact me at: grayson.croom@gmail.com

<h3>The Following Methods can be used by putting the 'Dumbass' file and the 'lib' folder in the directory your code is in.</h3>
<strong>Do NOT forget the lib folder or the Dumbass.java file will not compile</strong>

The tester class in this repository is going to be a place where I can test every function I create. You
may not want it unless you would like to look at example methods and how they run.

Example Usage:
```
public class tester {
	public static void main(String[] args){
		
		/*
		 * The method void printRightTriangle(String rightAngleOrientation, int size, char symbol)
		 * rightAngleOrientation can be any of the following: "top left"    "top right" 
		 *						      "bottom left" "bottom right"
		 */
		 
		Dumbass.printRightTriangle("top left", 5, '*'); 
		//  * * * * *
		//  * * * *
		//  * * *
		//  * *
		//  *
		
		Dumbass.printRightTriangle("bottom right", 5, '*');
		//          *
		//        * *
		//      * * *
		//    * * * *
		//  * * * * *
		
		Dumbass.printRightTriangle("top right", 4, 'h');
		//  h h h h
		//    h h h
		//      h h
		//        h
		
		Dumbass.printRightTriangle("bottom left", 5, '0');
		//  0
		//  0 0
		//  0 0 0
		//  0 0 0 0
		//  0 0 0 0 0
	}
}		
```
