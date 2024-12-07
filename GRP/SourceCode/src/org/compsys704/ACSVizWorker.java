package org.compsys704;
import java.util.Arrays;
import java.util.List;
import org.omg.PortableServer.POAManagerPackage.State;


public class ACSVizWorker extends Worker{
	
	@Override
	public void setSignal(boolean status) {
		switch(signame){

		case "SirenOnE":
			System.out.println("------- ");
			States.SIREN_ON = status;
			States.SIREN_OFF = false;
			break;
			
		case "SirenOffE":
			//System.out.println("yes siren is OFF ");
			States.SIREN_OFF = status;
			States.SIREN_ON = false;
			break;
			
		case "DoorLockE":
			System.out.println("------- ");
			States.DOOR_LOCK = status;
			States.DOOR_UNLOCK = false;
			
			break;
			
		case "DoorUnlockE":
			States.DOOR_UNLOCK = status;
			States.DOOR_LOCK = false;
			break;
			
		case "enableManufactureE":
			States.EnableManufactureE = status;
			States.DisableManufactureE = false;
			break;
			
		case "disableManufactureE":
			States.DisableManufactureE = status;
			States.EnableManufactureE = false;
			break;

		
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	static final List<String> signames = Arrays.asList("SirenOnE", "SirenOffE", "DoorLockE","DoorUnlockE","enableManufactureE","disableManufactureE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
