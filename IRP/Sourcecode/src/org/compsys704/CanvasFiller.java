package org.compsys704;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Image;




public class CanvasFiller extends JPanel{
	
	BufferedImage Filler_4_Full;
	BufferedImage Filler_4_In;
	BufferedImage Filler_4_Out;
	BufferedImage Filler_4_Done;
	
	
	BufferedImage Filler_3_Full;
	BufferedImage Filler_3_In;
	BufferedImage Filler_3_Out;
	BufferedImage Filler_3_Done;
	
	BufferedImage Filler_2_Full;
	BufferedImage Filler_2_In;
	BufferedImage Filler_2_Out;
	BufferedImage Filler_2_Done;
	
	BufferedImage Filler_1_Full;
	BufferedImage Filler_1_In;
	BufferedImage Filler_1_Out;
	BufferedImage Filler_1_Done;
	
	BufferedImage Filler_0_default;
	
	Image Filler_4_Full_resized;
	Image Filler_4_In_resized;
	Image Filler_4_Out_resized;
	Image Filler_4_Done_resized;
	
	Image Filler_3_Full_resized;
	Image Filler_3_In_resized;
	Image Filler_3_Out_resized;
	Image Filler_3_Done_resized;
	
	Image Filler_2_Full_resized;
	Image Filler_2_In_resized;
	Image Filler_2_Out_resized;
	Image Filler_2_Done_resized;
	
	Image Filler_1_Full_resized;
	Image Filler_1_In_resized;
	Image Filler_1_Out_resized;
	Image Filler_1_Done_resized;
	
	Image Filler_0_default_resized;
	
	public CanvasFiller(){
		try {
			
			int newWidth = 300;
			int newHeight = 300;

			Filler_4_Full = ImageIO.read(new File("res/Filler_4_Full.png"));
			Filler_4_In = ImageIO.read(new File("res/Filler_4_1.png"));
			Filler_4_Out = ImageIO.read(new File("res/Filler_4_2.png"));
			Filler_4_Done = ImageIO.read(new File("res/Filler_4_Done.png"));
			
			Filler_3_Full = ImageIO.read(new File("res/Filler_3_Full.png"));
			Filler_3_In = ImageIO.read(new File("res/Filler_3_1.png"));
			Filler_3_Out = ImageIO.read(new File("res/Filler_3_2.png"));
			Filler_3_Done = ImageIO.read(new File("res/Filler_3_Done.png"));
			
			Filler_2_Full = ImageIO.read(new File("res/Filler_2_Full.png"));
			Filler_2_In = ImageIO.read(new File("res/Filler_2_1.png"));
			Filler_2_Out = ImageIO.read(new File("res/Filler_2_2.png"));
			Filler_2_Done = ImageIO.read(new File("res/Filler_2_Done.png"));
			
			Filler_1_Full = ImageIO.read(new File("res/Filler_1_Full.png"));
			Filler_1_In = ImageIO.read(new File("res/Filler_1_1.png"));
			Filler_1_Out = ImageIO.read(new File("res/Filler_1_2.png"));
			Filler_1_Done = ImageIO.read(new File("res/Filler_1_Done.png"));
			
			Filler_0_default = ImageIO.read(new File("res/Filler_0_default_empty.png"));
			
			Filler_4_Full_resized = Filler_4_Full.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			Filler_4_In_resized = Filler_4_In.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			Filler_4_Out_resized = Filler_4_Out.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			Filler_4_Done_resized = Filler_4_Done.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			
			Filler_3_Full_resized = Filler_3_Full.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			Filler_3_In_resized = Filler_3_In.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			Filler_3_Out_resized = Filler_3_Out.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			Filler_3_Done_resized = Filler_3_Done.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			
			Filler_2_Full_resized = Filler_2_Full.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			Filler_2_In_resized = Filler_2_In.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			Filler_2_Out_resized = Filler_2_Out.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			Filler_2_Done_resized = Filler_2_Done.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			
			Filler_1_Full_resized = Filler_1_Full.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			Filler_1_In_resized = Filler_1_In.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			Filler_1_Out_resized = Filler_1_Out.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			Filler_1_Done_resized = Filler_1_Done.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			
			Filler_0_default_resized = Filler_0_default.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
			
			
				
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		

		g.drawImage(Filler_0_default_resized, 50,50, null);
		
		if(States.FillerState == 1) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_1_Full_resized, 50,50, null);
			
		if((States.FillerState == 1) && (States.Filler_In==true)) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_1_In_resized, 50,50, null);
		}
		
		if((States.FillerState == 1) && (States.Filler_Out==true)) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_1_Out_resized, 50,50, null);
		}
			
//		if (States.FillerState == 6) {
//			g.clearRect(0, 0, 300, 300);
//			g.drawImage(Filler_1_In_resized, 50,50, null);
//		}
//		
//		if (States.FillerState == 7) {
//			g.clearRect(0, 0, 300, 300);
//			g.drawImage(Filler_1_Out_resized, 50,50, null);
//		}

		}
		if(States.FillerState == 2) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_2_Full_resized, 50,50, null);

		}
		
		if((States.FillerState == 2) && (States.Filler_In==true)) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_2_In_resized, 50,50, null);
		}
		
		if((States.FillerState == 2) && (States.Filler_Out==true)) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_2_Out_resized, 50,50, null);
		}
		
		
		
		if(States.FillerState == 3) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_3_Full_resized, 50,50, null);

		}
		
		if((States.FillerState == 3) && (States.Filler_In==true)) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_3_In_resized, 50,50, null);
		}
		
		if((States.FillerState == 3) && (States.Filler_Out==true)) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_3_Out_resized, 50,50, null);
		}
		
		
		
		if(States.FillerState == 4) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_4_Full_resized, 50,50, null);

		}
		
		if((States.FillerState == 4) && (States.Filler_In==true)) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_4_In_resized, 50,50, null);
		}
		
		if((States.FillerState == 4) && (States.Filler_Out==true)) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_4_Out_resized, 50,50, null);
		}
		
		
		if(States.FillerState == 5) {
			g.clearRect(0, 0, 300, 300);
			g.drawImage(Filler_0_default_resized, 50,50, null);

		}
		
		

	}
	
	
	
}