/*
 * count the number of line,words and character in a file*/
package lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab3Exercise5 {

	public static void main(String[] args) {
		BufferedReader bf = null;
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		try {
			bf = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\eclipse\\CoreJava\\src\\lab3\\abc"));

			// Reading the first line into currentLine
			String currentLine = bf.readLine();

			// for reading the file upto end if the file
			while (currentLine != null) {

				// updating the lineCount
				lineCount++;
				String words[] = currentLine.split(" ");
				wordCount = wordCount + words.length;
				for (String word : words) {
					charCount = charCount + word.length();
				}
				// for reading next line
				currentLine = bf.readLine();
			}
			System.out.println("Number of character in a file : " + charCount);
			System.out.println("Number of words in a file : " + wordCount);
			System.out.println("Number of lines in a file : " + lineCount);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// bf.close();
		finally {
			try {
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
