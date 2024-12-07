package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ConveyorCanvas extends JPanel {
//	BufferedImage conveyor;
	BufferedImage conveyor1;
	BufferedImage conveyor2;
	BufferedImage conveyor3;
	BufferedImage conveyor4;
	
	Image conveyor1_resized;
	Image conveyor2_resized;
	Image conveyor3_resized;
	Image conveyor4_resized;
	
	public ConveyorCanvas(){
		try {
//			conveyor = ImageIO.read(new File("res/conveyor.png"));
			
			int newWidth = 500;
			int newHeight = 100;

			conveyor1 = ImageIO.read(new File("res/704_conveyor_1.png"));
			conveyor2 = ImageIO.read(new File("res/704_conveyor_2.png"));
			conveyor3 = ImageIO.read(new File("res/704_conveyor_3.png"));
			conveyor4 = ImageIO.read(new File("res/704_conveyor_4.png"));
			
			conveyor1_resized = conveyor1.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			conveyor2_resized = conveyor2.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			conveyor3_resized = conveyor3.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			conveyor4_resized = conveyor4.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int x = 500;
		int y = 100;
		
		int x1 = 50;
		int y1 = 15;
		
		g.drawImage(conveyor1_resized, x1, y1, null);
		
		if(States.BOTTLE_AT_LOADER) {			
			g.clearRect(0, 0, x, y);
			g.drawImage(conveyor1_resized, x1, y1, null);
		}
		else if (States.BOTTLE_AT_POS_1) {
			g.clearRect(0, 0, x, y);
			g.drawImage(conveyor2_resized, x1, y1, null);
		}
		else if (States.BOTTLE_AT_POS_5) {
			g.clearRect(0, 0, x, y);
			g.drawImage(conveyor3_resized, x1, y1, null);
			
		} else if (States.BOTTLE_AT_DONE) { // done
			g.clearRect(0, 0, x, y);
			g.drawImage(conveyor4_resized, x1, y1, null);
		}
	}
}
