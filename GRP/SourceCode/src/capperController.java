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
  private long __start_thread_4;//sysj\capperController.sysj line: 50, column: 18
  private long __start_thread_6;//sysj\capperController.sysj line: 65, column: 10
  private long __start_thread_9;//sysj\capperController.sysj line: 78, column: 11
  private long __start_thread_10;//sysj\capperController.sysj line: 85, column: 11
  private int S155198 = 1;
  private int S3668 = 1;
  private int S3642 = 1;
  private int S28896 = 1;
  private int S28492 = 1;
  private int S3670 = 1;
  private int S3672 = 1;
  private int S3674 = 1;
  private int S3717 = 1;
  private int S4084 = 1;
  private int S3747 = 1;
  private int S3752 = 1;
  private int S3757 = 1;
  private int S3800 = 1;
  private int S3787 = 1;
  private int S3831 = 1;
  private int S3830 = 1;
  private int S28894 = 1;
  private int S28592 = 1;
  private int S28501 = 1;
  private int S28509 = 1;
  private int S28517 = 1;
  private int S28525 = 1;
  private int S28533 = 1;
  private int S28541 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread155250(int [] tdone, int [] ends){
        S28894=1;
    S28592=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread155249(int [] tdone, int [] ends){
        S28492=1;
    S3670=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread155248(int [] tdone, int [] ends){
        S28896=1;
    thread155249(tdone,ends);
    thread155250(tdone,ends);
    int biggest155251 = 0;
    if(ends[4]>=biggest155251){
      biggest155251=ends[4];
    }
    if(ends[11]>=biggest155251){
      biggest155251=ends[11];
    }
    if(biggest155251 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread155247(int [] tdone, int [] ends){
        S3668=1;
    S3642=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread155243(int [] tdone, int [] ends){
        switch(S28541){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(capperJobDoneM.getprestatus()){//sysj\capperController.sysj line: 121, column: 21
          capperJobDone.setPresent();//sysj\capperController.sysj line: 121, column: 37
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

  public void thread155242(int [] tdone, int [] ends){
        switch(S28533){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtendM.getprestatus()){//sysj\capperController.sysj line: 119, column: 21
          cylClampBottleExtend.setPresent();//sysj\capperController.sysj line: 119, column: 44
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

  public void thread155241(int [] tdone, int [] ends){
        switch(S28525){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(capGripperPos5ExtendM.getprestatus()){//sysj\capperController.sysj line: 117, column: 21
          capGripperPos5Extend.setPresent();//sysj\capperController.sysj line: 117, column: 44
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

  public void thread155240(int [] tdone, int [] ends){
        switch(S28517){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtendM.getprestatus()){//sysj\capperController.sysj line: 115, column: 21
          gripperTurnExtend.setPresent();//sysj\capperController.sysj line: 115, column: 41
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

  public void thread155239(int [] tdone, int [] ends){
        switch(S28509){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetractM.getprestatus()){//sysj\capperController.sysj line: 113, column: 21
          gripperTurnRetract.setPresent();//sysj\capperController.sysj line: 113, column: 42
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

  public void thread155238(int [] tdone, int [] ends){
        switch(S28501){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtendM.getprestatus()){//sysj\capperController.sysj line: 111, column: 21
          cylPos5ZaxisExtend.setPresent();//sysj\capperController.sysj line: 111, column: 42
          currsigs.addElement(cylPos5ZaxisExtend);
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

  public void thread155236(int [] tdone, int [] ends){
        S28541=1;
    if(capperJobDoneM.getprestatus()){//sysj\capperController.sysj line: 121, column: 21
      capperJobDone.setPresent();//sysj\capperController.sysj line: 121, column: 37
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

  public void thread155235(int [] tdone, int [] ends){
        S28533=1;
    if(cylClampBottleExtendM.getprestatus()){//sysj\capperController.sysj line: 119, column: 21
      cylClampBottleExtend.setPresent();//sysj\capperController.sysj line: 119, column: 44
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

  public void thread155234(int [] tdone, int [] ends){
        S28525=1;
    if(capGripperPos5ExtendM.getprestatus()){//sysj\capperController.sysj line: 117, column: 21
      capGripperPos5Extend.setPresent();//sysj\capperController.sysj line: 117, column: 44
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

  public void thread155233(int [] tdone, int [] ends){
        S28517=1;
    if(gripperTurnExtendM.getprestatus()){//sysj\capperController.sysj line: 115, column: 21
      gripperTurnExtend.setPresent();//sysj\capperController.sysj line: 115, column: 41
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

  public void thread155232(int [] tdone, int [] ends){
        S28509=1;
    if(gripperTurnRetractM.getprestatus()){//sysj\capperController.sysj line: 113, column: 21
      gripperTurnRetract.setPresent();//sysj\capperController.sysj line: 113, column: 42
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

  public void thread155231(int [] tdone, int [] ends){
        S28501=1;
    if(cylPos5ZaxisExtendM.getprestatus()){//sysj\capperController.sysj line: 111, column: 21
      cylPos5ZaxisExtend.setPresent();//sysj\capperController.sysj line: 111, column: 42
      currsigs.addElement(cylPos5ZaxisExtend);
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

  public void thread155230(int [] tdone, int [] ends){
        switch(S28894){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S28592){
          case 0 : 
            if(modeM_1.getprestatus()){//sysj\capperController.sysj line: 109, column: 12
              S28592=1;
              thread155231(tdone,ends);
              thread155232(tdone,ends);
              thread155233(tdone,ends);
              thread155234(tdone,ends);
              thread155235(tdone,ends);
              thread155236(tdone,ends);
              int biggest155237 = 0;
              if(ends[12]>=biggest155237){
                biggest155237=ends[12];
              }
              if(ends[13]>=biggest155237){
                biggest155237=ends[13];
              }
              if(ends[14]>=biggest155237){
                biggest155237=ends[14];
              }
              if(ends[15]>=biggest155237){
                biggest155237=ends[15];
              }
              if(ends[16]>=biggest155237){
                biggest155237=ends[16];
              }
              if(ends[17]>=biggest155237){
                biggest155237=ends[17];
              }
              if(biggest155237 == 1){
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
            if(modeA_1.getprestatus()){//sysj\capperController.sysj line: 110, column: 12
              S28592=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              thread155238(tdone,ends);
              thread155239(tdone,ends);
              thread155240(tdone,ends);
              thread155241(tdone,ends);
              thread155242(tdone,ends);
              thread155243(tdone,ends);
              int biggest155244 = 0;
              if(ends[12]>=biggest155244){
                biggest155244=ends[12];
              }
              if(ends[13]>=biggest155244){
                biggest155244=ends[13];
              }
              if(ends[14]>=biggest155244){
                biggest155244=ends[14];
              }
              if(ends[15]>=biggest155244){
                biggest155244=ends[15];
              }
              if(ends[16]>=biggest155244){
                biggest155244=ends[16];
              }
              if(ends[17]>=biggest155244){
                biggest155244=ends[17];
              }
              if(biggest155244 == 1){
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              //FINXME code
              if(biggest155244 == 0){
                S28592=0;
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

  public void thread155227(int [] tdone, int [] ends){
        switch(S3831){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S3830){
          case 0 : 
            if(gripperTurnFinalPos.getprestatus()){//sysj\capperController.sysj line: 86, column: 18
              S3830=1;
              __start_thread_10 = com.systemj.Timer.getMs();//sysj\capperController.sysj line: 85, column: 11
              if(com.systemj.Timer.getMs() - __start_thread_10 >= (1) * 1000){//sysj\capperController.sysj line: 85, column: 11
                ends[10]=3;
                ;//sysj\capperController.sysj line: 85, column: 11
                ends[10]=2;
                tdone[10]=1;
              }
              else {
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
            if(com.systemj.Timer.getMs() - __start_thread_10 >= (1) * 1000){//sysj\capperController.sysj line: 85, column: 11
              ends[10]=3;
              ;//sysj\capperController.sysj line: 85, column: 11
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
        break;
      
    }
  }

  public void thread155226(int [] tdone, int [] ends){
        switch(S3800){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S3787){
          case 0 : 
            if(capGripped.getprestatus()){//sysj\capperController.sysj line: 79, column: 18
              S3787=1;
              __start_thread_9 = com.systemj.Timer.getMs();//sysj\capperController.sysj line: 78, column: 11
              if(com.systemj.Timer.getMs() - __start_thread_9 >= (1) * 1000){//sysj\capperController.sysj line: 78, column: 11
                ends[9]=4;
                ;//sysj\capperController.sysj line: 78, column: 11
                S3787=2;
                gripperTurnExtend.setPresent();//sysj\capperController.sysj line: 82, column: 12
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
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_9 >= (1) * 1000){//sysj\capperController.sysj line: 78, column: 11
              ends[9]=4;
              ;//sysj\capperController.sysj line: 78, column: 11
              S3787=2;
              gripperTurnExtend.setPresent();//sysj\capperController.sysj line: 82, column: 12
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
          
          case 2 : 
            gripperTurnExtend.setPresent();//sysj\capperController.sysj line: 82, column: 12
            currsigs.addElement(gripperTurnExtend);
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread155225(int [] tdone, int [] ends){
        switch(S3757){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\capperController.sysj line: 75, column: 12
        currsigs.addElement(capGripperPos5Extend);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread155224(int [] tdone, int [] ends){
        switch(S3752){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\capperController.sysj line: 70, column: 12
        currsigs.addElement(cylClampBottleExtend);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread155222(int [] tdone, int [] ends){
        S3831=1;
    S3830=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread155221(int [] tdone, int [] ends){
        S3800=1;
    S3787=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread155220(int [] tdone, int [] ends){
        S3757=1;
    capGripperPos5Extend.setPresent();//sysj\capperController.sysj line: 75, column: 12
    currsigs.addElement(capGripperPos5Extend);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread155219(int [] tdone, int [] ends){
        S3752=1;
    cylClampBottleExtend.setPresent();//sysj\capperController.sysj line: 70, column: 12
    currsigs.addElement(cylClampBottleExtend);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread155217(int [] tdone, int [] ends){
        S3831=1;
    S3830=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread155216(int [] tdone, int [] ends){
        S3800=1;
    S3787=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread155215(int [] tdone, int [] ends){
        S3757=1;
    capGripperPos5Extend.setPresent();//sysj\capperController.sysj line: 75, column: 12
    currsigs.addElement(capGripperPos5Extend);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread155214(int [] tdone, int [] ends){
        S3752=1;
    cylClampBottleExtend.setPresent();//sysj\capperController.sysj line: 70, column: 12
    currsigs.addElement(cylClampBottleExtend);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread155213(int [] tdone, int [] ends){
        switch(S4084){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S3747){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\capperController.sysj line: 66, column: 17
              S3747=1;
              __start_thread_6 = com.systemj.Timer.getMs();//sysj\capperController.sysj line: 65, column: 10
              if(com.systemj.Timer.getMs() - __start_thread_6 >= (1) * 1000){//sysj\capperController.sysj line: 65, column: 10
                ends[6]=5;
                ;//sysj\capperController.sysj line: 65, column: 10
                S3747=2;
                thread155214(tdone,ends);
                thread155215(tdone,ends);
                thread155216(tdone,ends);
                thread155217(tdone,ends);
                int biggest155218 = 0;
                if(ends[7]>=biggest155218){
                  biggest155218=ends[7];
                }
                if(ends[8]>=biggest155218){
                  biggest155218=ends[8];
                }
                if(ends[9]>=biggest155218){
                  biggest155218=ends[9];
                }
                if(ends[10]>=biggest155218){
                  biggest155218=ends[10];
                }
                if(biggest155218 == 1){
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
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (1) * 1000){//sysj\capperController.sysj line: 65, column: 10
              ends[6]=5;
              ;//sysj\capperController.sysj line: 65, column: 10
              S3747=2;
              thread155219(tdone,ends);
              thread155220(tdone,ends);
              thread155221(tdone,ends);
              thread155222(tdone,ends);
              int biggest155223 = 0;
              if(ends[7]>=biggest155223){
                biggest155223=ends[7];
              }
              if(ends[8]>=biggest155223){
                biggest155223=ends[8];
              }
              if(ends[9]>=biggest155223){
                biggest155223=ends[9];
              }
              if(ends[10]>=biggest155223){
                biggest155223=ends[10];
              }
              if(biggest155223 == 1){
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
          
          case 2 : 
            thread155224(tdone,ends);
            thread155225(tdone,ends);
            thread155226(tdone,ends);
            thread155227(tdone,ends);
            int biggest155228 = 0;
            if(ends[7]>=biggest155228){
              biggest155228=ends[7];
            }
            if(ends[8]>=biggest155228){
              biggest155228=ends[8];
            }
            if(ends[9]>=biggest155228){
              biggest155228=ends[9];
            }
            if(ends[10]>=biggest155228){
              biggest155228=ends[10];
            }
            if(biggest155228 == 1){
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            if(biggest155228 == 2){
              ends[6]=2;
              tdone[6]=1;
            }
            //FINXME code
            if(biggest155228 == 0){
              S4084=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread155212(int [] tdone, int [] ends){
        switch(S3717){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\capperController.sysj line: 63, column: 11
        currsigs.addElement(cylPos5ZaxisExtend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread155210(int [] tdone, int [] ends){
        S4084=1;
    S3747=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread155209(int [] tdone, int [] ends){
        S3717=1;
    cylPos5ZaxisExtend.setPresent();//sysj\capperController.sysj line: 63, column: 11
    currsigs.addElement(cylPos5ZaxisExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread155208(int [] tdone, int [] ends){
        switch(S28492){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3670){
          case 0 : 
            if(modeA_1.getprestatus()){//sysj\capperController.sysj line: 48, column: 12
              System.out.println("Auto Mode selected");//sysj\capperController.sysj line: 49, column: 6
              S3670=1;
              S3672=0;
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
              S3670=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S3672){
                case 0 : 
                  if(bottleAtPos4.getprestatus()){//sysj\capperController.sysj line: 53, column: 15
                    System.out.println("bottleAtPos444");//sysj\capperController.sysj line: 54, column: 9
                    S3672=1;
                    __start_thread_4 = com.systemj.Timer.getMs();//sysj\capperController.sysj line: 50, column: 18
                    S3674=0;
                    if(com.systemj.Timer.getMs() - __start_thread_4 >= (1) * 1000){//sysj\capperController.sysj line: 50, column: 18
                      ends[4]=2;
                      ;//sysj\capperController.sysj line: 50, column: 18
                      S3672=2;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S3674=1;
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
                  switch(S3674){
                    case 0 : 
                      S3674=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= (1) * 1000){//sysj\capperController.sysj line: 50, column: 18
                        ends[4]=2;
                        ;//sysj\capperController.sysj line: 50, column: 18
                        S3672=2;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S3674=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      S3674=1;
                      S3674=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= (1) * 1000){//sysj\capperController.sysj line: 50, column: 18
                        ends[4]=2;
                        ;//sysj\capperController.sysj line: 50, column: 18
                        S3672=2;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S3674=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                  break;
                
                case 2 : 
                  if(gripperZAxisLifted.getprestatus()){//sysj\capperController.sysj line: 56, column: 15
                    S3672=3;
                    gripperTurnRetract.setPresent();//sysj\capperController.sysj line: 60, column: 10
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
                
                case 3 : 
                  if(gripperTurnHomePos.getprestatus()){//sysj\capperController.sysj line: 59, column: 15
                    S3672=4;
                    thread155209(tdone,ends);
                    thread155210(tdone,ends);
                    int biggest155211 = 0;
                    if(ends[5]>=biggest155211){
                      biggest155211=ends[5];
                    }
                    if(ends[6]>=biggest155211){
                      biggest155211=ends[6];
                    }
                    if(biggest155211 == 1){
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    gripperTurnRetract.setPresent();//sysj\capperController.sysj line: 60, column: 10
                    currsigs.addElement(gripperTurnRetract);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  break;
                
                case 4 : 
                  thread155212(tdone,ends);
                  thread155213(tdone,ends);
                  int biggest155229 = 0;
                  if(ends[5]>=biggest155229){
                    biggest155229=ends[5];
                  }
                  if(ends[6]>=biggest155229){
                    biggest155229=ends[6];
                  }
                  if(biggest155229 == 1){
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  if(biggest155229 == 2){
                    ends[4]=2;
                    ;//sysj\capperController.sysj line: 62, column: 9
                    S3672=5;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  //FINXME code
                  if(biggest155229 == 0){
                    S3672=5;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  break;
                
                case 5 : 
                  if(gripperZAxisLifted.getprestatus()){//sysj\capperController.sysj line: 92, column: 15
                    S3672=6;
                    bottleDonePos4.setPresent();//sysj\capperController.sysj line: 97, column: 10
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
                
                case 6 : 
                  if(bottleAtPos4.getprestatus()){//sysj\capperController.sysj line: 95, column: 15
                    S3672=7;
                    __start_thread_4 = com.systemj.Timer.getMs();//sysj\capperController.sysj line: 50, column: 18
                    if(com.systemj.Timer.getMs() - __start_thread_4 >= (1) * 1000){//sysj\capperController.sysj line: 50, column: 18
                      ends[4]=2;
                      ;//sysj\capperController.sysj line: 50, column: 18
                      S3672=0;
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
                  else {
                    bottleDonePos4.setPresent();//sysj\capperController.sysj line: 97, column: 10
                    currsigs.addElement(bottleDonePos4);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  break;
                
                case 7 : 
                  if(com.systemj.Timer.getMs() - __start_thread_4 >= (1) * 1000){//sysj\capperController.sysj line: 50, column: 18
                    ends[4]=2;
                    ;//sysj\capperController.sysj line: 50, column: 18
                    S3672=0;
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
            break;
          
        }
        break;
      
    }
  }

  public void thread155207(int [] tdone, int [] ends){
        switch(S28896){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread155208(tdone,ends);
        thread155230(tdone,ends);
        int biggest155245 = 0;
        if(ends[4]>=biggest155245){
          biggest155245=ends[4];
        }
        if(ends[11]>=biggest155245){
          biggest155245=ends[11];
        }
        if(biggest155245 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest155245 == 0){
          S28896=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread155206(int [] tdone, int [] ends){
        switch(S3668){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3642){
          case 0 : 
            if(mode.getprestatus()){//sysj\capperController.sysj line: 33, column: 12
              S3642=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\capperController.sysj line: 34, column: 10
                modeA_1.setPresent();//sysj\capperController.sysj line: 35, column: 7
                currsigs.addElement(modeA_1);
                S3642=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\capperController.sysj line: 36, column: 17
                  modeM_1.setPresent();//sysj\capperController.sysj line: 37, column: 7
                  currsigs.addElement(modeM_1);
                  S3642=0;
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
            S3642=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread155203(int [] tdone, int [] ends){
        S28894=1;
    S28592=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread155202(int [] tdone, int [] ends){
        S28492=1;
    S3670=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread155201(int [] tdone, int [] ends){
        S28896=1;
    thread155202(tdone,ends);
    thread155203(tdone,ends);
    int biggest155204 = 0;
    if(ends[4]>=biggest155204){
      biggest155204=ends[4];
    }
    if(ends[11]>=biggest155204){
      biggest155204=ends[11];
    }
    if(biggest155204 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread155200(int [] tdone, int [] ends){
        S3668=1;
    S3642=0;
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
      switch(S155198){
        case 0 : 
          S155198=0;
          break RUN;
        
        case 1 : 
          S155198=2;
          S155198=2;
          modeA_1.setClear();//sysj\capperController.sysj line: 23, column: 3
          modeM_1.setClear();//sysj\capperController.sysj line: 24, column: 3
          modeA_1.setPresent();//sysj\capperController.sysj line: 26, column: 3
          currsigs.addElement(modeA_1);
          thread155200(tdone,ends);
          thread155201(tdone,ends);
          int biggest155205 = 0;
          if(ends[2]>=biggest155205){
            biggest155205=ends[2];
          }
          if(ends[3]>=biggest155205){
            biggest155205=ends[3];
          }
          if(biggest155205 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          modeA_1.setClear();//sysj\capperController.sysj line: 23, column: 3
          modeM_1.setClear();//sysj\capperController.sysj line: 24, column: 3
          thread155206(tdone,ends);
          thread155207(tdone,ends);
          int biggest155246 = 0;
          if(ends[2]>=biggest155246){
            biggest155246=ends[2];
          }
          if(ends[3]>=biggest155246){
            biggest155246=ends[3];
          }
          if(biggest155246 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest155246 == 0){
            thread155247(tdone,ends);
            thread155248(tdone,ends);
            int biggest155252 = 0;
            if(ends[2]>=biggest155252){
              biggest155252=ends[2];
            }
            if(ends[3]>=biggest155252){
              biggest155252=ends[3];
            }
            if(biggest155252 == 1){
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
