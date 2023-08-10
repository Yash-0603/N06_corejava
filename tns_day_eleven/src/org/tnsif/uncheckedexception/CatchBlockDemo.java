package org.tnsif.uncheckedexception;
//Catch block with multiple exception class
public class CatchBlockDemo {
	static void print(int arr[])
	{
		try
		{
		System.out.println(arr[3]);
		}
		
		//We can use multiple catch blocks in program
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println("Exception Handled:"+e);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Handled: " +e);
		}
	}

	public static void main(String[] args) {
		int arr[]= {12,3,14};
		print(arr);
	}

}
