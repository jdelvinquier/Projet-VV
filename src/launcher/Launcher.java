package launcher;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


public class Launcher {
	private static String projectPath = "F:/Cours/Projet-VV";
	
	public Launcher() throws IOException{
		Thread openFile = new Thread(){
			public void run(){
				try{
					Desktop.getDesktop().open(new File(projectPath+"/lib/LaTeXDraw.jar"));
					Thread.sleep(2000);
				}catch (IOException | InterruptedException e){
	               e.printStackTrace();
	            }
			}
		};
		openFile.start();
		while(openFile.isAlive());
	}
}
