package com.bridgeLabz.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
	public enum IOService {
		CONSOLE_IO, FILE_IO, REST_IO
	}

	private List<EmployeePayRollData> EmployeePayrollList;

	EmployeePayRollService(List<EmployeePayRollData> EmployeePayRollList) {
		this.EmployeePayrollList = EmployeePayRollList;
	}

	public static void main(String[] args) {
		List<EmployeePayRollData> EmployeePayRollList = new ArrayList<>();
		EmployeePayRollService employeePayRollService = new EmployeePayRollService(EmployeePayRollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayRollService.readEmployeePayRollData(consoleInputReader);
		employeePayRollService.writeEmployeePayRollData();
	}

	private void writeEmployeePayRollData() {
		System.out.println("\nWriting Employee Payroll Roaster to console\n"+ EmployeePayrollList);
	}

	private void readEmployeePayRollData(Scanner consoleInputReader) {
		System.out.println("Enter Employee ID:");
		int id=consoleInputReader.nextInt();
		System.out.println("Enter Employee Name:");
		String name=consoleInputReader.next();
		System.out.println("Enter Employee Salary");
		double salary=consoleInputReader.nextDouble();
		EmployeePayrollList.add(new EmployeePayRollData(id, name, salary));
	}
}
