import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ACSPlant extends ClockDomain{
  public ACSPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal SirenOn = new Signal("SirenOn", Signal.INPUT);
  public Signal SirenOff = new Signal("SirenOff", Signal.INPUT);
  public Signal DoorLock = new Signal("DoorLock", Signal.INPUT);
  public Signal DoorUnlock = new Signal("DoorUnlock", Signal.INPUT);
  public Signal enableManufacture = new Signal("enableManufacture", Signal.INPUT);
  public Signal disableManufacture = new Signal("disableManufacture", Signal.INPUT);
  public Signal smokeAlarmHealth = new Signal("smokeAlarmHealth", Signal.OUTPUT);
  public Signal humanPresenceManufacture = new Signal("humanPresenceManufacture", Signal.OUTPUT);
  public Signal badgeLocation = new Signal("badgeLocation", Signal.OUTPUT);
  public Signal badgeAccessPermission = new Signal("badgeAccessPermission", Signal.OUTPUT);
  public Signal cardAccessPermission = new Signal("cardAccessPermission", Signal.OUTPUT);
  public Signal doorReader = new Signal("doorReader", Signal.OUTPUT);
  public Signal humanAcrossDoor = new Signal("humanAcrossDoor", Signal.OUTPUT);
  public Signal smokeAlarmDetected = new Signal("smokeAlarmDetected", Signal.OUTPUT);
  public Signal SirenOnE = new Signal("SirenOnE", Signal.OUTPUT);
  public Signal SirenOffE = new Signal("SirenOffE", Signal.OUTPUT);
  public Signal DoorLockE = new Signal("DoorLockE", Signal.OUTPUT);
  public Signal DoorUnlockE = new Signal("DoorUnlockE", Signal.OUTPUT);
  public Signal enableManufactureE = new Signal("enableManufactureE", Signal.OUTPUT);
  public Signal disableManufactureE = new Signal("disableManufactureE", Signal.OUTPUT);
  private int S1472 = 1;
  private int S774 = 1;
  private int S746 = 1;
  private int S815 = 1;
  private int S787 = 1;
  private int S856 = 1;
  private int S828 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread1484(int [] tdone, int [] ends){
        S856=1;
    S828=0;
    DoorLockE.setPresent();//sysj\ACSPlant.sysj line: 46, column: 17
    currsigs.addElement(DoorLockE);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1483(int [] tdone, int [] ends){
        S815=1;
    S787=0;
    enableManufactureE.setPresent();//sysj\ACSPlant.sysj line: 35, column: 17
    currsigs.addElement(enableManufactureE);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1482(int [] tdone, int [] ends){
        S774=1;
    S746=0;
    SirenOffE.setPresent();//sysj\ACSPlant.sysj line: 26, column: 17
    currsigs.addElement(SirenOffE);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread1480(int [] tdone, int [] ends){
        switch(S856){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S828){
          case 0 : 
            if(DoorUnlock.getprestatus()){//sysj\ACSPlant.sysj line: 45, column: 11
              S828=1;
              DoorUnlockE.setPresent();//sysj\ACSPlant.sysj line: 50, column: 17
              currsigs.addElement(DoorUnlockE);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              DoorLockE.setPresent();//sysj\ACSPlant.sysj line: 46, column: 17
              currsigs.addElement(DoorLockE);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(DoorLock.getprestatus()){//sysj\ACSPlant.sysj line: 49, column: 11
              S828=0;
              DoorLockE.setPresent();//sysj\ACSPlant.sysj line: 46, column: 17
              currsigs.addElement(DoorLockE);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              DoorUnlockE.setPresent();//sysj\ACSPlant.sysj line: 50, column: 17
              currsigs.addElement(DoorUnlockE);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1479(int [] tdone, int [] ends){
        switch(S815){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S787){
          case 0 : 
            if(disableManufacture.getprestatus()){//sysj\ACSPlant.sysj line: 34, column: 11
              S787=1;
              disableManufactureE.setPresent();//sysj\ACSPlant.sysj line: 38, column: 17
              currsigs.addElement(disableManufactureE);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              enableManufactureE.setPresent();//sysj\ACSPlant.sysj line: 35, column: 17
              currsigs.addElement(enableManufactureE);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(enableManufacture.getprestatus()){//sysj\ACSPlant.sysj line: 37, column: 11
              S787=0;
              enableManufactureE.setPresent();//sysj\ACSPlant.sysj line: 35, column: 17
              currsigs.addElement(enableManufactureE);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              disableManufactureE.setPresent();//sysj\ACSPlant.sysj line: 38, column: 17
              currsigs.addElement(disableManufactureE);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1478(int [] tdone, int [] ends){
        switch(S774){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S746){
          case 0 : 
            if(SirenOn.getprestatus()){//sysj\ACSPlant.sysj line: 25, column: 11
              S746=1;
              SirenOnE.setPresent();//sysj\ACSPlant.sysj line: 29, column: 17
              currsigs.addElement(SirenOnE);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              SirenOffE.setPresent();//sysj\ACSPlant.sysj line: 26, column: 17
              currsigs.addElement(SirenOffE);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(SirenOff.getprestatus()){//sysj\ACSPlant.sysj line: 28, column: 11
              S746=0;
              SirenOffE.setPresent();//sysj\ACSPlant.sysj line: 26, column: 17
              currsigs.addElement(SirenOffE);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              SirenOnE.setPresent();//sysj\ACSPlant.sysj line: 29, column: 17
              currsigs.addElement(SirenOnE);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1476(int [] tdone, int [] ends){
        S856=1;
    S828=0;
    DoorLockE.setPresent();//sysj\ACSPlant.sysj line: 46, column: 17
    currsigs.addElement(DoorLockE);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1475(int [] tdone, int [] ends){
        S815=1;
    S787=0;
    enableManufactureE.setPresent();//sysj\ACSPlant.sysj line: 35, column: 17
    currsigs.addElement(enableManufactureE);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1474(int [] tdone, int [] ends){
        S774=1;
    S746=0;
    SirenOffE.setPresent();//sysj\ACSPlant.sysj line: 26, column: 17
    currsigs.addElement(SirenOffE);
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
      switch(S1472){
        case 0 : 
          S1472=0;
          break RUN;
        
        case 1 : 
          S1472=2;
          S1472=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\ACSPlant.sysj line: 14, column: 3
            public void run() {//sysj\ACSPlant.sysj line: 16, column: 21
              org.compsys704.ACSGUI.main(null);//sysj\ACSPlant.sysj line: 17, column: 4
            }
            GUI(){//sysj\ACSPlant.sysj line: 15, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\ACSPlant.sysj line: 21, column: 2
          thread1474(tdone,ends);
          thread1475(tdone,ends);
          thread1476(tdone,ends);
          int biggest1477 = 0;
          if(ends[2]>=biggest1477){
            biggest1477=ends[2];
          }
          if(ends[3]>=biggest1477){
            biggest1477=ends[3];
          }
          if(ends[4]>=biggest1477){
            biggest1477=ends[4];
          }
          if(biggest1477 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1478(tdone,ends);
          thread1479(tdone,ends);
          thread1480(tdone,ends);
          int biggest1481 = 0;
          if(ends[2]>=biggest1481){
            biggest1481=ends[2];
          }
          if(ends[3]>=biggest1481){
            biggest1481=ends[3];
          }
          if(ends[4]>=biggest1481){
            biggest1481=ends[4];
          }
          if(biggest1481 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1481 == 0){
            thread1482(tdone,ends);
            thread1483(tdone,ends);
            thread1484(tdone,ends);
            int biggest1485 = 0;
            if(ends[2]>=biggest1485){
              biggest1485=ends[2];
            }
            if(ends[3]>=biggest1485){
              biggest1485=ends[3];
            }
            if(ends[4]>=biggest1485){
              biggest1485=ends[4];
            }
            if(biggest1485 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
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
          SirenOn.gethook();
          SirenOff.gethook();
          DoorLock.gethook();
          DoorUnlock.gethook();
          enableManufacture.gethook();
          disableManufacture.gethook();
          df = true;
        }
        runClockDomain();
      }
      SirenOn.setpreclear();
      SirenOff.setpreclear();
      DoorLock.setpreclear();
      DoorUnlock.setpreclear();
      enableManufacture.setpreclear();
      disableManufacture.setpreclear();
      smokeAlarmHealth.setpreclear();
      humanPresenceManufacture.setpreclear();
      badgeLocation.setpreclear();
      badgeAccessPermission.setpreclear();
      cardAccessPermission.setpreclear();
      doorReader.setpreclear();
      humanAcrossDoor.setpreclear();
      smokeAlarmDetected.setpreclear();
      SirenOnE.setpreclear();
      SirenOffE.setpreclear();
      DoorLockE.setpreclear();
      DoorUnlockE.setpreclear();
      enableManufactureE.setpreclear();
      disableManufactureE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = SirenOn.getStatus() ? SirenOn.setprepresent() : SirenOn.setpreclear();
      SirenOn.setpreval(SirenOn.getValue());
      SirenOn.setClear();
      dummyint = SirenOff.getStatus() ? SirenOff.setprepresent() : SirenOff.setpreclear();
      SirenOff.setpreval(SirenOff.getValue());
      SirenOff.setClear();
      dummyint = DoorLock.getStatus() ? DoorLock.setprepresent() : DoorLock.setpreclear();
      DoorLock.setpreval(DoorLock.getValue());
      DoorLock.setClear();
      dummyint = DoorUnlock.getStatus() ? DoorUnlock.setprepresent() : DoorUnlock.setpreclear();
      DoorUnlock.setpreval(DoorUnlock.getValue());
      DoorUnlock.setClear();
      dummyint = enableManufacture.getStatus() ? enableManufacture.setprepresent() : enableManufacture.setpreclear();
      enableManufacture.setpreval(enableManufacture.getValue());
      enableManufacture.setClear();
      dummyint = disableManufacture.getStatus() ? disableManufacture.setprepresent() : disableManufacture.setpreclear();
      disableManufacture.setpreval(disableManufacture.getValue());
      disableManufacture.setClear();
      smokeAlarmHealth.sethook();
      smokeAlarmHealth.setClear();
      humanPresenceManufacture.sethook();
      humanPresenceManufacture.setClear();
      badgeLocation.sethook();
      badgeLocation.setClear();
      badgeAccessPermission.sethook();
      badgeAccessPermission.setClear();
      cardAccessPermission.sethook();
      cardAccessPermission.setClear();
      doorReader.sethook();
      doorReader.setClear();
      humanAcrossDoor.sethook();
      humanAcrossDoor.setClear();
      smokeAlarmDetected.sethook();
      smokeAlarmDetected.setClear();
      SirenOnE.sethook();
      SirenOnE.setClear();
      SirenOffE.sethook();
      SirenOffE.setClear();
      DoorLockE.sethook();
      DoorLockE.setClear();
      DoorUnlockE.sethook();
      DoorUnlockE.setClear();
      enableManufactureE.sethook();
      enableManufactureE.setClear();
      disableManufactureE.sethook();
      disableManufactureE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        SirenOn.gethook();
        SirenOff.gethook();
        DoorLock.gethook();
        DoorUnlock.gethook();
        enableManufacture.gethook();
        disableManufacture.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
