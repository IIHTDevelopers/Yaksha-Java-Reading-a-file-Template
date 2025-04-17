package com.yaksha.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) {
		// **Create a file instance**
		File file = new File("readFile.txt");

		try {
			// Check if the file exists
			if (!file.exists()) {
				System.out.println("File does not exist.");
				return;
			}

			// **Read the content of the file**
			Scanner reader = new Scanner(file);
			System.out.println("Reading content from the file:");
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred. File not found.");
			e.printStackTrace();
		}
	}
}
