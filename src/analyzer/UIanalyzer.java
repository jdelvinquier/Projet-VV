package analyzer;

import java.awt.Component;
import java.awt.Point;

import javax.swing.SwingUtilities;

import org.malai.mapping.MappingRegistry;

import actions.ActionList;
import net.sf.latexdraw.ui.LFrame;
import net.sf.latexdraw.ui.SplashScreen;
import net.sf.latexdraw.ui.UIBuilder;
import net.sf.latexdraw.util.Theme;

public class UIanalyzer {
	private LFrame mainFrame;
	
	public UIanalyzer(){
		SplashScreen l = new SplashScreen(Theme.lookAndFeel());
		l.setVisible(true);
		mainFrame = new LFrame(l.getProgressBar());
		mainFrame.getComposer().compose(l.getProgressBar());
		mainFrame.getPrefSetters().readXMLPreferences();
		l.setVisible(false);
		MappingRegistry.REGISTRY.initMappings();
		mainFrame.setVisible(true);
		mainFrame.setModified(false);
		mainFrame.getCanvas().requestFocusInWindow();
		mainFrame.getCanvas().centreViewport();
		l.flush();
	}
	
	public void analyze(ActionList alist){
		UIBuilder b = mainFrame.getComposer();
		Component [] cList = b.getToolbar().getComponents();
		//6-Options grille
		Point p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[6]);
		ActionList.actions.get(8).setX(p.x+2);
		ActionList.actions.get(8).setY(p.y+2);
		ActionList.actions.get(9).setX(p.x+2);
		ActionList.actions.get(9).setY(p.y+2);
		ActionList.actions.get(10).setX(p.x+2);
		ActionList.actions.get(10).setY(p.y+2);
		//8-Undo
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[8]);
		ActionList.actions.get(18).setX(p.x+2);
		ActionList.actions.get(18).setY(p.y+2);
		//9-Redo
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[9]);
		ActionList.actions.get(16).setX(p.x+2);
		ActionList.actions.get(16).setY(p.y+2);
		//12-LineJ
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[12]);
		ActionList.actions.get(11).setX(p.x+2);
		ActionList.actions.get(11).setY(p.y+2);
		//13-Rectangle
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[13]);
		ActionList.actions.get(15).setX(p.x+2);
		ActionList.actions.get(15).setY(p.y+2);
		//14-Carré
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[14]);
		ActionList.actions.get(4).setX(p.x+2);
		ActionList.actions.get(4).setY(p.y+2);
		//15-Ellipse
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[15]);
		ActionList.actions.get(6).setX(p.x+2);
		ActionList.actions.get(6).setY(p.y+2);
		//16-Circle
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[16]);
		ActionList.actions.get(5).setX(p.x+2);
		ActionList.actions.get(5).setY(p.y+2);
		//17-Polygon
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[17]);
		ActionList.actions.get(14).setX(p.x+2);
		ActionList.actions.get(14).setY(p.y+2);
		//18-Losange
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[18]);
		ActionList.actions.get(12).setX(p.x+2);
		ActionList.actions.get(12).setY(p.y+2);
		//19-Triangle
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[19]);
		ActionList.actions.get(17).setX(p.x+2);
		ActionList.actions.get(17).setY(p.y+2);
		//20-BezierClos
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[20]);
		ActionList.actions.get(3).setX(p.x+2);
		ActionList.actions.get(3).setY(p.y+2);
		//21-Bezier
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[21]);
		ActionList.actions.get(2).setX(p.x+2);
		ActionList.actions.get(2).setY(p.y+2);
		//22-Grille
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[22]);
		ActionList.actions.get(7).setX(p.x+2);
		ActionList.actions.get(7).setY(p.y+2);
		//23-Axe
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[23]);
		ActionList.actions.get(1).setX(p.x+2);
		ActionList.actions.get(1).setY(p.y+2);
		//25-Arc
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[25]);
		ActionList.actions.get(0).setX(p.x+2);
		ActionList.actions.get(0).setY(p.y+2);
		//28-Points
		p = new Point();
		SwingUtilities.convertPointToScreen(p,cList[28]);
		ActionList.actions.get(13).setX(p.x+2);
		ActionList.actions.get(13).setY(p.y+2);
		mainFrame.setVisible(false);
	}
}
