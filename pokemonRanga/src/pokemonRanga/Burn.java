package pokemonRanga;

public class Burn extends StatusEffect{
	//global variables 
	private String name = "Burn";
	private int turnDamage = 8;//0.125;//   1/8 = 0.125
	private double attackReduced = .5;// reduces physical attack by 50%
	private String cureItems[] = {"burn heal", "yago berry", "rawst berry", "ice berry","rage candy bar", "lava cookie", "old gateau", "casteliacone", "lumiose galette", "shalour sable", "big malasada", "full restore", "heal powder", "lum berry", "miracle berry", "sacred ash"}; 
	private String cureMoves[] = {"refresh", "rest", "sparkling aria"};
	
	public Burn() {
		super("burn");
	}
	
	//calculates damage changes if burned
	public int attackDamage(int damage, boolean special,  String ability) {
		if(ability.equalsIgnoreCase("guts") && !special)
			return damage * 2;
		if(ability.equalsIgnoreCase("flare boost") && special)
			return damage * 2;
		if(!special)
			return (int)(damage * attackReduced);
		return damage;
	}
	
	
	//checks if immune from burn
	public boolean immune(String type, String ability, String weather) {
		if(type.equalsIgnoreCase("fire")) {
			return true;
		}
		if(ability.equalsIgnoreCase("water veil") || 
				ability.equalsIgnoreCase("water bubble") || 
				ability.equalsIgnoreCase("comatose") || 
				ability.equalsIgnoreCase("thermal exchange") || 
				ability.equalsIgnoreCase("purifying salt"))
			return true;
		if(weather.equalsIgnoreCase("harsh sunlight") || ability.equalsIgnoreCase("leaf guard"))
			return true;
		
		return false;
	}
	
	//increase catchRate of wild pokemon
	public double catchRate(double catchRate) {
		return catchRate * 1.5;
	}
	
	//checks which if item used cures burn
	public boolean cure(String item) {
		item = item.toLowerCase();
		for(String cI: cureItems) {
			if(item.equalsIgnoreCase(cI))
				return true;
		}
		return super.cure(item);
	}
	
	//checks if attack target hit with or uses cures burn
	public boolean cure(Move attack) {
		for(String cA: cureMoves) {
			if(cA.equalsIgnoreCase(attack.getName()))
				return true;
		}
		return super.cure(attack);
	}
	
	//returns the damage burn does at end of turn 
	public int statusDamage(int maxHP) {
		return maxHP/turnDamage;
	}

	//returns name of status effect
	public String getName() {
		return super.getName();
	}
		
}
