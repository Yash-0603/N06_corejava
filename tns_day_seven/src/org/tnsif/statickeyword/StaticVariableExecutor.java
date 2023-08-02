package org.tnsif.statickeyword;

public class StaticVariableExecutor {
	/* static variable
	 * if any variable is outside the main function if you want to access that variable
	 * you can access by creating object or you can make variable as a static.
	 * 
	 * sharing the same particular memory to the all objects
	 */
	static String str="TNS India Foundation";
	public static void main(String[] args) {
		
		//System.out.println(str);
		/*StaticVariableExecutor s = new StaticVariableExecutor();
		System.out.println(s.str); */
		System.out.println(str);

	}

}
