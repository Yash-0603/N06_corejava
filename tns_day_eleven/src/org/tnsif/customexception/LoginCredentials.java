package org.tnsif.customexception;
//program to demonstrate custom exception
public class LoginCredentials extends Exception {
	
	//getter setter
	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	//Constructor using fields
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}
	
	//toString method
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	

}
