import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ECSPlant extends ClockDomain{
  public ECSPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal officeAC = new Signal("officeAC", Signal.INPUT);
  public Signal officeHeater = new Signal("officeHeater", Signal.INPUT);
  public Signal officeLight = new Signal("officeLight", Signal.INPUT);
  public Signal storageAC = new Signal("storageAC", Signal.INPUT);
  public Signal storageLight = new Signal("storageLight", Signal.INPUT);
  public Signal manufactureAC = new Signal("manufactureAC", Signal.INPUT);
  public Signal manufactureLight = new Signal("manufactureLight", Signal.INPUT);
  public Signal officeSiren = new Signal("officeSiren", Signal.INPUT);
  public Signal storageSiren = new Signal("storageSiren", Signal.INPUT);
  public Signal manufactureSiren = new Signal("manufactureSiren", Signal.INPUT);
  public Signal officeDehumidifier = new Signal("officeDehumidifier", Signal.INPUT);
  public Signal storageDehumidifier = new Signal("storageDehumidifier", Signal.INPUT);
  public Signal manufactureDehumidifier = new Signal("manufactureDehumidifier", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal officeACOn = new Signal("officeACOn", Signal.OUTPUT);
  public Signal officeACOff = new Signal("officeACOff", Signal.OUTPUT);
  public Signal storageACOn = new Signal("storageACOn", Signal.OUTPUT);
  public Signal storageACOff = new Signal("storageACOff", Signal.OUTPUT);
  public Signal manufactureACOn = new Signal("manufactureACOn", Signal.OUTPUT);
  public Signal manufactureACOff = new Signal("manufactureACOff", Signal.OUTPUT);
  public Signal officeHeaterOn = new Signal("officeHeaterOn", Signal.OUTPUT);
  public Signal officeHeaterOff = new Signal("officeHeaterOff", Signal.OUTPUT);
  public Signal officeLight100 = new Signal("officeLight100", Signal.OUTPUT);
  public Signal officeLight50 = new Signal("officeLight50", Signal.OUTPUT);
  public Signal officeLight0 = new Signal("officeLight0", Signal.OUTPUT);
  public Signal storageLight100 = new Signal("storageLight100", Signal.OUTPUT);
  public Signal storageLight50 = new Signal("storageLight50", Signal.OUTPUT);
  public Signal storageLight0 = new Signal("storageLight0", Signal.OUTPUT);
  public Signal manufactureLight100 = new Signal("manufactureLight100", Signal.OUTPUT);
  public Signal manufactureLight50 = new Signal("manufactureLight50", Signal.OUTPUT);
  public Signal manufactureLight0 = new Signal("manufactureLight0", Signal.OUTPUT);
  public Signal officeSirenOn = new Signal("officeSirenOn", Signal.OUTPUT);
  public Signal officeSirenOff = new Signal("officeSirenOff", Signal.OUTPUT);
  public Signal storageSirenOn = new Signal("storageSirenOn", Signal.OUTPUT);
  public Signal storageSirenOff = new Signal("storageSirenOff", Signal.OUTPUT);
  public Signal manufactureSirenOn = new Signal("manufactureSirenOn", Signal.OUTPUT);
  public Signal manufactureSirenOff = new Signal("manufactureSirenOff", Signal.OUTPUT);
  public Signal officeACOnE = new Signal("officeACOnE", Signal.OUTPUT);
  public Signal officeACOffE = new Signal("officeACOffE", Signal.OUTPUT);
  public Signal storageACOnE = new Signal("storageACOnE", Signal.OUTPUT);
  public Signal storageACOffE = new Signal("storageACOffE", Signal.OUTPUT);
  public Signal manufactureACOnE = new Signal("manufactureACOnE", Signal.OUTPUT);
  public Signal manufactureACOffE = new Signal("manufactureACOffE", Signal.OUTPUT);
  public Signal officeHeaterOnE = new Signal("officeHeaterOnE", Signal.OUTPUT);
  public Signal officeHeaterOffE = new Signal("officeHeaterOffE", Signal.OUTPUT);
  public Signal officeLight100E = new Signal("officeLight100E", Signal.OUTPUT);
  public Signal officeLight50E = new Signal("officeLight50E", Signal.OUTPUT);
  public Signal officeLight0E = new Signal("officeLight0E", Signal.OUTPUT);
  public Signal storageLight100E = new Signal("storageLight100E", Signal.OUTPUT);
  public Signal storageLight50E = new Signal("storageLight50E", Signal.OUTPUT);
  public Signal storageLight0E = new Signal("storageLight0E", Signal.OUTPUT);
  public Signal manufactureLight100E = new Signal("manufactureLight100E", Signal.OUTPUT);
  public Signal manufactureLight50E = new Signal("manufactureLight50E", Signal.OUTPUT);
  public Signal manufactureLight0E = new Signal("manufactureLight0E", Signal.OUTPUT);
  public Signal officeSirenOnE = new Signal("officeSirenOnE", Signal.OUTPUT);
  public Signal officeSirenOffE = new Signal("officeSirenOffE", Signal.OUTPUT);
  public Signal storageSirenOnE = new Signal("storageSirenOnE", Signal.OUTPUT);
  public Signal storageSirenOffE = new Signal("storageSirenOffE", Signal.OUTPUT);
  public Signal manufactureSirenOnE = new Signal("manufactureSirenOnE", Signal.OUTPUT);
  public Signal manufactureSirenOffE = new Signal("manufactureSirenOffE", Signal.OUTPUT);
  private int S39953 = 1;
  private int S37213 = 1;
  private int S37033 = 1;
  private int S36955 = 1;
  private int S37122 = 1;
  private int S37044 = 1;
  private int S37211 = 1;
  private int S37133 = 1;
  private int S37302 = 1;
  private int S37224 = 1;
  private int S37571 = 1;
  private int S37391 = 1;
  private int S37313 = 1;
  private int S37480 = 1;
  private int S37402 = 1;
  private int S37569 = 1;
  private int S37491 = 1;
  private int S37993 = 1;
  private int S37711 = 1;
  private int S37617 = 1;
  private int S37596 = 1;
  private int S37851 = 1;
  private int S37757 = 1;
  private int S37736 = 1;
  private int S37991 = 1;
  private int S37897 = 1;
  private int S37876 = 1;
  private int S38262 = 1;
  private int S38082 = 1;
  private int S38004 = 1;
  private int S38171 = 1;
  private int S38093 = 1;
  private int S38260 = 1;
  private int S38182 = 1;
  private int S38448 = 1;
  private int S38270 = 1;
  private int S38264 = 1;
  private int S38278 = 1;
  private int S38286 = 1;
  private int S38294 = 1;
  private int S38302 = 1;
  private int S38310 = 1;
  private int S38318 = 1;
  private int S38326 = 1;
  private int S38334 = 1;
  private int S38342 = 1;
  private int S38350 = 1;
  private int S38358 = 1;
  private int S38366 = 1;
  private int S38374 = 1;
  private int S38382 = 1;
  private int S38390 = 1;
  private int S38398 = 1;
  private int S38406 = 1;
  private int S38414 = 1;
  private int S38422 = 1;
  private int S38430 = 1;
  private int S38438 = 1;
  private int S38446 = 1;
  
  private int[] ends = new int[43];
  private int[] tdone = new int[43];
  
  public void thread40046(int [] tdone, int [] ends){
        switch(S38446){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        if(manufactureSirenOff.getprestatus()){//sysj\ECSPlant.sysj line: 293, column: 24
          manufactureSirenOffE.setPresent();//sysj\ECSPlant.sysj line: 293, column: 45
          currsigs.addElement(manufactureSirenOffE);
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread40045(int [] tdone, int [] ends){
        switch(S38438){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(manufactureSirenOn.getprestatus()){//sysj\ECSPlant.sysj line: 291, column: 24
          manufactureSirenOnE.setPresent();//sysj\ECSPlant.sysj line: 291, column: 44
          currsigs.addElement(manufactureSirenOnE);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        break;
      
    }
  }

  public void thread40044(int [] tdone, int [] ends){
        switch(S38430){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        if(storageSirenOff.getprestatus()){//sysj\ECSPlant.sysj line: 289, column: 24
          storageSirenOffE.setPresent();//sysj\ECSPlant.sysj line: 289, column: 41
          currsigs.addElement(storageSirenOffE);
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        break;
      
    }
  }

  public void thread40043(int [] tdone, int [] ends){
        switch(S38422){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if(storageSirenOn.getprestatus()){//sysj\ECSPlant.sysj line: 287, column: 24
          storageSirenOnE.setPresent();//sysj\ECSPlant.sysj line: 287, column: 40
          currsigs.addElement(storageSirenOnE);
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        break;
      
    }
  }

  public void thread40042(int [] tdone, int [] ends){
        switch(S38414){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(officeSirenOff.getprestatus()){//sysj\ECSPlant.sysj line: 285, column: 24
          officeSirenOffE.setPresent();//sysj\ECSPlant.sysj line: 285, column: 40
          currsigs.addElement(officeSirenOffE);
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        break;
      
    }
  }

  public void thread40041(int [] tdone, int [] ends){
        switch(S38406){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(officeSirenOn.getprestatus()){//sysj\ECSPlant.sysj line: 283, column: 24
          officeSirenOnE.setPresent();//sysj\ECSPlant.sysj line: 283, column: 39
          currsigs.addElement(officeSirenOnE);
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        break;
      
    }
  }

  public void thread40040(int [] tdone, int [] ends){
        switch(S38398){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(manufactureLight0.getprestatus()){//sysj\ECSPlant.sysj line: 281, column: 24
          manufactureLight0E.setPresent();//sysj\ECSPlant.sysj line: 281, column: 43
          currsigs.addElement(manufactureLight0E);
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        break;
      
    }
  }

  public void thread40039(int [] tdone, int [] ends){
        switch(S38390){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(manufactureLight50.getprestatus()){//sysj\ECSPlant.sysj line: 279, column: 24
          manufactureLight50E.setPresent();//sysj\ECSPlant.sysj line: 279, column: 44
          currsigs.addElement(manufactureLight50E);
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread40038(int [] tdone, int [] ends){
        switch(S38382){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(manufactureLight100.getprestatus()){//sysj\ECSPlant.sysj line: 277, column: 24
          manufactureLight100E.setPresent();//sysj\ECSPlant.sysj line: 277, column: 45
          currsigs.addElement(manufactureLight100E);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread40037(int [] tdone, int [] ends){
        switch(S38374){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(storageLight0.getprestatus()){//sysj\ECSPlant.sysj line: 275, column: 24
          storageLight0E.setPresent();//sysj\ECSPlant.sysj line: 275, column: 39
          currsigs.addElement(storageLight0E);
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread40036(int [] tdone, int [] ends){
        switch(S38366){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(storageLight50.getprestatus()){//sysj\ECSPlant.sysj line: 273, column: 24
          storageLight50E.setPresent();//sysj\ECSPlant.sysj line: 273, column: 40
          currsigs.addElement(storageLight50E);
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        else {
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread40035(int [] tdone, int [] ends){
        switch(S38358){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(storageLight100.getprestatus()){//sysj\ECSPlant.sysj line: 271, column: 24
          storageLight100E.setPresent();//sysj\ECSPlant.sysj line: 271, column: 41
          currsigs.addElement(storageLight100E);
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        else {
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread40034(int [] tdone, int [] ends){
        switch(S38350){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(officeLight0.getprestatus()){//sysj\ECSPlant.sysj line: 269, column: 24
          officeLight0E.setPresent();//sysj\ECSPlant.sysj line: 269, column: 38
          currsigs.addElement(officeLight0E);
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread40033(int [] tdone, int [] ends){
        switch(S38342){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(officeLight50.getprestatus()){//sysj\ECSPlant.sysj line: 267, column: 24
          officeLight50E.setPresent();//sysj\ECSPlant.sysj line: 267, column: 39
          currsigs.addElement(officeLight50E);
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread40032(int [] tdone, int [] ends){
        switch(S38334){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(officeLight100.getprestatus()){//sysj\ECSPlant.sysj line: 265, column: 24
          officeLight100E.setPresent();//sysj\ECSPlant.sysj line: 265, column: 40
          currsigs.addElement(officeLight100E);
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread40031(int [] tdone, int [] ends){
        switch(S38326){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(officeHeaterOff.getprestatus()){//sysj\ECSPlant.sysj line: 263, column: 24
          officeHeaterOffE.setPresent();//sysj\ECSPlant.sysj line: 263, column: 41
          currsigs.addElement(officeHeaterOffE);
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread40030(int [] tdone, int [] ends){
        switch(S38318){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(officeHeaterOn.getprestatus()){//sysj\ECSPlant.sysj line: 261, column: 24
          officeHeaterOnE.setPresent();//sysj\ECSPlant.sysj line: 261, column: 40
          currsigs.addElement(officeHeaterOnE);
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread40029(int [] tdone, int [] ends){
        switch(S38310){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(manufactureACOff.getprestatus()){//sysj\ECSPlant.sysj line: 259, column: 24
          manufactureACOffE.setPresent();//sysj\ECSPlant.sysj line: 259, column: 42
          currsigs.addElement(manufactureACOffE);
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread40028(int [] tdone, int [] ends){
        switch(S38302){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(manufactureACOn.getprestatus()){//sysj\ECSPlant.sysj line: 257, column: 24
          manufactureACOnE.setPresent();//sysj\ECSPlant.sysj line: 257, column: 41
          currsigs.addElement(manufactureACOnE);
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

  public void thread40027(int [] tdone, int [] ends){
        switch(S38294){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(storageACOff.getprestatus()){//sysj\ECSPlant.sysj line: 255, column: 24
          storageACOffE.setPresent();//sysj\ECSPlant.sysj line: 255, column: 38
          currsigs.addElement(storageACOffE);
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

  public void thread40026(int [] tdone, int [] ends){
        switch(S38286){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(storageACOn.getprestatus()){//sysj\ECSPlant.sysj line: 253, column: 24
          storageACOnE.setPresent();//sysj\ECSPlant.sysj line: 253, column: 37
          currsigs.addElement(storageACOnE);
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

  public void thread40025(int [] tdone, int [] ends){
        switch(S38278){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(officeACOff.getprestatus()){//sysj\ECSPlant.sysj line: 251, column: 24
          officeACOffE.setPresent();//sysj\ECSPlant.sysj line: 251, column: 37
          currsigs.addElement(officeACOffE);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread40024(int [] tdone, int [] ends){
        switch(S38270){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S38264){
          case 0 : 
            S38264=0;
            if(officeACOn.getprestatus()){//sysj\ECSPlant.sysj line: 249, column: 24
              officeACOnE.setPresent();//sysj\ECSPlant.sysj line: 249, column: 36
              currsigs.addElement(officeACOnE);
              S38264=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              S38264=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 1 : 
            S38264=1;
            S38264=0;
            if(officeACOn.getprestatus()){//sysj\ECSPlant.sysj line: 249, column: 24
              officeACOnE.setPresent();//sysj\ECSPlant.sysj line: 249, column: 36
              currsigs.addElement(officeACOnE);
              S38264=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              S38264=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread40023(int [] tdone, int [] ends){
        switch(S38448){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        thread40024(tdone,ends);
        thread40025(tdone,ends);
        thread40026(tdone,ends);
        thread40027(tdone,ends);
        thread40028(tdone,ends);
        thread40029(tdone,ends);
        thread40030(tdone,ends);
        thread40031(tdone,ends);
        thread40032(tdone,ends);
        thread40033(tdone,ends);
        thread40034(tdone,ends);
        thread40035(tdone,ends);
        thread40036(tdone,ends);
        thread40037(tdone,ends);
        thread40038(tdone,ends);
        thread40039(tdone,ends);
        thread40040(tdone,ends);
        thread40041(tdone,ends);
        thread40042(tdone,ends);
        thread40043(tdone,ends);
        thread40044(tdone,ends);
        thread40045(tdone,ends);
        thread40046(tdone,ends);
        int biggest40047 = 0;
        if(ends[20]>=biggest40047){
          biggest40047=ends[20];
        }
        if(ends[21]>=biggest40047){
          biggest40047=ends[21];
        }
        if(ends[22]>=biggest40047){
          biggest40047=ends[22];
        }
        if(ends[23]>=biggest40047){
          biggest40047=ends[23];
        }
        if(ends[24]>=biggest40047){
          biggest40047=ends[24];
        }
        if(ends[25]>=biggest40047){
          biggest40047=ends[25];
        }
        if(ends[26]>=biggest40047){
          biggest40047=ends[26];
        }
        if(ends[27]>=biggest40047){
          biggest40047=ends[27];
        }
        if(ends[28]>=biggest40047){
          biggest40047=ends[28];
        }
        if(ends[29]>=biggest40047){
          biggest40047=ends[29];
        }
        if(ends[30]>=biggest40047){
          biggest40047=ends[30];
        }
        if(ends[31]>=biggest40047){
          biggest40047=ends[31];
        }
        if(ends[32]>=biggest40047){
          biggest40047=ends[32];
        }
        if(ends[33]>=biggest40047){
          biggest40047=ends[33];
        }
        if(ends[34]>=biggest40047){
          biggest40047=ends[34];
        }
        if(ends[35]>=biggest40047){
          biggest40047=ends[35];
        }
        if(ends[36]>=biggest40047){
          biggest40047=ends[36];
        }
        if(ends[37]>=biggest40047){
          biggest40047=ends[37];
        }
        if(ends[38]>=biggest40047){
          biggest40047=ends[38];
        }
        if(ends[39]>=biggest40047){
          biggest40047=ends[39];
        }
        if(ends[40]>=biggest40047){
          biggest40047=ends[40];
        }
        if(ends[41]>=biggest40047){
          biggest40047=ends[41];
        }
        if(ends[42]>=biggest40047){
          biggest40047=ends[42];
        }
        if(biggest40047 == 1){
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        //FINXME code
        if(biggest40047 == 0){
          S38448=0;
          active[19]=0;
          ends[19]=0;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread40021(int [] tdone, int [] ends){
        switch(S38260){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S38182){
          case 0 : 
            if(manufactureSiren.getprestatus()){//sysj\ECSPlant.sysj line: 234, column: 11
              S38182=1;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              manufactureSirenOff.setPresent();//sysj\ECSPlant.sysj line: 236, column: 6
              currsigs.addElement(manufactureSirenOff);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 238, column: 11
              S38182=2;
              System.out.println("Manufacture siren turned on");//sysj\ECSPlant.sysj line: 240, column: 6
              manufactureSirenOn.setPresent();//sysj\ECSPlant.sysj line: 241, column: 6
              currsigs.addElement(manufactureSirenOn);
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
          
          case 2 : 
            if(!manufactureSiren.getprestatus()){//sysj\ECSPlant.sysj line: 239, column: 11
              S38182=3;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              manufactureSirenOn.setPresent();//sysj\ECSPlant.sysj line: 241, column: 6
              currsigs.addElement(manufactureSirenOn);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 243, column: 11
              S38182=0;
              System.out.println("Manufacture siren turned off");//sysj\ECSPlant.sysj line: 235, column: 6
              manufactureSirenOff.setPresent();//sysj\ECSPlant.sysj line: 236, column: 6
              currsigs.addElement(manufactureSirenOff);
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
          
        }
        break;
      
    }
  }

  public void thread40020(int [] tdone, int [] ends){
        switch(S38171){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S38093){
          case 0 : 
            if(storageSiren.getprestatus()){//sysj\ECSPlant.sysj line: 219, column: 11
              S38093=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              storageSirenOff.setPresent();//sysj\ECSPlant.sysj line: 221, column: 6
              currsigs.addElement(storageSirenOff);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 223, column: 11
              S38093=2;
              System.out.println("Storage siren turned on");//sysj\ECSPlant.sysj line: 225, column: 6
              storageSirenOn.setPresent();//sysj\ECSPlant.sysj line: 226, column: 6
              currsigs.addElement(storageSirenOn);
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
          
          case 2 : 
            if(!storageSiren.getprestatus()){//sysj\ECSPlant.sysj line: 224, column: 11
              S38093=3;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              storageSirenOn.setPresent();//sysj\ECSPlant.sysj line: 226, column: 6
              currsigs.addElement(storageSirenOn);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 228, column: 11
              S38093=0;
              System.out.println("Storage siren turned off");//sysj\ECSPlant.sysj line: 220, column: 6
              storageSirenOff.setPresent();//sysj\ECSPlant.sysj line: 221, column: 6
              currsigs.addElement(storageSirenOff);
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
          
        }
        break;
      
    }
  }

  public void thread40019(int [] tdone, int [] ends){
        switch(S38082){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S38004){
          case 0 : 
            if(officeSiren.getprestatus()){//sysj\ECSPlant.sysj line: 204, column: 11
              S38004=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              officeSirenOff.setPresent();//sysj\ECSPlant.sysj line: 206, column: 6
              currsigs.addElement(officeSirenOff);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 208, column: 11
              S38004=2;
              System.out.println("Office siren turned on");//sysj\ECSPlant.sysj line: 210, column: 6
              officeSirenOn.setPresent();//sysj\ECSPlant.sysj line: 211, column: 6
              currsigs.addElement(officeSirenOn);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 2 : 
            if(!officeSiren.getprestatus()){//sysj\ECSPlant.sysj line: 209, column: 11
              S38004=3;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              officeSirenOn.setPresent();//sysj\ECSPlant.sysj line: 211, column: 6
              currsigs.addElement(officeSirenOn);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 213, column: 11
              S38004=0;
              System.out.println("Office siren turned off");//sysj\ECSPlant.sysj line: 205, column: 6
              officeSirenOff.setPresent();//sysj\ECSPlant.sysj line: 206, column: 6
              currsigs.addElement(officeSirenOff);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread40018(int [] tdone, int [] ends){
        switch(S38262){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        thread40019(tdone,ends);
        thread40020(tdone,ends);
        thread40021(tdone,ends);
        int biggest40022 = 0;
        if(ends[16]>=biggest40022){
          biggest40022=ends[16];
        }
        if(ends[17]>=biggest40022){
          biggest40022=ends[17];
        }
        if(ends[18]>=biggest40022){
          biggest40022=ends[18];
        }
        if(biggest40022 == 1){
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        //FINXME code
        if(biggest40022 == 0){
          S38262=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread40016(int [] tdone, int [] ends){
        switch(S37991){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S37897){
          case 0 : 
            switch(S37876){
              case 0 : 
                manufactureLight100.setPresent();//sysj\ECSPlant.sysj line: 184, column: 7
                currsigs.addElement(manufactureLight100);
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
                break;
              
              case 1 : 
                manufactureLight50.setPresent();//sysj\ECSPlant.sysj line: 188, column: 7
                currsigs.addElement(manufactureLight50);
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
                break;
              
              case 2 : 
                manufactureLight0.setPresent();//sysj\ECSPlant.sysj line: 192, column: 7
                currsigs.addElement(manufactureLight0);
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
                break;
              
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 195, column: 11
              S37897=0;
              if(manufactureLight.getprestatus()){//sysj\ECSPlant.sysj line: 181, column: 13
                S37876=0;
                if((Integer)(manufactureLight.getpreval() == null ? null : ((Integer)manufactureLight.getpreval())) == 100){//sysj\ECSPlant.sysj line: 182, column: 10
                  System.out.println("Manufacture Light 100");//sysj\ECSPlant.sysj line: 183, column: 7
                  manufactureLight100.setPresent();//sysj\ECSPlant.sysj line: 184, column: 7
                  currsigs.addElement(manufactureLight100);
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  S37876=1;
                  if((Integer)(manufactureLight.getpreval() == null ? null : ((Integer)manufactureLight.getpreval())) == 50){//sysj\ECSPlant.sysj line: 186, column: 10
                    System.out.println("Manufacture Light 50");//sysj\ECSPlant.sysj line: 187, column: 7
                    manufactureLight50.setPresent();//sysj\ECSPlant.sysj line: 188, column: 7
                    currsigs.addElement(manufactureLight50);
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    S37876=2;
                    if((Integer)(manufactureLight.getpreval() == null ? null : ((Integer)manufactureLight.getpreval())) == 0){//sysj\ECSPlant.sysj line: 190, column: 10
                      System.out.println("Manufacture Light 0");//sysj\ECSPlant.sysj line: 191, column: 7
                      manufactureLight0.setPresent();//sysj\ECSPlant.sysj line: 192, column: 7
                      currsigs.addElement(manufactureLight0);
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                    else {
                      S37897=1;
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                  }
                }
              }
              else {
                S37897=1;
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread40015(int [] tdone, int [] ends){
        switch(S37851){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S37757){
          case 0 : 
            switch(S37736){
              case 0 : 
                storageLight100.setPresent();//sysj\ECSPlant.sysj line: 164, column: 7
                currsigs.addElement(storageLight100);
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
                break;
              
              case 1 : 
                storageLight50.setPresent();//sysj\ECSPlant.sysj line: 168, column: 7
                currsigs.addElement(storageLight50);
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
                break;
              
              case 2 : 
                storageLight0.setPresent();//sysj\ECSPlant.sysj line: 172, column: 7
                currsigs.addElement(storageLight0);
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
                break;
              
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 175, column: 11
              S37757=0;
              if(storageLight.getprestatus()){//sysj\ECSPlant.sysj line: 161, column: 13
                S37736=0;
                if((Integer)(storageLight.getpreval() == null ? null : ((Integer)storageLight.getpreval())) == 100){//sysj\ECSPlant.sysj line: 162, column: 10
                  System.out.println("Storage Light 100");//sysj\ECSPlant.sysj line: 163, column: 7
                  storageLight100.setPresent();//sysj\ECSPlant.sysj line: 164, column: 7
                  currsigs.addElement(storageLight100);
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S37736=1;
                  if((Integer)(storageLight.getpreval() == null ? null : ((Integer)storageLight.getpreval())) == 50){//sysj\ECSPlant.sysj line: 166, column: 10
                    System.out.println("Storage Light 50");//sysj\ECSPlant.sysj line: 167, column: 7
                    storageLight50.setPresent();//sysj\ECSPlant.sysj line: 168, column: 7
                    currsigs.addElement(storageLight50);
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    S37736=2;
                    if((Integer)(storageLight.getpreval() == null ? null : ((Integer)storageLight.getpreval())) == 0){//sysj\ECSPlant.sysj line: 170, column: 10
                      System.out.println("Storage Light 0");//sysj\ECSPlant.sysj line: 171, column: 7
                      storageLight0.setPresent();//sysj\ECSPlant.sysj line: 172, column: 7
                      currsigs.addElement(storageLight0);
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      S37757=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                }
              }
              else {
                S37757=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread40014(int [] tdone, int [] ends){
        switch(S37711){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S37617){
          case 0 : 
            switch(S37596){
              case 0 : 
                officeLight100.setPresent();//sysj\ECSPlant.sysj line: 144, column: 7
                currsigs.addElement(officeLight100);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
                break;
              
              case 1 : 
                officeLight50.setPresent();//sysj\ECSPlant.sysj line: 148, column: 7
                currsigs.addElement(officeLight50);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
                break;
              
              case 2 : 
                officeLight0.setPresent();//sysj\ECSPlant.sysj line: 152, column: 7
                currsigs.addElement(officeLight0);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
                break;
              
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 155, column: 11
              S37617=0;
              if(officeLight.getprestatus()){//sysj\ECSPlant.sysj line: 141, column: 13
                S37596=0;
                if((Integer)(officeLight.getpreval() == null ? null : ((Integer)officeLight.getpreval())) == 100){//sysj\ECSPlant.sysj line: 142, column: 10
                  System.out.println("Office Light 100");//sysj\ECSPlant.sysj line: 143, column: 7
                  officeLight100.setPresent();//sysj\ECSPlant.sysj line: 144, column: 7
                  currsigs.addElement(officeLight100);
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S37596=1;
                  if((Integer)(officeLight.getpreval() == null ? null : ((Integer)officeLight.getpreval())) == 50){//sysj\ECSPlant.sysj line: 146, column: 10
                    System.out.println("Office Light 50");//sysj\ECSPlant.sysj line: 147, column: 7
                    officeLight50.setPresent();//sysj\ECSPlant.sysj line: 148, column: 7
                    currsigs.addElement(officeLight50);
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                  else {
                    S37596=2;
                    if((Integer)(officeLight.getpreval() == null ? null : ((Integer)officeLight.getpreval())) == 0){//sysj\ECSPlant.sysj line: 150, column: 10
                      System.out.println("Office Light 0");//sysj\ECSPlant.sysj line: 151, column: 7
                      officeLight0.setPresent();//sysj\ECSPlant.sysj line: 152, column: 7
                      currsigs.addElement(officeLight0);
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      S37617=1;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                  }
                }
              }
              else {
                S37617=1;
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
          
        }
        break;
      
    }
  }

  public void thread40013(int [] tdone, int [] ends){
        switch(S37993){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread40014(tdone,ends);
        thread40015(tdone,ends);
        thread40016(tdone,ends);
        int biggest40017 = 0;
        if(ends[12]>=biggest40017){
          biggest40017=ends[12];
        }
        if(ends[13]>=biggest40017){
          biggest40017=ends[13];
        }
        if(ends[14]>=biggest40017){
          biggest40017=ends[14];
        }
        if(biggest40017 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest40017 == 0){
          S37993=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread40011(int [] tdone, int [] ends){
        switch(S37569){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S37491){
          case 0 : 
            if(manufactureDehumidifier.getprestatus()){//sysj\ECSPlant.sysj line: 123, column: 11
              S37491=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              manufactureACOff.setPresent();//sysj\ECSPlant.sysj line: 125, column: 6
              currsigs.addElement(manufactureACOff);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 127, column: 11
              S37491=2;
              System.out.println("Manufacture AC turned on");//sysj\ECSPlant.sysj line: 129, column: 6
              manufactureACOn.setPresent();//sysj\ECSPlant.sysj line: 130, column: 6
              currsigs.addElement(manufactureACOn);
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
          
          case 2 : 
            if(!manufactureAC.getprestatus()){//sysj\ECSPlant.sysj line: 128, column: 11
              S37491=3;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              manufactureACOn.setPresent();//sysj\ECSPlant.sysj line: 130, column: 6
              currsigs.addElement(manufactureACOn);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 132, column: 11
              S37491=0;
              System.out.println("Manufacture Dehumidifier turned off");//sysj\ECSPlant.sysj line: 124, column: 6
              manufactureACOff.setPresent();//sysj\ECSPlant.sysj line: 125, column: 6
              currsigs.addElement(manufactureACOff);
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
        break;
      
    }
  }

  public void thread40010(int [] tdone, int [] ends){
        switch(S37480){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S37402){
          case 0 : 
            if(storageDehumidifier.getprestatus()){//sysj\ECSPlant.sysj line: 108, column: 11
              S37402=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              storageACOff.setPresent();//sysj\ECSPlant.sysj line: 110, column: 6
              currsigs.addElement(storageACOff);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 112, column: 11
              S37402=2;
              System.out.println("Storage Dehumidifier turned on");//sysj\ECSPlant.sysj line: 114, column: 6
              storageACOn.setPresent();//sysj\ECSPlant.sysj line: 115, column: 6
              currsigs.addElement(storageACOn);
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
          
          case 2 : 
            if(!storageDehumidifier.getprestatus()){//sysj\ECSPlant.sysj line: 113, column: 11
              S37402=3;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              storageACOn.setPresent();//sysj\ECSPlant.sysj line: 115, column: 6
              currsigs.addElement(storageACOn);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 117, column: 11
              S37402=0;
              System.out.println("Storage Dehumidifier turned off");//sysj\ECSPlant.sysj line: 109, column: 6
              storageACOff.setPresent();//sysj\ECSPlant.sysj line: 110, column: 6
              currsigs.addElement(storageACOff);
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
        break;
      
    }
  }

  public void thread40009(int [] tdone, int [] ends){
        switch(S37391){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S37313){
          case 0 : 
            if(officeDehumidifier.getprestatus()){//sysj\ECSPlant.sysj line: 93, column: 11
              S37313=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              officeACOff.setPresent();//sysj\ECSPlant.sysj line: 95, column: 6
              currsigs.addElement(officeACOff);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 97, column: 11
              S37313=2;
              System.out.println("Office Dehumidifier turned on");//sysj\ECSPlant.sysj line: 99, column: 6
              officeACOn.setPresent();//sysj\ECSPlant.sysj line: 100, column: 6
              currsigs.addElement(officeACOn);
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
          
          case 2 : 
            if(!officeDehumidifier.getprestatus()){//sysj\ECSPlant.sysj line: 98, column: 11
              S37313=3;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              officeACOn.setPresent();//sysj\ECSPlant.sysj line: 100, column: 6
              currsigs.addElement(officeACOn);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 102, column: 11
              S37313=0;
              System.out.println("Office Dehumidifier turned off");//sysj\ECSPlant.sysj line: 94, column: 6
              officeACOff.setPresent();//sysj\ECSPlant.sysj line: 95, column: 6
              currsigs.addElement(officeACOff);
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
        break;
      
    }
  }

  public void thread40008(int [] tdone, int [] ends){
        switch(S37571){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread40009(tdone,ends);
        thread40010(tdone,ends);
        thread40011(tdone,ends);
        int biggest40012 = 0;
        if(ends[8]>=biggest40012){
          biggest40012=ends[8];
        }
        if(ends[9]>=biggest40012){
          biggest40012=ends[9];
        }
        if(ends[10]>=biggest40012){
          biggest40012=ends[10];
        }
        if(biggest40012 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest40012 == 0){
          S37571=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread40007(int [] tdone, int [] ends){
        switch(S37302){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S37224){
          case 0 : 
            if(officeHeater.getprestatus()){//sysj\ECSPlant.sysj line: 77, column: 10
              S37224=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              officeHeaterOff.setPresent();//sysj\ECSPlant.sysj line: 79, column: 5
              currsigs.addElement(officeHeaterOff);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 81, column: 10
              S37224=2;
              System.out.println("Office Heater turned on");//sysj\ECSPlant.sysj line: 83, column: 5
              officeHeaterOn.setPresent();//sysj\ECSPlant.sysj line: 84, column: 5
              currsigs.addElement(officeHeaterOn);
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
          
          case 2 : 
            if(!officeAC.getprestatus()){//sysj\ECSPlant.sysj line: 82, column: 10
              S37224=3;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              officeHeaterOn.setPresent();//sysj\ECSPlant.sysj line: 84, column: 5
              currsigs.addElement(officeHeaterOn);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 86, column: 10
              S37224=0;
              System.out.println("Office Heater turned off");//sysj\ECSPlant.sysj line: 78, column: 5
              officeHeaterOff.setPresent();//sysj\ECSPlant.sysj line: 79, column: 5
              currsigs.addElement(officeHeaterOff);
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
        break;
      
    }
  }

  public void thread40005(int [] tdone, int [] ends){
        switch(S37211){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S37133){
          case 0 : 
            if(manufactureAC.getprestatus()){//sysj\ECSPlant.sysj line: 60, column: 11
              S37133=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              manufactureACOff.setPresent();//sysj\ECSPlant.sysj line: 62, column: 6
              currsigs.addElement(manufactureACOff);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 64, column: 11
              S37133=2;
              System.out.println("Manufacture AC turned on");//sysj\ECSPlant.sysj line: 66, column: 6
              manufactureACOn.setPresent();//sysj\ECSPlant.sysj line: 67, column: 6
              currsigs.addElement(manufactureACOn);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(!manufactureAC.getprestatus()){//sysj\ECSPlant.sysj line: 65, column: 11
              S37133=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              manufactureACOn.setPresent();//sysj\ECSPlant.sysj line: 67, column: 6
              currsigs.addElement(manufactureACOn);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 69, column: 11
              S37133=0;
              System.out.println("Manufacture AC turned off");//sysj\ECSPlant.sysj line: 61, column: 6
              manufactureACOff.setPresent();//sysj\ECSPlant.sysj line: 62, column: 6
              currsigs.addElement(manufactureACOff);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread40004(int [] tdone, int [] ends){
        switch(S37122){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S37044){
          case 0 : 
            if(storageAC.getprestatus()){//sysj\ECSPlant.sysj line: 45, column: 11
              S37044=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              storageACOff.setPresent();//sysj\ECSPlant.sysj line: 47, column: 6
              currsigs.addElement(storageACOff);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 49, column: 11
              S37044=2;
              System.out.println("Storage AC turned on");//sysj\ECSPlant.sysj line: 51, column: 6
              storageACOn.setPresent();//sysj\ECSPlant.sysj line: 52, column: 6
              currsigs.addElement(storageACOn);
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
          
          case 2 : 
            if(!storageAC.getprestatus()){//sysj\ECSPlant.sysj line: 50, column: 11
              S37044=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              storageACOn.setPresent();//sysj\ECSPlant.sysj line: 52, column: 6
              currsigs.addElement(storageACOn);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 54, column: 11
              S37044=0;
              System.out.println("Storage AC turned off");//sysj\ECSPlant.sysj line: 46, column: 6
              storageACOff.setPresent();//sysj\ECSPlant.sysj line: 47, column: 6
              currsigs.addElement(storageACOff);
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
          
        }
        break;
      
    }
  }

  public void thread40003(int [] tdone, int [] ends){
        switch(S37033){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S36955){
          case 0 : 
            if(officeAC.getprestatus()){//sysj\ECSPlant.sysj line: 30, column: 11
              S36955=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              officeACOff.setPresent();//sysj\ECSPlant.sysj line: 32, column: 6
              currsigs.addElement(officeACOff);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 34, column: 11
              S36955=2;
              System.out.println("Office AC turned on");//sysj\ECSPlant.sysj line: 36, column: 6
              officeACOn.setPresent();//sysj\ECSPlant.sysj line: 37, column: 6
              currsigs.addElement(officeACOn);
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
            if(!officeAC.getprestatus()){//sysj\ECSPlant.sysj line: 35, column: 11
              S36955=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              officeACOn.setPresent();//sysj\ECSPlant.sysj line: 37, column: 6
              currsigs.addElement(officeACOn);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ECSPlant.sysj line: 39, column: 11
              S36955=0;
              System.out.println("Office AC turned off");//sysj\ECSPlant.sysj line: 31, column: 6
              officeACOff.setPresent();//sysj\ECSPlant.sysj line: 32, column: 6
              currsigs.addElement(officeACOff);
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

  public void thread40002(int [] tdone, int [] ends){
        switch(S37213){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread40003(tdone,ends);
        thread40004(tdone,ends);
        thread40005(tdone,ends);
        int biggest40006 = 0;
        if(ends[3]>=biggest40006){
          biggest40006=ends[3];
        }
        if(ends[4]>=biggest40006){
          biggest40006=ends[4];
        }
        if(ends[5]>=biggest40006){
          biggest40006=ends[5];
        }
        if(biggest40006 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest40006 == 0){
          S37213=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread39999(int [] tdone, int [] ends){
        S38446=1;
    if(manufactureSirenOff.getprestatus()){//sysj\ECSPlant.sysj line: 293, column: 24
      manufactureSirenOffE.setPresent();//sysj\ECSPlant.sysj line: 293, column: 45
      currsigs.addElement(manufactureSirenOffE);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread39998(int [] tdone, int [] ends){
        S38438=1;
    if(manufactureSirenOn.getprestatus()){//sysj\ECSPlant.sysj line: 291, column: 24
      manufactureSirenOnE.setPresent();//sysj\ECSPlant.sysj line: 291, column: 44
      currsigs.addElement(manufactureSirenOnE);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread39997(int [] tdone, int [] ends){
        S38430=1;
    if(storageSirenOff.getprestatus()){//sysj\ECSPlant.sysj line: 289, column: 24
      storageSirenOffE.setPresent();//sysj\ECSPlant.sysj line: 289, column: 41
      currsigs.addElement(storageSirenOffE);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread39996(int [] tdone, int [] ends){
        S38422=1;
    if(storageSirenOn.getprestatus()){//sysj\ECSPlant.sysj line: 287, column: 24
      storageSirenOnE.setPresent();//sysj\ECSPlant.sysj line: 287, column: 40
      currsigs.addElement(storageSirenOnE);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread39995(int [] tdone, int [] ends){
        S38414=1;
    if(officeSirenOff.getprestatus()){//sysj\ECSPlant.sysj line: 285, column: 24
      officeSirenOffE.setPresent();//sysj\ECSPlant.sysj line: 285, column: 40
      currsigs.addElement(officeSirenOffE);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread39994(int [] tdone, int [] ends){
        S38406=1;
    if(officeSirenOn.getprestatus()){//sysj\ECSPlant.sysj line: 283, column: 24
      officeSirenOnE.setPresent();//sysj\ECSPlant.sysj line: 283, column: 39
      currsigs.addElement(officeSirenOnE);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread39993(int [] tdone, int [] ends){
        S38398=1;
    if(manufactureLight0.getprestatus()){//sysj\ECSPlant.sysj line: 281, column: 24
      manufactureLight0E.setPresent();//sysj\ECSPlant.sysj line: 281, column: 43
      currsigs.addElement(manufactureLight0E);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread39992(int [] tdone, int [] ends){
        S38390=1;
    if(manufactureLight50.getprestatus()){//sysj\ECSPlant.sysj line: 279, column: 24
      manufactureLight50E.setPresent();//sysj\ECSPlant.sysj line: 279, column: 44
      currsigs.addElement(manufactureLight50E);
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread39991(int [] tdone, int [] ends){
        S38382=1;
    if(manufactureLight100.getprestatus()){//sysj\ECSPlant.sysj line: 277, column: 24
      manufactureLight100E.setPresent();//sysj\ECSPlant.sysj line: 277, column: 45
      currsigs.addElement(manufactureLight100E);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread39990(int [] tdone, int [] ends){
        S38374=1;
    if(storageLight0.getprestatus()){//sysj\ECSPlant.sysj line: 275, column: 24
      storageLight0E.setPresent();//sysj\ECSPlant.sysj line: 275, column: 39
      currsigs.addElement(storageLight0E);
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread39989(int [] tdone, int [] ends){
        S38366=1;
    if(storageLight50.getprestatus()){//sysj\ECSPlant.sysj line: 273, column: 24
      storageLight50E.setPresent();//sysj\ECSPlant.sysj line: 273, column: 40
      currsigs.addElement(storageLight50E);
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread39988(int [] tdone, int [] ends){
        S38358=1;
    if(storageLight100.getprestatus()){//sysj\ECSPlant.sysj line: 271, column: 24
      storageLight100E.setPresent();//sysj\ECSPlant.sysj line: 271, column: 41
      currsigs.addElement(storageLight100E);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
  }

  public void thread39987(int [] tdone, int [] ends){
        S38350=1;
    if(officeLight0.getprestatus()){//sysj\ECSPlant.sysj line: 269, column: 24
      officeLight0E.setPresent();//sysj\ECSPlant.sysj line: 269, column: 38
      currsigs.addElement(officeLight0E);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread39986(int [] tdone, int [] ends){
        S38342=1;
    if(officeLight50.getprestatus()){//sysj\ECSPlant.sysj line: 267, column: 24
      officeLight50E.setPresent();//sysj\ECSPlant.sysj line: 267, column: 39
      currsigs.addElement(officeLight50E);
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread39985(int [] tdone, int [] ends){
        S38334=1;
    if(officeLight100.getprestatus()){//sysj\ECSPlant.sysj line: 265, column: 24
      officeLight100E.setPresent();//sysj\ECSPlant.sysj line: 265, column: 40
      currsigs.addElement(officeLight100E);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread39984(int [] tdone, int [] ends){
        S38326=1;
    if(officeHeaterOff.getprestatus()){//sysj\ECSPlant.sysj line: 263, column: 24
      officeHeaterOffE.setPresent();//sysj\ECSPlant.sysj line: 263, column: 41
      currsigs.addElement(officeHeaterOffE);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread39983(int [] tdone, int [] ends){
        S38318=1;
    if(officeHeaterOn.getprestatus()){//sysj\ECSPlant.sysj line: 261, column: 24
      officeHeaterOnE.setPresent();//sysj\ECSPlant.sysj line: 261, column: 40
      currsigs.addElement(officeHeaterOnE);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread39982(int [] tdone, int [] ends){
        S38310=1;
    if(manufactureACOff.getprestatus()){//sysj\ECSPlant.sysj line: 259, column: 24
      manufactureACOffE.setPresent();//sysj\ECSPlant.sysj line: 259, column: 42
      currsigs.addElement(manufactureACOffE);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread39981(int [] tdone, int [] ends){
        S38302=1;
    if(manufactureACOn.getprestatus()){//sysj\ECSPlant.sysj line: 257, column: 24
      manufactureACOnE.setPresent();//sysj\ECSPlant.sysj line: 257, column: 41
      currsigs.addElement(manufactureACOnE);
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

  public void thread39980(int [] tdone, int [] ends){
        S38294=1;
    if(storageACOff.getprestatus()){//sysj\ECSPlant.sysj line: 255, column: 24
      storageACOffE.setPresent();//sysj\ECSPlant.sysj line: 255, column: 38
      currsigs.addElement(storageACOffE);
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

  public void thread39979(int [] tdone, int [] ends){
        S38286=1;
    if(storageACOn.getprestatus()){//sysj\ECSPlant.sysj line: 253, column: 24
      storageACOnE.setPresent();//sysj\ECSPlant.sysj line: 253, column: 37
      currsigs.addElement(storageACOnE);
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

  public void thread39978(int [] tdone, int [] ends){
        S38278=1;
    if(officeACOff.getprestatus()){//sysj\ECSPlant.sysj line: 251, column: 24
      officeACOffE.setPresent();//sysj\ECSPlant.sysj line: 251, column: 37
      currsigs.addElement(officeACOffE);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread39977(int [] tdone, int [] ends){
        S38270=1;
    S38264=0;
    if(officeACOn.getprestatus()){//sysj\ECSPlant.sysj line: 249, column: 24
      officeACOnE.setPresent();//sysj\ECSPlant.sysj line: 249, column: 36
      currsigs.addElement(officeACOnE);
      S38264=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S38264=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread39976(int [] tdone, int [] ends){
        S38448=1;
    thread39977(tdone,ends);
    thread39978(tdone,ends);
    thread39979(tdone,ends);
    thread39980(tdone,ends);
    thread39981(tdone,ends);
    thread39982(tdone,ends);
    thread39983(tdone,ends);
    thread39984(tdone,ends);
    thread39985(tdone,ends);
    thread39986(tdone,ends);
    thread39987(tdone,ends);
    thread39988(tdone,ends);
    thread39989(tdone,ends);
    thread39990(tdone,ends);
    thread39991(tdone,ends);
    thread39992(tdone,ends);
    thread39993(tdone,ends);
    thread39994(tdone,ends);
    thread39995(tdone,ends);
    thread39996(tdone,ends);
    thread39997(tdone,ends);
    thread39998(tdone,ends);
    thread39999(tdone,ends);
    int biggest40000 = 0;
    if(ends[20]>=biggest40000){
      biggest40000=ends[20];
    }
    if(ends[21]>=biggest40000){
      biggest40000=ends[21];
    }
    if(ends[22]>=biggest40000){
      biggest40000=ends[22];
    }
    if(ends[23]>=biggest40000){
      biggest40000=ends[23];
    }
    if(ends[24]>=biggest40000){
      biggest40000=ends[24];
    }
    if(ends[25]>=biggest40000){
      biggest40000=ends[25];
    }
    if(ends[26]>=biggest40000){
      biggest40000=ends[26];
    }
    if(ends[27]>=biggest40000){
      biggest40000=ends[27];
    }
    if(ends[28]>=biggest40000){
      biggest40000=ends[28];
    }
    if(ends[29]>=biggest40000){
      biggest40000=ends[29];
    }
    if(ends[30]>=biggest40000){
      biggest40000=ends[30];
    }
    if(ends[31]>=biggest40000){
      biggest40000=ends[31];
    }
    if(ends[32]>=biggest40000){
      biggest40000=ends[32];
    }
    if(ends[33]>=biggest40000){
      biggest40000=ends[33];
    }
    if(ends[34]>=biggest40000){
      biggest40000=ends[34];
    }
    if(ends[35]>=biggest40000){
      biggest40000=ends[35];
    }
    if(ends[36]>=biggest40000){
      biggest40000=ends[36];
    }
    if(ends[37]>=biggest40000){
      biggest40000=ends[37];
    }
    if(ends[38]>=biggest40000){
      biggest40000=ends[38];
    }
    if(ends[39]>=biggest40000){
      biggest40000=ends[39];
    }
    if(ends[40]>=biggest40000){
      biggest40000=ends[40];
    }
    if(ends[41]>=biggest40000){
      biggest40000=ends[41];
    }
    if(ends[42]>=biggest40000){
      biggest40000=ends[42];
    }
    if(biggest40000 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread39974(int [] tdone, int [] ends){
        S38260=1;
    S38182=0;
    System.out.println("Manufacture siren turned off");//sysj\ECSPlant.sysj line: 235, column: 6
    manufactureSirenOff.setPresent();//sysj\ECSPlant.sysj line: 236, column: 6
    currsigs.addElement(manufactureSirenOff);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39973(int [] tdone, int [] ends){
        S38171=1;
    S38093=0;
    System.out.println("Storage siren turned off");//sysj\ECSPlant.sysj line: 220, column: 6
    storageSirenOff.setPresent();//sysj\ECSPlant.sysj line: 221, column: 6
    currsigs.addElement(storageSirenOff);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39972(int [] tdone, int [] ends){
        S38082=1;
    S38004=0;
    System.out.println("Office siren turned off");//sysj\ECSPlant.sysj line: 205, column: 6
    officeSirenOff.setPresent();//sysj\ECSPlant.sysj line: 206, column: 6
    currsigs.addElement(officeSirenOff);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39971(int [] tdone, int [] ends){
        S38262=1;
    thread39972(tdone,ends);
    thread39973(tdone,ends);
    thread39974(tdone,ends);
    int biggest39975 = 0;
    if(ends[16]>=biggest39975){
      biggest39975=ends[16];
    }
    if(ends[17]>=biggest39975){
      biggest39975=ends[17];
    }
    if(ends[18]>=biggest39975){
      biggest39975=ends[18];
    }
    if(biggest39975 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39969(int [] tdone, int [] ends){
        S37991=1;
    S37897=0;
    if(manufactureLight.getprestatus()){//sysj\ECSPlant.sysj line: 181, column: 13
      S37876=0;
      if((Integer)(manufactureLight.getpreval() == null ? null : ((Integer)manufactureLight.getpreval())) == 100){//sysj\ECSPlant.sysj line: 182, column: 10
        System.out.println("Manufacture Light 100");//sysj\ECSPlant.sysj line: 183, column: 7
        manufactureLight100.setPresent();//sysj\ECSPlant.sysj line: 184, column: 7
        currsigs.addElement(manufactureLight100);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
      }
      else {
        S37876=1;
        if((Integer)(manufactureLight.getpreval() == null ? null : ((Integer)manufactureLight.getpreval())) == 50){//sysj\ECSPlant.sysj line: 186, column: 10
          System.out.println("Manufacture Light 50");//sysj\ECSPlant.sysj line: 187, column: 7
          manufactureLight50.setPresent();//sysj\ECSPlant.sysj line: 188, column: 7
          currsigs.addElement(manufactureLight50);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          S37876=2;
          if((Integer)(manufactureLight.getpreval() == null ? null : ((Integer)manufactureLight.getpreval())) == 0){//sysj\ECSPlant.sysj line: 190, column: 10
            System.out.println("Manufacture Light 0");//sysj\ECSPlant.sysj line: 191, column: 7
            manufactureLight0.setPresent();//sysj\ECSPlant.sysj line: 192, column: 7
            currsigs.addElement(manufactureLight0);
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
          }
          else {
            S37897=1;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
          }
        }
      }
    }
    else {
      S37897=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread39968(int [] tdone, int [] ends){
        S37851=1;
    S37757=0;
    if(storageLight.getprestatus()){//sysj\ECSPlant.sysj line: 161, column: 13
      S37736=0;
      if((Integer)(storageLight.getpreval() == null ? null : ((Integer)storageLight.getpreval())) == 100){//sysj\ECSPlant.sysj line: 162, column: 10
        System.out.println("Storage Light 100");//sysj\ECSPlant.sysj line: 163, column: 7
        storageLight100.setPresent();//sysj\ECSPlant.sysj line: 164, column: 7
        currsigs.addElement(storageLight100);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
      else {
        S37736=1;
        if((Integer)(storageLight.getpreval() == null ? null : ((Integer)storageLight.getpreval())) == 50){//sysj\ECSPlant.sysj line: 166, column: 10
          System.out.println("Storage Light 50");//sysj\ECSPlant.sysj line: 167, column: 7
          storageLight50.setPresent();//sysj\ECSPlant.sysj line: 168, column: 7
          currsigs.addElement(storageLight50);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          S37736=2;
          if((Integer)(storageLight.getpreval() == null ? null : ((Integer)storageLight.getpreval())) == 0){//sysj\ECSPlant.sysj line: 170, column: 10
            System.out.println("Storage Light 0");//sysj\ECSPlant.sysj line: 171, column: 7
            storageLight0.setPresent();//sysj\ECSPlant.sysj line: 172, column: 7
            currsigs.addElement(storageLight0);
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
          else {
            S37757=1;
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
      }
    }
    else {
      S37757=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread39967(int [] tdone, int [] ends){
        S37711=1;
    S37617=0;
    if(officeLight.getprestatus()){//sysj\ECSPlant.sysj line: 141, column: 13
      S37596=0;
      if((Integer)(officeLight.getpreval() == null ? null : ((Integer)officeLight.getpreval())) == 100){//sysj\ECSPlant.sysj line: 142, column: 10
        System.out.println("Office Light 100");//sysj\ECSPlant.sysj line: 143, column: 7
        officeLight100.setPresent();//sysj\ECSPlant.sysj line: 144, column: 7
        currsigs.addElement(officeLight100);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S37596=1;
        if((Integer)(officeLight.getpreval() == null ? null : ((Integer)officeLight.getpreval())) == 50){//sysj\ECSPlant.sysj line: 146, column: 10
          System.out.println("Office Light 50");//sysj\ECSPlant.sysj line: 147, column: 7
          officeLight50.setPresent();//sysj\ECSPlant.sysj line: 148, column: 7
          currsigs.addElement(officeLight50);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          S37596=2;
          if((Integer)(officeLight.getpreval() == null ? null : ((Integer)officeLight.getpreval())) == 0){//sysj\ECSPlant.sysj line: 150, column: 10
            System.out.println("Office Light 0");//sysj\ECSPlant.sysj line: 151, column: 7
            officeLight0.setPresent();//sysj\ECSPlant.sysj line: 152, column: 7
            currsigs.addElement(officeLight0);
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
          }
          else {
            S37617=1;
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
          }
        }
      }
    }
    else {
      S37617=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread39966(int [] tdone, int [] ends){
        S37993=1;
    thread39967(tdone,ends);
    thread39968(tdone,ends);
    thread39969(tdone,ends);
    int biggest39970 = 0;
    if(ends[12]>=biggest39970){
      biggest39970=ends[12];
    }
    if(ends[13]>=biggest39970){
      biggest39970=ends[13];
    }
    if(ends[14]>=biggest39970){
      biggest39970=ends[14];
    }
    if(biggest39970 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread39964(int [] tdone, int [] ends){
        S37569=1;
    S37491=0;
    System.out.println("Manufacture Dehumidifier turned off");//sysj\ECSPlant.sysj line: 124, column: 6
    manufactureACOff.setPresent();//sysj\ECSPlant.sysj line: 125, column: 6
    currsigs.addElement(manufactureACOff);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread39963(int [] tdone, int [] ends){
        S37480=1;
    S37402=0;
    System.out.println("Storage Dehumidifier turned off");//sysj\ECSPlant.sysj line: 109, column: 6
    storageACOff.setPresent();//sysj\ECSPlant.sysj line: 110, column: 6
    currsigs.addElement(storageACOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread39962(int [] tdone, int [] ends){
        S37391=1;
    S37313=0;
    System.out.println("Office Dehumidifier turned off");//sysj\ECSPlant.sysj line: 94, column: 6
    officeACOff.setPresent();//sysj\ECSPlant.sysj line: 95, column: 6
    currsigs.addElement(officeACOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread39961(int [] tdone, int [] ends){
        S37571=1;
    thread39962(tdone,ends);
    thread39963(tdone,ends);
    thread39964(tdone,ends);
    int biggest39965 = 0;
    if(ends[8]>=biggest39965){
      biggest39965=ends[8];
    }
    if(ends[9]>=biggest39965){
      biggest39965=ends[9];
    }
    if(ends[10]>=biggest39965){
      biggest39965=ends[10];
    }
    if(biggest39965 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread39960(int [] tdone, int [] ends){
        S37302=1;
    S37224=0;
    System.out.println("Office Heater turned off");//sysj\ECSPlant.sysj line: 78, column: 5
    officeHeaterOff.setPresent();//sysj\ECSPlant.sysj line: 79, column: 5
    currsigs.addElement(officeHeaterOff);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread39958(int [] tdone, int [] ends){
        S37211=1;
    S37133=0;
    System.out.println("Manufacture AC turned off");//sysj\ECSPlant.sysj line: 61, column: 6
    manufactureACOff.setPresent();//sysj\ECSPlant.sysj line: 62, column: 6
    currsigs.addElement(manufactureACOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread39957(int [] tdone, int [] ends){
        S37122=1;
    S37044=0;
    System.out.println("Storage AC turned off");//sysj\ECSPlant.sysj line: 46, column: 6
    storageACOff.setPresent();//sysj\ECSPlant.sysj line: 47, column: 6
    currsigs.addElement(storageACOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread39956(int [] tdone, int [] ends){
        S37033=1;
    S36955=0;
    System.out.println("Office AC turned off");//sysj\ECSPlant.sysj line: 31, column: 6
    officeACOff.setPresent();//sysj\ECSPlant.sysj line: 32, column: 6
    currsigs.addElement(officeACOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread39955(int [] tdone, int [] ends){
        S37213=1;
    thread39956(tdone,ends);
    thread39957(tdone,ends);
    thread39958(tdone,ends);
    int biggest39959 = 0;
    if(ends[3]>=biggest39959){
      biggest39959=ends[3];
    }
    if(ends[4]>=biggest39959){
      biggest39959=ends[4];
    }
    if(ends[5]>=biggest39959){
      biggest39959=ends[5];
    }
    if(biggest39959 == 1){
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
      switch(S39953){
        case 0 : 
          S39953=0;
          break RUN;
        
        case 1 : 
          S39953=2;
          S39953=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\ECSPlant.sysj line: 18, column: 3
            public void run() {//sysj\ECSPlant.sysj line: 21, column: 21
              org.compsys704.ECSGUI.main(null);//sysj\ECSPlant.sysj line: 22, column: 4
            }
            GUI(){//sysj\ECSPlant.sysj line: 20, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\ECSPlant.sysj line: 25, column: 2
          thread39955(tdone,ends);
          thread39960(tdone,ends);
          thread39961(tdone,ends);
          thread39966(tdone,ends);
          thread39971(tdone,ends);
          thread39976(tdone,ends);
          int biggest40001 = 0;
          if(ends[2]>=biggest40001){
            biggest40001=ends[2];
          }
          if(ends[6]>=biggest40001){
            biggest40001=ends[6];
          }
          if(ends[7]>=biggest40001){
            biggest40001=ends[7];
          }
          if(ends[11]>=biggest40001){
            biggest40001=ends[11];
          }
          if(ends[15]>=biggest40001){
            biggest40001=ends[15];
          }
          if(ends[19]>=biggest40001){
            biggest40001=ends[19];
          }
          if(biggest40001 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread40002(tdone,ends);
          thread40007(tdone,ends);
          thread40008(tdone,ends);
          thread40013(tdone,ends);
          thread40018(tdone,ends);
          thread40023(tdone,ends);
          int biggest40048 = 0;
          if(ends[2]>=biggest40048){
            biggest40048=ends[2];
          }
          if(ends[6]>=biggest40048){
            biggest40048=ends[6];
          }
          if(ends[7]>=biggest40048){
            biggest40048=ends[7];
          }
          if(ends[11]>=biggest40048){
            biggest40048=ends[11];
          }
          if(ends[15]>=biggest40048){
            biggest40048=ends[15];
          }
          if(ends[19]>=biggest40048){
            biggest40048=ends[19];
          }
          if(biggest40048 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest40048 == 0){
            S39953=0;
            active[1]=0;
            ends[1]=0;
            S39953=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          officeAC.gethook();
          officeHeater.gethook();
          officeLight.gethook();
          storageAC.gethook();
          storageLight.gethook();
          manufactureAC.gethook();
          manufactureLight.gethook();
          officeSiren.gethook();
          storageSiren.gethook();
          manufactureSiren.gethook();
          officeDehumidifier.gethook();
          storageDehumidifier.gethook();
          manufactureDehumidifier.gethook();
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      officeAC.setpreclear();
      officeHeater.setpreclear();
      officeLight.setpreclear();
      storageAC.setpreclear();
      storageLight.setpreclear();
      manufactureAC.setpreclear();
      manufactureLight.setpreclear();
      officeSiren.setpreclear();
      storageSiren.setpreclear();
      manufactureSiren.setpreclear();
      officeDehumidifier.setpreclear();
      storageDehumidifier.setpreclear();
      manufactureDehumidifier.setpreclear();
      enable.setpreclear();
      officeACOn.setpreclear();
      officeACOff.setpreclear();
      storageACOn.setpreclear();
      storageACOff.setpreclear();
      manufactureACOn.setpreclear();
      manufactureACOff.setpreclear();
      officeHeaterOn.setpreclear();
      officeHeaterOff.setpreclear();
      officeLight100.setpreclear();
      officeLight50.setpreclear();
      officeLight0.setpreclear();
      storageLight100.setpreclear();
      storageLight50.setpreclear();
      storageLight0.setpreclear();
      manufactureLight100.setpreclear();
      manufactureLight50.setpreclear();
      manufactureLight0.setpreclear();
      officeSirenOn.setpreclear();
      officeSirenOff.setpreclear();
      storageSirenOn.setpreclear();
      storageSirenOff.setpreclear();
      manufactureSirenOn.setpreclear();
      manufactureSirenOff.setpreclear();
      officeACOnE.setpreclear();
      officeACOffE.setpreclear();
      storageACOnE.setpreclear();
      storageACOffE.setpreclear();
      manufactureACOnE.setpreclear();
      manufactureACOffE.setpreclear();
      officeHeaterOnE.setpreclear();
      officeHeaterOffE.setpreclear();
      officeLight100E.setpreclear();
      officeLight50E.setpreclear();
      officeLight0E.setpreclear();
      storageLight100E.setpreclear();
      storageLight50E.setpreclear();
      storageLight0E.setpreclear();
      manufactureLight100E.setpreclear();
      manufactureLight50E.setpreclear();
      manufactureLight0E.setpreclear();
      officeSirenOnE.setpreclear();
      officeSirenOffE.setpreclear();
      storageSirenOnE.setpreclear();
      storageSirenOffE.setpreclear();
      manufactureSirenOnE.setpreclear();
      manufactureSirenOffE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = officeAC.getStatus() ? officeAC.setprepresent() : officeAC.setpreclear();
      officeAC.setpreval(officeAC.getValue());
      officeAC.setClear();
      dummyint = officeHeater.getStatus() ? officeHeater.setprepresent() : officeHeater.setpreclear();
      officeHeater.setpreval(officeHeater.getValue());
      officeHeater.setClear();
      dummyint = officeLight.getStatus() ? officeLight.setprepresent() : officeLight.setpreclear();
      officeLight.setpreval(officeLight.getValue());
      officeLight.setClear();
      dummyint = storageAC.getStatus() ? storageAC.setprepresent() : storageAC.setpreclear();
      storageAC.setpreval(storageAC.getValue());
      storageAC.setClear();
      dummyint = storageLight.getStatus() ? storageLight.setprepresent() : storageLight.setpreclear();
      storageLight.setpreval(storageLight.getValue());
      storageLight.setClear();
      dummyint = manufactureAC.getStatus() ? manufactureAC.setprepresent() : manufactureAC.setpreclear();
      manufactureAC.setpreval(manufactureAC.getValue());
      manufactureAC.setClear();
      dummyint = manufactureLight.getStatus() ? manufactureLight.setprepresent() : manufactureLight.setpreclear();
      manufactureLight.setpreval(manufactureLight.getValue());
      manufactureLight.setClear();
      dummyint = officeSiren.getStatus() ? officeSiren.setprepresent() : officeSiren.setpreclear();
      officeSiren.setpreval(officeSiren.getValue());
      officeSiren.setClear();
      dummyint = storageSiren.getStatus() ? storageSiren.setprepresent() : storageSiren.setpreclear();
      storageSiren.setpreval(storageSiren.getValue());
      storageSiren.setClear();
      dummyint = manufactureSiren.getStatus() ? manufactureSiren.setprepresent() : manufactureSiren.setpreclear();
      manufactureSiren.setpreval(manufactureSiren.getValue());
      manufactureSiren.setClear();
      dummyint = officeDehumidifier.getStatus() ? officeDehumidifier.setprepresent() : officeDehumidifier.setpreclear();
      officeDehumidifier.setpreval(officeDehumidifier.getValue());
      officeDehumidifier.setClear();
      dummyint = storageDehumidifier.getStatus() ? storageDehumidifier.setprepresent() : storageDehumidifier.setpreclear();
      storageDehumidifier.setpreval(storageDehumidifier.getValue());
      storageDehumidifier.setClear();
      dummyint = manufactureDehumidifier.getStatus() ? manufactureDehumidifier.setprepresent() : manufactureDehumidifier.setpreclear();
      manufactureDehumidifier.setpreval(manufactureDehumidifier.getValue());
      manufactureDehumidifier.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      officeACOn.sethook();
      officeACOn.setClear();
      officeACOff.sethook();
      officeACOff.setClear();
      storageACOn.sethook();
      storageACOn.setClear();
      storageACOff.sethook();
      storageACOff.setClear();
      manufactureACOn.sethook();
      manufactureACOn.setClear();
      manufactureACOff.sethook();
      manufactureACOff.setClear();
      officeHeaterOn.sethook();
      officeHeaterOn.setClear();
      officeHeaterOff.sethook();
      officeHeaterOff.setClear();
      officeLight100.sethook();
      officeLight100.setClear();
      officeLight50.sethook();
      officeLight50.setClear();
      officeLight0.sethook();
      officeLight0.setClear();
      storageLight100.sethook();
      storageLight100.setClear();
      storageLight50.sethook();
      storageLight50.setClear();
      storageLight0.sethook();
      storageLight0.setClear();
      manufactureLight100.sethook();
      manufactureLight100.setClear();
      manufactureLight50.sethook();
      manufactureLight50.setClear();
      manufactureLight0.sethook();
      manufactureLight0.setClear();
      officeSirenOn.sethook();
      officeSirenOn.setClear();
      officeSirenOff.sethook();
      officeSirenOff.setClear();
      storageSirenOn.sethook();
      storageSirenOn.setClear();
      storageSirenOff.sethook();
      storageSirenOff.setClear();
      manufactureSirenOn.sethook();
      manufactureSirenOn.setClear();
      manufactureSirenOff.sethook();
      manufactureSirenOff.setClear();
      officeACOnE.sethook();
      officeACOnE.setClear();
      officeACOffE.sethook();
      officeACOffE.setClear();
      storageACOnE.sethook();
      storageACOnE.setClear();
      storageACOffE.sethook();
      storageACOffE.setClear();
      manufactureACOnE.sethook();
      manufactureACOnE.setClear();
      manufactureACOffE.sethook();
      manufactureACOffE.setClear();
      officeHeaterOnE.sethook();
      officeHeaterOnE.setClear();
      officeHeaterOffE.sethook();
      officeHeaterOffE.setClear();
      officeLight100E.sethook();
      officeLight100E.setClear();
      officeLight50E.sethook();
      officeLight50E.setClear();
      officeLight0E.sethook();
      officeLight0E.setClear();
      storageLight100E.sethook();
      storageLight100E.setClear();
      storageLight50E.sethook();
      storageLight50E.setClear();
      storageLight0E.sethook();
      storageLight0E.setClear();
      manufactureLight100E.sethook();
      manufactureLight100E.setClear();
      manufactureLight50E.sethook();
      manufactureLight50E.setClear();
      manufactureLight0E.sethook();
      manufactureLight0E.setClear();
      officeSirenOnE.sethook();
      officeSirenOnE.setClear();
      officeSirenOffE.sethook();
      officeSirenOffE.setClear();
      storageSirenOnE.sethook();
      storageSirenOnE.setClear();
      storageSirenOffE.sethook();
      storageSirenOffE.setClear();
      manufactureSirenOnE.sethook();
      manufactureSirenOnE.setClear();
      manufactureSirenOffE.sethook();
      manufactureSirenOffE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        officeAC.gethook();
        officeHeater.gethook();
        officeLight.gethook();
        storageAC.gethook();
        storageLight.gethook();
        manufactureAC.gethook();
        manufactureLight.gethook();
        officeSiren.gethook();
        storageSiren.gethook();
        manufactureSiren.gethook();
        officeDehumidifier.gethook();
        storageDehumidifier.gethook();
        manufactureDehumidifier.gethook();
        enable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
