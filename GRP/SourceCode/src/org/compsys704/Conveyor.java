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

public class Conveyor extends JPanel { //JFrame {
	private JPanel panel;
	
	public Conveyor() {
//		this.setPreferredSize(new Dimension(200, 300));
		panel = new ConveyorCanvas();
		panel.setPreferredSize(new Dimension(600, 100));
		panel.setBackground(Color.WHITE);
		JButton enable = new JButton("enable");
		enable.addActionListener(new SignalClient(Ports.PORT_Conveyor_PLANT, Ports.Conveyor_ENABLE_enableConveyor));
		enable.addActionListener(new SignalClient(Ports.PORT_Conveyor_PLANT, Ports.Conveyor_ENABLE_SIGNAL));
		JButton refill = new JButton("refill");
		refill.addActionListener(new SignalClient(Ports.PORT_Conveyor_PLANT, Ports.Conveyor_REFILL_SIGNAL));
		
		JButton motConveyorOnOff  = new JButton("motConveyorOnOff");
		motConveyorOnOff.addActionListener(new SignalClient(Ports.PORT_Conveyor_PLANT, Ports.Conveyor_motConveyorOnOff));
		
		JButton DONE = new JButton("Done");
		DONE.addActionListener(new SignalClient(Ports.PORT_Conveyor_PLANT, Ports.Conveyor_DONE));
		
		JPanel ss = new JPanel();
		ss.add(enable);
		ss.add(refill);
		ss.add(motConveyorOnOff);
		ss.add(DONE);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(ss,c);
		
		// Radio buttons
		SignalRadioClient src = new SignalRadioClient(Ports.PORT_Conveyor_CONTROLLER, Ports.Conveyor_SIGNAL_Mode);
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

		// Checkboxes
		JCheckBox pe = new JCheckBox("Motor On");
		pe.setEnabled(false);
		pe.addItemListener(new SignalCheckBoxClient(Ports.PORT_Conveyor_CONTROLLER, Ports.SIGNAL_MOTOR_ON));

		JPanel pan2 = new JPanel(new GridLayout(2, 2));
		pan2.add(pe);
		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));
		src.setCheckBoxComponent(pan2);

		JPanel pan3 = new JPanel(new GridLayout(0, 2));
		pan3.add(pan);
		pan3.add(pan2);
		c.gridx = 0;
		c.gridy = 2;
		this.add(pan3,c);
		
//		this.setTitle("Conveyor");
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setLocationRelativeTo(null);
//		this.setResizable(false);
	}

	public static void main(String[] args) {
		Conveyor cl = new Conveyor();
//		cl.pack();
		cl.setVisible(true);
		
		SignalServer<ConveyorVizWorker> server = new SignalServer<ConveyorVizWorker>(Ports.PORT_Conveyor_VIZ, ConveyorVizWorker.class);
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
