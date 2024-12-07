package org.compsys704;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import com.systemj.netapi.SimpleClient;


/*
 * Product Order System (POS) GUI
 * 
 * Features a Login windows and a Order Window
 * Basic authentication, selection of liquids 1-4 and bottle quantity
 * Communication signals not set up yet
 * 
 * Version 2.0 - Tested
 * 
 * */




public class GuiApp {
	
	static final String IP = "127.0.0.1";
	SimpleClient BottleSend, LiquidAmount1, LiquidAmount2, LiquidAmount3, LiquidAmount4, systemEnable;


    // Login Window Components
    JFrame loginFrame;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton resetPasswordButton, loginButton;

    // Main Window Components
    JFrame mainFrame;
    JTextField[] liquidFields = new JTextField[4];
    JTextField bottleQuantityField;
    JTextArea displayArea;
    JButton logoutButton, submitButton;

    public GuiApp() {
    	

        try {
        	BottleSend = new SimpleClient(IP, Ports.MainController_Port, "MainControllerCD", "BottleQuantity");
        	LiquidAmount1 = new SimpleClient(IP, Ports.MainController_Port, "MainControllerCD", "LiquidAmount1");
        	LiquidAmount2 = new SimpleClient(IP, Ports.MainController_Port, "MainControllerCD", "LiquidAmount2");
        	LiquidAmount3 = new SimpleClient(IP, Ports.MainController_Port, "MainControllerCD", "LiquidAmount3");
        	LiquidAmount4 = new SimpleClient(IP, Ports.MainController_Port, "MainControllerCD", "LiquidAmount4");
        	systemEnable = new SimpleClient(IP, Ports.MainController_Port, "MainControllerCD", "systemEnable");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Setup Login Window
        loginFrame = new JFrame("[Advantech Ltd Group 13] Product Order System - Login");
        loginFrame.setSize(550, 500);
        loginFrame.setLayout(new GridBagLayout());
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagConstraints c = new GridBagConstraints();

        JLabel welcomeLabel = new JLabel("Welcome to Group 13's Product Order System");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.insets = new Insets(30, 10, 30, 10);
        c.anchor = GridBagConstraints.CENTER;
        loginFrame.add(welcomeLabel, c);

        c.gridwidth = 1;
        c.gridy = 1;
        c.anchor = GridBagConstraints.WEST;
        loginFrame.add(new JLabel("Username:"), c);
        usernameField = new JTextField(20);
        c.gridx = 1;
        c.gridwidth = 2;
        loginFrame.add(usernameField, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        loginFrame.add(new JLabel("Password:"), c);
        passwordField = new JPasswordField(20);
        c.gridx = 1;
        c.gridwidth = 2;
        loginFrame.add(passwordField, c);

        resetPasswordButton = new JButton("Reset Password");
        
        resetPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	JOptionPane.showMessageDialog(loginFrame, "Please contact admin for new credentials");
            }
        });
        loginButton = new JButton("Login");
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        c.insets = new Insets(20, 5, 20, 5);
        c.fill = GridBagConstraints.HORIZONTAL;
        loginFrame.add(resetPasswordButton, c);
        c.gridx = 2;
        loginFrame.add(loginButton, c);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                authenticateAndOpenMainWindow();
            }
        });

        loginFrame.setVisible(true);
    }

    private void authenticateAndOpenMainWindow() {
        if ("admin".equals(usernameField.getText()) && "password".equals(new String(passwordField.getPassword()))) {
            loginFrame.dispose();

            // Setup Main Window
            mainFrame = new JFrame("[Advantech Ltd Group 13] Product Order System - Order");
            mainFrame.setSize(550, 500);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setLayout(new BorderLayout());

            // Left Section (Liquid Specification)
            JPanel leftPanel = new JPanel(new GridBagLayout());
            leftPanel.setBorder(BorderFactory.createTitledBorder("Liquid Specification"));
            GridBagConstraints lc = new GridBagConstraints();
            lc.insets = new Insets(5, 5, 5, 5);
            for (int i = 0; i < 4; i++) {
                lc.gridy = i;
                lc.gridx = 0;
                lc.anchor = GridBagConstraints.EAST;
                leftPanel.add(new JLabel("Liquid " + (i + 1) + ":"), lc);
                lc.gridx = 1;
                liquidFields[i] = new JTextField(15);
                leftPanel.add(liquidFields[i], lc);
            }
            lc.gridy = 4;
            lc.gridx = 0;
            lc.gridwidth = 2;
            lc.fill = GridBagConstraints.HORIZONTAL;
            lc.insets = new Insets(20, 5, 5, 5);
            JButton setLiquidButton = new JButton("Set Liquids");
            setLiquidButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (validateLiquidInputs()) {
                        displaySelectedInfo();
                    }
                }
            });
            leftPanel.add(setLiquidButton, lc);
            lc.gridy = 5;
            JButton resetLiquidButton = new JButton("Reset Liquids");
            resetLiquidButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (JTextField field : liquidFields) {
                        field.setText("");
                    }
                    displaySelectedInfo();
                }
            });
            leftPanel.add(resetLiquidButton, lc);

            // Bottle Selection Section
            JPanel bottlePanel = new JPanel(new GridBagLayout());
            bottlePanel.setBorder(BorderFactory.createTitledBorder("Bottle Selection"));
            GridBagConstraints brc = new GridBagConstraints();
            brc.insets = new Insets(5, 5, 5, 5);
            brc.anchor = GridBagConstraints.EAST;
            brc.gridx = 0;
            brc.gridy = 0;
            bottlePanel.add(new JLabel("Bottle Quantity:"), brc);
            brc.gridy = 1;
            brc.anchor = GridBagConstraints.CENTER;
            bottleQuantityField = new JTextField(15);
            bottlePanel.add(bottleQuantityField, brc);

            brc.gridy = 2;
            brc.gridx = 0;
            brc.gridwidth = 2;
            brc.fill = GridBagConstraints.HORIZONTAL;
            brc.insets = new Insets(20, 5, 5, 5);
            JButton setBottleButton = new JButton("Set Bottles");
            setBottleButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (validateBottleInput()) {
                        displaySelectedInfo();
                    }
                }
            });
            bottlePanel.add(setBottleButton, brc);
            brc.gridy = 3;
            JButton resetBottleButton = new JButton("Reset Bottles");
            resetBottleButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    bottleQuantityField.setText("");
                    displaySelectedInfo();
                }
            });
            bottlePanel.add(resetBottleButton, brc);

            // Submit Information Section
            JPanel submitPanel = new JPanel(new GridBagLayout());
            submitPanel.setBorder(BorderFactory.createTitledBorder("Submit Information"));
            GridBagConstraints sc = new GridBagConstraints();
            sc.insets = new Insets(5, 5, 5, 5);
            sc.gridx = 0;
            sc.gridy = 0;
            displayArea = new JTextArea(5, 20);
            displayArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(displayArea);
            submitPanel.add(scrollPane, sc);
            sc.gridy = 1;
//            sc.anchor = GridBagConstraints.CENTER;
            submitButton = new JButton("Submit");
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	
                	// transmit verified input data
                	try {
                		systemEnable.emit("val", 1000);
                		BottleSend.sustain(Integer.parseInt(bottleQuantityField.getText()));
						LiquidAmount1.sustain(Integer.parseInt(liquidFields[0].getText()));
						LiquidAmount2.sustain(Integer.parseInt(liquidFields[1].getText()));
						LiquidAmount3.sustain(Integer.parseInt(liquidFields[2].getText()));
						LiquidAmount4.sustain(Integer.parseInt(liquidFields[3].getText()));
					} catch (NumberFormatException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
                	JOptionPane.showMessageDialog(mainFrame, "Successfully submitted");
                }
            });

            
            
            submitPanel.add(submitButton, sc);

            // Combining the bottle and submit sections
            JPanel combinedRightPanel = new JPanel(new BorderLayout());
            combinedRightPanel.add(bottlePanel, BorderLayout.NORTH);
            combinedRightPanel.add(submitPanel, BorderLayout.CENTER);

            // Main content panel with some padding
            JPanel contentPanel = new JPanel(new GridLayout(1, 2, 10, 10));
            contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            contentPanel.add(leftPanel);
            contentPanel.add(combinedRightPanel);

            mainFrame.add(contentPanel, BorderLayout.CENTER);

            logoutButton = new JButton("Logout");
            logoutButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mainFrame.dispose();
                    new GuiApp();
                }
            });
            JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            bottomPanel.add(logoutButton);

            mainFrame.add(bottomPanel, BorderLayout.SOUTH);

            mainFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(loginFrame, "Invalid Credentials!");
        }
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

        if ((total > 100) || (total < 100)) {
            JOptionPane.showMessageDialog(mainFrame, "Liquid distribution should add up to 100");
            return false;
        } 
        
        // check liquid information to be sent
        for (int i = 0; i < 4; i++) {
        	System.out.println("Validated liquid: "+liquidFields[i].getText());
        	
        }
        submitButton.addActionListener(e -> {
        	for (int i = 0; i < 4; i++) {
	            String data = liquidFields[i].getText();
	            if(data != null && !data.trim().isEmpty()) {
	                SignalClient client = new SignalClient(Ports.MainController_Port, Ports.MainController_Liquid1);
	                client.actionPerformed(e);
	            }
        	}
        });
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
        
        // check bottle information to be sent
        System.out.println("Validated bottle: "+ text);
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
        new GuiApp();
    }
}






