package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class CanvasCapper extends JPanel {
	BufferedImage bottle;
	BufferedImage clampOpen;
	BufferedImage clampClose;
	BufferedImage gripper;
	BufferedImage capGripped;
	BufferedImage gripperTwisted;


	public CanvasCapper(){
		try {
			bottle = ImageIO.read(new File("res/bottle.png"));
			clampOpen = ImageIO.read(new File("res/bottle_unclamped.png"));
			clampClose = ImageIO.read(new File("res/bottle_clamped.png"));
			gripper = ImageIO.read(new File("res/gripper.png"));
			capGripped = ImageIO.read(new File("res/cap_gripped.png"));
			gripperTwisted = ImageIO.read(new File("res/gripper_twisted.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(bottle, 3, 50, null);

		if(States.BOTTLE_CLAMPED) {
			g.drawImage(clampClose, 4, 50, null);
		} else {
			g.drawImage(clampOpen, 4, 50, null);
		}
		
		
		if (States.GRIPPER_LOWERED) {
			g.drawImage(gripper, 3, 50, null);
			if (States.CAP_GRIPPED) {
				g.drawImage(capGripped, 3, 50, null);
			} else {
				//g.drawImage(gripper, 3, 40, null);
			} 
			if (States.GRIPPER_TURN_EXTENDED) {
				g.drawImage(gripperTwisted, 3, 50, null);
			} else {
				//g.drawImage(gripper, 3, 5, null);
			}
		} else if (States.GRIPPER_LIFTED) {
			if (States.GRIPPER_TURN_EXTENDED) {
				g.drawImage(gripperTwisted, 3, 5, null);
			} else {
				g.drawImage(gripper, 3, 5, null);
			}
		}
		

	}
}
