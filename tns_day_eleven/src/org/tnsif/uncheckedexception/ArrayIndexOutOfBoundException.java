package org.tnsif.uncheckedexception;

public class ArrayIndexOutOfBoundException {

	
		
		static void display(int arr[])
		{
			try
			{
				System.out.println(arr[3]);
				

			}
			catch(Exception e)
			{
				System.out.println("Exception Handled"+e);

				
			}
			finally
			{
				System.out.println("Finally Block is always executed");
			}
			System.out.println("Any statement out of the block is always "+"executed");
		}
		public static void main(String[] args) {
			int arr[]= {1,6,9};
			display(arr);
		}
	}



