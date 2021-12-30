package com.harman.dto;

public class CellularInfo {
			
		private String city;
		private String phNo;
		
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getPhNo() {
			return phNo;
		}
		public void setPhNo(String phNo) {
			this.phNo = phNo;
		}
		
		@Override
		public String toString() {
			return "CellularInfo [city=" + city + ", phNo=" + phNo + "]";
		}


	


}

