import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CapLoaderPlant extends ClockDomain{
  public CapLoaderPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal enableCapLoader = new Signal("enableCapLoader", Signal.INPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  public Signal empty = new Signal("empty", Signal.OUTPUT);
  public Signal bottleAtPos3E = new Signal("bottleAtPos3E", Signal.OUTPUT);
  public Signal pusherRetractedE = new Signal("pusherRetractedE", Signal.OUTPUT);
  public Signal pusherExtendedE = new Signal("pusherExtendedE", Signal.OUTPUT);
  public Signal WPgrippedE = new Signal("WPgrippedE", Signal.OUTPUT);
  public Signal armAtSourceE = new Signal("armAtSourceE", Signal.OUTPUT);
  public Signal armAtDestE = new Signal("armAtDestE", Signal.OUTPUT);
  public Signal emptyE = new Signal("emptyE", Signal.OUTPUT);
  private long __start_thread_2;//sysj\CapLoaderPlant.sysj line: 17, column: 3
  private long __start_thread_3;//sysj\CapLoaderPlant.sysj line: 34, column: 3
  private long __start_thread_4;//sysj\CapLoaderPlant.sysj line: 52, column: 3
  private int S3609 = 1;
  private int S2993 = 1;
  private int S2611 = 1;
  private int S2613 = 1;
  private int S3380 = 1;
  private int S2998 = 1;
  private int S3557 = 1;
  private int S3387 = 1;
  private int S3607 = 1;
  private int S3565 = 1;
  private int S3573 = 1;
  private int S3581 = 1;
  private int S3589 = 1;
  private int S3597 = 1;
  private int S3605 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread3632(int [] tdone, int [] ends){
        switch(S3605){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\CapLoaderPlant.sysj line: 76, column: 24
          emptyE.setPresent();//sysj\CapLoaderPlant.sysj line: 76, column: 31
          currsigs.addElement(emptyE);
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

  public void thread3631(int [] tdone, int [] ends){
        switch(S3597){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\CapLoaderPlant.sysj line: 74, column: 24
          armAtDestE.setPresent();//sysj\CapLoaderPlant.sysj line: 74, column: 35
          currsigs.addElement(armAtDestE);
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

  public void thread3630(int [] tdone, int [] ends){
        switch(S3589){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\CapLoaderPlant.sysj line: 72, column: 24
          armAtSourceE.setPresent();//sysj\CapLoaderPlant.sysj line: 72, column: 37
          currsigs.addElement(armAtSourceE);
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

  public void thread3629(int [] tdone, int [] ends){
        switch(S3581){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\CapLoaderPlant.sysj line: 70, column: 24
          WPgrippedE.setPresent();//sysj\CapLoaderPlant.sysj line: 70, column: 35
          currsigs.addElement(WPgrippedE);
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

  public void thread3628(int [] tdone, int [] ends){
        switch(S3573){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\CapLoaderPlant.sysj line: 68, column: 24
          pusherExtendedE.setPresent();//sysj\CapLoaderPlant.sysj line: 68, column: 40
          currsigs.addElement(pusherExtendedE);
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

  public void thread3627(int [] tdone, int [] ends){
        switch(S3565){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\CapLoaderPlant.sysj line: 66, column: 24
          pusherRetractedE.setPresent();//sysj\CapLoaderPlant.sysj line: 66, column: 41
          currsigs.addElement(pusherRetractedE);
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

  public void thread3626(int [] tdone, int [] ends){
        switch(S3607){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread3627(tdone,ends);
        thread3628(tdone,ends);
        thread3629(tdone,ends);
        thread3630(tdone,ends);
        thread3631(tdone,ends);
        thread3632(tdone,ends);
        int biggest3633 = 0;
        if(ends[6]>=biggest3633){
          biggest3633=ends[6];
        }
        if(ends[7]>=biggest3633){
          biggest3633=ends[7];
        }
        if(ends[8]>=biggest3633){
          biggest3633=ends[8];
        }
        if(ends[9]>=biggest3633){
          biggest3633=ends[9];
        }
        if(ends[10]>=biggest3633){
          biggest3633=ends[10];
        }
        if(ends[11]>=biggest3633){
          biggest3633=ends[11];
        }
        if(biggest3633 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest3633 == 0){
          S3607=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread3625(int [] tdone, int [] ends){
        switch(S3557){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3387){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\CapLoaderPlant.sysj line: 54, column: 11
              System.out.println("Vaccum: !vacOn aborted");//sysj\CapLoaderPlant.sysj line: 57, column: 5
              S3387=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              WPgripped.setPresent();//sysj\CapLoaderPlant.sysj line: 55, column: 6
              currsigs.addElement(WPgripped);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S3387=1;
            S3387=2;
            __start_thread_4 = com.systemj.Timer.getMs();//sysj\CapLoaderPlant.sysj line: 52, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 52, column: 3
              ends[4]=2;
              ;//sysj\CapLoaderPlant.sysj line: 52, column: 3
              S3387=0;
              if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\CapLoaderPlant.sysj line: 53, column: 12
                WPgripped.setPresent();//sysj\CapLoaderPlant.sysj line: 55, column: 6
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S3387=1;
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
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 52, column: 3
              ends[4]=2;
              ;//sysj\CapLoaderPlant.sysj line: 52, column: 3
              S3387=0;
              if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\CapLoaderPlant.sysj line: 53, column: 12
                WPgripped.setPresent();//sysj\CapLoaderPlant.sysj line: 55, column: 6
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S3387=1;
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
          
        }
        break;
      
    }
  }

  public void thread3624(int [] tdone, int [] ends){
        switch(S3380){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2998){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\CapLoaderPlant.sysj line: 35, column: 10
              System.out.println("Pusher: pusherExtend aborted");//sysj\CapLoaderPlant.sysj line: 38, column: 4
              S2998=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\CapLoaderPlant.sysj line: 36, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S2998=1;
            S2998=2;
            __start_thread_3 = com.systemj.Timer.getMs();//sysj\CapLoaderPlant.sysj line: 34, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 34, column: 3
              ends[3]=2;
              ;//sysj\CapLoaderPlant.sysj line: 34, column: 3
              S2998=3;
              pusherExtended.setPresent();//sysj\CapLoaderPlant.sysj line: 43, column: 5
              currsigs.addElement(pusherExtended);
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
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 34, column: 3
              ends[3]=2;
              ;//sysj\CapLoaderPlant.sysj line: 34, column: 3
              S2998=3;
              pusherExtended.setPresent();//sysj\CapLoaderPlant.sysj line: 43, column: 5
              currsigs.addElement(pusherExtended);
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
            if(!pusherExtend.getprestatus()){//sysj\CapLoaderPlant.sysj line: 42, column: 10
              System.out.println("Pusher: !pusherExtend aborted");//sysj\CapLoaderPlant.sysj line: 45, column: 4
              S2998=4;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\CapLoaderPlant.sysj line: 43, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 4 : 
            S2998=4;
            S2998=5;
            __start_thread_3 = com.systemj.Timer.getMs();//sysj\CapLoaderPlant.sysj line: 34, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 34, column: 3
              ends[3]=2;
              ;//sysj\CapLoaderPlant.sysj line: 34, column: 3
              S2998=0;
              pusherRetracted.setPresent();//sysj\CapLoaderPlant.sysj line: 36, column: 5
              currsigs.addElement(pusherRetracted);
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
          
          case 5 : 
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 34, column: 3
              ends[3]=2;
              ;//sysj\CapLoaderPlant.sysj line: 34, column: 3
              S2998=0;
              pusherRetracted.setPresent();//sysj\CapLoaderPlant.sysj line: 36, column: 5
              currsigs.addElement(pusherRetracted);
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

  public void thread3623(int [] tdone, int [] ends){
        switch(S2993){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2611){
          case 0 : 
            if(armSource.getprestatus()){//sysj\CapLoaderPlant.sysj line: 18, column: 10
              System.out.println("Arm: armSource aborted");//sysj\CapLoaderPlant.sysj line: 21, column: 4
              S2611=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\CapLoaderPlant.sysj line: 19, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S2611=1;
            S2611=2;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\CapLoaderPlant.sysj line: 17, column: 3
            S2613=0;
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 17, column: 3
              ends[2]=2;
              ;//sysj\CapLoaderPlant.sysj line: 17, column: 3
              S2611=3;
              armAtSource.setPresent();//sysj\CapLoaderPlant.sysj line: 25, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2613=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            switch(S2613){
              case 0 : 
                S2613=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 17, column: 3
                  ends[2]=2;
                  ;//sysj\CapLoaderPlant.sysj line: 17, column: 3
                  S2611=3;
                  armAtSource.setPresent();//sysj\CapLoaderPlant.sysj line: 25, column: 5
                  currsigs.addElement(armAtSource);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2613=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S2613=1;
                S2613=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 17, column: 3
                  ends[2]=2;
                  ;//sysj\CapLoaderPlant.sysj line: 17, column: 3
                  S2611=3;
                  armAtSource.setPresent();//sysj\CapLoaderPlant.sysj line: 25, column: 5
                  currsigs.addElement(armAtSource);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2613=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 3 : 
            if(armDest.getprestatus()){//sysj\CapLoaderPlant.sysj line: 24, column: 10
              System.out.println("Arm: armDest aborted");//sysj\CapLoaderPlant.sysj line: 27, column: 4
              S2611=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\CapLoaderPlant.sysj line: 25, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            S2611=4;
            S2611=5;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\CapLoaderPlant.sysj line: 17, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 17, column: 3
              ends[2]=2;
              ;//sysj\CapLoaderPlant.sysj line: 17, column: 3
              S2611=0;
              armAtDest.setPresent();//sysj\CapLoaderPlant.sysj line: 19, column: 5
              currsigs.addElement(armAtDest);
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
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 17, column: 3
              ends[2]=2;
              ;//sysj\CapLoaderPlant.sysj line: 17, column: 3
              S2611=0;
              armAtDest.setPresent();//sysj\CapLoaderPlant.sysj line: 19, column: 5
              currsigs.addElement(armAtDest);
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
          
        }
        break;
      
    }
  }

  public void thread3620(int [] tdone, int [] ends){
        S3605=1;
    if(empty.getprestatus()){//sysj\CapLoaderPlant.sysj line: 76, column: 24
      emptyE.setPresent();//sysj\CapLoaderPlant.sysj line: 76, column: 31
      currsigs.addElement(emptyE);
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

  public void thread3619(int [] tdone, int [] ends){
        S3597=1;
    if(armAtDest.getprestatus()){//sysj\CapLoaderPlant.sysj line: 74, column: 24
      armAtDestE.setPresent();//sysj\CapLoaderPlant.sysj line: 74, column: 35
      currsigs.addElement(armAtDestE);
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

  public void thread3618(int [] tdone, int [] ends){
        S3589=1;
    if(armAtSource.getprestatus()){//sysj\CapLoaderPlant.sysj line: 72, column: 24
      armAtSourceE.setPresent();//sysj\CapLoaderPlant.sysj line: 72, column: 37
      currsigs.addElement(armAtSourceE);
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

  public void thread3617(int [] tdone, int [] ends){
        S3581=1;
    if(WPgripped.getprestatus()){//sysj\CapLoaderPlant.sysj line: 70, column: 24
      WPgrippedE.setPresent();//sysj\CapLoaderPlant.sysj line: 70, column: 35
      currsigs.addElement(WPgrippedE);
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

  public void thread3616(int [] tdone, int [] ends){
        S3573=1;
    if(pusherExtended.getprestatus()){//sysj\CapLoaderPlant.sysj line: 68, column: 24
      pusherExtendedE.setPresent();//sysj\CapLoaderPlant.sysj line: 68, column: 40
      currsigs.addElement(pusherExtendedE);
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

  public void thread3615(int [] tdone, int [] ends){
        S3565=1;
    if(pusherRetracted.getprestatus()){//sysj\CapLoaderPlant.sysj line: 66, column: 24
      pusherRetractedE.setPresent();//sysj\CapLoaderPlant.sysj line: 66, column: 41
      currsigs.addElement(pusherRetractedE);
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

  public void thread3614(int [] tdone, int [] ends){
        S3607=1;
    thread3615(tdone,ends);
    thread3616(tdone,ends);
    thread3617(tdone,ends);
    thread3618(tdone,ends);
    thread3619(tdone,ends);
    thread3620(tdone,ends);
    int biggest3621 = 0;
    if(ends[6]>=biggest3621){
      biggest3621=ends[6];
    }
    if(ends[7]>=biggest3621){
      biggest3621=ends[7];
    }
    if(ends[8]>=biggest3621){
      biggest3621=ends[8];
    }
    if(ends[9]>=biggest3621){
      biggest3621=ends[9];
    }
    if(ends[10]>=biggest3621){
      biggest3621=ends[10];
    }
    if(ends[11]>=biggest3621){
      biggest3621=ends[11];
    }
    if(biggest3621 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread3613(int [] tdone, int [] ends){
        S3557=1;
    S3387=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\CapLoaderPlant.sysj line: 53, column: 12
      WPgripped.setPresent();//sysj\CapLoaderPlant.sysj line: 55, column: 6
      currsigs.addElement(WPgripped);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S3387=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread3612(int [] tdone, int [] ends){
        S3380=1;
    S2998=0;
    pusherRetracted.setPresent();//sysj\CapLoaderPlant.sysj line: 36, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3611(int [] tdone, int [] ends){
        S2993=1;
    S2611=0;
    armAtDest.setPresent();//sysj\CapLoaderPlant.sysj line: 19, column: 5
    currsigs.addElement(armAtDest);
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
      switch(S3609){
        case 0 : 
          S3609=0;
          break RUN;
        
        case 1 : 
          S3609=2;
          S3609=2;
          thread3611(tdone,ends);
          thread3612(tdone,ends);
          thread3613(tdone,ends);
          thread3614(tdone,ends);
          int biggest3622 = 0;
          if(ends[2]>=biggest3622){
            biggest3622=ends[2];
          }
          if(ends[3]>=biggest3622){
            biggest3622=ends[3];
          }
          if(ends[4]>=biggest3622){
            biggest3622=ends[4];
          }
          if(ends[5]>=biggest3622){
            biggest3622=ends[5];
          }
          if(biggest3622 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread3623(tdone,ends);
          thread3624(tdone,ends);
          thread3625(tdone,ends);
          thread3626(tdone,ends);
          int biggest3634 = 0;
          if(ends[2]>=biggest3634){
            biggest3634=ends[2];
          }
          if(ends[3]>=biggest3634){
            biggest3634=ends[3];
          }
          if(ends[4]>=biggest3634){
            biggest3634=ends[4];
          }
          if(ends[5]>=biggest3634){
            biggest3634=ends[5];
          }
          if(biggest3634 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3634 == 0){
            S3609=0;
            active[1]=0;
            ends[1]=0;
            S3609=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          pusherExtend.gethook();
          vacOn.gethook();
          armSource.gethook();
          armDest.gethook();
          enable.gethook();
          refill.gethook();
          enableCapLoader.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      enableCapLoader.setpreclear();
      bottleAtPos3.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      bottleAtPos3E.setpreclear();
      pusherRetractedE.setpreclear();
      pusherExtendedE.setpreclear();
      WPgrippedE.setpreclear();
      armAtSourceE.setpreclear();
      armAtDestE.setpreclear();
      emptyE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherExtend.getStatus() ? pusherExtend.setprepresent() : pusherExtend.setpreclear();
      pusherExtend.setpreval(pusherExtend.getValue());
      pusherExtend.setClear();
      dummyint = vacOn.getStatus() ? vacOn.setprepresent() : vacOn.setpreclear();
      vacOn.setpreval(vacOn.getValue());
      vacOn.setClear();
      dummyint = armSource.getStatus() ? armSource.setprepresent() : armSource.setpreclear();
      armSource.setpreval(armSource.getValue());
      armSource.setClear();
      dummyint = armDest.getStatus() ? armDest.setprepresent() : armDest.setpreclear();
      armDest.setpreval(armDest.getValue());
      armDest.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      dummyint = enableCapLoader.getStatus() ? enableCapLoader.setprepresent() : enableCapLoader.setpreclear();
      enableCapLoader.setpreval(enableCapLoader.getValue());
      enableCapLoader.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
      pusherRetracted.sethook();
      pusherRetracted.setClear();
      pusherExtended.sethook();
      pusherExtended.setClear();
      WPgripped.sethook();
      WPgripped.setClear();
      armAtSource.sethook();
      armAtSource.setClear();
      armAtDest.sethook();
      armAtDest.setClear();
      empty.sethook();
      empty.setClear();
      bottleAtPos3E.sethook();
      bottleAtPos3E.setClear();
      pusherRetractedE.sethook();
      pusherRetractedE.setClear();
      pusherExtendedE.sethook();
      pusherExtendedE.setClear();
      WPgrippedE.sethook();
      WPgrippedE.setClear();
      armAtSourceE.sethook();
      armAtSourceE.setClear();
      armAtDestE.sethook();
      armAtDestE.setClear();
      emptyE.sethook();
      emptyE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        enable.gethook();
        refill.gethook();
        enableCapLoader.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
