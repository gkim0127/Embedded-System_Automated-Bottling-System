import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ECSController extends ClockDomain{
  public ECSController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal officeTemp = new Signal("officeTemp", Signal.INPUT);
  public Signal officeHumidity = new Signal("officeHumidity", Signal.INPUT);
  public Signal officeLumen = new Signal("officeLumen", Signal.INPUT);
  public Signal storageTemp = new Signal("storageTemp", Signal.INPUT);
  public Signal storageHumidity = new Signal("storageHumidity", Signal.INPUT);
  public Signal storageLumen = new Signal("storageLumen", Signal.INPUT);
  public Signal manufactureTemp = new Signal("manufactureTemp", Signal.INPUT);
  public Signal manufactureHumidity = new Signal("manufactureHumidity", Signal.INPUT);
  public Signal manufactureLumen = new Signal("manufactureLumen", Signal.INPUT);
  public Signal officeHIR = new Signal("officeHIR", Signal.INPUT);
  public Signal storageHIR = new Signal("storageHIR", Signal.INPUT);
  public Signal manufactureHIR = new Signal("manufactureHIR", Signal.INPUT);
  public Signal officeSmoke = new Signal("officeSmoke", Signal.INPUT);
  public Signal storageSmoke = new Signal("storageSmoke", Signal.INPUT);
  public Signal manufactureSmoke = new Signal("manufactureSmoke", Signal.INPUT);
  public Signal time = new Signal("time", Signal.INPUT);
  public Signal officeAC = new Signal("officeAC", Signal.OUTPUT);
  public Signal officeHeater = new Signal("officeHeater", Signal.OUTPUT);
  public Signal officeDehumidifier = new Signal("officeDehumidifier", Signal.OUTPUT);
  public Signal officeLight100 = new Signal("officeLight100", Signal.OUTPUT);
  public Signal officeLight80 = new Signal("officeLight80", Signal.OUTPUT);
  public Signal officeLight50 = new Signal("officeLight50", Signal.OUTPUT);
  public Signal officeLight0 = new Signal("officeLight0", Signal.OUTPUT);
  public Signal storageAC = new Signal("storageAC", Signal.OUTPUT);
  public Signal storageDehumidifier = new Signal("storageDehumidifier", Signal.OUTPUT);
  public Signal storageLight100 = new Signal("storageLight100", Signal.OUTPUT);
  public Signal storageLight80 = new Signal("storageLight80", Signal.OUTPUT);
  public Signal storageLight50 = new Signal("storageLight50", Signal.OUTPUT);
  public Signal storageLight0 = new Signal("storageLight0", Signal.OUTPUT);
  public Signal manufactureAC = new Signal("manufactureAC", Signal.OUTPUT);
  public Signal manufactureDehumidifier = new Signal("manufactureDehumidifier", Signal.OUTPUT);
  public Signal manufactureLight100 = new Signal("manufactureLight100", Signal.OUTPUT);
  public Signal manufactureLight80 = new Signal("manufactureLight80", Signal.OUTPUT);
  public Signal manufactureLight50 = new Signal("manufactureLight50", Signal.OUTPUT);
  public Signal manufactureLight0 = new Signal("manufactureLight0", Signal.OUTPUT);
  public Signal officeSiren = new Signal("officeSiren", Signal.OUTPUT);
  public Signal storageSiren = new Signal("storageSiren", Signal.OUTPUT);
  public Signal manufactureSiren = new Signal("manufactureSiren", Signal.OUTPUT);
  public Signal officeSirenA = new Signal("officeSirenA", Signal.OUTPUT);
  public Signal storageSirenA = new Signal("storageSirenA", Signal.OUTPUT);
  public Signal manufactureSirenA = new Signal("manufactureSirenA", Signal.OUTPUT);
  public Signal officeOccupancy = new Signal("officeOccupancy", Signal.OUTPUT);
  public Signal storageOccupancy = new Signal("storageOccupancy", Signal.OUTPUT);
  public Signal manufactureOccupancy = new Signal("manufactureOccupancy", Signal.OUTPUT);
  private Signal officeHour_1;
  private Signal notOfficeHour_1;
  private int S192737 = 1;
  private int S165696 = 1;
  private int S161024 = 1;
  private int S161128 = 1;
  private int S161058 = 1;
  private int S161041 = 1;
  private int S161184 = 1;
  private int S161146 = 1;
  private int S161240 = 1;
  private int S161202 = 1;
  private int S161296 = 1;
  private int S161258 = 1;
  private int S161352 = 1;
  private int S161314 = 1;
  private int S161408 = 1;
  private int S161370 = 1;
  private int S161474 = 1;
  private int S161440 = 1;
  private int S161424 = 1;
  private int S161540 = 1;
  private int S161506 = 1;
  private int S161490 = 1;
  private int S161606 = 1;
  private int S161572 = 1;
  private int S161556 = 1;
  private int S166074 = 1;
  private int S165790 = 1;
  private int S165716 = 1;
  private int S165715 = 1;
  private int S165735 = 1;
  private int S165734 = 1;
  private int S165742 = 1;
  private int S166247 = 1;
  private int S166093 = 1;
  private int S166092 = 1;
  private int S166112 = 1;
  private int S166111 = 1;
  private int S166131 = 1;
  private int S166130 = 1;
  private int S166281 = 1;
  private int S166307 = 1;
  private int S166289 = 1;
  private int S166297 = 1;
  private int S166305 = 1;
  
  private int[] ends = new int[25];
  private int[] tdone = new int[25];
  
  public void thread192810(int [] tdone, int [] ends){
        S166305=1;
    if(manufactureSmoke.getprestatus()){//sysj\ECSController.sysj line: 239, column: 25
      manufactureSirenA.setPresent();//sysj\ECSController.sysj line: 239, column: 43
      currsigs.addElement(manufactureSirenA);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread192809(int [] tdone, int [] ends){
        S166297=1;
    if(storageSmoke.getprestatus()){//sysj\ECSController.sysj line: 237, column: 25
      storageSirenA.setPresent();//sysj\ECSController.sysj line: 237, column: 39
      currsigs.addElement(storageSirenA);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread192808(int [] tdone, int [] ends){
        S166289=1;
    if(officeSmoke.getprestatus()){//sysj\ECSController.sysj line: 235, column: 25
      officeSirenA.setPresent();//sysj\ECSController.sysj line: 235, column: 38
      currsigs.addElement(officeSirenA);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread192807(int [] tdone, int [] ends){
        S166307=1;
    thread192808(tdone,ends);
    thread192809(tdone,ends);
    thread192810(tdone,ends);
    int biggest192811 = 0;
    if(ends[22]>=biggest192811){
      biggest192811=ends[22];
    }
    if(ends[23]>=biggest192811){
      biggest192811=ends[23];
    }
    if(ends[24]>=biggest192811){
      biggest192811=ends[24];
    }
    if(biggest192811 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread192806(int [] tdone, int [] ends){
        S166281=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread192804(int [] tdone, int [] ends){
        S166131=1;
    S166130=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread192803(int [] tdone, int [] ends){
        S166112=1;
    S166111=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread192802(int [] tdone, int [] ends){
        S166093=1;
    S166092=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread192801(int [] tdone, int [] ends){
        S166247=1;
    thread192802(tdone,ends);
    thread192803(tdone,ends);
    thread192804(tdone,ends);
    int biggest192805 = 0;
    if(ends[17]>=biggest192805){
      biggest192805=ends[17];
    }
    if(ends[18]>=biggest192805){
      biggest192805=ends[18];
    }
    if(ends[19]>=biggest192805){
      biggest192805=ends[19];
    }
    if(biggest192805 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread192800(int [] tdone, int [] ends){
        S166074=1;
    S165790=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread192799(int [] tdone, int [] ends){
        S165696=1;
    S161024=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread192796(int [] tdone, int [] ends){
        switch(S166305){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(manufactureSmoke.getprestatus()){//sysj\ECSController.sysj line: 239, column: 25
          manufactureSirenA.setPresent();//sysj\ECSController.sysj line: 239, column: 43
          currsigs.addElement(manufactureSirenA);
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread192795(int [] tdone, int [] ends){
        switch(S166297){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(storageSmoke.getprestatus()){//sysj\ECSController.sysj line: 237, column: 25
          storageSirenA.setPresent();//sysj\ECSController.sysj line: 237, column: 39
          currsigs.addElement(storageSirenA);
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread192794(int [] tdone, int [] ends){
        switch(S166289){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(officeSmoke.getprestatus()){//sysj\ECSController.sysj line: 235, column: 25
          officeSirenA.setPresent();//sysj\ECSController.sysj line: 235, column: 38
          currsigs.addElement(officeSirenA);
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread192793(int [] tdone, int [] ends){
        switch(S166307){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread192794(tdone,ends);
        thread192795(tdone,ends);
        thread192796(tdone,ends);
        int biggest192797 = 0;
        if(ends[22]>=biggest192797){
          biggest192797=ends[22];
        }
        if(ends[23]>=biggest192797){
          biggest192797=ends[23];
        }
        if(ends[24]>=biggest192797){
          biggest192797=ends[24];
        }
        if(biggest192797 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest192797 == 0){
          S166307=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread192792(int [] tdone, int [] ends){
        switch(S166281){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(time.getprestatus()){//sysj\ECSController.sysj line: 223, column: 11
          if((Integer)(time.getpreval() == null ? null : ((Integer)time.getpreval())) >= 9 && (Integer)(time.getpreval() == null ? null : ((Integer)time.getpreval())) < 17){//sysj\ECSController.sysj line: 224, column: 9
            System.out.println("Office Hour");//sysj\ECSController.sysj line: 225, column: 6
            officeHour_1.setPresent();//sysj\ECSController.sysj line: 226, column: 6
            currsigs.addElement(officeHour_1);
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
          else {
            System.out.println("Not Office Hour");//sysj\ECSController.sysj line: 228, column: 6
            notOfficeHour_1.setPresent();//sysj\ECSController.sysj line: 229, column: 6
            currsigs.addElement(notOfficeHour_1);
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread192790(int [] tdone, int [] ends){
        S166131=1;
    S166130=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread192789(int [] tdone, int [] ends){
        S166112=1;
    S166111=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread192788(int [] tdone, int [] ends){
        S166093=1;
    S166092=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread192786(int [] tdone, int [] ends){
        switch(S166131){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S166130){
          case 0 : 
            if(manufactureSmoke.getprestatus()){//sysj\ECSController.sysj line: 213, column: 13
              S166130=1;
              System.out.println("smoke detected, activating siren - storage");//sysj\ECSController.sysj line: 215, column: 7
              manufactureSiren.setPresent();//sysj\ECSController.sysj line: 216, column: 7
              currsigs.addElement(manufactureSiren);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            if(!manufactureSmoke.getprestatus()){//sysj\ECSController.sysj line: 214, column: 13
              S166131=0;
              active[19]=0;
              ends[19]=0;
              tdone[19]=1;
            }
            else {
              manufactureSiren.setPresent();//sysj\ECSController.sysj line: 216, column: 7
              currsigs.addElement(manufactureSiren);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192785(int [] tdone, int [] ends){
        switch(S166112){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S166111){
          case 0 : 
            if(storageSmoke.getprestatus()){//sysj\ECSController.sysj line: 206, column: 13
              S166111=1;
              System.out.println("smoke detected, activating siren - storage");//sysj\ECSController.sysj line: 208, column: 7
              storageSiren.setPresent();//sysj\ECSController.sysj line: 209, column: 7
              currsigs.addElement(storageSiren);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            if(!storageSmoke.getprestatus()){//sysj\ECSController.sysj line: 207, column: 13
              S166112=0;
              active[18]=0;
              ends[18]=0;
              tdone[18]=1;
            }
            else {
              storageSiren.setPresent();//sysj\ECSController.sysj line: 209, column: 7
              currsigs.addElement(storageSiren);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192784(int [] tdone, int [] ends){
        switch(S166093){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S166092){
          case 0 : 
            if(officeSmoke.getprestatus()){//sysj\ECSController.sysj line: 199, column: 13
              S166092=1;
              System.out.println("smoke detected, activating siren - office");//sysj\ECSController.sysj line: 201, column: 7
              officeSiren.setPresent();//sysj\ECSController.sysj line: 202, column: 7
              currsigs.addElement(officeSiren);
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
          
          case 1 : 
            if(!officeSmoke.getprestatus()){//sysj\ECSController.sysj line: 200, column: 13
              S166093=0;
              active[17]=0;
              ends[17]=0;
              tdone[17]=1;
            }
            else {
              officeSiren.setPresent();//sysj\ECSController.sysj line: 202, column: 7
              currsigs.addElement(officeSiren);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192783(int [] tdone, int [] ends){
        switch(S166247){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread192784(tdone,ends);
        thread192785(tdone,ends);
        thread192786(tdone,ends);
        int biggest192787 = 0;
        if(ends[17]>=biggest192787){
          biggest192787=ends[17];
        }
        if(ends[18]>=biggest192787){
          biggest192787=ends[18];
        }
        if(ends[19]>=biggest192787){
          biggest192787=ends[19];
        }
        if(biggest192787 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest192787 == 0){
          thread192788(tdone,ends);
          thread192789(tdone,ends);
          thread192790(tdone,ends);
          int biggest192791 = 0;
          if(ends[17]>=biggest192791){
            biggest192791=ends[17];
          }
          if(ends[18]>=biggest192791){
            biggest192791=ends[18];
          }
          if(ends[19]>=biggest192791){
            biggest192791=ends[19];
          }
          if(biggest192791 == 1){
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
          }
        }
        break;
      
    }
  }

  public void thread192781(int [] tdone, int [] ends){
        switch(S165742){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(manufactureHIR.getprestatus()){//sysj\ECSController.sysj line: 186, column: 15
          System.out.println("Not office hour- human detected, light on 100 for manufacture");//sysj\ECSController.sysj line: 188, column: 9
          manufactureLight100.setPresent();//sysj\ECSController.sysj line: 189, column: 9
          currsigs.addElement(manufactureLight100);
          S165742=0;
          active[15]=0;
          ends[15]=0;
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

  public void thread192780(int [] tdone, int [] ends){
        switch(S165735){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S165734){
          case 0 : 
            if(storageHIR.getprestatus()){//sysj\ECSController.sysj line: 177, column: 15
              S165734=1;
              System.out.println("Not office hour- human detected, light on 100 for storage");//sysj\ECSController.sysj line: 179, column: 9
              storageLight100.setPresent();//sysj\ECSController.sysj line: 180, column: 9
              currsigs.addElement(storageLight100);
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
          
          case 1 : 
            if(!storageHIR.getprestatus()){//sysj\ECSController.sysj line: 178, column: 15
              S165735=0;
              active[14]=0;
              ends[14]=0;
              tdone[14]=1;
            }
            else {
              storageLight100.setPresent();//sysj\ECSController.sysj line: 180, column: 9
              currsigs.addElement(storageLight100);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192779(int [] tdone, int [] ends){
        switch(S165716){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S165715){
          case 0 : 
            if(officeHIR.getprestatus()){//sysj\ECSController.sysj line: 168, column: 15
              S165715=1;
              System.out.println("Not office hour- human detected, light on 100 for office");//sysj\ECSController.sysj line: 170, column: 9
              officeLight100.setPresent();//sysj\ECSController.sysj line: 171, column: 9
              currsigs.addElement(officeLight100);
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
          
          case 1 : 
            if(!officeHIR.getprestatus()){//sysj\ECSController.sysj line: 169, column: 15
              S165716=0;
              active[13]=0;
              ends[13]=0;
              tdone[13]=1;
            }
            else {
              officeLight100.setPresent();//sysj\ECSController.sysj line: 171, column: 9
              currsigs.addElement(officeLight100);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192777(int [] tdone, int [] ends){
        S165742=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread192776(int [] tdone, int [] ends){
        S165735=1;
    S165734=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread192775(int [] tdone, int [] ends){
        S165716=1;
    S165715=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread192774(int [] tdone, int [] ends){
        switch(S166074){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S165790){
          case 0 : 
            if(notOfficeHour_1.getprestatus()){//sysj\ECSController.sysj line: 163, column: 12
              S165790=1;
              thread192775(tdone,ends);
              thread192776(tdone,ends);
              thread192777(tdone,ends);
              int biggest192778 = 0;
              if(ends[13]>=biggest192778){
                biggest192778=ends[13];
              }
              if(ends[14]>=biggest192778){
                biggest192778=ends[14];
              }
              if(ends[15]>=biggest192778){
                biggest192778=ends[15];
              }
              if(biggest192778 == 1){
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            if(officeHour_1.getprestatus()){//sysj\ECSController.sysj line: 164, column: 12
              S165790=0;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              thread192779(tdone,ends);
              thread192780(tdone,ends);
              thread192781(tdone,ends);
              int biggest192782 = 0;
              if(ends[13]>=biggest192782){
                biggest192782=ends[13];
              }
              if(ends[14]>=biggest192782){
                biggest192782=ends[14];
              }
              if(ends[15]>=biggest192782){
                biggest192782=ends[15];
              }
              if(biggest192782 == 1){
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              //FINXME code
              if(biggest192782 == 0){
                S165790=0;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192772(int [] tdone, int [] ends){
        switch(S161606){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S161572){
          case 0 : 
            if(manufactureLumen.getprestatus()){//sysj\ECSController.sysj line: 147, column: 13
              S161572=1;
              if((Integer)(manufactureLumen.getpreval() == null ? null : ((Integer)manufactureLumen.getpreval())) < 30){//sysj\ECSController.sysj line: 148, column: 11
                S161556=0;
                System.out.println("Office Hour turn the light on 80 - manufacture");//sysj\ECSController.sysj line: 149, column: 9
                manufactureLight80.setPresent();//sysj\ECSController.sysj line: 150, column: 9
                currsigs.addElement(manufactureLight80);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S161556=1;
                System.out.println("Office Hour turn the light on 50 - manufacture");//sysj\ECSController.sysj line: 152, column: 9
                manufactureLight50.setPresent();//sysj\ECSController.sysj line: 153, column: 9
                currsigs.addElement(manufactureLight50);
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
            switch(S161556){
              case 0 : 
                manufactureLight80.setPresent();//sysj\ECSController.sysj line: 150, column: 9
                currsigs.addElement(manufactureLight80);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
                break;
              
              case 1 : 
                manufactureLight50.setPresent();//sysj\ECSController.sysj line: 153, column: 9
                currsigs.addElement(manufactureLight50);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192771(int [] tdone, int [] ends){
        switch(S161540){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S161506){
          case 0 : 
            if(storageLumen.getprestatus()){//sysj\ECSController.sysj line: 134, column: 13
              S161506=1;
              if((Integer)(storageLumen.getpreval() == null ? null : ((Integer)storageLumen.getpreval())) < 30){//sysj\ECSController.sysj line: 135, column: 11
                S161490=0;
                System.out.println("Office Hour turn the light on 80 - storage");//sysj\ECSController.sysj line: 136, column: 9
                storageLight80.setPresent();//sysj\ECSController.sysj line: 137, column: 9
                currsigs.addElement(storageLight80);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S161490=1;
                System.out.println("Office Hour turn the light on 50 - storage");//sysj\ECSController.sysj line: 139, column: 9
                storageLight50.setPresent();//sysj\ECSController.sysj line: 140, column: 9
                currsigs.addElement(storageLight50);
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
            switch(S161490){
              case 0 : 
                storageLight80.setPresent();//sysj\ECSController.sysj line: 137, column: 9
                currsigs.addElement(storageLight80);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
                break;
              
              case 1 : 
                storageLight50.setPresent();//sysj\ECSController.sysj line: 140, column: 9
                currsigs.addElement(storageLight50);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192770(int [] tdone, int [] ends){
        switch(S161474){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S161440){
          case 0 : 
            if(officeLumen.getprestatus()){//sysj\ECSController.sysj line: 121, column: 13
              S161440=1;
              if((Integer)(officeLumen.getpreval() == null ? null : ((Integer)officeLumen.getpreval())) < 30){//sysj\ECSController.sysj line: 122, column: 11
                S161424=0;
                System.out.println("Office Hour turn the light on 80 - office");//sysj\ECSController.sysj line: 123, column: 8
                officeLight80.setPresent();//sysj\ECSController.sysj line: 124, column: 8
                currsigs.addElement(officeLight80);
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                S161424=1;
                System.out.println("Office Hour turn the light on 50 - office");//sysj\ECSController.sysj line: 126, column: 8
                officeLight50.setPresent();//sysj\ECSController.sysj line: 127, column: 8
                currsigs.addElement(officeLight50);
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
            switch(S161424){
              case 0 : 
                officeLight80.setPresent();//sysj\ECSController.sysj line: 124, column: 8
                currsigs.addElement(officeLight80);
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
                break;
              
              case 1 : 
                officeLight50.setPresent();//sysj\ECSController.sysj line: 127, column: 8
                currsigs.addElement(officeLight50);
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192769(int [] tdone, int [] ends){
        switch(S161408){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S161370){
          case 0 : 
            if(manufactureHumidity.getprestatus()){//sysj\ECSController.sysj line: 109, column: 13
              S161370=1;
              if((Integer)(manufactureHumidity.getpreval() == null ? null : ((Integer)manufactureHumidity.getpreval())) > 60){//sysj\ECSController.sysj line: 110, column: 11
                System.out.println("manufacture Dehumidifier ON");//sysj\ECSController.sysj line: 111, column: 8
                manufactureDehumidifier.setPresent();//sysj\ECSController.sysj line: 112, column: 8
                currsigs.addElement(manufactureDehumidifier);
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                System.out.println("Dehumidifier not operating");//sysj\ECSController.sysj line: 114, column: 9
                S161370=0;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            manufactureDehumidifier.setPresent();//sysj\ECSController.sysj line: 112, column: 8
            currsigs.addElement(manufactureDehumidifier);
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread192768(int [] tdone, int [] ends){
        switch(S161352){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S161314){
          case 0 : 
            if(storageHumidity.getprestatus()){//sysj\ECSController.sysj line: 97, column: 13
              S161314=1;
              if((Integer)(storageHumidity.getpreval() == null ? null : ((Integer)storageHumidity.getpreval())) > 60){//sysj\ECSController.sysj line: 98, column: 11
                System.out.println("storage Dehumidifier ON");//sysj\ECSController.sysj line: 99, column: 8
                storageDehumidifier.setPresent();//sysj\ECSController.sysj line: 100, column: 8
                currsigs.addElement(storageDehumidifier);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                System.out.println("storage Dehumidifier not operating");//sysj\ECSController.sysj line: 102, column: 9
                S161314=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            storageDehumidifier.setPresent();//sysj\ECSController.sysj line: 100, column: 8
            currsigs.addElement(storageDehumidifier);
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread192767(int [] tdone, int [] ends){
        switch(S161296){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S161258){
          case 0 : 
            if(officeHumidity.getprestatus()){//sysj\ECSController.sysj line: 85, column: 13
              S161258=1;
              if((Integer)(officeHumidity.getpreval() == null ? null : ((Integer)officeHumidity.getpreval())) > 60){//sysj\ECSController.sysj line: 86, column: 11
                System.out.println("office Dehumidifier ON");//sysj\ECSController.sysj line: 87, column: 8
                officeDehumidifier.setPresent();//sysj\ECSController.sysj line: 88, column: 8
                currsigs.addElement(officeDehumidifier);
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                System.out.println("office Dehumidifier not operating");//sysj\ECSController.sysj line: 90, column: 9
                S161258=0;
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
            officeDehumidifier.setPresent();//sysj\ECSController.sysj line: 88, column: 8
            currsigs.addElement(officeDehumidifier);
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread192766(int [] tdone, int [] ends){
        switch(S161240){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S161202){
          case 0 : 
            if(storageTemp.getprestatus()){//sysj\ECSController.sysj line: 73, column: 13
              S161202=1;
              if((Integer)(manufactureTemp.getpreval() == null ? null : ((Integer)manufactureTemp.getpreval())) > 23){//sysj\ECSController.sysj line: 74, column: 11
                System.out.println("manufacture AC ON");//sysj\ECSController.sysj line: 75, column: 8
                manufactureAC.setPresent();//sysj\ECSController.sysj line: 76, column: 8
                currsigs.addElement(manufactureAC);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                System.out.println("manufacture AC not operating");//sysj\ECSController.sysj line: 78, column: 9
                S161202=0;
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
            manufactureAC.setPresent();//sysj\ECSController.sysj line: 76, column: 8
            currsigs.addElement(manufactureAC);
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread192765(int [] tdone, int [] ends){
        switch(S161184){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S161146){
          case 0 : 
            if(storageTemp.getprestatus()){//sysj\ECSController.sysj line: 61, column: 13
              S161146=1;
              if((Integer)(storageTemp.getpreval() == null ? null : ((Integer)storageTemp.getpreval())) > 23){//sysj\ECSController.sysj line: 62, column: 11
                System.out.println("storage AC ON");//sysj\ECSController.sysj line: 63, column: 8
                storageAC.setPresent();//sysj\ECSController.sysj line: 64, column: 8
                currsigs.addElement(storageAC);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                System.out.println("storage AC not operating");//sysj\ECSController.sysj line: 66, column: 9
                S161146=0;
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
            storageAC.setPresent();//sysj\ECSController.sysj line: 64, column: 8
            currsigs.addElement(storageAC);
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread192764(int [] tdone, int [] ends){
        switch(S161128){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S161058){
          case 0 : 
            if(officeTemp.getprestatus()){//sysj\ECSController.sysj line: 46, column: 13
              S161058=1;
              if((Integer)(officeTemp.getpreval() == null ? null : ((Integer)officeTemp.getpreval())) > 23){//sysj\ECSController.sysj line: 47, column: 11
                S161041=0;
                System.out.println("office AC ON");//sysj\ECSController.sysj line: 48, column: 8
                officeAC.setPresent();//sysj\ECSController.sysj line: 49, column: 8
                currsigs.addElement(officeAC);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S161041=1;
                if((Integer)(officeTemp.getpreval() == null ? null : ((Integer)officeTemp.getpreval())) < 23){//sysj\ECSController.sysj line: 50, column: 19
                  System.out.println("office Heater ON");//sysj\ECSController.sysj line: 51, column: 9
                  officeHeater.setPresent();//sysj\ECSController.sysj line: 52, column: 9
                  currsigs.addElement(officeHeater);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  System.out.println("office AC and Heater not operating");//sysj\ECSController.sysj line: 54, column: 9
                  S161058=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            switch(S161041){
              case 0 : 
                officeAC.setPresent();//sysj\ECSController.sysj line: 49, column: 8
                currsigs.addElement(officeAC);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
                break;
              
              case 1 : 
                officeHeater.setPresent();//sysj\ECSController.sysj line: 52, column: 9
                currsigs.addElement(officeHeater);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192762(int [] tdone, int [] ends){
        S161606=1;
    S161572=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread192761(int [] tdone, int [] ends){
        S161540=1;
    S161506=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread192760(int [] tdone, int [] ends){
        S161474=1;
    S161440=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread192759(int [] tdone, int [] ends){
        S161408=1;
    S161370=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread192758(int [] tdone, int [] ends){
        S161352=1;
    S161314=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread192757(int [] tdone, int [] ends){
        S161296=1;
    S161258=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread192756(int [] tdone, int [] ends){
        S161240=1;
    S161202=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread192755(int [] tdone, int [] ends){
        S161184=1;
    S161146=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread192754(int [] tdone, int [] ends){
        S161128=1;
    S161058=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread192753(int [] tdone, int [] ends){
        switch(S165696){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S161024){
          case 0 : 
            if(officeHour_1.getprestatus()){//sysj\ECSController.sysj line: 41, column: 11
              System.out.println("office hour now- working with Temp");//sysj\ECSController.sysj line: 42, column: 5
              S161024=1;
              thread192754(tdone,ends);
              thread192755(tdone,ends);
              thread192756(tdone,ends);
              thread192757(tdone,ends);
              thread192758(tdone,ends);
              thread192759(tdone,ends);
              thread192760(tdone,ends);
              thread192761(tdone,ends);
              thread192762(tdone,ends);
              int biggest192763 = 0;
              if(ends[3]>=biggest192763){
                biggest192763=ends[3];
              }
              if(ends[4]>=biggest192763){
                biggest192763=ends[4];
              }
              if(ends[5]>=biggest192763){
                biggest192763=ends[5];
              }
              if(ends[6]>=biggest192763){
                biggest192763=ends[6];
              }
              if(ends[7]>=biggest192763){
                biggest192763=ends[7];
              }
              if(ends[8]>=biggest192763){
                biggest192763=ends[8];
              }
              if(ends[9]>=biggest192763){
                biggest192763=ends[9];
              }
              if(ends[10]>=biggest192763){
                biggest192763=ends[10];
              }
              if(ends[11]>=biggest192763){
                biggest192763=ends[11];
              }
              if(biggest192763 == 1){
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
            if(notOfficeHour_1.getprestatus()){//sysj\ECSController.sysj line: 43, column: 11
              S161024=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread192764(tdone,ends);
              thread192765(tdone,ends);
              thread192766(tdone,ends);
              thread192767(tdone,ends);
              thread192768(tdone,ends);
              thread192769(tdone,ends);
              thread192770(tdone,ends);
              thread192771(tdone,ends);
              thread192772(tdone,ends);
              int biggest192773 = 0;
              if(ends[3]>=biggest192773){
                biggest192773=ends[3];
              }
              if(ends[4]>=biggest192773){
                biggest192773=ends[4];
              }
              if(ends[5]>=biggest192773){
                biggest192773=ends[5];
              }
              if(ends[6]>=biggest192773){
                biggest192773=ends[6];
              }
              if(ends[7]>=biggest192773){
                biggest192773=ends[7];
              }
              if(ends[8]>=biggest192773){
                biggest192773=ends[8];
              }
              if(ends[9]>=biggest192773){
                biggest192773=ends[9];
              }
              if(ends[10]>=biggest192773){
                biggest192773=ends[10];
              }
              if(ends[11]>=biggest192773){
                biggest192773=ends[11];
              }
              if(biggest192773 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest192773 == 0){
                S161024=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192750(int [] tdone, int [] ends){
        S166305=1;
    if(manufactureSmoke.getprestatus()){//sysj\ECSController.sysj line: 239, column: 25
      manufactureSirenA.setPresent();//sysj\ECSController.sysj line: 239, column: 43
      currsigs.addElement(manufactureSirenA);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread192749(int [] tdone, int [] ends){
        S166297=1;
    if(storageSmoke.getprestatus()){//sysj\ECSController.sysj line: 237, column: 25
      storageSirenA.setPresent();//sysj\ECSController.sysj line: 237, column: 39
      currsigs.addElement(storageSirenA);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread192748(int [] tdone, int [] ends){
        S166289=1;
    if(officeSmoke.getprestatus()){//sysj\ECSController.sysj line: 235, column: 25
      officeSirenA.setPresent();//sysj\ECSController.sysj line: 235, column: 38
      currsigs.addElement(officeSirenA);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread192747(int [] tdone, int [] ends){
        S166307=1;
    thread192748(tdone,ends);
    thread192749(tdone,ends);
    thread192750(tdone,ends);
    int biggest192751 = 0;
    if(ends[22]>=biggest192751){
      biggest192751=ends[22];
    }
    if(ends[23]>=biggest192751){
      biggest192751=ends[23];
    }
    if(ends[24]>=biggest192751){
      biggest192751=ends[24];
    }
    if(biggest192751 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread192746(int [] tdone, int [] ends){
        S166281=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread192744(int [] tdone, int [] ends){
        S166131=1;
    S166130=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread192743(int [] tdone, int [] ends){
        S166112=1;
    S166111=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread192742(int [] tdone, int [] ends){
        S166093=1;
    S166092=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread192741(int [] tdone, int [] ends){
        S166247=1;
    thread192742(tdone,ends);
    thread192743(tdone,ends);
    thread192744(tdone,ends);
    int biggest192745 = 0;
    if(ends[17]>=biggest192745){
      biggest192745=ends[17];
    }
    if(ends[18]>=biggest192745){
      biggest192745=ends[18];
    }
    if(ends[19]>=biggest192745){
      biggest192745=ends[19];
    }
    if(biggest192745 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread192740(int [] tdone, int [] ends){
        S166074=1;
    S165790=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread192739(int [] tdone, int [] ends){
        S165696=1;
    S161024=0;
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
      switch(S192737){
        case 0 : 
          S192737=0;
          break RUN;
        
        case 1 : 
          S192737=2;
          S192737=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\ECSController.sysj line: 16, column: 3
            public void run() {//sysj\ECSController.sysj line: 29, column: 21
              org.compsys704.ECSGUI.main(null);//sysj\ECSController.sysj line: 30, column: 4
            }
            GUI(){//sysj\ECSController.sysj line: 28, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\ECSController.sysj line: 33, column: 2
          officeHour_1.setClear();//sysj\ECSController.sysj line: 35, column: 2
          notOfficeHour_1.setClear();//sysj\ECSController.sysj line: 35, column: 2
          thread192739(tdone,ends);
          thread192740(tdone,ends);
          thread192741(tdone,ends);
          thread192746(tdone,ends);
          thread192747(tdone,ends);
          int biggest192752 = 0;
          if(ends[2]>=biggest192752){
            biggest192752=ends[2];
          }
          if(ends[12]>=biggest192752){
            biggest192752=ends[12];
          }
          if(ends[16]>=biggest192752){
            biggest192752=ends[16];
          }
          if(ends[20]>=biggest192752){
            biggest192752=ends[20];
          }
          if(ends[21]>=biggest192752){
            biggest192752=ends[21];
          }
          if(biggest192752 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          officeHour_1.setClear();//sysj\ECSController.sysj line: 35, column: 2
          notOfficeHour_1.setClear();//sysj\ECSController.sysj line: 35, column: 2
          thread192753(tdone,ends);
          thread192774(tdone,ends);
          thread192783(tdone,ends);
          thread192792(tdone,ends);
          thread192793(tdone,ends);
          int biggest192798 = 0;
          if(ends[2]>=biggest192798){
            biggest192798=ends[2];
          }
          if(ends[12]>=biggest192798){
            biggest192798=ends[12];
          }
          if(ends[16]>=biggest192798){
            biggest192798=ends[16];
          }
          if(ends[20]>=biggest192798){
            biggest192798=ends[20];
          }
          if(ends[21]>=biggest192798){
            biggest192798=ends[21];
          }
          if(biggest192798 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest192798 == 0){
            thread192799(tdone,ends);
            thread192800(tdone,ends);
            thread192801(tdone,ends);
            thread192806(tdone,ends);
            thread192807(tdone,ends);
            int biggest192812 = 0;
            if(ends[2]>=biggest192812){
              biggest192812=ends[2];
            }
            if(ends[12]>=biggest192812){
              biggest192812=ends[12];
            }
            if(ends[16]>=biggest192812){
              biggest192812=ends[16];
            }
            if(ends[20]>=biggest192812){
              biggest192812=ends[20];
            }
            if(ends[21]>=biggest192812){
              biggest192812=ends[21];
            }
            if(biggest192812 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    officeHour_1 = new Signal();
    notOfficeHour_1 = new Signal();
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
          officeTemp.gethook();
          officeHumidity.gethook();
          officeLumen.gethook();
          storageTemp.gethook();
          storageHumidity.gethook();
          storageLumen.gethook();
          manufactureTemp.gethook();
          manufactureHumidity.gethook();
          manufactureLumen.gethook();
          officeHIR.gethook();
          storageHIR.gethook();
          manufactureHIR.gethook();
          officeSmoke.gethook();
          storageSmoke.gethook();
          manufactureSmoke.gethook();
          time.gethook();
          df = true;
        }
        runClockDomain();
      }
      officeTemp.setpreclear();
      officeHumidity.setpreclear();
      officeLumen.setpreclear();
      storageTemp.setpreclear();
      storageHumidity.setpreclear();
      storageLumen.setpreclear();
      manufactureTemp.setpreclear();
      manufactureHumidity.setpreclear();
      manufactureLumen.setpreclear();
      officeHIR.setpreclear();
      storageHIR.setpreclear();
      manufactureHIR.setpreclear();
      officeSmoke.setpreclear();
      storageSmoke.setpreclear();
      manufactureSmoke.setpreclear();
      time.setpreclear();
      officeAC.setpreclear();
      officeHeater.setpreclear();
      officeDehumidifier.setpreclear();
      officeLight100.setpreclear();
      officeLight80.setpreclear();
      officeLight50.setpreclear();
      officeLight0.setpreclear();
      storageAC.setpreclear();
      storageDehumidifier.setpreclear();
      storageLight100.setpreclear();
      storageLight80.setpreclear();
      storageLight50.setpreclear();
      storageLight0.setpreclear();
      manufactureAC.setpreclear();
      manufactureDehumidifier.setpreclear();
      manufactureLight100.setpreclear();
      manufactureLight80.setpreclear();
      manufactureLight50.setpreclear();
      manufactureLight0.setpreclear();
      officeSiren.setpreclear();
      storageSiren.setpreclear();
      manufactureSiren.setpreclear();
      officeSirenA.setpreclear();
      storageSirenA.setpreclear();
      manufactureSirenA.setpreclear();
      officeOccupancy.setpreclear();
      storageOccupancy.setpreclear();
      manufactureOccupancy.setpreclear();
      officeHour_1.setpreclear();
      notOfficeHour_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = officeTemp.getStatus() ? officeTemp.setprepresent() : officeTemp.setpreclear();
      officeTemp.setpreval(officeTemp.getValue());
      officeTemp.setClear();
      dummyint = officeHumidity.getStatus() ? officeHumidity.setprepresent() : officeHumidity.setpreclear();
      officeHumidity.setpreval(officeHumidity.getValue());
      officeHumidity.setClear();
      dummyint = officeLumen.getStatus() ? officeLumen.setprepresent() : officeLumen.setpreclear();
      officeLumen.setpreval(officeLumen.getValue());
      officeLumen.setClear();
      dummyint = storageTemp.getStatus() ? storageTemp.setprepresent() : storageTemp.setpreclear();
      storageTemp.setpreval(storageTemp.getValue());
      storageTemp.setClear();
      dummyint = storageHumidity.getStatus() ? storageHumidity.setprepresent() : storageHumidity.setpreclear();
      storageHumidity.setpreval(storageHumidity.getValue());
      storageHumidity.setClear();
      dummyint = storageLumen.getStatus() ? storageLumen.setprepresent() : storageLumen.setpreclear();
      storageLumen.setpreval(storageLumen.getValue());
      storageLumen.setClear();
      dummyint = manufactureTemp.getStatus() ? manufactureTemp.setprepresent() : manufactureTemp.setpreclear();
      manufactureTemp.setpreval(manufactureTemp.getValue());
      manufactureTemp.setClear();
      dummyint = manufactureHumidity.getStatus() ? manufactureHumidity.setprepresent() : manufactureHumidity.setpreclear();
      manufactureHumidity.setpreval(manufactureHumidity.getValue());
      manufactureHumidity.setClear();
      dummyint = manufactureLumen.getStatus() ? manufactureLumen.setprepresent() : manufactureLumen.setpreclear();
      manufactureLumen.setpreval(manufactureLumen.getValue());
      manufactureLumen.setClear();
      dummyint = officeHIR.getStatus() ? officeHIR.setprepresent() : officeHIR.setpreclear();
      officeHIR.setpreval(officeHIR.getValue());
      officeHIR.setClear();
      dummyint = storageHIR.getStatus() ? storageHIR.setprepresent() : storageHIR.setpreclear();
      storageHIR.setpreval(storageHIR.getValue());
      storageHIR.setClear();
      dummyint = manufactureHIR.getStatus() ? manufactureHIR.setprepresent() : manufactureHIR.setpreclear();
      manufactureHIR.setpreval(manufactureHIR.getValue());
      manufactureHIR.setClear();
      dummyint = officeSmoke.getStatus() ? officeSmoke.setprepresent() : officeSmoke.setpreclear();
      officeSmoke.setpreval(officeSmoke.getValue());
      officeSmoke.setClear();
      dummyint = storageSmoke.getStatus() ? storageSmoke.setprepresent() : storageSmoke.setpreclear();
      storageSmoke.setpreval(storageSmoke.getValue());
      storageSmoke.setClear();
      dummyint = manufactureSmoke.getStatus() ? manufactureSmoke.setprepresent() : manufactureSmoke.setpreclear();
      manufactureSmoke.setpreval(manufactureSmoke.getValue());
      manufactureSmoke.setClear();
      dummyint = time.getStatus() ? time.setprepresent() : time.setpreclear();
      time.setpreval(time.getValue());
      time.setClear();
      officeAC.sethook();
      officeAC.setClear();
      officeHeater.sethook();
      officeHeater.setClear();
      officeDehumidifier.sethook();
      officeDehumidifier.setClear();
      officeLight100.sethook();
      officeLight100.setClear();
      officeLight80.sethook();
      officeLight80.setClear();
      officeLight50.sethook();
      officeLight50.setClear();
      officeLight0.sethook();
      officeLight0.setClear();
      storageAC.sethook();
      storageAC.setClear();
      storageDehumidifier.sethook();
      storageDehumidifier.setClear();
      storageLight100.sethook();
      storageLight100.setClear();
      storageLight80.sethook();
      storageLight80.setClear();
      storageLight50.sethook();
      storageLight50.setClear();
      storageLight0.sethook();
      storageLight0.setClear();
      manufactureAC.sethook();
      manufactureAC.setClear();
      manufactureDehumidifier.sethook();
      manufactureDehumidifier.setClear();
      manufactureLight100.sethook();
      manufactureLight100.setClear();
      manufactureLight80.sethook();
      manufactureLight80.setClear();
      manufactureLight50.sethook();
      manufactureLight50.setClear();
      manufactureLight0.sethook();
      manufactureLight0.setClear();
      officeSiren.sethook();
      officeSiren.setClear();
      storageSiren.sethook();
      storageSiren.setClear();
      manufactureSiren.sethook();
      manufactureSiren.setClear();
      officeSirenA.sethook();
      officeSirenA.setClear();
      storageSirenA.sethook();
      storageSirenA.setClear();
      manufactureSirenA.sethook();
      manufactureSirenA.setClear();
      officeOccupancy.sethook();
      officeOccupancy.setClear();
      storageOccupancy.sethook();
      storageOccupancy.setClear();
      manufactureOccupancy.sethook();
      manufactureOccupancy.setClear();
      officeHour_1.setClear();
      notOfficeHour_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        officeTemp.gethook();
        officeHumidity.gethook();
        officeLumen.gethook();
        storageTemp.gethook();
        storageHumidity.gethook();
        storageLumen.gethook();
        manufactureTemp.gethook();
        manufactureHumidity.gethook();
        manufactureLumen.gethook();
        officeHIR.gethook();
        storageHIR.gethook();
        manufactureHIR.gethook();
        officeSmoke.gethook();
        storageSmoke.gethook();
        manufactureSmoke.gethook();
        time.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
