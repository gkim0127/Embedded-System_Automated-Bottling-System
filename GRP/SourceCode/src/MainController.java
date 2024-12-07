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
  public Signal disableConveyorMain = new Signal("disableConveyorMain", Signal.INPUT);
  public Signal systemEnable = new Signal("systemEnable", Signal.INPUT);
  public Signal LiquidAmount1E = new Signal("LiquidAmount1E", Signal.OUTPUT);
  public Signal LiquidAmount2E = new Signal("LiquidAmount2E", Signal.OUTPUT);
  public Signal LiquidAmount3E = new Signal("LiquidAmount3E", Signal.OUTPUT);
  public Signal LiquidAmount4E = new Signal("LiquidAmount4E", Signal.OUTPUT);
  public Signal BottleQuantityE = new Signal("BottleQuantityE", Signal.OUTPUT);
  public Signal enableConveyorMain = new Signal("enableConveyorMain", Signal.OUTPUT);
  public Signal systemEnableFiller = new Signal("systemEnableFiller", Signal.OUTPUT);
  private Signal allValid_1;
  private Signal checkSystemEnable_1;
  private long __start_thread_2;//sysj\MainController.sysj line: 18, column: 2
  private int S199559 = 1;
  private int S199347 = 1;
  private int S199315 = 1;
  private int S199302 = 1;
  private int S199355 = 1;
  private int S199349 = 1;
  private int S199549 = 1;
  private int S199357 = 1;
  private int S199362 = 1;
  private int S199367 = 1;
  private int S199372 = 1;
  private int S199377 = 1;
  private int S199382 = 1;
  private int S199387 = 1;
  private int S199557 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread199583(int [] tdone, int [] ends){
        switch(S199557){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(systemEnable.getprestatus()){//sysj\MainController.sysj line: 87, column: 12
          systemEnableFiller.setPresent();//sysj\MainController.sysj line: 88, column: 5
          currsigs.addElement(systemEnableFiller);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread199581(int [] tdone, int [] ends){
        switch(S199387){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        enableConveyorMain.setPresent();//sysj\MainController.sysj line: 75, column: 7
        currsigs.addElement(enableConveyorMain);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread199580(int [] tdone, int [] ends){
        switch(S199382){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        BottleQuantityE.setPresent();//sysj\MainController.sysj line: 71, column: 7
        currsigs.addElement(BottleQuantityE);
        BottleQuantityE.setValue((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()));//sysj\MainController.sysj line: 71, column: 7
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread199579(int [] tdone, int [] ends){
        switch(S199377){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        LiquidAmount4E.setPresent();//sysj\MainController.sysj line: 67, column: 7
        currsigs.addElement(LiquidAmount4E);
        LiquidAmount4E.setValue((LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue()));//sysj\MainController.sysj line: 67, column: 7
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread199578(int [] tdone, int [] ends){
        switch(S199372){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        LiquidAmount3E.setPresent();//sysj\MainController.sysj line: 63, column: 7
        currsigs.addElement(LiquidAmount3E);
        LiquidAmount3E.setValue((LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()));//sysj\MainController.sysj line: 63, column: 7
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread199577(int [] tdone, int [] ends){
        switch(S199367){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        LiquidAmount2E.setPresent();//sysj\MainController.sysj line: 59, column: 7
        currsigs.addElement(LiquidAmount2E);
        LiquidAmount2E.setValue((LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()));//sysj\MainController.sysj line: 59, column: 7
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread199576(int [] tdone, int [] ends){
        switch(S199362){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        LiquidAmount1E.setPresent();//sysj\MainController.sysj line: 55, column: 7
        currsigs.addElement(LiquidAmount1E);
        LiquidAmount1E.setValue((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()));//sysj\MainController.sysj line: 55, column: 7
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread199574(int [] tdone, int [] ends){
        S199387=1;
    enableConveyorMain.setPresent();//sysj\MainController.sysj line: 75, column: 7
    currsigs.addElement(enableConveyorMain);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread199573(int [] tdone, int [] ends){
        S199382=1;
    BottleQuantityE.setPresent();//sysj\MainController.sysj line: 71, column: 7
    currsigs.addElement(BottleQuantityE);
    BottleQuantityE.setValue((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()));//sysj\MainController.sysj line: 71, column: 7
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread199572(int [] tdone, int [] ends){
        S199377=1;
    LiquidAmount4E.setPresent();//sysj\MainController.sysj line: 67, column: 7
    currsigs.addElement(LiquidAmount4E);
    LiquidAmount4E.setValue((LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue()));//sysj\MainController.sysj line: 67, column: 7
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread199571(int [] tdone, int [] ends){
        S199372=1;
    LiquidAmount3E.setPresent();//sysj\MainController.sysj line: 63, column: 7
    currsigs.addElement(LiquidAmount3E);
    LiquidAmount3E.setValue((LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()));//sysj\MainController.sysj line: 63, column: 7
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread199570(int [] tdone, int [] ends){
        S199367=1;
    LiquidAmount2E.setPresent();//sysj\MainController.sysj line: 59, column: 7
    currsigs.addElement(LiquidAmount2E);
    LiquidAmount2E.setValue((LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()));//sysj\MainController.sysj line: 59, column: 7
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread199569(int [] tdone, int [] ends){
        S199362=1;
    LiquidAmount1E.setPresent();//sysj\MainController.sysj line: 55, column: 7
    currsigs.addElement(LiquidAmount1E);
    LiquidAmount1E.setValue((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()));//sysj\MainController.sysj line: 55, column: 7
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread199568(int [] tdone, int [] ends){
        switch(S199549){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S199357){
          case 0 : 
            if(systemEnable.getprestatus()){//sysj\MainController.sysj line: 49, column: 10
              S199357=1;
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
            S199357=1;
            S199357=2;
            thread199569(tdone,ends);
            thread199570(tdone,ends);
            thread199571(tdone,ends);
            thread199572(tdone,ends);
            thread199573(tdone,ends);
            thread199574(tdone,ends);
            int biggest199575 = 0;
            if(ends[5]>=biggest199575){
              biggest199575=ends[5];
            }
            if(ends[6]>=biggest199575){
              biggest199575=ends[6];
            }
            if(ends[7]>=biggest199575){
              biggest199575=ends[7];
            }
            if(ends[8]>=biggest199575){
              biggest199575=ends[8];
            }
            if(ends[9]>=biggest199575){
              biggest199575=ends[9];
            }
            if(ends[10]>=biggest199575){
              biggest199575=ends[10];
            }
            if(biggest199575 == 1){
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if(disableConveyorMain.getprestatus()){//sysj\MainController.sysj line: 52, column: 10
              S199357=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              thread199576(tdone,ends);
              thread199577(tdone,ends);
              thread199578(tdone,ends);
              thread199579(tdone,ends);
              thread199580(tdone,ends);
              thread199581(tdone,ends);
              int biggest199582 = 0;
              if(ends[5]>=biggest199582){
                biggest199582=ends[5];
              }
              if(ends[6]>=biggest199582){
                biggest199582=ends[6];
              }
              if(ends[7]>=biggest199582){
                biggest199582=ends[7];
              }
              if(ends[8]>=biggest199582){
                biggest199582=ends[8];
              }
              if(ends[9]>=biggest199582){
                biggest199582=ends[9];
              }
              if(ends[10]>=biggest199582){
                biggest199582=ends[10];
              }
              if(biggest199582 == 1){
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              //FINXME code
              if(biggest199582 == 0){
                S199357=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
          case 3 : 
            S199357=3;
            System.out.println("Aborted: disableConveyorMain detected");//sysj\MainController.sysj line: 79, column: 4
            S199357=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread199567(int [] tdone, int [] ends){
        switch(S199355){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S199349){
          case 0 : 
            S199349=1;
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
          case 1 : 
            S199349=1;
            S199349=0;
            if((((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()) + (LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()) + (LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()) + (LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue())) == 100) && ((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()) > 0)){//sysj\MainController.sysj line: 34, column: 8
              allValid_1.setPresent();//sysj\MainController.sysj line: 36, column: 5
              currsigs.addElement(allValid_1);
              S199349=1;
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

  public void thread199566(int [] tdone, int [] ends){
        switch(S199347){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S199315){
          case 0 : 
            switch(S199302){
              case 0 : 
                S199302=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\MainController.sysj line: 18, column: 2
                  ends[2]=2;
                  ;//sysj\MainController.sysj line: 18, column: 2
                  System.out.println((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()));//sysj\MainController.sysj line: 21, column: 3
                  System.out.println((LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()));//sysj\MainController.sysj line: 22, column: 3
                  System.out.println((LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()));//sysj\MainController.sysj line: 23, column: 3
                  System.out.println((LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue()));//sysj\MainController.sysj line: 24, column: 3
                  System.out.println((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()));//sysj\MainController.sysj line: 25, column: 3
                  System.out.println("");//sysj\MainController.sysj line: 27, column: 3
                  S199315=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S199302=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S199302=1;
                S199302=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\MainController.sysj line: 18, column: 2
                  ends[2]=2;
                  ;//sysj\MainController.sysj line: 18, column: 2
                  System.out.println((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()));//sysj\MainController.sysj line: 21, column: 3
                  System.out.println((LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()));//sysj\MainController.sysj line: 22, column: 3
                  System.out.println((LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()));//sysj\MainController.sysj line: 23, column: 3
                  System.out.println((LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue()));//sysj\MainController.sysj line: 24, column: 3
                  System.out.println((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()));//sysj\MainController.sysj line: 25, column: 3
                  System.out.println("");//sysj\MainController.sysj line: 27, column: 3
                  S199315=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S199302=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S199315=1;
            S199315=0;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\MainController.sysj line: 18, column: 2
            S199302=0;
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\MainController.sysj line: 18, column: 2
              ends[2]=2;
              ;//sysj\MainController.sysj line: 18, column: 2
              System.out.println((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()));//sysj\MainController.sysj line: 21, column: 3
              System.out.println((LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()));//sysj\MainController.sysj line: 22, column: 3
              System.out.println((LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()));//sysj\MainController.sysj line: 23, column: 3
              System.out.println((LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue()));//sysj\MainController.sysj line: 24, column: 3
              System.out.println((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()));//sysj\MainController.sysj line: 25, column: 3
              System.out.println("");//sysj\MainController.sysj line: 27, column: 3
              S199315=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S199302=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread199564(int [] tdone, int [] ends){
        S199557=1;
    if(systemEnable.getprestatus()){//sysj\MainController.sysj line: 87, column: 12
      systemEnableFiller.setPresent();//sysj\MainController.sysj line: 88, column: 5
      currsigs.addElement(systemEnableFiller);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread199563(int [] tdone, int [] ends){
        S199549=1;
    S199357=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread199562(int [] tdone, int [] ends){
        S199355=1;
    S199349=0;
    if((((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()) + (LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()) + (LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()) + (LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue())) == 100) && ((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()) > 0)){//sysj\MainController.sysj line: 34, column: 8
      allValid_1.setPresent();//sysj\MainController.sysj line: 36, column: 5
      currsigs.addElement(allValid_1);
      S199349=1;
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

  public void thread199561(int [] tdone, int [] ends){
        S199347=1;
    S199315=0;
    __start_thread_2 = com.systemj.Timer.getMs();//sysj\MainController.sysj line: 18, column: 2
    S199302=0;
    if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\MainController.sysj line: 18, column: 2
      ends[2]=2;
      ;//sysj\MainController.sysj line: 18, column: 2
      System.out.println((LiquidAmount1.getpreval() == null ? 0 : ((Integer)LiquidAmount1.getpreval()).intValue()));//sysj\MainController.sysj line: 21, column: 3
      System.out.println((LiquidAmount2.getpreval() == null ? 0 : ((Integer)LiquidAmount2.getpreval()).intValue()));//sysj\MainController.sysj line: 22, column: 3
      System.out.println((LiquidAmount3.getpreval() == null ? 0 : ((Integer)LiquidAmount3.getpreval()).intValue()));//sysj\MainController.sysj line: 23, column: 3
      System.out.println((LiquidAmount4.getpreval() == null ? 0 : ((Integer)LiquidAmount4.getpreval()).intValue()));//sysj\MainController.sysj line: 24, column: 3
      System.out.println((BottleQuantity.getpreval() == null ? 0 : ((Integer)BottleQuantity.getpreval()).intValue()));//sysj\MainController.sysj line: 25, column: 3
      System.out.println("");//sysj\MainController.sysj line: 27, column: 3
      S199315=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S199302=1;
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
      switch(S199559){
        case 0 : 
          S199559=0;
          break RUN;
        
        case 1 : 
          S199559=2;
          S199559=2;
          allValid_1.setClear();//sysj\MainController.sysj line: 16, column: 2
          checkSystemEnable_1.setClear();//sysj\MainController.sysj line: 16, column: 2
          thread199561(tdone,ends);
          thread199562(tdone,ends);
          thread199563(tdone,ends);
          thread199564(tdone,ends);
          int biggest199565 = 0;
          if(ends[2]>=biggest199565){
            biggest199565=ends[2];
          }
          if(ends[3]>=biggest199565){
            biggest199565=ends[3];
          }
          if(ends[4]>=biggest199565){
            biggest199565=ends[4];
          }
          if(ends[11]>=biggest199565){
            biggest199565=ends[11];
          }
          if(biggest199565 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          allValid_1.setClear();//sysj\MainController.sysj line: 16, column: 2
          checkSystemEnable_1.setClear();//sysj\MainController.sysj line: 16, column: 2
          thread199566(tdone,ends);
          thread199567(tdone,ends);
          thread199568(tdone,ends);
          thread199583(tdone,ends);
          int biggest199584 = 0;
          if(ends[2]>=biggest199584){
            biggest199584=ends[2];
          }
          if(ends[3]>=biggest199584){
            biggest199584=ends[3];
          }
          if(ends[4]>=biggest199584){
            biggest199584=ends[4];
          }
          if(ends[11]>=biggest199584){
            biggest199584=ends[11];
          }
          if(biggest199584 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest199584 == 0){
            S199559=0;
            active[1]=0;
            ends[1]=0;
            S199559=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    allValid_1 = new Signal();
    checkSystemEnable_1 = new Signal();
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
          disableConveyorMain.gethook();
          systemEnable.gethook();
          df = true;
        }
        runClockDomain();
      }
      LiquidAmount1.setpreclear();
      LiquidAmount2.setpreclear();
      LiquidAmount3.setpreclear();
      LiquidAmount4.setpreclear();
      BottleQuantity.setpreclear();
      disableConveyorMain.setpreclear();
      systemEnable.setpreclear();
      LiquidAmount1E.setpreclear();
      LiquidAmount2E.setpreclear();
      LiquidAmount3E.setpreclear();
      LiquidAmount4E.setpreclear();
      BottleQuantityE.setpreclear();
      enableConveyorMain.setpreclear();
      systemEnableFiller.setpreclear();
      allValid_1.setpreclear();
      checkSystemEnable_1.setpreclear();
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
      dummyint = disableConveyorMain.getStatus() ? disableConveyorMain.setprepresent() : disableConveyorMain.setpreclear();
      disableConveyorMain.setpreval(disableConveyorMain.getValue());
      disableConveyorMain.setClear();
      dummyint = systemEnable.getStatus() ? systemEnable.setprepresent() : systemEnable.setpreclear();
      systemEnable.setpreval(systemEnable.getValue());
      systemEnable.setClear();
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
      enableConveyorMain.sethook();
      enableConveyorMain.setClear();
      systemEnableFiller.sethook();
      systemEnableFiller.setClear();
      allValid_1.setClear();
      checkSystemEnable_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        LiquidAmount1.gethook();
        LiquidAmount2.gethook();
        LiquidAmount3.gethook();
        LiquidAmount4.gethook();
        BottleQuantity.gethook();
        disableConveyorMain.gethook();
        systemEnable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
