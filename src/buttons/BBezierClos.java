package buttons;

import java.util.Random;

import actions.AbstractButton;

public class BBezierClos extends AbstractButton{
	private int clicks;
	
	public BBezierClos(){
		this.ref = "BezierClos";
		this.relX = new double[1];
		this.relY = new double[1];
		this.relX[0] = 0.3291;
		this.relY[0] = 0.055;
		Random r = new Random();
		this.clicks = r.nextInt(4)+1;
	}
	
	
	@Override
	public int needCanvasClick() {
		return this.clicks;
	}

	@Override
	public boolean needCanvasDND() {
		return false;
	}

}
