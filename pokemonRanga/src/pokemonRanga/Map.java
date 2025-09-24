/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pokemonRanga;

class Map {
    String region = "";
    Route[] routes;
    City[] cities;
    Badge[] badges = new Badge[8];
    final String kantoRoutes = "Viridian Forest,Mt. Moon,Diglett's Cave,Rock Tunnel,Rock Tunnel B1F,Pokemon Tower,Power Plant,Seafoam Islands,Seafoam Islands,Pokemon Mansion,Victory Road,";
    final String kantoCities = "Pallet Town,Pewter City,Cerulean City,Vermilion City,Celadon City,Fuchsia City,Saffron City,Cinnabar Island,Viridian City,Pokemon League Reception Gate,Indigo Plateau,";
    final String kantoBadges = "Boulder,Cascade,Thunder,Rainbow,Soul,Marsh,Volcano,Earth,";

    public Map(String region){
        this.region = region;
        if(region.equalsIgnoreCase("Kanto")){
            createKanto();
        }

    }

    public void createKanto(){
        String temp = kantoRoutes;

        //route setup
        routes = new Route[37];
        for(int i = 1; i < 26; i++){
            routes[i - 1] = new Route(region,"Route" + (i));
        }
        for(int i = 25; i < routes.length; i++){
            routes[i] = new Route(region, temp.substring(0, temp.indexOf(',')));
            temp = temp.substring(temp.indexOf(',') + 1);
        }

        //cities setup
        cities = new City[11];
        temp = kantoCities;
        for(int i = 0; i < cities.length; i++){
            cities[i] = new City(region, temp.substring(0, temp.indexOf(',')));
            temp = temp.substring(temp.indexOf(',') + 1);
        }

        //badges setup
        temp = kantoBadges;
        for(int i = 0; i < badges.length; i++){
            badges[i] = new Badge(region, temp.substring(0, temp.indexOf(',')));
            temp = temp.substring(temp.indexOf(',') + 1);
        }

        

    }
}
