package pokemonRanga;

public class Nature {
	private String name, incrStat, decrStat;
	private int number;
	private String natures[]= {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"};
	private String incrStats[] = {"Attack", "Attack", "Attack", "Attack", "Attack", "Defense", "Defense", "Defense", "Defense", "Defense", "Speed", "Speed", "Speed", "Speed", "Speed", "Special Attack", "Special Attack", "Special Attack", "Special Attack", "Special Attack", "Special Defense", "Special Defense", "Special Defense", "Special Defense", "Special Defense"};
	private String decrStats[] = {"Attack", "Defense", "Speed", "Special Attack", "Special Defense", "Attack", "Defense", "Speed", "Special Attack", "Special Defense", "Attack", "Defense", "Speed", "Special Attack", "Special Defense", "Attack", "Defense", "Speed", "Special Attack", "Special Defense", "Attack", "Defense", "Speed", "Special Attack", "Special Defense"};
	
	public Nature(int nature) {
		name = natures[nature];
		number = nature;
		incrStat = getIncrStat();
		decrStat = getDecrStat();
		
	}
	
	public String getNatureName() {return name;}
	public String getDecrStat() {
		return decrStats[number];
	}

	public String getIncrStat() {
		return incrStats[number];
	}
	
}
