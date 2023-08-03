//Program to demonstrate Method Overriding concept.
package org.tnsif.polymorphism;
class ChiefMinister
{
	static void curruption(String str1,float amount)
	{
		System.out.println(str1+" Currepted the amount of "+amount);
	}
}
class MLA extends ChiefMinister
{
	static void curruption(String str2,float amount2)
	{
		ChiefMinister.curruption("Eknath Shinde", 547746.8f);
		System.out.println(str2+" Currepted the amount of "+amount2);
	}
}
//Driver class
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		
		MLA.curruption("Chagan Bhujbal ",1500000.7f);
	}

}
