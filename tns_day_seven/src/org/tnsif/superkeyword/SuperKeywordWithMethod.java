package org.tnsif.superkeyword;
class MET
{
	String ownerName="Chagan Bhujbal";
	void displayName()
	{
		System.out.println("Owner is:"+ownerName);
	}
}
class BKC extends MET
{
	String ownerName="Shefali Bhujbal";
	void displayName()
	{
		/* If Parent class and child class method name are same and if you want to access that method 
		 * inside child class,then usesuper.methodName();*/
		 
		super.displayName(); //It calls Parent class 1st.
		System.out.println("Owner is:"+ownerName);
	}
}
//Driver Class
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		
		BKC b = new BKC();
		b.displayName();
	}

}
