package projectB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Company {

	public static void main(String[] args) {

		int option = 0, month, day, year, id;
		String name, position;
		Scanner kb = new Scanner(System.in);

		System.out.println("Hello, please choose from the following options :");
		System.out.println("1: Search all employees information hired after a date");
		System.out.println("2: Write employee information to a file");
		System.out.println("3: Read employee information from a file");
		while (option != 1 && option != 2 && option != 3) {

			System.out.print("Please enter a number (1-3):");
			option = kb.nextInt();
			System.out.println();
			
		}

		if (option == 1) {

			System.out.print("Please enter the month of a particular date: ");
			month = kb.nextInt();
			System.out.print("Please enter the day of a particular date: ");
			day = kb.nextInt();
			System.out.print("Please enter the year of a particular date: ");
			year = kb.nextInt();
			System.out.println();
			System.out.println("Employee information after " + month + "-" + day + "-" + year + " :");
			List<Employee> emp = employeeInfo(month, day, year);
			for (Employee e : emp) {
				System.out.println(e.toString());
			}

		} else if (option == 2) {
			System.out.print("Please enter the name of the employee: ");
			name = kb.next();
			System.out.print("Please enter the ID of the employee: ");
			id = kb.nextInt();
			System.out.print("Please enter the hire month of the employee: ");
			month = kb.nextInt();
			System.out.print("Please enter the hire day of the employee: ");
			day = kb.nextInt();
			System.out.print("Please enter the hire year of the employee: ");
			year = kb.nextInt();
			System.out.print("Please enter the position of the employee: ");
			position = kb.next();
			Employee emp = new Employee(name, id, new Date(month, day, year), position);
			writeToFile(emp);

		} else if (option == 3) {
			readFromFile();
		}

	}

	public static List<Employee> employeeInfo(int p_month, int p_day, int p_year) {
		
		List<Employee> subEmployeeList = new ArrayList<Employee>();
		int id, month, day, year;
		String name, position, date;
		Scanner sc = null;
		try {
			sc = new Scanner(new FileInputStream("src/projectB/EmployeeList.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("The file didn't found");
			System.out.println("Terminate");
			System.exit(0);
		}

		while (sc.hasNext()) {
			name = sc.next();
			id = sc.nextInt();
			date = sc.next();
			position = sc.next();
			
			String[] dateString = date.split("-");
		
			month = Integer.parseInt(dateString[0]);
			day = Integer.parseInt(dateString[1]);
			year = Integer.parseInt(dateString[2]);
			
			if(year>p_year || year==p_year && month>p_month || year==p_year && month==p_month && day>p_day) {
				
				subEmployeeList.add(new Employee(name,id,new Date(month,day,year),position));
			}
		}
		return subEmployeeList;

	}

	public static void writeToFile(Employee emp) {

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream("src/projectB/EmployeeList.txt", true));
		} catch (FileNotFoundException e) {
			System.out.println("The file didn't found");
			System.out.println("Terminate");
			System.exit(0);
		}
		pw.println(emp.toString());
		pw.close();
		System.out.println("Employee information entering succeed!");
	}

	public static void readFromFile() {

		int id;
		String name, position, date;
		Scanner sc = null;
		try {
			sc = new Scanner(new FileInputStream("src/projectB/EmployeeList.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("The file didn't found");
			System.out.println("Terminate");
			System.exit(0);
		}

		System.out.println("Employee Information List:");
		while (sc.hasNext()) {
			name = sc.next();
			id = sc.nextInt();
			date = sc.next();
			position = sc.next();
			System.out.println(name + "	" + id + "	" + date + "	" + position);

		}

	}

}
