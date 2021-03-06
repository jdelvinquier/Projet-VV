package mainTest;

import java.awt.AWTException;
import java.io.IOException;

import actions.ActionList;
import actions.ActionPerformer;
import analyzer.UIanalyzer;
import launcher.Launcher;
import sequences.Sequence;

public class test {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException{
		boolean windows7_1920_1080 = false;
		//Initialize class containing all possible actions
		ActionList alist = new ActionList();
		//Filling the list with positions of components
		UIanalyzer UIanalyzer = new UIanalyzer();
		UIanalyzer.analyze(alist);
		//Launch Latexdraw
		Launcher ltx = new Launcher();
		//Create a robot to execute the actions sequences
		ActionPerformer p = new ActionPerformer();
		//Create a new action sequence class, specify name & a max size
		Sequence s = new Sequence("SeqDemo",15);
		//Generate a sequence with X Undo & Y Redo at the end, fill the rest with random actions
		//set boolean=true if 1920*1080, else set false
		s.buildNew(3,2,windows7_1920_1080);
		//Execute all  the actions and capture .png at each important step to verify
		p.executeSequence(s);
		s.printSeq();
		//End of the program
		UIanalyzer.closeFrame();
	}
}
