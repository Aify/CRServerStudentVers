/**
 * 
 */
package core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

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
		try {
			ServerSocket Server = new ServerSocket(9876); // creates a new
															// server

			Socket client = Server.accept(); // Accepts connection request of
												// the other person
			Socket clientTwo = Server.accept();

			System.out.println("CONNECTED"); // it will say CONNECTED if the
												// server works with the other
												// person

			InputStream in1 = client.getInputStream(); // Save the input stream
			OutputStream out1 = client.getOutputStream(); // Save the output
															// stream
			InputStream in2 = clientTwo.getInputStream();
			OutputStream out2 = clientTwo.getOutputStream();

			Thread threadone; // Create a new runnable thread
			threadone = new Thread(new Runnable() {

				@Override
				public void run() { // Telling what the thread will do
					// TODO Auto-generated method stub
					Scanner inscan = new Scanner(in1); // Scanner will help u
														// connect to the input
														// stream
					PrintStream printToTwo = new PrintStream(out2);

					while (true) {
						String x = inscan.nextLine();
						System.out.println("FROM IN ONE: " + x);
						printToTwo.println(x);
						printToTwo.flush();
					}
				}
			});
			threadone.start();
			
			Thread threadtwo; // Create a new runnable thread
			threadtwo = new Thread(new Runnable() {

				@Override
				public void run() { // Telling what the thread will do
					// TODO Auto-generated method stub
					Scanner inscan = new Scanner(in2); // Scanner will help u
														// connect to the input
														// stream
					PrintStream printToTwo = new PrintStream(out1);

					while (true) {
						String x = inscan.nextLine();
						System.out.println("FROM IN ONE: " + x);
						printToTwo.println(x);
						printToTwo.flush();
					}
				}
			});
			threadtwo.start();
			
			while (true) {
				
			}
			
		} // Start running the thread
		catch (Exception e) {

		}
	}
}
