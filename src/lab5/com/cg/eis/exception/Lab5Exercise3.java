/*Create an Exception class named as “EmployeeException”(User defined Exception) in a
 *  package named as “com.cg.eis.exception” and throw an exceptionif salary of an 
 *  employee is below than 3000. Use Exception Handling mechanism to handle exception properly.
 * */
package lab5.com.cg.eis.exception;

import java.util.Scanner;

public class Lab5Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of an employee");
		double salary = sc.nextDouble();
		InValidSalaryException(salary);

	}

	public static void InValidSalaryException(double salary) {
		try {
			if (salary < 3000) {
				throw new InValidSalaryException("Salary should be greater than 3000");
			} else {
				System.out.println("salary of an employee is :" + salary);
			}
		} catch (InValidSalaryException e) {
			System.out.println(e);
		}

	}

}
