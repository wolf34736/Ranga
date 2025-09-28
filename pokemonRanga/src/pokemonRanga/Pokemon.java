package pokemonRanga;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
/*number,name,type 1,type 2,expYield,weight,height,expGroup,evHp,evAtck,evDef,evSpat,evSpdf,evSpeed,evolves,evoLvl,evolveMethod1,evolveMethod2,evolveMethod3,evolveMethod4,evolveMethod5,evolveMethod6,evolveMethod7,evolveMethod8,evolveMethod9,evolveMethod10,evolveMethod11,evolveMethod12,evolveName1,evolveName2,evolveName3,evolveName4,evolveName5,evolveName6,evolveName7,evolveName8,evolveName9,evolveName10,evolveName11,evolveName12,ability 1,ability 2,ability 3,egg group 1,egg group 2,Hatch Time,Gender ratio Male,Gender ratio Female,Catch Rate,Base friendship,maxHp,atck,def,spat,spdf,speed,move1,move2,move3,move4,Egg with Ditto Produced 1,Egg with Ditto Produced 2,Egg with Ditto Produced 3,Egg with Ditto Produced 4,Held Item,Pokedex Classifications,Pokedex Entry,Mega Evo,Gigantamax,Alternate Form 1,Alternate Form 1 Cause,Alternate Form 1 type 1,Alternate Form 1 type 2,Alternate Form 2,Alternate Form 2 Cause,Alternate Form 2 type 1,Alternate Form 2 type 2,Alternate Form 3,Alternate Form 3 Cause,Alternate Form 3 type 1,Alternate Form 3 type 2,Alternate Form 4,Alternate Form 4 Cause,Alternate Form 4 type 1,Alternate Form 4 type 2,TImes Used evo */

public class Pokemon {
	/*	Volatile Status Effects	*/
	private int numberOfStatusEffectsVolatile = 6;
	private boolean hasStatusEffectVolatile[] = new boolean[numberOfStatusEffectsVolatile];
	private StatusEffect statusEffectsVolatile[] = new StatusEffect[numberOfStatusEffectsVolatile];
	
	/*	Non Volatile Status Effects	*/
	private int numberOfStatusEffectsNonVolatile = 43;
	private boolean hasStatusEffectNonVolatile[] = new boolean[numberOfStatusEffectsNonVolatile];
	private StatusEffect statusEffectsNonVolatile[] = new StatusEffect[numberOfStatusEffectsNonVolatile];
	
	/*	letters and numbers for checking and picking both	*/
	private static String alphabet[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	private static String numbers[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	
	// Immunities: Attack Type -> Set of Defender Types immune to this attack
    private static final Map<String, Set<String>> IMMUNITIES = Map.of(
        "Ghost", Set.of("Normal"),
        "Ground", Set.of("Flying"),
        "Electric", Set.of("Ground"),
        "Normal", Set.of("Ghost"),
        "Fighting", Set.of("Ghost"),
        "Poison", Set.of("Steel"),
        "Psychic", Set.of("Dark")
    );

    // Weaknesses: Attack Type -> Set of Defender Types weak to this attack (2x damage)
    private static final Map<String, Set<String>> WEAKNESSES = Map.ofEntries(
        Map.entry("Normal", Set.of("Fighting")),
        Map.entry("Fighting", Set.of("Flying", "Psychic", "Fairy")),
        Map.entry("Flying", Set.of("Rock", "Electric", "Ice")),
        Map.entry("Poison", Set.of("Ground", "Psychic")),
        Map.entry("Ground", Set.of("Water", "Grass")),
        Map.entry("Rock", Set.of("Fighting", "Ground", "Steel", "Water", "Grass")),
        Map.entry("Bug", Set.of("Flying", "Rock", "Fire")),
        Map.entry("Ghost", Set.of("Ghost", "Dark")),
        Map.entry("Steel", Set.of("Fighting", "Ground", "Fire")),
        Map.entry("Fire", Set.of("Ground", "Rock", "Water")),
        Map.entry("Water", Set.of("Grass", "Electric")),
        Map.entry("Grass", Set.of("Flying", "Poison", "Bug", "Fire", "Ice")),
        Map.entry("Electric", Set.of("Ground")),
        Map.entry("Psychic", Set.of("Bug", "Ghost", "Dark")),
        Map.entry("Ice", Set.of("Fighting", "Rock", "Steel", "Fire")),
        Map.entry("Dragon", Set.of("Ice", "Dragon", "Fairy")),
        Map.entry("Dark", Set.of("Fighting", "Bug", "Fairy")),
        Map.entry("Fairy", Set.of("Poison", "Steel")),
        Map.entry("Stellar", Set.of("Terastallize")), // Your custom type example
        Map.entry("???", Set.of())  // Unknown type, no weaknesses
    );

    // Resistances: Attack Type -> Set of Defender Types resistant to this attack (0.5x damage)
    private static final Map<String, Set<String>> RESISTANCES = Map.ofEntries(
        Map.entry("Normal", Set.of()), // no resistances
        Map.entry("Fighting", Set.of("Rock", "Bug", "Dark")),
        Map.entry("Flying", Set.of("Fighting", "Bug", "Grass")),
        Map.entry("Poison", Set.of("Fighting", "Poison", "Bug", "Grass", "Fairy")),
        Map.entry("Ground", Set.of("Poison", "Rock")),
        Map.entry("Rock", Set.of("Normal", "Flying", "Poison", "Fire")),
        Map.entry("Bug", Set.of("Fighting", "Ground", "Grass")),
        Map.entry("Ghost", Set.of("Poison", "Bug")),
        Map.entry("Steel", Set.of("Normal", "Flying", "Rock", "Bug", "Steel", "Grass", "Psychic", "Ice", "Dragon", "Fairy")),
        Map.entry("Fire", Set.of("Bug", "Steel", "Fire", "Grass", "Ice", "Fairy")),
        Map.entry("Water", Set.of("Steel", "Fire", "Water", "Ice")),
        Map.entry("Grass", Set.of("Ground", "Water", "Grass", "Electric")),
        Map.entry("Electric", Set.of("Flying", "Steel", "Electric")),
        Map.entry("Psychic", Set.of("Fighting", "Psychic")),
        Map.entry("Ice", Set.of("Ice")),
        Map.entry("Dragon", Set.of("Fire", "Water", "Grass", "Electric")),
        Map.entry("Dark", Set.of("Ghost", "Dark")),
        Map.entry("Fairy", Set.of("Fighting", "Bug", "Dark")),
        Map.entry("Stellar", Set.of()), // Custom type no resistances
        Map.entry("???", Set.of())       // Unknown type no resistances
    );
	
	
	/*	basic information	*/
	String name, nameShown, type1, type2;
	int expYield, number;
	double weight, height;
	String expGroup;
	String pokedexEntry, pokedexClass;
	boolean megaEvo, gigantamax;
	String heldItems[] = new String[4];
	
	/*	evs	*/
	int evHp, evDef, evAtck, evSpat, evSpdf, evSpeed;
	
	/*	evolution information	*/
	boolean evolves;
	int evoLvl;
	String evolveMethods[] = new String[12];
	String evolveNames[] = new String[12];
	int timesEvoMove;
	String evoMoveName;
	Move evoMove;
	Personality personalityValue = new Personality();
	
	/*	abilities	*/
	String abilityOptions[] = new String[3];
	
	/*	breeding information	*/
	String eggGroups[] = new String[2];
	int hatchTime;
	double genderRatios[] = new double[2];
	String eggWDitto[] = new String[4];
	
	/*	base stats	*/
	int baseHP, baseAtck, baseDef, baseSpat, baseSpdf, baseSpeed;
	int catchRate, baseFriendship;
	
	/*	moves	*/
	Move moves[] = new Move[4];
	String moveList[] = new String[4];
	
	/*	 current stats	 */
	int currentHP;
	int maxHP, atck, def, spat, spdf, speed;
	Ability ability;
	int friendship;
	Nature nature;
	String gender;
	String itemHeld;
	int level;
	boolean dynamaxed, minimized, digging, diving, focusEnergy;
	int stages[] = {0, 0, 0, 0, 0, 0, 0, 0};/*attack, defense, sp attack, sp defense, speed, evasion, accuracy, crit*/
	
	/*	alternate forms	*/
	String unownLetter;
	String alternateFormNames[] = new String[4];
	String alternateFormCauses[] = new String[4];
	String alternateFormType1[] = new String[4];
	String alternateFormType2[] = new String[4];
	
	/*
	 * gets string containing all base information about the pokemon
	 * get all the moves so the moves can be assigned to the pokemon move slots and evolution moves
	 */
	public Pokemon(String pString, ArrayList<Move> allMoves) {
		for(int i = 0; i < numberOfStatusEffectsVolatile; i++)
			hasStatusEffectVolatile[i] = false;
		for(int i = 0; i < numberOfStatusEffectsNonVolatile; i++)
			hasStatusEffectNonVolatile[i] = false;
		setupStatusEffects();
		
		Random rand = new Random();
		int i;
		String temp;
		 
		//index shows where the next "," exists			
		int index = pString.indexOf(",");
		
		//get number
		number = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");

		//get name
		name = pString.substring(0, index);
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");

		//get type1
		type1 = pString.substring(0, index);
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");

		//get type2
		type2 = pString.substring(0, index);
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get experince yield when defeated
		expYield = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get weight
		weight = Double.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get height
		height = Double.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");

		//get experience group
		expGroup = pString.substring(0, index);
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get evHp
		evHp = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");

		//get evAtck
		evAtck = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");

		//get evDef
		evDef = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");

		//get evSpat
		evSpat = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");

		//get evSpdf
		evSpdf = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");

		//get evSpeed
		evSpeed = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get evolves
		evolves = (pString.substring(0, index)).equalsIgnoreCase("TRUE");
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get evoLvl
		evoLvl = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
				
		//get all 12 evolution methods 
		for(i = 0; i < evolveMethods.length; i++) {
			evolveMethods[i] = pString.substring(0, index);
			pString = pString.substring(index + 1);
			index = pString.indexOf(",");
		}
		
		//get all 12 evolution Names
		for(i = 0; i < evolveNames.length; i++) {
			evolveNames[i] = pString.substring(0, index);
			pString = pString.substring(index + 1);
			index = pString.indexOf(",");
		}
		
		//get all 3 abilities
		for(i = 0; i < abilityOptions.length; i++) {
			abilityOptions[i] = pString.substring(0, index);
			pString = pString.substring(index + 1);
			index = pString.indexOf(",");
		}
		
		//get both egg groups
		for(i = 0; i < eggGroups.length; i++) {
			eggGroups[i] = pString.substring(0, index);
			pString = pString.substring(index + 1);
			index = pString.indexOf(",");
		}
		
		//get Hatch Time
		hatchTime = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get all Gender ratios	
		for(i = 0; i < genderRatios.length; i++) {
			genderRatios[i] = Double.valueOf(pString.substring(0, index));
			pString = pString.substring(index + 1);
			index = pString.indexOf(",");
		}
		
		//get catchRate
		catchRate = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get base friendship lvl(usually 50)
		baseFriendship= Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get base maxHp stat
		baseHP = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		maxHP = baseHP;
		//get base attack stat
		baseAtck = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		atck = baseAtck;
		
		//get base defense stat 
		baseDef = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		def = baseDef;

		//get base special attack stat
		baseSpat = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		spat = baseSpat;

		//get base special defense stat
		baseSpdf = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		spdf = baseSpdf;

		//get base speed stat
		baseSpeed = Integer.valueOf(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		speed = baseSpeed;
		
		//get all for base moves(decided by me)
		for(i = 0; i < moveList.length; i++) {
			moveList[i] = pString.substring(0, index);
			pString = pString.substring(index + 1);
			index = pString.indexOf(",");
			if(moveList[i].equalsIgnoreCase("none")) {
				moves[i] = new Move();
				continue;
			}
			for(Move m: allMoves) {
				if(moveList[i].equalsIgnoreCase(m.getName())) {
					moves[i] = m;
					break;
				}
			}
			if(moves[i] == null) {//if move doesn't exist in list gives a random move
				moves[i] = allMoves.get(rand.nextInt(allMoves.size()));
			}
		}
		
		//get which Eggs are produced with Ditto(max 4) 	
		for(i = 0; i < eggWDitto.length; i++) {
			eggWDitto[i] = pString.substring(0, index);
			pString = pString.substring(index + 1);
			index = pString.indexOf(",");
		}
		
		//get default held item
		itemHeld = pString.substring(0, index);
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get Pokedex classification
		pokedexClass = pString.substring(0, index);
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get Pokedex entry
		temp = pString.substring(0, index);
		pokedexEntry ="";
		for(i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == '#') {
				pokedexEntry += ",";
			}
			else {
				pokedexEntry += temp.charAt(i) + "";
			}
		}
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		

		//get if the pokemon has Mega Evolution 
		megaEvo = pString.substring(0, index).equalsIgnoreCase("TRUE");
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get if the pokemon has/is Gigantamax
		gigantamax = pString.substring(0, index).equalsIgnoreCase("TRUE");
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//get all alternate form information(name, cause, type1, type2)
		for(i = 0; i < alternateFormNames.length; i++) {
			//alternate form names
			alternateFormNames[i] = pString.substring(0, index);
			pString = pString.substring(index + 1);
			index = pString.indexOf(",");
			
			//alternate form causes
			alternateFormCauses[i] = pString.substring(0, index);
			pString = pString.substring(index + 1);
			index = pString.indexOf(",");
			
			//alternate form type1
			alternateFormType1[i] = pString.substring(0, index);
			pString = pString.substring(index + 1);
			index = pString.indexOf(",");

			//alternate form type2
			alternateFormType2[i] = pString.substring(0, index);
			pString = pString.substring(index + 1);
			index = pString.indexOf(",");
		}
		
		//times an move has to be used to evolve
		timesEvoMove = Integer.parseInt(pString.substring(0, index));
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		
		//move that has to be used to evolve
		evoMoveName = pString.substring(0, index);
		pString = pString.substring(index + 1);
		index = pString.indexOf(",");
		for(Move m: allMoves) {
			if(evoMoveName.equalsIgnoreCase(m.getName())) {
				evoMove = m;
				break;
			}
		}
		if(evoMove == null)
			evoMove = getRandomMove();
		
		//Held item .1%	Held item 5%	Held item 50%	Held item 100%
		for(i = 0; i < heldItems.length; i++) {
			heldItems[i] = pString.substring(0, index);
			pString = pString.substring(index + 1);
			index = pString.indexOf(",");
		}
		nameShown = pString.substring(0, index);
		//pString = pString.substring(index + 1);

		//decide which is their current ability
		int numAbilities = 1;
		for(String s: abilityOptions) {
			if(s.equalsIgnoreCase("none"))
				numAbilities++;
		}
		ability = new Ability(abilityOptions[rand.nextInt(0, numAbilities)]);
		
		
		//decide which is their current nature out of the 24
		nature = new Nature(rand.nextInt(0, 24));
		
		//get gender
		if(genderRatios[0] < 0 && genderRatios[1] < 0) {//if gender unknown usually legendaries
			gender = "Gender Unknown";
		}
		else if(genderRatios[0] > genderRatios[1]) {//if male more likely
			if(rand.nextDouble(0, 100) < genderRatios[0]) {
				gender = "Male";
			}
			else {
				gender = "Female";
			}
		}
		else if(genderRatios[0] > genderRatios[1]) {//if female more likely
			if(rand.nextDouble(0, 100) < genderRatios[1]) {
				gender = "Female";
			}
			else {
				gender = "Male";
			}
		}
		
		//unown letter
		if(name.equalsIgnoreCase("unown")) {
			int unown = rand.nextInt(0, 27);
			if(unown < 26)
				unownLetter = alphabet[unown];
			else if(unown == 27)
				unownLetter = "?";
			else
				unownLetter = "!";
		}
		else {
			unownLetter = "none";
		}
		
		//set current hp
		currentHP = maxHP;
		
		level = 0;
		levelUp();
		dynamaxed = false;
		minimized = false;
		digging = false;
		diving = false;
		
	}
	
	
	public Pokemon(Pokemon p){
		for(int i = 0; i < numberOfStatusEffectsVolatile; i++)
			hasStatusEffectVolatile[i] = false;
		for(int i = 0; i < numberOfStatusEffectsNonVolatile; i++)
			hasStatusEffectNonVolatile[i] = false;
		setupStatusEffects();
		Random rand = new Random();
		int i;

		number = p.number;
		name = p.name;
		type1 = p.type1;
		type2 = p.type2;
		expYield = p.expYield;
		weight = p.weight;
		height = p.height;
		expGroup = p.expGroup;
		evHp = p.evHp;
		evDef = p.evDef;
		evSpat = p.evSpat;
		evSpeed = p.evSpeed;
		evolves = p.evolves;
		evoLvl = p.evoLvl;
		for(i = 0; i< evolveMethods.length; i++){
			evolveMethods[i] = p.evolveMethods[i];
		}
		for(i = 0; i< evolveNames.length; i++){
			evolveNames[i] = p.evolveNames[i];
		}
		for(i = 0; i < abilityOptions.length; i++) {
			abilityOptions[i] = p.abilityOptions[i];
		}
		for(i = 0; i < eggGroups.length; i++) {
			eggGroups[i] = p.eggGroups[i];
		}
		hatchTime = hatchTime;
		for(i = 0; i < genderRatios.length; i++) {
			genderRatios[i] = p.genderRatios[i];
		}
		catchRate = p.catchRate;
		baseFriendship = p.baseFriendship;
		baseHP = p.baseHP;
		maxHP = baseHP;
		baseAtck = p.baseAtck;
		atck = baseAtck;
		baseDef = p.baseDef;
		def = baseDef;
		baseSpat = p.baseSpat;
		spat = baseSpat;
		baseSpdf = p.baseSpdf;
		spdf = baseSpdf;
		baseSpeed = p.baseSpeed;
		speed = baseSpeed;
		for(i = 0; i < moveList.length; i++){
			moveList[i] = p.moveList[i];
		}
		for(i = 0; i < eggWDitto.length; i++) {
			eggWDitto[i] = p.eggWDitto[i];
		}
		itemHeld = p.itemHeld;
		pokedexClass = p.pokedexClass;
		pokedexEntry = p.pokedexEntry;
		megaEvo = p.megaEvo;
		gigantamax = p.gigantamax;
		for(i = 0; i < alternateFormNames.length; i++) {
			//alternate form names
			alternateFormNames[i] = p.alternateFormNames[i];
			//alternate form causes
			alternateFormCauses[i] = p.alternateFormCauses[i];
			//alternate form type1
			alternateFormType1[i] = p.alternateFormType1[i];
			//alternate form type2
			alternateFormType2[i] = p.alternateFormType2[i];
		}
		timesEvoMove = p.timesEvoMove;
		evoMoveName = p.evoMoveName;
		for(i = 0; i < heldItems.length; i++) {
			heldItems[i] = p.heldItems[i];
		}
		nameShown = p.nameShown;
		int numAbilities = 1;
		for(String s: abilityOptions) {
			if(s.equalsIgnoreCase("none"))
				numAbilities++;
		}
		ability = new Ability(abilityOptions[rand.nextInt(0, numAbilities)]);
		nature = new Nature(rand.nextInt(0, 24));
		if(genderRatios[0] < 0 && genderRatios[1] < 0) {//if gender unknown usually legendaries
			gender = "Gender Unknown";
		}
		else if(genderRatios[0] > genderRatios[1]) {//if male more likely
			if(rand.nextDouble(0, 100) < genderRatios[0]) {
				gender = "Male";
			}
			else {
				gender = "Female";
			}
		}
		else if(genderRatios[0] > genderRatios[1]) {//if female more likely
			if(rand.nextDouble(0, 100) < genderRatios[1]) {
				gender = "Female";
			}
			else {
				gender = "Male";
			}
		}
		if(name.equalsIgnoreCase("unown")) {
			int unown = rand.nextInt(0, 27);
			if(unown < 26)
				unownLetter = alphabet[unown];
			else if(unown == 27)
				unownLetter = "?";
			else
				unownLetter = "!";
		}
		else {
			unownLetter = "none";
		}
		currentHP = maxHP;
		level = 0;
		levelUp();
		dynamaxed = false;
		minimized = false;
		digging = false;
		diving = false;
	}
	//set starting level temporary fix ************************************************************************************
	/*public int setStartingLevel() {
		int lvl;
		if(number > 1) {
			if(PokemonRanga.pokemonList.get(number-2).getEvoLvl() != -1) {
				return PokemonRanga.pokemonList.get(number-2).getEvoLvl();
			}
			else 
				return 1;
		}
		return 1;
	}*/
	/*
	 * increase level by one
	 * increase stats accordingly
	 */
	public void levelUp(){
		// equation with IV's and EV's
		//Stat = ((basestat * 2 + IV + (EV / 4)) * level / 100) + level + 10;
		String decr = nature.getDecrStat();
		String incr = nature.getIncrStat();
		level++;
		double lvl = level;
		// Max HP
		maxHP = (int) (((baseHP * 2 + 94) * lvl / 100 ) + level + 10);
		
		//Attack 
		atck = (int) (((baseAtck * 2 + 94) * lvl / 100 ) + level + 10);
		if(decr.equalsIgnoreCase("Attack")){
			atck = (int)(atck * .9);
		}
		else if(incr.equalsIgnoreCase("Attack")){
			atck = (int)(atck * 1.1);
		}

		//Defense
		def = (int) (((baseDef * 2 + 94) * lvl / 100 ) + level + 10);
		if(decr.equalsIgnoreCase("Defense")){
			def = (int)(atck * .9);
		}
		else if(incr.equalsIgnoreCase("Defense")){
			def = (int)(atck * 1.1);
		}
		//Special Attack
		spat = (int) (((baseSpat * 2 + 94) * lvl / 100 ) + level + 10);
		if(decr.equalsIgnoreCase("Special Attack")){
			spat = (int)(atck * .9);
		}
		else if(incr.equalsIgnoreCase("Special Attack")){
			spat = (int)(atck * 1.1);
		}

		//Special Defense
		spdf = (int) (((baseSpdf * 2 + 94) * lvl / 100 ) + level + 10);
		if(decr.equalsIgnoreCase("Special Defense")){
			spdf = (int)(atck * .9);
		}
		else if(incr.equalsIgnoreCase("Special Defense")){
			spdf = (int)(atck * 1.1);
		}

		//Speed
		speed = (int) (((baseSpeed * 2 + 94) * lvl / 100 ) + level + 10);
		if(decr.equalsIgnoreCase("Speed")){
			speed = (int)(atck * .9);
		}
		else if(incr.equalsIgnoreCase("Speed")){
			speed = (int)(atck * 1.1);
		}

	}

	public void levelTo(int num){
		// equation with IV's and EV's
		//Stat = ((basestat * 2 + IV + (EV / 4)) * level / 100) + level + 10;
		while(level < num){
			levelUp();
		}
	}

	/*
	 * status effect arrays are set to each status effect
	 * status effect arrays will be used to inform how the pokemon will be affected 
	 */
	private void setupStatusEffects() {
		statusEffectsVolatile[0] = new Burn();
		statusEffectsNonVolatile[0] = new Substitue();
	}
	
	/*
	 * getters/accessors
	 */
	public String getName() {		return nameShown + "  |  " + name;	}
	public String getNameShown() {	return nameShown;	}
	public Move getMove(int i) {		return moves[i];	}
	public int getCurHP() {			return currentHP;	}
	public int getMaxHP() {		return maxHP;		}
	public int getNumber() {		return number;		}	
	public int getLevel() {		return level;		}
	public int getEvoLvl()	{	return evoLvl;		}
	public int getAttack()	{	return atck;		}
	public int getDefense()	{	return def;			}
	public int getSpAttack()	{	return spat;		}
	public int getSpDefense()	{	return spdf;		}
	public int getSpeed()	{	return speed;		}
	public String getPokedexEntry()	{	return pokedexEntry;	}
	public String getPokedexClass()	{	return pokedexClass;	}
	public String getType1()	{	return type1;	}
	public String getType2()	{	return type2;	}
	public Ability getAbility()	{	return ability;	}
	public boolean getDynamaxed()	{	return dynamaxed;	}
	public boolean getMinimized()	{	return minimized;	}
	public boolean getDigging()		{	return digging;		}
	public boolean getDiving()		{	return diving;		}
	public void dynamax()	{	dynamaxed = true;		}
	public void minimize()	{	minimized = true;		}
	public void dig()	{	digging = true;		}
	public void dive()	{	diving = true;	}
	public boolean getFocusEnergy()	{	return focusEnergy;		}
	public int getAttackStage()	{	return stages[0];	}
	public int getDefenseStage()	{	return stages[1];	}
	public int getSpecialAttackStage()	{	return stages[2];	}
	public int getSpecialDefenseStages()	{	return stages[3];	}
	public int getSpeedStages()	{	return stages[4];	}
	public int getEvasionStages()	{	return stages[5];	}
	public int getAccuracyStages()	{	return stages[6];	}
	public int getCritStages()	{	return stages[7];	}
	public String getGender()	{	return gender;	}
	public String getItemHeld()	{	return itemHeld;	}	
	/*
	 * end of getters/accessors
	 */
	
	/*
	 * returns a random move from the move list
	 * useful when I haven't gotten the information for a move
	 * useful when 
	 */
	public Move getRandomMove() {
		Random rand = new Random();
		Move temp = moves[rand.nextInt(moves.length)];
		if(temp.getName().equalsIgnoreCase("empty"))
			return getRandomMove();
		return temp;
	}
	
	/*
	 *	returns resistance modifier based on an attack being aimed at the pokemon
	 * 	need to test*****************************************************************************
	*/
	public double getResistance(Move attack) {
		return 1 * getMultiplier(attack.getType(), type1) * getMultiplier(attack.getType(), type2);
	}
	
	/*
	 * checking resistance multiplier for one defending type
	*/
	public static double getMultiplier(String attackType, String defenderType) { 
        if (IMMUNITIES.getOrDefault(attackType, Set.of()).contains(defenderType)) {
            return 0; // immune
        }
        if (WEAKNESSES.getOrDefault(attackType, Set.of()).contains(defenderType)) {
            return 2; // super effective
        }
        if (RESISTANCES.getOrDefault(attackType, Set.of()).contains(defenderType)) {
            return 0.5; // not very effective
        }
        return 1; // neutral damage
    }
	
	/*
	 *	returns true if the pokemon is burned and  
	*/
	public boolean isBurned() {
		if(this.hasStatusEffectNonVolatile[0]  && !this.ability.getName().equalsIgnoreCase("Guts")) {
			return true;
		}
		return false;
	}

	/*
	 * returns the status effect of the pokemon
	 */
	public String getStatus(){
		return "Status Effect";
	}
	
	/*
	 *	checks if the type passed is one of the pokemon's types 
	*/
	public boolean checkTypes(String type) {
		if(type.equalsIgnoreCase(type1) || type.equalsIgnoreCase(type2))
			return true;
		return false;
	}

	/* changes the current HP of the pokemon
	 * if the damage is greater than the current HP, it sets current HP to 0
	*/
	public void takeDamage(int damage) {
		if(currentHP - damage < 0)
			currentHP = 0;
		else
			currentHP -= damage;
	}
	/*
	 * returns the current HP of the pokemon as a percentage of the max HP
	 * if current HP is 0, returns 0
	*/
	public int getPercentHP(){
		if(currentHP <= 0)
			return 0;
		return (int) ((double) currentHP / (double) maxHP * 100);
	}

	
	/*
	 * modify stages of stats 
	*/
	public void changeAttackStage(int num) {
		stages[0] += num;
	}
	public void changeDefenseStage(int num) {
		stages[1] += num;
	}
	public void changeSpecialAttackStage(int num) {
		stages[2] += num;
	}
	public void changeSpecialDefenseStage(int num) {
		stages[3] += num;
	}
	public void changeSpeedStage(int num) {
		stages[4] += num;
	}
	public void changeEvasionStage(int num) {
		stages[5] += num;
	}
	public void changeAccuracyStage(int num) {
		stages[6] += num;
	}
	public void changeCritStage(int num) {
		stages[7] += num;
	}
	public void resetStages() {
		for(int i = 0; i < stages.length; i++)
			stages[i] = 0;
	}
	/*
	 *	end of modifing stages of stats 
	*/
	
	
	
}



