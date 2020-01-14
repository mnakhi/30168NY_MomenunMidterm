package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String line = "";
		String data="";
		try {
			String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
			//String textFile = "C:\\Users\\hp\\Documents\\Midterm\\MidtermJuly2019\\src\\data\\self-driving-car.txt";
			fileReader = new FileReader(textFile);
			bufferedReader = new BufferedReader(fileReader);
//			String line = null;
//			String data="";
			while ((data=bufferedReader.readLine())!=null){
				System.out.println(data);
				line += data;
			}
			String[] store = line.split("\\W+");
			Stack<String >myStack = new Stack<String>();
			for (String s:store) {
				myStack.push(s);
			}

//			Iterator iterator = myStack.iterator();
//			while (iterator.hasNext()){
//				System.out.println(iterator.next());
//			}
			System.out.println("Searching for string Google's index: "+myStack.search("Google"));
			System.out.println();
			System.out.println("Using LIFO for Stack: ");
			while(!myStack.isEmpty()){
				System.out.println("peek: "+myStack.peek());
				System.out.println("pop: "+myStack.pop());
			}
			System.out.println();
			LinkedList<String>myList = new LinkedList<String>();
			for (String word:store) {
				myList.add(word);
			}

			System.out.println("Retrieving data using Fifo:");
			Iterator iterator1 = myList.iterator();
			while (iterator1.hasNext()){
				System.out.println(iterator1.next());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			bufferedReader.close();
			fileReader.close();
		}

	}

}
