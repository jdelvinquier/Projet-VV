package buttons;

public class BUndo extends AbstractButton {
	public BUndo(){
		this.ref = "Undo";
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
