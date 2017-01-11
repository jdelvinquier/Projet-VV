package buttons;

public class BTriangle extends AbstractButton{

	public BTriangle(){
		this.ref = "Triangle";
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
