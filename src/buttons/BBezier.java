package buttons;

import java.util.Random;

import actions.AbstractButton;

public class BBezier extends AbstractButton{
	private int clicks;
	
	public BBezier(){
		this.ref = "Bezier";
		this.relX = new double[1];
		this.relY = new double[1];
		this.relX[0] = 0.3437;
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
