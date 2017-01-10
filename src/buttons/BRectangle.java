package buttons;

import actions.AbstractButton;

public class BRectangle extends AbstractButton{
	
	public BRectangle(){
		this.ref = "Rectangle";
		this.relX = new double[1];
		this.relY = new double[1];
		this.relX[0] = 0.2234;
		this.relY[0] = 0.0537;
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
