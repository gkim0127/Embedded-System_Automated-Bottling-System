import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantConveyor extends ClockDomain{
  public PlantConveyor(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal enableConveyor = new Signal("enableConveyor", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal bottleNumber = new Signal("bottleNumber", Signal.INPUT);
  public Signal bottleAtLoad = new Signal("bottleAtLoad", Signal.OUTPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottleAtLoadE = new Signal("bottleAtLoadE", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  public Signal bottleAtPos1M = new Signal("bottleAtPos1M", Signal.OUTPUT);
  private Signal bottleDec_1;
  private Signal bottleAt1_1;
  private Signal bottleAtL_1;
  private Signal bottleAt5_1;
  private Signal motorOn_1;
  private Signal motorOff_1;
  private Signal empty_1;
  private Signal bottlePos_1;
  private int bottlecount_thread_7;//sysj\plantConveyor.sysj line: 95, column: 3
  private int data_thread_3;//sysj\plantConveyor.sysj line: 38, column: 3
  private int S37553 = 1;
  private int S34743 = 1;
  private int S34675 = 1;
  private int S35190 = 1;
  private int S34746 = 1;
  private int S34788 = 1;
  private int S34787 = 1;
  private int S34786 = 1;
  private int S34759 = 1;
  private int S34764 = 1;
  private int S35267 = 1;
  private int S35215 = 1;
  private int S35191 = 1;
  private int S35341 = 1;
  private int S35269 = 1;
  private int S35367 = 1;
  private int S35349 = 1;
  private int S35357 = 1;
  private int S35365 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread37578(int [] tdone, int [] ends){
        switch(S35365){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleAtLoad.getprestatus()){//sysj\plantConveyor.sysj line: 117, column: 24
          bottleAtLoadE.setPresent();//sysj\plantConveyor.sysj line: 117, column: 38
          currsigs.addElement(bottleAtLoadE);
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

  public void thread37577(int [] tdone, int [] ends){
        switch(S35357){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\plantConveyor.sysj line: 115, column: 24
          bottleLeftPos5E.setPresent();//sysj\plantConveyor.sysj line: 115, column: 40
          currsigs.addElement(bottleLeftPos5E);
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
  }

  public void thread37576(int [] tdone, int [] ends){
        switch(S35349){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plantConveyor.sysj line: 113, column: 24
          bottleAtPos1E.setPresent();//sysj\plantConveyor.sysj line: 113, column: 38
          currsigs.addElement(bottleAtPos1E);
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
  }

  public void thread37575(int [] tdone, int [] ends){
        switch(S35367){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread37576(tdone,ends);
        thread37577(tdone,ends);
        thread37578(tdone,ends);
        int biggest37579 = 0;
        if(ends[9]>=biggest37579){
          biggest37579=ends[9];
        }
        if(ends[10]>=biggest37579){
          biggest37579=ends[10];
        }
        if(ends[11]>=biggest37579){
          biggest37579=ends[11];
        }
        if(biggest37579 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest37579 == 0){
          S35367=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread37574(int [] tdone, int [] ends){
        switch(S35341){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S35269){
          case 0 : 
            if(bottleNumber.getprestatus()){//sysj\plantConveyor.sysj line: 97, column: 11
              bottlecount_thread_7 = (Integer)(bottleNumber.getpreval() == null ? null : ((Integer)bottleNumber.getpreval()));//sysj\plantConveyor.sysj line: 98, column: 4
              S35269=1;
              if(bottleDec_1.getprestatus()){//sysj\plantConveyor.sysj line: 99, column: 12
                if(bottlecount_thread_7 > 0) {//sysj\plantConveyor.sysj line: 100, column: 5
                  bottlecount_thread_7 = bottlecount_thread_7 - 1;//sysj\plantConveyor.sysj line: 101, column: 6
                }
                if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 103, column: 12
                  bottlecount_thread_7 = (Integer)(bottleNumber.getpreval() == null ? null : ((Integer)bottleNumber.getpreval()));//sysj\plantConveyor.sysj line: 104, column: 5
                  if(bottlecount_thread_7 == 0){//sysj\plantConveyor.sysj line: 106, column: 7
                    empty_1.setPresent();//sysj\plantConveyor.sysj line: 107, column: 4
                    currsigs.addElement(empty_1);
                    S35269=2;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    S35269=2;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                else {
                  if(bottlecount_thread_7 == 0){//sysj\plantConveyor.sysj line: 106, column: 7
                    empty_1.setPresent();//sysj\plantConveyor.sysj line: 107, column: 4
                    currsigs.addElement(empty_1);
                    S35269=2;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    S35269=2;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
              }
              else {
                if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 103, column: 12
                  bottlecount_thread_7 = (Integer)(bottleNumber.getpreval() == null ? null : ((Integer)bottleNumber.getpreval()));//sysj\plantConveyor.sysj line: 104, column: 5
                  if(bottlecount_thread_7 == 0){//sysj\plantConveyor.sysj line: 106, column: 7
                    empty_1.setPresent();//sysj\plantConveyor.sysj line: 107, column: 4
                    currsigs.addElement(empty_1);
                    S35269=2;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    S35269=2;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                else {
                  if(bottlecount_thread_7 == 0){//sysj\plantConveyor.sysj line: 106, column: 7
                    empty_1.setPresent();//sysj\plantConveyor.sysj line: 107, column: 4
                    currsigs.addElement(empty_1);
                    S35269=2;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    S35269=2;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S35269=0;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
          case 2 : 
            S35269=2;
            S35269=0;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread37573(int [] tdone, int [] ends){
        switch(S35267){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S35215){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\plantConveyor.sysj line: 75, column: 10
              S35215=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              switch(S35191){
                case 0 : 
                  if(motorOn_1.getprestatus()){//sysj\plantConveyor.sysj line: 79, column: 12
                    bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 81, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(1);//sysj\plantConveyor.sysj line: 81, column: 6
                    bottleAt1_1.setPresent();//sysj\plantConveyor.sysj line: 82, column: 6
                    currsigs.addElement(bottleAt1_1);
                    S35191=1;
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
                
                case 1 : 
                  if(enable.getprestatus() && motorOn_1.getprestatus()){//sysj\plantConveyor.sysj line: 83, column: 13
                    bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 84, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(2);//sysj\plantConveyor.sysj line: 84, column: 6
                    bottleAt5_1.setPresent();//sysj\plantConveyor.sysj line: 85, column: 6
                    currsigs.addElement(bottleAt5_1);
                    S35191=2;
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
                  if(!enable.getprestatus()){//sysj\plantConveyor.sysj line: 86, column: 13
                    bottleDec_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 6
                    currsigs.addElement(bottleDec_1);
                    bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 77, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(0);//sysj\plantConveyor.sysj line: 77, column: 6
                    bottleAtL_1.setPresent();//sysj\plantConveyor.sysj line: 78, column: 6
                    currsigs.addElement(bottleAtL_1);
                    S35191=0;
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
            }
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 90, column: 10
              S35215=0;
              bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 77, column: 6
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(0);//sysj\plantConveyor.sysj line: 77, column: 6
              bottleAtL_1.setPresent();//sysj\plantConveyor.sysj line: 78, column: 6
              currsigs.addElement(bottleAtL_1);
              S35191=0;
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

  public void thread37571(int [] tdone, int [] ends){
        switch(S34764){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        bottleAtPos1M.setPresent();//sysj\plantConveyor.sysj line: 52, column: 7
        currsigs.addElement(bottleAtPos1M);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread37570(int [] tdone, int [] ends){
        switch(S34759){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        bottleAtPos1.setPresent();//sysj\plantConveyor.sysj line: 50, column: 7
        currsigs.addElement(bottleAtPos1);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread37568(int [] tdone, int [] ends){
        S34764=1;
    bottleAtPos1M.setPresent();//sysj\plantConveyor.sysj line: 52, column: 7
    currsigs.addElement(bottleAtPos1M);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread37567(int [] tdone, int [] ends){
        S34759=1;
    bottleAtPos1.setPresent();//sysj\plantConveyor.sysj line: 50, column: 7
    currsigs.addElement(bottleAtPos1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread37566(int [] tdone, int [] ends){
        switch(S35190){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S34746){
          case 0 : 
            if(enableConveyor.getprestatus()){//sysj\plantConveyor.sysj line: 39, column: 10
              S34746=1;
              if((!enableConveyor.getprestatus())){//sysj\plantConveyor.sysj line: 40, column: 20
                data_thread_3 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantConveyor.sysj line: 38, column: 3
                S34746=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S34788=0;
                if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantConveyor.sysj line: 41, column: 7
                  S34787=0;
                  System.out.println("bottleAtLoad");//sysj\plantConveyor.sysj line: 43, column: 6
                  bottleAtLoad.setPresent();//sysj\plantConveyor.sysj line: 44, column: 6
                  currsigs.addElement(bottleAtLoad);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S34787=1;
                  if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantConveyor.sysj line: 47, column: 12
                    S34786=0;
                    System.out.println("bottleAtPos1");//sysj\plantConveyor.sysj line: 49, column: 6
                    thread37567(tdone,ends);
                    thread37568(tdone,ends);
                    int biggest37569 = 0;
                    if(ends[4]>=biggest37569){
                      biggest37569=ends[4];
                    }
                    if(ends[5]>=biggest37569){
                      biggest37569=ends[5];
                    }
                    if(biggest37569 == 1){
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                  else {
                    S34786=1;
                    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantConveyor.sysj line: 55, column: 12
                      System.out.println("bottleLeftPos5");//sysj\plantConveyor.sysj line: 57, column: 6
                      bottleLeftPos5.setPresent();//sysj\plantConveyor.sysj line: 58, column: 6
                      currsigs.addElement(bottleLeftPos5);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S34788=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
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
            if((!enableConveyor.getprestatus())){//sysj\plantConveyor.sysj line: 40, column: 20
              data_thread_3 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantConveyor.sysj line: 38, column: 3
              S34746=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S34788){
                case 0 : 
                  switch(S34787){
                    case 0 : 
                      if(bottleAt1_1.getprestatus()){//sysj\plantConveyor.sysj line: 42, column: 11
                        S34788=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        bottleAtLoad.setPresent();//sysj\plantConveyor.sysj line: 44, column: 6
                        currsigs.addElement(bottleAtLoad);
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                    case 1 : 
                      switch(S34786){
                        case 0 : 
                          if(bottleAt5_1.getprestatus()){//sysj\plantConveyor.sysj line: 48, column: 11
                            S34788=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            thread37570(tdone,ends);
                            thread37571(tdone,ends);
                            int biggest37572 = 0;
                            if(ends[4]>=biggest37572){
                              biggest37572=ends[4];
                            }
                            if(ends[5]>=biggest37572){
                              biggest37572=ends[5];
                            }
                            if(biggest37572 == 1){
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            //FINXME code
                            if(biggest37572 == 0){
                              S34788=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                          break;
                        
                        case 1 : 
                          if(bottleAtL_1.getprestatus()){//sysj\plantConveyor.sysj line: 56, column: 11
                            S34788=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            bottleLeftPos5.setPresent();//sysj\plantConveyor.sysj line: 58, column: 6
                            currsigs.addElement(bottleLeftPos5);
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          break;
                        
                      }
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S34788=1;
                  data_thread_3 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantConveyor.sysj line: 38, column: 3
                  S34746=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread37565(int [] tdone, int [] ends){
        switch(S34743){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S34675){
          case 0 : 
            if((motConveyorOnOff.getprestatus())){//sysj\plantConveyor.sysj line: 23, column: 21
              S34675=1;
              System.out.println("motorOn");//sysj\plantConveyor.sysj line: 29, column: 5
              motorOn_1.setPresent();//sysj\plantConveyor.sysj line: 30, column: 5
              currsigs.addElement(motorOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOff_1.setPresent();//sysj\plantConveyor.sysj line: 25, column: 5
              currsigs.addElement(motorOff_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if((!motConveyorOnOff.getprestatus())){//sysj\plantConveyor.sysj line: 28, column: 10
              S34675=0;
              if((motConveyorOnOff.getprestatus())){//sysj\plantConveyor.sysj line: 23, column: 21
                S34675=1;
                System.out.println("motorOn");//sysj\plantConveyor.sysj line: 29, column: 5
                motorOn_1.setPresent();//sysj\plantConveyor.sysj line: 30, column: 5
                currsigs.addElement(motorOn_1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("motorOff");//sysj\plantConveyor.sysj line: 24, column: 5
                motorOff_1.setPresent();//sysj\plantConveyor.sysj line: 25, column: 5
                currsigs.addElement(motorOff_1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              motorOn_1.setPresent();//sysj\plantConveyor.sysj line: 30, column: 5
              currsigs.addElement(motorOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread37562(int [] tdone, int [] ends){
        S35365=1;
    if(bottleAtLoad.getprestatus()){//sysj\plantConveyor.sysj line: 117, column: 24
      bottleAtLoadE.setPresent();//sysj\plantConveyor.sysj line: 117, column: 38
      currsigs.addElement(bottleAtLoadE);
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

  public void thread37561(int [] tdone, int [] ends){
        S35357=1;
    if(bottleLeftPos5.getprestatus()){//sysj\plantConveyor.sysj line: 115, column: 24
      bottleLeftPos5E.setPresent();//sysj\plantConveyor.sysj line: 115, column: 40
      currsigs.addElement(bottleLeftPos5E);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread37560(int [] tdone, int [] ends){
        S35349=1;
    if(bottleAtPos1.getprestatus()){//sysj\plantConveyor.sysj line: 113, column: 24
      bottleAtPos1E.setPresent();//sysj\plantConveyor.sysj line: 113, column: 38
      currsigs.addElement(bottleAtPos1E);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread37559(int [] tdone, int [] ends){
        S35367=1;
    thread37560(tdone,ends);
    thread37561(tdone,ends);
    thread37562(tdone,ends);
    int biggest37563 = 0;
    if(ends[9]>=biggest37563){
      biggest37563=ends[9];
    }
    if(ends[10]>=biggest37563){
      biggest37563=ends[10];
    }
    if(ends[11]>=biggest37563){
      biggest37563=ends[11];
    }
    if(biggest37563 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread37558(int [] tdone, int [] ends){
        S35341=1;
        S35269=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread37557(int [] tdone, int [] ends){
        S35267=1;
    S35215=0;
    bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 77, column: 6
    currsigs.addElement(bottlePos_1);
    bottlePos_1.setValue(0);//sysj\plantConveyor.sysj line: 77, column: 6
    bottleAtL_1.setPresent();//sysj\plantConveyor.sysj line: 78, column: 6
    currsigs.addElement(bottleAtL_1);
    S35191=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread37556(int [] tdone, int [] ends){
        S35190=1;
    data_thread_3 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantConveyor.sysj line: 38, column: 3
    S34746=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread37555(int [] tdone, int [] ends){
        S34743=1;
    S34675=0;
    if((motConveyorOnOff.getprestatus())){//sysj\plantConveyor.sysj line: 23, column: 21
      S34675=1;
      System.out.println("motorOn");//sysj\plantConveyor.sysj line: 29, column: 5
      motorOn_1.setPresent();//sysj\plantConveyor.sysj line: 30, column: 5
      currsigs.addElement(motorOn_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("motorOff");//sysj\plantConveyor.sysj line: 24, column: 5
      motorOff_1.setPresent();//sysj\plantConveyor.sysj line: 25, column: 5
      currsigs.addElement(motorOff_1);
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
      switch(S37553){
        case 0 : 
          S37553=0;
          break RUN;
        
        case 1 : 
          S37553=2;
          S37553=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantConveyor.sysj line: 10, column: 1
            public void run() {//sysj\plantConveyor.sysj line: 12, column: 21
              org.compsys704.Conveyor.main(null);//sysj\plantConveyor.sysj line: 13, column: 4
            }
            GUI(){//sysj\plantConveyor.sysj line: 11, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleDec_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          bottleAt1_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          bottleAtL_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          bottleAt5_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          motorOn_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          motorOff_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          empty_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          bottlePos_1.setClear();//sysj\plantConveyor.sysj line: 19, column: 2
          bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 20, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\plantConveyor.sysj line: 20, column: 2
          thread37555(tdone,ends);
          thread37556(tdone,ends);
          thread37557(tdone,ends);
          thread37558(tdone,ends);
          thread37559(tdone,ends);
          int biggest37564 = 0;
          if(ends[2]>=biggest37564){
            biggest37564=ends[2];
          }
          if(ends[3]>=biggest37564){
            biggest37564=ends[3];
          }
          if(ends[6]>=biggest37564){
            biggest37564=ends[6];
          }
          if(ends[7]>=biggest37564){
            biggest37564=ends[7];
          }
          if(ends[8]>=biggest37564){
            biggest37564=ends[8];
          }
          if(biggest37564 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleDec_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          bottleAt1_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          bottleAtL_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          bottleAt5_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          motorOn_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          motorOff_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          empty_1.setClear();//sysj\plantConveyor.sysj line: 18, column: 2
          bottlePos_1.setClear();//sysj\plantConveyor.sysj line: 19, column: 2
          thread37565(tdone,ends);
          thread37566(tdone,ends);
          thread37573(tdone,ends);
          thread37574(tdone,ends);
          thread37575(tdone,ends);
          int biggest37580 = 0;
          if(ends[2]>=biggest37580){
            biggest37580=ends[2];
          }
          if(ends[3]>=biggest37580){
            biggest37580=ends[3];
          }
          if(ends[6]>=biggest37580){
            biggest37580=ends[6];
          }
          if(ends[7]>=biggest37580){
            biggest37580=ends[7];
          }
          if(ends[8]>=biggest37580){
            biggest37580=ends[8];
          }
          if(biggest37580 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest37580 == 0){
            S37553=0;
            active[1]=0;
            ends[1]=0;
            S37553=0;
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
    bottleDec_1 = new Signal();
    bottleAt1_1 = new Signal();
    bottleAtL_1 = new Signal();
    bottleAt5_1 = new Signal();
    motorOn_1 = new Signal();
    motorOff_1 = new Signal();
    empty_1 = new Signal();
    bottlePos_1 = new Signal();
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
          motConveyorOnOff.gethook();
          enableConveyor.gethook();
          enable.gethook();
          refill.gethook();
          bottleNumber.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      enableConveyor.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      bottleNumber.setpreclear();
      bottleAtLoad.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleAtLoadE.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleLeftPos5E.setpreclear();
      bottleAtPos1M.setpreclear();
      bottleDec_1.setpreclear();
      bottleAt1_1.setpreclear();
      bottleAtL_1.setpreclear();
      bottleAt5_1.setpreclear();
      motorOn_1.setpreclear();
      motorOff_1.setpreclear();
      empty_1.setpreclear();
      bottlePos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = enableConveyor.getStatus() ? enableConveyor.setprepresent() : enableConveyor.setpreclear();
      enableConveyor.setpreval(enableConveyor.getValue());
      enableConveyor.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      dummyint = bottleNumber.getStatus() ? bottleNumber.setprepresent() : bottleNumber.setpreclear();
      bottleNumber.setpreval(bottleNumber.getValue());
      bottleNumber.setClear();
      bottleAtLoad.sethook();
      bottleAtLoad.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      bottleAtLoadE.sethook();
      bottleAtLoadE.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      bottleAtPos1M.sethook();
      bottleAtPos1M.setClear();
      bottleDec_1.setClear();
      bottleAt1_1.setClear();
      bottleAtL_1.setClear();
      bottleAt5_1.setClear();
      motorOn_1.setClear();
      motorOff_1.setClear();
      empty_1.setClear();
      bottlePos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
        enableConveyor.gethook();
        enable.gethook();
        refill.gethook();
        bottleNumber.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
