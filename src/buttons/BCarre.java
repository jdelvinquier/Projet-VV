package buttons;

public class BCarre extends AbstractButton{
	public BCarre(){
		this.ref = "Carre";
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
