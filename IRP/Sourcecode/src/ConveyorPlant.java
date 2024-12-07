import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ConveyorPlant extends ClockDomain{
  public ConveyorPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal enableConveyor = new Signal("enableConveyor", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal DONE = new Signal("DONE", Signal.INPUT);
  public Signal bottleLeftPos5EConveyor = new Signal("bottleLeftPos5EConveyor", Signal.INPUT);
  public Signal bottleDonePos2Conveyor = new Signal("bottleDonePos2Conveyor", Signal.INPUT);
  public Signal bottleAtLoad = new Signal("bottleAtLoad", Signal.OUTPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottleAtPos1R = new Signal("bottleAtPos1R", Signal.OUTPUT);
  public Signal bottleAtLoadE = new Signal("bottleAtLoadE", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  public Signal bottleAtPos1M = new Signal("bottleAtPos1M", Signal.OUTPUT);
  public Signal bottleDoneE = new Signal("bottleDoneE", Signal.OUTPUT);
  private Signal bottleNumber_1;
  private Signal bottleDec_1;
  private Signal bottleAt1_1;
  private Signal bottleAtL_1;
  private Signal bottleAt5_1;
  private Signal motorOn_1;
  private Signal motorOff_1;
  private Signal empty_1;
  private Signal bottleAtA_1;
  private Signal bottledone_1;
  private Signal state1_1;
  private Signal state2_1;
  private Signal state3_1;
  private Signal state4_1;
  private Signal bottlePos_1;
  private long __start_thread_3;//sysj\ConveyorPlant.sysj line: 100, column: 5
  private int S20990 = 1;
  private int S20535 = 1;
  private int S20636 = 1;
  private int S20568 = 1;
  private int S20728 = 1;
  private int S20651 = 1;
  private int S20638 = 1;
  private int S20762 = 1;
  private int S20736 = 1;
  private int S20744 = 1;
  private int S20752 = 1;
  private int S20760 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread21007(int [] tdone, int [] ends){
        switch(S20760){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottledone_1.getprestatus()){//sysj\ConveyorPlant.sysj line: 214, column: 24
          bottleDoneE.setPresent();//sysj\ConveyorPlant.sysj line: 214, column: 36
          currsigs.addElement(bottleDoneE);
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

  public void thread21006(int [] tdone, int [] ends){
        switch(S20752){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleAtLoad.getprestatus()){//sysj\ConveyorPlant.sysj line: 212, column: 24
          bottleAtLoadE.setPresent();//sysj\ConveyorPlant.sysj line: 212, column: 38
          currsigs.addElement(bottleAtLoadE);
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

  public void thread21005(int [] tdone, int [] ends){
        switch(S20744){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\ConveyorPlant.sysj line: 210, column: 24
          bottleLeftPos5E.setPresent();//sysj\ConveyorPlant.sysj line: 210, column: 40
          currsigs.addElement(bottleLeftPos5E);
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

  public void thread21004(int [] tdone, int [] ends){
        switch(S20736){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\ConveyorPlant.sysj line: 208, column: 24
          bottleAtPos1E.setPresent();//sysj\ConveyorPlant.sysj line: 208, column: 38
          currsigs.addElement(bottleAtPos1E);
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

  public void thread21003(int [] tdone, int [] ends){
        switch(S20762){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread21004(tdone,ends);
        thread21005(tdone,ends);
        thread21006(tdone,ends);
        thread21007(tdone,ends);
        int biggest21008 = 0;
        if(ends[5]>=biggest21008){
          biggest21008=ends[5];
        }
        if(ends[6]>=biggest21008){
          biggest21008=ends[6];
        }
        if(ends[7]>=biggest21008){
          biggest21008=ends[7];
        }
        if(ends[8]>=biggest21008){
          biggest21008=ends[8];
        }
        if(biggest21008 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest21008 == 0){
          S20762=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread21002(int [] tdone, int [] ends){
        switch(S20728){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S20651){
          case 0 : 
            switch(S20638){
              case 0 : 
                S20638=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 100, column: 5
                  ends[3]=2;
                  ;//sysj\ConveyorPlant.sysj line: 100, column: 5
                  state1_1.setPresent();//sysj\ConveyorPlant.sysj line: 125, column: 6
                  currsigs.addElement(state1_1);
                  S20651=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S20638=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                S20638=1;
                S20638=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 100, column: 5
                  ends[3]=2;
                  ;//sysj\ConveyorPlant.sysj line: 100, column: 5
                  state1_1.setPresent();//sysj\ConveyorPlant.sysj line: 125, column: 6
                  currsigs.addElement(state1_1);
                  S20651=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S20638=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S20651=1;
            S20651=0;
            __start_thread_3 = com.systemj.Timer.getMs();//sysj\ConveyorPlant.sysj line: 100, column: 5
            S20638=0;
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 100, column: 5
              ends[3]=2;
              ;//sysj\ConveyorPlant.sysj line: 100, column: 5
              state1_1.setPresent();//sysj\ConveyorPlant.sysj line: 125, column: 6
              currsigs.addElement(state1_1);
              S20651=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S20638=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread21001(int [] tdone, int [] ends){
        switch(S20636){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S20568){
          case 0 : 
            if((motConveyorOnOff.getprestatus())){//sysj\ConveyorPlant.sysj line: 39, column: 21
              S20568=1;
              System.out.println("motorOn");//sysj\ConveyorPlant.sysj line: 45, column: 5
              motorOn_1.setPresent();//sysj\ConveyorPlant.sysj line: 46, column: 5
              currsigs.addElement(motorOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOff_1.setPresent();//sysj\ConveyorPlant.sysj line: 41, column: 5
              currsigs.addElement(motorOff_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if((!motConveyorOnOff.getprestatus())){//sysj\ConveyorPlant.sysj line: 44, column: 10
              S20568=0;
              if((motConveyorOnOff.getprestatus())){//sysj\ConveyorPlant.sysj line: 39, column: 21
                S20568=1;
                System.out.println("motorOn");//sysj\ConveyorPlant.sysj line: 45, column: 5
                motorOn_1.setPresent();//sysj\ConveyorPlant.sysj line: 46, column: 5
                currsigs.addElement(motorOn_1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("motorOff");//sysj\ConveyorPlant.sysj line: 40, column: 5
                motorOff_1.setPresent();//sysj\ConveyorPlant.sysj line: 41, column: 5
                currsigs.addElement(motorOff_1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              motorOn_1.setPresent();//sysj\ConveyorPlant.sysj line: 46, column: 5
              currsigs.addElement(motorOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread20998(int [] tdone, int [] ends){
        S20760=1;
    if(bottledone_1.getprestatus()){//sysj\ConveyorPlant.sysj line: 214, column: 24
      bottleDoneE.setPresent();//sysj\ConveyorPlant.sysj line: 214, column: 36
      currsigs.addElement(bottleDoneE);
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

  public void thread20997(int [] tdone, int [] ends){
        S20752=1;
    if(bottleAtLoad.getprestatus()){//sysj\ConveyorPlant.sysj line: 212, column: 24
      bottleAtLoadE.setPresent();//sysj\ConveyorPlant.sysj line: 212, column: 38
      currsigs.addElement(bottleAtLoadE);
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

  public void thread20996(int [] tdone, int [] ends){
        S20744=1;
    if(bottleLeftPos5.getprestatus()){//sysj\ConveyorPlant.sysj line: 210, column: 24
      bottleLeftPos5E.setPresent();//sysj\ConveyorPlant.sysj line: 210, column: 40
      currsigs.addElement(bottleLeftPos5E);
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

  public void thread20995(int [] tdone, int [] ends){
        S20736=1;
    if(bottleAtPos1.getprestatus()){//sysj\ConveyorPlant.sysj line: 208, column: 24
      bottleAtPos1E.setPresent();//sysj\ConveyorPlant.sysj line: 208, column: 38
      currsigs.addElement(bottleAtPos1E);
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

  public void thread20994(int [] tdone, int [] ends){
        S20762=1;
    thread20995(tdone,ends);
    thread20996(tdone,ends);
    thread20997(tdone,ends);
    thread20998(tdone,ends);
    int biggest20999 = 0;
    if(ends[5]>=biggest20999){
      biggest20999=ends[5];
    }
    if(ends[6]>=biggest20999){
      biggest20999=ends[6];
    }
    if(ends[7]>=biggest20999){
      biggest20999=ends[7];
    }
    if(ends[8]>=biggest20999){
      biggest20999=ends[8];
    }
    if(biggest20999 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread20993(int [] tdone, int [] ends){
        S20728=1;
    S20651=0;
    __start_thread_3 = com.systemj.Timer.getMs();//sysj\ConveyorPlant.sysj line: 100, column: 5
    S20638=0;
    if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 100, column: 5
      ends[3]=2;
      ;//sysj\ConveyorPlant.sysj line: 100, column: 5
      state1_1.setPresent();//sysj\ConveyorPlant.sysj line: 125, column: 6
      currsigs.addElement(state1_1);
      S20651=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S20638=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread20992(int [] tdone, int [] ends){
        S20636=1;
    S20568=0;
    if((motConveyorOnOff.getprestatus())){//sysj\ConveyorPlant.sysj line: 39, column: 21
      S20568=1;
      System.out.println("motorOn");//sysj\ConveyorPlant.sysj line: 45, column: 5
      motorOn_1.setPresent();//sysj\ConveyorPlant.sysj line: 46, column: 5
      currsigs.addElement(motorOn_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("motorOff");//sysj\ConveyorPlant.sysj line: 40, column: 5
      motorOff_1.setPresent();//sysj\ConveyorPlant.sysj line: 41, column: 5
      currsigs.addElement(motorOff_1);
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
      switch(S20990){
        case 0 : 
          S20990=0;
          break RUN;
        
        case 1 : 
          S20990=2;
          S20990=2;
          bottleNumber_1.setClear();//sysj\ConveyorPlant.sysj line: 23, column: 2
          bottleDec_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          bottleAt1_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          bottleAtL_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          bottleAt5_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          motorOn_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          motorOff_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          empty_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          bottleAtA_1.setClear();//sysj\ConveyorPlant.sysj line: 26, column: 2
          bottledone_1.setClear();//sysj\ConveyorPlant.sysj line: 28, column: 2
          state1_1.setClear();//sysj\ConveyorPlant.sysj line: 30, column: 2
          state2_1.setClear();//sysj\ConveyorPlant.sysj line: 30, column: 2
          state3_1.setClear();//sysj\ConveyorPlant.sysj line: 30, column: 2
          state4_1.setClear();//sysj\ConveyorPlant.sysj line: 30, column: 2
          bottlePos_1.setClear();//sysj\ConveyorPlant.sysj line: 32, column: 2
          bottlePos_1.setPresent();//sysj\ConveyorPlant.sysj line: 33, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\ConveyorPlant.sysj line: 33, column: 2
          bottleNumber_1.setPresent();//sysj\ConveyorPlant.sysj line: 34, column: 2
          currsigs.addElement(bottleNumber_1);
          bottleNumber_1.setValue((Integer)(bottleNumber_1.getpreval() == null ? 0 : ((Integer)bottleNumber_1.getpreval()).intValue()) + 5);//sysj\ConveyorPlant.sysj line: 34, column: 2
          S20535=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          bottleNumber_1.setClear();//sysj\ConveyorPlant.sysj line: 23, column: 2
          bottleDec_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          bottleAt1_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          bottleAtL_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          bottleAt5_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          motorOn_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          motorOff_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          empty_1.setClear();//sysj\ConveyorPlant.sysj line: 25, column: 2
          bottleAtA_1.setClear();//sysj\ConveyorPlant.sysj line: 26, column: 2
          bottledone_1.setClear();//sysj\ConveyorPlant.sysj line: 28, column: 2
          state1_1.setClear();//sysj\ConveyorPlant.sysj line: 30, column: 2
          state2_1.setClear();//sysj\ConveyorPlant.sysj line: 30, column: 2
          state3_1.setClear();//sysj\ConveyorPlant.sysj line: 30, column: 2
          state4_1.setClear();//sysj\ConveyorPlant.sysj line: 30, column: 2
          bottlePos_1.setClear();//sysj\ConveyorPlant.sysj line: 32, column: 2
          switch(S20535){
            case 0 : 
              S20535=0;
              System.out.println("Bottle number is: " + (Integer)(bottleNumber_1.getpreval() == null ? 0 : ((Integer)bottleNumber_1.getpreval()).intValue()));//sysj\ConveyorPlant.sysj line: 36, column: 2
              S20535=1;
              thread20992(tdone,ends);
              thread20993(tdone,ends);
              thread20994(tdone,ends);
              int biggest21000 = 0;
              if(ends[2]>=biggest21000){
                biggest21000=ends[2];
              }
              if(ends[3]>=biggest21000){
                biggest21000=ends[3];
              }
              if(ends[4]>=biggest21000){
                biggest21000=ends[4];
              }
              if(biggest21000 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              thread21001(tdone,ends);
              thread21002(tdone,ends);
              thread21003(tdone,ends);
              int biggest21009 = 0;
              if(ends[2]>=biggest21009){
                biggest21009=ends[2];
              }
              if(ends[3]>=biggest21009){
                biggest21009=ends[3];
              }
              if(ends[4]>=biggest21009){
                biggest21009=ends[4];
              }
              if(biggest21009 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest21009 == 0){
                S20990=0;
                active[1]=0;
                ends[1]=0;
                S20990=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleNumber_1 = new Signal();
    bottleDec_1 = new Signal();
    bottleAt1_1 = new Signal();
    bottleAtL_1 = new Signal();
    bottleAt5_1 = new Signal();
    motorOn_1 = new Signal();
    motorOff_1 = new Signal();
    empty_1 = new Signal();
    bottleAtA_1 = new Signal();
    bottledone_1 = new Signal();
    state1_1 = new Signal();
    state2_1 = new Signal();
    state3_1 = new Signal();
    state4_1 = new Signal();
    bottlePos_1 = new Signal();
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
          motConveyorOnOff.gethook();
          enableConveyor.gethook();
          enable.gethook();
          refill.gethook();
          bottleAtPos5.gethook();
          DONE.gethook();
          bottleLeftPos5EConveyor.gethook();
          bottleDonePos2Conveyor.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      enableConveyor.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      bottleAtPos5.setpreclear();
      DONE.setpreclear();
      bottleLeftPos5EConveyor.setpreclear();
      bottleDonePos2Conveyor.setpreclear();
      bottleAtLoad.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleAtPos1R.setpreclear();
      bottleAtLoadE.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleLeftPos5E.setpreclear();
      bottleAtPos1M.setpreclear();
      bottleDoneE.setpreclear();
      bottleNumber_1.setpreclear();
      bottleDec_1.setpreclear();
      bottleAt1_1.setpreclear();
      bottleAtL_1.setpreclear();
      bottleAt5_1.setpreclear();
      motorOn_1.setpreclear();
      motorOff_1.setpreclear();
      empty_1.setpreclear();
      bottleAtA_1.setpreclear();
      bottledone_1.setpreclear();
      state1_1.setpreclear();
      state2_1.setpreclear();
      state3_1.setpreclear();
      state4_1.setpreclear();
      bottlePos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = enableConveyor.getStatus() ? enableConveyor.setprepresent() : enableConveyor.setpreclear();
      enableConveyor.setpreval(enableConveyor.getValue());
      enableConveyor.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = DONE.getStatus() ? DONE.setprepresent() : DONE.setpreclear();
      DONE.setpreval(DONE.getValue());
      DONE.setClear();
      dummyint = bottleLeftPos5EConveyor.getStatus() ? bottleLeftPos5EConveyor.setprepresent() : bottleLeftPos5EConveyor.setpreclear();
      bottleLeftPos5EConveyor.setpreval(bottleLeftPos5EConveyor.getValue());
      bottleLeftPos5EConveyor.setClear();
      dummyint = bottleDonePos2Conveyor.getStatus() ? bottleDonePos2Conveyor.setprepresent() : bottleDonePos2Conveyor.setpreclear();
      bottleDonePos2Conveyor.setpreval(bottleDonePos2Conveyor.getValue());
      bottleDonePos2Conveyor.setClear();
      bottleAtLoad.sethook();
      bottleAtLoad.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      bottleAtPos1R.sethook();
      bottleAtPos1R.setClear();
      bottleAtLoadE.sethook();
      bottleAtLoadE.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      bottleAtPos1M.sethook();
      bottleAtPos1M.setClear();
      bottleDoneE.sethook();
      bottleDoneE.setClear();
      bottleNumber_1.setClear();
      bottleDec_1.setClear();
      bottleAt1_1.setClear();
      bottleAtL_1.setClear();
      bottleAt5_1.setClear();
      motorOn_1.setClear();
      motorOff_1.setClear();
      empty_1.setClear();
      bottleAtA_1.setClear();
      bottledone_1.setClear();
      state1_1.setClear();
      state2_1.setClear();
      state3_1.setClear();
      state4_1.setClear();
      bottlePos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
        enableConveyor.gethook();
        enable.gethook();
        refill.gethook();
        bottleAtPos5.gethook();
        DONE.gethook();
        bottleLeftPos5EConveyor.gethook();
        bottleDonePos2Conveyor.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
