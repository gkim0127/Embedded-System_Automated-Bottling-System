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
  private int S3063 = 1;
  private int S2447 = 1;
  private int S2065 = 1;
  private int S2067 = 1;
  private int S2834 = 1;
  private int S2452 = 1;
  private int S3011 = 1;
  private int S2841 = 1;
  private int S3061 = 1;
  private int S3019 = 1;
  private int S3027 = 1;
  private int S3035 = 1;
  private int S3043 = 1;
  private int S3051 = 1;
  private int S3059 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread3086(int [] tdone, int [] ends){
        switch(S3059){
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

  public void thread3085(int [] tdone, int [] ends){
        switch(S3051){
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

  public void thread3084(int [] tdone, int [] ends){
        switch(S3043){
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

  public void thread3083(int [] tdone, int [] ends){
        switch(S3035){
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

  public void thread3082(int [] tdone, int [] ends){
        switch(S3027){
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

  public void thread3081(int [] tdone, int [] ends){
        switch(S3019){
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

  public void thread3080(int [] tdone, int [] ends){
        switch(S3061){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread3081(tdone,ends);
        thread3082(tdone,ends);
        thread3083(tdone,ends);
        thread3084(tdone,ends);
        thread3085(tdone,ends);
        thread3086(tdone,ends);
        int biggest3087 = 0;
        if(ends[6]>=biggest3087){
          biggest3087=ends[6];
        }
        if(ends[7]>=biggest3087){
          biggest3087=ends[7];
        }
        if(ends[8]>=biggest3087){
          biggest3087=ends[8];
        }
        if(ends[9]>=biggest3087){
          biggest3087=ends[9];
        }
        if(ends[10]>=biggest3087){
          biggest3087=ends[10];
        }
        if(ends[11]>=biggest3087){
          biggest3087=ends[11];
        }
        if(biggest3087 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest3087 == 0){
          S3061=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread3079(int [] tdone, int [] ends){
        switch(S3011){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2841){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\CapLoaderPlant.sysj line: 54, column: 11
              System.out.println("Vaccum: !vacOn aborted");//sysj\CapLoaderPlant.sysj line: 57, column: 5
              S2841=1;
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
            S2841=1;
            S2841=2;
            __start_thread_4 = com.systemj.Timer.getMs();//sysj\CapLoaderPlant.sysj line: 52, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 52, column: 3
              ends[4]=2;
              ;//sysj\CapLoaderPlant.sysj line: 52, column: 3
              S2841=0;
              if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\CapLoaderPlant.sysj line: 53, column: 12
                WPgripped.setPresent();//sysj\CapLoaderPlant.sysj line: 55, column: 6
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S2841=1;
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
              S2841=0;
              if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\CapLoaderPlant.sysj line: 53, column: 12
                WPgripped.setPresent();//sysj\CapLoaderPlant.sysj line: 55, column: 6
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S2841=1;
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

  public void thread3078(int [] tdone, int [] ends){
        switch(S2834){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2452){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\CapLoaderPlant.sysj line: 35, column: 10
              System.out.println("Pusher: pusherExtend aborted");//sysj\CapLoaderPlant.sysj line: 38, column: 4
              S2452=1;
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
            S2452=1;
            S2452=2;
            __start_thread_3 = com.systemj.Timer.getMs();//sysj\CapLoaderPlant.sysj line: 34, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 34, column: 3
              ends[3]=2;
              ;//sysj\CapLoaderPlant.sysj line: 34, column: 3
              S2452=3;
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
              S2452=3;
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
              S2452=4;
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
            S2452=4;
            S2452=5;
            __start_thread_3 = com.systemj.Timer.getMs();//sysj\CapLoaderPlant.sysj line: 34, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 34, column: 3
              ends[3]=2;
              ;//sysj\CapLoaderPlant.sysj line: 34, column: 3
              S2452=0;
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
              S2452=0;
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

  public void thread3077(int [] tdone, int [] ends){
        switch(S2447){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2065){
          case 0 : 
            if(armSource.getprestatus()){//sysj\CapLoaderPlant.sysj line: 18, column: 10
              System.out.println("Arm: armSource aborted");//sysj\CapLoaderPlant.sysj line: 21, column: 4
              S2065=1;
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
            S2065=1;
            S2065=2;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\CapLoaderPlant.sysj line: 17, column: 3
            S2067=0;
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 17, column: 3
              ends[2]=2;
              ;//sysj\CapLoaderPlant.sysj line: 17, column: 3
              S2065=3;
              armAtSource.setPresent();//sysj\CapLoaderPlant.sysj line: 25, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2067=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            switch(S2067){
              case 0 : 
                S2067=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 17, column: 3
                  ends[2]=2;
                  ;//sysj\CapLoaderPlant.sysj line: 17, column: 3
                  S2065=3;
                  armAtSource.setPresent();//sysj\CapLoaderPlant.sysj line: 25, column: 5
                  currsigs.addElement(armAtSource);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2067=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S2067=1;
                S2067=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 17, column: 3
                  ends[2]=2;
                  ;//sysj\CapLoaderPlant.sysj line: 17, column: 3
                  S2065=3;
                  armAtSource.setPresent();//sysj\CapLoaderPlant.sysj line: 25, column: 5
                  currsigs.addElement(armAtSource);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2067=1;
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
              S2065=4;
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
            S2065=4;
            S2065=5;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\CapLoaderPlant.sysj line: 17, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\CapLoaderPlant.sysj line: 17, column: 3
              ends[2]=2;
              ;//sysj\CapLoaderPlant.sysj line: 17, column: 3
              S2065=0;
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
              S2065=0;
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

  public void thread3074(int [] tdone, int [] ends){
        S3059=1;
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

  public void thread3073(int [] tdone, int [] ends){
        S3051=1;
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

  public void thread3072(int [] tdone, int [] ends){
        S3043=1;
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

  public void thread3071(int [] tdone, int [] ends){
        S3035=1;
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

  public void thread3070(int [] tdone, int [] ends){
        S3027=1;
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

  public void thread3069(int [] tdone, int [] ends){
        S3019=1;
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

  public void thread3068(int [] tdone, int [] ends){
        S3061=1;
    thread3069(tdone,ends);
    thread3070(tdone,ends);
    thread3071(tdone,ends);
    thread3072(tdone,ends);
    thread3073(tdone,ends);
    thread3074(tdone,ends);
    int biggest3075 = 0;
    if(ends[6]>=biggest3075){
      biggest3075=ends[6];
    }
    if(ends[7]>=biggest3075){
      biggest3075=ends[7];
    }
    if(ends[8]>=biggest3075){
      biggest3075=ends[8];
    }
    if(ends[9]>=biggest3075){
      biggest3075=ends[9];
    }
    if(ends[10]>=biggest3075){
      biggest3075=ends[10];
    }
    if(ends[11]>=biggest3075){
      biggest3075=ends[11];
    }
    if(biggest3075 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread3067(int [] tdone, int [] ends){
        S3011=1;
    S2841=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\CapLoaderPlant.sysj line: 53, column: 12
      WPgripped.setPresent();//sysj\CapLoaderPlant.sysj line: 55, column: 6
      currsigs.addElement(WPgripped);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S2841=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread3066(int [] tdone, int [] ends){
        S2834=1;
    S2452=0;
    pusherRetracted.setPresent();//sysj\CapLoaderPlant.sysj line: 36, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3065(int [] tdone, int [] ends){
        S2447=1;
    S2065=0;
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
      switch(S3063){
        case 0 : 
          S3063=0;
          break RUN;
        
        case 1 : 
          S3063=2;
          S3063=2;
          thread3065(tdone,ends);
          thread3066(tdone,ends);
          thread3067(tdone,ends);
          thread3068(tdone,ends);
          int biggest3076 = 0;
          if(ends[2]>=biggest3076){
            biggest3076=ends[2];
          }
          if(ends[3]>=biggest3076){
            biggest3076=ends[3];
          }
          if(ends[4]>=biggest3076){
            biggest3076=ends[4];
          }
          if(ends[5]>=biggest3076){
            biggest3076=ends[5];
          }
          if(biggest3076 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread3077(tdone,ends);
          thread3078(tdone,ends);
          thread3079(tdone,ends);
          thread3080(tdone,ends);
          int biggest3088 = 0;
          if(ends[2]>=biggest3088){
            biggest3088=ends[2];
          }
          if(ends[3]>=biggest3088){
            biggest3088=ends[3];
          }
          if(ends[4]>=biggest3088){
            biggest3088=ends[4];
          }
          if(ends[5]>=biggest3088){
            biggest3088=ends[5];
          }
          if(biggest3088 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3088 == 0){
            S3063=0;
            active[1]=0;
            ends[1]=0;
            S3063=0;
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
