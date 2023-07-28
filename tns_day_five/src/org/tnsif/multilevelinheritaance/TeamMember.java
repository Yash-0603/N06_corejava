package org.tnsif.multilevelinheritaance;

public class TeamMember extends TeamLeader{
	
	//data members
	private int size;
	private int duration;
	
	//getters and setters

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	//Parameterized Constructor
	public TeamMember(String deptName, String name, int empID, String leaderName, String projectName,int size,int duration) {
		super(deptName, name, empID, leaderName, projectName);
		this.size=size;
		this.duration=duration;
	}
	
	//toString
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	

}
