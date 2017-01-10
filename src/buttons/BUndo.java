package buttons;

import actions.AbstractButton;

public class BUndo extends AbstractButton {
	public BUndo(){
		this.ref = "Undo";
		this.relX = new double[1];
		this.relY = new double[1];
		this.relX[0] = 0.145;
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
