package actions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import launcher.Launcher;
import buttons.*;

public class ActionPerformer extends Robot{
	private double screenWidth;
	private double screenHeight;
	private int canvasLeft, canvasRight;
	private int canvasUpper, canvasDown;
	private Random rand;


	public ActionPerformer() throws AWTException {
		super();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		this.screenWidth = d.getWidth();
		this.screenHeight = d.getHeight();
		this.canvasLeft = (int)(this.screenWidth*0.01);
		this.canvasRight = (int)(this.screenWidth*0.95);
		this.canvasUpper = (int)(this.screenHeight*0.11);
		this.canvasDown = (int)(this.screenHeight*0.9);
		this.rand = new Random();
	}
	
	public void pressButton(AbstractButton b) throws InterruptedException{
		int clickCntr = 0;
		double [] relXtoClick = b.getX();
		double [] relYtoClick = b.getY();
		double realX, realY;
		for(int i=0;i<relXtoClick.length;i++){
			Thread.sleep(250);
			realX = relXtoClick[i]*screenWidth;
			realY = relYtoClick[i]*screenHeight;
			this.mouseMove((int)realX,(int)realY);
			this.mousePress(InputEvent.BUTTON1_MASK);
			this.mouseRelease(InputEvent.BUTTON1_MASK);
		}
		Thread.sleep(50);
		if(b.needCanvasDND()){
			int X = rand.nextInt(canvasRight-canvasLeft)+canvasLeft;
			int Y = rand.nextInt(canvasDown-canvasUpper)+canvasUpper; 
			this.mouseMove(X,Y);
			this.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(50);
			X = rand.nextInt(canvasRight-canvasLeft)+canvasLeft;
			Y = rand.nextInt(canvasDown-canvasUpper)+canvasUpper;
			this.mouseMove(X,Y);
			Thread.sleep(50);
			this.mouseRelease(InputEvent.BUTTON1_MASK);
		}else if(b.needCanvasClick()>0){
			while(clickCntr<b.needCanvasClick()){
				int X = rand.nextInt(canvasRight-canvasLeft)+canvasLeft;
				int Y = rand.nextInt(canvasDown-canvasUpper)+canvasUpper;
				this.mouseMove(X,Y);
				this.mousePress(InputEvent.BUTTON1_MASK);
				this.mouseRelease(InputEvent.BUTTON1_MASK);
				clickCntr++;
				Thread.sleep(50);
			}
		}
		this.mousePress(InputEvent.BUTTON2_MASK);
		this.mouseRelease(InputEvent.BUTTON2_MASK);
	}
	
	public void takeScreen(String filename) throws IOException{
		 BufferedImage screencapture = this.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	     File file = new File("states/"+filename+".jpg");
	     ImageIO.write(screencapture, "png", file);
	}
	
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException{
		Launcher l = new Launcher();
		ActionPerformer p = new ActionPerformer();
		p.takeScreen("test");
	}
}
