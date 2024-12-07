import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class capperPlant extends ClockDomain{
  public capperPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.INPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.INPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.INPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.INPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.INPUT);
  public Signal capperJobDone = new Signal("capperJobDone", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.OUTPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.OUTPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.OUTPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.OUTPUT);
  public Signal capGripped = new Signal("capGripped", Signal.OUTPUT);
  public Signal capUngripped = new Signal("capUngripped", Signal.OUTPUT);
  public Signal bottleClamped = new Signal("bottleClamped", Signal.OUTPUT);
  public Signal bottleUnclamped = new Signal("bottleUnclamped", Signal.OUTPUT);
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public Signal gripperZAxisLoweredE = new Signal("gripperZAxisLoweredE", Signal.OUTPUT);
  public Signal gripperZAxisLiftedE = new Signal("gripperZAxisLiftedE", Signal.OUTPUT);
  public Signal gripperTurnHomePosE = new Signal("gripperTurnHomePosE", Signal.OUTPUT);
  public Signal gripperTurnFinalPosE = new Signal("gripperTurnFinalPosE", Signal.OUTPUT);
  public Signal capGrippedE = new Signal("capGrippedE", Signal.OUTPUT);
  public Signal capUngrippedE = new Signal("capUngrippedE", Signal.OUTPUT);
  public Signal bottleClampedE = new Signal("bottleClampedE", Signal.OUTPUT);
  public Signal bottleUnclampedE = new Signal("bottleUnclampedE", Signal.OUTPUT);
  private int S155628 = 1;
  private int S155329 = 1;
  private int S155277 = 1;
  private int S155406 = 1;
  private int S155354 = 1;
  private int S155483 = 1;
  private int S155431 = 1;
  private int S155560 = 1;
  private int S155508 = 1;
  private int S155626 = 1;
  private int S155568 = 1;
  private int S155562 = 1;
  private int S155576 = 1;
  private int S155584 = 1;
  private int S155592 = 1;
  private int S155600 = 1;
  private int S155608 = 1;
  private int S155616 = 1;
  private int S155624 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread155657(int [] tdone, int [] ends){
        switch(S155624){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottleUnclamped.getprestatus()){//sysj\capperPlant.sysj line: 105, column: 24
          bottleUnclampedE.setPresent();//sysj\capperPlant.sysj line: 105, column: 41
          currsigs.addElement(bottleUnclampedE);
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
      
    }
  }

  public void thread155656(int [] tdone, int [] ends){
        switch(S155616){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 103, column: 24
          bottleClampedE.setPresent();//sysj\capperPlant.sysj line: 103, column: 39
          currsigs.addElement(bottleClampedE);
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
      
    }
  }

  public void thread155655(int [] tdone, int [] ends){
        switch(S155608){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(capUngripped.getprestatus()){//sysj\capperPlant.sysj line: 101, column: 24
          capUngrippedE.setPresent();//sysj\capperPlant.sysj line: 101, column: 38
          currsigs.addElement(capUngrippedE);
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
      
    }
  }

  public void thread155654(int [] tdone, int [] ends){
        switch(S155600){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(capGripped.getprestatus()){//sysj\capperPlant.sysj line: 99, column: 24
          capGrippedE.setPresent();//sysj\capperPlant.sysj line: 99, column: 36
          currsigs.addElement(capGrippedE);
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

  public void thread155653(int [] tdone, int [] ends){
        switch(S155592){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capperPlant.sysj line: 97, column: 24
          gripperTurnFinalPosE.setPresent();//sysj\capperPlant.sysj line: 97, column: 45
          currsigs.addElement(gripperTurnFinalPosE);
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

  public void thread155652(int [] tdone, int [] ends){
        switch(S155584){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\capperPlant.sysj line: 95, column: 24
          gripperTurnHomePosE.setPresent();//sysj\capperPlant.sysj line: 95, column: 44
          currsigs.addElement(gripperTurnHomePosE);
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

  public void thread155651(int [] tdone, int [] ends){
        switch(S155576){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\capperPlant.sysj line: 93, column: 24
          gripperZAxisLiftedE.setPresent();//sysj\capperPlant.sysj line: 93, column: 44
          currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread155650(int [] tdone, int [] ends){
        switch(S155568){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S155562){
          case 0 : 
            S155562=0;
            if(gripperZAxisLowered.getprestatus()){//sysj\capperPlant.sysj line: 91, column: 24
              gripperZAxisLoweredE.setPresent();//sysj\capperPlant.sysj line: 91, column: 45
              currsigs.addElement(gripperZAxisLoweredE);
              S155562=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S155562=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S155562=1;
            S155562=0;
            if(gripperZAxisLowered.getprestatus()){//sysj\capperPlant.sysj line: 91, column: 24
              gripperZAxisLoweredE.setPresent();//sysj\capperPlant.sysj line: 91, column: 45
              currsigs.addElement(gripperZAxisLoweredE);
              S155562=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S155562=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread155649(int [] tdone, int [] ends){
        switch(S155626){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread155650(tdone,ends);
        thread155651(tdone,ends);
        thread155652(tdone,ends);
        thread155653(tdone,ends);
        thread155654(tdone,ends);
        thread155655(tdone,ends);
        thread155656(tdone,ends);
        thread155657(tdone,ends);
        int biggest155658 = 0;
        if(ends[7]>=biggest155658){
          biggest155658=ends[7];
        }
        if(ends[8]>=biggest155658){
          biggest155658=ends[8];
        }
        if(ends[9]>=biggest155658){
          biggest155658=ends[9];
        }
        if(ends[10]>=biggest155658){
          biggest155658=ends[10];
        }
        if(ends[11]>=biggest155658){
          biggest155658=ends[11];
        }
        if(ends[12]>=biggest155658){
          biggest155658=ends[12];
        }
        if(ends[13]>=biggest155658){
          biggest155658=ends[13];
        }
        if(ends[14]>=biggest155658){
          biggest155658=ends[14];
        }
        if(biggest155658 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest155658 == 0){
          S155626=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread155648(int [] tdone, int [] ends){
        switch(S155560){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S155508){
          case 0 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\capperPlant.sysj line: 73, column: 10
              S155508=1;
              System.out.println("Gripper lowered");//sysj\capperPlant.sysj line: 81, column: 5
              gripperZAxisLowered.setPresent();//sysj\capperPlant.sysj line: 82, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\capperPlant.sysj line: 75, column: 5
              currsigs.addElement(gripperZAxisLifted);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!cylPos5ZaxisExtend.getprestatus()){//sysj\capperPlant.sysj line: 79, column: 10
              S155508=0;
              System.out.println("Gripper lifted");//sysj\capperPlant.sysj line: 74, column: 5
              gripperZAxisLifted.setPresent();//sysj\capperPlant.sysj line: 75, column: 5
              currsigs.addElement(gripperZAxisLifted);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\capperPlant.sysj line: 82, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread155647(int [] tdone, int [] ends){
        switch(S155483){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S155431){
          case 0 : 
            if(gripperTurnExtend.getprestatus()){//sysj\capperPlant.sysj line: 56, column: 10
              S155431=1;
              System.out.println("Gripper twisted");//sysj\capperPlant.sysj line: 63, column: 5
              gripperTurnFinalPos.setPresent();//sysj\capperPlant.sysj line: 64, column: 5
              currsigs.addElement(gripperTurnFinalPos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\capperPlant.sysj line: 58, column: 5
              currsigs.addElement(gripperTurnHomePos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnRetract.getprestatus()){//sysj\capperPlant.sysj line: 62, column: 10
              S155431=0;
              System.out.println("Gripper not twisted");//sysj\capperPlant.sysj line: 57, column: 5
              gripperTurnHomePos.setPresent();//sysj\capperPlant.sysj line: 58, column: 5
              currsigs.addElement(gripperTurnHomePos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\capperPlant.sysj line: 64, column: 5
              currsigs.addElement(gripperTurnFinalPos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread155646(int [] tdone, int [] ends){
        switch(S155406){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S155354){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\capperPlant.sysj line: 39, column: 10
              S155354=1;
              System.out.println("Cap Gripped");//sysj\capperPlant.sysj line: 46, column: 5
              capGripped.setPresent();//sysj\capperPlant.sysj line: 47, column: 5
              currsigs.addElement(capGripped);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              capUngripped.setPresent();//sysj\capperPlant.sysj line: 41, column: 5
              currsigs.addElement(capUngripped);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!capGripperPos5Extend.getprestatus()){//sysj\capperPlant.sysj line: 45, column: 10
              S155354=0;
              System.out.println("Cap not gripped");//sysj\capperPlant.sysj line: 40, column: 5
              capUngripped.setPresent();//sysj\capperPlant.sysj line: 41, column: 5
              currsigs.addElement(capUngripped);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              capGripped.setPresent();//sysj\capperPlant.sysj line: 47, column: 5
              currsigs.addElement(capGripped);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread155645(int [] tdone, int [] ends){
        switch(S155329){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S155277){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\capperPlant.sysj line: 21, column: 10
              S155277=1;
              System.out.println("Bottle Clamped");//sysj\capperPlant.sysj line: 29, column: 5
              bottleClamped.setPresent();//sysj\capperPlant.sysj line: 30, column: 5
              currsigs.addElement(bottleClamped);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleUnclamped.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
              currsigs.addElement(bottleUnclamped);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!cylClampBottleExtend.getprestatus()){//sysj\capperPlant.sysj line: 27, column: 10
              S155277=0;
              System.out.println("Bottle not clamped");//sysj\capperPlant.sysj line: 22, column: 5
              bottleUnclamped.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
              currsigs.addElement(bottleUnclamped);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleClamped.setPresent();//sysj\capperPlant.sysj line: 30, column: 5
              currsigs.addElement(bottleClamped);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread155642(int [] tdone, int [] ends){
        S155624=1;
    if(bottleUnclamped.getprestatus()){//sysj\capperPlant.sysj line: 105, column: 24
      bottleUnclampedE.setPresent();//sysj\capperPlant.sysj line: 105, column: 41
      currsigs.addElement(bottleUnclampedE);
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

  public void thread155641(int [] tdone, int [] ends){
        S155616=1;
    if(bottleClamped.getprestatus()){//sysj\capperPlant.sysj line: 103, column: 24
      bottleClampedE.setPresent();//sysj\capperPlant.sysj line: 103, column: 39
      currsigs.addElement(bottleClampedE);
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

  public void thread155640(int [] tdone, int [] ends){
        S155608=1;
    if(capUngripped.getprestatus()){//sysj\capperPlant.sysj line: 101, column: 24
      capUngrippedE.setPresent();//sysj\capperPlant.sysj line: 101, column: 38
      currsigs.addElement(capUngrippedE);
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

  public void thread155639(int [] tdone, int [] ends){
        S155600=1;
    if(capGripped.getprestatus()){//sysj\capperPlant.sysj line: 99, column: 24
      capGrippedE.setPresent();//sysj\capperPlant.sysj line: 99, column: 36
      currsigs.addElement(capGrippedE);
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

  public void thread155638(int [] tdone, int [] ends){
        S155592=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\capperPlant.sysj line: 97, column: 24
      gripperTurnFinalPosE.setPresent();//sysj\capperPlant.sysj line: 97, column: 45
      currsigs.addElement(gripperTurnFinalPosE);
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

  public void thread155637(int [] tdone, int [] ends){
        S155584=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\capperPlant.sysj line: 95, column: 24
      gripperTurnHomePosE.setPresent();//sysj\capperPlant.sysj line: 95, column: 44
      currsigs.addElement(gripperTurnHomePosE);
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

  public void thread155636(int [] tdone, int [] ends){
        S155576=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\capperPlant.sysj line: 93, column: 24
      gripperZAxisLiftedE.setPresent();//sysj\capperPlant.sysj line: 93, column: 44
      currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread155635(int [] tdone, int [] ends){
        S155568=1;
    S155562=0;
    if(gripperZAxisLowered.getprestatus()){//sysj\capperPlant.sysj line: 91, column: 24
      gripperZAxisLoweredE.setPresent();//sysj\capperPlant.sysj line: 91, column: 45
      currsigs.addElement(gripperZAxisLoweredE);
      S155562=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S155562=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread155634(int [] tdone, int [] ends){
        S155626=1;
    thread155635(tdone,ends);
    thread155636(tdone,ends);
    thread155637(tdone,ends);
    thread155638(tdone,ends);
    thread155639(tdone,ends);
    thread155640(tdone,ends);
    thread155641(tdone,ends);
    thread155642(tdone,ends);
    int biggest155643 = 0;
    if(ends[7]>=biggest155643){
      biggest155643=ends[7];
    }
    if(ends[8]>=biggest155643){
      biggest155643=ends[8];
    }
    if(ends[9]>=biggest155643){
      biggest155643=ends[9];
    }
    if(ends[10]>=biggest155643){
      biggest155643=ends[10];
    }
    if(ends[11]>=biggest155643){
      biggest155643=ends[11];
    }
    if(ends[12]>=biggest155643){
      biggest155643=ends[12];
    }
    if(ends[13]>=biggest155643){
      biggest155643=ends[13];
    }
    if(ends[14]>=biggest155643){
      biggest155643=ends[14];
    }
    if(biggest155643 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread155633(int [] tdone, int [] ends){
        S155560=1;
    S155508=0;
    System.out.println("Gripper lifted");//sysj\capperPlant.sysj line: 74, column: 5
    gripperZAxisLifted.setPresent();//sysj\capperPlant.sysj line: 75, column: 5
    currsigs.addElement(gripperZAxisLifted);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread155632(int [] tdone, int [] ends){
        S155483=1;
    S155431=0;
    System.out.println("Gripper not twisted");//sysj\capperPlant.sysj line: 57, column: 5
    gripperTurnHomePos.setPresent();//sysj\capperPlant.sysj line: 58, column: 5
    currsigs.addElement(gripperTurnHomePos);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread155631(int [] tdone, int [] ends){
        S155406=1;
    S155354=0;
    System.out.println("Cap not gripped");//sysj\capperPlant.sysj line: 40, column: 5
    capUngripped.setPresent();//sysj\capperPlant.sysj line: 41, column: 5
    currsigs.addElement(capUngripped);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread155630(int [] tdone, int [] ends){
        S155329=1;
    S155277=0;
    System.out.println("Bottle not clamped");//sysj\capperPlant.sysj line: 22, column: 5
    bottleUnclamped.setPresent();//sysj\capperPlant.sysj line: 23, column: 5
    currsigs.addElement(bottleUnclamped);
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
      switch(S155628){
        case 0 : 
          S155628=0;
          break RUN;
        
        case 1 : 
          S155628=2;
          S155628=2;
          thread155630(tdone,ends);
          thread155631(tdone,ends);
          thread155632(tdone,ends);
          thread155633(tdone,ends);
          thread155634(tdone,ends);
          int biggest155644 = 0;
          if(ends[2]>=biggest155644){
            biggest155644=ends[2];
          }
          if(ends[3]>=biggest155644){
            biggest155644=ends[3];
          }
          if(ends[4]>=biggest155644){
            biggest155644=ends[4];
          }
          if(ends[5]>=biggest155644){
            biggest155644=ends[5];
          }
          if(ends[6]>=biggest155644){
            biggest155644=ends[6];
          }
          if(biggest155644 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread155645(tdone,ends);
          thread155646(tdone,ends);
          thread155647(tdone,ends);
          thread155648(tdone,ends);
          thread155649(tdone,ends);
          int biggest155659 = 0;
          if(ends[2]>=biggest155659){
            biggest155659=ends[2];
          }
          if(ends[3]>=biggest155659){
            biggest155659=ends[3];
          }
          if(ends[4]>=biggest155659){
            biggest155659=ends[4];
          }
          if(ends[5]>=biggest155659){
            biggest155659=ends[5];
          }
          if(ends[6]>=biggest155659){
            biggest155659=ends[6];
          }
          if(biggest155659 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest155659 == 0){
            S155628=0;
            active[1]=0;
            ends[1]=0;
            S155628=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
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
          cylPos5ZaxisExtend.gethook();
          gripperTurnRetract.gethook();
          gripperTurnExtend.gethook();
          capGripperPos5Extend.gethook();
          cylClampBottleExtend.gethook();
          capperJobDone.gethook();
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      capperJobDone.setpreclear();
      enable.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      capGripped.setpreclear();
      capUngripped.setpreclear();
      bottleClamped.setpreclear();
      bottleUnclamped.setpreclear();
      bottleAtPos4E.setpreclear();
      gripperZAxisLoweredE.setpreclear();
      gripperZAxisLiftedE.setpreclear();
      gripperTurnHomePosE.setpreclear();
      gripperTurnFinalPosE.setpreclear();
      capGrippedE.setpreclear();
      capUngrippedE.setpreclear();
      bottleClampedE.setpreclear();
      bottleUnclampedE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = cylPos5ZaxisExtend.getStatus() ? cylPos5ZaxisExtend.setprepresent() : cylPos5ZaxisExtend.setpreclear();
      cylPos5ZaxisExtend.setpreval(cylPos5ZaxisExtend.getValue());
      cylPos5ZaxisExtend.setClear();
      dummyint = gripperTurnRetract.getStatus() ? gripperTurnRetract.setprepresent() : gripperTurnRetract.setpreclear();
      gripperTurnRetract.setpreval(gripperTurnRetract.getValue());
      gripperTurnRetract.setClear();
      dummyint = gripperTurnExtend.getStatus() ? gripperTurnExtend.setprepresent() : gripperTurnExtend.setpreclear();
      gripperTurnExtend.setpreval(gripperTurnExtend.getValue());
      gripperTurnExtend.setClear();
      dummyint = capGripperPos5Extend.getStatus() ? capGripperPos5Extend.setprepresent() : capGripperPos5Extend.setpreclear();
      capGripperPos5Extend.setpreval(capGripperPos5Extend.getValue());
      capGripperPos5Extend.setClear();
      dummyint = cylClampBottleExtend.getStatus() ? cylClampBottleExtend.setprepresent() : cylClampBottleExtend.setpreclear();
      cylClampBottleExtend.setpreval(cylClampBottleExtend.getValue());
      cylClampBottleExtend.setClear();
      dummyint = capperJobDone.getStatus() ? capperJobDone.setprepresent() : capperJobDone.setpreclear();
      capperJobDone.setpreval(capperJobDone.getValue());
      capperJobDone.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      gripperZAxisLowered.sethook();
      gripperZAxisLowered.setClear();
      gripperZAxisLifted.sethook();
      gripperZAxisLifted.setClear();
      gripperTurnHomePos.sethook();
      gripperTurnHomePos.setClear();
      gripperTurnFinalPos.sethook();
      gripperTurnFinalPos.setClear();
      capGripped.sethook();
      capGripped.setClear();
      capUngripped.sethook();
      capUngripped.setClear();
      bottleClamped.sethook();
      bottleClamped.setClear();
      bottleUnclamped.sethook();
      bottleUnclamped.setClear();
      bottleAtPos4E.sethook();
      bottleAtPos4E.setClear();
      gripperZAxisLoweredE.sethook();
      gripperZAxisLoweredE.setClear();
      gripperZAxisLiftedE.sethook();
      gripperZAxisLiftedE.setClear();
      gripperTurnHomePosE.sethook();
      gripperTurnHomePosE.setClear();
      gripperTurnFinalPosE.sethook();
      gripperTurnFinalPosE.setClear();
      capGrippedE.sethook();
      capGrippedE.setClear();
      capUngrippedE.sethook();
      capUngrippedE.setClear();
      bottleClampedE.sethook();
      bottleClampedE.setClear();
      bottleUnclampedE.sethook();
      bottleUnclampedE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
        capperJobDone.gethook();
        enable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
