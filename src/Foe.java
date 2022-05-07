import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Foe {
	
	String foeName;
	String foeClass;
	int foeHealth;
	String [] FoeName;
	String [] FoeClass;
	int [] FoeHealth;
	

	
	public Foe() {
		Scanner fileIn=null;
		try {
			fileIn=new Scanner(new FileInputStream("Foes"));
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(0);
		}
		
		int foeAmount=fileIn.nextInt();
		fileIn.nextLine();
		FoeName =new String[foeAmount];
		FoeClass = new String[foeAmount];
		FoeHealth = new int[foeAmount];
		
		for (int row=0; row<3; row++) {
		
		FoeName[row]= fileIn.nextLine();
		FoeClass[row] =fileIn.nextLine();
		FoeHealth[row]=fileIn.nextInt();
		fileIn.nextLine();
		
		}
		
	}
	
	public void randFoe() {
		
		Random rand = new Random();
		
		int x=rand.nextInt(3);
		
		foeName= FoeName[x];
		foeClass= FoeClass[x];
		foeHealth = FoeHealth[x];
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return foeName + "\n" + foeClass + "\n" + foeHealth + "\n";
	}

	void displayFoe()
	{
		System.out.println(FoeName[0]);
		System.out.println(FoeClass[0]);
		System.out.println(FoeHealth[0]);
	}
	
	void displayFoes() {
		
		System.out.println(FoeName[0]);
		System.out.println(FoeClass[0]);
		System.out.println(FoeHealth[0]);
		System.out.println(FoeName[1]);
		System.out.println(FoeClass[1]);
		System.out.println(FoeHealth[1]);
		System.out.println(FoeName[2]);
		System.out.println(FoeClass[2]);
		System.out.println(FoeHealth[2]);
				
	}

}