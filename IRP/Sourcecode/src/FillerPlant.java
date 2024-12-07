import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class FillerPlant extends ClockDomain{
  public FillerPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal fillerReady = new Signal("fillerReady", Signal.INPUT);
  public Signal jobDone = new Signal("jobDone", Signal.INPUT);
  public Signal fillerReadyChannel = new Signal("fillerReadyChannel", Signal.INPUT);
  public Signal enableFiller = new Signal("enableFiller", Signal.INPUT);
  public Signal LiquidAmount1E = new Signal("LiquidAmount1E", Signal.INPUT);
  public Signal LiquidAmount2E = new Signal("LiquidAmount2E", Signal.INPUT);
  public Signal LiquidAmount3E = new Signal("LiquidAmount3E", Signal.INPUT);
  public Signal LiquidAmount4E = new Signal("LiquidAmount4E", Signal.INPUT);
  public Signal BottleQuantityE = new Signal("BottleQuantityE", Signal.INPUT);
  public Signal bottleAtPos2F = new Signal("bottleAtPos2F", Signal.INPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal injectorOn = new Signal("injectorOn", Signal.OUTPUT);
  public Signal injectorOff = new Signal("injectorOff", Signal.OUTPUT);
  public Signal bottleDonePos2 = new Signal("bottleDonePos2", Signal.OUTPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal Filler_4E = new Signal("Filler_4E", Signal.OUTPUT);
  public Signal Filler_3E = new Signal("Filler_3E", Signal.OUTPUT);
  public Signal Filler_2E = new Signal("Filler_2E", Signal.OUTPUT);
  public Signal Filler_1E = new Signal("Filler_1E", Signal.OUTPUT);
  public Signal Filler_0E = new Signal("Filler_0E", Signal.OUTPUT);
  public Signal dosUnitFilledE = new Signal("dosUnitFilledE", Signal.OUTPUT);
  public Signal dosUnitEvacE = new Signal("dosUnitEvacE", Signal.OUTPUT);
  public Signal enable2E = new Signal("enable2E", Signal.OUTPUT);
  public Signal filler_all_completeE = new Signal("filler_all_completeE", Signal.OUTPUT);
  public Signal bottleDonePos2Conveyor = new Signal("bottleDonePos2Conveyor", Signal.OUTPUT);
  private Signal FillerStatus_1;
  private Signal stopAllStatus_1;
  private Signal fillerNotDone_1;
  private Signal fillerDone_1;
  private Signal stopAll_1;
  private Signal filler1_status_1;
  private Signal filler2_status_1;
  private Signal filler3_status_1;
  private Signal filler4_status_1;
  private Signal filler1done_1;
  private Signal filler2done_1;
  private Signal filler3done_1;
  private Signal filler4done_1;
  private Signal filler_all_complete_1;
  private Signal filler_0_1;
  private Signal filler_1_1;
  private Signal filler_2_1;
  private Signal filler_3_1;
  private Signal filler_4_1;
  private Signal dosUnitFilledM_1;
  private Signal dosUnitEvacM_1;
  private Signal filler_1_In_1;
  private Signal filler_2_In_1;
  private Signal filler_3_In_1;
  private Signal filler_4_In_1;
  private Signal enable2_1;
  private Signal fillerNumber_1;
  private long __start_thread_2;//sysj\FillerPlant.sysj line: 110, column: 2
  private int S57579 = 1;
  private int S53051 = 1;
  private int S53898 = 1;
  private int S53053 = 1;
  private int S53985 = 1;
  private int S53909 = 1;
  private int S53920 = 1;
  private int S53931 = 1;
  private int S53942 = 1;
  private int S53953 = 1;
  private int S53964 = 1;
  private int S53975 = 1;
  private int S53983 = 1;
  private int S54002 = 1;
  private int S53990 = 1;
  private int S54154 = 1;
  private int S54153 = 1;
  private int S54027 = 1;
  private int S54008 = 1;
  private int S54013 = 1;
  private int S54165 = 1;
  private int S54176 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread57620(int [] tdone, int [] ends){
        switch(S54176){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(filler_all_complete_1.getprestatus()){//sysj\FillerPlant.sysj line: 315, column: 12
          filler_all_completeE.setPresent();//sysj\FillerPlant.sysj line: 316, column: 5
          currsigs.addElement(filler_all_completeE);
          System.out.println("filler all complete");//sysj\FillerPlant.sysj line: 317, column: 5
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread57619(int [] tdone, int [] ends){
        switch(S54165){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(enableFiller.getprestatus()){//sysj\FillerPlant.sysj line: 303, column: 12
          filler_all_complete_1.setPresent();//sysj\FillerPlant.sysj line: 305, column: 5
          currsigs.addElement(filler_all_complete_1);
          stopAllStatus_1.setPresent();//sysj\FillerPlant.sysj line: 306, column: 5
          currsigs.addElement(stopAllStatus_1);
          stopAllStatus_1.setValue(false);//sysj\FillerPlant.sysj line: 306, column: 5
          filler_4_1.setPresent();//sysj\FillerPlant.sysj line: 307, column: 5
          currsigs.addElement(filler_4_1);
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

  public void thread57617(int [] tdone, int [] ends){
        S54013=1;
    bottleDonePos2Conveyor.setPresent();//sysj\FillerPlant.sysj line: 279, column: 7
    currsigs.addElement(bottleDonePos2Conveyor);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread57616(int [] tdone, int [] ends){
        S54008=1;
    bottleDonePos2.setPresent();//sysj\FillerPlant.sysj line: 275, column: 7
    currsigs.addElement(bottleDonePos2);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread57614(int [] tdone, int [] ends){
        switch(S54013){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        bottleDonePos2Conveyor.setPresent();//sysj\FillerPlant.sysj line: 279, column: 7
        currsigs.addElement(bottleDonePos2Conveyor);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread57613(int [] tdone, int [] ends){
        switch(S54008){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        bottleDonePos2.setPresent();//sysj\FillerPlant.sysj line: 275, column: 7
        currsigs.addElement(bottleDonePos2);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread57611(int [] tdone, int [] ends){
        S54013=1;
    bottleDonePos2Conveyor.setPresent();//sysj\FillerPlant.sysj line: 279, column: 7
    currsigs.addElement(bottleDonePos2Conveyor);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread57610(int [] tdone, int [] ends){
        S54008=1;
    bottleDonePos2.setPresent();//sysj\FillerPlant.sysj line: 275, column: 7
    currsigs.addElement(bottleDonePos2);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread57609(int [] tdone, int [] ends){
        switch(S54154){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S54153){
          case 0 : 
            S54153=0;
            S54153=1;
            S54027=0;
            if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 0){//sysj\FillerPlant.sysj line: 242, column: 7
              System.out.println("----------------------------------------All 4 fillers complete");//sysj\FillerPlant.sysj line: 243, column: 5
              System.out.println(" ");//sysj\FillerPlant.sysj line: 244, column: 5
              System.out.println("------------Status------------");//sysj\FillerPlant.sysj line: 245, column: 5
              System.out.println("Liquid 1 Amount: " + ((Integer)(LiquidAmount1E.getpreval() == null ? 0 : ((Integer)LiquidAmount1E.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 246, column: 5
              System.out.println("Liquid 2 Amount: " + ((Integer)(LiquidAmount2E.getpreval() == null ? 0 : ((Integer)LiquidAmount2E.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 247, column: 5
              System.out.println("Liquid 3 Amount: " + ((Integer)(LiquidAmount3E.getpreval() == null ? 0 : ((Integer)LiquidAmount3E.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 248, column: 5
              System.out.println("Liquid 4 Amount: " + ((Integer)(LiquidAmount4E.getpreval() == null ? 0 : ((Integer)LiquidAmount4E.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 249, column: 5
              System.out.println(" ");//sysj\FillerPlant.sysj line: 250, column: 5
              System.out.println("Bottle quantitiy left: " + ((Integer)(BottleQuantityE.getpreval() == null ? 0 : ((Integer)BottleQuantityE.getpreval()).intValue()) - 1));//sysj\FillerPlant.sysj line: 251, column: 5
              System.out.println("------------Status------------");//sysj\FillerPlant.sysj line: 252, column: 5
              System.out.println(" ");//sysj\FillerPlant.sysj line: 253, column: 5
              System.out.println(" ");//sysj\FillerPlant.sysj line: 257, column: 5
              stopAll_1.setPresent();//sysj\FillerPlant.sysj line: 258, column: 5
              currsigs.addElement(stopAll_1);
              stopAllStatus_1.setPresent();//sysj\FillerPlant.sysj line: 259, column: 5
              currsigs.addElement(stopAllStatus_1);
              stopAllStatus_1.setValue(true);//sysj\FillerPlant.sysj line: 259, column: 5
              filler_0_1.setPresent();//sysj\FillerPlant.sysj line: 260, column: 5
              currsigs.addElement(filler_0_1);
              fillerNumber_1.setPresent();//sysj\FillerPlant.sysj line: 261, column: 5
              currsigs.addElement(fillerNumber_1);
              fillerNumber_1.setValue((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) + 4);//sysj\FillerPlant.sysj line: 261, column: 5
              System.out.println("emiting bottleDonePos2");//sysj\FillerPlant.sysj line: 270, column: 5
              thread57610(tdone,ends);
              thread57611(tdone,ends);
              int biggest57612 = 0;
              if(ends[14]>=biggest57612){
                biggest57612=ends[14];
              }
              if(ends[15]>=biggest57612){
                biggest57612=ends[15];
              }
              if(biggest57612 == 1){
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              S54027=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            switch(S54027){
              case 0 : 
                if(bottleAtPos2F.getprestatus()){//sysj\FillerPlant.sysj line: 273, column: 11
                  System.out.println("after bottleDonePos2");//sysj\FillerPlant.sysj line: 284, column: 5
                  S54027=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  thread57613(tdone,ends);
                  thread57614(tdone,ends);
                  int biggest57615 = 0;
                  if(ends[14]>=biggest57615){
                    biggest57615=ends[14];
                  }
                  if(ends[15]>=biggest57615){
                    biggest57615=ends[15];
                  }
                  if(biggest57615 == 1){
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  //FINXME code
                  if(biggest57615 == 0){
                    System.out.println("after bottleDonePos2");//sysj\FillerPlant.sysj line: 284, column: 5
                    S54027=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                break;
              
              case 1 : 
                S54027=1;
                S54027=0;
                if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 0){//sysj\FillerPlant.sysj line: 242, column: 7
                  System.out.println("----------------------------------------All 4 fillers complete");//sysj\FillerPlant.sysj line: 243, column: 5
                  System.out.println(" ");//sysj\FillerPlant.sysj line: 244, column: 5
                  System.out.println("------------Status------------");//sysj\FillerPlant.sysj line: 245, column: 5
                  System.out.println("Liquid 1 Amount: " + ((Integer)(LiquidAmount1E.getpreval() == null ? 0 : ((Integer)LiquidAmount1E.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 246, column: 5
                  System.out.println("Liquid 2 Amount: " + ((Integer)(LiquidAmount2E.getpreval() == null ? 0 : ((Integer)LiquidAmount2E.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 247, column: 5
                  System.out.println("Liquid 3 Amount: " + ((Integer)(LiquidAmount3E.getpreval() == null ? 0 : ((Integer)LiquidAmount3E.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 248, column: 5
                  System.out.println("Liquid 4 Amount: " + ((Integer)(LiquidAmount4E.getpreval() == null ? 0 : ((Integer)LiquidAmount4E.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 249, column: 5
                  System.out.println(" ");//sysj\FillerPlant.sysj line: 250, column: 5
                  System.out.println("Bottle quantitiy left: " + ((Integer)(BottleQuantityE.getpreval() == null ? 0 : ((Integer)BottleQuantityE.getpreval()).intValue()) - 1));//sysj\FillerPlant.sysj line: 251, column: 5
                  System.out.println("------------Status------------");//sysj\FillerPlant.sysj line: 252, column: 5
                  System.out.println(" ");//sysj\FillerPlant.sysj line: 253, column: 5
                  System.out.println(" ");//sysj\FillerPlant.sysj line: 257, column: 5
                  stopAll_1.setPresent();//sysj\FillerPlant.sysj line: 258, column: 5
                  currsigs.addElement(stopAll_1);
                  stopAllStatus_1.setPresent();//sysj\FillerPlant.sysj line: 259, column: 5
                  currsigs.addElement(stopAllStatus_1);
                  stopAllStatus_1.setValue(true);//sysj\FillerPlant.sysj line: 259, column: 5
                  filler_0_1.setPresent();//sysj\FillerPlant.sysj line: 260, column: 5
                  currsigs.addElement(filler_0_1);
                  fillerNumber_1.setPresent();//sysj\FillerPlant.sysj line: 261, column: 5
                  currsigs.addElement(fillerNumber_1);
                  fillerNumber_1.setValue((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) + 4);//sysj\FillerPlant.sysj line: 261, column: 5
                  System.out.println("emiting bottleDonePos2");//sysj\FillerPlant.sysj line: 270, column: 5
                  thread57616(tdone,ends);
                  thread57617(tdone,ends);
                  int biggest57618 = 0;
                  if(ends[14]>=biggest57618){
                    biggest57618=ends[14];
                  }
                  if(ends[15]>=biggest57618){
                    biggest57618=ends[15];
                  }
                  if(biggest57618 == 1){
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                else {
                  S54027=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57608(int [] tdone, int [] ends){
        switch(S54002){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S53990){
          case 0 : 
            if(enableFiller.getprestatus()){//sysj\FillerPlant.sysj line: 225, column: 12
              S53990=1;
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
            S53990=1;
            S53990=0;
            if((Boolean)(stopAllStatus_1.getpreval() == null ? false : ((Boolean)stopAllStatus_1.getpreval()).booleanValue()) == true){//sysj\FillerPlant.sysj line: 224, column: 8
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              if((Boolean)(stopAllStatus_1.getpreval() == null ? false : ((Boolean)stopAllStatus_1.getpreval()).booleanValue()) == false){//sysj\FillerPlant.sysj line: 228, column: 16
                bottleAtPos2.setPresent();//sysj\FillerPlant.sysj line: 229, column: 6
                currsigs.addElement(bottleAtPos2);
                enable2_1.setPresent();//sysj\FillerPlant.sysj line: 230, column: 6
                currsigs.addElement(enable2_1);
                S53990=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S53990=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57606(int [] tdone, int [] ends){
        switch(S53983){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(enable2_1.getprestatus()){//sysj\FillerPlant.sysj line: 206, column: 24
          enable2E.setPresent();//sysj\FillerPlant.sysj line: 206, column: 33
          currsigs.addElement(enable2E);
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
      
    }
  }

  public void thread57605(int [] tdone, int [] ends){
        switch(S53975){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(dosUnitEvacM_1.getprestatus()){//sysj\FillerPlant.sysj line: 204, column: 24
          dosUnitEvacE.setPresent();//sysj\FillerPlant.sysj line: 204, column: 38
          currsigs.addElement(dosUnitEvacE);
          System.out.println("Emitted dosUnitEvacE");//sysj\FillerPlant.sysj line: 204, column: 57
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread57604(int [] tdone, int [] ends){
        switch(S53964){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(dosUnitFilledM_1.getprestatus()){//sysj\FillerPlant.sysj line: 202, column: 24
          dosUnitFilledE.setPresent();//sysj\FillerPlant.sysj line: 202, column: 40
          currsigs.addElement(dosUnitFilledE);
          System.out.println("Emitted dosUnitFilledE");//sysj\FillerPlant.sysj line: 202, column: 61
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

  public void thread57603(int [] tdone, int [] ends){
        switch(S53953){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(filler_0_1.getprestatus()){//sysj\FillerPlant.sysj line: 200, column: 24
          Filler_0E.setPresent();//sysj\FillerPlant.sysj line: 200, column: 34
          currsigs.addElement(Filler_0E);
          System.out.println("Emitted Filler_0E");//sysj\FillerPlant.sysj line: 200, column: 50
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
      
    }
  }

  public void thread57602(int [] tdone, int [] ends){
        switch(S53942){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(filler_1_1.getprestatus()){//sysj\FillerPlant.sysj line: 198, column: 24
          Filler_1E.setPresent();//sysj\FillerPlant.sysj line: 198, column: 34
          currsigs.addElement(Filler_1E);
          System.out.println("Emitted Filler_1E");//sysj\FillerPlant.sysj line: 198, column: 50
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
      
    }
  }

  public void thread57601(int [] tdone, int [] ends){
        switch(S53931){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(filler_2_1.getprestatus()){//sysj\FillerPlant.sysj line: 196, column: 24
          Filler_2E.setPresent();//sysj\FillerPlant.sysj line: 196, column: 34
          currsigs.addElement(Filler_2E);
          System.out.println("Emitted Filler_2E");//sysj\FillerPlant.sysj line: 196, column: 50
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
      
    }
  }

  public void thread57600(int [] tdone, int [] ends){
        switch(S53920){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(filler_3_1.getprestatus()){//sysj\FillerPlant.sysj line: 194, column: 24
          Filler_3E.setPresent();//sysj\FillerPlant.sysj line: 194, column: 34
          currsigs.addElement(Filler_3E);
          System.out.println("Emitted Filler_3E");//sysj\FillerPlant.sysj line: 194, column: 50
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
      
    }
  }

  public void thread57599(int [] tdone, int [] ends){
        switch(S53909){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(filler_4_1.getprestatus()){//sysj\FillerPlant.sysj line: 192, column: 24
          Filler_4E.setPresent();//sysj\FillerPlant.sysj line: 192, column: 34
          currsigs.addElement(Filler_4E);
          System.out.println("Emitted Filler_4E");//sysj\FillerPlant.sysj line: 192, column: 50
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread57598(int [] tdone, int [] ends){
        switch(S53985){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread57599(tdone,ends);
        thread57600(tdone,ends);
        thread57601(tdone,ends);
        thread57602(tdone,ends);
        thread57603(tdone,ends);
        thread57604(tdone,ends);
        thread57605(tdone,ends);
        thread57606(tdone,ends);
        int biggest57607 = 0;
        if(ends[4]>=biggest57607){
          biggest57607=ends[4];
        }
        if(ends[5]>=biggest57607){
          biggest57607=ends[5];
        }
        if(ends[6]>=biggest57607){
          biggest57607=ends[6];
        }
        if(ends[7]>=biggest57607){
          biggest57607=ends[7];
        }
        if(ends[8]>=biggest57607){
          biggest57607=ends[8];
        }
        if(ends[9]>=biggest57607){
          biggest57607=ends[9];
        }
        if(ends[10]>=biggest57607){
          biggest57607=ends[10];
        }
        if(ends[11]>=biggest57607){
          biggest57607=ends[11];
        }
        if(biggest57607 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest57607 == 0){
          S53985=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread57597(int [] tdone, int [] ends){
        switch(S53898){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S53053){
          case 0 : 
            S53053=0;
            if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 0){//sysj\FillerPlant.sysj line: 113, column: 8
              filler_0_1.setPresent();//sysj\FillerPlant.sysj line: 114, column: 5
              currsigs.addElement(filler_0_1);
              S53053=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S53053=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S53053=1;
            if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 4){//sysj\FillerPlant.sysj line: 132, column: 8
              filler_4_1.setPresent();//sysj\FillerPlant.sysj line: 133, column: 5
              currsigs.addElement(filler_4_1);
              S53053=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 3){//sysj\FillerPlant.sysj line: 134, column: 15
                filler_3_1.setPresent();//sysj\FillerPlant.sysj line: 135, column: 5
                currsigs.addElement(filler_3_1);
                S53053=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 2){//sysj\FillerPlant.sysj line: 136, column: 15
                  filler_2_1.setPresent();//sysj\FillerPlant.sysj line: 137, column: 5
                  currsigs.addElement(filler_2_1);
                  S53053=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 1){//sysj\FillerPlant.sysj line: 138, column: 15
                    filler_1_1.setPresent();//sysj\FillerPlant.sysj line: 139, column: 5
                    currsigs.addElement(filler_1_1);
                    S53053=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 0){//sysj\FillerPlant.sysj line: 142, column: 13
                      filler_0_1.setPresent();//sysj\FillerPlant.sysj line: 143, column: 5
                      currsigs.addElement(filler_0_1);
                      S53053=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S53053=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            break;
          
          case 2 : 
            if(enable.getprestatus() || enable2_1.getprestatus()){//sysj\FillerPlant.sysj line: 150, column: 10
              System.out.println("----------------------------------------Beginning filler: " + (Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()));//sysj\FillerPlant.sysj line: 151, column: 4
              S53053=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(valveInjectorOnOff.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj\FillerPlant.sysj line: 152, column: 10
              System.out.println("First cycle -- valveInjectorOnOff && dosUnitValveRetract");//sysj\FillerPlant.sysj line: 153, column: 4
              S53053=4;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\FillerPlant.sysj line: 110, column: 2
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 110, column: 2
                ends[2]=2;
                ;//sysj\FillerPlant.sysj line: 110, column: 2
                S53053=5;
                dosUnitFilled.setPresent();//sysj\FillerPlant.sysj line: 156, column: 5
                currsigs.addElement(dosUnitFilled);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 110, column: 2
              ends[2]=2;
              ;//sysj\FillerPlant.sysj line: 110, column: 2
              S53053=5;
              dosUnitFilled.setPresent();//sysj\FillerPlant.sysj line: 156, column: 5
              currsigs.addElement(dosUnitFilled);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            if(enable.getprestatus() || enable2_1.getprestatus()){//sysj\FillerPlant.sysj line: 155, column: 10
              dosUnitFilledM_1.setPresent();//sysj\FillerPlant.sysj line: 159, column: 4
              currsigs.addElement(dosUnitFilledM_1);
              S53053=6;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\FillerPlant.sysj line: 110, column: 2
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 110, column: 2
                ends[2]=2;
                ;//sysj\FillerPlant.sysj line: 110, column: 2
                System.out.println("First cycle complete");//sysj\FillerPlant.sysj line: 161, column: 4
                S53053=7;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              dosUnitFilled.setPresent();//sysj\FillerPlant.sysj line: 156, column: 5
              currsigs.addElement(dosUnitFilled);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 110, column: 2
              ends[2]=2;
              ;//sysj\FillerPlant.sysj line: 110, column: 2
              System.out.println("First cycle complete");//sysj\FillerPlant.sysj line: 161, column: 4
              S53053=7;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 7 : 
            if(valveInletOnOff.getprestatus() && dosUnitValveExtend.getprestatus()){//sysj\FillerPlant.sysj line: 163, column: 10
              System.out.println("Second cycle -- valveInletOnOff && dosUnitValveExtend");//sysj\FillerPlant.sysj line: 164, column: 4
              S53053=8;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\FillerPlant.sysj line: 110, column: 2
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 110, column: 2
                ends[2]=2;
                ;//sysj\FillerPlant.sysj line: 110, column: 2
                S53053=9;
                dosUnitEvac.setPresent();//sysj\FillerPlant.sysj line: 167, column: 5
                currsigs.addElement(dosUnitEvac);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 8 : 
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 110, column: 2
              ends[2]=2;
              ;//sysj\FillerPlant.sysj line: 110, column: 2
              S53053=9;
              dosUnitEvac.setPresent();//sysj\FillerPlant.sysj line: 167, column: 5
              currsigs.addElement(dosUnitEvac);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 9 : 
            if(enable.getprestatus() || enable2_1.getprestatus()){//sysj\FillerPlant.sysj line: 166, column: 10
              dosUnitEvacM_1.setPresent();//sysj\FillerPlant.sysj line: 170, column: 4
              currsigs.addElement(dosUnitEvacM_1);
              S53053=10;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\FillerPlant.sysj line: 110, column: 2
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 110, column: 2
                ends[2]=2;
                ;//sysj\FillerPlant.sysj line: 110, column: 2
                System.out.println("Second cycle complete");//sysj\FillerPlant.sysj line: 172, column: 4
                System.out.println("----------------------------------------Filler number: " + (Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) + " complete");//sysj\FillerPlant.sysj line: 178, column: 4
                fillerNumber_1.setPresent();//sysj\FillerPlant.sysj line: 179, column: 4
                currsigs.addElement(fillerNumber_1);
                fillerNumber_1.setValue((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) - 1);//sysj\FillerPlant.sysj line: 179, column: 4
                S53053=0;
                if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 0){//sysj\FillerPlant.sysj line: 113, column: 8
                  filler_0_1.setPresent();//sysj\FillerPlant.sysj line: 114, column: 5
                  currsigs.addElement(filler_0_1);
                  S53053=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S53053=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              dosUnitEvac.setPresent();//sysj\FillerPlant.sysj line: 167, column: 5
              currsigs.addElement(dosUnitEvac);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 10 : 
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 110, column: 2
              ends[2]=2;
              ;//sysj\FillerPlant.sysj line: 110, column: 2
              System.out.println("Second cycle complete");//sysj\FillerPlant.sysj line: 172, column: 4
              System.out.println("----------------------------------------Filler number: " + (Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) + " complete");//sysj\FillerPlant.sysj line: 178, column: 4
              fillerNumber_1.setPresent();//sysj\FillerPlant.sysj line: 179, column: 4
              currsigs.addElement(fillerNumber_1);
              fillerNumber_1.setValue((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) - 1);//sysj\FillerPlant.sysj line: 179, column: 4
              S53053=0;
              if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 0){//sysj\FillerPlant.sysj line: 113, column: 8
                filler_0_1.setPresent();//sysj\FillerPlant.sysj line: 114, column: 5
                currsigs.addElement(filler_0_1);
                S53053=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S53053=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57595(int [] tdone, int [] ends){
        S54176=1;
    if(filler_all_complete_1.getprestatus()){//sysj\FillerPlant.sysj line: 315, column: 12
      filler_all_completeE.setPresent();//sysj\FillerPlant.sysj line: 316, column: 5
      currsigs.addElement(filler_all_completeE);
      System.out.println("filler all complete");//sysj\FillerPlant.sysj line: 317, column: 5
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread57594(int [] tdone, int [] ends){
        S54165=1;
    if(enableFiller.getprestatus()){//sysj\FillerPlant.sysj line: 303, column: 12
      filler_all_complete_1.setPresent();//sysj\FillerPlant.sysj line: 305, column: 5
      currsigs.addElement(filler_all_complete_1);
      stopAllStatus_1.setPresent();//sysj\FillerPlant.sysj line: 306, column: 5
      currsigs.addElement(stopAllStatus_1);
      stopAllStatus_1.setValue(false);//sysj\FillerPlant.sysj line: 306, column: 5
      filler_4_1.setPresent();//sysj\FillerPlant.sysj line: 307, column: 5
      currsigs.addElement(filler_4_1);
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

  public void thread57593(int [] tdone, int [] ends){
        S54154=1;
    S54153=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread57592(int [] tdone, int [] ends){
        S54002=1;
    S53990=0;
    if((Boolean)(stopAllStatus_1.getpreval() == null ? false : ((Boolean)stopAllStatus_1.getpreval()).booleanValue()) == true){//sysj\FillerPlant.sysj line: 224, column: 8
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      if((Boolean)(stopAllStatus_1.getpreval() == null ? false : ((Boolean)stopAllStatus_1.getpreval()).booleanValue()) == false){//sysj\FillerPlant.sysj line: 228, column: 16
        bottleAtPos2.setPresent();//sysj\FillerPlant.sysj line: 229, column: 6
        currsigs.addElement(bottleAtPos2);
        enable2_1.setPresent();//sysj\FillerPlant.sysj line: 230, column: 6
        currsigs.addElement(enable2_1);
        S53990=1;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S53990=1;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread57590(int [] tdone, int [] ends){
        S53983=1;
    if(enable2_1.getprestatus()){//sysj\FillerPlant.sysj line: 206, column: 24
      enable2E.setPresent();//sysj\FillerPlant.sysj line: 206, column: 33
      currsigs.addElement(enable2E);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread57589(int [] tdone, int [] ends){
        S53975=1;
    if(dosUnitEvacM_1.getprestatus()){//sysj\FillerPlant.sysj line: 204, column: 24
      dosUnitEvacE.setPresent();//sysj\FillerPlant.sysj line: 204, column: 38
      currsigs.addElement(dosUnitEvacE);
      System.out.println("Emitted dosUnitEvacE");//sysj\FillerPlant.sysj line: 204, column: 57
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread57588(int [] tdone, int [] ends){
        S53964=1;
    if(dosUnitFilledM_1.getprestatus()){//sysj\FillerPlant.sysj line: 202, column: 24
      dosUnitFilledE.setPresent();//sysj\FillerPlant.sysj line: 202, column: 40
      currsigs.addElement(dosUnitFilledE);
      System.out.println("Emitted dosUnitFilledE");//sysj\FillerPlant.sysj line: 202, column: 61
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread57587(int [] tdone, int [] ends){
        S53953=1;
    if(filler_0_1.getprestatus()){//sysj\FillerPlant.sysj line: 200, column: 24
      Filler_0E.setPresent();//sysj\FillerPlant.sysj line: 200, column: 34
      currsigs.addElement(Filler_0E);
      System.out.println("Emitted Filler_0E");//sysj\FillerPlant.sysj line: 200, column: 50
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread57586(int [] tdone, int [] ends){
        S53942=1;
    if(filler_1_1.getprestatus()){//sysj\FillerPlant.sysj line: 198, column: 24
      Filler_1E.setPresent();//sysj\FillerPlant.sysj line: 198, column: 34
      currsigs.addElement(Filler_1E);
      System.out.println("Emitted Filler_1E");//sysj\FillerPlant.sysj line: 198, column: 50
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread57585(int [] tdone, int [] ends){
        S53931=1;
    if(filler_2_1.getprestatus()){//sysj\FillerPlant.sysj line: 196, column: 24
      Filler_2E.setPresent();//sysj\FillerPlant.sysj line: 196, column: 34
      currsigs.addElement(Filler_2E);
      System.out.println("Emitted Filler_2E");//sysj\FillerPlant.sysj line: 196, column: 50
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread57584(int [] tdone, int [] ends){
        S53920=1;
    if(filler_3_1.getprestatus()){//sysj\FillerPlant.sysj line: 194, column: 24
      Filler_3E.setPresent();//sysj\FillerPlant.sysj line: 194, column: 34
      currsigs.addElement(Filler_3E);
      System.out.println("Emitted Filler_3E");//sysj\FillerPlant.sysj line: 194, column: 50
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread57583(int [] tdone, int [] ends){
        S53909=1;
    if(filler_4_1.getprestatus()){//sysj\FillerPlant.sysj line: 192, column: 24
      Filler_4E.setPresent();//sysj\FillerPlant.sysj line: 192, column: 34
      currsigs.addElement(Filler_4E);
      System.out.println("Emitted Filler_4E");//sysj\FillerPlant.sysj line: 192, column: 50
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread57582(int [] tdone, int [] ends){
        S53985=1;
    thread57583(tdone,ends);
    thread57584(tdone,ends);
    thread57585(tdone,ends);
    thread57586(tdone,ends);
    thread57587(tdone,ends);
    thread57588(tdone,ends);
    thread57589(tdone,ends);
    thread57590(tdone,ends);
    int biggest57591 = 0;
    if(ends[4]>=biggest57591){
      biggest57591=ends[4];
    }
    if(ends[5]>=biggest57591){
      biggest57591=ends[5];
    }
    if(ends[6]>=biggest57591){
      biggest57591=ends[6];
    }
    if(ends[7]>=biggest57591){
      biggest57591=ends[7];
    }
    if(ends[8]>=biggest57591){
      biggest57591=ends[8];
    }
    if(ends[9]>=biggest57591){
      biggest57591=ends[9];
    }
    if(ends[10]>=biggest57591){
      biggest57591=ends[10];
    }
    if(ends[11]>=biggest57591){
      biggest57591=ends[11];
    }
    if(biggest57591 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread57581(int [] tdone, int [] ends){
        S53898=1;
    S53053=0;
    if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 0){//sysj\FillerPlant.sysj line: 113, column: 8
      filler_0_1.setPresent();//sysj\FillerPlant.sysj line: 114, column: 5
      currsigs.addElement(filler_0_1);
      S53053=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S53053=1;
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
      switch(S57579){
        case 0 : 
          S57579=0;
          break RUN;
        
        case 1 : 
          S57579=2;
          S57579=2;
          FillerStatus_1.setClear();//sysj\FillerPlant.sysj line: 62, column: 2
          stopAllStatus_1.setClear();//sysj\FillerPlant.sysj line: 63, column: 2
          stopAllStatus_1.setPresent();//sysj\FillerPlant.sysj line: 64, column: 2
          currsigs.addElement(stopAllStatus_1);
          stopAllStatus_1.setValue(false);//sysj\FillerPlant.sysj line: 64, column: 2
          FillerStatus_1.setPresent();//sysj\FillerPlant.sysj line: 65, column: 2
          currsigs.addElement(FillerStatus_1);
          FillerStatus_1.setValue(0);//sysj\FillerPlant.sysj line: 65, column: 2
          fillerNotDone_1.setClear();//sysj\FillerPlant.sysj line: 67, column: 2
          fillerDone_1.setClear();//sysj\FillerPlant.sysj line: 68, column: 2
          stopAll_1.setClear();//sysj\FillerPlant.sysj line: 69, column: 2
          filler1_status_1.setClear();//sysj\FillerPlant.sysj line: 72, column: 2
          filler2_status_1.setClear();//sysj\FillerPlant.sysj line: 72, column: 2
          filler3_status_1.setClear();//sysj\FillerPlant.sysj line: 72, column: 2
          filler4_status_1.setClear();//sysj\FillerPlant.sysj line: 72, column: 2
          filler1done_1.setClear();//sysj\FillerPlant.sysj line: 82, column: 2
          filler2done_1.setClear();//sysj\FillerPlant.sysj line: 83, column: 2
          filler3done_1.setClear();//sysj\FillerPlant.sysj line: 84, column: 2
          filler4done_1.setClear();//sysj\FillerPlant.sysj line: 85, column: 2
          filler_all_complete_1.setClear();//sysj\FillerPlant.sysj line: 86, column: 2
          filler_0_1.setClear();//sysj\FillerPlant.sysj line: 88, column: 2
          filler_1_1.setClear();//sysj\FillerPlant.sysj line: 88, column: 2
          filler_2_1.setClear();//sysj\FillerPlant.sysj line: 88, column: 2
          filler_3_1.setClear();//sysj\FillerPlant.sysj line: 88, column: 2
          filler_4_1.setClear();//sysj\FillerPlant.sysj line: 88, column: 2
          dosUnitFilledM_1.setClear();//sysj\FillerPlant.sysj line: 89, column: 2
          dosUnitEvacM_1.setClear();//sysj\FillerPlant.sysj line: 89, column: 2
          filler_1_In_1.setClear();//sysj\FillerPlant.sysj line: 90, column: 2
          filler_2_In_1.setClear();//sysj\FillerPlant.sysj line: 90, column: 2
          filler_3_In_1.setClear();//sysj\FillerPlant.sysj line: 90, column: 2
          filler_4_In_1.setClear();//sysj\FillerPlant.sysj line: 90, column: 2
          enable2_1.setClear();//sysj\FillerPlant.sysj line: 91, column: 2
          fillerNumber_1.setClear();//sysj\FillerPlant.sysj line: 96, column: 2
          S53051=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          FillerStatus_1.setClear();//sysj\FillerPlant.sysj line: 62, column: 2
          stopAllStatus_1.setClear();//sysj\FillerPlant.sysj line: 63, column: 2
          fillerNotDone_1.setClear();//sysj\FillerPlant.sysj line: 67, column: 2
          fillerDone_1.setClear();//sysj\FillerPlant.sysj line: 68, column: 2
          stopAll_1.setClear();//sysj\FillerPlant.sysj line: 69, column: 2
          filler1_status_1.setClear();//sysj\FillerPlant.sysj line: 72, column: 2
          filler2_status_1.setClear();//sysj\FillerPlant.sysj line: 72, column: 2
          filler3_status_1.setClear();//sysj\FillerPlant.sysj line: 72, column: 2
          filler4_status_1.setClear();//sysj\FillerPlant.sysj line: 72, column: 2
          filler1done_1.setClear();//sysj\FillerPlant.sysj line: 82, column: 2
          filler2done_1.setClear();//sysj\FillerPlant.sysj line: 83, column: 2
          filler3done_1.setClear();//sysj\FillerPlant.sysj line: 84, column: 2
          filler4done_1.setClear();//sysj\FillerPlant.sysj line: 85, column: 2
          filler_all_complete_1.setClear();//sysj\FillerPlant.sysj line: 86, column: 2
          filler_0_1.setClear();//sysj\FillerPlant.sysj line: 88, column: 2
          filler_1_1.setClear();//sysj\FillerPlant.sysj line: 88, column: 2
          filler_2_1.setClear();//sysj\FillerPlant.sysj line: 88, column: 2
          filler_3_1.setClear();//sysj\FillerPlant.sysj line: 88, column: 2
          filler_4_1.setClear();//sysj\FillerPlant.sysj line: 88, column: 2
          dosUnitFilledM_1.setClear();//sysj\FillerPlant.sysj line: 89, column: 2
          dosUnitEvacM_1.setClear();//sysj\FillerPlant.sysj line: 89, column: 2
          filler_1_In_1.setClear();//sysj\FillerPlant.sysj line: 90, column: 2
          filler_2_In_1.setClear();//sysj\FillerPlant.sysj line: 90, column: 2
          filler_3_In_1.setClear();//sysj\FillerPlant.sysj line: 90, column: 2
          filler_4_In_1.setClear();//sysj\FillerPlant.sysj line: 90, column: 2
          enable2_1.setClear();//sysj\FillerPlant.sysj line: 91, column: 2
          fillerNumber_1.setClear();//sysj\FillerPlant.sysj line: 96, column: 2
          switch(S53051){
            case 0 : 
              if(enable.getprestatus() || enable2_1.getprestatus()){//sysj\FillerPlant.sysj line: 104, column: 8
                fillerNumber_1.setPresent();//sysj\FillerPlant.sysj line: 106, column: 2
                currsigs.addElement(fillerNumber_1);
                fillerNumber_1.setValue((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) + 4);//sysj\FillerPlant.sysj line: 106, column: 2
                S53051=1;
                thread57581(tdone,ends);
                thread57582(tdone,ends);
                thread57592(tdone,ends);
                thread57593(tdone,ends);
                thread57594(tdone,ends);
                thread57595(tdone,ends);
                int biggest57596 = 0;
                if(ends[2]>=biggest57596){
                  biggest57596=ends[2];
                }
                if(ends[3]>=biggest57596){
                  biggest57596=ends[3];
                }
                if(ends[12]>=biggest57596){
                  biggest57596=ends[12];
                }
                if(ends[13]>=biggest57596){
                  biggest57596=ends[13];
                }
                if(ends[16]>=biggest57596){
                  biggest57596=ends[16];
                }
                if(ends[17]>=biggest57596){
                  biggest57596=ends[17];
                }
                if(biggest57596 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              thread57597(tdone,ends);
              thread57598(tdone,ends);
              thread57608(tdone,ends);
              thread57609(tdone,ends);
              thread57619(tdone,ends);
              thread57620(tdone,ends);
              int biggest57621 = 0;
              if(ends[2]>=biggest57621){
                biggest57621=ends[2];
              }
              if(ends[3]>=biggest57621){
                biggest57621=ends[3];
              }
              if(ends[12]>=biggest57621){
                biggest57621=ends[12];
              }
              if(ends[13]>=biggest57621){
                biggest57621=ends[13];
              }
              if(ends[16]>=biggest57621){
                biggest57621=ends[16];
              }
              if(ends[17]>=biggest57621){
                biggest57621=ends[17];
              }
              if(biggest57621 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest57621 == 0){
                S57579=0;
                active[1]=0;
                ends[1]=0;
                S57579=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    FillerStatus_1 = new Signal();
    stopAllStatus_1 = new Signal();
    fillerNotDone_1 = new Signal();
    fillerDone_1 = new Signal();
    stopAll_1 = new Signal();
    filler1_status_1 = new Signal();
    filler2_status_1 = new Signal();
    filler3_status_1 = new Signal();
    filler4_status_1 = new Signal();
    filler1done_1 = new Signal();
    filler2done_1 = new Signal();
    filler3done_1 = new Signal();
    filler4done_1 = new Signal();
    filler_all_complete_1 = new Signal();
    filler_0_1 = new Signal();
    filler_1_1 = new Signal();
    filler_2_1 = new Signal();
    filler_3_1 = new Signal();
    filler_4_1 = new Signal();
    dosUnitFilledM_1 = new Signal();
    dosUnitEvacM_1 = new Signal();
    filler_1_In_1 = new Signal();
    filler_2_In_1 = new Signal();
    filler_3_In_1 = new Signal();
    filler_4_In_1 = new Signal();
    enable2_1 = new Signal();
    fillerNumber_1 = new Signal();
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
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
          enable.gethook();
          fillerReady.gethook();
          jobDone.gethook();
          fillerReadyChannel.gethook();
          enableFiller.gethook();
          LiquidAmount1E.gethook();
          LiquidAmount2E.gethook();
          LiquidAmount3E.gethook();
          LiquidAmount4E.gethook();
          BottleQuantityE.gethook();
          bottleAtPos2F.gethook();
          df = true;
        }
        runClockDomain();
      }
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      enable.setpreclear();
      fillerReady.setpreclear();
      jobDone.setpreclear();
      fillerReadyChannel.setpreclear();
      enableFiller.setpreclear();
      LiquidAmount1E.setpreclear();
      LiquidAmount2E.setpreclear();
      LiquidAmount3E.setpreclear();
      LiquidAmount4E.setpreclear();
      BottleQuantityE.setpreclear();
      bottleAtPos2F.setpreclear();
      bottleAtPos2.setpreclear();
      injectorOn.setpreclear();
      injectorOff.setpreclear();
      bottleDonePos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      Filler_4E.setpreclear();
      Filler_3E.setpreclear();
      Filler_2E.setpreclear();
      Filler_1E.setpreclear();
      Filler_0E.setpreclear();
      dosUnitFilledE.setpreclear();
      dosUnitEvacE.setpreclear();
      enable2E.setpreclear();
      filler_all_completeE.setpreclear();
      bottleDonePos2Conveyor.setpreclear();
      FillerStatus_1.setpreclear();
      stopAllStatus_1.setpreclear();
      fillerNotDone_1.setpreclear();
      fillerDone_1.setpreclear();
      stopAll_1.setpreclear();
      filler1_status_1.setpreclear();
      filler2_status_1.setpreclear();
      filler3_status_1.setpreclear();
      filler4_status_1.setpreclear();
      filler1done_1.setpreclear();
      filler2done_1.setpreclear();
      filler3done_1.setpreclear();
      filler4done_1.setpreclear();
      filler_all_complete_1.setpreclear();
      filler_0_1.setpreclear();
      filler_1_1.setpreclear();
      filler_2_1.setpreclear();
      filler_3_1.setpreclear();
      filler_4_1.setpreclear();
      dosUnitFilledM_1.setpreclear();
      dosUnitEvacM_1.setpreclear();
      filler_1_In_1.setpreclear();
      filler_2_In_1.setpreclear();
      filler_3_In_1.setpreclear();
      filler_4_In_1.setpreclear();
      enable2_1.setpreclear();
      fillerNumber_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = valveInjectorOnOff.getStatus() ? valveInjectorOnOff.setprepresent() : valveInjectorOnOff.setpreclear();
      valveInjectorOnOff.setpreval(valveInjectorOnOff.getValue());
      valveInjectorOnOff.setClear();
      dummyint = valveInletOnOff.getStatus() ? valveInletOnOff.setprepresent() : valveInletOnOff.setpreclear();
      valveInletOnOff.setpreval(valveInletOnOff.getValue());
      valveInletOnOff.setClear();
      dummyint = dosUnitValveRetract.getStatus() ? dosUnitValveRetract.setprepresent() : dosUnitValveRetract.setpreclear();
      dosUnitValveRetract.setpreval(dosUnitValveRetract.getValue());
      dosUnitValveRetract.setClear();
      dummyint = dosUnitValveExtend.getStatus() ? dosUnitValveExtend.setprepresent() : dosUnitValveExtend.setpreclear();
      dosUnitValveExtend.setpreval(dosUnitValveExtend.getValue());
      dosUnitValveExtend.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = fillerReady.getStatus() ? fillerReady.setprepresent() : fillerReady.setpreclear();
      fillerReady.setpreval(fillerReady.getValue());
      fillerReady.setClear();
      dummyint = jobDone.getStatus() ? jobDone.setprepresent() : jobDone.setpreclear();
      jobDone.setpreval(jobDone.getValue());
      jobDone.setClear();
      dummyint = fillerReadyChannel.getStatus() ? fillerReadyChannel.setprepresent() : fillerReadyChannel.setpreclear();
      fillerReadyChannel.setpreval(fillerReadyChannel.getValue());
      fillerReadyChannel.setClear();
      dummyint = enableFiller.getStatus() ? enableFiller.setprepresent() : enableFiller.setpreclear();
      enableFiller.setpreval(enableFiller.getValue());
      enableFiller.setClear();
      dummyint = LiquidAmount1E.getStatus() ? LiquidAmount1E.setprepresent() : LiquidAmount1E.setpreclear();
      LiquidAmount1E.setpreval(LiquidAmount1E.getValue());
      LiquidAmount1E.setClear();
      dummyint = LiquidAmount2E.getStatus() ? LiquidAmount2E.setprepresent() : LiquidAmount2E.setpreclear();
      LiquidAmount2E.setpreval(LiquidAmount2E.getValue());
      LiquidAmount2E.setClear();
      dummyint = LiquidAmount3E.getStatus() ? LiquidAmount3E.setprepresent() : LiquidAmount3E.setpreclear();
      LiquidAmount3E.setpreval(LiquidAmount3E.getValue());
      LiquidAmount3E.setClear();
      dummyint = LiquidAmount4E.getStatus() ? LiquidAmount4E.setprepresent() : LiquidAmount4E.setpreclear();
      LiquidAmount4E.setpreval(LiquidAmount4E.getValue());
      LiquidAmount4E.setClear();
      dummyint = BottleQuantityE.getStatus() ? BottleQuantityE.setprepresent() : BottleQuantityE.setpreclear();
      BottleQuantityE.setpreval(BottleQuantityE.getValue());
      BottleQuantityE.setClear();
      dummyint = bottleAtPos2F.getStatus() ? bottleAtPos2F.setprepresent() : bottleAtPos2F.setpreclear();
      bottleAtPos2F.setpreval(bottleAtPos2F.getValue());
      bottleAtPos2F.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      injectorOn.sethook();
      injectorOn.setClear();
      injectorOff.sethook();
      injectorOff.setClear();
      bottleDonePos2.sethook();
      bottleDonePos2.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      Filler_4E.sethook();
      Filler_4E.setClear();
      Filler_3E.sethook();
      Filler_3E.setClear();
      Filler_2E.sethook();
      Filler_2E.setClear();
      Filler_1E.sethook();
      Filler_1E.setClear();
      Filler_0E.sethook();
      Filler_0E.setClear();
      dosUnitFilledE.sethook();
      dosUnitFilledE.setClear();
      dosUnitEvacE.sethook();
      dosUnitEvacE.setClear();
      enable2E.sethook();
      enable2E.setClear();
      filler_all_completeE.sethook();
      filler_all_completeE.setClear();
      bottleDonePos2Conveyor.sethook();
      bottleDonePos2Conveyor.setClear();
      FillerStatus_1.setClear();
      stopAllStatus_1.setClear();
      fillerNotDone_1.setClear();
      fillerDone_1.setClear();
      stopAll_1.setClear();
      filler1_status_1.setClear();
      filler2_status_1.setClear();
      filler3_status_1.setClear();
      filler4_status_1.setClear();
      filler1done_1.setClear();
      filler2done_1.setClear();
      filler3done_1.setClear();
      filler4done_1.setClear();
      filler_all_complete_1.setClear();
      filler_0_1.setClear();
      filler_1_1.setClear();
      filler_2_1.setClear();
      filler_3_1.setClear();
      filler_4_1.setClear();
      dosUnitFilledM_1.setClear();
      dosUnitEvacM_1.setClear();
      filler_1_In_1.setClear();
      filler_2_In_1.setClear();
      filler_3_In_1.setClear();
      filler_4_In_1.setClear();
      enable2_1.setClear();
      fillerNumber_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
        enable.gethook();
        fillerReady.gethook();
        jobDone.gethook();
        fillerReadyChannel.gethook();
        enableFiller.gethook();
        LiquidAmount1E.gethook();
        LiquidAmount2E.gethook();
        LiquidAmount3E.gethook();
        LiquidAmount4E.gethook();
        BottleQuantityE.gethook();
        bottleAtPos2F.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
