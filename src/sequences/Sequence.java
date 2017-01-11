package sequences;

import java.util.ArrayList;
import java.util.Random;

import actions.ActionList;
import buttons.AbstractButton;

public class Sequence {
	private Random rand;
	private ArrayList<AbstractButton> actionSeq; 
	private int seqLength, nUndo, nRedo;
	private int [] undoPlace;
	private int [] redoPlace;
	
	public Sequence(int p_seqLength){
		this.rand = new Random();
		this.actionSeq = new ArrayList<AbstractButton>();
		this.undoPlace = new int[p_seqLength];
		this.redoPlace = new int[p_seqLength];
		this.seqLength = p_seqLength;
		this.nRedo = 0;
		this.nUndo = 0;
	}
	
	public void buildNew(){
		actionSeq = new ArrayList<AbstractButton>();
		nUndo = 1;
		nRedo = 1;
		int idx;
		for(int i=0;i<this.seqLength-nUndo-nRedo;i++){
			idx = rand.nextInt(ActionList.actions.size());
			while(idx==16 || idx==18){
				idx = rand.nextInt(ActionList.actions.size());
			}
			actionSeq.add(ActionList.actions.get(idx));
		}
		actionSeq.add(ActionList.actions.get(18));
		actionSeq.add(ActionList.actions.get(16));
	}
	
	public void printSeq(){
		String fin = "";
		for(int i=0;i<this.seqLength;i++){
			fin += actionSeq.get(i).getName();
			if(i!=seqLength-1)
				fin += ", ";
		}
		System.out.println(fin);
	}
	
	public ArrayList<AbstractButton> getList(){
		return actionSeq;
	}
	
	public int[] getUndo(){
		return undoPlace;
	}
	
	public int[] getRedo(){
		return redoPlace;
	}
}
