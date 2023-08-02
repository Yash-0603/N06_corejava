package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	
	String str;
	static float salary;
	
	//only static variable can be initialized in static block.
	//and we can't initialized any non static variable inside static block
	static 
	{
		salary=2847488f;
		//non static variable so can't initialized.
		//str="BKC";
		System.out.println(salary);
	}
	

	public static void main(String[] args) {
		/* Main function is static and hence it calls static block,
		 * method and variable by default
		 */	
	}

}
