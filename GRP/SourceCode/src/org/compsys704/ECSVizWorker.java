package org.compsys704;

import java.util.Arrays;
import java.util.List;
import org.omg.PortableServer.POAManagerPackage.State;

public class ECSVizWorker extends Worker{
	
	@Override
	public void setSignal(boolean status) {
		switch(signame){
		
		case "officeAC":
			States.OFFICE_AC_ON = status;
			break;
			
//		case "officeACOffE":
//			States.OFFICE_AC_OFF = status;
//			break;
			
		case "storageAC":
			States.STORAGE_AC_ON = status;
			break;
			
//		case "storageACOffE":
//			States.STORAGE_AC_OFF = status;
//			break;
			
		case "manufactureAC":
			States.MANUFACTURE_AC_ON = status;
			break;
			
//		case "manufactureACOffE":
//			States.MANUFACTURE_AC_OFF = status;
//			break;

		case "officeHeater":
			States.OFFICE_HEATER_ON = status;
			break;
			
//		case "officeHeaterOffE":
//			States.OFFICE_HEATER_OFF = status;
//			break;
		
		case "officeLight100":
			States.OFFICE_LIGHT_100 = status;
			break;
			
		case "officeLight80":
			States.OFFICE_LIGHT_80 = status;
			break;
			
		case "officeLight50":
			States.OFFICE_LIGHT_50 = status;
			break;
			
		case "officeLight0":
			States.OFFICE_LIGHT_0 = status;
			break;
			
		case "storageLight100":
			States.STORAGE_LIGHT_100 = status;
			break;
			
		case "storageLight80":
			States.STORAGE_LIGHT_80 = status;
			break;
			
		case "storageLight50":
			States.STORAGE_LIGHT_50 = status;
			break;
			
		case "storageLight0":
			States.STORAGE_LIGHT_0 = status;
			break;

		case "manufactureLight100":
			States.MANUFACTURE_LIGHT_100 = status;
			break;
			
		case "manufactureLight80":
			States.MANUFACTURE_LIGHT_80 = status;
			break;
			
		case "manufactureLight50":
			States.MANUFACTURE_LIGHT_50 = status;
			break;
		
		case "manufactureLight0":
			States.MANUFACTURE_LIGHT_0 = status;
			break;
			
		case "officeSiren":
			States.OFFICE_SIREN_ON = status;
			break;
			
//		case "officeSirenOffE":
//			States.OFFICE_SIREN_OFF = status;
//			break;
			
		case "storageSiren":
			States.STORAGE_SIREN_ON = status;
			break;
			
//		case "storageSirenOffE":
//			States.STORAGE_SIREN_OFF = status;
//			break;
			
		case "manufactureSiren":
			States.MANUFACTURE_SIREN_ON = status;
			break;
			
//		case "manufactureSirenOffE":
//			States.MANUFACTURE_SIREN_OFF = status;
//			break;
		
		case "officeOccupancy":
			States.OFFICE_OCCUPANCY_ON = status;
			break;
			
		case "storageOccupancy":
			States.STORAGE_OCCUPANCY_ON = status;
			break;
			
		case "manufactureOccupancy":
			States.MANUFACTURE_OCCUPANCY_ON = status;
			break;
			
		case "officeDehumidifier":
			States.OFFICE_HUMIDITY_ON = status;
			break;
			
		case "storageDehumidifier":
			States.STORAGE_HUMIDITY_ON = status;
			break;
			
		case "manufactureDehumidifier":
			States.MANUFACTURE_HUMIDITY_ON = status;
			break;
			
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("officeAC", "storageAC", "manufactureAC", 
			"officeHeater","officeLight100","officeLight80","officeLight50","officeLight0",
			"storageLight100","storageLight80","storageLight50","storageLight0",
			"manufactureLight100","manufactureLight80","manufactureLight50","manufactureLight0",
			"officeSiren","storageSiren","manufactureSiren",
			"officeOccupancy","storageOccupancy","manufactureOccupancy");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
