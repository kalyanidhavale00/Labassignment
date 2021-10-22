package day5;

public class Employee extends Person {
      int empId;
      String role;
      
      //override method from parent class
      void speak() {
    	  System.out.println("override method from parent class to Employee class speak method");
      }
      
    //override method from parent class
      void walk() {
    	  System.out.println(" override method from parent class to Employee class walk method");
      }
      void m1() {
    	  System.out.println("Employee m1 method");
      }
}
