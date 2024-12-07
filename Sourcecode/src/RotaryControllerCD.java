import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class RotaryControllerCD extends ClockDomain{
  public RotaryControllerCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleDonePos1 = new Signal("bottleDonePos1", Signal.INPUT);
  public Signal bottleDonePos2 = new Signal("bottleDonePos2", Signal.INPUT);
  public Signal bottleDonePos3 = new Signal("bottleDonePos3", Signal.INPUT);
  public Signal bottleDonePos4 = new Signal("bottleDonePos4", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal filler_all_completeE = new Signal("filler_all_completeE", Signal.INPUT);
  public Signal bottleAtPos1R = new Signal("bottleAtPos1R", Signal.INPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal bottleAtPos2F = new Signal("bottleAtPos2F", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal bottleAtPos3E = new Signal("bottleAtPos3E", Signal.OUTPUT);
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal bottleDonePos1E = new Signal("bottleDonePos1E", Signal.OUTPUT);
  public Signal bottleDonePos2E = new Signal("bottleDonePos2E", Signal.OUTPUT);
  public Signal bottleDonePos3E = new Signal("bottleDonePos3E", Signal.OUTPUT);
  public Signal bottleDonePos4E = new Signal("bottleDonePos4E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal bottleAtPos4Capper = new Signal("bottleAtPos4Capper", Signal.OUTPUT);
  public Signal bottleLeftPos5EConveyor = new Signal("bottleLeftPos5EConveyor", Signal.OUTPUT);
  private Signal auto_1;
  private Signal manual_1;
  private long __start_thread_14;//sysj\RotaryController.sysj line: 222, column: 3
  private int S91425 = 1;
  private int S74599 = 1;
  private int S57821 = 1;
  private int S57805 = 1;
  private int S57794 = 1;
  private int S59887 = 1;
  private int S58337 = 1;
  private int S57884 = 1;
  private int S57824 = 1;
  private int S57946 = 1;
  private int S57886 = 1;
  private int S58008 = 1;
  private int S57948 = 1;
  private int S58070 = 1;
  private int S58010 = 1;
  private int S58078 = 1;
  private int S63393 = 1;
  private int S59889 = 1;
  private int S59945 = 1;
  private int S59891 = 1;
  private int S60025 = 1;
  private int S59947 = 1;
  private int S60105 = 1;
  private int S60027 = 1;
  private int S60293 = 1;
  private int S60107 = 1;
  private int S60325 = 1;
  private int S60295 = 1;
  private int S74607 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread91467(int [] tdone, int [] ends){
        switch(S74607){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5E.getprestatus()){//sysj\RotaryController.sysj line: 259, column: 24
          bottleLeftPos5EConveyor.setPresent();//sysj\RotaryController.sysj line: 259, column: 41
          currsigs.addElement(bottleLeftPos5EConveyor);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread91465(int [] tdone, int [] ends){
        S63393=1;
    S59889=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread91464(int [] tdone, int [] ends){
        S59887=1;
    S58337=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread91463(int [] tdone, int [] ends){
        S57821=1;
    S57805=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread91460(int [] tdone, int [] ends){
        switch(S60325){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S60295){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\RotaryController.sysj line: 246, column: 11
              System.out.println("bottleLeftPos5E ");//sysj\RotaryController.sysj line: 247, column: 5
              S60295=1;
              bottleLeftPos5E.setPresent();//sysj\RotaryController.sysj line: 250, column: 6
              currsigs.addElement(bottleLeftPos5E);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(bottleAtPos1R.getprestatus()){//sysj\RotaryController.sysj line: 249, column: 11
              S60295=0;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              bottleLeftPos5E.setPresent();//sysj\RotaryController.sysj line: 250, column: 6
              currsigs.addElement(bottleLeftPos5E);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91459(int [] tdone, int [] ends){
        switch(S60293){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S60107){
          case 0 : 
            if(bottleDonePos4.getprestatus()){//sysj\RotaryController.sysj line: 223, column: 11
              System.out.println("position 4: bottleDonePos4E ");//sysj\RotaryController.sysj line: 224, column: 5
              S60107=1;
              __start_thread_14 = com.systemj.Timer.getMs();//sysj\RotaryController.sysj line: 222, column: 3
              if(com.systemj.Timer.getMs() - __start_thread_14 >= (1) * 1000){//sysj\RotaryController.sysj line: 222, column: 3
                ends[14]=2;
                ;//sysj\RotaryController.sysj line: 222, column: 3
                bottleDonePos4E.setPresent();//sysj\RotaryController.sysj line: 226, column: 5
                currsigs.addElement(bottleDonePos4E);
                S60107=2;
                rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 229, column: 6
                currsigs.addElement(rotaryTableTrigger);
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
              else {
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_14 >= (1) * 1000){//sysj\RotaryController.sysj line: 222, column: 3
              ends[14]=2;
              ;//sysj\RotaryController.sysj line: 222, column: 3
              bottleDonePos4E.setPresent();//sysj\RotaryController.sysj line: 226, column: 5
              currsigs.addElement(bottleDonePos4E);
              S60107=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 229, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 2 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 228, column: 11
              S60107=3;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 233, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 229, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 232, column: 11
              S60107=4;
              bottleAtPos5.setPresent();//sysj\RotaryController.sysj line: 237, column: 19
              currsigs.addElement(bottleAtPos5);
              bottleAtPos5E.setPresent();//sysj\RotaryController.sysj line: 237, column: 38
              currsigs.addElement(bottleAtPos5E);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 233, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 4 : 
            if(bottleLeftPos5.getprestatus()){//sysj\RotaryController.sysj line: 236, column: 11
              System.out.println("bottleAtPos5E ");//sysj\RotaryController.sysj line: 240, column: 5
              S60107=0;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\RotaryController.sysj line: 237, column: 19
              currsigs.addElement(bottleAtPos5);
              bottleAtPos5E.setPresent();//sysj\RotaryController.sysj line: 237, column: 38
              currsigs.addElement(bottleAtPos5E);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91458(int [] tdone, int [] ends){
        switch(S60105){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S60027){
          case 0 : 
            if(bottleDonePos3.getprestatus()){//sysj\RotaryController.sysj line: 196, column: 11
              System.out.println("==============bottleDonePos3E ");//sysj\RotaryController.sysj line: 197, column: 5
              bottleDonePos3E.setPresent();//sysj\RotaryController.sysj line: 198, column: 5
              currsigs.addElement(bottleDonePos3E);
              S60027=1;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 201, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 200, column: 11
              S60027=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 206, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 201, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 2 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 204, column: 11
              S60027=3;
              bottleAtPos4.setPresent();//sysj\RotaryController.sysj line: 211, column: 19
              currsigs.addElement(bottleAtPos4);
              bottleAtPos4E.setPresent();//sysj\RotaryController.sysj line: 211, column: 38
              currsigs.addElement(bottleAtPos4E);
              bottleAtPos4Capper.setPresent();//sysj\RotaryController.sysj line: 211, column: 58
              currsigs.addElement(bottleAtPos4Capper);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 206, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 3 : 
            if(bottleDonePos4.getprestatus()){//sysj\RotaryController.sysj line: 210, column: 11
              System.out.println("-------------bottleAtPos4E ");//sysj\RotaryController.sysj line: 214, column: 5
              S60027=0;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\RotaryController.sysj line: 211, column: 19
              currsigs.addElement(bottleAtPos4);
              bottleAtPos4E.setPresent();//sysj\RotaryController.sysj line: 211, column: 38
              currsigs.addElement(bottleAtPos4E);
              bottleAtPos4Capper.setPresent();//sysj\RotaryController.sysj line: 211, column: 58
              currsigs.addElement(bottleAtPos4Capper);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91457(int [] tdone, int [] ends){
        switch(S60025){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S59947){
          case 0 : 
            if(bottleDonePos2.getprestatus()){//sysj\RotaryController.sysj line: 161, column: 11
              System.out.println("bottleDonePos2E ");//sysj\RotaryController.sysj line: 162, column: 5
              bottleDonePos2E.setPresent();//sysj\RotaryController.sysj line: 163, column: 5
              currsigs.addElement(bottleDonePos2E);
              S59947=1;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 166, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 164, column: 11
              S59947=2;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 166, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 2 : 
            S59947=2;
            System.out.println("bottleAtPos3E ");//sysj\RotaryController.sysj line: 170, column: 5
            S59947=3;
            rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 174, column: 6
            currsigs.addElement(rotaryTableTrigger);
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 172, column: 11
              S59947=4;
              bottleAtPos3.setPresent();//sysj\RotaryController.sysj line: 182, column: 19
              currsigs.addElement(bottleAtPos3);
              bottleAtPos3E.setPresent();//sysj\RotaryController.sysj line: 182, column: 38
              currsigs.addElement(bottleAtPos3E);
              bottleAtPos2F.setPresent();//sysj\RotaryController.sysj line: 182, column: 58
              currsigs.addElement(bottleAtPos2F);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 174, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 4 : 
            if(bottleDonePos3.getprestatus()){//sysj\RotaryController.sysj line: 181, column: 11
              S59947=0;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              bottleAtPos3.setPresent();//sysj\RotaryController.sysj line: 182, column: 19
              currsigs.addElement(bottleAtPos3);
              bottleAtPos3E.setPresent();//sysj\RotaryController.sysj line: 182, column: 38
              currsigs.addElement(bottleAtPos3E);
              bottleAtPos2F.setPresent();//sysj\RotaryController.sysj line: 182, column: 58
              currsigs.addElement(bottleAtPos2F);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91456(int [] tdone, int [] ends){
        switch(S59945){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S59891){
          case 0 : 
            if(bottleAtPos1R.getprestatus() || enable.getprestatus()){//sysj\RotaryController.sysj line: 141, column: 11
              System.out.println("bottleAtPos1 ");//sysj\RotaryController.sysj line: 144, column: 5
              bottleAtPos1E.setPresent();//sysj\RotaryController.sysj line: 145, column: 5
              currsigs.addElement(bottleAtPos1E);
              S59891=1;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 148, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 146, column: 11
              System.out.println("bottleAtPos2E ");//sysj\RotaryController.sysj line: 151, column: 5
              bottleAtPos2E.setPresent();//sysj\RotaryController.sysj line: 152, column: 5
              currsigs.addElement(bottleAtPos2E);
              S59891=2;
              bottleAtPos2.setPresent();//sysj\RotaryController.sysj line: 154, column: 19
              currsigs.addElement(bottleAtPos2);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 148, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 2 : 
            if(bottleDonePos2.getprestatus()){//sysj\RotaryController.sysj line: 153, column: 11
              S59891=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\RotaryController.sysj line: 154, column: 19
              currsigs.addElement(bottleAtPos2);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91454(int [] tdone, int [] ends){
        S60325=1;
    S60295=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread91453(int [] tdone, int [] ends){
        S60293=1;
    S60107=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread91452(int [] tdone, int [] ends){
        S60105=1;
    S60027=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread91451(int [] tdone, int [] ends){
        S60025=1;
    S59947=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread91450(int [] tdone, int [] ends){
        S59945=1;
    S59891=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread91449(int [] tdone, int [] ends){
        switch(S63393){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S59889){
          case 0 : 
            if(auto_1.getprestatus()){//sysj\RotaryController.sysj line: 136, column: 10
              System.out.println("Auto mode selected");//sysj\RotaryController.sysj line: 137, column: 4
              S59889=1;
              thread91450(tdone,ends);
              thread91451(tdone,ends);
              thread91452(tdone,ends);
              thread91453(tdone,ends);
              thread91454(tdone,ends);
              int biggest91455 = 0;
              if(ends[11]>=biggest91455){
                biggest91455=ends[11];
              }
              if(ends[12]>=biggest91455){
                biggest91455=ends[12];
              }
              if(ends[13]>=biggest91455){
                biggest91455=ends[13];
              }
              if(ends[14]>=biggest91455){
                biggest91455=ends[14];
              }
              if(ends[15]>=biggest91455){
                biggest91455=ends[15];
              }
              if(biggest91455 == 1){
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(manual_1.getprestatus()){//sysj\RotaryController.sysj line: 138, column: 10
              S59889=0;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              thread91456(tdone,ends);
              thread91457(tdone,ends);
              thread91458(tdone,ends);
              thread91459(tdone,ends);
              thread91460(tdone,ends);
              int biggest91461 = 0;
              if(ends[11]>=biggest91461){
                biggest91461=ends[11];
              }
              if(ends[12]>=biggest91461){
                biggest91461=ends[12];
              }
              if(ends[13]>=biggest91461){
                biggest91461=ends[13];
              }
              if(ends[14]>=biggest91461){
                biggest91461=ends[14];
              }
              if(ends[15]>=biggest91461){
                biggest91461=ends[15];
              }
              if(biggest91461 == 1){
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              //FINXME code
              if(biggest91461 == 0){
                S59889=0;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91447(int [] tdone, int [] ends){
        switch(S58078){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\RotaryController.sysj line: 126, column: 11
          System.out.println("bottleLeftPos5E ");//sysj\RotaryController.sysj line: 127, column: 5
          bottleLeftPos5E.setPresent();//sysj\RotaryController.sysj line: 128, column: 5
          currsigs.addElement(bottleLeftPos5E);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread91446(int [] tdone, int [] ends){
        switch(S58070){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S58010){
          case 0 : 
            if(bottleDonePos4.getprestatus()){//sysj\RotaryController.sysj line: 109, column: 11
              System.out.println("bottleDonePos4E ");//sysj\RotaryController.sysj line: 110, column: 5
              bottleDonePos4E.setPresent();//sysj\RotaryController.sysj line: 111, column: 5
              currsigs.addElement(bottleDonePos4E);
              S58010=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            if(enable.getprestatus()){//sysj\RotaryController.sysj line: 112, column: 11
              S58010=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 115, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 2 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 113, column: 11
              System.out.println("bottleAtPos5E ");//sysj\RotaryController.sysj line: 118, column: 5
              S58010=3;
              bottleAtPos5E.setPresent();//sysj\RotaryController.sysj line: 120, column: 18
              currsigs.addElement(bottleAtPos5E);
              bottleAtPos5.setPresent();//sysj\RotaryController.sysj line: 120, column: 38
              currsigs.addElement(bottleAtPos5);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 115, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 3 : 
            if(bottleLeftPos5.getprestatus()){//sysj\RotaryController.sysj line: 119, column: 11
              S58010=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottleAtPos5E.setPresent();//sysj\RotaryController.sysj line: 120, column: 18
              currsigs.addElement(bottleAtPos5E);
              bottleAtPos5.setPresent();//sysj\RotaryController.sysj line: 120, column: 38
              currsigs.addElement(bottleAtPos5);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91445(int [] tdone, int [] ends){
        switch(S58008){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S57948){
          case 0 : 
            if(bottleDonePos3.getprestatus()){//sysj\RotaryController.sysj line: 90, column: 11
              System.out.println("bottleDonePos3E ");//sysj\RotaryController.sysj line: 91, column: 5
              bottleDonePos3E.setPresent();//sysj\RotaryController.sysj line: 92, column: 5
              currsigs.addElement(bottleDonePos3E);
              S57948=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if(enable.getprestatus()){//sysj\RotaryController.sysj line: 93, column: 11
              S57948=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 96, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 2 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 94, column: 11
              System.out.println("bottleAtPos4E ");//sysj\RotaryController.sysj line: 99, column: 5
              bottleAtPos4E.setPresent();//sysj\RotaryController.sysj line: 101, column: 5
              currsigs.addElement(bottleAtPos4E);
              S57948=3;
              bottleAtPos4.setPresent();//sysj\RotaryController.sysj line: 103, column: 5
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 96, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 3 : 
            if(bottleDonePos4.getprestatus()){//sysj\RotaryController.sysj line: 102, column: 11
              S57948=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\RotaryController.sysj line: 103, column: 5
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91444(int [] tdone, int [] ends){
        switch(S57946){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S57886){
          case 0 : 
            if(bottleDonePos2.getprestatus()){//sysj\RotaryController.sysj line: 73, column: 11
              System.out.println("bottleDonePos2E ");//sysj\RotaryController.sysj line: 74, column: 5
              bottleDonePos2E.setPresent();//sysj\RotaryController.sysj line: 75, column: 5
              currsigs.addElement(bottleDonePos2E);
              S57886=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(enable.getprestatus()){//sysj\RotaryController.sysj line: 76, column: 11
              S57886=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 79, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 2 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 77, column: 11
              System.out.println("bottleAtPos3E ");//sysj\RotaryController.sysj line: 82, column: 5
              S57886=3;
              bottleAtPos3E.setPresent();//sysj\RotaryController.sysj line: 84, column: 18
              currsigs.addElement(bottleAtPos3E);
              bottleAtPos2F.setPresent();//sysj\RotaryController.sysj line: 84, column: 38
              currsigs.addElement(bottleAtPos2F);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 79, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(bottleDonePos3.getprestatus()){//sysj\RotaryController.sysj line: 83, column: 11
              S57886=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottleAtPos3E.setPresent();//sysj\RotaryController.sysj line: 84, column: 18
              currsigs.addElement(bottleAtPos3E);
              bottleAtPos2F.setPresent();//sysj\RotaryController.sysj line: 84, column: 38
              currsigs.addElement(bottleAtPos2F);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91443(int [] tdone, int [] ends){
        switch(S57884){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S57824){
          case 0 : 
            if(bottleAtPos1R.getprestatus()){//sysj\RotaryController.sysj line: 53, column: 11
              System.out.println("bottleAtPos1 ");//sysj\RotaryController.sysj line: 54, column: 5
              bottleAtPos1E.setPresent();//sysj\RotaryController.sysj line: 55, column: 5
              currsigs.addElement(bottleAtPos1E);
              S57824=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(enable.getprestatus()){//sysj\RotaryController.sysj line: 56, column: 11
              S57824=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 58, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 57, column: 11
              System.out.println("bottleAtPos2E ");//sysj\RotaryController.sysj line: 61, column: 5
              bottleAtPos2E.setPresent();//sysj\RotaryController.sysj line: 62, column: 5
              currsigs.addElement(bottleAtPos2E);
              S57824=3;
              bottleAtPos2.setPresent();//sysj\RotaryController.sysj line: 64, column: 18
              currsigs.addElement(bottleAtPos2);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 58, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(bottleDonePos2.getprestatus()){//sysj\RotaryController.sysj line: 63, column: 11
              S57824=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\RotaryController.sysj line: 64, column: 18
              currsigs.addElement(bottleAtPos2);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91441(int [] tdone, int [] ends){
        S58078=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread91440(int [] tdone, int [] ends){
        S58070=1;
    S58010=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread91439(int [] tdone, int [] ends){
        S58008=1;
    S57948=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread91438(int [] tdone, int [] ends){
        S57946=1;
    S57886=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread91437(int [] tdone, int [] ends){
        S57884=1;
    S57824=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread91436(int [] tdone, int [] ends){
        switch(S59887){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S58337){
          case 0 : 
            if(manual_1.getprestatus()){//sysj\RotaryController.sysj line: 49, column: 10
              S58337=1;
              thread91437(tdone,ends);
              thread91438(tdone,ends);
              thread91439(tdone,ends);
              thread91440(tdone,ends);
              thread91441(tdone,ends);
              int biggest91442 = 0;
              if(ends[5]>=biggest91442){
                biggest91442=ends[5];
              }
              if(ends[6]>=biggest91442){
                biggest91442=ends[6];
              }
              if(ends[7]>=biggest91442){
                biggest91442=ends[7];
              }
              if(ends[8]>=biggest91442){
                biggest91442=ends[8];
              }
              if(ends[9]>=biggest91442){
                biggest91442=ends[9];
              }
              if(biggest91442 == 1){
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(auto_1.getprestatus()){//sysj\RotaryController.sysj line: 50, column: 10
              S58337=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              thread91443(tdone,ends);
              thread91444(tdone,ends);
              thread91445(tdone,ends);
              thread91446(tdone,ends);
              thread91447(tdone,ends);
              int biggest91448 = 0;
              if(ends[5]>=biggest91448){
                biggest91448=ends[5];
              }
              if(ends[6]>=biggest91448){
                biggest91448=ends[6];
              }
              if(ends[7]>=biggest91448){
                biggest91448=ends[7];
              }
              if(ends[8]>=biggest91448){
                biggest91448=ends[8];
              }
              if(ends[9]>=biggest91448){
                biggest91448=ends[9];
              }
              if(biggest91448 == 1){
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              //FINXME code
              if(biggest91448 == 0){
                S58337=0;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91435(int [] tdone, int [] ends){
        switch(S57821){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S57805){
          case 0 : 
            if(mode.getprestatus()){//sysj\RotaryController.sysj line: 33, column: 11
              S57805=1;
              S57794=0;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\RotaryController.sysj line: 35, column: 9
                manual_1.setPresent();//sysj\RotaryController.sysj line: 36, column: 7
                currsigs.addElement(manual_1);
                S57794=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                auto_1.setPresent();//sysj\RotaryController.sysj line: 40, column: 7
                currsigs.addElement(auto_1);
                S57794=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            switch(S57794){
              case 0 : 
                S57794=0;
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\RotaryController.sysj line: 35, column: 9
                  manual_1.setPresent();//sysj\RotaryController.sysj line: 36, column: 7
                  currsigs.addElement(manual_1);
                  S57794=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  auto_1.setPresent();//sysj\RotaryController.sysj line: 40, column: 7
                  currsigs.addElement(auto_1);
                  S57794=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                S57794=1;
                S57794=0;
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\RotaryController.sysj line: 35, column: 9
                  manual_1.setPresent();//sysj\RotaryController.sysj line: 36, column: 7
                  currsigs.addElement(manual_1);
                  S57794=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  auto_1.setPresent();//sysj\RotaryController.sysj line: 40, column: 7
                  currsigs.addElement(auto_1);
                  S57794=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91434(int [] tdone, int [] ends){
        switch(S74599){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread91435(tdone,ends);
        thread91436(tdone,ends);
        thread91449(tdone,ends);
        int biggest91462 = 0;
        if(ends[3]>=biggest91462){
          biggest91462=ends[3];
        }
        if(ends[4]>=biggest91462){
          biggest91462=ends[4];
        }
        if(ends[10]>=biggest91462){
          biggest91462=ends[10];
        }
        if(biggest91462 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest91462 == 0){
          thread91463(tdone,ends);
          thread91464(tdone,ends);
          thread91465(tdone,ends);
          int biggest91466 = 0;
          if(ends[3]>=biggest91466){
            biggest91466=ends[3];
          }
          if(ends[4]>=biggest91466){
            biggest91466=ends[4];
          }
          if(ends[10]>=biggest91466){
            biggest91466=ends[10];
          }
          if(biggest91466 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread91432(int [] tdone, int [] ends){
        S74607=1;
    if(bottleLeftPos5E.getprestatus()){//sysj\RotaryController.sysj line: 259, column: 24
      bottleLeftPos5EConveyor.setPresent();//sysj\RotaryController.sysj line: 259, column: 41
      currsigs.addElement(bottleLeftPos5EConveyor);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread91430(int [] tdone, int [] ends){
        S63393=1;
    S59889=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread91429(int [] tdone, int [] ends){
        S59887=1;
    S58337=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread91428(int [] tdone, int [] ends){
        S57821=1;
    S57805=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread91427(int [] tdone, int [] ends){
        S74599=1;
    thread91428(tdone,ends);
    thread91429(tdone,ends);
    thread91430(tdone,ends);
    int biggest91431 = 0;
    if(ends[3]>=biggest91431){
      biggest91431=ends[3];
    }
    if(ends[4]>=biggest91431){
      biggest91431=ends[4];
    }
    if(ends[10]>=biggest91431){
      biggest91431=ends[10];
    }
    if(biggest91431 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S91425){
        case 0 : 
          S91425=0;
          break RUN;
        
        case 1 : 
          S91425=2;
          S91425=2;
          auto_1.setClear();//sysj\RotaryController.sysj line: 27, column: 2
          manual_1.setClear();//sysj\RotaryController.sysj line: 27, column: 2
          auto_1.setPresent();//sysj\RotaryController.sysj line: 28, column: 2
          currsigs.addElement(auto_1);
          thread91427(tdone,ends);
          thread91432(tdone,ends);
          int biggest91433 = 0;
          if(ends[2]>=biggest91433){
            biggest91433=ends[2];
          }
          if(ends[16]>=biggest91433){
            biggest91433=ends[16];
          }
          if(biggest91433 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          auto_1.setClear();//sysj\RotaryController.sysj line: 27, column: 2
          manual_1.setClear();//sysj\RotaryController.sysj line: 27, column: 2
          thread91434(tdone,ends);
          thread91467(tdone,ends);
          int biggest91468 = 0;
          if(ends[2]>=biggest91468){
            biggest91468=ends[2];
          }
          if(ends[16]>=biggest91468){
            biggest91468=ends[16];
          }
          if(biggest91468 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest91468 == 0){
            S91425=0;
            active[1]=0;
            ends[1]=0;
            S91425=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    auto_1 = new Signal();
    manual_1 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          bottleAtPos1.gethook();
          capOnBottleAtPos1.gethook();
          tableAlignedWithSensor.gethook();
          bottleDonePos1.gethook();
          bottleDonePos2.gethook();
          bottleDonePos3.gethook();
          bottleDonePos4.gethook();
          bottleLeftPos5.gethook();
          enable.gethook();
          mode.gethook();
          filler_all_completeE.gethook();
          bottleAtPos1R.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleDonePos1.setpreclear();
      bottleDonePos2.setpreclear();
      bottleDonePos3.setpreclear();
      bottleDonePos4.setpreclear();
      bottleLeftPos5.setpreclear();
      enable.setpreclear();
      mode.setpreclear();
      filler_all_completeE.setpreclear();
      bottleAtPos1R.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos2F.setpreclear();
      bottleAtPos5.setpreclear();
      rotaryTableTrigger.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleAtPos2E.setpreclear();
      bottleAtPos3E.setpreclear();
      bottleAtPos4E.setpreclear();
      bottleAtPos5E.setpreclear();
      bottleDonePos1E.setpreclear();
      bottleDonePos2E.setpreclear();
      bottleDonePos3E.setpreclear();
      bottleDonePos4E.setpreclear();
      bottleLeftPos5E.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4Capper.setpreclear();
      bottleLeftPos5EConveyor.setpreclear();
      auto_1.setpreclear();
      manual_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleDonePos1.getStatus() ? bottleDonePos1.setprepresent() : bottleDonePos1.setpreclear();
      bottleDonePos1.setpreval(bottleDonePos1.getValue());
      bottleDonePos1.setClear();
      dummyint = bottleDonePos2.getStatus() ? bottleDonePos2.setprepresent() : bottleDonePos2.setpreclear();
      bottleDonePos2.setpreval(bottleDonePos2.getValue());
      bottleDonePos2.setClear();
      dummyint = bottleDonePos3.getStatus() ? bottleDonePos3.setprepresent() : bottleDonePos3.setpreclear();
      bottleDonePos3.setpreval(bottleDonePos3.getValue());
      bottleDonePos3.setClear();
      dummyint = bottleDonePos4.getStatus() ? bottleDonePos4.setprepresent() : bottleDonePos4.setpreclear();
      bottleDonePos4.setpreval(bottleDonePos4.getValue());
      bottleDonePos4.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = filler_all_completeE.getStatus() ? filler_all_completeE.setprepresent() : filler_all_completeE.setpreclear();
      filler_all_completeE.setpreval(filler_all_completeE.getValue());
      filler_all_completeE.setClear();
      dummyint = bottleAtPos1R.getStatus() ? bottleAtPos1R.setprepresent() : bottleAtPos1R.setpreclear();
      bottleAtPos1R.setpreval(bottleAtPos1R.getValue());
      bottleAtPos1R.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      bottleAtPos2F.sethook();
      bottleAtPos2F.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      bottleAtPos3E.sethook();
      bottleAtPos3E.setClear();
      bottleAtPos4E.sethook();
      bottleAtPos4E.setClear();
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      bottleDonePos1E.sethook();
      bottleDonePos1E.setClear();
      bottleDonePos2E.sethook();
      bottleDonePos2E.setClear();
      bottleDonePos3E.sethook();
      bottleDonePos3E.setClear();
      bottleDonePos4E.sethook();
      bottleDonePos4E.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
      bottleAtPos4Capper.sethook();
      bottleAtPos4Capper.setClear();
      bottleLeftPos5EConveyor.sethook();
      bottleLeftPos5EConveyor.setClear();
      auto_1.setClear();
      manual_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos1.gethook();
        capOnBottleAtPos1.gethook();
        tableAlignedWithSensor.gethook();
        bottleDonePos1.gethook();
        bottleDonePos2.gethook();
        bottleDonePos3.gethook();
        bottleDonePos4.gethook();
        bottleLeftPos5.gethook();
        enable.gethook();
        mode.gethook();
        filler_all_completeE.gethook();
        bottleAtPos1R.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
