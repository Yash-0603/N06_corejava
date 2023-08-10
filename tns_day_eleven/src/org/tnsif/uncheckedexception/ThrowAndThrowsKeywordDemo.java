package org.tnsif.uncheckedexception;

public class ThrowAndThrowsKeywordDemo {
	//throws is used to declare the exception
	static void isEligible(int age,int weight)throws ArithmeticException
	{
		if(age>18 && weight>50)
		{
			System.out.println("Person is eligible to donate the blood");
		}
		else
		{
			//throw keyword is used to throw an exception explicitly
			throw new ArithmeticException("Criteria is not satisfied");
		}
	}

	public static void main(String[] args) {
		try
		{
			isEligible(14,55);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}

}
