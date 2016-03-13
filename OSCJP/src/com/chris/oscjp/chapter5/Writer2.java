package com.chris.oscjp.chapter5;
import java.io.*;

class Writer2 {
	public static void main(String [] args) {
		char[] in = new char[50];						 // to store input
		int size = 0;
		try {
			File file = new File("fileWrite2.txt"); 	// just an object
			
			FileWriter fw =	new FileWriter(file); 		// create an actual file
														// & a FileWriter obj
			fw.write("howdy\nfolks\n"); 				// write characters to
														// the file
			fw.flush(); 								// flush before closing
			fw.close(); 								// close file when done
			FileReader fr =	new FileReader(file); 		// create a FileReader
														// object
			size = fr.read(in); 						// read the whole file!
			System.out.println(size + " "); 			// how many bytes read
			int cntr = 0;
			for(char c : in) {							// print the array
				{
				if(c != (int) 0)
					System.out.println(cntr + " " +c);
					cntr++;
				}
			}
			fr.close(); 								// again, always close
		} catch(IOException e) {
			e.printStackTrace();
		}
		readFile();
	}
	public static void readFile(){
		File file =	new File("fileWrite2.txt"); 				// create a File object AND
																// open "fileWrite2.txt"
				FileReader fr = null;
				try {
					fr = new FileReader(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 												// create a FileReader to get
																// data from 'file'
				BufferedReader br =	new BufferedReader(fr); 	// create a BufferReader to
																// get its data from a Reader
				try {
					String data = br.readLine();
					System.out.print(" Data = " + data);
				} catch (IOException e) {
																// TODO Auto-generated catch block
					e.printStackTrace();
				}												// read some data
				
	}
}