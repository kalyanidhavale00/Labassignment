package pkg2;

import pkg1.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		System.out.println(emp1.getContactNo());
		 
		emp1.setEmpId(161);
		emp1.setName("kalyani");
		emp1.setAge(23);
		emp1.setContactNo("7721536489");
		System.out.println();
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		System.out.println(emp1.getContactNo());
	
		

	}

}
