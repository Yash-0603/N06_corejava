package org.tnsif.hierarchicalinheritance;

public class Tiramisu extends Android{

	private int version;
	
	//parameterized const
	public Tiramisu(String brand,String slotType,int version) {
		super(brand,slotType);
		this.version=version;
	}
	
	//getter setter
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	//toString
	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
