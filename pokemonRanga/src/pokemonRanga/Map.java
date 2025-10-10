/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pokemonRanga;

import java.util.ArrayList;

final class Map {
    final String kantoRoutes = "Viridian Forest,Mt. Moon,Diglett's Cave,Rock Tunnel,Rock Tunnel B1F,Pokemon Tower,Power Plant,Seafoam Islands,Seafoam Islands,Pokemon Mansion,Victory Road,Cerulean Cave,Cerulean Cave(Mewtwo),";
    final String kantoCities = "Pallet Town,Pewter City,Cerulean City,Vermilion City,Celadon City,Fuchsia City,Saffron City,Cinnabar Island,Viridian City,Pokemon League Reception Gate,Indigo Plateau,";
    final String kantoGymCities = "Pewter City,Cerulean City,Vermilion City,Celadon City,Saffron City,Fuchsia City,Cinnabar Island,Viridian City";
    final String kantoBadges = "Boulder,Cascade,Thunder,Rainbow,Soul,Marsh,Volcano,Earth,";
    
    String region = "";
    Route[] routesKanto;
    City[] citiesKanto;
    Badge[] badgesKanto = new Badge[8];
    

    public Map(ArrayList<Pokemon> pokemonList, String region){
        this.region = region;
        if(region.equalsIgnoreCase("Kanto")){
            createKanto(pokemonList);
        }

    }

    public void createKanto(ArrayList<Pokemon> pokemonList){
        String temp = kantoRoutes;
        String name = "";
        
        /*route setup*/
        routesKanto = new Route[37];
        for(int i = 1; i < 26; i++){/*numbered routes*/
            name = "Route " + i;
            routesKanto[i - 1] = new Route(region, name, pokemonList);
        }
        for(int i = 25; i < routesKanto.length; i++){/*caves and tunnels */
            routesKanto[i] = new Route(region, temp.substring(0, temp.indexOf(',')), pokemonList);
            temp = temp.substring(temp.indexOf(',') + 1);
        }

        /*badges setup*/
        temp = kantoBadges;
        for(int i = 0; i < badgesKanto.length; i++){
            name = temp.substring(0, temp.indexOf(','));
            badgesKanto[i] = new Badge(region, name);
            temp = temp.substring(temp.indexOf(',') + 1);
        }

        /*cities setup*/
        citiesKanto = new City[11];
        temp = kantoCities;
        int j = 0;
        for(int i = 0; i < citiesKanto.length; i++){
            name = temp.substring(0, temp.indexOf(','));
            citiesKanto[i] = new City(pokemonList, region, name);
            temp = temp.substring(temp.indexOf(',') + 1);
            if(kantoGymCities.contains(name)){/*add badge to gym cities*/
                citiesKanto[i].addBadge(pokemonList, badgesKanto[j]);
                j++;
            }
        }


        
    }
}
