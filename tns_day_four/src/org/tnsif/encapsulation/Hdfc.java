//program to demonstrate on Encapsulation
/*Encapsulation achieves a data hiding using private access 
 * specifier */
 
package org.tnsif.encapsulation;
public class Hdfc {
	
	//private data members
	private String accType;
	private long accountNo;
	private long atmCardNo;
	
	//getter setter method
	/* to access private data member in child/other class */
	private int pinNo;
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	//toString method >> used to print the object
	@Override
	public String toString() {
		return "Hdfc [accType=" + accType + ", accountNo=" + accountNo + ", atmCardNo=" + atmCardNo + ", pinNo=" + pinNo
				+ ", getAccType()=" + getAccType() + ", getAccountNo()=" + getAccountNo() + ", getAtmCardNo()="
				+ getAtmCardNo() + ", getPinNo()=" + getPinNo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
