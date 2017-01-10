package actions;

public abstract class AbstractButton {
	protected String ref;
	protected double[] relX;
	protected double[] relY;
	
	public double[] getX(){
		return relX;
	}
	
	public double[] getY(){
		return relY;
	}
	
	public abstract int needCanvasClick();
	public abstract boolean needCanvasDND();
}
