package org.compsys704;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;




public class CanvasRotary extends JPanel{
	
	BufferedImage noBottle;
	BufferedImage bottleAtPos1;
	BufferedImage bottleAtPos2;
	BufferedImage bottleFilledPos2;
	BufferedImage bottleAtPos3;
	BufferedImage bottleLidPos3;
	BufferedImage bottleAtPos4;
	BufferedImage bottleCappedPos4;
	BufferedImage bottleAtPos5;
	
	Image noBottle_resized;
	Image bottleAtPos1_resized;
	Image bottleAtPos2_resized;
	Image bottleFilledPos2_resized;
	Image bottleAtPos3_resized;
	Image bottleLidPos3_resized;
	Image bottleAtPos4_resized;
	Image bottleCappedPos4_resized;
	Image bottleAtPos5_resized;
	
	
	public CanvasRotary(){
		try {
//			noBottle = ImageIO.read(new File("res/empty.png"));
//			bottleAtPos1 = ImageIO.read(new File("res/position1.png"));
//			bottleAtPos2 = ImageIO.read(new File("res/EmptyPosition2.png"));
//			bottleFilledPos2 = ImageIO.read(new File("res/FilledPosition2.png"));
//			bottleAtPos3 = ImageIO.read(new File("res/NoLidPosition3.png"));
//			bottleLidPos3 = ImageIO.read(new File("res/LidPosition3.png"));
//			bottleAtPos4 = ImageIO.read(new File("res/ArrivePosition4.png"));
//			bottleCappedPos4 = ImageIO.read(new File("res/CappedPosition4.png"));
//			bottleAtPos5 = ImageIO.read(new File("res/ArrivePosition5.png"));
			
	        int newWidth = 300;
	        int newHeight = 300;

	        noBottle = ImageIO.read(new File("res/empty.png"));
	        bottleAtPos1 = ImageIO.read(new File("res/position1.png"));
	        bottleAtPos2 = ImageIO.read(new File("res/EmptyPosition2.png"));
	        bottleFilledPos2 = ImageIO.read(new File("res/FilledPosition2.png"));
	        bottleAtPos3 = ImageIO.read(new File("res/NoLidPosition3.png"));
	        bottleLidPos3 = ImageIO.read(new File("res/LidPosition3.png"));
	        bottleAtPos4 = ImageIO.read(new File("res/ArrivePosition4.png"));
	        bottleCappedPos4 = ImageIO.read(new File("res/CappedPosition4.png"));
	        bottleAtPos5 = ImageIO.read(new File("res/ArrivePosition5.png"));

	        noBottle_resized = noBottle.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
	        bottleAtPos1_resized = bottleAtPos1.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
	        bottleAtPos2_resized = bottleAtPos2.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
	        bottleFilledPos2_resized = bottleFilledPos2.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
	        bottleAtPos3_resized = bottleAtPos3.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
	        bottleLidPos3_resized = bottleLidPos3.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
	        bottleAtPos4_resized = bottleAtPos4.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
	        bottleCappedPos4_resized = bottleCappedPos4.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
	        bottleAtPos5_resized = bottleAtPos5.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
				
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		

//		g.drawImage(noBottle, 50,50, null);
//		
//		if(States.RotaryTable == 1) {
//			g.clearRect(0, 0, 600, 600);
//			g.drawImage(bottleAtPos1, 50,50, null);
//
//		}
//		if(States.RotaryTable == 2) {
//			g.clearRect(0, 0, 600, 600);
//			g.drawImage(bottleAtPos2, 50,50, null);
//
//		}
//		if(States.RotaryTable == 3) {
//			g.clearRect(0, 0, 600, 600);
//			g.drawImage(bottleFilledPos2, 50,50, null);
//
//		}
//		if(States.RotaryTable == 4) {
//			g.clearRect(0, 0, 600, 600);
//			g.drawImage(bottleAtPos3, 50,50, null);
//
//		}
//		if(States.RotaryTable == 5) {
//			g.clearRect(0, 0, 600, 600);
//			g.drawImage(bottleLidPos3, 50,50, null);
//
//		}
//		if(States.RotaryTable == 6) {
//			g.clearRect(0, 0, 600, 600);
//			g.drawImage(bottleAtPos4, 50,50, null);
//
//		}
//		if(States.RotaryTable == 7) {
//			g.clearRect(0, 0, 600, 600);
//			g.drawImage(bottleCappedPos4, 50,50, null);
//
//		}
//		if(States.RotaryTable == 8) {
//			g.clearRect(0, 0, 600, 600);
//			g.drawImage(bottleAtPos5, 50,50, null);
//
//		}
//		if(States.RotaryTable == 0) {
//			g.clearRect(0, 0, 600, 600);
//			g.drawImage(noBottle, 50,50, null);
//
//		}
		int x = 300;
		int y = 300;
		
		g.drawImage(noBottle_resized, 50, 50, null);

		if(States.RotaryTable == 1) {
		    g.clearRect(0, 0, x, y);
		    g.drawImage(bottleAtPos1_resized, 50, 50, null);
		}
		if(States.RotaryTable == 2) {
		    g.clearRect(0, 0, x, y);
		    g.drawImage(bottleAtPos2_resized, 50, 50, null);
		}
		if(States.RotaryTable == 3) {
		    g.clearRect(0, 0, x, y);
		    g.drawImage(bottleFilledPos2_resized, 50, 50, null);
		}
		if(States.RotaryTable == 4) {
		    g.clearRect(0, 0, x, y);
		    g.drawImage(bottleAtPos3_resized, 50, 50, null);
		}
		if(States.RotaryTable == 5) {
		    g.clearRect(0, 0, x, y);
		    g.drawImage(bottleLidPos3_resized, 50, 50, null);
		}
		if(States.RotaryTable == 6) {
		    g.clearRect(0, 0, x, y);
		    g.drawImage(bottleAtPos4_resized, 50, 50, null);
		}
		if(States.RotaryTable == 7) {
		    g.clearRect(0, 0, x, y);
		    g.drawImage(bottleCappedPos4_resized, 50, 50, null);
		}
		if(States.RotaryTable == 8) {
		    g.clearRect(0, 0, x, y);
		    g.drawImage(bottleAtPos5_resized, 50, 50, null);
		}
		if(States.RotaryTable == 0) {
		    g.clearRect(0, 0, x, y);
		    g.drawImage(noBottle_resized, 50, 50, null);
		}


	}
	
	
	
}
