package buttons;

import actions.AbstractButton;

public class BGrilleStandard extends AbstractButton {
	public BGrilleStandard(){
		this.ref = "GrilleStandard";
		this.relX = new double[4];
		this.relY = new double[4];
		this.relX[0] = 0.122395;
		this.relY[0] = 0.055;
		this.relX[1] = 0.1458;
		this.relY[1] = 0.0851;
		this.relX[2] = 0.1458;
		this.relY[2] = 0.1129629;
		this.relX[3] = 0.122395;
		this.relY[3] = 0.055;
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
