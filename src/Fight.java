import java.util.*;

public class Fight {

	int weaponDamagePercent;
	int weaponProficiency;
	float successFactorFriend;
	float successFactorFoe;
	
	
	Gang [] gangFight;
	Troupe t1= new Troupe();
	Gang g1= new Gang();
	
	//Fight Fight1 = new Fight( t1, g1);
	
	
	public void Fight1()
	{
		this.weaponDamagePercent = 0;
		this.weaponProficiency= 0;
		this.successFactorFriend = 0;
		this.successFactorFoe = 0;
		
		g1.makeGang();
		
		Foe [] f2 = g1.getGang();
		for (int i=0; i<g1.randomizeGangSize(); i++)
		{
			System.out.println(f2[i]);
			
		}
	}
	
	
	
	
	public void displayGang()
	{

		Fight1();
		
		
	}
	
	
	public void startFight()
	{
		double damage;
		Random rand = new Random();
		
		float maxFriendSuccess = 3;
		
		this.successFactorFriend = rand.nextFloat(maxFriendSuccess);
		
		float maxFoeSuccess = (float) 1.5;
		
		this.successFactorFoe = rand.nextFloat(maxFoeSuccess);
		
		
		
		
		
		
		
	}
	
	
	
}

	