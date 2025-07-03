package pokemonRanga;

class Personality {
	private int personality, encryption, ability, nature, charistic;
	private String personBinary , encrypBinary;
	private boolean shiny;
	private int shinyChance = 16;//number ifShiny uses to check if value gives a shiny
	private char unownLetters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's','t', 'u', 'v', 'w', 'x', 'y', 'z', '!', '?'};
	
	//creates a 
	public Personality() {
		personality = (int)Math.random()*(Integer.MAX_VALUE) +1;
		personBinary = getBinary(personality);
		encryption = (int)Math.random()*(Integer.MAX_VALUE) +1;
		encrypBinary = getBinary(personality);
		shiny = ifShiny();
		charistic = personality % 6;
		nature = personality % 25;
	}
	
	//returns the binary version of int passed
	public String getBinary(int num) {
		String binary = "";
		while (num > 0) {
			binary += num % 2;
			num /= 2;
		}
		while(binary.length() < 31) {
			binary = "0" + binary;
		} 
		return binary;
	}
	
	//returns true if pokemon shiny
	public boolean ifShiny() {
		String p1 = Integer.toString(personality / 65536);
		String p2 = Integer.toString(personality % 65536);
		String idT = Integer.toString(encryption / 65536);
		String idS = Integer.toString(encryption % 65536);
		int value = 0;
		for(int i = 0; i < p1.length(); i++) {
			 if(XOR(p1.equals("1"), p2.equals("1"), idT.equals("1") , idS.equals("1"))) {
				 value += Math.pow(2, i);
			 }
		}
		if(value < shinyChance)
			return true;
		return false;
	}
	
	//does an exclusive or between 4 inputs
	public boolean XOR(boolean p1, boolean p2, boolean idT, boolean idS) {
		boolean idTS = idT != idS;
		boolean pNums = p1 != p2;
		return idTS != pNums;
	}
	
	//tells what letter the unown appears as
	public char unownLetter() {
		String pLetter = personBinary.substring(7, 9) + personBinary.substring(15, 18) + personBinary.substring(23, 27) + personBinary.substring(31);  
		int letter = Integer.valueOf(pLetter) % 28;
		return unownLetters[letter];
	}
	
	//needs to be redone when silcoon and cascoon are done
	//determines which way wurmple will evolve
	public String wurmpleEvo() {
		int p = (personality / 65536) % 10;
		if(p < 5)
			return "Silcoon";
		return "Cascoon";
	}
	
	//determines maushold's form
	public int mausholdForm() {
		if(encryption % 100 == 0) {
			return 3;
		}
		return 4;
	}
	
	//determines Dudunsparce's form
	public int dudunsparceForm() {
		if(encryption % 100 == 0) {
			return 3;
		}
		return 2;
	}
	
	//returns the personality number modded by 25
	public int getNatureNum() {
		return nature;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
