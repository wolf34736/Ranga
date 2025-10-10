package pokemonRanga;

import java.util.ArrayList;

public class City {
    /*Kanto cities information*/
    final String kantoGymCities = "Pewter City,Cerulean City,Vermilion City,Celadon City,Saffron City,Fuchsia City,Cinnabar Island,Viridian City";
    final String kantoCityPoI = "Pallet Town,Home,Rival's Home,Professor Oak's Lab@Viridian City,Viridian Gym,Trainer's School,Trainer House,Old Man,TM Man/Move Tutor,PokéMart,Pokémon Center@Pewter City,Pewter Gym,Pewter Museum of Science,PokéMart,Pokémon Center@Cerulean City,Cerulean Gym,Bike Shop,Berry Powder Man,Gym Badge Man,Dontae's House,Burglarized House,Move Tutor,PokéMart,Pokémon Center@Saffron City,Saffron Gym,Silph Co. Head Office,Fighting Dojo,Magnet Train Station,Mr. Psychic's House,Copycat's House,Pokémon Trainer Fan Club,PokéMart,Pokémon Center@Vermilion City,Vermilion Gym,Port(SS. Anne),Pokémon Fan Club,Construction Site,In-game Trade,Fishing Brother,Sleeping Pokémon notice,PokéMart,Pokémon Center@Lavender Town,Kanto Radio Station,Lavender Volunteer Pokémon House,Name Rater,House of Memories,Silph Scope Advertisement,PokéMart,Pokémon Center@Fuchsia City,Fuchsia Gym,Safari Zone,Safari Zone Warden,Move Deleter,Pokémon Zoo,Berries,Move Tutor,PokéMart,Pokémon Center@Cinnabar Island,Cinnabar Gym,Volcano,Pokémon Mansion,Cinnabar Lab@Pokémon League Reception Gate,Badge check@Indigo Plateau,Elite Four Challenge,Hall of Fame,Poké Mart,Pokémon Center,Mega Stone Seller@";
    final String kantoCityConnections = "Pallet Town,Route 21(grass),Route 1@Viridian City,Route 1,Route 2,Route 22@Pewter City,Route 2,Route 3@Cerulean City,Route 3,Route 24,Route 5@Saffron City,Route 5,Route 6@Vermilion City,Route 6,SS Anne@Lavender Town,Route 10,Route 8,Route 12,Pokémon Tower@Fuchsia City,Route 15,Route 19,Route 18,Safari Zone@Cinnabar Island,Route 20,Route 21(water)@Pokémon League Reception Gate,Route 22,Route 23@Indigo Plateau,Victory Road@";
    final String kantoCityMartItems = "Viridian City,Poké Ball,Potion,Antidote,Parlyz Heal,Burn Heal;7;,Ultra Ball,Hyper Potion,Full Heal,Revive,Antidote,Parlyz Heal,Awakening,Burn Heal,Poké Ball,Potion;@Pewter City,Poké Ball,Potion,Antidote,Parlyz Heal,Burn Heal,Awakening,Escape Rope;3;,Great Ball,Super Potion,Super Repel,Antidote,Parlyz Heal,Awakening,Burn Heal,Poké Ball,Potion,Escape Rope;@Cerulean City,Poké Ball,Potion,Antidote,Parlyz Heal,Burn Heal,Awakening,Escape Rope,Repel;7;,Great Ball,Ultra Ball,Super Potion,Super Repel,Full Heal,X Defend,X Attack,Dire Hit,Poké Ball,Potion,Antidote,Parlyz Heal,Burn Heal,Awakening,Escape Rope,Repel;@Saffron City,Great Ball,Hyper Potion,Max Repel,Escape Rope,Full Heal,Revive;7;,Ultra Ball,Hyper Potion,Max Potion,Full Heal,X Attack,X Defend,Great Ball,Max Repel,Escape Rope,Full Heal,Revive;@Vermilion City,Poké Ball,Super Potion,Ice Heal,Awakening,Parlyz Heal,Repel;7;,Ultra Ball,Hyper Potion,Revive,Poké Ball,Super Potion,Ice Heal,Awakening,Parlyz Heal,Repel,Burn Heal;@Lavender Town,Great Ball,Super Potion,Revive,Escape Rope,Super Repel,Antidote,Burn Heal,Ice Heal,Paralyze Heal;@Fuchsia City,Ultra Ball,Great Ball,Super Potion,Hyper Potion,Revive,Full Heal,Super Repel;@Cinnabar Island,Ultra Ball,Great Ball,Hyper Potion,Max Repel,Escape Rope,Full Heal,Revive;@Indigo Plateau,Ultra Ball,Great Ball,Full Restore,Max Potion,Full Heal,Revive,Max Repel,Hyper Potion;@";
    final String kantoCityGymTrainers = "Pewter City,Camper Liam,Diglett,11,Sandshrew,11;Gym Leader Brock,Geodude,12,Onix,14;@Cerulean City,Swimmer Luis,Horsea,16,Shellder,16;Picnicker Diana,Goldeen,19;Gym Leader Misty,Staryu,18,Starmie,21;@Vermilion City,Sailor Dwayne,Pikachu,21,Pikachu,21;Engineer Baily,Voltorb,21,Magnemite,21;Gentleman Tucker,Pikachu,23;Gym Leader Lt. Surge,Voltorb,21,Pikachu,18,Raichu,24;@Celadon City,Lass Kay,Bellsprout,23,Weepinbell,23;Beauty Bridget,Oddish,21,Oddish,21,Bellsprout,21,Bellsprout,21;Cooltrainer Mary,Bellsprout,22,Oddish,22,Weepinbell,22,Gloom,22,Ivysaur,22;Lass Lisa,Oddish,23,Gloom,23;Picnicker Tina,Bulbasaur,24,Ivysaur,24;Beauty Lori,Exeggcute,24,Beauty Tamia,Bellsprout,24,Bellsprout,24;Gym Leader Erika,Victreebel,29,Tangela,24,Vileplume,29;@Fuchsia City,Juggler Nate,Drowzee,34,Kadabra,34;Juggler Kayden,Hypno,38;Juggler Kirk,Drowzee,31,Drowzee,31,Kadabra,31,Drowzee,31;Tamer Edgar,Arbok,33,Arbok,33,Sandslash,33;Tamer Phil,Sandslash,34,Arbok,34;Juggler Shawn,Drowzee,34,Hypno,34;Gym Leader Koga,Koffing,37,Muk,39,Koffing,37,Weezing,43;@Saffron City,Psychic Cameron,Slowpoke,33,Slowpoke,33,Slowbro,33;Psychic Tyron,Mr. Mime,34,Kadabra,34;Channeler Stacy,Haunter,38;Psychic Peterson,Slowbro,38;Channeler Amanda,Gastly,34,Haunter,34;Channeler Tasha,Gastly,33,Gastly,33,Haunter,33;Psychic Johan,Kadabra,31,Mr. Mime,31,Slowpoke,31,Kadabra,31;Gym Leader Sabrina,Kadabra,38,Mr. Mime,37,Venomoth,38,Alakazam,43;@Cinnabar Island,Burglar Quinn,Growlithe,36,Vulpix,36,Ninetales,36;Super Nerd Erik,Vulpix,36,Vulpix,36,Ninetales,36;Super Nerd Avery,Ponyta,34,Charmander,34,Vulpix,34,Growlithe,34;Burglar Ramon,Ponyta,41;Super Nerd Derek,Rapidash,41;Burglar Dusty,Vulpix,37,Growlithe,37;Super Nerd Zac,Growlithe,37,Vulpix,37;Gym Leader Blaine,Growlithe,42,Ponyta,40,Rapidash,42,Arcanine,47;@Viridian City,Tamer Cole,Arbok,39,Tauros,39;Black Belt Kiyo,Machoke 43;Cooltrainer Samuel,Sandslash,37,Sandslash,37,Rhyhorn,38,Nidorino,39,Nidoking,39;Cooltrainer Yuji,Sandslash,38,Graveler,38,Onix,38,Graveler,38,Marowak,38;Black Belt Atsushi,Machop,40,Machoke,40;Tamer Jason,Rhyhorn,43;Cooltrainer Warren,Marowak,37,Marowak,37,Rhyhorn,38,Nidorina,39,Nidoqueen,39;Black Belt Takashi,Machoke,38,Machop,38,Machoke,38;Gym Leader Giovanni,Rhyhorn,45,Dugtrio,42,Nidoqueen,44,Nidoking,45,Rhyhorn,50;@Indigo Plateau,Elite Four Member Lorelei,Dewgong,52,Cloyster,51,Slowbro,52,Jynx,54,Lapras,54;Elite Four Member Bruno,Onix,51,Hitmonchan,53,Hitmonlee,53,Onix,54,Machamp,56;Elite Four Member Agatha,Gengar,54,Golbat,54,Haunter,53,Arbok,56,Gengar,58;Elite Four Member Lance,Gyrados,56,Dragonair,54,Dragonair,54,Aerodactyl,58,Dragonite,60;Champion Blue,Pidgeot,59,Alakazam,57,Rhydon,59,Exeggutor,59,Gyarados,61,Charizard,63;@";



    public String name = "";
    public String region = "";
    public String gymName = "";
    public Trainer[] gymTrainers;
    public Badge gymBadge;
    public String[] cityConnections;
    public String[] cityPoI;

    //pokemart item infos
    public String[] pkmnMartItems;
    public int badgesToUnlockItems;
    public boolean hasPremiumItems = false;
    public String[] pkmnMartItemsUpgraded;


    public City(ArrayList<Pokemon> pokemonList, String region, String name) {
        this.name = name;
        this.region = region;
        makePkmnMart();
    }

    /**
     * make pokemon mart list
     */
    private void makePkmnMart() {
        String info = findCity(kantoCityMartItems);
        String items = "";
        if(info.contains(";")){
            hasPremiumItems = true;
            int index = info.indexOf(";");
            items = info.substring(index);
            pkmnMartItems = items.split(",");
            badgesToUnlockItems = Integer.parseInt(info.substring(index+1, index+2));
            index +=2;
            items = info.substring(index);
            pkmnMartItemsUpgraded = items.split(",");
        }
        else{
            hasPremiumItems = false;
            pkmnMartItems = info.split(",");
            pkmnMartItemsUpgraded = null;
            badgesToUnlockItems = 0;
        }
    }
    public String[] displayPkmnMart(Trainer player){
        String[] items = new String[2];
        items[0] = "potion";
        items[1] = "pokeball";

        if(region.equalsIgnoreCase("Kanto")){
            if(player.kantoEarned.length >= badgesToUnlockItems){
                items = new String[pkmnMartItems.length + pkmnMartItemsUpgraded.length];
                for (int i = 0; i < pkmnMartItems.length; i++) {
                    items[i] = pkmnMartItems[i];
                }
                int j = pkmnMartItems.length;
                for (int i = 0; i < pkmnMartItemsUpgraded.length; i++) {
                    j += i;
                    items[j] = pkmnMartItemsUpgraded[i];
                }
            }
            else{
                items = pkmnMartItems;
            }
        }
        
        return items;
    }

    public void addBadge(ArrayList<Pokemon> pokemonList, Badge badge){
        gymBadge = badge;
        String gym = "";
        String[] trainers;
        int i = 0;

        if(region.equalsIgnoreCase("Kanto")){
            gym = findCity(kantoCityGymTrainers);
            
        }

        /*check if there is something there 
         * Camper Liam,Diglett,11,Sandshrew,11;Gym Leader Brock,Geodude,12,Onix,14;
        */
        if(gym.length() > 0 || !gym.contains("none")){
            trainers = gym.split(";");
            gymTrainers = new Trainer[trainers.length];


            for(String s: trainers){
                String trainerName = s.substring(0, s.indexOf(","));
                s = s.substring(s.indexOf(",") + 1);
                
                /*assign trainer's name */
                if(trainerName.contains("♀")){
                    trainers[i] = new Trainer(trainerName, false);
                }
                else{
                    trainers[i] = new Trainer(trainerName, true);
                }
                if(trainerName.contains("Gym Leader")){
                    gymTrainers[i].addKantoBadge(gymBadge);
                }

                String pkmn = "pikachu";
                int pkmnLVL = 11;
                /*add pokemon to the trainer*/
                while(s.contains(",")){
                    pkmn = s.substring(0, s.indexOf(","));
                    s = s.substring(s.indexOf(",") + 1);
                    if(s.contains(",")){
                        pkmnLVL = Integer.parseInt(s.substring(0, s.indexOf(",")));
                        s = s.substring(s.indexOf(",") + 1);
                    }
                    else{
                        pkmnLVL = Integer.parseInt(s);
                        s = "";
                    }
                    /*add pokemon to trainer*/
                    gymTrainers[i].addPokemon(makePokemon(pokemonList, pkmn, pkmnLVL));
                }
                i++;
            }
        }

    }
    
    /**
     * @param pokemonList
     * @param name
     * @param level
     * @return the pokemon at level based on name
     */
    private Pokemon makePokemon(ArrayList<Pokemon> pokemonList, String name, int level) {
        int i = 0;
        while (i < pokemonList.size()){
            if(pokemonList.get(i).nameShown.equalsIgnoreCase(name)){
                Pokemon p = new Pokemon(pokemonList.get(i));
                p.levelTo(level);
                return p;
            }
        }
        Pokemon p = new Pokemon(pokemonList.get(0));
        return p;
    }


    /**
     * @param info
     * @return The city info of given string
     */
    private String findCity(String info){
        int index = 0;
        int i = 0;
        for(i = 0; i < info.length() - name.length(); i++){
            if(name.equalsIgnoreCase(info.substring(i, i+name.length()))){
                index = i;
                break;
            }
            
        }
        String temp = "";
        index += name.length() + 1;
        temp = info.substring(index, info.indexOf("@",index));
        if(temp.length() > 0)
            return temp;
        return "";
    
        /*i = index;
        String temp = "";
        while(info.charAt(i) != '@'){
            temp = info.substring(index, i);
            i++;
        }*/

    }
    
    /**
     * @return connections to the route(cities/route/caves)
     */
    public String[] connections(){
        return cityConnections;
    }
}
