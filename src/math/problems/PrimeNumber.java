package math.problems;

import databases.ConnectToSqlDB;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		String primeNumbers = "";
		for (int i = 2; i <= 1000000; i++) {
			if(isPrime(i)==true){
				primeNumbers = primeNumbers + i+ " ";
			}
		}

		System.out.print("Prime numbers from 2 to 1000000 are: "+ primeNumbers);
		ConnectToSqlDB connectDB=new ConnectToSqlDB();

		int counter=0;
		try {
			connectDB.readDataBase("isprime","number");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static boolean isPrime(int numberToCheck) {
		for (int i = 2; i <= numberToCheck / 2; i++) {
			if (numberToCheck%i == 0) {
				return false;
			}
		}
		return true;

	}
}


