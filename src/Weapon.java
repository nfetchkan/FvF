import java.util.*;

/**
 * 
 * @author def42
 *
 */
public class Weapon {
	
	int damage;
	String name;
	
	String names[] = {"Lightsaber", "T-6 Blaster Pistol", "A-20 Blaster Rifle", "DC-155 Blaster Carbine", "E-11 Blaster Rifle", "Vibro Blade"};
	int damages[] = {50, 15, 25, 20, 35, 40};

	Random rand = new Random();
	int chosen = rand.nextInt( names.length );
	private double frProfMult;
	private double foProfMult;
	
	public void randFriendWeapon() {
		
		
		
		this.name = names[chosen];
		this.damage = this.damages[chosen];
		
		displayFriend();
	}
	public void randFoeWeapon() {
		
		this.name = names[chosen];
		this.damage = this.damages[chosen];
		
		displayFoe();
	}
	
	public double frProfMultGen() {
		double minFr = 0.50;
		double maxFr = 1.75;
		
		this.frProfMult = (minFr + (double)(Math.random() * ((maxFr - minFr))));
		return this.frProfMult;
	}
	public double foProfMultGen() {
		double minFo = 0.25;
		double maxFo = 1.25;
		
		this.foProfMult = (minFo + (double)(Math.random() * ((maxFo - minFo))));
		return this.foProfMult;
	}
	
	public void displayFriend() {
		System.out.println(this.name + "\n" + this.damage + "\n" + frProfMultGen());
	}
	
	public void displayFoe() {
		System.out.println(this.name + "\n" + this.damage + "\n" + foProfMultGen());
	}
	
}