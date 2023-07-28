package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		Hdfc h=new Hdfc();
		
		//setting a value to private data members
		h.setAccType("Saving Account");
		h.setAccountNo(345627728L);
		h.setAtmCardNo(552627389L);
		h.setPinNo(1221);
		
		//System.out.println("Account no is:"+h.getAccountNo());
		//below line will call to toString() method
		System.out.println(h);
	}

}
