package design;

import databases.ConnectToSqlDB;
import parser.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws Exception {
		Employee em1 = new EmployeeInfo("John Doe",123,"Finance",50000,'M');
		System.out.println(EmployeeInfo.calculateEmployeeBonus(50000,4.9));
		em1.benefitLayout();
		System.out.println("************************");
		EmployeeInfo em2 = new EmployeeInfo("James Watson",124,"IT",'M',"11/12/1990",4.2);
		em2.gettingPromoted(4.2);
		System.out.println(em2.getCOMPANY_ADDRESS());
		System.out.println("**********************");
		EmployeeInfo em3 = new EmployeeInfo("John Snow",125,"HR",'M',"10/03/1980",3.4);
		em2.gettingPromoted(3.4);

		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
		List<Object> emp1 = new ArrayList<Object>();
		emp1.add(em1.employeeName());
		emp1.add(em1.employeeId());
		emp1.add(em1.calculateSalary());

		List<Object> emp2 = new ArrayList<Object>();
		emp2.add(em2.employeeName());
		emp2.add(em2.employeeId());
		emp2.add(em2.calculateSalary());

		List<Object> emp3 = new ArrayList<Object>();
		emp3.add(em3.employeeName());
		emp3.add(em3.employeeId());
		emp3.add(em3.calculateSalary());

		employeeInfo.put(1,emp1);
		employeeInfo.put(2,emp2);
		employeeInfo.put(3,emp3);

		ConnectToSqlDB connect = new ConnectToSqlDB();
		ConnectToSqlDB.connectToSqlDatabase();

		connect.createTableFromStringToMySql("employee_record","emp_info");

		connect.insertDataFromArrayListToSqlTable((List<Student>) employeeInfo,"employee_record","emp_info");

		//converting List<Object> to List<String>
		List<String> stringList = new ArrayList<String>();
		List<Object> objectList = Arrays.asList(stringList.toArray());

		connect.readDataBase("employee_record","emp_info");


	}

}
