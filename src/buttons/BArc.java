package buttons;

import actions.AbstractButton;

public class BArc extends AbstractButton{
	public BArc(){
		this.ref = "Arc";
		this.relX = new double[1];
		this.relY = new double[1];
		this.relX[0] = 0.4041;
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
