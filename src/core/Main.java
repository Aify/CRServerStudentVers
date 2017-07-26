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
			ServerSocket Server = new ServerSocket(9876);       //creates a new server
	    
		Socket client= Server.accept();    //Accepts connection request of the other person
		Socket clientTwo= Server.accept();
		
		System.out.println("CONNECTED");    //it will say CONNECTED if the server works with the other person
		
		InputStream in = client.getInputStream();        //Save the input stream 
		OutputStream out = client.getOutputStream();     //Save the output stream
		InputStream in1 = clientTwo.getInputStream();
		OutputStream out1 = clientTwo.getOutputStream();
		
		Thread t;             //Create a new runnable thread
		t = new Thread(new Runnable() {     

			@Override
			public void run() {                   //Telling what the thread will do
				// TODO Auto-generated method stub
				Scanner inscan = new Scanner(in1);      //Scanner will help u connect to the input stream
				while(true) {
					String x = inscan.nextLine();
					System.out.println(x);
				}
			}});
		t.start();                //Start running the thread
		
		PrintStream printout = new PrintStream(out);
		Scanner userinput = new Scanner(System.in);    //Scanner connects the keyboard
		
		while (true) {
			printout.println(userinput.nextLine());
			printout.flush();
			
		
		}} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	
		
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
}
