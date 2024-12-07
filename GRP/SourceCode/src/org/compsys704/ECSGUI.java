package org.compsys704;

import java.util.Hashtable;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import com.systemj.netapi.SimpleClient;

public class ECSGUI extends JFrame {
	private JPanel panel;
	
	static final String IP = "127.0.0.1" ;
	SimpleClient time, officeTemp, officeHumidity, officeLumen, storageTemp, storageHumidity, storageLumen,manufactureTemp, manufactureHumidity, manufactureLumen;
	
	

	  JTextField Time = new JTextField(10);
	  JTextField ot = new JTextField();
	  JTextField oh = new JTextField();
	  JTextField ol = new JTextField();
	  JTextField st = new JTextField();
	  JTextField sh = new JTextField();
	  JTextField sl = new JTextField();
	  JTextField mt = new JTextField();
	  JTextField mh = new JTextField();
	  JTextField ml = new JTextField();
	
	
	String otValue, ohValue, olValue, stValue, shValue, slValue, mtValue, mhValue, mlValue, timeValue;
	
	
	
	public ECSGUI() {
//		this.setPreferredSize(new Dimension(200, 300));
		try {

			time = new SimpleClient(IP,ECSPorts.PORT_ECS_CONTROLLER, "ECSControllerCD","time");
			officeTemp = new SimpleClient(IP,ECSPorts.PORT_ECS_CONTROLLER, "ECSControllerCD","officeTemp");
			officeHumidity = new SimpleClient(IP,ECSPorts.PORT_ECS_CONTROLLER, "ECSControllerCD","officeHumidity");
			officeLumen = new SimpleClient(IP,ECSPorts.PORT_ECS_CONTROLLER, "ECSControllerCD","officeLumen");
			storageTemp = new SimpleClient(IP,ECSPorts.PORT_ECS_CONTROLLER, "ECSControllerCD","storageTemp");
			storageHumidity = new SimpleClient(IP,ECSPorts.PORT_ECS_CONTROLLER, "ECSControllerCD","storageHumidity");
			storageLumen = new SimpleClient(IP,ECSPorts.PORT_ECS_CONTROLLER, "ECSControllerCD","storageLumen");
			manufactureTemp = new SimpleClient(IP,ECSPorts.PORT_ECS_CONTROLLER, "ECSControllerCD","manufactureTemp");
			manufactureHumidity = new SimpleClient(IP,ECSPorts.PORT_ECS_CONTROLLER, "ECSControllerCD","manufactureHumidity");
			manufactureLumen = new SimpleClient(IP,ECSPorts.PORT_ECS_CONTROLLER, "ECSControllerCD","manufactureLumen");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		panel = new CanvasECS();
		
		panel.setPreferredSize(new Dimension(960, 720));
		panel.setBackground(Color.WHITE);
		
		
		//new panel
		JPanel bt = new JPanel();

		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(bt,c);
		
		// add time text and slider
		JLabel TimeText = new JLabel("Time");

		bt.add(TimeText);
		bt.add(Time);
		
		JLabel TempText1 = new JLabel ("Temp");
		JLabel TempText2 = new JLabel ("Temp");
		JLabel TempText3 = new JLabel ("Temp");
		JLabel HumidityText1 = new JLabel ("Humidity");
		JLabel HumidityText2 = new JLabel ("Humidity");
		JLabel HumidityText3 = new JLabel ("Humidity");
		JLabel LumenText1 = new JLabel ("Lumen");
		JLabel LumenText2 = new JLabel ("Lumen");
		JLabel LumenText3 = new JLabel ("Lumen");
		JLabel HumanText1 = new JLabel ("Human detected");
		JLabel HumanText2 = new JLabel ("Human detected");
		JLabel HumanText3 = new JLabel ("Human detected");
		JLabel SmokeText1 = new JLabel ("Smoke");
		JLabel SmokeText2 = new JLabel ("Smoke");
		JLabel SmokeText3 = new JLabel ("Smoke");
		
		JLabel BlankText1 = new JLabel ("");
		JLabel BlankText2 = new JLabel ("");
		JLabel BlankText3 = new JLabel ("");
		
        
		JCheckBox oo = new JCheckBox("OODetected");
		oo.setEnabled(true);
		oo.addItemListener(new SignalCheckBoxClient(Ports.PORT_ECS_CONTROLLER, Ports.SIGNAL_OFFICE_HIR));
		JCheckBox so = new JCheckBox("SODetected");
		so.setEnabled(true);
		so.addItemListener(new SignalCheckBoxClient(Ports.PORT_ECS_CONTROLLER, Ports.SIGNAL_STORAGE_HIR));
		JCheckBox mo = new JCheckBox("MODetected");
		mo.setEnabled(true);
		mo.addItemListener(new SignalCheckBoxClient(Ports.PORT_ECS_CONTROLLER, Ports.SIGNAL_MANUFACTURE_HIR));
		JCheckBox os = new JCheckBox("OSDetected");
		os.setEnabled(true);
		os.addItemListener(new SignalCheckBoxClient(Ports.PORT_ECS_CONTROLLER, Ports.SIGNAL_OFFICE_SMOKE));
		JCheckBox ss = new JCheckBox("SSDetected");
		ss.setEnabled(true);
		ss.addItemListener(new SignalCheckBoxClient(Ports.PORT_ECS_CONTROLLER, Ports.SIGNAL_STORAGE_SMOKE));
		JCheckBox ms = new JCheckBox("MSDetected");
		ms.setEnabled(true);
		ms.addItemListener(new SignalCheckBoxClient(Ports.PORT_ECS_CONTROLLER, Ports.SIGNAL_MANUFACTURE_SMOKE));
		
		JPanel pan2 = new JPanel(new GridLayout(5, 2));
		//pan2.setPreferredSize(new Dimension(800,300));
		pan2.add(TempText1);
		pan2.add(ot);
		//pan2.add(otLabel);
		pan2.add(HumidityText1);
		pan2.add(oh);
		//pan2.add(ohLabel);
		pan2.add(LumenText1);
		pan2.add(ol);
		//pan2.add(olLabel);
		pan2.add(HumanText1);
		pan2.add(oo);
		//pan2.add(BlankText1);
		pan2.add(SmokeText1);
		pan2.add(os);
		pan2.setBorder(BorderFactory.createTitledBorder("Office"));
		
		JPanel pan3 = new JPanel(new GridLayout(5, 2));
		pan3.add(TempText2);
		pan3.add(st);
		//pan3.add(stLabel);
		pan3.add(HumidityText2);
		pan3.add(sh);
		//pan3.add(shLabel);
		pan3.add(LumenText2);
		pan3.add(sl);
		//pan3.add(slLabel);
		pan3.add(HumanText2);
		pan3.add(so);
		//pan3.add(BlankText2);
		pan3.add(SmokeText2);
		pan3.add(ss);
		pan3.setBorder(BorderFactory.createTitledBorder("Storage"));
		
		
		JPanel pan4 = new JPanel(new GridLayout(5, 2));
		pan4.add(TempText3);
		pan4.add(mt);
		//pan4.add(mtLabel);
		pan4.add(HumidityText3);
		pan4.add(mh);
		//pan4.add(mhLabel);
		pan4.add(LumenText3);
		pan4.add(ml);
		//pan4.add(mlLabel);
		pan4.add(HumanText3);
		pan4.add(mo);
		//pan4.add(BlankText3);
		pan4.add(SmokeText3);
		pan4.add(ms);
		pan4.setBorder(BorderFactory.createTitledBorder("Manufacture"));


		JPanel pan5 = new JPanel(new GridLayout(0, 3));
		pan5.add(pan2);
		pan5.add(pan3);
		pan5.add(pan4);
		c.gridx = 0;
		c.gridy = 2;
		this.add(pan5,c);
		
		this.setTitle("[Advantech Ltd Group 13] Environment Control System");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		JButton submitSignals = new JButton("Submit");
		submitSignals.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					time.emit(Integer.parseInt(Time.getText()), 1);
					officeTemp.emit(Integer.parseInt(ot.getText()), 1);
					officeHumidity.emit(Integer.parseInt(oh.getText()), 1);
					officeLumen.emit(Integer.parseInt(ol.getText()), 1);
					storageTemp.emit(Integer.parseInt(st.getText()), 1);
					storageHumidity.emit(Integer.parseInt(sh.getText()), 1);
					storageLumen.emit(Integer.parseInt(sl.getText()), 1);
					manufactureTemp.emit(Integer.parseInt(mt.getText()), 1);
					manufactureHumidity.emit(Integer.parseInt(mh.getText()), 1);
					manufactureLumen.emit(Integer.parseInt(ml.getText()), 1);
					
					//BadgeLocation.sustain(Integer.parseInt(BadgeFields[2].getText()));
				}catch(NumberFormatException e1) {
					e1.printStackTrace();
				}catch(IOException e1) {
					e1.printStackTrace();
				}//JOptionPane.showMessageDialog(mainFrame, "successfully submit badge info");
				
			}  
        
        });
		bt.add(submitSignals);
	
		
	}

	public static void main(String[] args) {
		ECSGUI cl = new ECSGUI();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<ECSVizWorker> server = new SignalServer<ECSVizWorker>(Ports.PORT_ECS_VIZ, ECSVizWorker.class);
		new Thread(server).start();
		while(true){
			try {
				cl.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}