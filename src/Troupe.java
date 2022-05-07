import java.util.Scanner;

/**
 * Started working on the troupe class
 * @author mxm9700
 *
 */
public class Troupe {
	
	Friend [] troupe;
	
	
	public void createTroupe()
	{
		System.out.println( "Create Troupe");
		
		Friend f1 = new Friend();
		f1.displayFriends();
	}

	public void randomizeTroupe()
	{
		
		Scanner input = new Scanner(System.in);
		int numFriends;
		
	while (true)
	{
		System.out.println( "There can be 2-6 friends in a troupe" );
		System.out.print( "How many friends are apart of the troupe: ");
		System.out.println();
		
		numFriends = input.nextInt();
		
		if (numFriends < 2 || numFriends > 6)
		{
			System.out.println( "Please enter a valid number of friends" );
			continue;
		}
		
			break;
				
	}	
		
		troupe = new Friend[numFriends];
			
		for (int i = 0; i < numFriends; i++)
		{
			troupe[i] = new Friend();
			troupe[i].randomFriend();
			
		}
	}
	
	
	
	
	

}
