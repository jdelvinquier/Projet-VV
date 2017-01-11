package buttons;

public class BArc extends AbstractButton{
	public BArc(){
		this.ref = "Arc";
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
