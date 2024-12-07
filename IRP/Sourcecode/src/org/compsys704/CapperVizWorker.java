package org.compsys704;

import java.util.Arrays;
import java.util.List;
import org.omg.PortableServer.POAManagerPackage.State;

public class CapperVizWorker extends Worker{
	
	@Override
	public void setSignal(boolean status) {
		switch(signame){
		case "bottleAtPos4E":
			break;
		
		case "gripperZAxisLiftedE":
			States.GRIPPER_LIFTED = status;
			break;
			
		case "gripperZAxisLoweredE":
			States.GRIPPER_LOWERED = status;
			break;
			
		case "bottleClampedE":
			States.BOTTLE_CLAMPED = status;
			break;
			
		case "bottleUnclampedE":
			States.BOTTLE_UNCLAMPED = status;
			break;
			
		case "capGrippedE":
			States.CAP_GRIPPED = status;
			break;
			
		case "capUngrippedE":
			States.CAP_UNGRIPPED = status;
			break;

		case "gripperTurnFinalPosE":
			States.GRIPPER_TURN_EXTENDED = status;
			break;
			
		case "gripperTurnHomePosE":
			States.GRIPPER_TURN_RETRACTED = status;
			break;
		
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("bottleAtPos4E", "gripperZAxisLoweredE", "gripperZAxisLiftedE", "gripperTurnHomePosE", "gripperTurnFinalPosE", "bottleClampedE", "bottleUnclampedE","capGrippedE","capUngrippedE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
