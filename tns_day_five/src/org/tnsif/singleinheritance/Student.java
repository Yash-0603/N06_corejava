package org.tnsif.singleinheritance;
//child class
public class Student extends Citizen {
	
	//private data members
	private int rollNo;
	private String college;
	
	//generate getter and setters
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	//parameterized constructor
	
	public Student(String city, int pincode, String area, long adharNo,int rollNo,String college) {
			
		super(city, pincode, area, adharNo); //for calling default constructor in parent class
		this.rollNo=rollNo;
		this.college=college;
			
	}
	
	//toString
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", college=" + college + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
