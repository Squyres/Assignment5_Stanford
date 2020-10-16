/*
 * WordCount.java
 * By: Jameson Squyres
 * 
 * This program will ask the user for a filename, then it will
 * return the amount of lines, words, and chars in the file.
 */

import java.io.*;
import java.util.*;

public class WordCount {
	
	private static String fileName;
	private static int lines;
	private static int words;
	private static int chars;
	private static BufferedReader reader;
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		try {
			System.out.print("File: ");
			fileName = scan.nextLine();
			reader = new BufferedReader(new FileReader(fileName));
			while(true) {
				String currentLine = reader.readLine();
				if(currentLine == null) break;
					lines++;
					words += countWords(currentLine);
					chars += currentLine.length();
			}
			
			} catch(Exception e) {
				System.out.println("Error reading file.");
			}
			System.out.println("Lines = " + lines);
			System.out.println("Words = " + words);
			System.out.println("Chars = " + chars);
		}
	private static int countWords(String line) {
		String[] wordArray = line.split(" |\'");
		return wordArray.length;
	}
}