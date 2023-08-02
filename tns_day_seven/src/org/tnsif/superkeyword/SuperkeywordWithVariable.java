//Program to demonstrate on super keyword with variable
package org.tnsif.superkeyword;
class Building
{
	int floors=23;
	String name="Anantha-Astha";
}
class Flat extends Building
{
	String name="Chintamani Wankhede";
	
	void print()
	{
		/*If parent class and child class variable name are same and you want to 
		 access parent class variable inside child class.Use super.Variablename. */
		System.out.println(super.name);
		System.out.println(name);

	}

}
public class SuperkeywordWithVariable {

	public static void main(String[] args) {
		
		Flat f = new Flat();
		
		f.print();
		
	}

}
