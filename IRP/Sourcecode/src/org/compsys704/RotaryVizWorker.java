package org.compsys704;

import java.util.Arrays;
import java.util.List;


public class RotaryVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "bottleAtPos1E":
			States.RotaryTable = 1;
			break;
			
		case "bottleAtPos2E":
			States.RotaryTable = 2;
			break;	
			
		case "bottleDonePos2E":
			States.RotaryTable = 3;
			break;	
		case "bottleAtPos3E":
			States.RotaryTable = 4;
			break;	
			
		case "bottleDonePos3E":
			States.RotaryTable = 5;
			break;	
			
		case "bottleAtPos4E":
			States.RotaryTable = 6;
			break;	
			
		case "bottleDonePos4E":
			States.RotaryTable = 7;
			break;
			
		case "bottleAtPos5E":
			States.RotaryTable = 8;
			break;	
			
		case "bottleLeftPos5E":
			States.RotaryTable = 0;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}

	
	static final List<String> signames = Arrays.asList("tableAlignedWithSensorE","capOnBottleAtPos1E","bottleAtPos5E","bottleAtPos1E",
			"bottleAtPos2E","bottleAtPos3E","bottleAtPos4E","bottleDonePos1E","bottleDonePos2E","bottleDonePos3E","bottleDonePos4E"
			,"bottleLeftPos5E","enableE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}
	
	
}
