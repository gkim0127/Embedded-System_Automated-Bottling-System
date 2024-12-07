import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ControllerConveyor extends ClockDomain{
  public ControllerConveyor(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtLoad = new Signal("bottleAtLoad", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal motConveyorOnOffM = new Signal("motConveyorOnOffM", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private int S21568 = 1;
  private int S21453 = 1;
  private int S21419 = 1;
  private int S21406 = 1;
  private int S21551 = 1;
  private int S21477 = 1;
  private int S21464 = 1;
  private int S21566 = 1;
  private int S21565 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread21576(int [] tdone, int [] ends){
        switch(S21566){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S21565){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerConveyor.sysj line: 33, column: 9
              S21565=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerConveyor.sysj line: 35, column: 7
                selectM_1.setPresent();//sysj\controllerConveyor.sysj line: 36, column: 5
                currsigs.addElement(selectM_1);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerConveyor.sysj line: 39, column: 5
                currsigs.addElement(selectA_1);
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
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerConveyor.sysj line: 35, column: 7
              selectM_1.setPresent();//sysj\controllerConveyor.sysj line: 36, column: 5
              currsigs.addElement(selectM_1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerConveyor.sysj line: 39, column: 5
              currsigs.addElement(selectA_1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread21575(int [] tdone, int [] ends){
        switch(S21551){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S21477){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerConveyor.sysj line: 22, column: 9
              S21477=1;
              S21464=0;
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
            if(selectM_1.getprestatus()){//sysj\controllerConveyor.sysj line: 23, column: 10
              S21477=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S21464){
                case 0 : 
                  if(bottleAtLoad.getprestatus()){//sysj\controllerConveyor.sysj line: 24, column: 11
                    S21464=1;
                    motConveyorOnOff.setPresent();//sysj\controllerConveyor.sysj line: 26, column: 6
                    currsigs.addElement(motConveyorOnOff);
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
                  if(!bottleLeftPos5.getprestatus() && !bottleAtPos1.getprestatus()){//sysj\controllerConveyor.sysj line: 25, column: 11
                    S21477=0;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    motConveyorOnOff.setPresent();//sysj\controllerConveyor.sysj line: 26, column: 6
                    currsigs.addElement(motConveyorOnOff);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread21574(int [] tdone, int [] ends){
        switch(S21453){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S21419){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerConveyor.sysj line: 13, column: 10
              S21419=1;
              S21406=0;
              if(motConveyorOnOffM.getprestatus()){//sysj\controllerConveyor.sysj line: 15, column: 26
                motConveyorOnOff.setPresent();//sysj\controllerConveyor.sysj line: 15, column: 45
                currsigs.addElement(motConveyorOnOff);
                S21406=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S21406=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(selectA_1.getprestatus()){//sysj\controllerConveyor.sysj line: 14, column: 10
              S21419=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S21406){
                case 0 : 
                  S21406=0;
                  if(motConveyorOnOffM.getprestatus()){//sysj\controllerConveyor.sysj line: 15, column: 26
                    motConveyorOnOff.setPresent();//sysj\controllerConveyor.sysj line: 15, column: 45
                    currsigs.addElement(motConveyorOnOff);
                    S21406=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S21406=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
                case 1 : 
                  S21406=1;
                  S21406=0;
                  if(motConveyorOnOffM.getprestatus()){//sysj\controllerConveyor.sysj line: 15, column: 26
                    motConveyorOnOff.setPresent();//sysj\controllerConveyor.sysj line: 15, column: 45
                    currsigs.addElement(motConveyorOnOff);
                    S21406=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S21406=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread21572(int [] tdone, int [] ends){
        S21566=1;
    S21565=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread21571(int [] tdone, int [] ends){
        S21551=1;
    S21477=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread21570(int [] tdone, int [] ends){
        S21453=1;
    S21419=0;
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
      switch(S21568){
        case 0 : 
          S21568=0;
          break RUN;
        
        case 1 : 
          S21568=2;
          S21568=2;
          selectM_1.setClear();//sysj\controllerConveyor.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerConveyor.sysj line: 9, column: 2
          thread21570(tdone,ends);
          thread21571(tdone,ends);
          thread21572(tdone,ends);
          int biggest21573 = 0;
          if(ends[2]>=biggest21573){
            biggest21573=ends[2];
          }
          if(ends[3]>=biggest21573){
            biggest21573=ends[3];
          }
          if(ends[4]>=biggest21573){
            biggest21573=ends[4];
          }
          if(biggest21573 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerConveyor.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerConveyor.sysj line: 9, column: 2
          thread21574(tdone,ends);
          thread21575(tdone,ends);
          thread21576(tdone,ends);
          int biggest21577 = 0;
          if(ends[2]>=biggest21577){
            biggest21577=ends[2];
          }
          if(ends[3]>=biggest21577){
            biggest21577=ends[3];
          }
          if(ends[4]>=biggest21577){
            biggest21577=ends[4];
          }
          if(biggest21577 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest21577 == 0){
            S21568=0;
            active[1]=0;
            ends[1]=0;
            S21568=0;
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
    selectM_1 = new Signal();
    selectA_1 = new Signal();
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
          bottleAtLoad.gethook();
          bottleAtPos1.gethook();
          bottleLeftPos5.gethook();
          mode.gethook();
          motConveyorOnOffM.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtLoad.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      mode.setpreclear();
      motConveyorOnOffM.setpreclear();
      motConveyorOnOff.setpreclear();
      selectM_1.setpreclear();
      selectA_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtLoad.getStatus() ? bottleAtLoad.setprepresent() : bottleAtLoad.setpreclear();
      bottleAtLoad.setpreval(bottleAtLoad.getValue());
      bottleAtLoad.setClear();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = motConveyorOnOffM.getStatus() ? motConveyorOnOffM.setprepresent() : motConveyorOnOffM.setpreclear();
      motConveyorOnOffM.setpreval(motConveyorOnOffM.getValue());
      motConveyorOnOffM.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      selectM_1.setClear();
      selectA_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtLoad.gethook();
        bottleAtPos1.gethook();
        bottleLeftPos5.gethook();
        mode.gethook();
        motConveyorOnOffM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
