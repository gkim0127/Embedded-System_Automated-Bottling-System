import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class FillerController extends ClockDomain{
  public FillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal enable2E = new Signal("enable2E", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal fillerReady = new Signal("fillerReady", Signal.OUTPUT);
  public Signal jobDone = new Signal("jobDone", Signal.OUTPUT);
  public Signal fillerReadyChannel = new Signal("fillerReadyChannel", Signal.OUTPUT);
  private int S193018 = 1;
  private int S192814 = 1;
  private int S192821 = 1;
  private int S192826 = 1;
  private int S192846 = 1;
  private int S192851 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread193030(int [] tdone, int [] ends){
        switch(S192851){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\FillerController.sysj line: 52, column: 5
        currsigs.addElement(dosUnitValveExtend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread193029(int [] tdone, int [] ends){
        switch(S192846){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\FillerController.sysj line: 48, column: 5
        currsigs.addElement(valveInletOnOff);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread193027(int [] tdone, int [] ends){
        S192851=1;
    dosUnitValveExtend.setPresent();//sysj\FillerController.sysj line: 52, column: 5
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread193026(int [] tdone, int [] ends){
        S192846=1;
    valveInletOnOff.setPresent();//sysj\FillerController.sysj line: 48, column: 5
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread193024(int [] tdone, int [] ends){
        switch(S192826){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\FillerController.sysj line: 38, column: 5
        currsigs.addElement(dosUnitValveRetract);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread193023(int [] tdone, int [] ends){
        switch(S192821){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\FillerController.sysj line: 34, column: 5
        currsigs.addElement(valveInjectorOnOff);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread193021(int [] tdone, int [] ends){
        S192826=1;
    dosUnitValveRetract.setPresent();//sysj\FillerController.sysj line: 38, column: 5
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread193020(int [] tdone, int [] ends){
        S192821=1;
    valveInjectorOnOff.setPresent();//sysj\FillerController.sysj line: 34, column: 5
    currsigs.addElement(valveInjectorOnOff);
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
      switch(S193018){
        case 0 : 
          S193018=0;
          break RUN;
        
        case 1 : 
          S193018=2;
          S193018=2;
          S192814=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S192814){
            case 0 : 
              if(bottleAtPos2.getprestatus()){//sysj\FillerController.sysj line: 27, column: 9
                System.out.println("Bottle at pos 2");//sysj\FillerController.sysj line: 28, column: 3
                S192814=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(enable.getprestatus() || enable2E.getprestatus() || bottleAtPos2.getprestatus()){//sysj\FillerController.sysj line: 30, column: 9
                S192814=2;
                thread193020(tdone,ends);
                thread193021(tdone,ends);
                int biggest193022 = 0;
                if(ends[2]>=biggest193022){
                  biggest193022=ends[2];
                }
                if(ends[3]>=biggest193022){
                  biggest193022=ends[3];
                }
                if(biggest193022 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(dosUnitFilled.getprestatus()){//sysj\FillerController.sysj line: 32, column: 9
                System.out.println("done 1");//sysj\FillerController.sysj line: 42, column: 3
                S192814=3;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread193023(tdone,ends);
                thread193024(tdone,ends);
                int biggest193025 = 0;
                if(ends[2]>=biggest193025){
                  biggest193025=ends[2];
                }
                if(ends[3]>=biggest193025){
                  biggest193025=ends[3];
                }
                if(biggest193025 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest193025 == 0){
                  System.out.println("done 1");//sysj\FillerController.sysj line: 42, column: 3
                  S192814=3;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 3 : 
              if(enable.getprestatus() || enable2E.getprestatus() || bottleAtPos2.getprestatus()){//sysj\FillerController.sysj line: 44, column: 9
                S192814=4;
                thread193026(tdone,ends);
                thread193027(tdone,ends);
                int biggest193028 = 0;
                if(ends[4]>=biggest193028){
                  biggest193028=ends[4];
                }
                if(ends[5]>=biggest193028){
                  biggest193028=ends[5];
                }
                if(biggest193028 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 4 : 
              if(dosUnitEvac.getprestatus()){//sysj\FillerController.sysj line: 46, column: 9
                System.out.println("done 2");//sysj\FillerController.sysj line: 55, column: 3
                S192814=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread193029(tdone,ends);
                thread193030(tdone,ends);
                int biggest193031 = 0;
                if(ends[4]>=biggest193031){
                  biggest193031=ends[4];
                }
                if(ends[5]>=biggest193031){
                  biggest193031=ends[5];
                }
                if(biggest193031 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest193031 == 0){
                  System.out.println("done 2");//sysj\FillerController.sysj line: 55, column: 3
                  S192814=0;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
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
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          enable.gethook();
          enable2E.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      enable.setpreclear();
      enable2E.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      fillerReady.setpreclear();
      jobDone.setpreclear();
      fillerReadyChannel.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = enable2E.getStatus() ? enable2E.setprepresent() : enable2E.setpreclear();
      enable2E.setpreval(enable2E.getValue());
      enable2E.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      fillerReady.sethook();
      fillerReady.setClear();
      jobDone.sethook();
      jobDone.setClear();
      fillerReadyChannel.sethook();
      fillerReadyChannel.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        enable.gethook();
        enable2E.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
