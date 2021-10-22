package day5;

public class ClassInheritance {

	public static void main(String[] args) {
		//Parent class 
		Person p=new Person();
	   System.out.println("age is "+p.age);
	   System.out.println("name is: "+p.name);
	   
	   p.speak();
	   p.walk();
	   
	   //child student class
	   
	   Student s=new Student();
	   System.out.println(" Age is "+s.age);
	   System.out.println("Name is "+s.name);
	   System.out.println("Marks is "+s.marks);
	   System.out.println("Roll no is "+s.rollNo);
	   s.exam();
	   s.speak();
	   s.study();
	   s.walk();
	   
	   //child Employee class
	   Employee e=new Employee();
	   System.out.println("Age is "+e.age);
	   System.out.println(" Employee id is "+e.empId);
	   System.out.println("Name of employee "+e.name);
	   System.out.println("Role of employee "+e.role);
	   e.m1();
	   e.speak();
	   e.walk();
	   
	   //reference is parent and object type is child
	   //when we have to override any method then this case is used
	   Person p1=new Employee();
	   System.out.println("Age is "+p1.age);
	   System.out.println("Name is "+p1.name);
	   p1.walk();
	   p1.speak();
	   
	   
	   //multilevel inheritance
	   Admin a=new Admin();
	   System.out.println("Age is "+a.age);
	   System.out.println("Employee id  is "+a.empId);
	   System.out.println("Name is "+a.name);
	   System.out.println("Role is"+a.role);
	   a.m1();
	   a.m2();
	   a.speak();
	   a.walk();
	}

}
