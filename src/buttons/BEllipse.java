package buttons;

import actions.AbstractButton;

public class BEllipse extends AbstractButton{
	public BEllipse(){
		this.ref = "Ellipse";
		this.relX = new double[1];
		this.relY = new double[1];
		this.relX[0] = 0.2531;
		this.relY[0] = 0.055;
	}
	
	@Override
	public int needCanvasClick() {
		return 0;
	}

	@Override
	public boolean needCanvasDND() {
		return true;
	}

}
