package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class ConveyorVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "bottleAtLoadE":
			States.BOTTLE_AT_LOADER = true;
			
			States.BOTTLE_AT_POS_1 = false;
			States.BOTTLE_AT_POS_5 = false;
			States.BOTTLE_AT_DONE = false;
			break;	
		case "bottleAtPos1E":
			States.BOTTLE_AT_POS_1 = true;
			
			States.BOTTLE_AT_POS_5 = false;
			States.BOTTLE_AT_LOADER = false;
			States.BOTTLE_AT_DONE = false;
			break;
		case "bottleLeftPos5E":
			States.BOTTLE_AT_POS_5 = true;
			
			States.BOTTLE_AT_POS_1 = false;
			States.BOTTLE_AT_LOADER = false;
			States.BOTTLE_AT_DONE = false;
			
			break;
		case "bottleDoneE":
			States.BOTTLE_AT_POS_5 = false;
			States.BOTTLE_AT_POS_1 = false;
			States.BOTTLE_AT_LOADER = false;
			States.BOTTLE_AT_DONE = true;
			break;
			
			
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("bottleAtPos1E","bottleLeftPos5E", "bottleAtLoadE", "bottleDoneE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}
}
