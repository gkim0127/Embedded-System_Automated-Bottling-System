package org.compsys704;

import java.util.Arrays;
import java.util.List;


public class FillerVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
		switch(signame){
		case "Filler_1E":
			States.FillerState = 1;
			States.Filler_Out = false;
			States.Filler_In = false;
			break;

		case "Filler_2E":
			States.FillerState = 2;
			States.Filler_Out = false;
			States.Filler_In = false;
			break;	
			
		case "Filler_3E":
			States.FillerState = 3;
			States.Filler_Out = false;
			States.Filler_In = false;
			break;	
			
		case "Filler_4E":
			States.FillerState = 4;
			States.Filler_Out = false;
			States.Filler_In = false;
			break;	
			
		case "Filler_0E":
			States.FillerState = 5;
			States.Filler_Out = false;
			States.Filler_In = false;
			break;
			
		case "dosUnitFilledE":
//			States.Filler_Out = true;
//			States.Filler_In = false;
			States.Filler_Out = false;
			States.Filler_In = true;
			
			break;		
			
		case "dosUnitEvacE":
//			States.Filler_Out = false;
//			States.Filler_In = true;
//			
			States.Filler_Out = true;
			States.Filler_In = false;
			break;
			
			
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}

	
	static final List<String> signames = Arrays.asList("Filler_1E","Filler_2E","Filler_3E","Filler_4E",
			"Filler_0E", "dosUnitFilledE", "dosUnitEvacE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}
	
	
}