package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String, List<String>>list = new HashMap<String, List<String>>();
		String studentName1 = "Ashley";
		String studentName2 = "Ron";
		String studentName3 = "Charlie";
		String studentName4 = "Rachel";

		List<String>student1Info = new LinkedList<String>();
		student1Info.add("123 Fake Street");
		student1Info.add("xyz@gmail.com");

		List<String>student2Info = new LinkedList<String>();
		student2Info.add("456 Fake Street");
		student2Info.add("pqr@gmail.com");

		List<String>student3Info = new LinkedList<String>();
		student3Info.add("789 Fake Street");
		student3Info.add("abc@gmail.com");

		List<String>student4Info = new LinkedList<String>();
		student4Info.add("135 Fake Street");
		student4Info.add("uvw@gmail.com");

		list.put(studentName1,student1Info);
		list.put(studentName2,student2Info);
		list.put(studentName3,student3Info);
		list.put(studentName4,student4Info);

		System.out.println("Using for each loop to retrieve data : ");
		for(Map.Entry m:list.entrySet()){
			System.out.println("Key = "+m.getKey()+ " , "+"Value = "+m.getValue());
		}
		System.out.println();
		System.out.println("Using while loop with iterator to retrieve data : ");
		Iterator <Map.Entry<String, List<String>>>iterator= list.entrySet().iterator();
		while (iterator.hasNext()){
			Map.Entry<String, List<String>>entry = iterator.next();
			System.out.println("Key = "+entry.getKey()+" , "+"Value= "+entry.getValue());
		}

	}

}
