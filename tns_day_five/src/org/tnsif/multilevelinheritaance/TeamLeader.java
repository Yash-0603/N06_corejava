package org.tnsif.multilevelinheritaance;
//child class1 nd parent class(B)
public class TeamLeader extends Manager {
	
	private String leaderName;
	private String projectName;
	
	//getters and setters
	
	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	//Parameterized Constructor
	public TeamLeader(String deptName, String name, int empID,String leaderName,String projectName) {
		super(deptName, name, empID);
		this.leaderName=leaderName;
		this.projectName=projectName;
	}
	
	//toString
	@Override
	public String toString() {
		return "TeamLeader [leaderName=" + leaderName + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
