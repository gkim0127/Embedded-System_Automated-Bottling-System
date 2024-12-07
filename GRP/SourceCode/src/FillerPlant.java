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
  public Signal enableFiller = new Signal("enableFiller", Signal.INPUT);
  public Signal LiquidAmount1E = new Signal("LiquidAmount1E", Signal.INPUT);
  public Signal LiquidAmount2E = new Signal("LiquidAmount2E", Signal.INPUT);
  public Signal LiquidAmount3E = new Signal("LiquidAmount3E", Signal.INPUT);
  public Signal LiquidAmount4E = new Signal("LiquidAmount4E", Signal.INPUT);
  public Signal BottleQuantityE = new Signal("BottleQuantityE", Signal.INPUT);
  public Signal bottleAtPos2F = new Signal("bottleAtPos2F", Signal.INPUT);
  public Signal fillerReadyStart = new Signal("fillerReadyStart", Signal.INPUT);
  public Signal systemEnableFiller = new Signal("systemEnableFiller", Signal.INPUT);
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
  public Signal disableConveyorMain = new Signal("disableConveyorMain", Signal.OUTPUT);
  private Signal FillerStatus_1;
  private Signal stopAllStatus_1;
  private Signal fillerNotDone_1;
  private Signal fillerDone_1;
  private Signal stopAll_1;
  private Signal filler_all_complete_1;
  private Signal filler_0_1;
  private Signal filler_1_1;
  private Signal filler_2_1;
  private Signal filler_3_1;
  private Signal filler_4_1;
  private Signal dosUnitFilledM_1;
  private Signal dosUnitEvacM_1;
  private Signal enable2_1;
  private Signal totalBottleNumber_1;
  private Signal fillerNumber_1;
  private Signal counter_1;
  private long __start_thread_2;//sysj\FillerPlant.sysj line: 80, column: 17
  private int S199253 = 1;
  private int S193051 = 1;
  private int S194236 = 1;
  private int S193054 = 1;
  private int S194323 = 1;
  private int S194247 = 1;
  private int S194258 = 1;
  private int S194269 = 1;
  private int S194280 = 1;
  private int S194291 = 1;
  private int S194302 = 1;
  private int S194313 = 1;
  private int S194321 = 1;
  private int S194340 = 1;
  private int S194328 = 1;
  private int S194552 = 1;
  private int S194551 = 1;
  private int S194375 = 1;
  private int S194341 = 1;
  private int S194346 = 1;
  private int S194351 = 1;
  private int S194356 = 1;
  private int S194560 = 1;
  private int S194571 = 1;
  private int S194591 = 1;
  private int S194590 = 1;
  private int S194574 = 1;
  private int S194597 = 1;
  private int S194596 = 1;
  
  private int[] ends = new int[21];
  private int[] tdone = new int[21];
  
  public void thread199297(int [] tdone, int [] ends){
        switch(S194597){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S194596){
          case 0 : 
            if(systemEnableFiller.getprestatus()){//sysj\FillerPlant.sysj line: 250, column: 9
              System.out.println("aborted --- ");//sysj\FillerPlant.sysj line: 255, column: 3
              counter_1.setPresent();//sysj\FillerPlant.sysj line: 256, column: 3
              currsigs.addElement(counter_1);
              counter_1.setValue((Integer)(counter_1.getpreval() == null ? 0 : ((Integer)counter_1.getpreval()).intValue()) - (Integer)(counter_1.getpreval() == null ? 0 : ((Integer)counter_1.getpreval()).intValue()));//sysj\FillerPlant.sysj line: 256, column: 3
              S194596=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              disableConveyorMain.setPresent();//sysj\FillerPlant.sysj line: 252, column: 5
              currsigs.addElement(disableConveyorMain);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 1 : 
            S194596=1;
            S194597=0;
            active[20]=0;
            ends[20]=0;
            tdone[20]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread199296(int [] tdone, int [] ends){
        switch(S194591){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S194590){
          case 0 : 
            S194590=0;
            S194590=1;
            S194574=0;
            if(((Integer)(BottleQuantityE.getpreval() == null ? 0 : ((Integer)BottleQuantityE.getpreval()).intValue()) - (Integer)(counter_1.getpreval() == null ? 0 : ((Integer)counter_1.getpreval()).intValue())) == 0){//sysj\FillerPlant.sysj line: 238, column: 8
              counter_1.setPresent();//sysj\FillerPlant.sysj line: 239, column: 5
              currsigs.addElement(counter_1);
              counter_1.setValue((Integer)(counter_1.getpreval() == null ? 0 : ((Integer)counter_1.getpreval()).intValue()) - (Integer)(counter_1.getpreval() == null ? 0 : ((Integer)counter_1.getpreval()).intValue()));//sysj\FillerPlant.sysj line: 239, column: 5
              disableConveyorMain.setPresent();//sysj\FillerPlant.sysj line: 242, column: 5
              currsigs.addElement(disableConveyorMain);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S194574=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            switch(S194574){
              case 0 : 
                S194574=1;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
                break;
              
              case 1 : 
                S194574=1;
                S194574=0;
                if(((Integer)(BottleQuantityE.getpreval() == null ? 0 : ((Integer)BottleQuantityE.getpreval()).intValue()) - (Integer)(counter_1.getpreval() == null ? 0 : ((Integer)counter_1.getpreval()).intValue())) == 0){//sysj\FillerPlant.sysj line: 238, column: 8
                  counter_1.setPresent();//sysj\FillerPlant.sysj line: 239, column: 5
                  currsigs.addElement(counter_1);
                  counter_1.setValue((Integer)(counter_1.getpreval() == null ? 0 : ((Integer)counter_1.getpreval()).intValue()) - (Integer)(counter_1.getpreval() == null ? 0 : ((Integer)counter_1.getpreval()).intValue()));//sysj\FillerPlant.sysj line: 239, column: 5
                  disableConveyorMain.setPresent();//sysj\FillerPlant.sysj line: 242, column: 5
                  currsigs.addElement(disableConveyorMain);
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S194574=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread199295(int [] tdone, int [] ends){
        switch(S194571){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(filler_all_complete_1.getprestatus()){//sysj\FillerPlant.sysj line: 226, column: 12
          filler_all_completeE.setPresent();//sysj\FillerPlant.sysj line: 227, column: 5
          currsigs.addElement(filler_all_completeE);
          System.out.println("filler all complete");//sysj\FillerPlant.sysj line: 228, column: 5
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread199294(int [] tdone, int [] ends){
        switch(S194560){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(fillerReadyStart.getprestatus()){//sysj\FillerPlant.sysj line: 217, column: 12
          stopAllStatus_1.setPresent();//sysj\FillerPlant.sysj line: 218, column: 5
          currsigs.addElement(stopAllStatus_1);
          stopAllStatus_1.setValue(false);//sysj\FillerPlant.sysj line: 218, column: 5
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

  public void thread199292(int [] tdone, int [] ends){
        switch(S194356){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        stopAllStatus_1.setPresent();//sysj\FillerPlant.sysj line: 201, column: 7
        currsigs.addElement(stopAllStatus_1);
        stopAllStatus_1.setValue(true);//sysj\FillerPlant.sysj line: 201, column: 7
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread199291(int [] tdone, int [] ends){
        switch(S194351){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        stopAll_1.setPresent();//sysj\FillerPlant.sysj line: 197, column: 7
        currsigs.addElement(stopAll_1);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread199290(int [] tdone, int [] ends){
        switch(S194346){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        bottleDonePos2.setPresent();//sysj\FillerPlant.sysj line: 193, column: 7
        currsigs.addElement(bottleDonePos2);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread199288(int [] tdone, int [] ends){
        S194356=1;
    stopAllStatus_1.setPresent();//sysj\FillerPlant.sysj line: 201, column: 7
    currsigs.addElement(stopAllStatus_1);
    stopAllStatus_1.setValue(true);//sysj\FillerPlant.sysj line: 201, column: 7
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread199287(int [] tdone, int [] ends){
        S194351=1;
    stopAll_1.setPresent();//sysj\FillerPlant.sysj line: 197, column: 7
    currsigs.addElement(stopAll_1);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread199286(int [] tdone, int [] ends){
        S194346=1;
    bottleDonePos2.setPresent();//sysj\FillerPlant.sysj line: 193, column: 7
    currsigs.addElement(bottleDonePos2);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread199285(int [] tdone, int [] ends){
        switch(S194552){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S194551){
          case 0 : 
            S194551=0;
            S194551=1;
            S194375=0;
            if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 0){//sysj\FillerPlant.sysj line: 168, column: 7
              counter_1.setPresent();//sysj\FillerPlant.sysj line: 169, column: 5
              currsigs.addElement(counter_1);
              counter_1.setValue((Integer)(counter_1.getpreval() == null ? 0 : ((Integer)counter_1.getpreval()).intValue()) + 1);//sysj\FillerPlant.sysj line: 169, column: 5
              S194341=0;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              S194375=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            switch(S194375){
              case 0 : 
                switch(S194341){
                  case 0 : 
                    S194341=0;
                    System.out.println("----------------------------------------All 4 fillers complete");//sysj\FillerPlant.sysj line: 172, column: 5
                    System.out.println(" ");//sysj\FillerPlant.sysj line: 173, column: 5
                    System.out.println("------------Status------------");//sysj\FillerPlant.sysj line: 174, column: 5
                    System.out.println("Liquid 1 Amount: " + ((Integer)(LiquidAmount1E.getpreval() == null ? 0 : ((Integer)LiquidAmount1E.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 175, column: 5
                    System.out.println("Liquid 2 Amount: " + ((Integer)(LiquidAmount2E.getpreval() == null ? 0 : ((Integer)LiquidAmount2E.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 176, column: 5
                    System.out.println("Liquid 3 Amount: " + ((Integer)(LiquidAmount3E.getpreval() == null ? 0 : ((Integer)LiquidAmount3E.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 177, column: 5
                    System.out.println("Liquid 4 Amount: " + ((Integer)(LiquidAmount4E.getpreval() == null ? 0 : ((Integer)LiquidAmount4E.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 178, column: 5
                    System.out.println(" ");//sysj\FillerPlant.sysj line: 179, column: 5
                    System.out.println("Bottle quantitiy left: " + ((Integer)(BottleQuantityE.getpreval() == null ? 0 : ((Integer)BottleQuantityE.getpreval()).intValue()) - (Integer)(counter_1.getpreval() == null ? 0 : ((Integer)counter_1.getpreval()).intValue())));//sysj\FillerPlant.sysj line: 181, column: 5
                    System.out.println("------------Status------------");//sysj\FillerPlant.sysj line: 182, column: 5
                    System.out.println(" ");//sysj\FillerPlant.sysj line: 183, column: 5
                    System.out.println(" ");//sysj\FillerPlant.sysj line: 187, column: 5
                    filler_0_1.setPresent();//sysj\FillerPlant.sysj line: 189, column: 5
                    currsigs.addElement(filler_0_1);
                    S194341=1;
                    thread199286(tdone,ends);
                    thread199287(tdone,ends);
                    thread199288(tdone,ends);
                    int biggest199289 = 0;
                    if(ends[14]>=biggest199289){
                      biggest199289=ends[14];
                    }
                    if(ends[15]>=biggest199289){
                      biggest199289=ends[15];
                    }
                    if(ends[16]>=biggest199289){
                      biggest199289=ends[16];
                    }
                    if(biggest199289 == 1){
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(bottleAtPos2F.getprestatus()){//sysj\FillerPlant.sysj line: 191, column: 11
                      fillerNumber_1.setPresent();//sysj\FillerPlant.sysj line: 205, column: 5
                      currsigs.addElement(fillerNumber_1);
                      fillerNumber_1.setValue((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) + 4);//sysj\FillerPlant.sysj line: 205, column: 5
                      S194341=2;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      thread199290(tdone,ends);
                      thread199291(tdone,ends);
                      thread199292(tdone,ends);
                      int biggest199293 = 0;
                      if(ends[14]>=biggest199293){
                        biggest199293=ends[14];
                      }
                      if(ends[15]>=biggest199293){
                        biggest199293=ends[15];
                      }
                      if(ends[16]>=biggest199293){
                        biggest199293=ends[16];
                      }
                      if(biggest199293 == 1){
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      //FINXME code
                      if(biggest199293 == 0){
                        fillerNumber_1.setPresent();//sysj\FillerPlant.sysj line: 205, column: 5
                        currsigs.addElement(fillerNumber_1);
                        fillerNumber_1.setValue((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) + 4);//sysj\FillerPlant.sysj line: 205, column: 5
                        S194341=2;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                    break;
                  
                  case 2 : 
                    S194341=2;
                    System.out.println("emiting bottleDonePos2");//sysj\FillerPlant.sysj line: 207, column: 5
                    System.out.println((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()));//sysj\FillerPlant.sysj line: 208, column: 5
                    System.out.println("after bottleDonePos2");//sysj\FillerPlant.sysj line: 209, column: 5
                    S194375=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                    break;
                  
                }
                break;
              
              case 1 : 
                S194375=1;
                S194375=0;
                if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 0){//sysj\FillerPlant.sysj line: 168, column: 7
                  counter_1.setPresent();//sysj\FillerPlant.sysj line: 169, column: 5
                  currsigs.addElement(counter_1);
                  counter_1.setValue((Integer)(counter_1.getpreval() == null ? 0 : ((Integer)counter_1.getpreval()).intValue()) + 1);//sysj\FillerPlant.sysj line: 169, column: 5
                  S194341=0;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S194375=1;
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

  public void thread199284(int [] tdone, int [] ends){
        switch(S194340){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S194328){
          case 0 : 
            if(fillerReadyStart.getprestatus()){//sysj\FillerPlant.sysj line: 153, column: 12
              S194328=1;
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
            S194328=1;
            S194328=0;
            if((Boolean)(stopAllStatus_1.getpreval() == null ? false : ((Boolean)stopAllStatus_1.getpreval()).booleanValue()) == true){//sysj\FillerPlant.sysj line: 152, column: 8
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              if((Boolean)(stopAllStatus_1.getpreval() == null ? false : ((Boolean)stopAllStatus_1.getpreval()).booleanValue()) == false){//sysj\FillerPlant.sysj line: 156, column: 16
                bottleAtPos2.setPresent();//sysj\FillerPlant.sysj line: 157, column: 6
                currsigs.addElement(bottleAtPos2);
                enable2_1.setPresent();//sysj\FillerPlant.sysj line: 158, column: 6
                currsigs.addElement(enable2_1);
                S194328=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S194328=1;
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

  public void thread199282(int [] tdone, int [] ends){
        switch(S194321){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(enable2_1.getprestatus()){//sysj\FillerPlant.sysj line: 143, column: 24
          enable2E.setPresent();//sysj\FillerPlant.sysj line: 143, column: 33
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

  public void thread199281(int [] tdone, int [] ends){
        switch(S194313){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(dosUnitEvacM_1.getprestatus()){//sysj\FillerPlant.sysj line: 141, column: 24
          dosUnitEvacE.setPresent();//sysj\FillerPlant.sysj line: 141, column: 38
          currsigs.addElement(dosUnitEvacE);
          System.out.println("Emitted dosUnitEvacE");//sysj\FillerPlant.sysj line: 141, column: 57
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

  public void thread199280(int [] tdone, int [] ends){
        switch(S194302){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(dosUnitFilledM_1.getprestatus()){//sysj\FillerPlant.sysj line: 139, column: 24
          dosUnitFilledE.setPresent();//sysj\FillerPlant.sysj line: 139, column: 40
          currsigs.addElement(dosUnitFilledE);
          System.out.println("Emitted dosUnitFilledE");//sysj\FillerPlant.sysj line: 139, column: 61
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

  public void thread199279(int [] tdone, int [] ends){
        switch(S194291){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(filler_0_1.getprestatus()){//sysj\FillerPlant.sysj line: 137, column: 24
          Filler_0E.setPresent();//sysj\FillerPlant.sysj line: 137, column: 34
          currsigs.addElement(Filler_0E);
          System.out.println("Emitted Filler_0E");//sysj\FillerPlant.sysj line: 137, column: 50
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

  public void thread199278(int [] tdone, int [] ends){
        switch(S194280){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(filler_1_1.getprestatus()){//sysj\FillerPlant.sysj line: 135, column: 24
          Filler_1E.setPresent();//sysj\FillerPlant.sysj line: 135, column: 34
          currsigs.addElement(Filler_1E);
          System.out.println("Emitted Filler_1E");//sysj\FillerPlant.sysj line: 135, column: 50
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

  public void thread199277(int [] tdone, int [] ends){
        switch(S194269){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(filler_2_1.getprestatus()){//sysj\FillerPlant.sysj line: 133, column: 24
          Filler_2E.setPresent();//sysj\FillerPlant.sysj line: 133, column: 34
          currsigs.addElement(Filler_2E);
          System.out.println("Emitted Filler_2E");//sysj\FillerPlant.sysj line: 133, column: 50
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

  public void thread199276(int [] tdone, int [] ends){
        switch(S194258){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(filler_3_1.getprestatus()){//sysj\FillerPlant.sysj line: 131, column: 24
          Filler_3E.setPresent();//sysj\FillerPlant.sysj line: 131, column: 34
          currsigs.addElement(Filler_3E);
          System.out.println("Emitted Filler_3E");//sysj\FillerPlant.sysj line: 131, column: 50
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

  public void thread199275(int [] tdone, int [] ends){
        switch(S194247){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(filler_4_1.getprestatus()){//sysj\FillerPlant.sysj line: 129, column: 24
          Filler_4E.setPresent();//sysj\FillerPlant.sysj line: 129, column: 34
          currsigs.addElement(Filler_4E);
          System.out.println("Emitted Filler_4E");//sysj\FillerPlant.sysj line: 129, column: 50
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

  public void thread199274(int [] tdone, int [] ends){
        switch(S194323){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread199275(tdone,ends);
        thread199276(tdone,ends);
        thread199277(tdone,ends);
        thread199278(tdone,ends);
        thread199279(tdone,ends);
        thread199280(tdone,ends);
        thread199281(tdone,ends);
        thread199282(tdone,ends);
        int biggest199283 = 0;
        if(ends[4]>=biggest199283){
          biggest199283=ends[4];
        }
        if(ends[5]>=biggest199283){
          biggest199283=ends[5];
        }
        if(ends[6]>=biggest199283){
          biggest199283=ends[6];
        }
        if(ends[7]>=biggest199283){
          biggest199283=ends[7];
        }
        if(ends[8]>=biggest199283){
          biggest199283=ends[8];
        }
        if(ends[9]>=biggest199283){
          biggest199283=ends[9];
        }
        if(ends[10]>=biggest199283){
          biggest199283=ends[10];
        }
        if(ends[11]>=biggest199283){
          biggest199283=ends[11];
        }
        if(biggest199283 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest199283 == 0){
          S194323=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread199273(int [] tdone, int [] ends){
        switch(S194236){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(stopAll_1.getprestatus()){//sysj\FillerPlant.sysj line: 80, column: 9
          S193054=0;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
          switch(S193054){
            case 0 : 
              S193054=0;
              S193054=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
              break;
            
            case 1 : 
              if(enable.getprestatus() || enable2_1.getprestatus() || fillerReadyStart.getprestatus()){//sysj\FillerPlant.sysj line: 83, column: 10
                if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 4){//sysj\FillerPlant.sysj line: 85, column: 8
                  filler_4_1.setPresent();//sysj\FillerPlant.sysj line: 86, column: 5
                  currsigs.addElement(filler_4_1);
                  System.out.println("----------------------------------------Beginning filler: " + (Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()));//sysj\FillerPlant.sysj line: 97, column: 4
                  S193054=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 3){//sysj\FillerPlant.sysj line: 87, column: 15
                    filler_3_1.setPresent();//sysj\FillerPlant.sysj line: 88, column: 5
                    currsigs.addElement(filler_3_1);
                    System.out.println("----------------------------------------Beginning filler: " + (Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()));//sysj\FillerPlant.sysj line: 97, column: 4
                    S193054=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 2){//sysj\FillerPlant.sysj line: 89, column: 15
                      filler_2_1.setPresent();//sysj\FillerPlant.sysj line: 90, column: 5
                      currsigs.addElement(filler_2_1);
                      System.out.println("----------------------------------------Beginning filler: " + (Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()));//sysj\FillerPlant.sysj line: 97, column: 4
                      S193054=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 1){//sysj\FillerPlant.sysj line: 91, column: 15
                        filler_1_1.setPresent();//sysj\FillerPlant.sysj line: 92, column: 5
                        currsigs.addElement(filler_1_1);
                        System.out.println("----------------------------------------Beginning filler: " + (Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()));//sysj\FillerPlant.sysj line: 97, column: 4
                        S193054=2;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        if((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) == 0){//sysj\FillerPlant.sysj line: 93, column: 15
                          filler_0_1.setPresent();//sysj\FillerPlant.sysj line: 94, column: 5
                          currsigs.addElement(filler_0_1);
                          System.out.println("----------------------------------------Beginning filler: " + (Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()));//sysj\FillerPlant.sysj line: 97, column: 4
                          S193054=2;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          System.out.println("----------------------------------------Beginning filler: " + (Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()));//sysj\FillerPlant.sysj line: 97, column: 4
                          S193054=2;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                  }
                }
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              break;
            
            case 2 : 
              if(valveInjectorOnOff.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj\FillerPlant.sysj line: 98, column: 10
                System.out.println("First cycle -- valveInjectorOnOff && dosUnitValveRetract");//sysj\FillerPlant.sysj line: 99, column: 4
                S193054=3;
                __start_thread_2 = com.systemj.Timer.getMs();//sysj\FillerPlant.sysj line: 80, column: 17
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 80, column: 17
                  ends[2]=2;
                  ;//sysj\FillerPlant.sysj line: 80, column: 17
                  S193054=4;
                  dosUnitFilled.setPresent();//sysj\FillerPlant.sysj line: 102, column: 5
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
            
            case 3 : 
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 80, column: 17
                ends[2]=2;
                ;//sysj\FillerPlant.sysj line: 80, column: 17
                S193054=4;
                dosUnitFilled.setPresent();//sysj\FillerPlant.sysj line: 102, column: 5
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
            
            case 4 : 
              if(enable.getprestatus() || enable2_1.getprestatus()){//sysj\FillerPlant.sysj line: 101, column: 10
                dosUnitFilledM_1.setPresent();//sysj\FillerPlant.sysj line: 105, column: 4
                currsigs.addElement(dosUnitFilledM_1);
                S193054=5;
                __start_thread_2 = com.systemj.Timer.getMs();//sysj\FillerPlant.sysj line: 80, column: 17
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 80, column: 17
                  ends[2]=2;
                  ;//sysj\FillerPlant.sysj line: 80, column: 17
                  System.out.println("First cycle complete");//sysj\FillerPlant.sysj line: 107, column: 4
                  S193054=6;
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
                dosUnitFilled.setPresent();//sysj\FillerPlant.sysj line: 102, column: 5
                currsigs.addElement(dosUnitFilled);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              break;
            
            case 5 : 
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 80, column: 17
                ends[2]=2;
                ;//sysj\FillerPlant.sysj line: 80, column: 17
                System.out.println("First cycle complete");//sysj\FillerPlant.sysj line: 107, column: 4
                S193054=6;
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
            
            case 6 : 
              if(valveInletOnOff.getprestatus() && dosUnitValveExtend.getprestatus()){//sysj\FillerPlant.sysj line: 109, column: 10
                System.out.println("Second cycle -- valveInletOnOff && dosUnitValveExtend");//sysj\FillerPlant.sysj line: 110, column: 4
                S193054=7;
                __start_thread_2 = com.systemj.Timer.getMs();//sysj\FillerPlant.sysj line: 80, column: 17
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 80, column: 17
                  ends[2]=2;
                  ;//sysj\FillerPlant.sysj line: 80, column: 17
                  S193054=8;
                  dosUnitEvac.setPresent();//sysj\FillerPlant.sysj line: 113, column: 5
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
            
            case 7 : 
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 80, column: 17
                ends[2]=2;
                ;//sysj\FillerPlant.sysj line: 80, column: 17
                S193054=8;
                dosUnitEvac.setPresent();//sysj\FillerPlant.sysj line: 113, column: 5
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
            
            case 8 : 
              if(enable.getprestatus() || enable2_1.getprestatus()){//sysj\FillerPlant.sysj line: 112, column: 10
                dosUnitEvacM_1.setPresent();//sysj\FillerPlant.sysj line: 116, column: 4
                currsigs.addElement(dosUnitEvacM_1);
                S193054=9;
                __start_thread_2 = com.systemj.Timer.getMs();//sysj\FillerPlant.sysj line: 80, column: 17
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 80, column: 17
                  ends[2]=2;
                  ;//sysj\FillerPlant.sysj line: 80, column: 17
                  System.out.println("Second cycle complete");//sysj\FillerPlant.sysj line: 118, column: 4
                  System.out.println("----------------------------------------Filler number: " + (Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) + " complete");//sysj\FillerPlant.sysj line: 120, column: 4
                  fillerNumber_1.setPresent();//sysj\FillerPlant.sysj line: 121, column: 4
                  currsigs.addElement(fillerNumber_1);
                  fillerNumber_1.setValue((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) - 1);//sysj\FillerPlant.sysj line: 121, column: 4
                  S193054=0;
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
                dosUnitEvac.setPresent();//sysj\FillerPlant.sysj line: 113, column: 5
                currsigs.addElement(dosUnitEvac);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              break;
            
            case 9 : 
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\FillerPlant.sysj line: 80, column: 17
                ends[2]=2;
                ;//sysj\FillerPlant.sysj line: 80, column: 17
                System.out.println("Second cycle complete");//sysj\FillerPlant.sysj line: 118, column: 4
                System.out.println("----------------------------------------Filler number: " + (Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) + " complete");//sysj\FillerPlant.sysj line: 120, column: 4
                fillerNumber_1.setPresent();//sysj\FillerPlant.sysj line: 121, column: 4
                currsigs.addElement(fillerNumber_1);
                fillerNumber_1.setValue((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) - 1);//sysj\FillerPlant.sysj line: 121, column: 4
                S193054=0;
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
            
            case 10 : 
              S193054=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread199271(int [] tdone, int [] ends){
        S194597=1;
    S194596=0;
    disableConveyorMain.setPresent();//sysj\FillerPlant.sysj line: 252, column: 5
    currsigs.addElement(disableConveyorMain);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread199270(int [] tdone, int [] ends){
        S194591=1;
    S194590=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread199269(int [] tdone, int [] ends){
        S194571=1;
    if(filler_all_complete_1.getprestatus()){//sysj\FillerPlant.sysj line: 226, column: 12
      filler_all_completeE.setPresent();//sysj\FillerPlant.sysj line: 227, column: 5
      currsigs.addElement(filler_all_completeE);
      System.out.println("filler all complete");//sysj\FillerPlant.sysj line: 228, column: 5
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread199268(int [] tdone, int [] ends){
        S194560=1;
    if(fillerReadyStart.getprestatus()){//sysj\FillerPlant.sysj line: 217, column: 12
      stopAllStatus_1.setPresent();//sysj\FillerPlant.sysj line: 218, column: 5
      currsigs.addElement(stopAllStatus_1);
      stopAllStatus_1.setValue(false);//sysj\FillerPlant.sysj line: 218, column: 5
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

  public void thread199267(int [] tdone, int [] ends){
        S194552=1;
    S194551=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread199266(int [] tdone, int [] ends){
        S194340=1;
    S194328=0;
    if((Boolean)(stopAllStatus_1.getpreval() == null ? false : ((Boolean)stopAllStatus_1.getpreval()).booleanValue()) == true){//sysj\FillerPlant.sysj line: 152, column: 8
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      if((Boolean)(stopAllStatus_1.getpreval() == null ? false : ((Boolean)stopAllStatus_1.getpreval()).booleanValue()) == false){//sysj\FillerPlant.sysj line: 156, column: 16
        bottleAtPos2.setPresent();//sysj\FillerPlant.sysj line: 157, column: 6
        currsigs.addElement(bottleAtPos2);
        enable2_1.setPresent();//sysj\FillerPlant.sysj line: 158, column: 6
        currsigs.addElement(enable2_1);
        S194328=1;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S194328=1;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread199264(int [] tdone, int [] ends){
        S194321=1;
    if(enable2_1.getprestatus()){//sysj\FillerPlant.sysj line: 143, column: 24
      enable2E.setPresent();//sysj\FillerPlant.sysj line: 143, column: 33
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

  public void thread199263(int [] tdone, int [] ends){
        S194313=1;
    if(dosUnitEvacM_1.getprestatus()){//sysj\FillerPlant.sysj line: 141, column: 24
      dosUnitEvacE.setPresent();//sysj\FillerPlant.sysj line: 141, column: 38
      currsigs.addElement(dosUnitEvacE);
      System.out.println("Emitted dosUnitEvacE");//sysj\FillerPlant.sysj line: 141, column: 57
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

  public void thread199262(int [] tdone, int [] ends){
        S194302=1;
    if(dosUnitFilledM_1.getprestatus()){//sysj\FillerPlant.sysj line: 139, column: 24
      dosUnitFilledE.setPresent();//sysj\FillerPlant.sysj line: 139, column: 40
      currsigs.addElement(dosUnitFilledE);
      System.out.println("Emitted dosUnitFilledE");//sysj\FillerPlant.sysj line: 139, column: 61
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

  public void thread199261(int [] tdone, int [] ends){
        S194291=1;
    if(filler_0_1.getprestatus()){//sysj\FillerPlant.sysj line: 137, column: 24
      Filler_0E.setPresent();//sysj\FillerPlant.sysj line: 137, column: 34
      currsigs.addElement(Filler_0E);
      System.out.println("Emitted Filler_0E");//sysj\FillerPlant.sysj line: 137, column: 50
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

  public void thread199260(int [] tdone, int [] ends){
        S194280=1;
    if(filler_1_1.getprestatus()){//sysj\FillerPlant.sysj line: 135, column: 24
      Filler_1E.setPresent();//sysj\FillerPlant.sysj line: 135, column: 34
      currsigs.addElement(Filler_1E);
      System.out.println("Emitted Filler_1E");//sysj\FillerPlant.sysj line: 135, column: 50
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

  public void thread199259(int [] tdone, int [] ends){
        S194269=1;
    if(filler_2_1.getprestatus()){//sysj\FillerPlant.sysj line: 133, column: 24
      Filler_2E.setPresent();//sysj\FillerPlant.sysj line: 133, column: 34
      currsigs.addElement(Filler_2E);
      System.out.println("Emitted Filler_2E");//sysj\FillerPlant.sysj line: 133, column: 50
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

  public void thread199258(int [] tdone, int [] ends){
        S194258=1;
    if(filler_3_1.getprestatus()){//sysj\FillerPlant.sysj line: 131, column: 24
      Filler_3E.setPresent();//sysj\FillerPlant.sysj line: 131, column: 34
      currsigs.addElement(Filler_3E);
      System.out.println("Emitted Filler_3E");//sysj\FillerPlant.sysj line: 131, column: 50
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

  public void thread199257(int [] tdone, int [] ends){
        S194247=1;
    if(filler_4_1.getprestatus()){//sysj\FillerPlant.sysj line: 129, column: 24
      Filler_4E.setPresent();//sysj\FillerPlant.sysj line: 129, column: 34
      currsigs.addElement(Filler_4E);
      System.out.println("Emitted Filler_4E");//sysj\FillerPlant.sysj line: 129, column: 50
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

  public void thread199256(int [] tdone, int [] ends){
        S194323=1;
    thread199257(tdone,ends);
    thread199258(tdone,ends);
    thread199259(tdone,ends);
    thread199260(tdone,ends);
    thread199261(tdone,ends);
    thread199262(tdone,ends);
    thread199263(tdone,ends);
    thread199264(tdone,ends);
    int biggest199265 = 0;
    if(ends[4]>=biggest199265){
      biggest199265=ends[4];
    }
    if(ends[5]>=biggest199265){
      biggest199265=ends[5];
    }
    if(ends[6]>=biggest199265){
      biggest199265=ends[6];
    }
    if(ends[7]>=biggest199265){
      biggest199265=ends[7];
    }
    if(ends[8]>=biggest199265){
      biggest199265=ends[8];
    }
    if(ends[9]>=biggest199265){
      biggest199265=ends[9];
    }
    if(ends[10]>=biggest199265){
      biggest199265=ends[10];
    }
    if(ends[11]>=biggest199265){
      biggest199265=ends[11];
    }
    if(biggest199265 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread199255(int [] tdone, int [] ends){
        S194236=1;
    S193054=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S199253){
        case 0 : 
          S199253=0;
          break RUN;
        
        case 1 : 
          S199253=2;
          S199253=2;
          FillerStatus_1.setClear();//sysj\FillerPlant.sysj line: 54, column: 2
          stopAllStatus_1.setClear();//sysj\FillerPlant.sysj line: 55, column: 2
          stopAllStatus_1.setPresent();//sysj\FillerPlant.sysj line: 56, column: 2
          currsigs.addElement(stopAllStatus_1);
          stopAllStatus_1.setValue(false);//sysj\FillerPlant.sysj line: 56, column: 2
          FillerStatus_1.setPresent();//sysj\FillerPlant.sysj line: 57, column: 2
          currsigs.addElement(FillerStatus_1);
          FillerStatus_1.setValue(0);//sysj\FillerPlant.sysj line: 57, column: 2
          fillerNotDone_1.setClear();//sysj\FillerPlant.sysj line: 59, column: 2
          fillerDone_1.setClear();//sysj\FillerPlant.sysj line: 60, column: 2
          stopAll_1.setClear();//sysj\FillerPlant.sysj line: 61, column: 2
          filler_all_complete_1.setClear();//sysj\FillerPlant.sysj line: 63, column: 2
          filler_0_1.setClear();//sysj\FillerPlant.sysj line: 65, column: 2
          filler_1_1.setClear();//sysj\FillerPlant.sysj line: 65, column: 2
          filler_2_1.setClear();//sysj\FillerPlant.sysj line: 65, column: 2
          filler_3_1.setClear();//sysj\FillerPlant.sysj line: 65, column: 2
          filler_4_1.setClear();//sysj\FillerPlant.sysj line: 65, column: 2
          dosUnitFilledM_1.setClear();//sysj\FillerPlant.sysj line: 66, column: 2
          dosUnitEvacM_1.setClear();//sysj\FillerPlant.sysj line: 66, column: 2
          enable2_1.setClear();//sysj\FillerPlant.sysj line: 67, column: 2
          totalBottleNumber_1.setClear();//sysj\FillerPlant.sysj line: 69, column: 2
          fillerNumber_1.setClear();//sysj\FillerPlant.sysj line: 70, column: 2
          counter_1.setClear();//sysj\FillerPlant.sysj line: 71, column: 2
          S193051=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          FillerStatus_1.setClear();//sysj\FillerPlant.sysj line: 54, column: 2
          stopAllStatus_1.setClear();//sysj\FillerPlant.sysj line: 55, column: 2
          fillerNotDone_1.setClear();//sysj\FillerPlant.sysj line: 59, column: 2
          fillerDone_1.setClear();//sysj\FillerPlant.sysj line: 60, column: 2
          stopAll_1.setClear();//sysj\FillerPlant.sysj line: 61, column: 2
          filler_all_complete_1.setClear();//sysj\FillerPlant.sysj line: 63, column: 2
          filler_0_1.setClear();//sysj\FillerPlant.sysj line: 65, column: 2
          filler_1_1.setClear();//sysj\FillerPlant.sysj line: 65, column: 2
          filler_2_1.setClear();//sysj\FillerPlant.sysj line: 65, column: 2
          filler_3_1.setClear();//sysj\FillerPlant.sysj line: 65, column: 2
          filler_4_1.setClear();//sysj\FillerPlant.sysj line: 65, column: 2
          dosUnitFilledM_1.setClear();//sysj\FillerPlant.sysj line: 66, column: 2
          dosUnitEvacM_1.setClear();//sysj\FillerPlant.sysj line: 66, column: 2
          enable2_1.setClear();//sysj\FillerPlant.sysj line: 67, column: 2
          totalBottleNumber_1.setClear();//sysj\FillerPlant.sysj line: 69, column: 2
          fillerNumber_1.setClear();//sysj\FillerPlant.sysj line: 70, column: 2
          counter_1.setClear();//sysj\FillerPlant.sysj line: 71, column: 2
          switch(S193051){
            case 0 : 
              if(enable.getprestatus() || enable2_1.getprestatus() || fillerReadyStart.getprestatus()){//sysj\FillerPlant.sysj line: 73, column: 8
                fillerNumber_1.setPresent();//sysj\FillerPlant.sysj line: 74, column: 2
                currsigs.addElement(fillerNumber_1);
                fillerNumber_1.setValue((Integer)(fillerNumber_1.getpreval() == null ? 0 : ((Integer)fillerNumber_1.getpreval()).intValue()) + 4);//sysj\FillerPlant.sysj line: 74, column: 2
                S193051=1;
                thread199255(tdone,ends);
                thread199256(tdone,ends);
                thread199266(tdone,ends);
                thread199267(tdone,ends);
                thread199268(tdone,ends);
                thread199269(tdone,ends);
                thread199270(tdone,ends);
                thread199271(tdone,ends);
                int biggest199272 = 0;
                if(ends[2]>=biggest199272){
                  biggest199272=ends[2];
                }
                if(ends[3]>=biggest199272){
                  biggest199272=ends[3];
                }
                if(ends[12]>=biggest199272){
                  biggest199272=ends[12];
                }
                if(ends[13]>=biggest199272){
                  biggest199272=ends[13];
                }
                if(ends[17]>=biggest199272){
                  biggest199272=ends[17];
                }
                if(ends[18]>=biggest199272){
                  biggest199272=ends[18];
                }
                if(ends[19]>=biggest199272){
                  biggest199272=ends[19];
                }
                if(ends[20]>=biggest199272){
                  biggest199272=ends[20];
                }
                if(biggest199272 == 1){
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
              thread199273(tdone,ends);
              thread199274(tdone,ends);
              thread199284(tdone,ends);
              thread199285(tdone,ends);
              thread199294(tdone,ends);
              thread199295(tdone,ends);
              thread199296(tdone,ends);
              thread199297(tdone,ends);
              int biggest199298 = 0;
              if(ends[2]>=biggest199298){
                biggest199298=ends[2];
              }
              if(ends[3]>=biggest199298){
                biggest199298=ends[3];
              }
              if(ends[12]>=biggest199298){
                biggest199298=ends[12];
              }
              if(ends[13]>=biggest199298){
                biggest199298=ends[13];
              }
              if(ends[17]>=biggest199298){
                biggest199298=ends[17];
              }
              if(ends[18]>=biggest199298){
                biggest199298=ends[18];
              }
              if(ends[19]>=biggest199298){
                biggest199298=ends[19];
              }
              if(ends[20]>=biggest199298){
                biggest199298=ends[20];
              }
              if(biggest199298 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest199298 == 0){
                S199253=0;
                active[1]=0;
                ends[1]=0;
                S199253=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    FillerStatus_1 = new Signal();
    stopAllStatus_1 = new Signal();
    fillerNotDone_1 = new Signal();
    fillerDone_1 = new Signal();
    stopAll_1 = new Signal();
    filler_all_complete_1 = new Signal();
    filler_0_1 = new Signal();
    filler_1_1 = new Signal();
    filler_2_1 = new Signal();
    filler_3_1 = new Signal();
    filler_4_1 = new Signal();
    dosUnitFilledM_1 = new Signal();
    dosUnitEvacM_1 = new Signal();
    enable2_1 = new Signal();
    totalBottleNumber_1 = new Signal();
    fillerNumber_1 = new Signal();
    counter_1 = new Signal();
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
          enableFiller.gethook();
          LiquidAmount1E.gethook();
          LiquidAmount2E.gethook();
          LiquidAmount3E.gethook();
          LiquidAmount4E.gethook();
          BottleQuantityE.gethook();
          bottleAtPos2F.gethook();
          fillerReadyStart.gethook();
          systemEnableFiller.gethook();
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
      enableFiller.setpreclear();
      LiquidAmount1E.setpreclear();
      LiquidAmount2E.setpreclear();
      LiquidAmount3E.setpreclear();
      LiquidAmount4E.setpreclear();
      BottleQuantityE.setpreclear();
      bottleAtPos2F.setpreclear();
      fillerReadyStart.setpreclear();
      systemEnableFiller.setpreclear();
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
      disableConveyorMain.setpreclear();
      FillerStatus_1.setpreclear();
      stopAllStatus_1.setpreclear();
      fillerNotDone_1.setpreclear();
      fillerDone_1.setpreclear();
      stopAll_1.setpreclear();
      filler_all_complete_1.setpreclear();
      filler_0_1.setpreclear();
      filler_1_1.setpreclear();
      filler_2_1.setpreclear();
      filler_3_1.setpreclear();
      filler_4_1.setpreclear();
      dosUnitFilledM_1.setpreclear();
      dosUnitEvacM_1.setpreclear();
      enable2_1.setpreclear();
      totalBottleNumber_1.setpreclear();
      fillerNumber_1.setpreclear();
      counter_1.setpreclear();
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
      dummyint = fillerReadyStart.getStatus() ? fillerReadyStart.setprepresent() : fillerReadyStart.setpreclear();
      fillerReadyStart.setpreval(fillerReadyStart.getValue());
      fillerReadyStart.setClear();
      dummyint = systemEnableFiller.getStatus() ? systemEnableFiller.setprepresent() : systemEnableFiller.setpreclear();
      systemEnableFiller.setpreval(systemEnableFiller.getValue());
      systemEnableFiller.setClear();
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
      disableConveyorMain.sethook();
      disableConveyorMain.setClear();
      FillerStatus_1.setClear();
      stopAllStatus_1.setClear();
      fillerNotDone_1.setClear();
      fillerDone_1.setClear();
      stopAll_1.setClear();
      filler_all_complete_1.setClear();
      filler_0_1.setClear();
      filler_1_1.setClear();
      filler_2_1.setClear();
      filler_3_1.setClear();
      filler_4_1.setClear();
      dosUnitFilledM_1.setClear();
      dosUnitEvacM_1.setClear();
      enable2_1.setClear();
      totalBottleNumber_1.setClear();
      fillerNumber_1.setClear();
      counter_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
        enable.gethook();
        fillerReady.gethook();
        enableFiller.gethook();
        LiquidAmount1E.gethook();
        LiquidAmount2E.gethook();
        LiquidAmount3E.gethook();
        LiquidAmount4E.gethook();
        BottleQuantityE.gethook();
        bottleAtPos2F.gethook();
        fillerReadyStart.gethook();
        systemEnableFiller.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
