package org.compsys704;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;





public class RotaryTurntable extends JPanel { //JFrame {
	private JPanel panel;
	
	
	
	public RotaryTurntable() {
		
		panel = new CanvasRotary();
		panel.setPreferredSize(new Dimension(400, 400));
		panel.setBackground(Color.WHITE);
		JButton enable = new JButton("enable");
		enable.addActionListener(new SignalClient(Ports.PORT_Rotary_PLANT, Ports.Rotary_ENABLE_SIGNAL));
		enable.addActionListener(new SignalClient(Ports.PORT_Rotary_CONTROLLER, Ports.Rotary_Controller_ENABLE_SIGNAL));
		enable.addActionListener(new SignalClient(Ports.PORT_Rotary_PLANT, Ports.Rotary_SIGNAL_Table_Trigger));
		
		

		

		
		JPanel ss = new JPanel();
		ss.add(enable);

		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(ss,c);
		
		
		// Radio buttons
		SignalRadioClient src = new SignalRadioClient(Ports.PORT_Rotary_CONTROLLER, Ports.Rotary_SIGNAL_Mode);
		JRadioButton mmode = new JRadioButton("Manual");
		mmode.setActionCommand("1");
		mmode.addActionListener(src);
		JRadioButton amode = new JRadioButton("Auto");
		amode.setActionCommand("0");
		amode.addActionListener(src);
		amode.setSelected(true);
		ButtonGroup bg = new ButtonGroup();
		bg.add(mmode);
		bg.add(amode);
		
		JPanel pan = new JPanel(new GridLayout(1, 0));
		pan.add(amode);
		pan.add(mmode);
		c.gridx = 0;
		c.gridy = 2;
		pan.setBorder(BorderFactory.createTitledBorder("Mode selector"));

		JButton loadBottle = new JButton("loadBottle");
		loadBottle.addActionListener(new SignalClient(Ports.PORT_Rotary_CONTROLLER, Ports.Rotary_LOADBOT_SIGNAL));
		
		JButton filled = new JButton("filled");
		filled.addActionListener(new SignalClient(Ports.PORT_Rotary_CONTROLLER, Ports.Rotary_FILLED_SIGNAL));
		
		JButton lidloaded = new JButton("lidloaded");
		lidloaded.addActionListener(new SignalClient(Ports.PORT_Rotary_CONTROLLER, Ports.Rotary_LIDLOADED_SIGNAL));
		
		
		JButton capped = new JButton("capped");
		capped.addActionListener(new SignalClient(Ports.PORT_Rotary_CONTROLLER, Ports.Rotary_CAPPED_SIGNAL));
		
		JButton botRemoved = new JButton("TakeBottle");
		botRemoved.addActionListener(new SignalClient(Ports.PORT_Rotary_CONTROLLER, Ports.Rotary_REMOVED_SIGNAL));
		
		


		JPanel pan2 = new JPanel(new GridLayout(2, 3));
		pan2.add(loadBottle);
		pan2.add(filled);
		pan2.add(lidloaded);
		pan2.add(capped);
		pan2.add(botRemoved);
		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));
		src.setCheckBoxComponent(pan2);

		JPanel pan3 = new JPanel(new GridLayout(0, 2));
		pan3.add(pan);
		pan3.add(pan2);
		c.gridx = 0;
		c.gridy = 2;
		this.add(pan3,c);
		
		
		
		
//		this.setTitle("Rotary Turntable");
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setLocationRelativeTo(null);
//		this.setResizable(false);
	}
	
	
	
	public static void main(String[] args) {
		RotaryTurntable cl = new RotaryTurntable();
//		cl.pack();
		cl.setVisible(true);
		
		SignalServer<RotaryVizWorker> server = new SignalServer<RotaryVizWorker>(Ports.PORT_Rotary_VIZ, RotaryVizWorker.class);
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
