import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ConveyorController extends ClockDomain{
  public ConveyorController(String name){super(name);}
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
  private int S155989 = 1;
  private int S155711 = 1;
  private int S155677 = 1;
  private int S155664 = 1;
  private int S155809 = 1;
  private int S155735 = 1;
  private int S155722 = 1;
  private int S155824 = 1;
  private int S155823 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread155997(int [] tdone, int [] ends){
        switch(S155824){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S155823){
          case 0 : 
            if(mode.getprestatus()){//sysj\ConveyorController.sysj line: 34, column: 9
              S155823=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\ConveyorController.sysj line: 36, column: 7
                selectM_1.setPresent();//sysj\ConveyorController.sysj line: 37, column: 5
                currsigs.addElement(selectM_1);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                selectA_1.setPresent();//sysj\ConveyorController.sysj line: 40, column: 5
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
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\ConveyorController.sysj line: 36, column: 7
              selectM_1.setPresent();//sysj\ConveyorController.sysj line: 37, column: 5
              currsigs.addElement(selectM_1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              selectA_1.setPresent();//sysj\ConveyorController.sysj line: 40, column: 5
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

  public void thread155996(int [] tdone, int [] ends){
        switch(S155809){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S155735){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\ConveyorController.sysj line: 23, column: 9
              S155735=1;
              S155722=0;
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
            if(selectM_1.getprestatus()){//sysj\ConveyorController.sysj line: 24, column: 10
              S155735=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S155722){
                case 0 : 
                  if(bottleAtLoad.getprestatus()){//sysj\ConveyorController.sysj line: 25, column: 11
                    S155722=1;
                    motConveyorOnOff.setPresent();//sysj\ConveyorController.sysj line: 27, column: 6
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
                  if(!bottleLeftPos5.getprestatus() && !bottleAtPos1.getprestatus()){//sysj\ConveyorController.sysj line: 26, column: 11
                    S155735=0;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    motConveyorOnOff.setPresent();//sysj\ConveyorController.sysj line: 27, column: 6
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

  public void thread155995(int [] tdone, int [] ends){
        switch(S155711){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S155677){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\ConveyorController.sysj line: 14, column: 10
              S155677=1;
              S155664=0;
              if(motConveyorOnOffM.getprestatus()){//sysj\ConveyorController.sysj line: 16, column: 26
                motConveyorOnOff.setPresent();//sysj\ConveyorController.sysj line: 16, column: 45
                currsigs.addElement(motConveyorOnOff);
                S155664=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S155664=1;
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
            if(selectA_1.getprestatus()){//sysj\ConveyorController.sysj line: 15, column: 10
              S155677=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S155664){
                case 0 : 
                  S155664=0;
                  if(motConveyorOnOffM.getprestatus()){//sysj\ConveyorController.sysj line: 16, column: 26
                    motConveyorOnOff.setPresent();//sysj\ConveyorController.sysj line: 16, column: 45
                    currsigs.addElement(motConveyorOnOff);
                    S155664=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S155664=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
                case 1 : 
                  S155664=1;
                  S155664=0;
                  if(motConveyorOnOffM.getprestatus()){//sysj\ConveyorController.sysj line: 16, column: 26
                    motConveyorOnOff.setPresent();//sysj\ConveyorController.sysj line: 16, column: 45
                    currsigs.addElement(motConveyorOnOff);
                    S155664=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S155664=1;
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

  public void thread155993(int [] tdone, int [] ends){
        S155824=1;
    S155823=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread155992(int [] tdone, int [] ends){
        S155809=1;
    S155735=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread155991(int [] tdone, int [] ends){
        S155711=1;
    S155677=0;
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
      switch(S155989){
        case 0 : 
          S155989=0;
          break RUN;
        
        case 1 : 
          S155989=2;
          S155989=2;
          selectM_1.setClear();//sysj\ConveyorController.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\ConveyorController.sysj line: 9, column: 2
          selectA_1.setPresent();//sysj\ConveyorController.sysj line: 10, column: 2
          currsigs.addElement(selectA_1);
          thread155991(tdone,ends);
          thread155992(tdone,ends);
          thread155993(tdone,ends);
          int biggest155994 = 0;
          if(ends[2]>=biggest155994){
            biggest155994=ends[2];
          }
          if(ends[3]>=biggest155994){
            biggest155994=ends[3];
          }
          if(ends[4]>=biggest155994){
            biggest155994=ends[4];
          }
          if(biggest155994 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\ConveyorController.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\ConveyorController.sysj line: 9, column: 2
          thread155995(tdone,ends);
          thread155996(tdone,ends);
          thread155997(tdone,ends);
          int biggest155998 = 0;
          if(ends[2]>=biggest155998){
            biggest155998=ends[2];
          }
          if(ends[3]>=biggest155998){
            biggest155998=ends[3];
          }
          if(ends[4]>=biggest155998){
            biggest155998=ends[4];
          }
          if(biggest155998 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest155998 == 0){
            S155989=0;
            active[1]=0;
            ends[1]=0;
            S155989=0;
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
