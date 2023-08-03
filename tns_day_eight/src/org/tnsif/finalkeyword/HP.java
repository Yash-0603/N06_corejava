package org.tnsif.finalkeyword;
//Child class
public class HP extends Laptop{

	final String processor="Intel I5";
	//final method
	/* We can't override the final method 
	 void display()
	{
		System.out.println(processor);
	}
	*/
	final void display(String processor)
	{
		System.out.println(processor);
	}

}
