package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import databases.ConnectToSqlDB;

public class UseArrayList {

	public static void main(String[] args) throws SQLException {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String>studentName = new ArrayList<>();
		studentName.add("John");
		studentName.add("Chris");
		studentName.add("Jenny");
		studentName.add("Mike");
		studentName.add("Tom");
		studentName.add("Sherry");
		studentName.add("Alex");
		studentName.add("Nancy");

		studentName.remove("Tom"); //Removes Tom from the list
		studentName.remove(2);// Removes element of index 2 which is Jenny
		System.out.println(studentName.get(3)); // It prints out the element of index 3, here the updated index 3's element is Sherry

		System.out.println("");
		System.out.println("Using for each loop to retrieve data: ");
		for (String s:studentName) {
			System.out.println(s);
		}
		System.out.println(" ");
		System.out.println("Using while loop with iterator to retrieve data:");
		Iterator iterator = studentName.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		sqlConnection();


	}
	public static void sqlConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/midterm?serverTimezone=UTC";
		String user = "root";
		String password="Queen!&(20)";
		Connection connection = null;
		Statement statement = null;

		try{
			connection = DriverManager.getConnection(url,user,password);
			statement = connection.createStatement();
			String query="insert into usearraylist(id,studentname) values (7,'Zim');";
			statement.execute(query);
			System.out.println("extra student added");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		}
		finally {
			statement.close();
			connection.close();
		}

	}

}
