package design;

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
	public static void main(String[] args) {
		Employee em1 = new EmployeeInfo("John Doe",123,"Finance",50000.99,'M');
		System.out.println(EmployeeInfo.calculateEmployeeBonus(50000,100));
		em1.benefitLayout();
		System.out.println("************************");
		EmployeeInfo em2 = new EmployeeInfo("James Watson",124,"IT",'M',"11/12/2019",4.2);
		em2.gettingPromoted(4.2);
		System.out.println(em2.getCOMPANY_ADDRESS());


	}

}
