package sequences;

import java.util.ArrayList;

import actions.AbstractButton;

public abstract class Sequence {
	private ArrayList<AbstractButton> actionSeq; 
	private int seqLength;
	
	public Sequence(int p_seqLength){
		this.actionSeq = new ArrayList<AbstractButton>();
		this.seqLength = p_seqLength;
	}
}
