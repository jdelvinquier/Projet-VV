package actions;

import java.util.ArrayList;

import buttons.*;

public class ActionList {
	public static ArrayList<AbstractButton> actions;
	
	public ActionList(){
		this.actions = new ArrayList<AbstractButton>();
		actions.add(new BArc());
		actions.add(new BAxes());
		actions.add(new BBezier());
		actions.add(new BBezierClos());
		actions.add(new BCarre());
		actions.add(new BCircle());
		actions.add(new BEllipse());
		actions.add(new BGrille());
		actions.add(new BGrilleNone());
		actions.add(new BGrillePerso());
		actions.add(new BGrilleStandard());
		actions.add(new BLineJ());
		actions.add(new BLosange());
		actions.add(new BPoint());
		actions.add(new BPolygon());
		actions.add(new BRectangle());
		actions.add(new BRedo());
		actions.add(new BTriangle());
		actions.add(new BUndo());
	}
	
	public static void printList(){
		for(int i=0;i< ActionList.actions.size();i++){
			System.out.println(i+" : "+ActionList.actions.get(i).getName());
			System.out.println("X: "+ActionList.actions.get(i).getX()[0]+" Y : "+ActionList.actions.get(i).getY()[0]);
		}
	}
}
