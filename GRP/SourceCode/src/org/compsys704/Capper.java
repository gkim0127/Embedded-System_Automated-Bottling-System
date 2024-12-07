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

public class Capper extends JPanel { //JFrame {
	private JPanel panel;

	public Capper() {
//		this.setPreferredSize(new Dimension(200, 300));
		panel = new CanvasCapper();
		panel.setPreferredSize(new Dimension(400, 400));
		panel.setBackground(Color.WHITE);
		JButton enable = new JButton("enable");
		enable.addActionListener(new SignalClient(Ports.PORT_CAPPER_PLANT, Ports.ENABLE_SIGNAL_CAPPER));
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
		SignalRadioClient src = new SignalRadioClient(Ports.PORT_CAPPER_CONTROLLER, Ports .SIGNAL_CAPPER_Mode);
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
		pan.setPreferredSize(new Dimension(200, 50));  
		pan.add(amode);
		pan.add(mmode);
		c.gridx = 0;
		c.gridy = 2;
		pan.setBorder(BorderFactory.createTitledBorder("Mode selector"));

		// Checkboxes
		JCheckBox lg = new JCheckBox("LowerGripper");
		lg.setEnabled(false);
		lg.addItemListener(new SignalCheckBoxClient(Ports.PORT_CAPPER_CONTROLLER, Ports.SIGNAL_GRIPPER_EXTEND));
		JCheckBox cb = new JCheckBox("Clamp Bottle");
		cb.setEnabled(false);
		cb.addItemListener(new SignalCheckBoxClient(Ports.PORT_CAPPER_CONTROLLER, Ports.SIGNAL_CLAMP));
		JCheckBox gc = new JCheckBox("Grip Cap");
		gc.setEnabled(false);
		gc.addItemListener(new SignalCheckBoxClient(Ports.PORT_CAPPER_CONTROLLER, Ports.SIGNAL_GRIPPER_GRIP));
		JCheckBox tg = new JCheckBox("Twist Gripper");
		tg.setEnabled(false);
		tg.addItemListener(new SignalCheckBoxClient(Ports.PORT_CAPPER_CONTROLLER, Ports.SIGNAL_GRIPPER_FINAL));
		JCheckBox ug = new JCheckBox("Untwist Gripper");
		ug.setEnabled(false);
		ug.addItemListener(new SignalCheckBoxClient(Ports.PORT_CAPPER_CONTROLLER, Ports.SIGNAL_GRIPPER_HOME));

		JPanel pan2 = new JPanel(new GridLayout(2, 2));
		pan2.setPreferredSize(new Dimension(200, 100));
		pan2.add(lg);
		pan2.add(cb);
		pan2.add(gc);
		pan2.add(tg);
		pan2.add(ug);
		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));
		src.setCheckBoxComponent(pan2);

		JPanel pan3 = new JPanel(new GridLayout(0, 2));
		pan3.add(pan);
		pan3.add(pan2);
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 1.0;  
		c.weighty = 1.0;  
		c.fill = GridBagConstraints.BOTH; 
		  
		this.add(pan3,c);
		
//		this.setTitle("Capper");
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setLocationRelativeTo(null);
//		this.setResizable(false);
	}

	public static void main(String[] args) {
		Capper cl = new Capper();
//		cl.pack();
		cl.setVisible(true);
		
		SignalServer<CapperVizWorker> server = new SignalServer<CapperVizWorker>(Ports.PORT_CAPPER_VIZ, CapperVizWorker.class);
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