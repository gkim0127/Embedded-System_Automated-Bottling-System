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
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal bottleLeftPos5EConveyor = new Signal("bottleLeftPos5EConveyor", Signal.INPUT);
  public Signal enableConveyorMain = new Signal("enableConveyorMain", Signal.INPUT);
  public Signal bottleAtLoad = new Signal("bottleAtLoad", Signal.OUTPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottleAtPos1R = new Signal("bottleAtPos1R", Signal.OUTPUT);
  public Signal bottleAtLoadE = new Signal("bottleAtLoadE", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  public Signal bottleEmptyE = new Signal("bottleEmptyE", Signal.OUTPUT);
  public Signal bottleDoneE = new Signal("bottleDoneE", Signal.OUTPUT);
  public Signal bottleLeftPos5RotaryE = new Signal("bottleLeftPos5RotaryE", Signal.OUTPUT);
  private Signal bottleDec_1;
  private Signal bottleAt1_1;
  private Signal bottleAtL_1;
  private Signal bottleAt5_1;
  private Signal bottledone_1;
  private Signal motorOn_1;
  private Signal motorOff_1;
  private Signal empty_1;
  private Signal bottleEmpty_1;
  private Signal bottleLeftPos5Rotary_1;
  private long __start_thread_3;//sysj\ConveyorPlant.sysj line: 35, column: 2
  private int S160996 = 1;
  private int S160995 = 1;
  private int S156109 = 1;
  private int S156041 = 1;
  private int S158451 = 1;
  private int S156111 = 1;
  private int S156113 = 1;
  private int S158501 = 1;
  private int S158459 = 1;
  private int S158467 = 1;
  private int S158475 = 1;
  private int S158483 = 1;
  private int S158491 = 1;
  private int S158499 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread161017(int [] tdone, int [] ends){
        switch(S158499){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5Rotary_1.getprestatus()){//sysj\ConveyorPlant.sysj line: 103, column: 24
          bottleLeftPos5RotaryE.setPresent();//sysj\ConveyorPlant.sysj line: 103, column: 46
          currsigs.addElement(bottleLeftPos5RotaryE);
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

  public void thread161016(int [] tdone, int [] ends){
        switch(S158491){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottleEmpty_1.getprestatus()){//sysj\ConveyorPlant.sysj line: 101, column: 24
          bottleEmptyE.setPresent();//sysj\ConveyorPlant.sysj line: 101, column: 37
          currsigs.addElement(bottleEmptyE);
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

  public void thread161015(int [] tdone, int [] ends){
        switch(S158483){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottledone_1.getprestatus()){//sysj\ConveyorPlant.sysj line: 99, column: 24
          bottleDoneE.setPresent();//sysj\ConveyorPlant.sysj line: 99, column: 36
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

  public void thread161014(int [] tdone, int [] ends){
        switch(S158475){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleAtLoad.getprestatus()){//sysj\ConveyorPlant.sysj line: 97, column: 24
          bottleAtLoadE.setPresent();//sysj\ConveyorPlant.sysj line: 97, column: 38
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

  public void thread161013(int [] tdone, int [] ends){
        switch(S158467){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\ConveyorPlant.sysj line: 95, column: 24
          bottleLeftPos5E.setPresent();//sysj\ConveyorPlant.sysj line: 95, column: 40
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

  public void thread161012(int [] tdone, int [] ends){
        switch(S158459){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\ConveyorPlant.sysj line: 93, column: 24
          bottleAtPos1E.setPresent();//sysj\ConveyorPlant.sysj line: 93, column: 38
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

  public void thread161011(int [] tdone, int [] ends){
        switch(S158501){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread161012(tdone,ends);
        thread161013(tdone,ends);
        thread161014(tdone,ends);
        thread161015(tdone,ends);
        thread161016(tdone,ends);
        thread161017(tdone,ends);
        int biggest161018 = 0;
        if(ends[5]>=biggest161018){
          biggest161018=ends[5];
        }
        if(ends[6]>=biggest161018){
          biggest161018=ends[6];
        }
        if(ends[7]>=biggest161018){
          biggest161018=ends[7];
        }
        if(ends[8]>=biggest161018){
          biggest161018=ends[8];
        }
        if(ends[9]>=biggest161018){
          biggest161018=ends[9];
        }
        if(ends[10]>=biggest161018){
          biggest161018=ends[10];
        }
        if(biggest161018 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest161018 == 0){
          S158501=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread161010(int [] tdone, int [] ends){
        switch(S158451){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S156111){
          case 0 : 
            if(enableConveyorMain.getprestatus()){//sysj\ConveyorPlant.sysj line: 60, column: 10
              System.out.println("Line 1: bottleAtLoad");//sysj\ConveyorPlant.sysj line: 61, column: 4
              bottleAtLoad.setPresent();//sysj\ConveyorPlant.sysj line: 62, column: 4
              currsigs.addElement(bottleAtLoad);
              S156111=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\ConveyorPlant.sysj line: 35, column: 2
              S156113=0;
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
                ends[3]=2;
                ;//sysj\ConveyorPlant.sysj line: 35, column: 2
                System.out.println("Line 2: bottleAtPos1");//sysj\ConveyorPlant.sysj line: 66, column: 4
                bottleAtPos1.setPresent();//sysj\ConveyorPlant.sysj line: 67, column: 4
                currsigs.addElement(bottleAtPos1);
                S156111=2;
                __start_thread_3 = com.systemj.Timer.getMs();//sysj\ConveyorPlant.sysj line: 35, column: 2
                if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
                  ends[3]=2;
                  ;//sysj\ConveyorPlant.sysj line: 35, column: 2
                  bottleAtPos1R.setPresent();//sysj\ConveyorPlant.sysj line: 69, column: 4
                  currsigs.addElement(bottleAtPos1R);
                  System.out.println("Going to filler, emit empty conveyor");//sysj\ConveyorPlant.sysj line: 72, column: 4
                  bottleEmpty_1.setPresent();//sysj\ConveyorPlant.sysj line: 73, column: 4
                  currsigs.addElement(bottleEmpty_1);
                  S156111=3;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S156113=1;
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
            switch(S156113){
              case 0 : 
                S156113=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
                  ends[3]=2;
                  ;//sysj\ConveyorPlant.sysj line: 35, column: 2
                  System.out.println("Line 2: bottleAtPos1");//sysj\ConveyorPlant.sysj line: 66, column: 4
                  bottleAtPos1.setPresent();//sysj\ConveyorPlant.sysj line: 67, column: 4
                  currsigs.addElement(bottleAtPos1);
                  S156111=2;
                  __start_thread_3 = com.systemj.Timer.getMs();//sysj\ConveyorPlant.sysj line: 35, column: 2
                  if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
                    ends[3]=2;
                    ;//sysj\ConveyorPlant.sysj line: 35, column: 2
                    bottleAtPos1R.setPresent();//sysj\ConveyorPlant.sysj line: 69, column: 4
                    currsigs.addElement(bottleAtPos1R);
                    System.out.println("Going to filler, emit empty conveyor");//sysj\ConveyorPlant.sysj line: 72, column: 4
                    bottleEmpty_1.setPresent();//sysj\ConveyorPlant.sysj line: 73, column: 4
                    currsigs.addElement(bottleEmpty_1);
                    S156111=3;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                }
                else {
                  S156113=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                S156113=1;
                S156113=0;
                if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
                  ends[3]=2;
                  ;//sysj\ConveyorPlant.sysj line: 35, column: 2
                  System.out.println("Line 2: bottleAtPos1");//sysj\ConveyorPlant.sysj line: 66, column: 4
                  bottleAtPos1.setPresent();//sysj\ConveyorPlant.sysj line: 67, column: 4
                  currsigs.addElement(bottleAtPos1);
                  S156111=2;
                  __start_thread_3 = com.systemj.Timer.getMs();//sysj\ConveyorPlant.sysj line: 35, column: 2
                  if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
                    ends[3]=2;
                    ;//sysj\ConveyorPlant.sysj line: 35, column: 2
                    bottleAtPos1R.setPresent();//sysj\ConveyorPlant.sysj line: 69, column: 4
                    currsigs.addElement(bottleAtPos1R);
                    System.out.println("Going to filler, emit empty conveyor");//sysj\ConveyorPlant.sysj line: 72, column: 4
                    bottleEmpty_1.setPresent();//sysj\ConveyorPlant.sysj line: 73, column: 4
                    currsigs.addElement(bottleEmpty_1);
                    S156111=3;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                }
                else {
                  S156113=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
              ends[3]=2;
              ;//sysj\ConveyorPlant.sysj line: 35, column: 2
              bottleAtPos1R.setPresent();//sysj\ConveyorPlant.sysj line: 69, column: 4
              currsigs.addElement(bottleAtPos1R);
              System.out.println("Going to filler, emit empty conveyor");//sysj\ConveyorPlant.sysj line: 72, column: 4
              bottleEmpty_1.setPresent();//sysj\ConveyorPlant.sysj line: 73, column: 4
              currsigs.addElement(bottleEmpty_1);
              S156111=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(bottleAtPos5.getprestatus()){//sysj\ConveyorPlant.sysj line: 76, column: 10
              System.out.println("Line 3: bottleLeftPos5");//sysj\ConveyorPlant.sysj line: 77, column: 4
              S156111=4;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\ConveyorPlant.sysj line: 35, column: 2
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
                ends[3]=2;
                ;//sysj\ConveyorPlant.sysj line: 35, column: 2
                bottleLeftPos5.setPresent();//sysj\ConveyorPlant.sysj line: 79, column: 4
                currsigs.addElement(bottleLeftPos5);
                bottleLeftPos5Rotary_1.setPresent();//sysj\ConveyorPlant.sysj line: 80, column: 4
                currsigs.addElement(bottleLeftPos5Rotary_1);
                S156111=5;
                __start_thread_3 = com.systemj.Timer.getMs();//sysj\ConveyorPlant.sysj line: 35, column: 2
                if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
                  ends[3]=2;
                  ;//sysj\ConveyorPlant.sysj line: 35, column: 2
                  System.out.println("Line 4: bottledone");//sysj\ConveyorPlant.sysj line: 83, column: 4
                  bottledone_1.setPresent();//sysj\ConveyorPlant.sysj line: 84, column: 4
                  currsigs.addElement(bottledone_1);
                  S156111=6;
                  __start_thread_3 = com.systemj.Timer.getMs();//sysj\ConveyorPlant.sysj line: 35, column: 2
                  if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
                    ends[3]=2;
                    ;//sysj\ConveyorPlant.sysj line: 35, column: 2
                    System.out.println("Line 5: bottleEmpty");//sysj\ConveyorPlant.sysj line: 87, column: 4
                    bottleEmpty_1.setPresent();//sysj\ConveyorPlant.sysj line: 88, column: 4
                    currsigs.addElement(bottleEmpty_1);
                    S156111=0;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
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
              }
              else {
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
          
          case 4 : 
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
              ends[3]=2;
              ;//sysj\ConveyorPlant.sysj line: 35, column: 2
              bottleLeftPos5.setPresent();//sysj\ConveyorPlant.sysj line: 79, column: 4
              currsigs.addElement(bottleLeftPos5);
              bottleLeftPos5Rotary_1.setPresent();//sysj\ConveyorPlant.sysj line: 80, column: 4
              currsigs.addElement(bottleLeftPos5Rotary_1);
              S156111=5;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\ConveyorPlant.sysj line: 35, column: 2
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
                ends[3]=2;
                ;//sysj\ConveyorPlant.sysj line: 35, column: 2
                System.out.println("Line 4: bottledone");//sysj\ConveyorPlant.sysj line: 83, column: 4
                bottledone_1.setPresent();//sysj\ConveyorPlant.sysj line: 84, column: 4
                currsigs.addElement(bottledone_1);
                S156111=6;
                __start_thread_3 = com.systemj.Timer.getMs();//sysj\ConveyorPlant.sysj line: 35, column: 2
                if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
                  ends[3]=2;
                  ;//sysj\ConveyorPlant.sysj line: 35, column: 2
                  System.out.println("Line 5: bottleEmpty");//sysj\ConveyorPlant.sysj line: 87, column: 4
                  bottleEmpty_1.setPresent();//sysj\ConveyorPlant.sysj line: 88, column: 4
                  currsigs.addElement(bottleEmpty_1);
                  S156111=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
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
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 5 : 
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
              ends[3]=2;
              ;//sysj\ConveyorPlant.sysj line: 35, column: 2
              System.out.println("Line 4: bottledone");//sysj\ConveyorPlant.sysj line: 83, column: 4
              bottledone_1.setPresent();//sysj\ConveyorPlant.sysj line: 84, column: 4
              currsigs.addElement(bottledone_1);
              S156111=6;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\ConveyorPlant.sysj line: 35, column: 2
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
                ends[3]=2;
                ;//sysj\ConveyorPlant.sysj line: 35, column: 2
                System.out.println("Line 5: bottleEmpty");//sysj\ConveyorPlant.sysj line: 87, column: 4
                bottleEmpty_1.setPresent();//sysj\ConveyorPlant.sysj line: 88, column: 4
                currsigs.addElement(bottleEmpty_1);
                S156111=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
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
          
          case 6 : 
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\ConveyorPlant.sysj line: 35, column: 2
              ends[3]=2;
              ;//sysj\ConveyorPlant.sysj line: 35, column: 2
              System.out.println("Line 5: bottleEmpty");//sysj\ConveyorPlant.sysj line: 87, column: 4
              bottleEmpty_1.setPresent();//sysj\ConveyorPlant.sysj line: 88, column: 4
              currsigs.addElement(bottleEmpty_1);
              S156111=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread161009(int [] tdone, int [] ends){
        switch(S156109){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S156041){
          case 0 : 
            if((motConveyorOnOff.getprestatus())){//sysj\ConveyorPlant.sysj line: 22, column: 21
              S156041=1;
              System.out.println("motorOn");//sysj\ConveyorPlant.sysj line: 28, column: 5
              motorOn_1.setPresent();//sysj\ConveyorPlant.sysj line: 29, column: 5
              currsigs.addElement(motorOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOff_1.setPresent();//sysj\ConveyorPlant.sysj line: 24, column: 5
              currsigs.addElement(motorOff_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if((!motConveyorOnOff.getprestatus())){//sysj\ConveyorPlant.sysj line: 27, column: 10
              S156041=0;
              if((motConveyorOnOff.getprestatus())){//sysj\ConveyorPlant.sysj line: 22, column: 21
                S156041=1;
                System.out.println("motorOn");//sysj\ConveyorPlant.sysj line: 28, column: 5
                motorOn_1.setPresent();//sysj\ConveyorPlant.sysj line: 29, column: 5
                currsigs.addElement(motorOn_1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("motorOff");//sysj\ConveyorPlant.sysj line: 23, column: 5
                motorOff_1.setPresent();//sysj\ConveyorPlant.sysj line: 24, column: 5
                currsigs.addElement(motorOff_1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              motorOn_1.setPresent();//sysj\ConveyorPlant.sysj line: 29, column: 5
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

  public void thread161006(int [] tdone, int [] ends){
        S158499=1;
    if(bottleLeftPos5Rotary_1.getprestatus()){//sysj\ConveyorPlant.sysj line: 103, column: 24
      bottleLeftPos5RotaryE.setPresent();//sysj\ConveyorPlant.sysj line: 103, column: 46
      currsigs.addElement(bottleLeftPos5RotaryE);
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

  public void thread161005(int [] tdone, int [] ends){
        S158491=1;
    if(bottleEmpty_1.getprestatus()){//sysj\ConveyorPlant.sysj line: 101, column: 24
      bottleEmptyE.setPresent();//sysj\ConveyorPlant.sysj line: 101, column: 37
      currsigs.addElement(bottleEmptyE);
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

  public void thread161004(int [] tdone, int [] ends){
        S158483=1;
    if(bottledone_1.getprestatus()){//sysj\ConveyorPlant.sysj line: 99, column: 24
      bottleDoneE.setPresent();//sysj\ConveyorPlant.sysj line: 99, column: 36
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

  public void thread161003(int [] tdone, int [] ends){
        S158475=1;
    if(bottleAtLoad.getprestatus()){//sysj\ConveyorPlant.sysj line: 97, column: 24
      bottleAtLoadE.setPresent();//sysj\ConveyorPlant.sysj line: 97, column: 38
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

  public void thread161002(int [] tdone, int [] ends){
        S158467=1;
    if(bottleLeftPos5.getprestatus()){//sysj\ConveyorPlant.sysj line: 95, column: 24
      bottleLeftPos5E.setPresent();//sysj\ConveyorPlant.sysj line: 95, column: 40
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

  public void thread161001(int [] tdone, int [] ends){
        S158459=1;
    if(bottleAtPos1.getprestatus()){//sysj\ConveyorPlant.sysj line: 93, column: 24
      bottleAtPos1E.setPresent();//sysj\ConveyorPlant.sysj line: 93, column: 38
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

  public void thread161000(int [] tdone, int [] ends){
        S158501=1;
    thread161001(tdone,ends);
    thread161002(tdone,ends);
    thread161003(tdone,ends);
    thread161004(tdone,ends);
    thread161005(tdone,ends);
    thread161006(tdone,ends);
    int biggest161007 = 0;
    if(ends[5]>=biggest161007){
      biggest161007=ends[5];
    }
    if(ends[6]>=biggest161007){
      biggest161007=ends[6];
    }
    if(ends[7]>=biggest161007){
      biggest161007=ends[7];
    }
    if(ends[8]>=biggest161007){
      biggest161007=ends[8];
    }
    if(ends[9]>=biggest161007){
      biggest161007=ends[9];
    }
    if(ends[10]>=biggest161007){
      biggest161007=ends[10];
    }
    if(biggest161007 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread160999(int [] tdone, int [] ends){
        S158451=1;
    S156111=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread160998(int [] tdone, int [] ends){
        S156109=1;
    S156041=0;
    if((motConveyorOnOff.getprestatus())){//sysj\ConveyorPlant.sysj line: 22, column: 21
      S156041=1;
      System.out.println("motorOn");//sysj\ConveyorPlant.sysj line: 28, column: 5
      motorOn_1.setPresent();//sysj\ConveyorPlant.sysj line: 29, column: 5
      currsigs.addElement(motorOn_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("motorOff");//sysj\ConveyorPlant.sysj line: 23, column: 5
      motorOff_1.setPresent();//sysj\ConveyorPlant.sysj line: 24, column: 5
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
      switch(S160996){
        case 0 : 
          S160996=0;
          break RUN;
        
        case 1 : 
          S160996=2;
          S160996=2;
          bottleDec_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          bottleAt1_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          bottleAtL_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          bottleAt5_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          bottledone_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          motorOn_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          motorOff_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          empty_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          bottleEmpty_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          bottleLeftPos5Rotary_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          S160995=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          bottleDec_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          bottleAt1_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          bottleAtL_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          bottleAt5_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          bottledone_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          motorOn_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          motorOff_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          empty_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          bottleEmpty_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          bottleLeftPos5Rotary_1.setClear();//sysj\ConveyorPlant.sysj line: 17, column: 2
          switch(S160995){
            case 0 : 
              S160995=0;
              S160995=1;
              thread160998(tdone,ends);
              thread160999(tdone,ends);
              thread161000(tdone,ends);
              int biggest161008 = 0;
              if(ends[2]>=biggest161008){
                biggest161008=ends[2];
              }
              if(ends[3]>=biggest161008){
                biggest161008=ends[3];
              }
              if(ends[4]>=biggest161008){
                biggest161008=ends[4];
              }
              if(biggest161008 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              thread161009(tdone,ends);
              thread161010(tdone,ends);
              thread161011(tdone,ends);
              int biggest161019 = 0;
              if(ends[2]>=biggest161019){
                biggest161019=ends[2];
              }
              if(ends[3]>=biggest161019){
                biggest161019=ends[3];
              }
              if(ends[4]>=biggest161019){
                biggest161019=ends[4];
              }
              if(biggest161019 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest161019 == 0){
                S160996=0;
                active[1]=0;
                ends[1]=0;
                S160996=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleDec_1 = new Signal();
    bottleAt1_1 = new Signal();
    bottleAtL_1 = new Signal();
    bottleAt5_1 = new Signal();
    bottledone_1 = new Signal();
    motorOn_1 = new Signal();
    motorOff_1 = new Signal();
    empty_1 = new Signal();
    bottleEmpty_1 = new Signal();
    bottleLeftPos5Rotary_1 = new Signal();
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
          bottleAtPos5.gethook();
          bottleLeftPos5EConveyor.gethook();
          enableConveyorMain.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      enableConveyor.setpreclear();
      enable.setpreclear();
      bottleAtPos5.setpreclear();
      bottleLeftPos5EConveyor.setpreclear();
      enableConveyorMain.setpreclear();
      bottleAtLoad.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleAtPos1R.setpreclear();
      bottleAtLoadE.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleLeftPos5E.setpreclear();
      bottleEmptyE.setpreclear();
      bottleDoneE.setpreclear();
      bottleLeftPos5RotaryE.setpreclear();
      bottleDec_1.setpreclear();
      bottleAt1_1.setpreclear();
      bottleAtL_1.setpreclear();
      bottleAt5_1.setpreclear();
      bottledone_1.setpreclear();
      motorOn_1.setpreclear();
      motorOff_1.setpreclear();
      empty_1.setpreclear();
      bottleEmpty_1.setpreclear();
      bottleLeftPos5Rotary_1.setpreclear();
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
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = bottleLeftPos5EConveyor.getStatus() ? bottleLeftPos5EConveyor.setprepresent() : bottleLeftPos5EConveyor.setpreclear();
      bottleLeftPos5EConveyor.setpreval(bottleLeftPos5EConveyor.getValue());
      bottleLeftPos5EConveyor.setClear();
      dummyint = enableConveyorMain.getStatus() ? enableConveyorMain.setprepresent() : enableConveyorMain.setpreclear();
      enableConveyorMain.setpreval(enableConveyorMain.getValue());
      enableConveyorMain.setClear();
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
      bottleEmptyE.sethook();
      bottleEmptyE.setClear();
      bottleDoneE.sethook();
      bottleDoneE.setClear();
      bottleLeftPos5RotaryE.sethook();
      bottleLeftPos5RotaryE.setClear();
      bottleDec_1.setClear();
      bottleAt1_1.setClear();
      bottleAtL_1.setClear();
      bottleAt5_1.setClear();
      bottledone_1.setClear();
      motorOn_1.setClear();
      motorOff_1.setClear();
      empty_1.setClear();
      bottleEmpty_1.setClear();
      bottleLeftPos5Rotary_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
        enableConveyor.gethook();
        enable.gethook();
        bottleAtPos5.gethook();
        bottleLeftPos5EConveyor.gethook();
        enableConveyorMain.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
