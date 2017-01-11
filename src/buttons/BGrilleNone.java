package buttons;

public class BGrilleNone extends AbstractButton {
	public BGrilleNone(){
		this.ref = "GrilleNone";
		this.relX = new int[4];
		this.relY = new int[4];
		relX[1] = 323;
		relY[1] = 112;
		relX[2] = 323;
		relY[2] = 166;
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
