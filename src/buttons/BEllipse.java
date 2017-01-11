package buttons;

public class BEllipse extends AbstractButton{
	public BEllipse(){
		this.ref = "Ellipse";
		this.relX = new int[1];
		this.relY = new int[1];
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
