package org.tnsif.polymorphism;
class Bollywood
{
	 //method overloading in terms of by passing the different no of argument.
	static String showCouple(String str1,String str2)
	{
		return str1+" loves "+ str2;
	}
	
	static String showCouple(String str1,String str2,String str3)
	{
		return str1+" loves "+ str2 +" As well as "+str3;
	}
}

public class MethodOverlodingExecutor {

	public static void main(String[] args) {
		
		System.out.println(Bollywood.showCouple("Salman","Aishwarya","Jacklin"));
		System.out.println(Bollywood.showCouple("salman", "Aishwarya"));

		
	}

}
