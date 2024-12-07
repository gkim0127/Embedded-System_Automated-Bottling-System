package org.compsys704;

public class Ports {
	public static final String Loader_REQUEST_SIGNAL = "CapLoaderControllerCD.request";
	public static final String Loader_REFILL_SIGNAL = "CapLoaderPlantCD.refill";
	public static final String Loader_ENABLE_SIGNAL = "CapLoaderPlantCD.enable";
	public static final int PORT_LOADER_PLANT = 10001;
	public static final int PORT_LOADER_CONTROLLER = 10005;
	public static final int PORT_LOADER_VIZ = 20003;
	
	
	// Manual for cap loader
	public static final String Loader_SIGNAL_PUSHER_EXTEND   = "CapLoaderControllerCD.pusherExtendM";
//	public static final String SIGNAL_VACOFF          = "ControllerCD.vacOffM";
	public static final String Loader_SIGNAL_VACON           = "CapLoaderControllerCD.vacOnM";
	public static final String Loader_SIGNAL_ARM_SOURCE      = "CapLoaderControllerCD.armSourceM";
	public static final String Loader_SIGNAL_ARM_DEST        = "CapLoaderControllerCD.armDestM";
	public static final String Loader_SIGNAL_Mode            = "CapLoaderControllerCD.mode";
	
	public static final String Loader_Pos3           = "CapLoaderControllerCD.bottleAtPos3";
	public static final String Loader_Pos3E           = "CapLoaderControllerCD.bottleAtPos3E";
	
	
	
	
	
	// inputs ports FillerController
	public static final String FillerController_bottleAtPos2 = "FillerControllerCD.bottleAtPos2";
	public static final String FillerController_dosUnitEvac = "FillerControllerCD.dosUnitEvac";
	public static final String FillerController_dosUnitFilled = "FillerControllerCD.dosUnitFilled";
	public static final String FillerController_enable = "FillerControllerCD.enable";
	
	// input ports for FillerPlant
	public static final String FillerPlant_valveInjectorOnOff = "FillerPlantCD.valveInjectorOnOff";
	public static final String FillerPlant_valveInletOnOff = "FillerPlantCD.valveInletOnOff";
	public static final String FillerPlant_dosUnitValveRetract = "FillerPlantCD.dosUnitValveRetract";
	public static final String FillerPlant_dosUnitValveExtend = "FillerPlantCD.dosUnitValveExtend";
	public static final String FillerPlant_fillerReady = "FillerPlantCD.fillerReady";
	public static final String FillerPlant_enable = "FillerPlantCD.enable";
	
	public static final String FillerPlant_enableFiller = "FillerPlantCD.enableFiller";
	
	
	//ports for clock domains
	public static final int FillerController_Port = 10002;
	public static final int FillerPlant_Port = 10003;
	public static final int PORT_FILLER_VIZ = 10004;
	
	
	// ports for rotary signals
	public static final String Rotary_Controller_ENABLE_SIGNAL = "RotaryControllerCD.enable";
	public static final String Rotary_ENABLE_SIGNAL = "RotaryPlantCD.enable";
	
	public static final String Rotary_LOADBOT_SIGNAL = "RotaryControllerCD.bottleAtPos1";
	
	public static final String Rotary_FILLED_SIGNAL = "RotaryControllerCD.bottleDonePos2";
	
	public static final String Rotary_LIDLOADED_SIGNAL = "RotaryControllerCD.bottleDonePos3";
	
	public static final String Rotary_CAPPED_SIGNAL = "RotaryControllerCD.bottleDonePos4";
	
	public static final String Rotary_REMOVED_SIGNAL = "RotaryControllerCD.bottleLeftPos5";
	
	public static final String Rotary_SIGNAL_Mode            = "RotaryControllerCD.mode";
	
	public static final String Rotary_SIGNAL_Table_Trigger   = "RotaryPlantCD.rotaryTableTrigger";
	
	
	//ports for rotary table
	public static final int PORT_Rotary_PLANT = 30001;
	public static final int PORT_Rotary_CONTROLLER = 30002;
	public static final int PORT_Rotary_VIZ = 30003;
	
	
	// Conveyor 
	public static final String Conveyor_REFILL_SIGNAL = "ConveyorPlantCD.refill";
	public static final String Conveyor_ENABLE_enableConveyor = "ConveyorPlantCD.enableConveyor";
	public static final String Conveyor_ENABLE_SIGNAL = "ConveyorPlantCD.enable";
	public static final int PORT_Conveyor_PLANT = 40001;
	public static final int PORT_Conveyor_CONTROLLER = 40000;
	public static final int PORT_Conveyor_VIZ = 40004;
	
	public static final String Conveyor_motConveyorOnOff = "ConveyorPlantCD.motConveyorOnOff";
	public static final String Conveyor_DONE = "ConveyorPlantCD.DONE";
	
	// Manual 
	public static final String SIGNAL_MOTOR_ON   = "ConveyorControllerCD.motConveyorOnOffM";
	public static final String Conveyor_SIGNAL_Mode       = "ConveyorControllerCD.mode";
	
	
	//for Capper
	public static final String ENABLE_SIGNAL_CAPPER = "PlantCapperCD.enable";
	public static final int PORT_CAPPER_PLANT = 32000;
	public static final int PORT_CAPPER_CONTROLLER = 31000;
	public static final int PORT_CAPPER_VIZ = 33000;
		
	// Capper Manual 
	public static final String SIGNAL_GRIPPER_EXTEND   = "ControllerCapperCD.cylPos5ZaxisExtendM";
	public static final String SIGNAL_GRIPPER_HOME     = "ControllerCapperCD.gripperTurnRetractM";
	public static final String SIGNAL_GRIPPER_FINAL    = "ControllerCapperCD.gripperTurnExtendM";
	public static final String SIGNAL_GRIPPER_GRIP     = "ControllerCapperCD.capGripperPos5ExtendM";
	public static final String SIGNAL_CLAMP            = "ControllerCapperCD.cylClampBottleExtendM";
	public static final String SIGNAL_CAPPER_DONE      = "ControllerCapperCD.capperJobDoneM";
	public static final String SIGNAL_CAPPER_Mode      = "ControllerCapperCD.mode";
	
	
	// for POS GUI
	public static final int MainController_Port = 10200;
	public static final String MainController_Liquid1 = "MainControllerCD.LiquidAmount1";
	public static final String MainController_Liquid2 = "MainControllerCD.LiquidAmount2";
	public static final String MainController_Liquid3 = "MainControllerCD.LiquidAmount3";
	public static final String MainController_Liquid4 = "MainControllerCD.LiquidAmount4";
	public static final String MainController_Bottle = "MainControllerCD.BottleQuantity";
	
	public static final String ENABLE_SIGNAL_ECS = "ECSPlantCD.enable";
	public static final int PORT_ECS_PLANT = 10027;
	public static final int PORT_ECS_CONTROLLER = 10025;
	public static final int PORT_ECS_VIZ = 10026;
	
	public static final String SIGNAL_ECS_TIME = "ECSControllerCD.time";
	
	public static final String SIGNAL_OFFICE_TEMP = "ECSControllerCD.officeTemp";
	public static final String SIGNAL_OFFICE_HUMIDITY = "ECSControllerCD.officeHumidity";
	public static final String SIGNAL_OFFICE_LUMEN = "ECSControllerCD.officeLumen";
	public static final String SIGNAL_OFFICE_HIR = "ECSControllerCD.officeHIR";
	public static final String SIGNAL_OFFICE_SMOKE = "ECSControllerCD.officeSmoke";
	
	public static final String SIGNAL_STORAGE_TEMP = "ECSControllerCD.storageTemp";
	public static final String SIGNAL_STORAGE_HUMIDITY = "ECSControllerCD.storageHumidity";
	public static final String SIGNAL_STORAGE_LUMEN = "ECSControllerCD.storageLumen";
	public static final String SIGNAL_STORAGE_HIR = "ECSControllerCD.storageHIR";
	public static final String SIGNAL_STORAGE_SMOKE = "ECSControllerCD.storageSmoke";
	
	public static final String SIGNAL_MANUFACTURE_TEMP = "ECSControllerCD.manufactureTemp";
	public static final String SIGNAL_MANUFACTURE_HUMIDITY = "ECSControllerCD.manufactureHumidity";
	public static final String SIGNAL_MANUFACTURE_LUMEN = "ECSControllerCD.manufactureLumen";
	public static final String SIGNAL_MANUFACTURE_HIR = "ECSControllerCD.manufactureHIR";
	public static final String SIGNAL_MANUFACTURE_SMOKE = "ECSControllerCD.manufactureSiren";

	
	
}
