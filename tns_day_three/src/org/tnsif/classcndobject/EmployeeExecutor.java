//driver class
//program to demonstrate on class and object
package org.tnsif.classcndobject;
public class EmployeeExecutor {

	public static void main(String[] args) {
		//object creation
		Employee e = new Employee();
		e.empID=132981;
		e.empName="Shiwani Kumbhalkar";
		e.salary=78000;
		e.department="IT";
		
		//method call
		e.display();
	}

}
