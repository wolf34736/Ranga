package pokemonRanga;

import java.util.ArrayList;
import java.util.Random;

public class Route {
    private final String kantoPokemon = "Route 1(grass),Pidgey,Rattata,Rattata,Sentret,Furret,Hoothoot@Route 2(grass),Caterpie,Metapod,Butterfree,Weedle,Kakuna,Beedrill,Pidgey,Pidgey,Pidgeotto,Hoothoot,Noctowl,Noctowl,Ledyba,Ledyba,Ledian,Spinarak,Ariados@Viridian Forest(grass),Caterpie,Metapod,Butterfree,Weedle,Kakuna,Beedrill,Pidgey,Pidgey,Pidgeotto,Hoothoot,Noctowl,Pikachu@Route 3(grass),Rattata,Spearow,Ekans,Arbok,Jigglypuff,Zubat@Mt. Moon(cave),Zubat,Geodude,Sandshrew,Sandslash,Paras,Clefairy,Onix,Nidoran♀,Nidoran♂@Route 4(grass),Rattata,Spearow,Ekans,Arbok,Jigglypuff,Zubat@Route 24(grass),Bellsprout,Weepinbell,Abra,Venonat,Venomoth,Sunkern,Oddish@Route 25(grass),Bellsprout,Weepinbell,Abra,Venonat,Venomoth,Meowth,Oddish,Pidgey,Pidgeotto,Psyduck@Route 5(grass),Pidgey,Pideotto,Oddish,Gloom,Abra,Meowth,Bellsprout,Weepinbell,Vulpix,Growlithe,Jigglypuff,Chansey@Route 6(grass),Pidgey,Pideotto,Oddish,Gloom,Abra,Meowth,Bellsprout,Weepinbell,Vulpix,Growlithe,Jigglypuff,Psyduck,Chansey,Magnemite@Route 11(grass),Rattata,Raticate,Magnemite,Drowzee,Hypno,Mr. Mime,Snorlax@Diglett's Cave(cave),Diglett,Dugtrio@Route 9(grass),Rattata,Raticate,Spearow,Fearow,Mankey,Primeape,Nidoran♀,Nidorina,Nidoran♂,Nidorino@Rock Tunnel(cave),Cubone,Geodude,Graveler,Machop,Machoke,Zubat,Golbat,Onix,Rhydon,Kangaskhan@Rock Tunnel B1F(cave),Cubone,Marowak,Geodude,Graveler,Zubat,Golbat,Onix,Rhydon,Kangaskhan@Route 10(grass),Raticate,Spearow,Fearow,Voltorb,Electabuzz,Quagisre,Nidoran♀,Nidorina,Nidoran♂,Nidorino,Krabby@Pokemon Tower(cave),Gastly,Haunter,Cubone,Zubat,Golbat,Chansey@Route 8(grass),Pideotto,Vulpix,Ninetales,Growlithe,Arcanine,Meowth,Abra,Kadabra,Haunter,Chansey@Route 7(grass),Rattata,Raticate,Spearow,Vulpix,Ninetales,Meowth,Persian,Growlithe,Arcanine,Murkrow,Houndour,Jigglypuff,Abra,Kadabra@Route 12(grass),Pidgey,Pideotto,Oddish,Gloom,Bellsprout,Weepinbell,Farfetch'd,Krabby,Kingler,Chansey,Venonat@Route 13(grass),Pideotto,Nidorina,Nidorino,Chansey,Noctowl,Hoppip,Quagsire,Oddish,Gloom,Bellsprout,Weepinbell,Krabby,Kingler,Ditto,Farfetch'd@Route 14(grass),Pideotto,Nidorina,Nidorino,Chansey,Noctowl,Hoppip,Skiploom,Quagsire,Scyther,Pinsir,Tauros,Ditto@Route 15(grass),Pideotto,Nidorina,Nidorino,Chansey,Noctowl,Hoppip,Skiploom,Quagsire,Scyther,Pinsir,Tauros,Ditto@Route 18(grass),Pidgey,Pideotto,Rattata,Raticate,Doduo,Dodrio,Grimer,Muk,Slugma,Spearow,Fearow@Route 17(grass),Raticate,Spearow,Fearow,Ponyta,Doduo,Dodrio,Grimer,Muk,Slugma,Eevee,Psyduck,Chansey@Route 16(grass),Raticate,Spearow,Fearow,Ponyta,Doduo,Dodrio,Grimer,Muk,Slugma,Eevee,Psyduck,Chansey@Power Plant(cave),Magnemite,Magneton,Grimer,Muk,Voltorb,Electrode,Koffing,Weezing,Electabuzz,Pikachu,Raichu@Route 19(water),Tentacool,Tentacruel,Magikarp,Poliwag,Goldeen,Shellder,Horsea,Staryu,Starmie,Krabby,Kingler,Corsola,Slowpoke,Seadra,Gyarados,Lapras@Seafoam Islands(water),Seel,Slowbro,Tentacool,Tentacruel,Magikarp,Poliwag,Goldeen,Shellder,Horsea,Staryu,Starmie,Krabby,Kingler,Corsola,Slowpoke,Seadra,Gyarados,Lapras@Seafoam Islands(cave),Zubat,Golbat,Psyduck,Golduck,Seel,Dewgong,Jynx,Slowpoke,Slowbro,Shellder,Cloyster@Route 20(water),Tentacool,Tentacruel,Magikarp,Poliwag,Goldeen,Shellder,Horsea,Staryu,Starmie,Krabby,Kingler,Corsola,Slowpoke,Seadra,Gyarados,Lapras@Pokemon Mansion(cave),Vulpix,Growlithe,Ponyta,Grimer,Muk,Koffing,Weezing,Magmar,Ditto@Route 21(water),Tentacool,Tentacruel,Magikarp,Poliwag,Goldeen,Shellder,Horsea,Staryu,Starmie,Krabby,Kingler,Corsola,Slowpoke,Seadra,Gyarados,Lapras@Route 21(grass),Tangela,Mr. Mime@Route 22(grass),Rattata,Spearow,Mankey,Poliwag,Ponyta,Fearow,Doduo,Nidoran♀,Nidoran♂@Route 23(grass),Spearow,Fearow,Nidoran♀,Nidorina,Nidoqueen,Nidoran♂,Nidorino,Nidoking,Exeggcute,Exeggutor,Ekans,Arbok,Sandshrew,Sandslash,Mankey,Primeape,Ditto@Victory Road(cave),Zubat,Golbat,Machop,Machoke,Machamp,Geodude,Graveler,Golem,Onix,Marrowak,Ursaring,Donphan,Rhyhorn,Rhydon,Sandslash,Hitmonlee,Hitmonchan@";
    private final String kantoPokemonSpawnPercent = "Route 1(grass),45,30,5,20,5,45@Route 2(grass),31,20,10,11,20,10,30,20,5,50,14,14,30,4,9,31,5@Viridian Forest(grass),40,30,10,40,30,10,10,15,9,80,15,6@Route 3(grass),35,55,20,5,10,30@Mt. Moon(cave),40,32,20,5,10,5,1,10,10@Route 4(grass),35,55,20,5,10,30@Route 24(grass),60,15,20,20,5,30,30@Route 25(grass),30,5,10,25,20,20,30,40,5,20@Route 5(grass),50,5,45,10,10,25,30,5,20,20,15,1@Route 6(grass),20,5,45,10,10,25,25,5,20,20,15,10,1,10@Route 11(grass),30,5,20,40,10,5,0@Diglett's Cave(cave),90,10@Route 9(grass),50,20,35,5,30,5,15,5,15,5@Rock Tunnel 1F(cave),35,30,5,20,5,10,5,10,10,1@Rock Tunnel B1F(cave),30,5,30,10,10,5,10,10,1@Route 10(grass),25,30,10,30,10,20,15,5,15,5,10@Pokemon Tower(cave),80,10,10,5,5,1@Route 8(grass),65,19,1,19,1,30,20,5,30,1@Route 7(grass),30,10,30,20,1,30,5,20,1,20,5,15,4,1@Route 12(grass),30,10,35,5,30,5,5,15,5,1,30@Route 13(grass),25,30,30,1,20,15,20,35,5,35,5,15,5,5,5@Route 14(grass),20,30,30,1,20,10,9,19,1,1,5,15@Route 15(grass),20,30,30,1,20,10,9,19,1,1,5,15@Route 18(grass),25,20,25,20,30,5,50,5,5,20,20@Route 17(grass),30,40,15,24,30,1,50,10,25,5,15,1@Route 16(grass),30,40,15,24,30,1,50,10,25,5,15,1@Power Plant(cave),30,20,15,5,30,20,25,5,14,25,5@Route 19(water),60,10,40,50,50,25,20,25,1,50,20,30,1,4,15,1@Seafoam Islands(water),60,10,60,10,40,50,50,25,20,25,1,50,20,30,1,4,15,1@Seafoam Islands(cave),16,20,20,15,30,10,12,15,10,19,1@Route 20(water),60,10,40,50,50,25,20,25,1,50,20,30,1,4,15,1@Pokemon Mansion(cave),10,10,40,25,4,35,4,10,10@Route 21(water),60,10,40,50,50,25,20,25,1,50,20,30,1,4,15,1@Route 21(grass),90,10@Route 22(grass),30,10,20,30,5,5,10,30,30@Route 23(grass),15,25,10,19,1,10,19,1,14,1,20,5,20,5,30,5,35@Victory Road(cave),30,15,10,15,1,10,15,1,10,5,20,20,10,5,10,5,5@";
    private final String kantoPokemonSpawnLevels = "Route 1(grass),2-4,2-3,6,3,6,2-4@Route 2(grass),3-4,5,7-8,3-5,3-5,7-10,3,7-8 ,7-10,3-5,7-8,10,3,10,7-10,3-10,7@Viridian Forest(grass),3,3-5,7,3,3-5,7,3,7,7,3-5,7,4-7@Route 3(grass),5-10,5-8,8,10,6,5@Mt. Moon(cave),6-8,6-10,8,10,12,8,10,6-8,6-8@Route 4(grass),5-10,5-8,8,10,6,5@Route 24(grass),8-10,12-14,9,8,14,10,10@Route 25(grass),10-14,10-14,9,8-10,8,9-14,10,8,10,9-14@Route 5(grass),13-15,13-16,13,15,12-14,13-14,13-14,13-15,11-16,11-16,11-16,11-16@Route 6(grass),13-14,13-15,13,14,12-14,13-14,13-14,13-15,11-16,11-16,11-16,11-16,11-16,15@Route 11(grass),15,15-18,15,14-16,16,14-16,50@Diglett's Cave(cave),13-19,19-29@Route 9(grass),13-15,13-15,13-15,15,13,15,13,13-15,13,13-15@Rock Tunnel(cave),10-13,10,18-23,12,14,8,18-23,16,14-18,18-23@Rock Tunnel B1F(cave),12,14,12,18-23,10,18-23,16,14-18,18-23@Route 10(grass),16-18,16,18,17,15-18,16-18,15,15-18,15,15-18,15@Pokemon Tower(cave),13-19,20-25,15-19,15-19,20-25,20-25@Route 8(grass),17-19,17-18,20-25,17-18,20-25,17,15,15,19,20-25@Route 7(grass),15-19,19,17,15-18,20-25,17,19,15-18,20-25,17-19,15,15,15-18,17-20@Route 12(grass),23-27,28,22-27,28-30,22-27,28-30,26-31,22-27,26-31,26-31,24-26@Route 13(grass),25-28,23,23,25,25,22-27,22-25,22-27,28-30,22-27,28-30,22-27,28-30,22-27,25@Route 14(grass),25,23,23,25,25,24,26,24-26,24-30,24-30,24-30,23@Route 15(grass),25,23,23,25,25,24,26,24-26,24-30,24-30,24-30,23@Route 18(grass),23-24,25-29,23-24,25-29,24-28,25-29,23-24,24-28,23-26,23-24,25-29@Route 17(grass),25-29,20-22,25-29,28-32,24-28,29,27-33,30-33,25-32,5,20-25,20-32@Route 16(grass),25-29,20-22,25-29,28-32,24-28,29,27-33,30-33,25-32,5,20-25,20-32@Power Plant(cave),21-35,32-38,33-37,33-37,21-37,32-37,21-37,32-37,33-36,20-24,33-36@Route 19(water),5-39,35-39,5,10,10,15,15,15-20,35-39,5-15,25-35,20-40,25-35,25-35,10-40,37-42@Seafoam Islands(water),30-40,35-50,5-39,35-39,5,10,10,15,15,15-20,35-39,5-15,25-35,20-40,25-35,25-35,10-40,37-42@Seafoam Islands(cave),18-36,27-36,28-30,30-36,22-30,30-38,30-40,28-30,36-50,25-30,39-44@Route 20(water),5-39,35-39,5,10,10,15,15,15-20,35-39,5-15,25-35,20-40,25-35,25-35,10-40,37-42@Pokemon Mansion(cave),34,34,28-34,23-32,37-39,20-32,37-39,34-38,12-24@Route 21(water),5-39,35-39,5,10,10,15,15,15-20,35-39,5-15,25-35,20-40,25-35,25-35,10-40,37-42@Route 21(grass),20-35,28-30@Route 22(grass),2-4,2-6,3-5,3-4,6,7,4,3-4,3-4@Route 23(grass),26-34,38-45,26-34,34-38,38-45,26-34,34-38,38-45,26-34,34-38,32-34,44,26-34,34-44,32-34,34-42,33-43@Victory Road(cave),22-44,39-41,22-44,39-41,42-50,22-44,39-41,42-50,36-45,43,33-41,33-41,33-35,35-45,35,41-46,41-46@";

    public String name = "";
    public String region = "";
    private int kantoPokemonIndex = 0;
    private int kantoPokemonSpawnPercentIndex = 0;
    private int kantoPokemonSpawnLevelsIndex = 0;
    private String[] routePokemon;
    private int[] routePokemonPercents;
    private String[] routePokemonLevels;
    private Random random = new Random();

    public Route(String region, String name) {
        this.name = name;
        this.region = region;
        String routePokemon ="";
        String routePokemonPercents ="";
        String routePokemonLevels ="";
        String[] temp;
        //parse out the pokemon found on the route
        kantoPokemonIndex = findRoute(kantoPokemon);
        routePokemon = getRouteInfo(kantoPokemon);
        this.routePokemon = routePokemon.split(",");
        this.routePokemon[this.routePokemon.length-1] = this.routePokemon[this.routePokemon.length-1].substring(0,this.routePokemon[this.routePokemon.length-1].length()-2);/*get rid of the @ symbol*/

        //parse out the pokemon spawn rates on the route
        kantoPokemonSpawnPercentIndex = findRoute(kantoPokemonSpawnPercent);
        routePokemonPercents = getRouteInfo(kantoPokemonSpawnPercent);
        temp = routePokemonPercents.split(",");
        temp[temp.length-1] = temp[temp.length-1].substring(0,temp[temp.length-1].length()-2);/*get rid of the @ symbol*/
        this.routePokemonPercents = new int[temp.length];
        for(int i = 0; i < temp.length; i++){
            this.routePokemonPercents[i] = Integer.parseInt(temp[i]);
        }


        //parse out the pokemon spawn levels on the route
        kantoPokemonSpawnLevelsIndex = findRoute(kantoPokemonSpawnLevels);
        routePokemonLevels = getRouteInfo(kantoPokemonSpawnLevels);
        temp = routePokemonPercents.split(",");
        temp[temp.length-1] = temp[temp.length-1].substring(0,temp[temp.length-1].length()-2);/*get rid of the @ symbol*/
        this.routePokemonLevels = temp;
        


        if(kantoPokemonIndex == -1 || kantoPokemonSpawnPercentIndex == -1 || kantoPokemonSpawnLevelsIndex == -1 || routePokemon.equals("") || routePokemonPercents.equals("") || routePokemonLevels.equals("")){
            System.out.println("ERROR: route not found");
            System.out.println("kantoPokemonIndex = " + kantoPokemonIndex);
            System.out.println("kantoPokemonSpawnPercentIndex = " + kantoPokemonSpawnPercentIndex);
            System.out.println("kantoPokemonSpawnLevelsIndex = " + kantoPokemonSpawnLevelsIndex);
            System.out.println("routePokemon = " + kantoPokemonIndex);
            System.out.println("routePokemonPercents = " + kantoPokemonSpawnPercentIndex);
            System.out.println("routePokemonLevels = " + kantoPokemonSpawnLevelsIndex + "\n\n\n");
            System.out.println("Since something went wrong this route is now route 1 it said it was \"" + name + "\" but something about that didn't work. Enjoy the easy route. ;)\n");
            //need to make it so error routes become route 1
        }
        else{
            System.out.println("Route: " + name + " was made succefully.");
        }
    }

    /**
     * @param info
     * @return location of the begining of the route info
     */
    private int findRoute(String info){
        for(int i = 0; i < info.length() - name.length() ; i++){
            if(name.equalsIgnoreCase(info.substring(i, i+name.length()))){
                return i;
            }
        }
        return -1;
    }

    /**
     * @param info
     * @return part of the string that is about the route 
     */
    private String getRouteInfo(String info){
        int i = 0;
        String temp = "";
        while(kantoPokemon.charAt(i) != '@'){
            temp = kantoPokemon.substring(kantoPokemonIndex, i);
            i++;
        }
        if(temp.length() > 0)
            return temp;

        return "";
    }

    /**
     * @return a pokemon that can be found on the route with the level. if it messes up it return arceus(as a joke)
     */
    public Pokemon randomEncounter(ArrayList<Pokemon> pokemonList){
        
        int[] pokemonLevels = new int[routePokemonLevels.length];
        String temp = "";
        int i = 0;
        Pokemon encounterPokemon = new Pokemon(pokemonList.get(492));
        encounterPokemon.levelTo(100);

        /*get the levels of each pokemon that might be encountered */
        for(i = 0; i < routePokemonLevels.length; i++){
            temp = routePokemonLevels[i];
            if (temp.contains("-")) {
                String s = temp.substring(0, temp.indexOf("-"));
                final int low = Integer.parseInt(s);
                s = temp.substring(temp.indexOf("-"));
                final int high = Integer.parseInt(s);
                pokemonLevels[i] = random.nextInt(high) + low;
            }
            else{
                pokemonLevels[i] = Integer.parseInt(routePokemonLevels[i]);
            }
        }

        /*find if a pokemon could spawn*/
        boolean[] spawned = new boolean[routePokemonPercents.length];
        i = 0;
        for(int percent: routePokemonPercents){
            spawned[i] = random.nextInt(100) <= percent;
            i++;
        }

        /*choose a pokemon from the list get 100 chances and then I just choose the first in the list*/
        i=0;
        int choice = 0;
        boolean found = false;
        while(i < 100){
            choice = random.nextInt(routePokemon.length);
            if(spawned[choice]){
                for(Pokemon p: pokemonList){
                    if(p.getName().equals(routePokemon[choice])){
                        encounterPokemon = new Pokemon(p);
                        encounterPokemon.levelTo(pokemonLevels[choice]);
                        found = true;
                    }
                }
            }
        }
        i = 0;
        if(!found){
            for(boolean s: spawned){
                if(s){
                    for(Pokemon p: pokemonList){
                        if(p.getName().equals(routePokemon[choice])){
                            encounterPokemon = new Pokemon(p);
                            encounterPokemon.levelTo(pokemonLevels[choice]);
                            found = true;
                        }
                    }
                }
                i++;
            }
        }
        if(!found){
            for(Pokemon p: pokemonList){
                if(p.getName().equals(routePokemon[choice])){
                    encounterPokemon = new Pokemon(p);
                    encounterPokemon.levelTo(pokemonLevels[choice]);
                    found = true;
                }
            }
        }
        
        System.out.println("\nA wild " + encounterPokemon.nameShown + " appeared!!!\n");
        return encounterPokemon;
    }

}
