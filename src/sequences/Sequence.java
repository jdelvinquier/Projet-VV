package sequences;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import actions.ActionList;
import buttons.AbstractButton;

public class Sequence {
	private Random rand;
	private ArrayList<AbstractButton> actionSeq; 
	private int seqLength, nUndo, nRedo;

	private String name;
	
	public Sequence(String p_name, int p_seqLength){
		this.rand = new Random();
		this.name = p_name;
		this.actionSeq = new ArrayList<AbstractButton>();
		this.seqLength = p_seqLength;
		this.nRedo = 0;
		this.nUndo = 0;
	}
	
	public void buildNew(int p_nUndo, int p_nRedo, boolean grilleOptOK){
		actionSeq = new ArrayList<AbstractButton>();
		if(p_nRedo > p_nUndo)
			p_nRedo = p_nUndo;
		nUndo = p_nUndo;
		nRedo = p_nRedo;
		int idx;
		for(int i=0;i<this.seqLength-nUndo-nRedo;i++){
			idx = rand.nextInt(ActionList.actions.size());
			if(grilleOptOK){
				while(idx==16 || idx==18){
					idx = rand.nextInt(ActionList.actions.size());
				}
			}else{
				while(idx==16 || idx==18 || idx==8 || idx==9 || idx==10){
					idx = rand.nextInt(ActionList.actions.size());
				}
			}
			actionSeq.add(ActionList.actions.get(idx));
		}
		for(int i=0;i<p_nUndo;i++)
			actionSeq.add(ActionList.actions.get(18));
		for(int i=0;i<p_nRedo;i++)
			actionSeq.add(ActionList.actions.get(16));
	}
	
	public void printSeq() throws FileNotFoundException{
		String fin = name+" : ";
		for(int i=0;i<this.seqLength;i++){
			fin += actionSeq.get(i).getName();
			if(i!=seqLength-1)
				fin += ", ";
		}
		System.out.println(fin);
		PrintWriter out = new PrintWriter("states/"+this.name+".txt");
		out.println(fin);
	}
	
	public ArrayList<AbstractButton> getList(){
		return actionSeq;
	}
	
	public int getUndo(){
		return nUndo;
	}
	
	public int getRedo(){
		return nRedo;
	}
	
	public String getName(){
		return name;
	}
}
