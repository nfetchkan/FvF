import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.*;
/**
 * Class for creating Friends two ways
 * The first is just a list and the second is randomly assign names and character types
 * @author mxm9700
 *
 */
public class Friend {

	// variables for setting the text file output
	String friendName, characterType;
	int numWeapons;
	double healthPercent;

	String [] FriendName;
	String [] CharacterType;
	Integer [] NumWeapons;
	int [] HealthPercent;
	
	
	public Friend() {
		Scanner fileIn=null;
		try {
			fileIn=new Scanner(new FileInputStream("Friends"));
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(0);
	}
	
		int friendAmount=fileIn.nextInt();
		fileIn.nextLine();
		FriendName =new String[friendAmount];
		CharacterType = new String[friendAmount];
		HealthPercent = new int[friendAmount];
		
		for (int row=0; row<3; row++) {
		
		FriendName[row]= fileIn.nextLine();
		CharacterType[row] =fileIn.nextLine();
		HealthPercent[row]=fileIn.nextInt();
		fileIn.nextLine();
		
	}
		this.friendName = "";
		this.characterType = "";
		this.numWeapons = 0;
		this.healthPercent = 0.0;
		
		String name[] = {"Luke","Yoda","Chewbacca","Han Solo","Lea","Lando","Anakin","Obi-wan Kenobi"};
		String type[] = {"Jedi","Trooper","Pilot","Captain"};
		
		Random rand = new Random();
		
		this.friendName = name[rand.nextInt(name.length)];
		this.characterType = type[rand.nextInt(type.length)];
		//Integer wepNum[] = weapon[rand.nextInt(weapon.length)]
		
		this.healthPercent = 1.0;
		
		
	
		
	}
	void displayFriend()
	{
		System.out.println(FriendName[0]);
		System.out.println(CharacterType[0]);
		System.out.println(HealthPercent[0]);
		
	}
	
	void displayFriends()
	{
		System.out.println(FriendName[0]);
		System.out.println(CharacterType[0]);
		System.out.println(HealthPercent[0]);
		System.out.println(FriendName[1]);
		System.out.println(CharacterType[1]);
		System.out.println(HealthPercent[1]);
		System.out.println(FriendName[2]);
		System.out.println(CharacterType[2]);
		System.out.println(HealthPercent[2]);
	}
	
	
	
			
//	@Override
//	public String toString() {
//		DecimalFormat percentF = new DecimalFormat ( "0.0%" );
//		return  friendName + "\n" + characterType + "\n" + percentF.format(healthPercent);
//	}
	public void randomFriend()
	{
		
		Weapon w1 = new Weapon();
		DecimalFormat percentF = new DecimalFormat ( "0.0%" );
		System.out.println(this.friendName + "\n" + this.characterType + "\n" + percentF.format(this.healthPercent));
		w1.randFriendWeapon();
		System.out.println();
		
		
		
	}
	
	
}
