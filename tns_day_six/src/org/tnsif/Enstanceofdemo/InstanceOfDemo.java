package org.tnsif.Enstanceofdemo;
class RBI
{
	protected String ifscCode="RBISONGPA01";
	
}
class SBI extends RBI
{
	public SBI() {
		super.ifscCode="RBISONGPA01";
		String ifscCode="SBIN0002161";
		System.out.println(ifscCode);
		
		/* If parent class and child class variable name are same,in such case ,use super.
		 * variable name to access that variable of parent class inside the child class.
		 * 
		 */
		
		System.out.println(super.ifscCode);
		
	}
}
//Program to demonstrate instance of operator
public class InstanceOfDemo {

	public static void main(String[] args) {
		
		SBI s = new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);
	}

}
