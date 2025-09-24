/**
 * 
 */
package pokemonRanga;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PokemonRanga {
	/*
	 * letters and numbers for checking and picking both
	*/
	private static String alphabet ="abcdefghijklmnopqrstuvwxyz"; 
	private String numbers = "0123456789";
	private static String nonNums = "!\"#$%&'()*+,-./:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
	private static Scanner input = new Scanner(System.in);
	private static Random rand = new Random();
	private static Weather weather = new Weather();
	public static ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();
	public static ArrayList<Move> allMoves = new ArrayList<Move>();
	public static boolean userGRUsed = false;
	public static boolean cpuGRUsed = false;
	public static Map Kanto = new Map("Kanto");
	
	public static void main(String[] args) {
		String titles = "";
		
		/**********************************************************************************/
		/*
		 * all information
		*/
		
		String natures[]= {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"};
		
		Pokemon userTeam[] = new Pokemon[6];
		Pokemon cpuTeam[] = new Pokemon[6];
		
		/**********************************************************************************/
		/*
		 * read the information from the files
		 * 
		*/
		try {
			File pokemon = new File("C:\\Users\\user\\Desktop\\Pokemon spreadsheet csv\\Pokemon.csv");
			File moves = new File("C:\\Users\\user\\Desktop\\Pokemon spreadsheet csv\\Pokemon - Moves(gen1-2).csv");
			
			Scanner reader = new Scanner(moves);
			titles = reader.nextLine();
			while (reader.hasNextLine()) {
				allMoves.add(new Move(reader.nextLine()));
				
		     }
			reader.close();
			
			reader = new Scanner(pokemon);
			titles = reader.nextLine();
			while (reader.hasNextLine()) {
				pokemonList.add(new Pokemon(reader.nextLine(), allMoves));
				
		     }
			reader.close();
			
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
		}
		
		
		
		
		
		/**********************************************************************************/
		/*
		 * pick pokemon for each team
		*/
		/* run battler commenting it out for starting the game
		//userPickTeam(userTeam, pokemonList);
		cpuPickTeam(userTeam, pokemonList);
		clearScreen(2);
		System.out.println("you picked a team");
		printTeam(userTeam);
		//computer picks team
		cpuPickTeam(cpuTeam, pokemonList);
		
		/*********************************************************************************/
		/*
		 * battle
		*/
		/* run battler commenting it out for starting the game
		System.out.println("\n\n\nYou sent out " + userTeam[0].getNameShown() +".\nCPU sent out " + cpuTeam[0].getNameShown() +  ".\n\nYour moves are:\n");
		battle(userTeam, cpuTeam, 0, 0);
		*/
	}
	/*
	 * helps user pick a team
	*/
	private static void userPickTeam(Pokemon[] userTeam, ArrayList<Pokemon> pokemonList) {
		for(int i = 0; i < userTeam.length;i++) {//for
			System.out.println("What pokemon do you want enter the number or name");
			String temp = input.nextLine();
			boolean nums = true;
			for(int j = 0; j < temp.length(); j++) {
				if(nonNums.contains(temp.charAt(j) + "")){
					nums = false;
					j = temp.length();
				}
			}
			if(nums && Integer.valueOf(temp) < 1155 && Integer.valueOf(temp) > 0) {
				
				userTeam[i] = pokemonList.get(Integer.valueOf(temp)-1);
			}
			else if(alphabet.contains(temp.substring(0, 1))){
				for(int j = 0; j < pokemonList.size(); j++) {
					if(pokemonList.get(j).getName().equalsIgnoreCase(temp)) {
						userTeam[i] = pokemonList.get(j);
					}
					else if(userTeam[i] == null && j == pokemonList.size() -1) {
						i--;
						System.out.println("You didn't enter a proper pokemon or pokemon number.\nTry again\n");
						
					}
				}
			}
			else {
				i--;
				System.out.println("You didn't enter a proper pokemon or pokemon number.\nTry again\n");
			}
			clearScreen(2);
			System.out.println("\nYour current team is:");
			printTeam(userTeam);
		}//for
	}
	
	/*
	 * battle turns
	*/
	private static void battle(Pokemon[] userTeam, Pokemon[] cpuTeam, int currentUser, int currentCPU) {
		pokemonList.get(2).setStartingLevel();
		showMoves(userTeam[0]);

		//pick user's action
		Move cpuAttack = cpuPickAttack(cpuTeam[currentCPU]);
		System.out.println("The enemy pokemon " + cpuTeam[currentCPU].getNameShown() + " has " + cpuTeam[currentCPU].getPercentHP() + "% HP.\nIt has " + cpuTeam[currentCPU].getStatus() + " status.");
		//pick cpu's action
		Move userAttack = attack(userTeam[currentUser], 0);
		if(userAttack.getName().equalsIgnoreCase("Switch")) {
			int choice = currentUser;
			while(1 > choice || choice > 6 || choice == currentUser + 1) {
				printTeam(userTeam);
				System.out.println("Which team member would you like to switch to?");
				System.out.println("Pick which pokemon you want to use?(enter the number 1, 2, 3, 4, 5, 6)");
				choice = input.nextInt();
			}
		}
		else if(userAttack.getName().equalsIgnoreCase("Item")) {
			
		}
		else {
			System.out.println("You are doing " + userAttack.getName() + ".");
			System.out.println("Your Opponent is doing " + cpuAttack.getName() + ".");
		}
		damagePhase(userTeam, userAttack, cpuTeam, cpuAttack, currentUser, currentCPU,false, false);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("\n\nthread.sleep(1000)\nPokemonRanga method battle\n\n\n\n\n");
			e.printStackTrace();
		}
		
		/*
		 * see if battle is over
		*/
		if(!checkTeamHealth(userTeam)) {
			System.out.println("You have no pokemon left.\nCPU wins.");
			System.out.println("Game Over.");
		}
		else if(!checkTeamHealth(cpuTeam)) {
			System.out.println("You win!");
		}
		else {/*battle isn't over*/
			
			
			System.out.println("You have " + userTeam[currentUser].getNameShown() +" out.\n CPU has " + cpuTeam[currentCPU].getNameShown() +  "out.\n Your moves are:\n");
			battle(userTeam, cpuTeam, currentUser, currentCPU);
		}
		
	}
	
	/*
	 *  calculate damage done by moves
	 *  calculate damage done by status effects
	 *  calculate who goes first
	 *  think there is more
	 */
	private static void damagePhase(Pokemon[] userTeam, Move userAttack, Pokemon[] cpuTeam, Move cpuAttack, int currentUser, int currentCPU, boolean userSwitched, boolean cpuSwitched) {
		int userDamage = 1;
		int cpuDamage = 1;
		boolean screens[] = new boolean[6];/*reflectUser, reflectCPU, lightScreenUser, lightScreenCPU, auroraVeilUser, auroraVielCPU*/
		if(userSwitched) {
			System.out.println("You switched to " + userTeam[currentUser].getNameShown() + ".");
			userGRUsed = false; // resets Glaive Rush
			//userTeam[currentUser].resetStatus();  // resets non-volatile status effects
			//userTeam[currentUser].resetStats();	 // resets stats
			if(checkIfHit(cpuTeam[currentCPU], userTeam[currentUser], cpuAttack)) {
				
                cpuDamage = damageCalc(cpuTeam[currentCPU], userTeam[currentUser], 1, cpuGRUsed, getRandomDouble(.85), cpuAttack);
				if(cpuDamage > 0) {
					userTeam[currentUser].takeDamage(cpuDamage);
					System.out.println("Your " + userTeam[currentUser].getNameShown() + " took " + cpuDamage + " damage from " + cpuAttack.getName() + ".");
				}
				else{
					System.out.println("no damage\n\n\n");
				}
			}
			else {
				System.out.println("Your " + userTeam[currentUser].getNameShown() + " avoided the attack from " + cpuTeam[currentCPU].getNameShown() + ".");
			}
		}
		else if(cpuSwitched) {
			System.out.println("Enemy switched to " + cpuTeam[currentCPU].getNameShown() + ".");
			cpuGRUsed = false; // resets Glaive Rush
			//cpuTeam[currentCPU].resetStatus();  // resets status effects
			//cpuTeam[currentCPU].resetStats();	 // resets stats
			if(checkIfHit(userTeam[currentUser], cpuTeam[currentCPU], userAttack)) {
				userDamage = damageCalc(userTeam[currentUser], cpuTeam[currentCPU], 1, userGRUsed, getRandomDouble(.85), userAttack);
				if(userDamage > 0) {
					cpuTeam[currentCPU].takeDamage(userDamage);
					System.out.println("Your " + userTeam[currentUser].getNameShown() + " dealt " + userDamage + " damage with " + userAttack.getName() + ".");
					System.out.println("The enemy pokemon " + cpuTeam[currentCPU].getNameShown() + " has " + cpuTeam[currentCPU].getPercentHP() + "% HP.\nIt has " + cpuTeam[currentCPU].getStatus() + " status.");
				}
			}
			else {
				System.out.println("Their " + cpuTeam[currentCPU].getNameShown() + " avoided the attack from " + userTeam[currentUser].getNameShown() + ".");
			}
		}
		else if(userSwitched && cpuSwitched) {
			System.out.println("Both you and the enemy switched Pokemon.");
			userGRUsed = false; // resets Glaive Rush
			cpuGRUsed = false; // resets Glaive Rush
			//userTeam[currentUser].resetStatus();  // resets non-volatile status effects
			//userTeam[currentUser].resetStats();	 // resets stats
			//cpuTeam[currentCPU].resetStatus();  // resets status effects
			//cpuTeam[currentCPU].resetStats();	 // resets stats
		}
		else {
			if(userAttacksFirst(userTeam[currentUser], cpuTeam[currentCPU], userAttack, cpuAttack)){/* user attacks first */
				/* check if user attack hits */
				if(checkIfHit(userTeam[currentUser], cpuTeam[currentCPU], userAttack)) {
					userDamage = damageCalc(userTeam[currentUser], cpuTeam[currentCPU], 1, userGRUsed, getRandomDouble(.85), userAttack);
					if(userDamage > 0) {
						cpuTeam[currentCPU].takeDamage(userDamage);
						System.out.println("Your " + userTeam[currentUser].getNameShown() + " dealt " + userDamage + " damage with " + userAttack.getName() + ".");
						System.out.println("The enemy pokemon " + cpuTeam[currentCPU].getNameShown() + " has " + cpuTeam[currentCPU].getPercentHP() + "% HP.\nIt has " + cpuTeam[currentCPU].getStatus() + " status.");
					}
				}
				else {
					System.out.println("Their " + cpuTeam[currentCPU].getNameShown() + " avoided the attack from " + userTeam[currentUser].getNameShown() + ".");
				}

				/* check if cpu attack hits */
				if(checkIfHit(cpuTeam[currentCPU], userTeam[currentUser], cpuAttack)) {
					
					cpuDamage = damageCalc(cpuTeam[currentCPU], userTeam[currentUser], 1, cpuGRUsed, getRandomDouble(.85), cpuAttack);
					if(cpuDamage > 0) {
						userTeam[currentUser].takeDamage(cpuDamage);
						System.out.println("Their " + cpuTeam[currentCPU].getNameShown() + " took " + cpuDamage + " damage from " + cpuAttack.getName() + ".");
					}
				}
				else {
					System.out.println("Your " + cpuTeam[currentCPU].getNameShown() + " avoided the attack from " + cpuTeam[currentCPU].getNameShown() + ".");
				}
			}
			else{/*	cpu attacks first */
				/* check if cpu attack hits */
				if(checkIfHit(cpuTeam[currentCPU], userTeam[currentUser], cpuAttack)) {
					
					cpuDamage = damageCalc(cpuTeam[currentCPU], userTeam[currentUser], 1, cpuGRUsed, getRandomDouble(.85), cpuAttack);
					if(cpuDamage > 0) {
						userTeam[currentUser].takeDamage(cpuDamage);
						System.out.println("Their " + cpuTeam[currentCPU].getNameShown() + " took " + cpuDamage + " damage from " + cpuAttack.getName() + ".");
					}
				}
				else {
					System.out.println("Your " + cpuTeam[currentCPU].getNameShown() + " avoided the attack from " + cpuTeam[currentCPU].getNameShown() + ".");
				}

				/* check if user attack hits */
				if(checkIfHit(userTeam[currentUser], cpuTeam[currentCPU], userAttack)) {
					userDamage = damageCalc(userTeam[currentUser], cpuTeam[currentCPU], 1, userGRUsed, getRandomDouble(.85), userAttack);
					if(userDamage > 0) {
						cpuTeam[currentCPU].takeDamage(userDamage);
						System.out.println("Your " + userTeam[currentUser].getNameShown() + " dealt " + userDamage + " damage with " + userAttack.getName() + ".");
						System.out.println("The enemy pokemon " + cpuTeam[currentCPU].getNameShown() + " has " + cpuTeam[currentCPU].getPercentHP() + "% HP.\nIt has " + cpuTeam[currentCPU].getStatus() + " status.");
					}
				}
				else {
					System.out.println("Their " + cpuTeam[currentCPU].getNameShown() + " avoided the attack from " + userTeam[currentUser].getNameShown() + ".");
				}
			}
			/*	sets if user and/or cpu used Glaive Rush this turn */
			userGRUsed = userAttack.getName().equalsIgnoreCase("Glaive Rush");
			cpuGRUsed = cpuAttack.getName().equalsIgnoreCase("Glaive Rush");
		}
		/* 
		 * Check for move stopping status effects
		 * Check for which move goes first(done above) 
		 *		If a priority different higher priority goes first 
		 *		If a priority equal check speeds of pokemons
		 * First move happens
		 * 		If move targets the opponent 
		 * 			checkIfHit(Pokemon pokemon, Pokemon pokemon2, Move cpuAttack)  (done above)			
		 * 			If it is a status effect move 
		 * 				Check if it cause the status effect
		 * 			Calculate damage if it does any (done above)
		 * 				Take away health from opponent (done above)
		 * 			If it does recoil
		 * 				Calculate the damage
		 * 					crit?
		 * 					stab?
		 * 					weak to move type
		 * 					move affected by move
		 * 					Take away health from self
		 * 			If buff or debuff stats reduce those stats
		 * 		If move targets self
		 * 			buff self if it is a buff
		 * 			heal if it is a heal
		 * 			put status effect if it self effect(e.g. foresight)
		 * 
		 */
	}
	
	/*
	 * 
	*/
	private static int damageCalc(Pokemon attacker, Pokemon defender, int targets, boolean GR,  double random, Move attack) {
		int level = attacker.getLevel();
		int A = attacker.getAttack();
		int D = defender.getDefense();
		//weather needs to be figured out.  needs a weather variable for the battle.  probably need a object for weather to deal with weird situations
		int glaiveRush = 1;
		double critical = 1;
		double STAB = 1;
		double resist = defender.getResistance(attack);
		double burn = 1;
		double weather = weatherBoost(attacker, defender, attack.getType());
		int damage = 1;
		int other = getOther(attack.getName() , defender);
		double Zmove = getZmove(attack.getName());
		/*
		 *	checks if attack can't effect the defender
		 *	returns zero and says a message  
		 */
		if(resist == 0){
			System.out.println("That move can't effect " + defender.getNameShown() + ".");
			return 0;
		}
		if(weather == 0) {
			System.out.println("The weather protects " + defender.getNameShown() + " from an attack like" + attack.getName() + ".");
			return 0;
		}
		/*checks if glaive rush was used in the turn before*/
		if(GR) {
			glaiveRush = 2;
		}
		/*checks if move is a critical hit*/
		if(isCrit(attacker, attack)) {
			critical = 1.5;
		}
		/*checks if move is stab*/
		if(attacker.checkTypes(attack.getType())) {
			STAB = 1.5;
		}
		/*
		 * checks if attacker is burned and increase damage by .5 accordingly
		*/
		if(!attack.getSpecial()  && attacker.isBurned()) {
			burn = .5;
		}		
		
		damage = (int)(((	(2.0 * level)/5 + 2	) * attack.getPower() * (A/D)	) / 50);
		damage += 2;
		damage *= targets * 1/*PB*/ * weather * glaiveRush * critical * random * STAB *  resist * other * Zmove;
		System.out.println("Damage from " + attacker.getNameShown() + " = " + damage);

		return Math.max(1, damage);
	}
	
	
	/*
	 * didn't feel like dealing with Zmove right now but this needs to be worked on 
	 * .25 if Z-move or max move and target would be protected
	 * otherwise 1
	*/
	private static double getZmove(String attack) {
		
		
		return 1;
	}
	
	/*
	 * determines what happens with other in the damage calculation 
	*/
	private static int getOther(String attack, Pokemon defender) {
		if(defender.getDynamaxed()) {
			if(attack.equalsIgnoreCase("Behemoth Blade") ||	
					attack.equalsIgnoreCase("Behemoth Bash") ||	attack.equalsIgnoreCase("Dynamax Cannon")) {
				return 2;
			}
		}
		if(defender.getMinimized()) {
			if(attack.equalsIgnoreCase("Body Slam") || attack.equalsIgnoreCase("Stomp") || 
					attack.equalsIgnoreCase("Dragon Rush") || attack.equalsIgnoreCase("Heat Crash") || 
					attack.equalsIgnoreCase("Heavy Slam") || attack.equalsIgnoreCase("Flying Press") || 
					attack.equalsIgnoreCase("Supercell Slam")) {
				return 2;
			}
		}
		if(defender.getDigging()) {
			if(attack.equalsIgnoreCase("Earthquake") || attack.equalsIgnoreCase("Magnitude")) {
				return 2;
			}
		}
		if(defender.getDiving()) {
			if(attack.equalsIgnoreCase("Surf") || attack.equalsIgnoreCase("Whirlpool")) {
				return 2;
			}
		}
		/*
		 * More other conditions need to be added *******************************************************************************************
		 */
		
		return 1;
	}
	
	/*
	 * 1.5 if water type move during rain
	 * 1.5 if fire type move during harsh sunlight
	 * .5 if water type move during harsh sunlight
	 * .5 if fire type move during rain
	 * 1 If attacker has cloud nine
	 * 1 if attacker has air lock
	*/
	private static double weatherBoost(Pokemon attacker, Pokemon defender, String type) {
		
		/*Cloud Nine negates buffs from weather*/
		if(		attacker.getAbility().getName().equalsIgnoreCase("Cloud Nine") ||
				defender.getAbility().getName().equalsIgnoreCase("Cloud Nine") ||
				attacker.getAbility().getName().equalsIgnoreCase("Air Lock") ||
				defender.getAbility().getName().equalsIgnoreCase("Air Lock")	)
			return 1; 
		/*reduces damage if it is snowing and move used on an Ice type*/
		else if(weather.getWeatherEffect() == 3 && defender.checkTypes("Ice"))
			return .5;
		/*Increases attack of fire move during harsh sunlight*/
		else if(weather.getWeatherName().contains("light") && type.equalsIgnoreCase("Fire") ) {
			return 1.5;
		}
		/*Decreases attack of water moves during extremely harsh sunlight*/
		else if(weather.getWeatherName().contains("xtremely") && type.equalsIgnoreCase("Water") ) {
			return 0;
		}
		/*Increases attack of water moves during rain*/
		else if(weather.getWeatherName().contains("ain") && type.equalsIgnoreCase("Water") ) {
			return 1.5;
		}
		/*Decreases attack of fire move during Heavy rain*/
		else if(weather.getWeatherName().contains("eavy") && type.equalsIgnoreCase("Fire") ) {
			return 0;
		}
		return 1;
	}
	/*
	 * returns a random number  between d and 1
	*/
	private static double getRandomDouble(double d) {
		double num = rand.nextDouble();
		if(num < d)
			return getRandomDouble(d);
		return num;
	}
	
	/*
	 *	 
	*/
	private static boolean isCrit(Pokemon attacker, Move attack) {
		double threshold = 1.0 * (attacker.getSpeed() + 76.0)/4;
		if(attacker.getFocusEnergy()) {
			threshold *= 2;
			if(attack.getCritHeighting())
				threshold *= 4;
		}
		return false;
	}
	
	/********************************************************************************************************************************	checkIfHit	
	 *	Pokemon attacer is attacking defender with Move attack
	 * 	need to use the evasion stat of defender
	 * 	need to also check accuracy debuffs/buffs of attacker
	 * 
	*/
	private static boolean checkIfHit(Pokemon attacker, Pokemon defender, Move attack) {
		/*
		 *	Check if move will hit
		 * 	accuracy modifiers
		 * 	opponents evasion modifier
		*/
		return true;
	}
	/********************************************************************************************************************************	checkIfHit	*/
	
	/*
	 * returns true if any pokemon on a team have at least 1 HP
	*/ 
	private static boolean checkTeamHealth(Pokemon[] Team) {
		for(Pokemon p: Team) {
			if(p.getCurHP() != 0)
				return true;
		}
		return false;
	}
	/*
	 * pick an attack
	*/
	private static Move attack(Pokemon pokemon, int times) {
		times++;
		System.out.println("Enter 5 to switch pokemon");
		System.out.println("Enter 6 to use an item");
		System.out.println("Your pokemon, " + pokemon.getNameShown() + ", has " + pokemon.getCurHP() + " HP out of " + pokemon.getMaxHP() + " HP.\nIt has " + pokemon.getStatus() + " status.");
		System.out.println("Your pokemon's stats are:\nAttack: " + pokemon.getAttack() + "\nDefense: " + pokemon.getDefense() + "\nSpecial Attack: " + pokemon.getSpAttack() + "\nSpecial Defense: " + pokemon.getSpDefense() + "\nSpeed: " + pokemon.getSpeed());
		System.out.println("\nPick which move you want to use?(enter the number 1, 2, 3, 4, 5, 6)");
		int choice = input.nextInt();
		input.nextLine(); // clear the buffer
		if(choice >= 1 && choice <= 4) {
			System.out.println("You are doing " + pokemon.getMove(choice-1).getName() + ".");
			return pokemon.getMove(choice-1);
		}
		else if(choice == 5) {
			
			return allMoves.get(allMoves.size() - 2);
			
		}
		else if(choice == 6) {
			return allMoves.get(allMoves.size() - 1); 
		}
		else{
			System.out.println("You entered a wrong input. You can only enter 1, 2, 3, 4, 5, or 6.");
			showMoves(pokemon);
			if(times > 3) {
				Move dumbUser = pokemon.getRandomMove();
				System.out.println("Because you can't figure this out I chose a move for you. You are doing " + dumbUser.getName() + ".");
				return dumbUser;
			}
			return attack(pokemon, times);
		}
		
	}
	
	/*
	 * prints out moves for a pokemon
	*/
	private static void showMoves(Pokemon pokemon) {
		for(int i = 0; i < 4; i++) {
			
			if(pokemon.getMove(i) == null)
				break;
			int move = i +1;
			System.out.println(move + ")" + pokemon.getMove(i).getName() + "\nType:" + pokemon.getMove(i).getType() + "\nPower:" + pokemon.getMove(i).getPower() + "\nAccuracy" + pokemon.getMove(i).getAcc() + "\n");
		} 
		
	}
	
	/*
	 *get the computer player to pick an attack
	 *need to make it smarter********************************************************************************************************** 
	*/
	private static Move cpuPickAttack(Pokemon p) {
		Move temp = p.getRandomMove();
		if(temp.getName().equalsIgnoreCase("empty"))
			return cpuPickAttack(p);
		return temp;
	}
	/*
	 * picks a computer player
	 * random right now
	*/
	private static void cpuPickTeam(Pokemon[] cpuTeam, ArrayList<Pokemon> pokemonList) {
		Random rand = new Random();
		for(int i = 0; i < cpuTeam.length; i++) {
			cpuTeam[i] = pokemonList.get(rand.nextInt(pokemonList.size()));
			cpuTeam[i].levelTo(50);
		}
		System.out.println("\n\ncpu picked a team");
		printTeam(cpuTeam);
	}
	
	/*
	 * prints a pokemon team
	*/
	public static void printTeam(Pokemon team[]) {
		int i = 1;
		for(Pokemon p: team) {
			if(p != null) {
				System.out.println(i + ")\t" +p.getName());
				i++;
			}
		}
	}
	
	/*
	 * prints a number of lines
	*/
	public static void clearScreen(int lines) {
		for(int i = 0; i < lines; i++) {
			System.out.println("\n");
		}
	}

	/*
	 * returns true if user attacks first
	 * returns false if cpu attacks first
	 */
	public static boolean userAttacksFirst(Pokemon user, Pokemon cpu, Move userAttack, Move cpuAttack) {
		if(userAttack.getPriority() > cpuAttack.getPriority()) {
			return true;
		}
		else if(userAttack.getPriority() < cpuAttack.getPriority()) {
			return false;
		}
		else if(user.getSpeed() > cpu.getSpeed()) {
			return true;
		}
		else if(user.getSpeed() < cpu.getSpeed()) {
			return false;
		}
		else {
			return rand.nextBoolean();
		}
		
	}
	
}
