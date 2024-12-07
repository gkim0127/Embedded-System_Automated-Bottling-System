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





public class FillerGUI extends JPanel {//JFrame {
	private JPanel panel;
	
	
	
	public FillerGUI() {
		
		panel = new CanvasFiller();
		panel.setPreferredSize(new Dimension(400, 400));
		panel.setBackground(Color.WHITE);
		JButton enable = new JButton("enable");
		enable.addActionListener(new SignalClient(Ports.FillerPlant_Port, Ports.FillerPlant_enable));
		enable.addActionListener(new SignalClient(Ports.FillerController_Port, Ports.FillerController_enable));
		enable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("enable was pressed!");
            }
        });
		

		
		JButton enableFiller = new JButton("enableFiller");
		enableFiller.addActionListener(new SignalClient(Ports.FillerPlant_Port, Ports.FillerPlant_enableFiller));
		
		JPanel ss = new JPanel();
		ss.add(enable);

		ss.add(enableFiller);

		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(ss,c);
		
		
		// Radio buttons

		JRadioButton mmode = new JRadioButton("Manual");
		mmode.setActionCommand("1");

		JRadioButton amode = new JRadioButton("Auto");
		amode.setActionCommand("0");

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
		JCheckBox pe = new JCheckBox("Option 1");
		pe.setEnabled(true);
		
		JCheckBox vo = new JCheckBox("Option 2");
		vo.setEnabled(false);

		JPanel pan2 = new JPanel(new GridLayout(2, 2));
		pan2.add(pe);
		pan2.add(vo);
		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));


		JPanel pan3 = new JPanel(new GridLayout(0, 2));
		pan3.add(pan);
		pan3.add(pan2);
		c.gridx = 0;
		c.gridy = 2;
		this.add(pan3,c);
		
		
//		this.setTitle("FillerGUI");
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setLocationRelativeTo(null);
//		this.setResizable(false);
	}
	
	
	
	public static void main(String[] args) {
		FillerGUI cl = new FillerGUI();
//		cl.pack();
		cl.setVisible(true);
		
		SignalServer<FillerVizWorker> server = new SignalServer<FillerVizWorker>(Ports.PORT_FILLER_VIZ, FillerVizWorker.class);
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