import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class capperController extends ClockDomain{
  public capperController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.INPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.INPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.INPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.INPUT);
  public Signal capGripped = new Signal("capGripped", Signal.INPUT);
  public Signal capUngripped = new Signal("capUngripped", Signal.INPUT);
  public Signal bottleClamped = new Signal("bottleClamped", Signal.INPUT);
  public Signal bottleUnclamped = new Signal("bottleUnclamped", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal cylPos5ZaxisExtendM = new Signal("cylPos5ZaxisExtendM", Signal.INPUT);
  public Signal gripperTurnRetractM = new Signal("gripperTurnRetractM", Signal.INPUT);
  public Signal gripperTurnExtendM = new Signal("gripperTurnExtendM", Signal.INPUT);
  public Signal capGripperPos5ExtendM = new Signal("capGripperPos5ExtendM", Signal.INPUT);
  public Signal cylClampBottleExtendM = new Signal("cylClampBottleExtendM", Signal.INPUT);
  public Signal capperJobDoneM = new Signal("capperJobDoneM", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.OUTPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.OUTPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.OUTPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.OUTPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.OUTPUT);
  public Signal capperJobDone = new Signal("capperJobDone", Signal.OUTPUT);
  public Signal bottleDonePos4 = new Signal("bottleDonePos4", Signal.OUTPUT);
  private Signal modeA_1;
  private Signal modeM_1;
  private int S19724 = 1;
  private int S3122 = 1;
  private int S3096 = 1;
  private int S5862 = 1;
  private int S5458 = 1;
  private int S3124 = 1;
  private int S3126 = 1;
  private int S3141 = 1;
  private int S3188 = 1;
  private int S3187 = 1;
  private int S3147 = 1;
  private int S3152 = 1;
  private int S3161 = 1;
  private int S3160 = 1;
  private int S3164 = 1;
  private int S5860 = 1;
  private int S5558 = 1;
  private int S5467 = 1;
  private int S5461 = 1;
  private int S5475 = 1;
  private int S5483 = 1;
  private int S5491 = 1;
  private int S5499 = 1;
  private int S5507 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread19771(int [] tdone, int [] ends){
        S5860=1;
    S5558=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread19770(int [] tdone, int [] ends){
        S5458=1;
    S3124=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread19769(int [] tdone, int [] ends){
        S5862=1;
    thread19770(tdone,ends);
    thread19771(tdone,ends);
    int biggest19772 = 0;
    if(ends[4]>=biggest19772){
      biggest19772=ends[4];
    }
    if(ends[11]>=biggest19772){
      biggest19772=ends[11];
    }
    if(biggest19772 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread19768(int [] tdone, int [] ends){
        S3122=1;
    S3096=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread19764(int [] tdone, int [] ends){
        switch(S5507){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(capperJobDoneM.getprestatus()){//sysj\capperController.sysj line: 116, column: 21
          capperJobDone.setPresent();//sysj\capperController.sysj line: 116, column: 37
          currsigs.addElement(capperJobDone);
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

  public void thread19763(int [] tdone, int [] ends){
        switch(S5499){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtendM.getprestatus()){//sysj\capperController.sysj line: 114, column: 21
          cylClampBottleExtend.setPresent();//sysj\capperController.sysj line: 114, column: 44
          currsigs.addElement(cylClampBottleExtend);
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

  public void thread19762(int [] tdone, int [] ends){
        switch(S5491){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(capGripperPos5ExtendM.getprestatus()){//sysj\capperController.sysj line: 112, column: 21
          capGripperPos5Extend.setPresent();//sysj\capperController.sysj line: 112, column: 44
          currsigs.addElement(capGripperPos5Extend);
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

  public void thread19761(int [] tdone, int [] ends){
        switch(S5483){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtendM.getprestatus()){//sysj\capperController.sysj line: 110, column: 21
          gripperTurnExtend.setPresent();//sysj\capperController.sysj line: 110, column: 41
          currsigs.addElement(gripperTurnExtend);
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

  public void thread19760(int [] tdone, int [] ends){
        switch(S5475){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetractM.getprestatus()){//sysj\capperController.sysj line: 108, column: 21
          gripperTurnRetract.setPresent();//sysj\capperController.sysj line: 108, column: 42
          currsigs.addElement(gripperTurnRetract);
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

  public void thread19759(int [] tdone, int [] ends){
        switch(S5467){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S5461){
          case 0 : 
            S5461=0;
            if(cylPos5ZaxisExtendM.getprestatus()){//sysj\capperController.sysj line: 106, column: 21
              cylPos5ZaxisExtend.setPresent();//sysj\capperController.sysj line: 106, column: 42
              currsigs.addElement(cylPos5ZaxisExtend);
              S5461=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S5461=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S5461=1;
            S5461=0;
            if(cylPos5ZaxisExtendM.getprestatus()){//sysj\capperController.sysj line: 106, column: 21
              cylPos5ZaxisExtend.setPresent();//sysj\capperController.sysj line: 106, column: 42
              currsigs.addElement(cylPos5ZaxisExtend);
              S5461=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S5461=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread19757(int [] tdone, int [] ends){
        S5507=1;
    if(capperJobDoneM.getprestatus()){//sysj\capperController.sysj line: 116, column: 21
      capperJobDone.setPresent();//sysj\capperController.sysj line: 116, column: 37
      currsigs.addElement(capperJobDone);
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

  public void thread19756(int [] tdone, int [] ends){
        S5499=1;
    if(cylClampBottleExtendM.getprestatus()){//sysj\capperController.sysj line: 114, column: 21
      cylClampBottleExtend.setPresent();//sysj\capperController.sysj line: 114, column: 44
      currsigs.addElement(cylClampBottleExtend);
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

  public void thread19755(int [] tdone, int [] ends){
        S5491=1;
    if(capGripperPos5ExtendM.getprestatus()){//sysj\capperController.sysj line: 112, column: 21
      capGripperPos5Extend.setPresent();//sysj\capperController.sysj line: 112, column: 44
      currsigs.addElement(capGripperPos5Extend);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread19754(int [] tdone, int [] ends){
        S5483=1;
    if(gripperTurnExtendM.getprestatus()){//sysj\capperController.sysj line: 110, column: 21
      gripperTurnExtend.setPresent();//sysj\capperController.sysj line: 110, column: 41
      currsigs.addElement(gripperTurnExtend);
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

  public void thread19753(int [] tdone, int [] ends){
        S5475=1;
    if(gripperTurnRetractM.getprestatus()){//sysj\capperController.sysj line: 108, column: 21
      gripperTurnRetract.setPresent();//sysj\capperController.sysj line: 108, column: 42
      currsigs.addElement(gripperTurnRetract);
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

  public void thread19752(int [] tdone, int [] ends){
        S5467=1;
    S5461=0;
    if(cylPos5ZaxisExtendM.getprestatus()){//sysj\capperController.sysj line: 106, column: 21
      cylPos5ZaxisExtend.setPresent();//sysj\capperController.sysj line: 106, column: 42
      currsigs.addElement(cylPos5ZaxisExtend);
      S5461=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S5461=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread19751(int [] tdone, int [] ends){
        switch(S5860){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S5558){
          case 0 : 
            if(modeM_1.getprestatus()){//sysj\capperController.sysj line: 104, column: 12
              S5558=1;
              thread19752(tdone,ends);
              thread19753(tdone,ends);
              thread19754(tdone,ends);
              thread19755(tdone,ends);
              thread19756(tdone,ends);
              thread19757(tdone,ends);
              int biggest19758 = 0;
              if(ends[12]>=biggest19758){
                biggest19758=ends[12];
              }
              if(ends[13]>=biggest19758){
                biggest19758=ends[13];
              }
              if(ends[14]>=biggest19758){
                biggest19758=ends[14];
              }
              if(ends[15]>=biggest19758){
                biggest19758=ends[15];
              }
              if(ends[16]>=biggest19758){
                biggest19758=ends[16];
              }
              if(ends[17]>=biggest19758){
                biggest19758=ends[17];
              }
              if(biggest19758 == 1){
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
            if(modeA_1.getprestatus()){//sysj\capperController.sysj line: 105, column: 12
              S5558=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              thread19759(tdone,ends);
              thread19760(tdone,ends);
              thread19761(tdone,ends);
              thread19762(tdone,ends);
              thread19763(tdone,ends);
              thread19764(tdone,ends);
              int biggest19765 = 0;
              if(ends[12]>=biggest19765){
                biggest19765=ends[12];
              }
              if(ends[13]>=biggest19765){
                biggest19765=ends[13];
              }
              if(ends[14]>=biggest19765){
                biggest19765=ends[14];
              }
              if(ends[15]>=biggest19765){
                biggest19765=ends[15];
              }
              if(ends[16]>=biggest19765){
                biggest19765=ends[16];
              }
              if(ends[17]>=biggest19765){
                biggest19765=ends[17];
              }
              if(biggest19765 == 1){
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              //FINXME code
              if(biggest19765 == 0){
                S5558=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread19748(int [] tdone, int [] ends){
        switch(S3164){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capperController.sysj line: 83, column: 18
          ends[10]=2;
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

  public void thread19747(int [] tdone, int [] ends){
        switch(S3161){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S3160){
          case 0 : 
            if(capGripped.getprestatus()){//sysj\capperController.sysj line: 77, column: 18
              S3160=1;
              gripperTurnExtend.setPresent();//sysj\capperController.sysj line: 79, column: 12
              currsigs.addElement(gripperTurnExtend);
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
          
          case 1 : 
            gripperTurnExtend.setPresent();//sysj\capperController.sysj line: 79, column: 12
            currsigs.addElement(gripperTurnExtend);
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread19746(int [] tdone, int [] ends){
        switch(S3152){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\capperController.sysj line: 73, column: 12
        currsigs.addElement(capGripperPos5Extend);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread19745(int [] tdone, int [] ends){
        switch(S3147){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\capperController.sysj line: 68, column: 12
        currsigs.addElement(cylClampBottleExtend);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread19743(int [] tdone, int [] ends){
        S3164=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread19742(int [] tdone, int [] ends){
        S3161=1;
    S3160=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread19741(int [] tdone, int [] ends){
        S3152=1;
    capGripperPos5Extend.setPresent();//sysj\capperController.sysj line: 73, column: 12
    currsigs.addElement(capGripperPos5Extend);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread19740(int [] tdone, int [] ends){
        S3147=1;
    cylClampBottleExtend.setPresent();//sysj\capperController.sysj line: 68, column: 12
    currsigs.addElement(cylClampBottleExtend);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread19739(int [] tdone, int [] ends){
        switch(S3188){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S3187){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\capperController.sysj line: 65, column: 17
              S3187=1;
              thread19740(tdone,ends);
              thread19741(tdone,ends);
              thread19742(tdone,ends);
              thread19743(tdone,ends);
              int biggest19744 = 0;
              if(ends[7]>=biggest19744){
                biggest19744=ends[7];
              }
              if(ends[8]>=biggest19744){
                biggest19744=ends[8];
              }
              if(ends[9]>=biggest19744){
                biggest19744=ends[9];
              }
              if(ends[10]>=biggest19744){
                biggest19744=ends[10];
              }
              if(biggest19744 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            thread19745(tdone,ends);
            thread19746(tdone,ends);
            thread19747(tdone,ends);
            thread19748(tdone,ends);
            int biggest19749 = 0;
            if(ends[7]>=biggest19749){
              biggest19749=ends[7];
            }
            if(ends[8]>=biggest19749){
              biggest19749=ends[8];
            }
            if(ends[9]>=biggest19749){
              biggest19749=ends[9];
            }
            if(ends[10]>=biggest19749){
              biggest19749=ends[10];
            }
            if(biggest19749 == 1){
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            if(biggest19749 == 2){
              ends[6]=2;
              tdone[6]=1;
            }
            //FINXME code
            if(biggest19749 == 0){
              S3188=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread19738(int [] tdone, int [] ends){
        switch(S3141){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\capperController.sysj line: 62, column: 11
        currsigs.addElement(cylPos5ZaxisExtend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread19736(int [] tdone, int [] ends){
        S3188=1;
    S3187=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread19735(int [] tdone, int [] ends){
        S3141=1;
    cylPos5ZaxisExtend.setPresent();//sysj\capperController.sysj line: 62, column: 11
    currsigs.addElement(cylPos5ZaxisExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread19734(int [] tdone, int [] ends){
        switch(S5458){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3124){
          case 0 : 
            if(modeA_1.getprestatus()){//sysj\capperController.sysj line: 48, column: 12
              System.out.println("Auto Mode selected");//sysj\capperController.sysj line: 49, column: 6
              S3124=1;
              S3126=0;
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
          
          case 1 : 
            if(modeM_1.getprestatus()){//sysj\capperController.sysj line: 50, column: 12
              S3124=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S3126){
                case 0 : 
                  if(bottleAtPos4.getprestatus()){//sysj\capperController.sysj line: 53, column: 15
                    System.out.println("bottleAtPos444");//sysj\capperController.sysj line: 54, column: 9
                    S3126=1;
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
                
                case 1 : 
                  if(gripperZAxisLifted.getprestatus()){//sysj\capperController.sysj line: 55, column: 15
                    S3126=2;
                    gripperTurnRetract.setPresent();//sysj\capperController.sysj line: 59, column: 10
                    currsigs.addElement(gripperTurnRetract);
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
                
                case 2 : 
                  if(gripperTurnHomePos.getprestatus()){//sysj\capperController.sysj line: 58, column: 15
                    S3126=3;
                    thread19735(tdone,ends);
                    thread19736(tdone,ends);
                    int biggest19737 = 0;
                    if(ends[5]>=biggest19737){
                      biggest19737=ends[5];
                    }
                    if(ends[6]>=biggest19737){
                      biggest19737=ends[6];
                    }
                    if(biggest19737 == 1){
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    gripperTurnRetract.setPresent();//sysj\capperController.sysj line: 59, column: 10
                    currsigs.addElement(gripperTurnRetract);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  break;
                
                case 3 : 
                  thread19738(tdone,ends);
                  thread19739(tdone,ends);
                  int biggest19750 = 0;
                  if(ends[5]>=biggest19750){
                    biggest19750=ends[5];
                  }
                  if(ends[6]>=biggest19750){
                    biggest19750=ends[6];
                  }
                  if(biggest19750 == 1){
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  if(biggest19750 == 2){
                    ends[4]=2;
                    ;//sysj\capperController.sysj line: 61, column: 9
                    S3126=4;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  //FINXME code
                  if(biggest19750 == 0){
                    S3126=4;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  break;
                
                case 4 : 
                  if(gripperZAxisLifted.getprestatus()){//sysj\capperController.sysj line: 88, column: 15
                    S3126=5;
                    bottleDonePos4.setPresent();//sysj\capperController.sysj line: 93, column: 10
                    currsigs.addElement(bottleDonePos4);
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
                
                case 5 : 
                  if(bottleAtPos4.getprestatus()){//sysj\capperController.sysj line: 91, column: 15
                    S3126=0;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    bottleDonePos4.setPresent();//sysj\capperController.sysj line: 93, column: 10
                    currsigs.addElement(bottleDonePos4);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread19733(int [] tdone, int [] ends){
        switch(S5862){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread19734(tdone,ends);
        thread19751(tdone,ends);
        int biggest19766 = 0;
        if(ends[4]>=biggest19766){
          biggest19766=ends[4];
        }
        if(ends[11]>=biggest19766){
          biggest19766=ends[11];
        }
        if(biggest19766 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest19766 == 0){
          S5862=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread19732(int [] tdone, int [] ends){
        switch(S3122){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3096){
          case 0 : 
            if(mode.getprestatus()){//sysj\capperController.sysj line: 33, column: 12
              S3096=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\capperController.sysj line: 34, column: 10
                modeA_1.setPresent();//sysj\capperController.sysj line: 35, column: 7
                currsigs.addElement(modeA_1);
                S3096=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\capperController.sysj line: 36, column: 17
                  modeM_1.setPresent();//sysj\capperController.sysj line: 37, column: 7
                  currsigs.addElement(modeM_1);
                  S3096=0;
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
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S3096=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread19729(int [] tdone, int [] ends){
        S5860=1;
    S5558=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread19728(int [] tdone, int [] ends){
        S5458=1;
    S3124=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread19727(int [] tdone, int [] ends){
        S5862=1;
    thread19728(tdone,ends);
    thread19729(tdone,ends);
    int biggest19730 = 0;
    if(ends[4]>=biggest19730){
      biggest19730=ends[4];
    }
    if(ends[11]>=biggest19730){
      biggest19730=ends[11];
    }
    if(biggest19730 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread19726(int [] tdone, int [] ends){
        S3122=1;
    S3096=0;
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
      switch(S19724){
        case 0 : 
          S19724=0;
          break RUN;
        
        case 1 : 
          S19724=2;
          S19724=2;
          modeA_1.setClear();//sysj\capperController.sysj line: 23, column: 3
          modeM_1.setClear();//sysj\capperController.sysj line: 24, column: 3
          modeA_1.setPresent();//sysj\capperController.sysj line: 26, column: 3
          currsigs.addElement(modeA_1);
          thread19726(tdone,ends);
          thread19727(tdone,ends);
          int biggest19731 = 0;
          if(ends[2]>=biggest19731){
            biggest19731=ends[2];
          }
          if(ends[3]>=biggest19731){
            biggest19731=ends[3];
          }
          if(biggest19731 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          modeA_1.setClear();//sysj\capperController.sysj line: 23, column: 3
          modeM_1.setClear();//sysj\capperController.sysj line: 24, column: 3
          thread19732(tdone,ends);
          thread19733(tdone,ends);
          int biggest19767 = 0;
          if(ends[2]>=biggest19767){
            biggest19767=ends[2];
          }
          if(ends[3]>=biggest19767){
            biggest19767=ends[3];
          }
          if(biggest19767 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest19767 == 0){
            thread19768(tdone,ends);
            thread19769(tdone,ends);
            int biggest19773 = 0;
            if(ends[2]>=biggest19773){
              biggest19773=ends[2];
            }
            if(ends[3]>=biggest19773){
              biggest19773=ends[3];
            }
            if(biggest19773 == 1){
              active[1]=1;
              ends[1]=1;
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
    modeA_1 = new Signal();
    modeM_1 = new Signal();
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
          bottleAtPos4.gethook();
          gripperZAxisLowered.gethook();
          gripperZAxisLifted.gethook();
          gripperTurnHomePos.gethook();
          gripperTurnFinalPos.gethook();
          capGripped.gethook();
          capUngripped.gethook();
          bottleClamped.gethook();
          bottleUnclamped.gethook();
          mode.gethook();
          cylPos5ZaxisExtendM.gethook();
          gripperTurnRetractM.gethook();
          gripperTurnExtendM.gethook();
          capGripperPos5ExtendM.gethook();
          cylClampBottleExtendM.gethook();
          capperJobDoneM.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      capGripped.setpreclear();
      capUngripped.setpreclear();
      bottleClamped.setpreclear();
      bottleUnclamped.setpreclear();
      mode.setpreclear();
      cylPos5ZaxisExtendM.setpreclear();
      gripperTurnRetractM.setpreclear();
      gripperTurnExtendM.setpreclear();
      capGripperPos5ExtendM.setpreclear();
      cylClampBottleExtendM.setpreclear();
      capperJobDoneM.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      capperJobDone.setpreclear();
      bottleDonePos4.setpreclear();
      modeA_1.setpreclear();
      modeM_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = gripperZAxisLowered.getStatus() ? gripperZAxisLowered.setprepresent() : gripperZAxisLowered.setpreclear();
      gripperZAxisLowered.setpreval(gripperZAxisLowered.getValue());
      gripperZAxisLowered.setClear();
      dummyint = gripperZAxisLifted.getStatus() ? gripperZAxisLifted.setprepresent() : gripperZAxisLifted.setpreclear();
      gripperZAxisLifted.setpreval(gripperZAxisLifted.getValue());
      gripperZAxisLifted.setClear();
      dummyint = gripperTurnHomePos.getStatus() ? gripperTurnHomePos.setprepresent() : gripperTurnHomePos.setpreclear();
      gripperTurnHomePos.setpreval(gripperTurnHomePos.getValue());
      gripperTurnHomePos.setClear();
      dummyint = gripperTurnFinalPos.getStatus() ? gripperTurnFinalPos.setprepresent() : gripperTurnFinalPos.setpreclear();
      gripperTurnFinalPos.setpreval(gripperTurnFinalPos.getValue());
      gripperTurnFinalPos.setClear();
      dummyint = capGripped.getStatus() ? capGripped.setprepresent() : capGripped.setpreclear();
      capGripped.setpreval(capGripped.getValue());
      capGripped.setClear();
      dummyint = capUngripped.getStatus() ? capUngripped.setprepresent() : capUngripped.setpreclear();
      capUngripped.setpreval(capUngripped.getValue());
      capUngripped.setClear();
      dummyint = bottleClamped.getStatus() ? bottleClamped.setprepresent() : bottleClamped.setpreclear();
      bottleClamped.setpreval(bottleClamped.getValue());
      bottleClamped.setClear();
      dummyint = bottleUnclamped.getStatus() ? bottleUnclamped.setprepresent() : bottleUnclamped.setpreclear();
      bottleUnclamped.setpreval(bottleUnclamped.getValue());
      bottleUnclamped.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = cylPos5ZaxisExtendM.getStatus() ? cylPos5ZaxisExtendM.setprepresent() : cylPos5ZaxisExtendM.setpreclear();
      cylPos5ZaxisExtendM.setpreval(cylPos5ZaxisExtendM.getValue());
      cylPos5ZaxisExtendM.setClear();
      dummyint = gripperTurnRetractM.getStatus() ? gripperTurnRetractM.setprepresent() : gripperTurnRetractM.setpreclear();
      gripperTurnRetractM.setpreval(gripperTurnRetractM.getValue());
      gripperTurnRetractM.setClear();
      dummyint = gripperTurnExtendM.getStatus() ? gripperTurnExtendM.setprepresent() : gripperTurnExtendM.setpreclear();
      gripperTurnExtendM.setpreval(gripperTurnExtendM.getValue());
      gripperTurnExtendM.setClear();
      dummyint = capGripperPos5ExtendM.getStatus() ? capGripperPos5ExtendM.setprepresent() : capGripperPos5ExtendM.setpreclear();
      capGripperPos5ExtendM.setpreval(capGripperPos5ExtendM.getValue());
      capGripperPos5ExtendM.setClear();
      dummyint = cylClampBottleExtendM.getStatus() ? cylClampBottleExtendM.setprepresent() : cylClampBottleExtendM.setpreclear();
      cylClampBottleExtendM.setpreval(cylClampBottleExtendM.getValue());
      cylClampBottleExtendM.setClear();
      dummyint = capperJobDoneM.getStatus() ? capperJobDoneM.setprepresent() : capperJobDoneM.setpreclear();
      capperJobDoneM.setpreval(capperJobDoneM.getValue());
      capperJobDoneM.setClear();
      cylPos5ZaxisExtend.sethook();
      cylPos5ZaxisExtend.setClear();
      gripperTurnRetract.sethook();
      gripperTurnRetract.setClear();
      gripperTurnExtend.sethook();
      gripperTurnExtend.setClear();
      capGripperPos5Extend.sethook();
      capGripperPos5Extend.setClear();
      cylClampBottleExtend.sethook();
      cylClampBottleExtend.setClear();
      capperJobDone.sethook();
      capperJobDone.setClear();
      bottleDonePos4.sethook();
      bottleDonePos4.setClear();
      modeA_1.setClear();
      modeM_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos4.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
        capGripped.gethook();
        capUngripped.gethook();
        bottleClamped.gethook();
        bottleUnclamped.gethook();
        mode.gethook();
        cylPos5ZaxisExtendM.gethook();
        gripperTurnRetractM.gethook();
        gripperTurnExtendM.gethook();
        capGripperPos5ExtendM.gethook();
        cylClampBottleExtendM.gethook();
        capperJobDoneM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
