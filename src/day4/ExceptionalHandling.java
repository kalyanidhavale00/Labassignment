
package day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Exceptional Handling
 * 
 *   stmt 1
 *   stmt 2
 *   stmt 3 // syntax / unexc
 *   stmt 4
 *   stmt 5
 *   
 *  Keywords:
 *   try , catch, finally, throw, throws
 *   
 *  Types of exceptions
 *   Checked  
 *         SQLException
 *         ClassNotFoundExcetion
 *         IOException
 *   Unchecked exceptions
 *         RunTimeExcetion
 *            ArithmeticExeption
 *            NullPointerException
 *            ArrayIndexOutOfBoundException
 *            NumberFormatException
 *            ClassCastException
 *   
 *  Errors - can't be handled using exceptional handling
 *  
 *  Parent class for exceptions - Throwable
 *  
 *  Throwable - Exception
 *                 SQLException
 *                 ClassNotFoundExcetion
 *                 IOException
 *                 RunTimeExcetion
 *                     ArithmeticExeption
 *                     NullPointerException
 *                     ArrayIndexOutOfBoundException
 *                     NumberFormatException
 *                     ClassCastException
 *              Error
 *  
 *  
 *  try-catch
 *  try-catch-finally
 *  try-finally
 *  try-catch-catch-catch
 *  try-catch-catch-finally
 *  
 *  
 *  multiple catch blocks
 *  nested try
 *  finally block
 *  throw keyword
 *  throws keyword
 *  custom exceptions
 */
public class ExceptionalHandling {

	Scanner sc; // declaration - null

	String str; // null

	public static void main(String[] args) throws FileNotFoundException {
		;// from static area - we can access only static members

		
		// Custom Exception
		try {
			ExceptionalHandling e = new ExceptionalHandling();

			System.out.println(e.sc); // null
			
			// Instantiating
			e.sc = new Scanner(System.in);
			try {
				System.out.println(e.div());
			} catch (InvalidNumberException e1) {
				e1.printStackTrace();
			}
			
			//System.out.println("Enter number: "); // 10
			//System.out.println(e.sc.nextInt()); // NullPointerException
			try {
				System.out.println(5 / 2); // ArithmeticException

			} catch (NullPointerException ex) {
				ex.printStackTrace();
			}

			int x = 100;
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		
		
		/*
		// nested try-catch
		try {
			ExceptionalHandling e = new ExceptionalHandling();
			System.out.println(e.sc); // null
			
			// Instantiating
			e.sc = new Scanner(System.in);
			System.out.println(e.div());
			
			//System.out.println("Enter number: "); // 10
			//System.out.println(e.sc.nextInt()); // NullPointerException
			try {
				System.out.println(5 / 2); // ArithmeticException
			} catch (NullPointerException ex) {
				ex.printStackTrace();
			}
			int x = 100;
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		*/

		/*
		 * // try-catch-finally try { ExceptionalHandling e = new ExceptionalHandling();
		 * 
		 * System.out.println(e.sc); // null
		 * 
		 * // Instantiating e.sc = new Scanner(System.in);
		 * System.out.println("Enter number: "); // 10
		 * System.out.println(e.sc.nextInt()); // NullPointerException
		 * 
		 * 
		 * System.out.println(5 / 10); // ArithmeticException
		 * 
		 * // calling method //System.out.println(e.div());
		 * 
		 * int[] x = new int[5]; x[0] = 1; x[1] = 2; x[2] = 3; x[4] = 5; //
		 * ArrayIndexOutOfBoundException
		 * 
		 * String str = "Hello World"; System.out.println(str.charAt(15)); //
		 * StringIndexOutOfBoundException
		 * 
		 * // byte values = -128 to 127 byte y = (byte) 10.45f; System.out.println(y);
		 * 
		 * 
		 * } catch (ArithmeticException | ArrayIndexOutOfBoundsException |
		 * StringIndexOutOfBoundsException e) { e.printStackTrace(); } catch(Exception
		 * e) { e.printStackTrace(); } finally { System.out.println("Inside finally"); }
		 * 
		 */

		/*
		 * // try -finally try { ExceptionalHandling e = new ExceptionalHandling();
		 * 
		 * System.out.println(e.sc); // null
		 * 
		 * // Instantiating e.sc = new Scanner(System.in);
		 * System.out.println("Enter number: "); // 10
		 * System.out.println(e.sc.nextInt()); // NullPointerException
		 * 
		 * 
		 * System.out.println(5 / 10); // ArithmeticException
		 * 
		 * // calling method //System.out.println(e.div());
		 * 
		 * int[] x = new int[5]; x[0] = 1; x[1] = 2; x[2] = 3; x[4] = 5; //
		 * ArrayIndexOutOfBoundException
		 * 
		 * String str = "Hello World"; System.out.println(str.charAt(15)); //
		 * StringIndexOutOfBoundException
		 * 
		 * // byte values = -128 to 127 byte y = (byte) 10.45f; System.out.println(y);
		 * 
		 * 
		 * } finally { System.out.println("Inside finally"); }
		 * 
		 */

		/*
		 * Multi catch block try { ExceptionalHandling e = new ExceptionalHandling();
		 * 
		 * System.out.println(e.sc); // null
		 * 
		 * // Instantiating e.sc = new Scanner(System.in);
		 * System.out.println("Enter number: "); // 10
		 * System.out.println(e.sc.nextInt()); // NullPointerException
		 * 
		 * 
		 * System.out.println(5 / 0); // ArithmeticException
		 * 
		 * // calling method //System.out.println(e.div());
		 * 
		 * int[] x = new int[3]; x[0] = 1; x[1] = 2; x[2] = 3; x[4] = 5; //
		 * ArrayIndexOutOfBoundException
		 * 
		 * String str = "Hello World"; System.out.println(str.charAt(10)); //
		 * StringIndexOutOfBoundException
		 * 
		 * // byte values = -128 to 127 byte y = (byte) 10.45f; System.out.println(y);
		 * 
		 * 
		 * } catch (ArithmeticException | ArrayIndexOutOfBoundsException |
		 * StringIndexOutOfBoundsException e) { e.printStackTrace(); } catch(Exception
		 * e) { e.printStackTrace(); }
		 * 
		 */

		/*
		 * // Multiple try-catch blocks try { ExceptionalHandling e = new
		 * ExceptionalHandling();
		 * 
		 * System.out.println(e.sc); // null
		 * 
		 * // Instantiating //e.sc = new Scanner(System.in);
		 * System.out.println("Enter number: "); // 10
		 * System.out.println(e.sc.nextInt()); // NullPointerException
		 * 
		 * 
		 * System.out.println(5 / 6); // ArithmeticException
		 * 
		 * // calling method //System.out.println(e.div());
		 * 
		 * int[] x = new int[3]; x[0] = 1; x[1] = 2; x[2] = 3; x[4] = 5; //
		 * ArrayIndexOutOfBoundException
		 * 
		 * String str = "Hello World"; System.out.println(str.charAt(10)); //
		 * StringIndexOutOfBoundException
		 * 
		 * // byte values = -128 to 127 byte y = (byte) 10.45f; System.out.println(y);
		 * 
		 * 
		 * } catch (ArithmeticException e) {
		 * System.out.println("Inside ArithmeticException block"); e.printStackTrace();
		 * } catch (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Inside AIOBEX"); e.printStackTrace(); } catch
		 * (StringIndexOutOfBoundsException e) { e.printStackTrace(); } catch(Exception
		 * e) { e.printStackTrace(); }
		 * 
		 */

		// File ff = new File("C:\\temp");

		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

	}

	int div() throws InvalidNumberException {
		;// non static area - can access both static & non static members
			// Scanner sc = new Scanner(System.in); // option1
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		if(num2==0) {
			//throw new ArithmeticException("Second number should be greater than 0");
			throw new InvalidNumberException("Number should be greater than 0");
		}
		
		int result = num1 / num2;
		// System.out.println(result);
		return result;
	}
	
	

}


