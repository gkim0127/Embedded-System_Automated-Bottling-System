package org.compsys704;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FillerGUI2 extends JPanel {
    private JPanel panel;

    public FillerGUI2() {
        initializeComponents();
    }

    private void initializeComponents() {
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
        this.add(panel, c);
        c.gridx = 0;
        c.gridy = 1;
        this.add(ss, c);

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
        pan.setBorder(BorderFactory.createTitledBorder("Mode selector"));

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
        this.add(pan3, c);
    }

    // Optional: If you want a standalone test method for FillerGUI
    public static void main(String[] args) {
        JFrame frame = new JFrame("FillerGUI Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new FillerGUI());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        SignalServer<FillerVizWorker> server = new SignalServer<FillerVizWorker>(Ports.PORT_FILLER_VIZ, FillerVizWorker.class);
        new Thread(server).start();
        while (true) {
            try {
                frame.repaint();
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}