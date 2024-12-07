package org.compsys704;

public class States {
	
	public static volatile boolean ARM_AT_DEST = true;
	public static volatile boolean ARM_AT_SOURCE = !ARM_AT_DEST;
	public static volatile boolean PUSHER_RETRACTED = true;
	public static volatile boolean PUSHER_EXTENDED = !PUSHER_RETRACTED;
	public static volatile boolean GRIPPED = false;
	public static volatile boolean MAG_EMPTY = false;
	
	public static volatile boolean CAP_READY = false;
	
	
	//states for Capper
	public static volatile boolean BOTTLE_AT_POS4 = true;
	public static volatile boolean GRIPPER_LOWERED = false;
	public static volatile boolean GRIPPER_LIFTED = !GRIPPER_LOWERED;
	public static volatile boolean BOTTLE_CLAMPED = false;
	public static volatile boolean BOTTLE_UNCLAMPED = !BOTTLE_CLAMPED;
	public static volatile boolean CAP_GRIPPED = false;
	public static volatile boolean CAP_UNGRIPPED = !CAP_GRIPPED;
	public static volatile boolean GRIPPER_TURN_EXTENDED = false;
	public static volatile boolean GRIPPER_TURN_RETRACTED = !GRIPPER_TURN_EXTENDED;
	
	
	// states for rotary
	public static volatile int RotaryTable = 0;
	
	//states for conveyor 
	public static volatile boolean BOTTLE_AT_LOADER = false;
	public static volatile boolean BOTTLE_AT_POS_1 = false;
	public static volatile boolean BOTTLE_AT_POS_5 = false;
	public static volatile boolean BOTTLE_AT_DONE = false;
	
	
	//states for filler 
	public static volatile int FillerState = 0;
	public static volatile boolean Filler_In = false;
	public static volatile boolean Filler_Out = false;
	public static volatile boolean Filler_Done = false;
	public static volatile int LiquidAmount1 = 0;
	
	
	//states for ACS
	public static volatile boolean SIREN_ON = false;
	public static volatile boolean SIREN_OFF = true;
	public static volatile boolean DOOR_LOCK = true;
	public static volatile boolean DOOR_UNLOCK = false;
	public static volatile boolean EnableManufactureE = true;
	public static volatile boolean DisableManufactureE = false;
	
	//states for ECS
		public static volatile boolean OFFICE_AC_ON = false;
		public static volatile boolean OFFICE_AC_OFF = !OFFICE_AC_ON;
		public static volatile boolean STORAGE_AC_ON = false;
		public static volatile boolean STORAGE_AC_OFF = !STORAGE_AC_ON;
		public static volatile boolean MANUFACTURE_AC_ON = false;
		public static volatile boolean MANUFACTURE_AC_OFF = !MANUFACTURE_AC_ON;
		
		public static volatile boolean OFFICE_HEATER_ON = false;
		public static volatile boolean OFFICE_HEATER_OFF = !OFFICE_HEATER_ON;
		
		public static volatile boolean OFFICE_LIGHT_100 = false;
		public static volatile boolean OFFICE_LIGHT_80 = false;
		public static volatile boolean OFFICE_LIGHT_50 = false;
		public static volatile boolean STORAGE_LIGHT_100 = false;
		public static volatile boolean STORAGE_LIGHT_80 = false;
		public static volatile boolean STORAGE_LIGHT_50 = false;
		public static volatile boolean MANUFACTURE_LIGHT_100 = false;
		public static volatile boolean MANUFACTURE_LIGHT_80 = false;
		public static volatile boolean MANUFACTURE_LIGHT_50 = false;
		public static volatile boolean OFFICE_LIGHT_0 = true;
		public static volatile boolean STORAGE_LIGHT_0 = true;
		public static volatile boolean MANUFACTURE_LIGHT_0 = true;
		
		public static volatile boolean OFFICE_SIREN_ON = false;
		public static volatile boolean OFFICE_SIREN_OFF = !OFFICE_SIREN_ON;
		public static volatile boolean STORAGE_SIREN_ON = false;
		public static volatile boolean STORAGE_SIREN_OFF = !STORAGE_SIREN_ON;
		public static volatile boolean MANUFACTURE_SIREN_ON = false;
		public static volatile boolean MANUFACTURE_SIREN_OFF = !MANUFACTURE_SIREN_ON;
		
		public static volatile boolean OFFICE_HUMIDITY_ON = false;
		public static volatile boolean OFFICE_HUMIDITY_OFF = !OFFICE_SIREN_ON;
		public static volatile boolean STORAGE_HUMIDITY_ON = false;
		public static volatile boolean STORAGE_HUMIDITY_OFF = !STORAGE_HUMIDITY_ON;
		public static volatile boolean MANUFACTURE_HUMIDITY_ON = false;
		public static volatile boolean MANUFACTURE_HUMIDITY_OFF = !MANUFACTURE_HUMIDITY_ON;
		
		public static volatile boolean OFFICE_OCCUPANCY_ON = false;
		public static volatile boolean OFFICE_OCCUPANCY_OFF = !OFFICE_OCCUPANCY_ON;
		public static volatile boolean STORAGE_OCCUPANCY_ON = false;
		public static volatile boolean STORAGE_OCCUPANCY_OFF = !STORAGE_OCCUPANCY_ON;
		public static volatile boolean MANUFACTURE_OCCUPANCY_ON = false;
		public static volatile boolean MANUFACTURE_OCCUPANCY_OFF = !MANUFACTURE_OCCUPANCY_ON;
	
}
