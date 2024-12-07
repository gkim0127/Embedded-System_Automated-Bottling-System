import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class MainController extends ClockDomain{
  public MainController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal LiquidAmount1 = new Signal("LiquidAmount1", Signal.INPUT);
  public Signal LiquidAmount2 = new Signal("LiquidAmount2", Signal.INPUT);
  public Signal LiquidAmount3 = new Signal("LiquidAmount3", Signal.INPUT);
  public Signal LiquidAmount4 = new Signal("LiquidAmount4", Signal.INPUT);
  public Signal BottleQuantity = new Signal("BottleQuantity", Signal.INPUT);
  public Signal LiquidAmount1E = new Signal("LiquidAmount1E", Signal.OUTPUT);
  public Signal LiquidAmount2E = new Signal("LiquidAmount2E", Signal.OUTPUT);
  public Signal LiquidAmount3E = new Signal("LiquidAmount3E", Signal.OUTPUT);
  public Signal LiquidAmount4E = new Signal("LiquidAmount4E", Signal.OUTPUT);
  public Signal BottleQuantityE = new Signal("BottleQuantityE", Signal.OUTPUT);
  private Signal allValid_1;
  private long __start_thread_2;//sysj\MainController.sysj line: 12, column: 2
  private long __start_thread_3;//sysj\MainController.sysj line: 26, column: 111
  private int S57780 = 1;
  private int S57669 = 1;
  private int S57637 = 1;
  private int S57624 = 1;
  private int S57767 = 1;
  private int S57701 = 1;
  private int S57700 = 1;
  private int S57778 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread57788(int [] tdone, int [] ends){
        switch(S57778){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        LiquidAmount1E.setPresent();//sysj\MainController.sysj line: 41, column: 5
        currsigs.addElement(LiquidAmount1E);
        LiquidAmount1E.setValue((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()));//sysj\MainController.sysj line: 41, column: 5
        LiquidAmount2E.setPresent();//sysj\MainController.sysj line: 42, column: 5
        currsigs.addElement(LiquidAmount2E);
        LiquidAmount2E.setValue((LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()));//sysj\MainController.sysj line: 42, column: 5
        LiquidAmount3E.setPresent();//sysj\MainController.sysj line: 43, column: 5
        currsigs.addElement(LiquidAmount3E);
        LiquidAmount3E.setValue((LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()));//sysj\MainController.sysj line: 43, column: 5
        LiquidAmount4E.setPresent();//sysj\MainController.sysj line: 44, column: 5
        currsigs.addElement(LiquidAmount4E);
        LiquidAmount4E.setValue((LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue()));//sysj\MainController.sysj line: 44, column: 5
        BottleQuantityE.setPresent();//sysj\MainController.sysj line: 45, column: 5
        currsigs.addElement(BottleQuantityE);
        BottleQuantityE.setValue((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()));//sysj\MainController.sysj line: 45, column: 5
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread57787(int [] tdone, int [] ends){
        switch(S57767){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S57701){
          case 0 : 
            switch(S57700){
              case 0 : 
                if(com.systemj.Timer.getMs() - __start_thread_3 >= (2) * 1000){//sysj\MainController.sysj line: 26, column: 111
                  ends[3]=2;
                  ;//sysj\MainController.sysj line: 26, column: 111
                  System.out.println("Valid Input");//sysj\MainController.sysj line: 28, column: 5
                  S57701=1;
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
              
              case 1 : 
                if(com.systemj.Timer.getMs() - __start_thread_3 >= (2) * 1000){//sysj\MainController.sysj line: 29, column: 11
                  ends[3]=2;
                  ;//sysj\MainController.sysj line: 29, column: 11
                  allValid_1.setPresent();//sysj\MainController.sysj line: 31, column: 5
                  currsigs.addElement(allValid_1);
                  System.out.println("INVALID Input");//sysj\MainController.sysj line: 32, column: 5
                  S57701=1;
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
          
          case 1 : 
            S57701=1;
            S57701=0;
            if((((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()) + (LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()) + (LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()) + (LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue())) == 100) && ((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()) > 0)){//sysj\MainController.sysj line: 26, column: 8
              S57700=0;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\MainController.sysj line: 26, column: 111
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (2) * 1000){//sysj\MainController.sysj line: 26, column: 111
                ends[3]=2;
                ;//sysj\MainController.sysj line: 26, column: 111
                System.out.println("Valid Input");//sysj\MainController.sysj line: 28, column: 5
                S57701=1;
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
              S57700=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\MainController.sysj line: 29, column: 11
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (2) * 1000){//sysj\MainController.sysj line: 29, column: 11
                ends[3]=2;
                ;//sysj\MainController.sysj line: 29, column: 11
                allValid_1.setPresent();//sysj\MainController.sysj line: 31, column: 5
                currsigs.addElement(allValid_1);
                System.out.println("INVALID Input");//sysj\MainController.sysj line: 32, column: 5
                S57701=1;
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
            break;
          
        }
        break;
      
    }
  }

  public void thread57786(int [] tdone, int [] ends){
        switch(S57669){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S57637){
          case 0 : 
            switch(S57624){
              case 0 : 
                S57624=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\MainController.sysj line: 12, column: 2
                  ends[2]=2;
                  ;//sysj\MainController.sysj line: 12, column: 2
                  System.out.println((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()));//sysj\MainController.sysj line: 15, column: 3
                  System.out.println((LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()));//sysj\MainController.sysj line: 16, column: 3
                  System.out.println((LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()));//sysj\MainController.sysj line: 17, column: 3
                  System.out.println((LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue()));//sysj\MainController.sysj line: 18, column: 3
                  System.out.println((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()));//sysj\MainController.sysj line: 19, column: 3
                  System.out.println("");//sysj\MainController.sysj line: 20, column: 3
                  S57637=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S57624=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S57624=1;
                S57624=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\MainController.sysj line: 12, column: 2
                  ends[2]=2;
                  ;//sysj\MainController.sysj line: 12, column: 2
                  System.out.println((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()));//sysj\MainController.sysj line: 15, column: 3
                  System.out.println((LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()));//sysj\MainController.sysj line: 16, column: 3
                  System.out.println((LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()));//sysj\MainController.sysj line: 17, column: 3
                  System.out.println((LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue()));//sysj\MainController.sysj line: 18, column: 3
                  System.out.println((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()));//sysj\MainController.sysj line: 19, column: 3
                  System.out.println("");//sysj\MainController.sysj line: 20, column: 3
                  S57637=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S57624=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S57637=1;
            S57637=0;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\MainController.sysj line: 12, column: 2
            S57624=0;
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\MainController.sysj line: 12, column: 2
              ends[2]=2;
              ;//sysj\MainController.sysj line: 12, column: 2
              System.out.println((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()));//sysj\MainController.sysj line: 15, column: 3
              System.out.println((LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()));//sysj\MainController.sysj line: 16, column: 3
              System.out.println((LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()));//sysj\MainController.sysj line: 17, column: 3
              System.out.println((LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue()));//sysj\MainController.sysj line: 18, column: 3
              System.out.println((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()));//sysj\MainController.sysj line: 19, column: 3
              System.out.println("");//sysj\MainController.sysj line: 20, column: 3
              S57637=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S57624=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57784(int [] tdone, int [] ends){
        S57778=1;
    LiquidAmount1E.setPresent();//sysj\MainController.sysj line: 41, column: 5
    currsigs.addElement(LiquidAmount1E);
    LiquidAmount1E.setValue((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()));//sysj\MainController.sysj line: 41, column: 5
    LiquidAmount2E.setPresent();//sysj\MainController.sysj line: 42, column: 5
    currsigs.addElement(LiquidAmount2E);
    LiquidAmount2E.setValue((LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()));//sysj\MainController.sysj line: 42, column: 5
    LiquidAmount3E.setPresent();//sysj\MainController.sysj line: 43, column: 5
    currsigs.addElement(LiquidAmount3E);
    LiquidAmount3E.setValue((LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()));//sysj\MainController.sysj line: 43, column: 5
    LiquidAmount4E.setPresent();//sysj\MainController.sysj line: 44, column: 5
    currsigs.addElement(LiquidAmount4E);
    LiquidAmount4E.setValue((LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue()));//sysj\MainController.sysj line: 44, column: 5
    BottleQuantityE.setPresent();//sysj\MainController.sysj line: 45, column: 5
    currsigs.addElement(BottleQuantityE);
    BottleQuantityE.setValue((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()));//sysj\MainController.sysj line: 45, column: 5
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread57783(int [] tdone, int [] ends){
        S57767=1;
    S57701=0;
    if((((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()) + (LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()) + (LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()) + (LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue())) == 100) && ((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()) > 0)){//sysj\MainController.sysj line: 26, column: 8
      S57700=0;
      __start_thread_3 = com.systemj.Timer.getMs();//sysj\MainController.sysj line: 26, column: 111
      if(com.systemj.Timer.getMs() - __start_thread_3 >= (2) * 1000){//sysj\MainController.sysj line: 26, column: 111
        ends[3]=2;
        ;//sysj\MainController.sysj line: 26, column: 111
        System.out.println("Valid Input");//sysj\MainController.sysj line: 28, column: 5
        S57701=1;
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
      S57700=1;
      __start_thread_3 = com.systemj.Timer.getMs();//sysj\MainController.sysj line: 29, column: 11
      if(com.systemj.Timer.getMs() - __start_thread_3 >= (2) * 1000){//sysj\MainController.sysj line: 29, column: 11
        ends[3]=2;
        ;//sysj\MainController.sysj line: 29, column: 11
        allValid_1.setPresent();//sysj\MainController.sysj line: 31, column: 5
        currsigs.addElement(allValid_1);
        System.out.println("INVALID Input");//sysj\MainController.sysj line: 32, column: 5
        S57701=1;
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
  }

  public void thread57782(int [] tdone, int [] ends){
        S57669=1;
    S57637=0;
    __start_thread_2 = com.systemj.Timer.getMs();//sysj\MainController.sysj line: 12, column: 2
    S57624=0;
    if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\MainController.sysj line: 12, column: 2
      ends[2]=2;
      ;//sysj\MainController.sysj line: 12, column: 2
      System.out.println((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()));//sysj\MainController.sysj line: 15, column: 3
      System.out.println((LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()));//sysj\MainController.sysj line: 16, column: 3
      System.out.println((LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()));//sysj\MainController.sysj line: 17, column: 3
      System.out.println((LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue()));//sysj\MainController.sysj line: 18, column: 3
      System.out.println((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()));//sysj\MainController.sysj line: 19, column: 3
      System.out.println("");//sysj\MainController.sysj line: 20, column: 3
      S57637=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S57624=1;
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
      switch(S57780){
        case 0 : 
          S57780=0;
          break RUN;
        
        case 1 : 
          S57780=2;
          S57780=2;
          allValid_1.setClear();//sysj\MainController.sysj line: 10, column: 2
          thread57782(tdone,ends);
          thread57783(tdone,ends);
          thread57784(tdone,ends);
          int biggest57785 = 0;
          if(ends[2]>=biggest57785){
            biggest57785=ends[2];
          }
          if(ends[3]>=biggest57785){
            biggest57785=ends[3];
          }
          if(ends[4]>=biggest57785){
            biggest57785=ends[4];
          }
          if(biggest57785 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          allValid_1.setClear();//sysj\MainController.sysj line: 10, column: 2
          thread57786(tdone,ends);
          thread57787(tdone,ends);
          thread57788(tdone,ends);
          int biggest57789 = 0;
          if(ends[2]>=biggest57789){
            biggest57789=ends[2];
          }
          if(ends[3]>=biggest57789){
            biggest57789=ends[3];
          }
          if(ends[4]>=biggest57789){
            biggest57789=ends[4];
          }
          if(biggest57789 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest57789 == 0){
            S57780=0;
            active[1]=0;
            ends[1]=0;
            S57780=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    allValid_1 = new Signal();
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
          LiquidAmount1.gethook();
          LiquidAmount2.gethook();
          LiquidAmount3.gethook();
          LiquidAmount4.gethook();
          BottleQuantity.gethook();
          df = true;
        }
        runClockDomain();
      }
      LiquidAmount1.setpreclear();
      LiquidAmount2.setpreclear();
      LiquidAmount3.setpreclear();
      LiquidAmount4.setpreclear();
      BottleQuantity.setpreclear();
      LiquidAmount1E.setpreclear();
      LiquidAmount2E.setpreclear();
      LiquidAmount3E.setpreclear();
      LiquidAmount4E.setpreclear();
      BottleQuantityE.setpreclear();
      allValid_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = LiquidAmount1.getStatus() ? LiquidAmount1.setprepresent() : LiquidAmount1.setpreclear();
      LiquidAmount1.setpreval(LiquidAmount1.getValue());
      LiquidAmount1.setClear();
      dummyint = LiquidAmount2.getStatus() ? LiquidAmount2.setprepresent() : LiquidAmount2.setpreclear();
      LiquidAmount2.setpreval(LiquidAmount2.getValue());
      LiquidAmount2.setClear();
      dummyint = LiquidAmount3.getStatus() ? LiquidAmount3.setprepresent() : LiquidAmount3.setpreclear();
      LiquidAmount3.setpreval(LiquidAmount3.getValue());
      LiquidAmount3.setClear();
      dummyint = LiquidAmount4.getStatus() ? LiquidAmount4.setprepresent() : LiquidAmount4.setpreclear();
      LiquidAmount4.setpreval(LiquidAmount4.getValue());
      LiquidAmount4.setClear();
      dummyint = BottleQuantity.getStatus() ? BottleQuantity.setprepresent() : BottleQuantity.setpreclear();
      BottleQuantity.setpreval(BottleQuantity.getValue());
      BottleQuantity.setClear();
      LiquidAmount1E.sethook();
      LiquidAmount1E.setClear();
      LiquidAmount2E.sethook();
      LiquidAmount2E.setClear();
      LiquidAmount3E.sethook();
      LiquidAmount3E.setClear();
      LiquidAmount4E.sethook();
      LiquidAmount4E.setClear();
      BottleQuantityE.sethook();
      BottleQuantityE.setClear();
      allValid_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        LiquidAmount1.gethook();
        LiquidAmount2.gethook();
        LiquidAmount3.gethook();
        LiquidAmount4.gethook();
        BottleQuantity.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
