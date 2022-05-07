import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gang {
	
	 Foe [] gang;
	
	 Scanner input = new Scanner(System.in);

	private int numFoe;
	 
	 public void createGang()
	 {
		 Foe f1 = new Foe();
		 f1.displayFoes();
	 }
	 
	 public void makeGang() {
		
		gang = new Foe[3];
		
		
		
		for(int i=0; i<randomizeGangSize(); i++) {
			
		
		gang [i] = new Foe();
		gang[i].randFoe();
		
				
		}
		
		
	}
	
	public Foe[] getGang()
	{
		return gang;
	}
	
	public int randomizeGangSize()
	{
		this.numFoe = (1 + (int)(Math.random() * ((4-1))));
		return this.numFoe;
	}
	

}