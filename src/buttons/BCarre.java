package buttons;

import actions.AbstractButton;

public class BCarre extends AbstractButton{
	public BCarre(){
		this.ref = "Carre";
		this.relX = new double[1];
		this.relY = new double[1];
		this.relX[0] = 0.2380;
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
