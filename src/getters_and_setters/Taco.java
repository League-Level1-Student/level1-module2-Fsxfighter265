package getters_and_setters;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Button;
public class Taco {

	private static String Meat;
	private static String Sauce;
	
	public static String getMeat() {
		return Meat;
	}
	public static String getSauce() {
		return Sauce;
	}
	public static void setMeat() {
		JFrame MainFrame = new JFrame();
		JPanel MainPanel = new JPanel();
		JLabel MainLabel = new JLabel();
		Button MainButton = new Button();
		
		//Setup for Frame
		MainFrame.setVisible(true);
		MainFrame.setSize(1000,1000);
		
		MainFrame.add(MainPanel);
		MainPanel.setLayout(null);
		MainPanel.add(MainButton);
		MainButton.setBounds(50, 50, 100, 100);
		MainFrame.repaint();
	
		System.out.println(MainButton.getLocation());
		
	}
	public static void setSauce() {
	
	}
	
}
