package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileSaver {
	
	private static boolean data;


	/**
	 * This function saves a string to a file, overwriting all its internal contents
	 * 
	 * @param filename which file we want to save it to
	 * @param contents contents of the file
	 * @return whether or not we successfully saved the file
	 */
	public static boolean saveFileOverwrite(String filename, String contents) {
		try {
			PrintWriter writer = new PrintWriter("OverWrite.txt", "UTF-8");
			writer.print("111111111");
			writer.print("222222222");
			writer.close();
		} catch (IOException e) {
			data = saveFileOverwrite(filename, contents);
			try {
				FileOutputStream out = new FileOutputStream("saveFileOverwrite");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		return false;
	}
	
	/**
	 * This function saves a string to a file, appending to the end of what's in the file
	 * 
	 * @param filename which file we want to save it to
	 * @param contents contents of the file
	 * @return whether or not we successfully saved the file
	 */
	public static boolean saveFileAppend(String filename, String contents) {
		
		
		return false;
	}
	
	
	public static String readFile(String filename) {
		
		String data = "";
		try {
			File f = new File(filename);
			
			if (!f.exists()) {
				return "";
			} 
			
			FileReader reader = new FileReader(f);
			
			while (reader.ready()) {
				data += (char) reader.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
}
