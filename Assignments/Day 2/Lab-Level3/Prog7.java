package Prog7;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String tableName = "";
		int numOfColumns = 0;
		String columnNames = "";
		int salary = 0;
		String sqlQuery = "";
		
		System.out.println("Table name: ");
		tableName = sc.nextLine();
		
		System.out.println("Number of Columns: ");
		

		try {
			numOfColumns = Integer.parseInt(sc.nextLine());
		}
		catch (Exception e) {
			System.out.println("Exception occured. " + e.getMessage());
		}
		
		for(int i = 0; i<numOfColumns; i++) {
			System.out.println("Column Name: ");
			
			columnNames += sc.nextLine();
			if(i != numOfColumns-1){
				columnNames += ", ";
			}
		}
		
		System.out.println("Salary value: ");
		try {
			salary = Integer.parseInt(sc.nextLine());
		}
		catch(Exception e) {
			System.out.println("Exception occured. " + e.getMessage());
		}
		
		sqlQuery = String.format("SELECT %s FROM %s WHERE salary > %s ", columnNames,tableName, salary);
		System.out.println(sqlQuery);

		sc.close();
	}
}
