package org.tnsif.hierarchicalinheritance;

public class SnowCore extends Android {
	
	private int version;
	
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
			return "SnowCore [version=" + version + ", toString()=" + super.toString() + "]";
		}


	//parameterized constructor
	public SnowCore(String brand, String slotType,int version) {
		super(brand, slotType);
		this.version=version;
		
		
	}
	
	
}
