package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class CanvasECS extends JPanel {
	BufferedImage gui;
	BufferedImage officeACon;
	BufferedImage storageACon;
	BufferedImage manuACon;
	BufferedImage officeOccupancy;
	BufferedImage StorageOccupancy;
	BufferedImage manuOccupancy;
	
	BufferedImage officeSiren;
	BufferedImage StorageSiren;
	BufferedImage manuSiren;
	
	BufferedImage officeLight100;
	BufferedImage storageLight100;
	BufferedImage manuLight100;
	
	BufferedImage officeLight50;
	BufferedImage storageLight50;
	BufferedImage manuLight50;
	
	BufferedImage officeLight80;
	BufferedImage storageLight80;
	BufferedImage manuLight80;
	
	BufferedImage officeHumidity;
	BufferedImage storageHumidity;
	BufferedImage manuHumidity;
	
	BufferedImage officeHeateron;
	
	public CanvasECS(){
		try {
			gui = ImageIO.read(new File("res/ECSgui.png"));
			officeACon = ImageIO.read(new File("res/officeACon.png"));
			storageACon = ImageIO.read(new File("res/storageACon.png"));
			manuACon = ImageIO.read(new File("res/manuACon.png"));
			officeHeateron = ImageIO.read(new File("res/officeHeateron.png"));
			officeOccupancy = ImageIO.read(new File("res/officeOccupancy.png"));
			
			officeSiren = ImageIO.read(new File("res/officeSiren.png"));
			StorageSiren = ImageIO.read(new File("res/StorageSiren.png"));
			manuSiren = ImageIO.read(new File("res/manuSiren.png"));
			
			officeOccupancy = ImageIO.read(new File("res/officeOccupancy.png")); 
			StorageOccupancy = ImageIO.read(new File("res/StorageOccupancy.png"));
			manuOccupancy = ImageIO.read(new File("res/manuOccupancy.png"));
			
			officeLight50 = ImageIO.read(new File("res/officeLight50.png")); 
			storageLight50 = ImageIO.read(new File("res/storageLight50.png")); 
			manuLight50 = ImageIO.read(new File("res/manuLight50.png")); 
			
			officeLight80 = ImageIO.read(new File("res/officeLight80.png")); 
			storageLight80 = ImageIO.read(new File("res/storageLight80.png")); 
			manuLight80 = ImageIO.read(new File("res/manuLight80.png")); 
			
			officeLight100 = ImageIO.read(new File("res/officeLight100.png")); 
			storageLight100 = ImageIO.read(new File("res/storageLight100.png")); 
			manuLight100 = ImageIO.read(new File("res/manuLight100.png")); 
			
			officeHumidity = ImageIO.read(new File("res/officeHumidity.png")); 
			storageHumidity = ImageIO.read(new File("res/storageHumidity.png")); 
			manuHumidity = ImageIO.read(new File("res/manuHumidity.png")); 
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(gui, 3, 50, null);

		if(States.OFFICE_AC_ON) {
			g.drawImage(officeACon, 4, 50, null);
		} 
		if(States.STORAGE_AC_ON) {
			g.drawImage(storageACon, 4, 50, null);
		} 
		if(States.MANUFACTURE_AC_ON) {
			g.drawImage(manuACon, 4, 50, null);
		} 
		if (States.OFFICE_HEATER_ON) {
			g.drawImage(officeHeateron, 4, 50, null);
		}
		if (States.OFFICE_OCCUPANCY_ON) {
			g.drawImage(officeOccupancy, 4, 50, null);
		}
		if (States.STORAGE_OCCUPANCY_ON) {
			g.drawImage(StorageOccupancy, 4, 50, null);
		}
		if (States.MANUFACTURE_OCCUPANCY_ON) {
			g.drawImage(manuOccupancy, 4, 50, null);
		}
		if (States.OFFICE_SIREN_ON) {
			g.drawImage(officeSiren, 4, 50, null);
		}
		if (States.STORAGE_SIREN_ON) {
			g.drawImage(StorageSiren, 4, 50, null);
		}
		if (States.MANUFACTURE_SIREN_ON) {
			g.drawImage(manuSiren, 4, 50, null);
		}
		if (States.OFFICE_LIGHT_100) {
			g.drawImage(officeLight100, 4, 50, null);
		}
		if (States.STORAGE_LIGHT_100) {
			g.drawImage(storageLight100, 4, 50, null);
		}
		if (States.MANUFACTURE_LIGHT_100) {
			g.drawImage(manuLight100, 4, 50, null);
		}
		if (States.OFFICE_LIGHT_50) {
			g.drawImage(officeLight50, 4, 50, null);
		}
		if (States.STORAGE_LIGHT_50) {
			g.drawImage(storageLight50, 4, 50, null);
		}
		if (States.MANUFACTURE_LIGHT_50) {
			g.drawImage(manuLight50, 4, 50, null);
		}
		if (States.OFFICE_LIGHT_80) {
			g.drawImage(officeLight80, 4, 50, null);
		}
		if (States.STORAGE_LIGHT_80) {
			g.drawImage(storageLight80, 4, 50, null);
		}
		if (States.MANUFACTURE_LIGHT_80) {
			g.drawImage(manuLight80, 4, 50, null);
		}
		if (States.OFFICE_HUMIDITY_ON) {
			g.drawImage(officeHumidity, 4, 50, null);
		}
		if (States.STORAGE_HUMIDITY_ON) {
			g.drawImage(storageHumidity, 4, 50, null);
		}
		if (States.MANUFACTURE_HUMIDITY_ON) {
			g.drawImage(manuHumidity, 4, 50, null);
		}
		
		
	}
}
