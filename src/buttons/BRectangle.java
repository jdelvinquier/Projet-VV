package buttons;

public class BRectangle extends AbstractButton{
	
	public BRectangle(){
		this.ref = "Rectangle";
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
