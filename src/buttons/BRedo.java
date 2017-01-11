package buttons;

public class BRedo extends AbstractButton{
	public BRedo(){
		this.ref = "Redo";
		this.relX = new int[1];
		this.relY = new int[1];
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
