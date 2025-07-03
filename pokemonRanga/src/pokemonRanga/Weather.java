package pokemonRanga;

public class Weather {
	private String weather;
	private String weatherList[] = {"Harsh sunlight", "Rain", "Sandstorm", 
			"Hail", "Snow", "Fog", "Extremely harsh sunlight", "Heavy rain",
			"Strong winds", "Shadowy aura"};
	private int turnsLeft;
	private static double turnDamage;
	public Weather() {
		this.weather = "sunny";
		turnsLeft = Integer.MAX_VALUE;
		turnDamage = 1.0/16.0;
	}
	
	/*
	 *	returns 0 if weather does nothing
	 *	returns 1 if weather buff attacks of one type and debuffs another
	 *	returns 2 if weather does damage
	 *	returns 3 if weather buff defense
	 *	returns 4 if weather debuff accuracy
	 *	returns 5 if weather buff attacks of one type and nullifies another
	 *	returns 6 if weather debuff moves strong against one type
	*/
	public int getWeatherEffect() {
		if(weather.equalsIgnoreCase(weatherList[0]) || weather.equalsIgnoreCase(weatherList[1])) {
			return 1;//sunlight or rain
		}
		else if(weather.equalsIgnoreCase(weatherList[2]) || weather.equalsIgnoreCase(weatherList[3]) || weather.equalsIgnoreCase(weatherList[9])) {
			return 2;//sandstorm or hail or shadowy aura
		}
		else if(weather.equalsIgnoreCase(weatherList[4])) {
			return 3;//snow
		}
		else if(weather.equalsIgnoreCase(weatherList[5])) {
			return 4;//fog
		}
		else if(weather.equalsIgnoreCase(weatherList[6]) || weather.equalsIgnoreCase(weatherList[7])) {
			return 5;//exterme sunlight or heavy rain
		}
		else if(weather.equalsIgnoreCase(weatherList[8])) {
			return 6;//strong winds
		}
		return 0;
	}
	public void reduceTurns() {
		turnsLeft--;
	}
	
	public void setWeather(String weather, int turns) {
		this.weather = weather;
		this.turnsLeft = turns;
	}
	
	public void endWeather() {
		this.weather = "sunny";
		this.turnsLeft = Integer.MAX_VALUE;
	}
	
	
	//gets 
	public double getTurnDamage() {		return	turnDamage;	}
	public String getWeatherName() {	return 	weather;	}
}
