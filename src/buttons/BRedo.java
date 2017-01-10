package buttons;

import actions.AbstractButton;

public class BRedo extends AbstractButton{
	public BRedo(){
		this.ref = "Redo";
		this.relX = new double[1];
		this.relY = new double[1];
		this.relX[0] = 0.1619;
		this.relY[0] = 0.055;
	}

	@Override
	public int needCanvasClick() {
		return 0;
	}

	@Override
	public boolean needCanvasDND() {
		return false;
	}
}
