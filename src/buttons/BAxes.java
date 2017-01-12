package buttons;

public class BAxes extends AbstractButton{
	private int clicks;
	
	public BAxes(){
		this.ref = "Axes";
		this.relX = new int[1];
		this.relY = new int[1];
		this.clicks = 1;
	}
	
	@Override
	public int needCanvasClick() {
		return this.clicks;
	}

	@Override
	public boolean needCanvasDND() {
		return false;
	}

}
