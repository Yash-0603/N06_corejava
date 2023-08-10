package org.tnsif.uncheckedexception;

public class FinallyBlockNotExecutedExecutor {

	
		
		static void display(int arr[])
		{
			try
			{
				System.out.println(arr[2]);
				/* if try and catch block contains  a System.exit(0) after the exception
				 * code line,then finally block doesn't execute*/
				System.exit(0);

			}
			catch(Exception e)
			{
				System.out.println("Exception Handled"+e);
				System.exit(0);

				
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



