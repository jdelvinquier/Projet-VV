package buttons;

public abstract class AbstractButton {
	protected String ref;
	protected int[] relX;
	protected int[] relY;
	
	public int[] getX(){
		return this.relX;
	}
	
	public int[] getY(){
		return this.relY;
	}
	
	public void setX(int v){
		this.relX[0] = v;
	}
	
	public void setY(int v){
		this.relY[0] = v;
	}
	
	public String getName(){
		return ref;
	}
	
	public abstract int needCanvasClick();
	public abstract boolean needCanvasDND();
}
