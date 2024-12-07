import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CapLoaderController extends ClockDomain{
  public CapLoaderController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.INPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal bottleDonePos4 = new Signal("bottleDonePos4", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal bottleAtPos4Capper = new Signal("bottleAtPos4Capper", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  public Signal bottleDonePos3 = new Signal("bottleDonePos3", Signal.OUTPUT);
  private Signal auto_1;
  private Signal manual_1;
  private int S2035 = 1;
  private int S1745 = 1;
  private int S1490 = 1;
  private int S1513 = 1;
  private int S1522 = 1;
  private int S1515 = 1;
  private int S1759 = 1;
  private int S1749 = 1;
  private int S2033 = 1;
  private int S1827 = 1;
  private int S1768 = 1;
  private int S1776 = 1;
  private int S1784 = 1;
  private int S1792 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread2058(int [] tdone, int [] ends){
        switch(S1792){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\CapLoaderController.sysj line: 73, column: 19
          armDest.setPresent();//sysj\CapLoaderController.sysj line: 73, column: 29
          currsigs.addElement(armDest);
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

  public void thread2057(int [] tdone, int [] ends){
        switch(S1784){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(armSourceM.getprestatus()){//sysj\CapLoaderController.sysj line: 71, column: 19
          armSource.setPresent();//sysj\CapLoaderController.sysj line: 71, column: 31
          currsigs.addElement(armSource);
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

  public void thread2056(int [] tdone, int [] ends){
        switch(S1776){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\CapLoaderController.sysj line: 69, column: 19
          vacOn.setPresent();//sysj\CapLoaderController.sysj line: 69, column: 27
          currsigs.addElement(vacOn);
          bottleDonePos3.setPresent();//sysj\CapLoaderController.sysj line: 69, column: 40
          currsigs.addElement(bottleDonePos3);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          bottleDonePos3.setPresent();//sysj\CapLoaderController.sysj line: 69, column: 40
          currsigs.addElement(bottleDonePos3);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread2055(int [] tdone, int [] ends){
        switch(S1768){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\CapLoaderController.sysj line: 67, column: 19
          pusherExtend.setPresent();//sysj\CapLoaderController.sysj line: 67, column: 34
          currsigs.addElement(pusherExtend);
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

  public void thread2053(int [] tdone, int [] ends){
        S1792=1;
    if(armDestM.getprestatus()){//sysj\CapLoaderController.sysj line: 73, column: 19
      armDest.setPresent();//sysj\CapLoaderController.sysj line: 73, column: 29
      currsigs.addElement(armDest);
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

  public void thread2052(int [] tdone, int [] ends){
        S1784=1;
    if(armSourceM.getprestatus()){//sysj\CapLoaderController.sysj line: 71, column: 19
      armSource.setPresent();//sysj\CapLoaderController.sysj line: 71, column: 31
      currsigs.addElement(armSource);
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

  public void thread2051(int [] tdone, int [] ends){
        S1776=1;
    if(vacOnM.getprestatus()){//sysj\CapLoaderController.sysj line: 69, column: 19
      vacOn.setPresent();//sysj\CapLoaderController.sysj line: 69, column: 27
      currsigs.addElement(vacOn);
      bottleDonePos3.setPresent();//sysj\CapLoaderController.sysj line: 69, column: 40
      currsigs.addElement(bottleDonePos3);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      bottleDonePos3.setPresent();//sysj\CapLoaderController.sysj line: 69, column: 40
      currsigs.addElement(bottleDonePos3);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread2050(int [] tdone, int [] ends){
        S1768=1;
    if(pusherExtendM.getprestatus()){//sysj\CapLoaderController.sysj line: 67, column: 19
      pusherExtend.setPresent();//sysj\CapLoaderController.sysj line: 67, column: 34
      currsigs.addElement(pusherExtend);
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

  public void thread2049(int [] tdone, int [] ends){
        switch(S2033){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S1827){
          case 0 : 
            if(manual_1.getprestatus()){//sysj\CapLoaderController.sysj line: 64, column: 10
              S1827=1;
              thread2050(tdone,ends);
              thread2051(tdone,ends);
              thread2052(tdone,ends);
              thread2053(tdone,ends);
              int biggest2054 = 0;
              if(ends[7]>=biggest2054){
                biggest2054=ends[7];
              }
              if(ends[8]>=biggest2054){
                biggest2054=ends[8];
              }
              if(ends[9]>=biggest2054){
                biggest2054=ends[9];
              }
              if(ends[10]>=biggest2054){
                biggest2054=ends[10];
              }
              if(biggest2054 == 1){
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
            if(auto_1.getprestatus()){//sysj\CapLoaderController.sysj line: 65, column: 10
              S1827=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              thread2055(tdone,ends);
              thread2056(tdone,ends);
              thread2057(tdone,ends);
              thread2058(tdone,ends);
              int biggest2059 = 0;
              if(ends[7]>=biggest2059){
                biggest2059=ends[7];
              }
              if(ends[8]>=biggest2059){
                biggest2059=ends[8];
              }
              if(ends[9]>=biggest2059){
                biggest2059=ends[9];
              }
              if(ends[10]>=biggest2059){
                biggest2059=ends[10];
              }
              if(biggest2059 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              //FINXME code
              if(biggest2059 == 0){
                S1827=0;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2048(int [] tdone, int [] ends){
        switch(S1759){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1749){
          case 0 : 
            if(mode.getprestatus()){//sysj\CapLoaderController.sysj line: 51, column: 10
              S1749=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\CapLoaderController.sysj line: 52, column: 7
                manual_1.setPresent();//sysj\CapLoaderController.sysj line: 53, column: 5
                currsigs.addElement(manual_1);
                S1749=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                auto_1.setPresent();//sysj\CapLoaderController.sysj line: 56, column: 5
                currsigs.addElement(auto_1);
                S1749=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S1749=0;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
          case 2 : 
            S1749=2;
            S1749=0;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2046(int [] tdone, int [] ends){
        switch(S1522){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1515){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\CapLoaderController.sysj line: 33, column: 13
              System.out.println("WPgripped");//sysj\CapLoaderController.sysj line: 34, column: 6
              S1515=1;
              armDest.setPresent();//sysj\CapLoaderController.sysj line: 35, column: 6
              currsigs.addElement(armDest);
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
            armDest.setPresent();//sysj\CapLoaderController.sysj line: 35, column: 6
            currsigs.addElement(armDest);
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2045(int [] tdone, int [] ends){
        switch(S1513){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\CapLoaderController.sysj line: 31, column: 6
        currsigs.addElement(vacOn);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread2043(int [] tdone, int [] ends){
        S1522=1;
    S1515=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2042(int [] tdone, int [] ends){
        S1513=1;
    vacOn.setPresent();//sysj\CapLoaderController.sysj line: 31, column: 6
    currsigs.addElement(vacOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2041(int [] tdone, int [] ends){
        switch(S1745){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(manual_1.getprestatus()){//sysj\CapLoaderController.sysj line: 12, column: 9
          System.out.println("Waiting for bottleAtPos3 from Rotary TurnTable");//sysj\CapLoaderController.sysj line: 13, column: 4
          S1490=0;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
          switch(S1490){
            case 0 : 
              if(bottleAtPos3.getprestatus()){//sysj\CapLoaderController.sysj line: 14, column: 10
                System.out.println("bottleAtPos3 detected");//sysj\CapLoaderController.sysj line: 15, column: 4
                S1490=1;
                pusherExtend.setPresent();//sysj\CapLoaderController.sysj line: 18, column: 5
                currsigs.addElement(pusherExtend);
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
            
            case 1 : 
              if(pusherExtended.getprestatus()){//sysj\CapLoaderController.sysj line: 17, column: 10
                S1490=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                pusherExtend.setPresent();//sysj\CapLoaderController.sysj line: 18, column: 5
                currsigs.addElement(pusherExtend);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              break;
            
            case 2 : 
              S1490=2;
              System.out.println("Waiting for pusherRetracted signal");//sysj\CapLoaderController.sysj line: 22, column: 4
              S1490=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
              break;
            
            case 3 : 
              if(pusherRetracted.getprestatus()){//sysj\CapLoaderController.sysj line: 23, column: 10
                S1490=4;
                armSource.setPresent();//sysj\CapLoaderController.sysj line: 26, column: 5
                currsigs.addElement(armSource);
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
              if(armAtSource.getprestatus()){//sysj\CapLoaderController.sysj line: 25, column: 10
                System.out.println("armAtSource detected, aborted");//sysj\CapLoaderController.sysj line: 28, column: 4
                S1490=5;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                armSource.setPresent();//sysj\CapLoaderController.sysj line: 26, column: 5
                currsigs.addElement(armSource);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              break;
            
            case 5 : 
              S1490=5;
              S1490=6;
              thread2042(tdone,ends);
              thread2043(tdone,ends);
              int biggest2044 = 0;
              if(ends[3]>=biggest2044){
                biggest2044=ends[3];
              }
              if(ends[4]>=biggest2044){
                biggest2044=ends[4];
              }
              if(biggest2044 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              break;
            
            case 6 : 
              if(armAtDest.getprestatus()){//sysj\CapLoaderController.sysj line: 30, column: 10
                System.out.println("armAtDest");//sysj\CapLoaderController.sysj line: 37, column: 4
                System.out.println("Process Complete, emit bottleDonePos3");//sysj\CapLoaderController.sysj line: 38, column: 4
                S1490=7;
                bottleDonePos3.setPresent();//sysj\CapLoaderController.sysj line: 41, column: 5
                currsigs.addElement(bottleDonePos3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                thread2045(tdone,ends);
                thread2046(tdone,ends);
                int biggest2047 = 0;
                if(ends[3]>=biggest2047){
                  biggest2047=ends[3];
                }
                if(ends[4]>=biggest2047){
                  biggest2047=ends[4];
                }
                if(biggest2047 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                //FINXME code
                if(biggest2047 == 0){
                  System.out.println("armAtDest");//sysj\CapLoaderController.sysj line: 37, column: 4
                  System.out.println("Process Complete, emit bottleDonePos3");//sysj\CapLoaderController.sysj line: 38, column: 4
                  S1490=7;
                  bottleDonePos3.setPresent();//sysj\CapLoaderController.sysj line: 41, column: 5
                  currsigs.addElement(bottleDonePos3);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              break;
            
            case 7 : 
              if(bottleAtPos4Capper.getprestatus()){//sysj\CapLoaderController.sysj line: 40, column: 10
                S1490=8;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                bottleDonePos3.setPresent();//sysj\CapLoaderController.sysj line: 41, column: 5
                currsigs.addElement(bottleDonePos3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              break;
            
            case 8 : 
              S1490=8;
              System.out.println("Waiting for bottleAtPos3 from Rotary TurnTable");//sysj\CapLoaderController.sysj line: 13, column: 4
              S1490=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread2039(int [] tdone, int [] ends){
        S2033=1;
    S1827=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2038(int [] tdone, int [] ends){
        S1759=1;
    S1749=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2037(int [] tdone, int [] ends){
        S1745=1;
    System.out.println("Waiting for bottleAtPos3 from Rotary TurnTable");//sysj\CapLoaderController.sysj line: 13, column: 4
    S1490=0;
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
      switch(S2035){
        case 0 : 
          S2035=0;
          break RUN;
        
        case 1 : 
          S2035=2;
          S2035=2;
          auto_1.setClear();//sysj\CapLoaderController.sysj line: 10, column: 2
          manual_1.setClear();//sysj\CapLoaderController.sysj line: 10, column: 2
          thread2037(tdone,ends);
          thread2038(tdone,ends);
          thread2039(tdone,ends);
          int biggest2040 = 0;
          if(ends[2]>=biggest2040){
            biggest2040=ends[2];
          }
          if(ends[5]>=biggest2040){
            biggest2040=ends[5];
          }
          if(ends[6]>=biggest2040){
            biggest2040=ends[6];
          }
          if(biggest2040 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          auto_1.setClear();//sysj\CapLoaderController.sysj line: 10, column: 2
          manual_1.setClear();//sysj\CapLoaderController.sysj line: 10, column: 2
          thread2041(tdone,ends);
          thread2048(tdone,ends);
          thread2049(tdone,ends);
          int biggest2060 = 0;
          if(ends[2]>=biggest2060){
            biggest2060=ends[2];
          }
          if(ends[5]>=biggest2060){
            biggest2060=ends[5];
          }
          if(ends[6]>=biggest2060){
            biggest2060=ends[6];
          }
          if(biggest2060 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2060 == 0){
            S2035=0;
            active[1]=0;
            ends[1]=0;
            S2035=0;
            break RUN;
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
          bottleAtPos3.gethook();
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          bottleDonePos4.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          bottleAtPos4Capper.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos3.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      bottleDonePos4.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      bottleAtPos4Capper.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      bottleDonePos3.setpreclear();
      auto_1.setpreclear();
      manual_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos3.getStatus() ? bottleAtPos3.setprepresent() : bottleAtPos3.setpreclear();
      bottleAtPos3.setpreval(bottleAtPos3.getValue());
      bottleAtPos3.setClear();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = bottleDonePos4.getStatus() ? bottleDonePos4.setprepresent() : bottleDonePos4.setpreclear();
      bottleDonePos4.setpreval(bottleDonePos4.getValue());
      bottleDonePos4.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      dummyint = bottleAtPos4Capper.getStatus() ? bottleAtPos4Capper.setprepresent() : bottleAtPos4Capper.setpreclear();
      bottleAtPos4Capper.setpreval(bottleAtPos4Capper.getValue());
      bottleAtPos4Capper.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      bottleDonePos3.sethook();
      bottleDonePos3.setClear();
      auto_1.setClear();
      manual_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos3.gethook();
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        bottleDonePos4.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
        bottleAtPos4Capper.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
