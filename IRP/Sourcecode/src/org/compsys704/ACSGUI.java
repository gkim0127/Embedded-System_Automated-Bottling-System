package org.compsys704;

import javax.swing.*;

import com.systemj.netapi.SimpleClient;

import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;


public class ACSGUI extends JFrame{
	
	
	static final String IP = "127.0.0.1" ;
	SimpleClient BadgeID,AccessPermission,BadgeLocation, DoorReader,DoorPermission;
	
	
	
	JFrame mainFrame;

    JTextField[] BadgeFields = new JTextField[3];
    JTextField[] SmokeFields = new JTextField[2];
    JTextField[] DoorFields = new JTextField[3];
    JTextField[] liquidFields = new JTextField[4];

    static JTextField[] PanelFields = new JTextField[3];
    
    JTextField bottleQuantityField;
    JTextArea displayArea;
    JTextArea displayArea1,displayArea2;
    JButton logoutButton, submitButton ,disarmButton,submitBadgeButton,submitDoorButton,humanCrossButton,humanPrecenseButton,fireDetectedButton;
    JCheckBox pe, vo;
    
    
    JCheckBox[] ControlFields = new JCheckBox[3];
    
    String[] BadgeString = {"Badge ID", "Permission ", "Badge Location"};  
    String[] PanelString = {"Siren", "Manufacture","Door"};  
    String[] SmokeString = {"Alarm Health", "Alarm Status "};  
    String[] DoorString = {"Badge ID", "Door Reader", "Permission "};  
    String[] ControlString = {"Siren", "Door1", "Manufacture "};  
	public ACSGUI() {
		try {

			
			AccessPermission = new SimpleClient(IP,PortsACS.PORT_ACS_CONTROLLER, "ACSControllerCD","badgeAccessPermission");
			BadgeLocation = new SimpleClient(IP,PortsACS.PORT_ACS_CONTROLLER, "ACSControllerCD","badgeLocation");
			DoorReader = new SimpleClient(IP,PortsACS.PORT_ACS_CONTROLLER, "ACSControllerCD","doorReader");
			DoorPermission = new SimpleClient(IP,PortsACS.PORT_ACS_CONTROLLER, "ACSControllerCD","cardAccessPermission");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		


        // Setup Main Window
        mainFrame = new JFrame("[Advantech Ltd Group 13] Safety and Access Control System");
        mainFrame.setSize(550, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());

        
        // Submit Information Section
        JPanel smokePanel = new JPanel(new GridBagLayout());
        smokePanel.setBorder(BorderFactory.createTitledBorder("Smoke Alarm"));
        GridBagConstraints sc2 = new GridBagConstraints();
        sc2.insets = new Insets(5, 5, 5, 5);
        sc2.gridy = 4;
        sc2.gridx = 0;
        humanPrecenseButton = new JButton("humanPrecense");
        humanPrecenseButton.addActionListener(new SignalClient(PortsACS.PORT_ACS_CONTROLLER, PortsACS.ACS_HUMAN_Precense));
        smokePanel.add(humanPrecenseButton,sc2);
        sc2.gridy = 4;
        sc2.gridx = 1;
        fireDetectedButton = new JButton("fireDetected");
        fireDetectedButton.addActionListener(new SignalClient(PortsACS.PORT_ACS_CONTROLLER, PortsACS.ACS_Fire_Detected));
        smokePanel.add(fireDetectedButton,sc2);
        
        
 
        // Submit Information Section
        JPanel badgePanel = new JPanel(new GridBagLayout());
        badgePanel.setBorder(BorderFactory.createTitledBorder("Badge Tracer"));
        GridBagConstraints sc = new GridBagConstraints();
        sc.insets = new Insets(5, 5, 5, 5);
        
        for (int i = 0; i < 3; i++) {
        	sc.gridy = i;
        	sc.gridx = 0;
        	sc.anchor = GridBagConstraints.EAST;
        	badgePanel.add(new JLabel(BadgeString[i]), sc);
        	sc.gridx = 1;
        	BadgeFields[i] = new JTextField(10);
        	BadgeFields[i].setEditable(true);
        	badgePanel.add(BadgeFields[i], sc);
            
        }
        sc.gridy = 4;
        sc.gridx = 0;
        submitBadgeButton = new JButton("Submit");
        submitBadgeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					//BadgeID.sustain(Integer.parseInt(BadgeFields[0].getText()));
					//AccessPermission.emit(BadgeFields[1].getText(), 20);
					BadgeLocation.emit(Integer.parseInt(BadgeFields[2].getText()), 1);
					//AccessPermission.sustain(Integer.parseInt(BadgeFields[1].getText()));
					AccessPermission.emit(Integer.parseInt(BadgeFields[1].getText()), 1);
					//BadgeLocation.sustain(Integer.parseInt(BadgeFields[2].getText()));
				}catch(NumberFormatException e1) {
					e1.printStackTrace();
				}catch(IOException e1) {
					e1.printStackTrace();
				}JOptionPane.showMessageDialog(mainFrame, "successfully submit badge info");
				
			}
        
        });
        		
        badgePanel.add(submitBadgeButton,sc);
        
        JPanel combinedLeftPanel = new JPanel(new BorderLayout());
        //combinedLeftPanel.add(leftPanel, BorderLayout.NORTH);
        combinedLeftPanel.add(badgePanel, BorderLayout.SOUTH);
        combinedLeftPanel.add(smokePanel, BorderLayout.NORTH);

        	

        	
        
     		disarmButton = new JButton("Disarm");
     		disarmButton.addActionListener(new SignalClient(PortsACS.PORT_ACS_CONTROLLER, PortsACS.ACS_DISARM));
     		
     		JPanel pan2 = new JPanel(new GridLayout(4, 2));
     		GridBagConstraints sc3 = new GridBagConstraints();
     		for (int i = 0; i < 3; i++) {
            	sc3.gridy = i;
            	sc3.gridx = 0;
            	sc3.anchor = GridBagConstraints.EAST;
            	pan2.add(new JLabel(PanelString[i]), sc3);
            	sc3.gridx = 1;
            	PanelFields[i] = new JTextField(10);
            	PanelFields[i].setEditable(false);
            	pan2.add(PanelFields[i], sc3);
                
            }
     		sc3.gridy = 4;
        	sc3.gridx = 0;
     		pan2.add(disarmButton);
     		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));


        
        // Door status Information Section
        JPanel DoorPanel = new JPanel(new GridBagLayout());
        DoorPanel.setBorder(BorderFactory.createTitledBorder("Door Status"));
        GridBagConstraints sc1 = new GridBagConstraints();
        sc1.insets = new Insets(5, 5, 5, 5);
        for (int i = 0; i < 3; i++) {
        	sc1.gridy = i;
        	sc1.gridx = 0;
        	sc1.anchor = GridBagConstraints.EAST;
        	DoorPanel.add(new JLabel(DoorString[i]), sc1);
        	sc1.gridx = 1;
        	DoorFields[i] = new JTextField(10);
        	DoorFields[i].setEditable(true);
        	DoorPanel.add(DoorFields[i], sc1);
            
        }
        
        sc1.gridy = 4;
        sc1.gridx = 0;
        submitDoorButton = new JButton("Submit");
        submitDoorButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					//BadgeID.sustain(Integer.parseInt(DoorFields[0].getText()));
					DoorReader.emit(Integer.parseInt(DoorFields[1].getText()), 1);
					//DoorReader.sustain(Integer.parseInt(DoorFields[1].getText()));
					DoorPermission.emit(Integer.parseInt(DoorFields[2].getText()), 1);
					//DoorPermission.sustain(Integer.parseInt(DoorFields[2].getText()));
				}catch(NumberFormatException e1) {
					e1.printStackTrace();
				}catch(IOException e1) {
					e1.printStackTrace();
				}JOptionPane.showMessageDialog(mainFrame, "successfully submit badge info");
				
			}
        });
        DoorPanel.add(submitDoorButton,sc1);
        sc1.gridy = 4;
        sc1.gridx = 1;
        humanCrossButton = new JButton("HumanAcrossed");
        humanCrossButton.addActionListener(new SignalClient(PortsACS.PORT_ACS_CONTROLLER, PortsACS.ACS_HUMAN_ACROSSED));
        DoorPanel.add(humanCrossButton,sc1);
        
        

        // Combining the bottle and submit sections
        JPanel combinedRightPanel = new JPanel(new BorderLayout());
        combinedRightPanel.add(pan2, BorderLayout.SOUTH);
        combinedRightPanel.add(DoorPanel, BorderLayout.NORTH);
        

        // Main content panel with some padding
        JPanel contentPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPanel.add(combinedLeftPanel);
        contentPanel.add(combinedRightPanel);

        mainFrame.add(contentPanel, BorderLayout.CENTER);


        mainFrame.setVisible(true);
		
		
	}
	
	

    private boolean validateLiquidInputs() {
        float total = 0;
        for (JTextField field : liquidFields) {
            String text = field.getText();
            try {
                float value = Float.parseFloat(text);
                if (value < 0) {
                    JOptionPane.showMessageDialog(mainFrame, "Inputs are invalid");
                    return false;
                }
                total += value;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(mainFrame, "Inputs are invalid");
                return false;
            }
        }

        if (total > 100) {
            JOptionPane.showMessageDialog(mainFrame, "Liquid distribution should add up to 100");
            return false;
        }
        return true;
    }

    private boolean validateBottleInput() {
        String text = bottleQuantityField.getText();
        try {
            float value = Float.parseFloat(text);
            if (value < 0 || value > 10000) {
                JOptionPane.showMessageDialog(mainFrame, "Bottle quantity must not exceed 10000");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(mainFrame, "Inputs are invalid");
            return false;
        }
        return true;
    }

    private void displaySelectedInfo() {
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            info.append("Liquid ").append(i + 1).append(": ").append(liquidFields[i].getText()).append("\n");
        }
        info.append("Bottle Quantity: ").append(bottleQuantityField.getText());
        displayArea.setText(info.toString());
    }

    public static void main(String[] args) {
    	ACSGUI cl = new ACSGUI();

		
		SignalServer<ACSVizWorker> server = new SignalServer<ACSVizWorker>(PortsACS.PORT_ACS_VIZ, ACSVizWorker.class);
		new Thread(server).start();

        while(true){
        	try {
				Thread.sleep(1);
				if(States.SIREN_ON == true) {
					//System.out.println("siren is on ");
					PanelFields[0].selectAll();
					
					PanelFields[0].replaceSelection("ON");
					
	
        	}else {
        		//System.out.println("siren is off ");
        		PanelFields[0].selectAll();
        		PanelFields[0].replaceSelection("OFF");

        	}
				if(States.EnableManufactureE == true) {
					//System.out.println("Manufacture is on ");
					PanelFields[1].setText("On");
				}else {
					//System.out.println("Manufacture is off ");
					PanelFields[1].setText("Off");
				}
				
				if(States.DOOR_LOCK == true) {
					PanelFields[2].setText("Lock");
				}else {
					PanelFields[2].setText("Unlock");
				}
				
				
        	}catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
	

}
