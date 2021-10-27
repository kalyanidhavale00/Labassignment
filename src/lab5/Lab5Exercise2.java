/* Write a Java Program to validate the full name of an employee. 
 * Create and throw a user defined exception if firstName and lastName is blank.
 * */
package lab5;

import java.util.Scanner;
class InValidException extends Exception{

	public InValidException(String msg) {
		System.out.println(msg);
	}
	
}
public class Lab5Exercise2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Name : ");
		String firstName = sc.nextLine();
		System.out.println("Enter Your Last Name : ");
		String lastName = sc.nextLine();
		try {
			if(firstName.isEmpty() || lastName.isEmpty()) {
				throw new InValidException("fistName and lastName should  not be blank");
			}
			else {
				System.out.println("First Name : " + firstName + "   Last Name : " + lastName);
			}
		}catch(InValidException e) {
			System.out.println(e);
		}
		
	}

}
