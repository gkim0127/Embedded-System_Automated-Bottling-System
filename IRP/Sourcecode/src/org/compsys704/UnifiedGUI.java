package org.compsys704;
import org.compsys704.*;

import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import java.awt.*;

public class UnifiedGUI extends JFrame {
	
	private FillerGUI fillerGUI1;
	private RotaryTurntable rotaryturntable1;
	private Capper capper;
	private Conveyor conveyor;
	private CapLoader caploader;

    public UnifiedGUI() {
        setTitle("[Advantech Ltd Group 13] Unified ABS GUI");
        setSize(1920, 1080);  // adjust size as needed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        // Common padding for all the components.
        constraints.insets = new Insets(5, 5, 5, 5); // top, left, bottom, right padding
        
        
        fillerGUI1 = new FillerGUI();
        rotaryturntable1 = new RotaryTurntable();
        capper = new Capper();
        conveyor = new Conveyor();
        caploader = new CapLoader();
        
//    				[2]
//    			[1]	[4]	[3]
//    				[5]
        
        
        // Add the second GUI window (at top center)
//        constraints.gridx = 1; 
//        constraints.gridy = 0;
        constraints.gridx = 0; 
        constraints.gridy = 2;
        caploader.setBorder(new TitledBorder("Caploader"));
        add(caploader, constraints);  // Replace with your actual class for [2]

        // Add the first GUI window (at middle left)
        constraints.gridx = 0; 
        constraints.gridy = 1;
        fillerGUI1.setBorder(new TitledBorder("Filler"));
        add(fillerGUI1, constraints);  // Replace with your actual class for [1]

        // Add the fourth GUI window (at center)
        constraints.gridx = 1; 
        rotaryturntable1.setBorder(new TitledBorder("Rotary Turntable"));
        add(rotaryturntable1, constraints);  // Replace with your actual class for [4]

        // Add the third GUI window (at middle right)
        constraints.gridx = 2; 
        capper.setBorder(new TitledBorder("Capper"));
        add(capper, constraints);  // Replace with your actual class for [3]

        // Add the fifth GUI window (at bottom center)
        constraints.gridx = 1; 
        constraints.gridy = 2;
        conveyor.setBorder(new TitledBorder("Conveyor"));
        add(conveyor, constraints);  // Replace with your actual class for [5]

        setVisible(true);
        

    }
    
    public void startSignalServers() {
        // Start the signal servers for the GUIs
        SignalServer<FillerVizWorker> server = new SignalServer<FillerVizWorker>(Ports.PORT_FILLER_VIZ, FillerVizWorker.class);
        SignalServer<RotaryVizWorker> server2 = new SignalServer<RotaryVizWorker>(Ports.PORT_Rotary_VIZ, RotaryVizWorker.class);
        SignalServer<CapperVizWorker> server3 = new SignalServer<CapperVizWorker>(Ports.PORT_CAPPER_VIZ, CapperVizWorker.class);
        SignalServer<ConveyorVizWorker> server4 = new SignalServer<ConveyorVizWorker>(Ports.PORT_Conveyor_VIZ, ConveyorVizWorker.class);
        SignalServer<LoaderVizWorker> server5 = new SignalServer<LoaderVizWorker>(Ports.PORT_LOADER_VIZ, LoaderVizWorker.class);
      
        new Thread(server).start();
        new Thread(server2).start();
        new Thread(server3).start();
        new Thread(server4).start();
        new Thread(server5).start();


        while(true){
            try {
                fillerGUI1.repaint();
                rotaryturntable1.repaint();
                capper.repaint();
                conveyor.repaint();
                caploader.repaint();
                
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        UnifiedGUI unifiedGUI = new UnifiedGUI();
        unifiedGUI.startSignalServers();
    }
}