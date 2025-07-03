package pokemonRanga;

public class Move {
	private String name, type, statusEffect;
	//private String effect1, effect2, effect3, effect4, effect5, effect6, effect7, effect8;
	private int number, PP, power, accuracy, statusTurnsMin, statusTurnsMax, maxPP, priority;
	private String specialEffects[] = new String[8];
	private double statusDamage, statusChance, statusDamageRate;
	private double hitChance[] = new double[5];
	private boolean status, special, specialEffect, critHeighting, hitUntilMiss, contact;
	private boolean affectedProtect, affectedMagicCoat, affectedSnatch, affectedMirrorMove, affectedKingRock;
	private boolean soundBased, wind, usableOutside, hitFly, hitDig, hitBounce, hitSkyDrop, hitDive;
	
	//creates a empty move
	public Move() {
		name = "empty";
		type = "n/a";
		statusEffect = "none";
		number = -1;
		PP = 0;
		power = 0;
		accuracy = -1;
		statusTurnsMin = -1;
		statusTurnsMax = -1;
		maxPP = -1;
		priority = -100;
		for(int i = 0; i < specialEffects.length; i++) {
			specialEffects[i] = "none";
		}
		statusDamage = 0;
		statusChance = 0;
		statusDamageRate = 0;
		for(int i = 0; i < hitChance.length; i++) {
			hitChance[i] = -1;
		}
		status = false;
		special = false;
		specialEffect = false;
		critHeighting = false;
		hitUntilMiss = false;
		contact = false;
		affectedProtect = false;
		affectedMagicCoat = false;
		affectedSnatch = false;
		affectedKingRock = false;
		soundBased = false;
		wind = false;
		usableOutside = false;
		hitFly = false;
		hitDig = false;
		hitBounce = false;
		hitSkyDrop = false;
		hitDive = false;
		
	}
	//creates a move
	public Move(String mString) {
		//utility variables
		int i = 0;
		//index shows where the next "," exists			
		int index = mString.indexOf(",");
		//System.out.println("\n\n" + index + "\n\n");
		//get number of move
		number = Integer.valueOf(mString.substring(0, index));
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");

		//get name of move
		name = mString.substring(0, index);
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get type of move
		type = mString.substring(0, index);
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if physical or special/status
		special = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get PP of move
		PP = Integer.valueOf(mString.substring(0, index));
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get power of move
		power = Integer.valueOf(mString.substring(0, index));
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get Accuracy of move
		accuracy = Integer.valueOf(mString.substring(0, index));
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if causes a status effect
		status = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get status effect caused(none if no status effect)
		statusEffect = mString.substring(0, index);
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get status effect data 
		if(statusEffect.equalsIgnoreCase("none")) {//skips over the 0's if no status effect
			while(!mString.substring(0, index).equalsIgnoreCase("TRUE") && !mString.substring(0, index).equalsIgnoreCase("FALSE")) {
				mString = mString.substring(index + 1);
				index = mString.indexOf(",");
			}
			//gives default values
			statusChance = 0;
			statusTurnsMin = 0;
			statusTurnsMax = 0;
			statusDamageRate = 0;
		}
		else {//gets data if it has a status effect
			//get the chance of the status
			statusChance = Double.valueOf(mString.substring(0, index));
			mString = mString.substring(index + 1);
			index = mString.indexOf(",");
			//get the minimum turns the status last
			statusTurnsMin = Integer.valueOf(mString.substring(0, index));
			mString = mString.substring(index + 1);
			index = mString.indexOf(",");
			//get the maximum turns the status last
			statusTurnsMax = Integer.valueOf(mString.substring(0, index));
			mString = mString.substring(index + 1);
			index = mString.indexOf(",");
			//damage rate per turn of status
			statusDamageRate = Double.valueOf(mString.substring(0, index));
			mString = mString.substring(index + 1);
			index = mString.indexOf(",");
		}
		//checks if has a special effect to the move
		specialEffect= mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		if(specialEffect) {//gets effects into strings for later use(might delete from list)
			for(i= 0; i < specialEffects.length; i++) {
				specialEffects[i] = mString.substring(0, index);
				mString = mString.substring(index + 1);
				index = mString.indexOf(",");			
			}
			i = 0;
			for(String s: specialEffects) {
				String temp = "";
				for(int j = 0; j < s.length(); j++) {
					if(s.charAt(i) == '#')
						temp += ",";
					else
						temp += s.charAt(i) +"";
				}
				specialEffects[i] = temp;
			}
		}
		else {//skips effects and sets to default value
			while(!mString.substring(0, index).equalsIgnoreCase("TRUE") && !mString.substring(0, index).equalsIgnoreCase("FALSE")) {
				mString = mString.substring(index + 1);
				index = mString.indexOf(",");
			}
			//set default value
			for(i= 0; i < specialEffects.length; i++) {
				specialEffects[i] = "none";			
			}
		}

		//get if move has a better chance of a critical hit
		critHeighting = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");		
		
		//get if move hits until it misses
		hitUntilMiss = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get hit chances on multiple hits or sets all to zero(spot 5 in hitChance is for 6th hit onward)
		if(hitUntilMiss) {//gets multi hit chance on all hits(100 attack always)
			for(i= 0; i < hitChance.length; i++) {
				hitChance[i] = Double.valueOf(mString.substring(0, index));
				mString = mString.substring(index + 1);
				index = mString.indexOf(",");
			}
		}
		else {//if not multi hit set all to 0
			for(i= 0; i < hitChance.length; i++) {
				hitChance[i] = 0;
				mString = mString.substring(index + 1);
				index = mString.indexOf(",");
			}
		}
		
		//get maxPP of move
		maxPP = Integer.valueOf(mString.substring(0, index));
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");

		//get if move makes contact
		contact = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if affected by protect
		affectedProtect = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if affected by magic coat
		affectedMagicCoat = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if affected by snatch
		affectedSnatch = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if affected by mirror move
		affectedMirrorMove = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if affected by king rock
		affectedKingRock = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if move is sound based
		soundBased = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if move is wind based
		wind = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if move is usable outside of battle
		usableOutside = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if move can hit flying target
		hitFly = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if move can hit digging target
		hitDig = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if move can hit bouncing target
		hitBounce = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if move can hit target using sky drop
		hitSkyDrop = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get if move can hit diving target
		hitDive = mString.substring(0, index).equalsIgnoreCase("TRUE");
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
		
		//get move priority
		priority = Integer.valueOf(mString);
		mString = mString.substring(index + 1);
		index = mString.indexOf(",");
	}
	
	//getters
	public String getType() {		return type;	}
	public String getName() {		return name;	}
	public int getPower() 	{		return power;	}
	public int getAcc() 	{		return accuracy;	}	
	public int getPriority() {		return priority;	}
	public boolean getSpecial() {	return special;		}
	public boolean getCritHeighting()	{	return critHeighting;	}
	
}