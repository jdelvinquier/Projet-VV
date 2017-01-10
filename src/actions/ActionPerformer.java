package actions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.IOException;

import launcher.Launcher;

public class ActionPerformer extends Robot {
	private double screenWidth;
	private double screenHeight;

	public ActionPerformer() throws AWTException {
		super();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		this.screenWidth = d.getWidth();
		this.screenHeight = d.getHeight();
	}
	
	public void drawRect(){
	}
	
	public void pressDo(){
	}
	
	public void pressUndo(){
	}
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException{
		//Tests
		Launcher l = new Launcher();
		ActionPerformer p = new ActionPerformer();
		p.pressDo();
		Thread.sleep(5000);
		p.pressUndo();
	}

}
