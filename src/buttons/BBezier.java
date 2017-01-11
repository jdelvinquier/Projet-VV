package buttons;

import java.util.Random;

public class BBezier extends AbstractButton{
	private int clicks;
	
	public BBezier(){
		this.ref = "Bezier";
		this.relX = new int[1];
		this.relY = new int[1];
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
