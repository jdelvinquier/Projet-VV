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
		ActionList alist = new ActionList();
		UIanalyzer UIanalyzer = new UIanalyzer();
		UIanalyzer.analyze(alist);
		Launcher ltx = new Launcher();
		ActionPerformer p = new ActionPerformer();
		Sequence s = new Sequence(10);
		s.buildNew();
		p.executeSequence(s);
		s.printSeq();
	}
}
