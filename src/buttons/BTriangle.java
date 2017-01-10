package buttons;

import actions.AbstractButton;

public class BTriangle extends AbstractButton{

	public BTriangle(){
		this.ref = "Triangle";
		this.relX = new double[1];
		this.relY = new double[1];
		this.relX[0] = 0.3140;
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
