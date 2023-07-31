//Program to demonstrate on:
//this keyword is used t refer current instance of the class
package org.tnsif.thiskeyworddemo;
class Account
{
	long accountNo;
	void setData(long accountNo)
	{
		this.accountNo=accountNo;
	}
	void display()
	{
		System.out.println(accountNo);
	}
}
//Driver class
public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		
		Account a = new Account();
		a.setData(678836647L);
		a.display();
	}

}
