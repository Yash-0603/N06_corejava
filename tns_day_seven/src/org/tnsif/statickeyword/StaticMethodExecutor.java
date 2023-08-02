package org.tnsif.statickeyword;

public class StaticMethodExecutor {
	
	//we can't 
	String str="BKC";
	static float percentage=78.9f;
	//static method
	/* if any method outside the main function and if you want to access that method inside the main
	 * function,make it as static.
	 */
	static void displayScore(int score)
	{
		System.out.println(percentage);
		//we can't use non-static variable inside static method
		//System.out.println(str);
		System.out.println("Score is:"+score);
	}

	public static void main(String[] args) {
		
		
		displayScore(66);

	}

}
