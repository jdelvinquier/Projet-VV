package buttons;

public class BGrilleStandard extends AbstractButton {
	public BGrilleStandard(){
		this.ref = "GrilleStandard";
		this.relX = new int[4];
		this.relY = new int[4];
		relX[1] = 323;
		relY[1] = 112;
		relX[2] = 323;
		relY[2] = 135;
		relX[3] = 268;
		relY[3] = 70;
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
