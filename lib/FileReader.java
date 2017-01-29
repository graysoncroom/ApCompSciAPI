package lib;

import java.io.*;
import java.util.Scanner;

public class FileReader {
	
	private File file;
	private Scanner fileReader;
	
	
	/**
	 * 
	 * @param fileName
	 * @throws FileNotFoundException
	 * 
	 */
	public FileReader(String fileName) {	
		this.file = new File(fileName);
		try {
			this.fileReader = new Scanner(this.file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String next(){return this.fileReader.next();}
	public String nextLine(){return this.fileReader.nextLine();}
	public int nextInt(){return this.fileReader.nextInt();}
	public double nextDouble(){return this.fileReader.nextDouble();}
	
	public boolean hasNext(){return this.fileReader.hasNext();}
	public boolean hasNextLine(){return this.fileReader.hasNextLine();}
	public boolean hasNextInt(){return this.fileReader.hasNextInt();}
	public boolean hasNextDouble(){return this.fileReader.hasNextDouble();}
	
	
	public String readLine(int numLineToRead) {
		if(numLineToRead > 0){
			numLineToRead--;
			this.skipLine(numLineToRead);
		}
		return this.nextLine();
		
	}
	
	// gets
	public String getFileName(){return this.file.getName();}
	
	// sets
	public void changeFile(String fileName) {
		this.file = new File(fileName);
		try {
			this.fileReader = new Scanner(this.file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// private methods
	private void skipLine(int numLinesToSkip){
		for(int i = 0; i < numLinesToSkip; i++){
			this.nextLine();
		}
	}
	
}
