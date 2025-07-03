package pokemonRanga;

public class Freeze extends StatusEffect{
	//global variables 
	private String name = "Freeze";
	private int turnDamage = 8;//0.125;//   1/8 = 0.125
	private double attackReduced = .5;// reduces physical attack by 50%
	private String cureItems[] = {"ice heal", "pumkin berry", "aspear berry", "rage candy bar", "lava cookie", "old gateau", "casteliacone", "lumiose galette", "shalour sable", "big malasada", "full restore", "heal powder", "lum berry"}; 
	private String cureMoves[] = {"scald", "steam eruption", "scorching sands", "matcha gotcha", "flame wheel", "sacred fire", "flare blitz", "fusion flare", "burn up", "pyro ball", ""};
	
	public Freeze() {
		super("freeze");
	}
	
	public int attackDamage(int damage, boolean special,  String ability) {
		if(ability.equalsIgnoreCase("Magma Armor") || 
				ability.equalsIgnoreCase("Comatose") || 
				ability.equalsIgnoreCase("purifying salt")||
				ability.equalsIgnoreCase("Shield Dust")) 
			return damage;
		return 0;
	}
	
	
	//checks if immune from freeze
	public boolean immune(String type, String ability, String weather) {
		if(type.equalsIgnoreCase("ice")) 
			return true;
		if(ability.equalsIgnoreCase("Magma Armor") || 
				ability.equalsIgnoreCase("Comatose") || 
				ability.equalsIgnoreCase("purifying salt")||
				ability.equalsIgnoreCase("Shield Dust")) 
			return true;
		if(weather.equalsIgnoreCase("harsh sunlight"))
			return true;
		return false;
	}
	
	//increase catchRate of wild pokemon
	public double catchRate(double catchRate) {
		return catchRate * 1.5;
	}
	
	//checks which if item used cures freeze
	public boolean cure(String item) {
		item = item.toLowerCase();
		for(String cI: cureItems) {
			if(item.equalsIgnoreCase(cI))
				return true;
		}
		return super.cure(item);
	}
	
	//checks if attack target hit with or uses cures freeze
	public boolean cure(Move attack) {
		if(attack.getType().equalsIgnoreCase("fire")) 
			return true;
		for(String cA: cureMoves) {
			if(cA.equalsIgnoreCase(attack.getName()))
				return true;
		}
		return super.cure(attack);
	}
	
	
	//returns the damage freeze does at end of turn 
	public int statusDamage(int maxHP) {
		return 0;
	}

	//returns name of status effect
	public String getName() {
		return super.getName();
	}
}
