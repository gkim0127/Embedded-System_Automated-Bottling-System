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
  private int S52727 = 1;
  private int S25686 = 1;
  private int S21014 = 1;
  private int S21118 = 1;
  private int S21048 = 1;
  private int S21031 = 1;
  private int S21174 = 1;
  private int S21136 = 1;
  private int S21230 = 1;
  private int S21192 = 1;
  private int S21286 = 1;
  private int S21248 = 1;
  private int S21342 = 1;
  private int S21304 = 1;
  private int S21398 = 1;
  private int S21360 = 1;
  private int S21464 = 1;
  private int S21430 = 1;
  private int S21414 = 1;
  private int S21530 = 1;
  private int S21496 = 1;
  private int S21480 = 1;
  private int S21596 = 1;
  private int S21562 = 1;
  private int S21546 = 1;
  private int S26064 = 1;
  private int S25780 = 1;
  private int S25706 = 1;
  private int S25705 = 1;
  private int S25725 = 1;
  private int S25724 = 1;
  private int S25732 = 1;
  private int S26237 = 1;
  private int S26083 = 1;
  private int S26082 = 1;
  private int S26102 = 1;
  private int S26101 = 1;
  private int S26121 = 1;
  private int S26120 = 1;
  private int S26271 = 1;
  private int S26297 = 1;
  private int S26279 = 1;
  private int S26287 = 1;
  private int S26295 = 1;
  
  private int[] ends = new int[25];
  private int[] tdone = new int[25];
  
  public void thread52800(int [] tdone, int [] ends){
        S26295=1;
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

  public void thread52799(int [] tdone, int [] ends){
        S26287=1;
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

  public void thread52798(int [] tdone, int [] ends){
        S26279=1;
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

  public void thread52797(int [] tdone, int [] ends){
        S26297=1;
    thread52798(tdone,ends);
    thread52799(tdone,ends);
    thread52800(tdone,ends);
    int biggest52801 = 0;
    if(ends[22]>=biggest52801){
      biggest52801=ends[22];
    }
    if(ends[23]>=biggest52801){
      biggest52801=ends[23];
    }
    if(ends[24]>=biggest52801){
      biggest52801=ends[24];
    }
    if(biggest52801 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread52796(int [] tdone, int [] ends){
        S26271=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread52794(int [] tdone, int [] ends){
        S26121=1;
    S26120=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread52793(int [] tdone, int [] ends){
        S26102=1;
    S26101=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread52792(int [] tdone, int [] ends){
        S26083=1;
    S26082=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread52791(int [] tdone, int [] ends){
        S26237=1;
    thread52792(tdone,ends);
    thread52793(tdone,ends);
    thread52794(tdone,ends);
    int biggest52795 = 0;
    if(ends[17]>=biggest52795){
      biggest52795=ends[17];
    }
    if(ends[18]>=biggest52795){
      biggest52795=ends[18];
    }
    if(ends[19]>=biggest52795){
      biggest52795=ends[19];
    }
    if(biggest52795 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread52790(int [] tdone, int [] ends){
        S26064=1;
    S25780=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread52789(int [] tdone, int [] ends){
        S25686=1;
    S21014=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread52786(int [] tdone, int [] ends){
        switch(S26295){
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

  public void thread52785(int [] tdone, int [] ends){
        switch(S26287){
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

  public void thread52784(int [] tdone, int [] ends){
        switch(S26279){
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

  public void thread52783(int [] tdone, int [] ends){
        switch(S26297){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread52784(tdone,ends);
        thread52785(tdone,ends);
        thread52786(tdone,ends);
        int biggest52787 = 0;
        if(ends[22]>=biggest52787){
          biggest52787=ends[22];
        }
        if(ends[23]>=biggest52787){
          biggest52787=ends[23];
        }
        if(ends[24]>=biggest52787){
          biggest52787=ends[24];
        }
        if(biggest52787 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest52787 == 0){
          S26297=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread52782(int [] tdone, int [] ends){
        switch(S26271){
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

  public void thread52780(int [] tdone, int [] ends){
        S26121=1;
    S26120=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread52779(int [] tdone, int [] ends){
        S26102=1;
    S26101=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread52778(int [] tdone, int [] ends){
        S26083=1;
    S26082=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread52776(int [] tdone, int [] ends){
        switch(S26121){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S26120){
          case 0 : 
            if(manufactureSmoke.getprestatus()){//sysj\ECSController.sysj line: 213, column: 13
              S26120=1;
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
              S26121=0;
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

  public void thread52775(int [] tdone, int [] ends){
        switch(S26102){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S26101){
          case 0 : 
            if(storageSmoke.getprestatus()){//sysj\ECSController.sysj line: 206, column: 13
              S26101=1;
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
              S26102=0;
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

  public void thread52774(int [] tdone, int [] ends){
        switch(S26083){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S26082){
          case 0 : 
            if(officeSmoke.getprestatus()){//sysj\ECSController.sysj line: 199, column: 13
              S26082=1;
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
              S26083=0;
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

  public void thread52773(int [] tdone, int [] ends){
        switch(S26237){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread52774(tdone,ends);
        thread52775(tdone,ends);
        thread52776(tdone,ends);
        int biggest52777 = 0;
        if(ends[17]>=biggest52777){
          biggest52777=ends[17];
        }
        if(ends[18]>=biggest52777){
          biggest52777=ends[18];
        }
        if(ends[19]>=biggest52777){
          biggest52777=ends[19];
        }
        if(biggest52777 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest52777 == 0){
          thread52778(tdone,ends);
          thread52779(tdone,ends);
          thread52780(tdone,ends);
          int biggest52781 = 0;
          if(ends[17]>=biggest52781){
            biggest52781=ends[17];
          }
          if(ends[18]>=biggest52781){
            biggest52781=ends[18];
          }
          if(ends[19]>=biggest52781){
            biggest52781=ends[19];
          }
          if(biggest52781 == 1){
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
          }
        }
        break;
      
    }
  }

  public void thread52771(int [] tdone, int [] ends){
        switch(S25732){
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
          S25732=0;
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

  public void thread52770(int [] tdone, int [] ends){
        switch(S25725){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S25724){
          case 0 : 
            if(storageHIR.getprestatus()){//sysj\ECSController.sysj line: 177, column: 15
              S25724=1;
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
              S25725=0;
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

  public void thread52769(int [] tdone, int [] ends){
        switch(S25706){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S25705){
          case 0 : 
            if(officeHIR.getprestatus()){//sysj\ECSController.sysj line: 168, column: 15
              S25705=1;
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
              S25706=0;
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

  public void thread52767(int [] tdone, int [] ends){
        S25732=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread52766(int [] tdone, int [] ends){
        S25725=1;
    S25724=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread52765(int [] tdone, int [] ends){
        S25706=1;
    S25705=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread52764(int [] tdone, int [] ends){
        switch(S26064){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S25780){
          case 0 : 
            if(notOfficeHour_1.getprestatus()){//sysj\ECSController.sysj line: 163, column: 12
              S25780=1;
              thread52765(tdone,ends);
              thread52766(tdone,ends);
              thread52767(tdone,ends);
              int biggest52768 = 0;
              if(ends[13]>=biggest52768){
                biggest52768=ends[13];
              }
              if(ends[14]>=biggest52768){
                biggest52768=ends[14];
              }
              if(ends[15]>=biggest52768){
                biggest52768=ends[15];
              }
              if(biggest52768 == 1){
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
              S25780=0;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              thread52769(tdone,ends);
              thread52770(tdone,ends);
              thread52771(tdone,ends);
              int biggest52772 = 0;
              if(ends[13]>=biggest52772){
                biggest52772=ends[13];
              }
              if(ends[14]>=biggest52772){
                biggest52772=ends[14];
              }
              if(ends[15]>=biggest52772){
                biggest52772=ends[15];
              }
              if(biggest52772 == 1){
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              //FINXME code
              if(biggest52772 == 0){
                S25780=0;
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

  public void thread52762(int [] tdone, int [] ends){
        switch(S21596){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S21562){
          case 0 : 
            if(manufactureLumen.getprestatus()){//sysj\ECSController.sysj line: 147, column: 13
              S21562=1;
              if((Integer)(manufactureLumen.getpreval() == null ? null : ((Integer)manufactureLumen.getpreval())) < 30){//sysj\ECSController.sysj line: 148, column: 11
                S21546=0;
                System.out.println("Office Hour turn the light on 80 - manufacture");//sysj\ECSController.sysj line: 149, column: 9
                manufactureLight80.setPresent();//sysj\ECSController.sysj line: 150, column: 9
                currsigs.addElement(manufactureLight80);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S21546=1;
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
            switch(S21546){
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

  public void thread52761(int [] tdone, int [] ends){
        switch(S21530){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S21496){
          case 0 : 
            if(storageLumen.getprestatus()){//sysj\ECSController.sysj line: 134, column: 13
              S21496=1;
              if((Integer)(storageLumen.getpreval() == null ? null : ((Integer)storageLumen.getpreval())) < 30){//sysj\ECSController.sysj line: 135, column: 11
                S21480=0;
                System.out.println("Office Hour turn the light on 80 - storage");//sysj\ECSController.sysj line: 136, column: 9
                storageLight80.setPresent();//sysj\ECSController.sysj line: 137, column: 9
                currsigs.addElement(storageLight80);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S21480=1;
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
            switch(S21480){
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

  public void thread52760(int [] tdone, int [] ends){
        switch(S21464){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S21430){
          case 0 : 
            if(officeLumen.getprestatus()){//sysj\ECSController.sysj line: 121, column: 13
              S21430=1;
              if((Integer)(officeLumen.getpreval() == null ? null : ((Integer)officeLumen.getpreval())) < 30){//sysj\ECSController.sysj line: 122, column: 11
                S21414=0;
                System.out.println("Office Hour turn the light on 80 - office");//sysj\ECSController.sysj line: 123, column: 8
                officeLight80.setPresent();//sysj\ECSController.sysj line: 124, column: 8
                currsigs.addElement(officeLight80);
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                S21414=1;
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
            switch(S21414){
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

  public void thread52759(int [] tdone, int [] ends){
        switch(S21398){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S21360){
          case 0 : 
            if(manufactureHumidity.getprestatus()){//sysj\ECSController.sysj line: 109, column: 13
              S21360=1;
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
                S21360=0;
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

  public void thread52758(int [] tdone, int [] ends){
        switch(S21342){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S21304){
          case 0 : 
            if(storageHumidity.getprestatus()){//sysj\ECSController.sysj line: 97, column: 13
              S21304=1;
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
                S21304=0;
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

  public void thread52757(int [] tdone, int [] ends){
        switch(S21286){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S21248){
          case 0 : 
            if(officeHumidity.getprestatus()){//sysj\ECSController.sysj line: 85, column: 13
              S21248=1;
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
                S21248=0;
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

  public void thread52756(int [] tdone, int [] ends){
        switch(S21230){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S21192){
          case 0 : 
            if(storageTemp.getprestatus()){//sysj\ECSController.sysj line: 73, column: 13
              S21192=1;
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
                S21192=0;
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

  public void thread52755(int [] tdone, int [] ends){
        switch(S21174){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S21136){
          case 0 : 
            if(storageTemp.getprestatus()){//sysj\ECSController.sysj line: 61, column: 13
              S21136=1;
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
                S21136=0;
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

  public void thread52754(int [] tdone, int [] ends){
        switch(S21118){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S21048){
          case 0 : 
            if(officeTemp.getprestatus()){//sysj\ECSController.sysj line: 46, column: 13
              S21048=1;
              if((Integer)(officeTemp.getpreval() == null ? null : ((Integer)officeTemp.getpreval())) > 23){//sysj\ECSController.sysj line: 47, column: 11
                S21031=0;
                System.out.println("office AC ON");//sysj\ECSController.sysj line: 48, column: 8
                officeAC.setPresent();//sysj\ECSController.sysj line: 49, column: 8
                currsigs.addElement(officeAC);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S21031=1;
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
                  S21048=0;
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
            switch(S21031){
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

  public void thread52752(int [] tdone, int [] ends){
        S21596=1;
    S21562=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread52751(int [] tdone, int [] ends){
        S21530=1;
    S21496=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread52750(int [] tdone, int [] ends){
        S21464=1;
    S21430=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread52749(int [] tdone, int [] ends){
        S21398=1;
    S21360=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread52748(int [] tdone, int [] ends){
        S21342=1;
    S21304=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread52747(int [] tdone, int [] ends){
        S21286=1;
    S21248=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread52746(int [] tdone, int [] ends){
        S21230=1;
    S21192=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread52745(int [] tdone, int [] ends){
        S21174=1;
    S21136=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread52744(int [] tdone, int [] ends){
        S21118=1;
    S21048=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread52743(int [] tdone, int [] ends){
        switch(S25686){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S21014){
          case 0 : 
            if(officeHour_1.getprestatus()){//sysj\ECSController.sysj line: 41, column: 11
              System.out.println("office hour now- working with Temp");//sysj\ECSController.sysj line: 42, column: 5
              S21014=1;
              thread52744(tdone,ends);
              thread52745(tdone,ends);
              thread52746(tdone,ends);
              thread52747(tdone,ends);
              thread52748(tdone,ends);
              thread52749(tdone,ends);
              thread52750(tdone,ends);
              thread52751(tdone,ends);
              thread52752(tdone,ends);
              int biggest52753 = 0;
              if(ends[3]>=biggest52753){
                biggest52753=ends[3];
              }
              if(ends[4]>=biggest52753){
                biggest52753=ends[4];
              }
              if(ends[5]>=biggest52753){
                biggest52753=ends[5];
              }
              if(ends[6]>=biggest52753){
                biggest52753=ends[6];
              }
              if(ends[7]>=biggest52753){
                biggest52753=ends[7];
              }
              if(ends[8]>=biggest52753){
                biggest52753=ends[8];
              }
              if(ends[9]>=biggest52753){
                biggest52753=ends[9];
              }
              if(ends[10]>=biggest52753){
                biggest52753=ends[10];
              }
              if(ends[11]>=biggest52753){
                biggest52753=ends[11];
              }
              if(biggest52753 == 1){
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
              S21014=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread52754(tdone,ends);
              thread52755(tdone,ends);
              thread52756(tdone,ends);
              thread52757(tdone,ends);
              thread52758(tdone,ends);
              thread52759(tdone,ends);
              thread52760(tdone,ends);
              thread52761(tdone,ends);
              thread52762(tdone,ends);
              int biggest52763 = 0;
              if(ends[3]>=biggest52763){
                biggest52763=ends[3];
              }
              if(ends[4]>=biggest52763){
                biggest52763=ends[4];
              }
              if(ends[5]>=biggest52763){
                biggest52763=ends[5];
              }
              if(ends[6]>=biggest52763){
                biggest52763=ends[6];
              }
              if(ends[7]>=biggest52763){
                biggest52763=ends[7];
              }
              if(ends[8]>=biggest52763){
                biggest52763=ends[8];
              }
              if(ends[9]>=biggest52763){
                biggest52763=ends[9];
              }
              if(ends[10]>=biggest52763){
                biggest52763=ends[10];
              }
              if(ends[11]>=biggest52763){
                biggest52763=ends[11];
              }
              if(biggest52763 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest52763 == 0){
                S21014=0;
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

  public void thread52740(int [] tdone, int [] ends){
        S26295=1;
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

  public void thread52739(int [] tdone, int [] ends){
        S26287=1;
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

  public void thread52738(int [] tdone, int [] ends){
        S26279=1;
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

  public void thread52737(int [] tdone, int [] ends){
        S26297=1;
    thread52738(tdone,ends);
    thread52739(tdone,ends);
    thread52740(tdone,ends);
    int biggest52741 = 0;
    if(ends[22]>=biggest52741){
      biggest52741=ends[22];
    }
    if(ends[23]>=biggest52741){
      biggest52741=ends[23];
    }
    if(ends[24]>=biggest52741){
      biggest52741=ends[24];
    }
    if(biggest52741 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread52736(int [] tdone, int [] ends){
        S26271=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread52734(int [] tdone, int [] ends){
        S26121=1;
    S26120=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread52733(int [] tdone, int [] ends){
        S26102=1;
    S26101=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread52732(int [] tdone, int [] ends){
        S26083=1;
    S26082=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread52731(int [] tdone, int [] ends){
        S26237=1;
    thread52732(tdone,ends);
    thread52733(tdone,ends);
    thread52734(tdone,ends);
    int biggest52735 = 0;
    if(ends[17]>=biggest52735){
      biggest52735=ends[17];
    }
    if(ends[18]>=biggest52735){
      biggest52735=ends[18];
    }
    if(ends[19]>=biggest52735){
      biggest52735=ends[19];
    }
    if(biggest52735 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread52730(int [] tdone, int [] ends){
        S26064=1;
    S25780=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread52729(int [] tdone, int [] ends){
        S25686=1;
    S21014=0;
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
      switch(S52727){
        case 0 : 
          S52727=0;
          break RUN;
        
        case 1 : 
          S52727=2;
          S52727=2;
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
          thread52729(tdone,ends);
          thread52730(tdone,ends);
          thread52731(tdone,ends);
          thread52736(tdone,ends);
          thread52737(tdone,ends);
          int biggest52742 = 0;
          if(ends[2]>=biggest52742){
            biggest52742=ends[2];
          }
          if(ends[12]>=biggest52742){
            biggest52742=ends[12];
          }
          if(ends[16]>=biggest52742){
            biggest52742=ends[16];
          }
          if(ends[20]>=biggest52742){
            biggest52742=ends[20];
          }
          if(ends[21]>=biggest52742){
            biggest52742=ends[21];
          }
          if(biggest52742 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          officeHour_1.setClear();//sysj\ECSController.sysj line: 35, column: 2
          notOfficeHour_1.setClear();//sysj\ECSController.sysj line: 35, column: 2
          thread52743(tdone,ends);
          thread52764(tdone,ends);
          thread52773(tdone,ends);
          thread52782(tdone,ends);
          thread52783(tdone,ends);
          int biggest52788 = 0;
          if(ends[2]>=biggest52788){
            biggest52788=ends[2];
          }
          if(ends[12]>=biggest52788){
            biggest52788=ends[12];
          }
          if(ends[16]>=biggest52788){
            biggest52788=ends[16];
          }
          if(ends[20]>=biggest52788){
            biggest52788=ends[20];
          }
          if(ends[21]>=biggest52788){
            biggest52788=ends[21];
          }
          if(biggest52788 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest52788 == 0){
            thread52789(tdone,ends);
            thread52790(tdone,ends);
            thread52791(tdone,ends);
            thread52796(tdone,ends);
            thread52797(tdone,ends);
            int biggest52802 = 0;
            if(ends[2]>=biggest52802){
              biggest52802=ends[2];
            }
            if(ends[12]>=biggest52802){
              biggest52802=ends[12];
            }
            if(ends[16]>=biggest52802){
              biggest52802=ends[16];
            }
            if(ends[20]>=biggest52802){
              biggest52802=ends[20];
            }
            if(ends[21]>=biggest52802){
              biggest52802=ends[21];
            }
            if(biggest52802 == 1){
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
