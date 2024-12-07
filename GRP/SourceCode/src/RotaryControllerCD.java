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
  public Signal bottleLeftPos5RotaryE = new Signal("bottleLeftPos5RotaryE", Signal.INPUT);
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
  public Signal fillerReadyStart = new Signal("fillerReadyStart", Signal.OUTPUT);
  private Signal auto_1;
  private Signal manual_1;
  private long __start_thread_11;//sysj\RotaryController.sysj line: 143, column: 5
  private long __start_thread_12;//sysj\RotaryController.sysj line: 168, column: 5
  private long __start_thread_13;//sysj\RotaryController.sysj line: 186, column: 5
  private long __start_thread_14;//sysj\RotaryController.sysj line: 208, column: 5
  private int S253380 = 1;
  private int S226474 = 1;
  private int S199616 = 1;
  private int S199600 = 1;
  private int S199589 = 1;
  private int S201682 = 1;
  private int S200132 = 1;
  private int S199679 = 1;
  private int S199619 = 1;
  private int S199741 = 1;
  private int S199681 = 1;
  private int S199803 = 1;
  private int S199743 = 1;
  private int S199865 = 1;
  private int S199805 = 1;
  private int S199873 = 1;
  private int S208548 = 1;
  private int S201684 = 1;
  private int S202040 = 1;
  private int S201686 = 1;
  private int S202204 = 1;
  private int S202042 = 1;
  private int S202368 = 1;
  private int S202206 = 1;
  private int S202532 = 1;
  private int S202370 = 1;
  private int S202540 = 1;
  private int S226482 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread253422(int [] tdone, int [] ends){
        switch(S226482){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5E.getprestatus()){//sysj\RotaryController.sysj line: 241, column: 24
          bottleLeftPos5EConveyor.setPresent();//sysj\RotaryController.sysj line: 241, column: 41
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

  public void thread253420(int [] tdone, int [] ends){
        S208548=1;
    S201684=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread253419(int [] tdone, int [] ends){
        S201682=1;
    S200132=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread253418(int [] tdone, int [] ends){
        S199616=1;
    S199600=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread253415(int [] tdone, int [] ends){
        switch(S202540){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5RotaryE.getprestatus()){//sysj\RotaryController.sysj line: 230, column: 13
          System.out.println("bottleLeftPos5E ");//sysj\RotaryController.sysj line: 231, column: 7
          bottleLeftPos5E.setPresent();//sysj\RotaryController.sysj line: 232, column: 7
          currsigs.addElement(bottleLeftPos5E);
          System.out.println("-------------- End of entire rotary cycle --------------");//sysj\RotaryController.sysj line: 233, column: 7
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
      
    }
  }

  public void thread253414(int [] tdone, int [] ends){
        switch(S202532){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S202370){
          case 0 : 
            if(bottleDonePos4.getprestatus()){//sysj\RotaryController.sysj line: 209, column: 13
              System.out.println("position 4: bottleDonePos4E ");//sysj\RotaryController.sysj line: 210, column: 7
              bottleDonePos4E.setPresent();//sysj\RotaryController.sysj line: 212, column: 7
              currsigs.addElement(bottleDonePos4E);
              S202370=1;
              __start_thread_14 = com.systemj.Timer.getMs();//sysj\RotaryController.sysj line: 208, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_14 >= (1) * 1000){//sysj\RotaryController.sysj line: 208, column: 5
                ends[14]=2;
                ;//sysj\RotaryController.sysj line: 208, column: 5
                S202370=2;
                rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 216, column: 8
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
            if(com.systemj.Timer.getMs() - __start_thread_14 >= (1) * 1000){//sysj\RotaryController.sysj line: 208, column: 5
              ends[14]=2;
              ;//sysj\RotaryController.sysj line: 208, column: 5
              S202370=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 216, column: 8
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
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 215, column: 13
              S202370=3;
              bottleAtPos5.setPresent();//sysj\RotaryController.sysj line: 221, column: 21
              currsigs.addElement(bottleAtPos5);
              bottleAtPos5E.setPresent();//sysj\RotaryController.sysj line: 221, column: 40
              currsigs.addElement(bottleAtPos5E);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 216, column: 8
              currsigs.addElement(rotaryTableTrigger);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 3 : 
            if(bottleLeftPos5RotaryE.getprestatus()){//sysj\RotaryController.sysj line: 220, column: 13
              System.out.println("bottleAtPos5E ");//sysj\RotaryController.sysj line: 224, column: 7
              S202370=0;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\RotaryController.sysj line: 221, column: 21
              currsigs.addElement(bottleAtPos5);
              bottleAtPos5E.setPresent();//sysj\RotaryController.sysj line: 221, column: 40
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

  public void thread253413(int [] tdone, int [] ends){
        switch(S202368){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S202206){
          case 0 : 
            if(bottleDonePos3.getprestatus()){//sysj\RotaryController.sysj line: 188, column: 13
              System.out.println("==============bottleDonePos3E ");//sysj\RotaryController.sysj line: 189, column: 7
              bottleDonePos3E.setPresent();//sysj\RotaryController.sysj line: 191, column: 7
              currsigs.addElement(bottleDonePos3E);
              S202206=1;
              __start_thread_13 = com.systemj.Timer.getMs();//sysj\RotaryController.sysj line: 186, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_13 >= (1) * 1000){//sysj\RotaryController.sysj line: 186, column: 5
                ends[13]=2;
                ;//sysj\RotaryController.sysj line: 186, column: 5
                S202206=2;
                rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 195, column: 8
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
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_13 >= (1) * 1000){//sysj\RotaryController.sysj line: 186, column: 5
              ends[13]=2;
              ;//sysj\RotaryController.sysj line: 186, column: 5
              S202206=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 195, column: 8
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
          
          case 2 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 194, column: 13
              S202206=3;
              bottleAtPos4.setPresent();//sysj\RotaryController.sysj line: 199, column: 21
              currsigs.addElement(bottleAtPos4);
              bottleAtPos4E.setPresent();//sysj\RotaryController.sysj line: 199, column: 40
              currsigs.addElement(bottleAtPos4E);
              bottleAtPos4Capper.setPresent();//sysj\RotaryController.sysj line: 199, column: 60
              currsigs.addElement(bottleAtPos4Capper);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 195, column: 8
              currsigs.addElement(rotaryTableTrigger);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 3 : 
            if(bottleDonePos4.getprestatus()){//sysj\RotaryController.sysj line: 198, column: 13
              System.out.println("-------------bottleAtPos4E ");//sysj\RotaryController.sysj line: 202, column: 7
              S202206=0;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\RotaryController.sysj line: 199, column: 21
              currsigs.addElement(bottleAtPos4);
              bottleAtPos4E.setPresent();//sysj\RotaryController.sysj line: 199, column: 40
              currsigs.addElement(bottleAtPos4E);
              bottleAtPos4Capper.setPresent();//sysj\RotaryController.sysj line: 199, column: 60
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

  public void thread253412(int [] tdone, int [] ends){
        switch(S202204){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S202042){
          case 0 : 
            if(bottleDonePos2.getprestatus()){//sysj\RotaryController.sysj line: 169, column: 13
              System.out.println("bottleDonePos2E ");//sysj\RotaryController.sysj line: 170, column: 7
              bottleDonePos2E.setPresent();//sysj\RotaryController.sysj line: 172, column: 7
              currsigs.addElement(bottleDonePos2E);
              S202042=1;
              __start_thread_12 = com.systemj.Timer.getMs();//sysj\RotaryController.sysj line: 168, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_12 >= (1) * 1000){//sysj\RotaryController.sysj line: 168, column: 5
                ends[12]=2;
                ;//sysj\RotaryController.sysj line: 168, column: 5
                S202042=2;
                rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 176, column: 8
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
            }
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_12 >= (1) * 1000){//sysj\RotaryController.sysj line: 168, column: 5
              ends[12]=2;
              ;//sysj\RotaryController.sysj line: 168, column: 5
              S202042=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 176, column: 8
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
          
          case 2 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 175, column: 13
              S202042=3;
              bottleAtPos3.setPresent();//sysj\RotaryController.sysj line: 180, column: 21
              currsigs.addElement(bottleAtPos3);
              bottleAtPos3E.setPresent();//sysj\RotaryController.sysj line: 180, column: 40
              currsigs.addElement(bottleAtPos3E);
              bottleAtPos2F.setPresent();//sysj\RotaryController.sysj line: 180, column: 60
              currsigs.addElement(bottleAtPos2F);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 176, column: 8
              currsigs.addElement(rotaryTableTrigger);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 3 : 
            if(bottleDonePos3.getprestatus()){//sysj\RotaryController.sysj line: 179, column: 13
              S202042=0;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              bottleAtPos3.setPresent();//sysj\RotaryController.sysj line: 180, column: 21
              currsigs.addElement(bottleAtPos3);
              bottleAtPos3E.setPresent();//sysj\RotaryController.sysj line: 180, column: 40
              currsigs.addElement(bottleAtPos3E);
              bottleAtPos2F.setPresent();//sysj\RotaryController.sysj line: 180, column: 60
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

  public void thread253411(int [] tdone, int [] ends){
        switch(S202040){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S201686){
          case 0 : 
            if(bottleAtPos1R.getprestatus() || enable.getprestatus()){//sysj\RotaryController.sysj line: 145, column: 13
              System.out.println("-------------- Start of entire rotary cycle --------------");//sysj\RotaryController.sysj line: 146, column: 7
              System.out.println("bottleAtPos1 ");//sysj\RotaryController.sysj line: 149, column: 7
              S201686=1;
              __start_thread_11 = com.systemj.Timer.getMs();//sysj\RotaryController.sysj line: 143, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_11 >= (0.5) * 1000){//sysj\RotaryController.sysj line: 143, column: 5
                ends[11]=2;
                ;//sysj\RotaryController.sysj line: 143, column: 5
                bottleAtPos1E.setPresent();//sysj\RotaryController.sysj line: 151, column: 7
                currsigs.addElement(bottleAtPos1E);
                S201686=2;
                __start_thread_11 = com.systemj.Timer.getMs();//sysj\RotaryController.sysj line: 143, column: 5
                if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\RotaryController.sysj line: 143, column: 5
                  ends[11]=2;
                  ;//sysj\RotaryController.sysj line: 143, column: 5
                  S201686=3;
                  rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 155, column: 8
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
              }
              else {
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_11 >= (0.5) * 1000){//sysj\RotaryController.sysj line: 143, column: 5
              ends[11]=2;
              ;//sysj\RotaryController.sysj line: 143, column: 5
              bottleAtPos1E.setPresent();//sysj\RotaryController.sysj line: 151, column: 7
              currsigs.addElement(bottleAtPos1E);
              S201686=2;
              __start_thread_11 = com.systemj.Timer.getMs();//sysj\RotaryController.sysj line: 143, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\RotaryController.sysj line: 143, column: 5
                ends[11]=2;
                ;//sysj\RotaryController.sysj line: 143, column: 5
                S201686=3;
                rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 155, column: 8
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
            }
            else {
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\RotaryController.sysj line: 143, column: 5
              ends[11]=2;
              ;//sysj\RotaryController.sysj line: 143, column: 5
              S201686=3;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 155, column: 8
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
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 154, column: 13
              System.out.println("bottleAtPos2E ");//sysj\RotaryController.sysj line: 158, column: 7
              S201686=4;
              bottleAtPos2.setPresent();//sysj\RotaryController.sysj line: 161, column: 21
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2E.setPresent();//sysj\RotaryController.sysj line: 161, column: 40
              currsigs.addElement(bottleAtPos2E);
              fillerReadyStart.setPresent();//sysj\RotaryController.sysj line: 161, column: 60
              currsigs.addElement(fillerReadyStart);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 155, column: 8
              currsigs.addElement(rotaryTableTrigger);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 4 : 
            if(bottleDonePos2.getprestatus()){//sysj\RotaryController.sysj line: 160, column: 13
              S201686=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\RotaryController.sysj line: 161, column: 21
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2E.setPresent();//sysj\RotaryController.sysj line: 161, column: 40
              currsigs.addElement(bottleAtPos2E);
              fillerReadyStart.setPresent();//sysj\RotaryController.sysj line: 161, column: 60
              currsigs.addElement(fillerReadyStart);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread253409(int [] tdone, int [] ends){
        S202540=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread253408(int [] tdone, int [] ends){
        S202532=1;
    S202370=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread253407(int [] tdone, int [] ends){
        S202368=1;
    S202206=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread253406(int [] tdone, int [] ends){
        S202204=1;
    S202042=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread253405(int [] tdone, int [] ends){
        S202040=1;
    S201686=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread253404(int [] tdone, int [] ends){
        switch(S208548){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S201684){
          case 0 : 
            if(auto_1.getprestatus()){//sysj\RotaryController.sysj line: 140, column: 10
              System.out.println("Auto mode selected");//sysj\RotaryController.sysj line: 141, column: 4
              S201684=1;
              thread253405(tdone,ends);
              thread253406(tdone,ends);
              thread253407(tdone,ends);
              thread253408(tdone,ends);
              thread253409(tdone,ends);
              int biggest253410 = 0;
              if(ends[11]>=biggest253410){
                biggest253410=ends[11];
              }
              if(ends[12]>=biggest253410){
                biggest253410=ends[12];
              }
              if(ends[13]>=biggest253410){
                biggest253410=ends[13];
              }
              if(ends[14]>=biggest253410){
                biggest253410=ends[14];
              }
              if(ends[15]>=biggest253410){
                biggest253410=ends[15];
              }
              if(biggest253410 == 1){
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
            if(manual_1.getprestatus()){//sysj\RotaryController.sysj line: 142, column: 10
              S201684=0;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              thread253411(tdone,ends);
              thread253412(tdone,ends);
              thread253413(tdone,ends);
              thread253414(tdone,ends);
              thread253415(tdone,ends);
              int biggest253416 = 0;
              if(ends[11]>=biggest253416){
                biggest253416=ends[11];
              }
              if(ends[12]>=biggest253416){
                biggest253416=ends[12];
              }
              if(ends[13]>=biggest253416){
                biggest253416=ends[13];
              }
              if(ends[14]>=biggest253416){
                biggest253416=ends[14];
              }
              if(ends[15]>=biggest253416){
                biggest253416=ends[15];
              }
              if(biggest253416 == 1){
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              //FINXME code
              if(biggest253416 == 0){
                S201684=0;
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

  public void thread253402(int [] tdone, int [] ends){
        switch(S199873){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\RotaryController.sysj line: 130, column: 11
          System.out.println("bottleLeftPos5E ");//sysj\RotaryController.sysj line: 131, column: 5
          bottleLeftPos5E.setPresent();//sysj\RotaryController.sysj line: 132, column: 5
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

  public void thread253401(int [] tdone, int [] ends){
        switch(S199865){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S199805){
          case 0 : 
            if(bottleDonePos4.getprestatus()){//sysj\RotaryController.sysj line: 113, column: 11
              System.out.println("bottleDonePos4E ");//sysj\RotaryController.sysj line: 114, column: 5
              bottleDonePos4E.setPresent();//sysj\RotaryController.sysj line: 115, column: 5
              currsigs.addElement(bottleDonePos4E);
              S199805=1;
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
            if(enable.getprestatus()){//sysj\RotaryController.sysj line: 116, column: 11
              S199805=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 119, column: 6
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
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 117, column: 11
              System.out.println("bottleAtPos5E ");//sysj\RotaryController.sysj line: 122, column: 5
              S199805=3;
              bottleAtPos5E.setPresent();//sysj\RotaryController.sysj line: 124, column: 18
              currsigs.addElement(bottleAtPos5E);
              bottleAtPos5.setPresent();//sysj\RotaryController.sysj line: 124, column: 38
              currsigs.addElement(bottleAtPos5);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 119, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 3 : 
            if(bottleLeftPos5.getprestatus()){//sysj\RotaryController.sysj line: 123, column: 11
              S199805=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottleAtPos5E.setPresent();//sysj\RotaryController.sysj line: 124, column: 18
              currsigs.addElement(bottleAtPos5E);
              bottleAtPos5.setPresent();//sysj\RotaryController.sysj line: 124, column: 38
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

  public void thread253400(int [] tdone, int [] ends){
        switch(S199803){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S199743){
          case 0 : 
            if(bottleDonePos3.getprestatus()){//sysj\RotaryController.sysj line: 94, column: 11
              System.out.println("bottleDonePos3E ");//sysj\RotaryController.sysj line: 95, column: 5
              bottleDonePos3E.setPresent();//sysj\RotaryController.sysj line: 96, column: 5
              currsigs.addElement(bottleDonePos3E);
              S199743=1;
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
            if(enable.getprestatus()){//sysj\RotaryController.sysj line: 97, column: 11
              S199743=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 100, column: 6
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
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 98, column: 11
              System.out.println("bottleAtPos4E ");//sysj\RotaryController.sysj line: 103, column: 5
              bottleAtPos4E.setPresent();//sysj\RotaryController.sysj line: 105, column: 5
              currsigs.addElement(bottleAtPos4E);
              S199743=3;
              bottleAtPos4.setPresent();//sysj\RotaryController.sysj line: 107, column: 5
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 100, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 3 : 
            if(bottleDonePos4.getprestatus()){//sysj\RotaryController.sysj line: 106, column: 11
              S199743=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\RotaryController.sysj line: 107, column: 5
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

  public void thread253399(int [] tdone, int [] ends){
        switch(S199741){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S199681){
          case 0 : 
            if(bottleDonePos2.getprestatus()){//sysj\RotaryController.sysj line: 77, column: 11
              System.out.println("bottleDonePos2E ");//sysj\RotaryController.sysj line: 78, column: 5
              bottleDonePos2E.setPresent();//sysj\RotaryController.sysj line: 79, column: 5
              currsigs.addElement(bottleDonePos2E);
              S199681=1;
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
            if(enable.getprestatus()){//sysj\RotaryController.sysj line: 80, column: 11
              S199681=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 83, column: 6
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
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 81, column: 11
              System.out.println("bottleAtPos3E ");//sysj\RotaryController.sysj line: 86, column: 5
              S199681=3;
              bottleAtPos3E.setPresent();//sysj\RotaryController.sysj line: 88, column: 18
              currsigs.addElement(bottleAtPos3E);
              bottleAtPos2F.setPresent();//sysj\RotaryController.sysj line: 88, column: 38
              currsigs.addElement(bottleAtPos2F);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 83, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(bottleDonePos3.getprestatus()){//sysj\RotaryController.sysj line: 87, column: 11
              S199681=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottleAtPos3E.setPresent();//sysj\RotaryController.sysj line: 88, column: 18
              currsigs.addElement(bottleAtPos3E);
              bottleAtPos2F.setPresent();//sysj\RotaryController.sysj line: 88, column: 38
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

  public void thread253398(int [] tdone, int [] ends){
        switch(S199679){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S199619){
          case 0 : 
            if(bottleAtPos1R.getprestatus()){//sysj\RotaryController.sysj line: 57, column: 11
              System.out.println("bottleAtPos1 ");//sysj\RotaryController.sysj line: 58, column: 5
              bottleAtPos1E.setPresent();//sysj\RotaryController.sysj line: 59, column: 5
              currsigs.addElement(bottleAtPos1E);
              S199619=1;
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
            if(enable.getprestatus()){//sysj\RotaryController.sysj line: 60, column: 11
              S199619=2;
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 62, column: 6
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
            if(tableAlignedWithSensor.getprestatus()){//sysj\RotaryController.sysj line: 61, column: 11
              System.out.println("bottleAtPos2E ");//sysj\RotaryController.sysj line: 65, column: 5
              bottleAtPos2E.setPresent();//sysj\RotaryController.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2E);
              S199619=3;
              bottleAtPos2.setPresent();//sysj\RotaryController.sysj line: 68, column: 18
              currsigs.addElement(bottleAtPos2);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\RotaryController.sysj line: 62, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(bottleDonePos2.getprestatus()){//sysj\RotaryController.sysj line: 67, column: 11
              S199619=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\RotaryController.sysj line: 68, column: 18
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

  public void thread253396(int [] tdone, int [] ends){
        S199873=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread253395(int [] tdone, int [] ends){
        S199865=1;
    S199805=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread253394(int [] tdone, int [] ends){
        S199803=1;
    S199743=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread253393(int [] tdone, int [] ends){
        S199741=1;
    S199681=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread253392(int [] tdone, int [] ends){
        S199679=1;
    S199619=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread253391(int [] tdone, int [] ends){
        switch(S201682){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S200132){
          case 0 : 
            if(manual_1.getprestatus()){//sysj\RotaryController.sysj line: 53, column: 10
              S200132=1;
              thread253392(tdone,ends);
              thread253393(tdone,ends);
              thread253394(tdone,ends);
              thread253395(tdone,ends);
              thread253396(tdone,ends);
              int biggest253397 = 0;
              if(ends[5]>=biggest253397){
                biggest253397=ends[5];
              }
              if(ends[6]>=biggest253397){
                biggest253397=ends[6];
              }
              if(ends[7]>=biggest253397){
                biggest253397=ends[7];
              }
              if(ends[8]>=biggest253397){
                biggest253397=ends[8];
              }
              if(ends[9]>=biggest253397){
                biggest253397=ends[9];
              }
              if(biggest253397 == 1){
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
            if(auto_1.getprestatus()){//sysj\RotaryController.sysj line: 54, column: 10
              S200132=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              thread253398(tdone,ends);
              thread253399(tdone,ends);
              thread253400(tdone,ends);
              thread253401(tdone,ends);
              thread253402(tdone,ends);
              int biggest253403 = 0;
              if(ends[5]>=biggest253403){
                biggest253403=ends[5];
              }
              if(ends[6]>=biggest253403){
                biggest253403=ends[6];
              }
              if(ends[7]>=biggest253403){
                biggest253403=ends[7];
              }
              if(ends[8]>=biggest253403){
                biggest253403=ends[8];
              }
              if(ends[9]>=biggest253403){
                biggest253403=ends[9];
              }
              if(biggest253403 == 1){
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              //FINXME code
              if(biggest253403 == 0){
                S200132=0;
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

  public void thread253390(int [] tdone, int [] ends){
        switch(S199616){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S199600){
          case 0 : 
            if(mode.getprestatus()){//sysj\RotaryController.sysj line: 37, column: 11
              S199600=1;
              S199589=0;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\RotaryController.sysj line: 39, column: 9
                manual_1.setPresent();//sysj\RotaryController.sysj line: 40, column: 7
                currsigs.addElement(manual_1);
                S199589=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                auto_1.setPresent();//sysj\RotaryController.sysj line: 44, column: 7
                currsigs.addElement(auto_1);
                S199589=1;
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
            switch(S199589){
              case 0 : 
                S199589=0;
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\RotaryController.sysj line: 39, column: 9
                  manual_1.setPresent();//sysj\RotaryController.sysj line: 40, column: 7
                  currsigs.addElement(manual_1);
                  S199589=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  auto_1.setPresent();//sysj\RotaryController.sysj line: 44, column: 7
                  currsigs.addElement(auto_1);
                  S199589=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                S199589=1;
                S199589=0;
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\RotaryController.sysj line: 39, column: 9
                  manual_1.setPresent();//sysj\RotaryController.sysj line: 40, column: 7
                  currsigs.addElement(manual_1);
                  S199589=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  auto_1.setPresent();//sysj\RotaryController.sysj line: 44, column: 7
                  currsigs.addElement(auto_1);
                  S199589=1;
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

  public void thread253389(int [] tdone, int [] ends){
        switch(S226474){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread253390(tdone,ends);
        thread253391(tdone,ends);
        thread253404(tdone,ends);
        int biggest253417 = 0;
        if(ends[3]>=biggest253417){
          biggest253417=ends[3];
        }
        if(ends[4]>=biggest253417){
          biggest253417=ends[4];
        }
        if(ends[10]>=biggest253417){
          biggest253417=ends[10];
        }
        if(biggest253417 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest253417 == 0){
          thread253418(tdone,ends);
          thread253419(tdone,ends);
          thread253420(tdone,ends);
          int biggest253421 = 0;
          if(ends[3]>=biggest253421){
            biggest253421=ends[3];
          }
          if(ends[4]>=biggest253421){
            biggest253421=ends[4];
          }
          if(ends[10]>=biggest253421){
            biggest253421=ends[10];
          }
          if(biggest253421 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread253387(int [] tdone, int [] ends){
        S226482=1;
    if(bottleLeftPos5E.getprestatus()){//sysj\RotaryController.sysj line: 241, column: 24
      bottleLeftPos5EConveyor.setPresent();//sysj\RotaryController.sysj line: 241, column: 41
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

  public void thread253385(int [] tdone, int [] ends){
        S208548=1;
    S201684=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread253384(int [] tdone, int [] ends){
        S201682=1;
    S200132=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread253383(int [] tdone, int [] ends){
        S199616=1;
    S199600=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread253382(int [] tdone, int [] ends){
        S226474=1;
    thread253383(tdone,ends);
    thread253384(tdone,ends);
    thread253385(tdone,ends);
    int biggest253386 = 0;
    if(ends[3]>=biggest253386){
      biggest253386=ends[3];
    }
    if(ends[4]>=biggest253386){
      biggest253386=ends[4];
    }
    if(ends[10]>=biggest253386){
      biggest253386=ends[10];
    }
    if(biggest253386 == 1){
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
      switch(S253380){
        case 0 : 
          S253380=0;
          break RUN;
        
        case 1 : 
          S253380=2;
          S253380=2;
          auto_1.setClear();//sysj\RotaryController.sysj line: 31, column: 2
          manual_1.setClear();//sysj\RotaryController.sysj line: 31, column: 2
          auto_1.setPresent();//sysj\RotaryController.sysj line: 32, column: 2
          currsigs.addElement(auto_1);
          thread253382(tdone,ends);
          thread253387(tdone,ends);
          int biggest253388 = 0;
          if(ends[2]>=biggest253388){
            biggest253388=ends[2];
          }
          if(ends[16]>=biggest253388){
            biggest253388=ends[16];
          }
          if(biggest253388 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          auto_1.setClear();//sysj\RotaryController.sysj line: 31, column: 2
          manual_1.setClear();//sysj\RotaryController.sysj line: 31, column: 2
          thread253389(tdone,ends);
          thread253422(tdone,ends);
          int biggest253423 = 0;
          if(ends[2]>=biggest253423){
            biggest253423=ends[2];
          }
          if(ends[16]>=biggest253423){
            biggest253423=ends[16];
          }
          if(biggest253423 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest253423 == 0){
            S253380=0;
            active[1]=0;
            ends[1]=0;
            S253380=0;
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
          bottleLeftPos5RotaryE.gethook();
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
      bottleLeftPos5RotaryE.setpreclear();
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
      fillerReadyStart.setpreclear();
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
      dummyint = bottleLeftPos5RotaryE.getStatus() ? bottleLeftPos5RotaryE.setprepresent() : bottleLeftPos5RotaryE.setpreclear();
      bottleLeftPos5RotaryE.setpreval(bottleLeftPos5RotaryE.getValue());
      bottleLeftPos5RotaryE.setClear();
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
      fillerReadyStart.sethook();
      fillerReadyStart.setClear();
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
        bottleLeftPos5RotaryE.gethook();
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
