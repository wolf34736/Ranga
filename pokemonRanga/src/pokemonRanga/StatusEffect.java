package pokemonRanga;

public class StatusEffect {

	String name;
	private String cureItems[] = {"full heal"}; 
	private String cureMoves[] = {"heal bell", "aromatherapy"};
	public StatusEffect(String name) {
		this.name = name;
	}
	//calculates damage changes if under a status affect
	public int attackDamage(int damage, boolean special,  String ability) {
		return 0;
	}
	//checks if the pokemon is immune to the status effect
	public boolean immune(String type, String ability, String weather) {
		return false;
	}
	//calculates catchRate based on status effect
	public double catchRate(double catchRate) {
		return catchRate;
	}
	//checks if item heals status effect
	public boolean cure(String item) {
		item = item.toLowerCase();
		for(String cI: cureItems) {
			if(item.equalsIgnoreCase(cI))
				return true;
		}
		return false;
	}
	//checks if attack target is hit by is cured 
	public boolean cure(Move attack) {
		for(String cA: cureMoves) {
			if(cA.equalsIgnoreCase(attack.getName()))
				return true;
		}
		return false;
	}
	//At end of turn deals damage if status effect does damage
	public int statusDamage(int maxHP) {
		return 0;
	}
	
	//returns name of status effect
	public String getName() {
		return name;
	}
}
