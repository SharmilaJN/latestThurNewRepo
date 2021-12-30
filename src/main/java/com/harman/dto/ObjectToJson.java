package com.harman.dto;
//import com.google.gson.Gson;

public class ObjectToJson {
	
	
	private static CellularInfo cellInfo = new CellularInfo();
	private static CellularInfo getObjectData (CellularInfo info) {
		
		info.setCity("pune");
		info.setPhNo("9028");		
		return info;		
		}
	
	public static void convertToJson() {
		
	cellInfo = new CellularInfo();
	
	cellInfo=getObjectData(cellInfo);
	
	//return new Gson().toJson(cellInfo);
		
}	


		
}

