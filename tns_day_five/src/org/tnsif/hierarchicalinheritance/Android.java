package org.tnsif.hierarchicalinheritance;

public class Android {

		private String brand;
		private String slotType;
		
		
		public Android(String brand, String slotType) {
			super();
			this.brand = brand;
			this.slotType = slotType;
		}
		//getter setter
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getSlotType() {
			return slotType;
		}
		public void setSlotType(String slotType) {
			this.slotType = slotType;
		}
		
		//toString
		@Override
		public String toString() {
			return "Android [brand=" + brand + ", slotType=" + slotType + "]";
		}
		
		
		
		
}
