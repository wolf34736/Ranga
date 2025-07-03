package pokemonRanga;

public class Pokeball {
	private double bonusBall = 1;
	private double bonusStatus = 1.0;
	private int bonusLevel = 1;
		//catchRate is from the pokemon
	public boolean caught (int gymBadges, String ball,//trainer info 
			int lvl, int HPmax, int HPcurrent, int catchRate, String currentStatus) {//pokemon being captured stats
		
		int a = (int)((3.0 * HPmax - 2 * HPcurrent)/(3.0 * HPmax) * 4096 * catchRate * bonusBall);//need to add the badgePenalty. 
		//badgePenalty is applied if the wild Pokémon is more than 5 levels above the player's current obedience level, and is equal to 0 . 8 n , where n is the number of Gym Badges that would be needed for it to obey.
		
		bonusLevel = (36 - 2 * lvl)/10;
		if(bonusLevel < 1)
			bonusLevel = 1;
		switch(currentStatus.toLowerCase()) {
			case "freeze":
				bonusStatus = 2.0;
			break;
			case "sleep":
				bonusStatus = 2.0;
			break;
			case "paralysis":
				bonusStatus = 1.5;
			break;
			case "poison":
				bonusStatus = 1.5;
			break;
			case "burn":
				bonusStatus = 1.5;
			break;
			default:
				bonusStatus = 1;
			break;
		}
		a *= bonusLevel * bonusStatus;
		double catchChance = (catchRate * bonusBall * bonusStatus)/255;
		
		return a < catchChance; 
	}
}
