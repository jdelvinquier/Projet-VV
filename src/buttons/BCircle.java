package buttons;

public class BCircle extends AbstractButton{
	public BCircle(){
		this.ref = "Circle";
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
