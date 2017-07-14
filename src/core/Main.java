/**
 * 
 */
package core;

import util.FileSaver;

/**
 * @author Aify
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Comment out the part that you're not using
		
		// Filesaver testing for Eddie:
		FileSaver.saveFileOverwrite("eddie.txt", "111111111");
		String first = FileSaver.readFile("eddie.txt");
		FileSaver.saveFileOverwrite("eddie.txt", "222222222");
		String second = FileSaver.readFile("eddie.txt");
		
		System.out.println(first + " " + second); // you should be see 111111111 222222222 as the output
		
	
//		// Filesaver testing for Eric:
//		FileSaver.saveFileAppend("eric.txt", "Hello world\n");
//		FileSaver.saveFileAppend("eric.txt", "Good Bye World");
//		
//		String eric = FileSaver.readFile("eric.txt");
//		System.out.println(eric); // you should see Hello world
//								  //                Good Bye World 
//								  // as the output
//	}
//
	}
}
