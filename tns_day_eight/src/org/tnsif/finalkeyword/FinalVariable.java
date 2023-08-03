//Program to demonstrate on final keyword
package org.tnsif.finalkeyword;

public class FinalVariable {

	/* Final variable must be initialized during declaration*/
	//final int x;
	final float SALARY=67000.78f;
	
	void print()
	{
		/* We can't change the value of final variable */
		//SALARY=89000.76F;
		System.out.println("Salary is:"+SALARY);
	}

}
