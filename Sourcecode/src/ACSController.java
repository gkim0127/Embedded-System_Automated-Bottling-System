import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ACSController extends ClockDomain{
  public ACSController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal smokeAlarmHealth = new Signal("smokeAlarmHealth", Signal.INPUT);
  public Signal humanPresenceManufacture = new Signal("humanPresenceManufacture", Signal.INPUT);
  public Signal humanAcrossDoor = new Signal("humanAcrossDoor", Signal.INPUT);
  public Signal smokeAlarmDetected = new Signal("smokeAlarmDetected", Signal.INPUT);
  public Signal cardAccessPermission = new Signal("cardAccessPermission", Signal.INPUT);
  public Signal doorReader = new Signal("doorReader", Signal.INPUT);
  public Signal badgeLocation = new Signal("badgeLocation", Signal.INPUT);
  public Signal badgeAccessPermission = new Signal("badgeAccessPermission", Signal.INPUT);
  public Signal badgeID = new Signal("badgeID", Signal.INPUT);
  public Signal SirenM = new Signal("SirenM", Signal.INPUT);
  public Signal ManufactureM = new Signal("ManufactureM", Signal.INPUT);
  public Signal disarm = new Signal("disarm", Signal.INPUT);
  public Signal SirenOn = new Signal("SirenOn", Signal.OUTPUT);
  public Signal SirenOff = new Signal("SirenOff", Signal.OUTPUT);
  public Signal DoorLock = new Signal("DoorLock", Signal.OUTPUT);
  public Signal DoorUnlock = new Signal("DoorUnlock", Signal.OUTPUT);
  public Signal enableManufacture = new Signal("enableManufacture", Signal.OUTPUT);
  public Signal disableManufacture = new Signal("disableManufacture", Signal.OUTPUT);
  private Signal trespasser_1;
  private int temp_thread_2;//sysj\ACSController.sysj line: 37, column: 5
  private int badgeBoolean_thread_2;//sysj\ACSController.sysj line: 24, column: 4
  private int badgePermission_thread_2;//sysj\ACSController.sysj line: 25, column: 4
  private int badgeLoca_thread_2;//sysj\ACSController.sysj line: 26, column: 4
  private int decimal_thread_2;//sysj\ACSController.sysj line: 27, column: 4
  private int n_thread_2;//sysj\ACSController.sysj line: 28, column: 4
  private int S719 = 1;
  private int S94 = 1;
  private int S1 = 1;
  private int S198 = 1;
  private int S116 = 1;
  private int S239 = 1;
  private int S211 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread731(int [] tdone, int [] ends){
        S239=1;
    S211=0;
    SirenOff.setPresent();//sysj\ACSController.sysj line: 93, column: 17
    currsigs.addElement(SirenOff);
    enableManufacture.setPresent();//sysj\ACSController.sysj line: 93, column: 32
    currsigs.addElement(enableManufacture);
    System.out.println("Siren is off ");//sysj\ACSController.sysj line: 94, column: 5
    System.out.println("Manufacture is enabled ");//sysj\ACSController.sysj line: 95, column: 5
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread730(int [] tdone, int [] ends){
        S198=1;
    S116=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread729(int [] tdone, int [] ends){
        S94=1;
                        S1=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread727(int [] tdone, int [] ends){
        switch(S239){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S211){
          case 0 : 
            if(humanPresenceManufacture.getprestatus() || smokeAlarmDetected.getprestatus() || trespasser_1.getprestatus()){//sysj\ACSController.sysj line: 92, column: 10
              S211=1;
              SirenOn.setPresent();//sysj\ACSController.sysj line: 99, column: 18
              currsigs.addElement(SirenOn);
              disableManufacture.setPresent();//sysj\ACSController.sysj line: 99, column: 32
              currsigs.addElement(disableManufacture);
              System.out.println("Siren is on ");//sysj\ACSController.sysj line: 101, column: 6
              System.out.println("Manufacture is disabled ");//sysj\ACSController.sysj line: 102, column: 6
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              SirenOff.setPresent();//sysj\ACSController.sysj line: 93, column: 17
              currsigs.addElement(SirenOff);
              enableManufacture.setPresent();//sysj\ACSController.sysj line: 93, column: 32
              currsigs.addElement(enableManufacture);
              System.out.println("Siren is off ");//sysj\ACSController.sysj line: 94, column: 5
              System.out.println("Manufacture is enabled ");//sysj\ACSController.sysj line: 95, column: 5
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(disarm.getprestatus()){//sysj\ACSController.sysj line: 98, column: 10
              System.out.println("disarm being pressed ");//sysj\ACSController.sysj line: 106, column: 5
              S211=0;
              SirenOff.setPresent();//sysj\ACSController.sysj line: 93, column: 17
              currsigs.addElement(SirenOff);
              enableManufacture.setPresent();//sysj\ACSController.sysj line: 93, column: 32
              currsigs.addElement(enableManufacture);
              System.out.println("Siren is off ");//sysj\ACSController.sysj line: 94, column: 5
              System.out.println("Manufacture is enabled ");//sysj\ACSController.sysj line: 95, column: 5
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              SirenOn.setPresent();//sysj\ACSController.sysj line: 99, column: 18
              currsigs.addElement(SirenOn);
              disableManufacture.setPresent();//sysj\ACSController.sysj line: 99, column: 32
              currsigs.addElement(disableManufacture);
              System.out.println("Siren is on ");//sysj\ACSController.sysj line: 101, column: 6
              System.out.println("Manufacture is disabled ");//sysj\ACSController.sysj line: 102, column: 6
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread726(int [] tdone, int [] ends){
        switch(S198){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S116){
          case 0 : 
            if(doorReader.getprestatus()){//sysj\ACSController.sysj line: 65, column: 10
              S116=1;
              if((Integer)(cardAccessPermission.getpreval() == null ? null : ((Integer)cardAccessPermission.getpreval())) != 0){//sysj\ACSController.sysj line: 67, column: 7
                System.out.println("DoorUnlocked ");//sysj\ACSController.sysj line: 68, column: 5
                DoorUnlock.setPresent();//sysj\ACSController.sysj line: 70, column: 17
                currsigs.addElement(DoorUnlock);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S116=2;
                DoorLock.setPresent();//sysj\ACSController.sysj line: 82, column: 17
                currsigs.addElement(DoorLock);
                System.out.println("Door keep locking");//sysj\ACSController.sysj line: 83, column: 5
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(humanAcrossDoor.getprestatus()){//sysj\ACSController.sysj line: 69, column: 11
              S116=2;
              DoorLock.setPresent();//sysj\ACSController.sysj line: 82, column: 17
              currsigs.addElement(DoorLock);
              System.out.println("Door keep locking");//sysj\ACSController.sysj line: 83, column: 5
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              DoorUnlock.setPresent();//sysj\ACSController.sysj line: 70, column: 17
              currsigs.addElement(DoorUnlock);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(doorReader.getprestatus()){//sysj\ACSController.sysj line: 81, column: 10
              S116=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              DoorLock.setPresent();//sysj\ACSController.sysj line: 82, column: 17
              currsigs.addElement(DoorLock);
              System.out.println("Door keep locking");//sysj\ACSController.sysj line: 83, column: 5
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread725(int [] tdone, int [] ends){
        switch(S94){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1){
          case 0 : 
            if(badgeAccessPermission.getprestatus()){//sysj\ACSController.sysj line: 29, column: 10
              badgePermission_thread_2 = (Integer)(badgeAccessPermission.getpreval() == null ? null : ((Integer)badgeAccessPermission.getpreval()));//sysj\ACSController.sysj line: 31, column: 4
              while(true) {//sysj\ACSController.sysj line: 33, column: 15
                if(badgePermission_thread_2 == 0) {//sysj\ACSController.sysj line: 34, column: 29
                  break ;//sysj\ACSController.sysj line: 35, column: 5
                }
                else {//sysj\ACSController.sysj line: 36, column: 9
                  temp_thread_2 = badgePermission_thread_2 % 10;//sysj\ACSController.sysj line: 37, column: 5
                  decimal_thread_2 += temp_thread_2 * Math.pow(2, n_thread_2);//sysj\ACSController.sysj line: 38, column: 5
                  badgePermission_thread_2 = badgePermission_thread_2 / 10;//sysj\ACSController.sysj line: 39, column: 5
                  n_thread_2 = n_thread_2 + 1;//sysj\ACSController.sysj line: 40, column: 5
                }
              }
              badgeLoca_thread_2 = (Integer)(badgeLocation.getpreval() == null ? null : ((Integer)badgeLocation.getpreval())) - 1;//sysj\ACSController.sysj line: 46, column: 4
              badgeBoolean_thread_2 = (decimal_thread_2 >> badgeLoca_thread_2);//sysj\ACSController.sysj line: 47, column: 4
              S1=1;
              if((badgeBoolean_thread_2 & 1) != 0){//sysj\ACSController.sysj line: 49, column: 7
                System.out.println("AccessVerified ");//sysj\ACSController.sysj line: 50, column: 5
                                                                                                S1=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("AccessDenied ");//sysj\ACSController.sysj line: 53, column: 5
                trespasser_1.setPresent();//sysj\ACSController.sysj line: 55, column: 17
                currsigs.addElement(trespasser_1);
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
            if(disarm.getprestatus()){//sysj\ACSController.sysj line: 54, column: 11
                                                                                    S1=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              trespasser_1.setPresent();//sysj\ACSController.sysj line: 55, column: 17
              currsigs.addElement(trespasser_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread723(int [] tdone, int [] ends){
        S239=1;
    S211=0;
    SirenOff.setPresent();//sysj\ACSController.sysj line: 93, column: 17
    currsigs.addElement(SirenOff);
    enableManufacture.setPresent();//sysj\ACSController.sysj line: 93, column: 32
    currsigs.addElement(enableManufacture);
    System.out.println("Siren is off ");//sysj\ACSController.sysj line: 94, column: 5
    System.out.println("Manufacture is enabled ");//sysj\ACSController.sysj line: 95, column: 5
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread722(int [] tdone, int [] ends){
        S198=1;
    S116=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread721(int [] tdone, int [] ends){
        S94=1;
                        S1=0;
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
      switch(S719){
        case 0 : 
          S719=0;
          break RUN;
        
        case 1 : 
          S719=2;
          S719=2;
          trespasser_1.setClear();//sysj\ACSController.sysj line: 18, column: 2
          thread721(tdone,ends);
          thread722(tdone,ends);
          thread723(tdone,ends);
          int biggest724 = 0;
          if(ends[2]>=biggest724){
            biggest724=ends[2];
          }
          if(ends[3]>=biggest724){
            biggest724=ends[3];
          }
          if(ends[4]>=biggest724){
            biggest724=ends[4];
          }
          if(biggest724 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          trespasser_1.setClear();//sysj\ACSController.sysj line: 18, column: 2
          thread725(tdone,ends);
          thread726(tdone,ends);
          thread727(tdone,ends);
          int biggest728 = 0;
          if(ends[2]>=biggest728){
            biggest728=ends[2];
          }
          if(ends[3]>=biggest728){
            biggest728=ends[3];
          }
          if(ends[4]>=biggest728){
            biggest728=ends[4];
          }
          if(biggest728 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest728 == 0){
            thread729(tdone,ends);
            thread730(tdone,ends);
            thread731(tdone,ends);
            int biggest732 = 0;
            if(ends[2]>=biggest732){
              biggest732=ends[2];
            }
            if(ends[3]>=biggest732){
              biggest732=ends[3];
            }
            if(ends[4]>=biggest732){
              biggest732=ends[4];
            }
            if(biggest732 == 1){
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
    trespasser_1 = new Signal();
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
          smokeAlarmHealth.gethook();
          humanPresenceManufacture.gethook();
          humanAcrossDoor.gethook();
          smokeAlarmDetected.gethook();
          cardAccessPermission.gethook();
          doorReader.gethook();
          badgeLocation.gethook();
          badgeAccessPermission.gethook();
          badgeID.gethook();
          SirenM.gethook();
          ManufactureM.gethook();
          disarm.gethook();
          df = true;
        }
        runClockDomain();
      }
      smokeAlarmHealth.setpreclear();
      humanPresenceManufacture.setpreclear();
      humanAcrossDoor.setpreclear();
      smokeAlarmDetected.setpreclear();
      cardAccessPermission.setpreclear();
      doorReader.setpreclear();
      badgeLocation.setpreclear();
      badgeAccessPermission.setpreclear();
      badgeID.setpreclear();
      SirenM.setpreclear();
      ManufactureM.setpreclear();
      disarm.setpreclear();
      SirenOn.setpreclear();
      SirenOff.setpreclear();
      DoorLock.setpreclear();
      DoorUnlock.setpreclear();
      enableManufacture.setpreclear();
      disableManufacture.setpreclear();
      trespasser_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = smokeAlarmHealth.getStatus() ? smokeAlarmHealth.setprepresent() : smokeAlarmHealth.setpreclear();
      smokeAlarmHealth.setpreval(smokeAlarmHealth.getValue());
      smokeAlarmHealth.setClear();
      dummyint = humanPresenceManufacture.getStatus() ? humanPresenceManufacture.setprepresent() : humanPresenceManufacture.setpreclear();
      humanPresenceManufacture.setpreval(humanPresenceManufacture.getValue());
      humanPresenceManufacture.setClear();
      dummyint = humanAcrossDoor.getStatus() ? humanAcrossDoor.setprepresent() : humanAcrossDoor.setpreclear();
      humanAcrossDoor.setpreval(humanAcrossDoor.getValue());
      humanAcrossDoor.setClear();
      dummyint = smokeAlarmDetected.getStatus() ? smokeAlarmDetected.setprepresent() : smokeAlarmDetected.setpreclear();
      smokeAlarmDetected.setpreval(smokeAlarmDetected.getValue());
      smokeAlarmDetected.setClear();
      dummyint = cardAccessPermission.getStatus() ? cardAccessPermission.setprepresent() : cardAccessPermission.setpreclear();
      cardAccessPermission.setpreval(cardAccessPermission.getValue());
      cardAccessPermission.setClear();
      dummyint = doorReader.getStatus() ? doorReader.setprepresent() : doorReader.setpreclear();
      doorReader.setpreval(doorReader.getValue());
      doorReader.setClear();
      dummyint = badgeLocation.getStatus() ? badgeLocation.setprepresent() : badgeLocation.setpreclear();
      badgeLocation.setpreval(badgeLocation.getValue());
      badgeLocation.setClear();
      dummyint = badgeAccessPermission.getStatus() ? badgeAccessPermission.setprepresent() : badgeAccessPermission.setpreclear();
      badgeAccessPermission.setpreval(badgeAccessPermission.getValue());
      badgeAccessPermission.setClear();
      dummyint = badgeID.getStatus() ? badgeID.setprepresent() : badgeID.setpreclear();
      badgeID.setpreval(badgeID.getValue());
      badgeID.setClear();
      dummyint = SirenM.getStatus() ? SirenM.setprepresent() : SirenM.setpreclear();
      SirenM.setpreval(SirenM.getValue());
      SirenM.setClear();
      dummyint = ManufactureM.getStatus() ? ManufactureM.setprepresent() : ManufactureM.setpreclear();
      ManufactureM.setpreval(ManufactureM.getValue());
      ManufactureM.setClear();
      dummyint = disarm.getStatus() ? disarm.setprepresent() : disarm.setpreclear();
      disarm.setpreval(disarm.getValue());
      disarm.setClear();
      SirenOn.sethook();
      SirenOn.setClear();
      SirenOff.sethook();
      SirenOff.setClear();
      DoorLock.sethook();
      DoorLock.setClear();
      DoorUnlock.sethook();
      DoorUnlock.setClear();
      enableManufacture.sethook();
      enableManufacture.setClear();
      disableManufacture.sethook();
      disableManufacture.setClear();
      trespasser_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        smokeAlarmHealth.gethook();
        humanPresenceManufacture.gethook();
        humanAcrossDoor.gethook();
        smokeAlarmDetected.gethook();
        cardAccessPermission.gethook();
        doorReader.gethook();
        badgeLocation.gethook();
        badgeAccessPermission.gethook();
        badgeID.gethook();
        SirenM.gethook();
        ManufactureM.gethook();
        disarm.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
