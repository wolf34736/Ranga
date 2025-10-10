package pokemonRanga;

import java.util.ArrayList;
import java.util.Random;

public class Route {
    private final String kantoPokemon = "Route 1(grass),Pidgey,Rattata,Rattata,Sentret,Furret,Hoothoot@Route 2(grass),Caterpie,Metapod,Butterfree,Weedle,Kakuna,Beedrill,Pidgey,Pidgey,Pidgeotto,Hoothoot,Noctowl,Noctowl,Ledyba,Ledyba,Ledian,Spinarak,Ariados@Viridian Forest(grass),Caterpie,Metapod,Butterfree,Weedle,Kakuna,Beedrill,Pidgey,Pidgey,Pidgeotto,Hoothoot,Noctowl,Pikachu@Route 3(grass),Rattata,Spearow,Ekans,Arbok,Jigglypuff,Zubat@Mt. Moon(cave),Zubat,Geodude,Sandshrew,Sandslash,Paras,Clefairy,Onix,Nidoran♀,Nidoran♂@Route 4(grass),Rattata,Spearow,Ekans,Arbok,Jigglypuff,Zubat@Route 24(grass),Bellsprout,Weepinbell,Abra,Venonat,Venomoth,Sunkern,Oddish@Route 25(grass),Bellsprout,Weepinbell,Abra,Venonat,Venomoth,Meowth,Oddish,Pidgey,Pidgeotto,Psyduck@Route 5(grass),Pidgey,Pideotto,Oddish,Gloom,Abra,Meowth,Bellsprout,Weepinbell,Vulpix,Growlithe,Jigglypuff,Chansey@Route 6(grass),Pidgey,Pideotto,Oddish,Gloom,Abra,Meowth,Bellsprout,Weepinbell,Vulpix,Growlithe,Jigglypuff,Psyduck,Chansey,Magnemite@Route 11(grass),Rattata,Raticate,Magnemite,Drowzee,Hypno,Mr. Mime,Snorlax@Diglett's Cave(cave),Diglett,Dugtrio@Route 9(grass),Rattata,Raticate,Spearow,Fearow,Mankey,Primeape,Nidoran♀,Nidorina,Nidoran♂,Nidorino@Rock Tunnel(cave),Cubone,Geodude,Graveler,Machop,Machoke,Zubat,Golbat,Onix,Rhydon,Kangaskhan@Rock Tunnel B1F(cave),Cubone,Marowak,Geodude,Graveler,Zubat,Golbat,Onix,Rhydon,Kangaskhan@Route 10(grass),Raticate,Spearow,Fearow,Voltorb,Electabuzz,Quagisre,Nidoran♀,Nidorina,Nidoran♂,Nidorino,Krabby@Pokemon Tower(cave),Gastly,Haunter,Cubone,Zubat,Golbat,Chansey@Route 8(grass),Pideotto,Vulpix,Ninetales,Growlithe,Arcanine,Meowth,Abra,Kadabra,Haunter,Chansey@Route 7(grass),Rattata,Raticate,Spearow,Vulpix,Ninetales,Meowth,Persian,Growlithe,Arcanine,Murkrow,Houndour,Jigglypuff,Abra,Kadabra@Route 12(grass),Pidgey,Pideotto,Oddish,Gloom,Bellsprout,Weepinbell,Farfetch'd,Krabby,Kingler,Chansey,Venonat@Route 13(grass),Pideotto,Nidorina,Nidorino,Chansey,Noctowl,Hoppip,Quagsire,Oddish,Gloom,Bellsprout,Weepinbell,Krabby,Kingler,Ditto,Farfetch'd@Route 14(grass),Pideotto,Nidorina,Nidorino,Chansey,Noctowl,Hoppip,Skiploom,Quagsire,Scyther,Pinsir,Tauros,Ditto@Route 15(grass),Pideotto,Nidorina,Nidorino,Chansey,Noctowl,Hoppip,Skiploom,Quagsire,Scyther,Pinsir,Tauros,Ditto@Route 18(grass),Pidgey,Pideotto,Rattata,Raticate,Doduo,Dodrio,Grimer,Muk,Slugma,Spearow,Fearow@Route 17(grass),Raticate,Spearow,Fearow,Ponyta,Doduo,Dodrio,Grimer,Muk,Slugma,Eevee,Psyduck,Chansey@Route 16(grass),Raticate,Spearow,Fearow,Ponyta,Doduo,Dodrio,Grimer,Muk,Slugma,Eevee,Psyduck,Chansey@Power Plant(cave),Magnemite,Magneton,Grimer,Muk,Voltorb,Electrode,Koffing,Weezing,Electabuzz,Pikachu,Raichu@Route 19(water),Tentacool,Tentacruel,Magikarp,Poliwag,Goldeen,Shellder,Horsea,Staryu,Starmie,Krabby,Kingler,Corsola,Slowpoke,Seadra,Gyarados,Lapras@Seafoam Islands(water),Seel,Slowbro,Tentacool,Tentacruel,Magikarp,Poliwag,Goldeen,Shellder,Horsea,Staryu,Starmie,Krabby,Kingler,Corsola,Slowpoke,Seadra,Gyarados,Lapras@Seafoam Islands(cave),Zubat,Golbat,Psyduck,Golduck,Seel,Dewgong,Jynx,Slowpoke,Slowbro,Shellder,Cloyster@Route 20(water),Tentacool,Tentacruel,Magikarp,Poliwag,Goldeen,Shellder,Horsea,Staryu,Starmie,Krabby,Kingler,Corsola,Slowpoke,Seadra,Gyarados,Lapras@Pokemon Mansion(cave),Vulpix,Growlithe,Ponyta,Grimer,Muk,Koffing,Weezing,Magmar,Ditto@Route 21(water),Tentacool,Tentacruel,Magikarp,Poliwag,Goldeen,Shellder,Horsea,Staryu,Starmie,Krabby,Kingler,Corsola,Slowpoke,Seadra,Gyarados,Lapras@Route 21(grass),Tangela,Mr. Mime@Route 22(grass),Rattata,Spearow,Mankey,Poliwag,Ponyta,Fearow,Doduo,Nidoran♀,Nidoran♂@Route 23(grass),Spearow,Fearow,Nidoran♀,Nidorina,Nidoqueen,Nidoran♂,Nidorino,Nidoking,Exeggcute,Exeggutor,Ekans,Arbok,Sandshrew,Sandslash,Mankey,Primeape,Ditto@Victory Road(cave),Zubat,Golbat,Machop,Machoke,Machamp,Geodude,Graveler,Golem,Onix,Marrowak,Ursaring,Donphan,Rhyhorn,Rhydon,Sandslash,Hitmonlee,Hitmonchan@Cerulean Cave,Arbok,Raichu,Sandslash,Golbat,Gloom,Parasect,Venomoth,Kadabra,Weepinbell,Graveler,Magneton,Dodrio,Hypno,Ditto,Wigglytuff,Electrode,Rhyhorn,Rhydon,Chansey,Marowak,Lickitung,Primeape,Machoke,Wobbuffet,Psyduck,Golduck,Slowpoke,Slowbro,Persian,Makuhita,Absol,Chingling,Bronzor,Snorlax,Poliwrath,@Cerulean Cave(Mewtwo),Mewtwo@";
    private final String kantoPokemonSpawnPercent = "Route 1(grass),45,30,5,20,5,45@Route 2(grass),31,20,10,11,20,10,30,20,5,50,14,14,30,4,9,31,5@Viridian Forest(grass),40,30,10,40,30,10,10,15,9,80,15,6@Route 3(grass),35,55,20,5,10,30@Mt. Moon(cave),40,32,20,5,10,5,1,10,10@Route 4(grass),35,55,20,5,10,30@Route 24(grass),60,15,20,20,5,30,30@Route 25(grass),30,5,10,25,20,20,30,40,5,20@Route 5(grass),50,5,45,10,10,25,30,5,20,20,15,1@Route 6(grass),20,5,45,10,10,25,25,5,20,20,15,10,1,10@Route 11(grass),30,5,20,40,10,5,0@Diglett's Cave(cave),90,10@Route 9(grass),50,20,35,5,30,5,15,5,15,5@Rock Tunnel 1F(cave),35,30,5,20,5,10,5,10,10,1@Rock Tunnel B1F(cave),30,5,30,10,10,5,10,10,1@Route 10(grass),25,30,10,30,10,20,15,5,15,5,10@Pokemon Tower(cave),80,10,10,5,5,1@Route 8(grass),65,19,1,19,1,30,20,5,30,1@Route 7(grass),30,10,30,20,1,30,5,20,1,20,5,15,4,1@Route 12(grass),30,10,35,5,30,5,5,15,5,1,30@Route 13(grass),25,30,30,1,20,15,20,35,5,35,5,15,5,5,5@Route 14(grass),20,30,30,1,20,10,9,19,1,1,5,15@Route 15(grass),20,30,30,1,20,10,9,19,1,1,5,15@Route 18(grass),25,20,25,20,30,5,50,5,5,20,20@Route 17(grass),30,40,15,24,30,1,50,10,25,5,15,1@Route 16(grass),30,40,15,24,30,1,50,10,25,5,15,1@Power Plant(cave),30,20,15,5,30,20,25,5,14,25,5@Route 19(water),60,10,40,50,50,25,20,25,1,50,20,30,1,4,15,1@Seafoam Islands(water),60,10,60,10,40,50,50,25,20,25,1,50,20,30,1,4,15,1@Seafoam Islands(cave),16,20,20,15,30,10,12,15,10,19,1@Route 20(water),60,10,40,50,50,25,20,25,1,50,20,30,1,4,15,1@Pokemon Mansion(cave),10,10,40,25,4,35,4,10,10@Route 21(water),60,10,40,50,50,25,20,25,1,50,20,30,1,4,15,1@Route 21(grass),90,10@Route 22(grass),30,10,20,30,5,5,10,30,30@Route 23(grass),15,25,10,19,1,10,19,1,14,1,20,5,20,5,30,5,35@Victory Road(cave),30,15,10,15,1,10,15,1,10,5,20,20,10,5,10,5,5@Cerulean Cave,10,5,10,30,10,5,10,5,10,15,15,10,20,10,5,10,10,10,5,20,5,11,10,4,65,35,65,35,14,20,20,20,20,1,1,@Cerulean Cave(Mewtwo),100@";
    private final String kantoPokemonSpawnLevels = "Route 1(grass),2-4,2-3,6,3,6,2-4@Route 2(grass),3-4,5,7-8,3-5,3-5,7-10,3,7-8 ,7-10,3-5,7-8,10,3,10,7-10,3-10,7@Viridian Forest(grass),3,3-5,7,3,3-5,7,3,7,7,3-5,7,4-7@Route 3(grass),5-10,5-8,8,10,6,5@Mt. Moon(cave),6-8,6-10,8,10,12,8,10,6-8,6-8@Route 4(grass),5-10,5-8,8,10,6,5@Route 24(grass),8-10,12-14,9,8,14,10,10@Route 25(grass),10-14,10-14,9,8-10,8,9-14,10,8,10,9-14@Route 5(grass),13-15,13-16,13,15,12-14,13-14,13-14,13-15,11-16,11-16,11-16,11-16@Route 6(grass),13-14,13-15,13,14,12-14,13-14,13-14,13-15,11-16,11-16,11-16,11-16,11-16,15@Route 11(grass),15,15-18,15,14-16,16,14-16,50@Diglett's Cave(cave),13-19,19-29@Route 9(grass),13-15,13-15,13-15,15,13,15,13,13-15,13,13-15@Rock Tunnel(cave),10-13,10,18-23,12,14,8,18-23,16,14-18,18-23@Rock Tunnel B1F(cave),12,14,12,18-23,10,18-23,16,14-18,18-23@Route 10(grass),16-18,16,18,17,15-18,16-18,15,15-18,15,15-18,15@Pokemon Tower(cave),13-19,20-25,15-19,15-19,20-25,20-25@Route 8(grass),17-19,17-18,20-25,17-18,20-25,17,15,15,19,20-25@Route 7(grass),15-19,19,17,15-18,20-25,17,19,15-18,20-25,17-19,15,15,15-18,17-20@Route 12(grass),23-27,28,22-27,28-30,22-27,28-30,26-31,22-27,26-31,26-31,24-26@Route 13(grass),25-28,23,23,25,25,22-27,22-25,22-27,28-30,22-27,28-30,22-27,28-30,22-27,25@Route 14(grass),25,23,23,25,25,24,26,24-26,24-30,24-30,24-30,23@Route 15(grass),25,23,23,25,25,24,26,24-26,24-30,24-30,24-30,23@Route 18(grass),23-24,25-29,23-24,25-29,24-28,25-29,23-24,24-28,23-26,23-24,25-29@Route 17(grass),25-29,20-22,25-29,28-32,24-28,29,27-33,30-33,25-32,5,20-25,20-32@Route 16(grass),25-29,20-22,25-29,28-32,24-28,29,27-33,30-33,25-32,5,20-25,20-32@Power Plant(cave),21-35,32-38,33-37,33-37,21-37,32-37,21-37,32-37,33-36,20-24,33-36@Route 19(water),5-39,35-39,5,10,10,15,15,15-20,35-39,5-15,25-35,20-40,25-35,25-35,10-40,37-42@Seafoam Islands(water),30-40,35-50,5-39,35-39,5,10,10,15,15,15-20,35-39,5-15,25-35,20-40,25-35,25-35,10-40,37-42@Seafoam Islands(cave),18-36,27-36,28-30,30-36,22-30,30-38,30-40,28-30,36-50,25-30,39-44@Route 20(water),5-39,35-39,5,10,10,15,15,15-20,35-39,5-15,25-35,20-40,25-35,25-35,10-40,37-42@Pokemon Mansion(cave),34,34,28-34,23-32,37-39,20-32,37-39,34-38,12-24@Route 21(water),5-39,35-39,5,10,10,15,15,15-20,35-39,5-15,25-35,20-40,25-35,25-35,10-40,37-42@Route 21(grass),20-35,28-30@Route 22(grass),2-4,2-6,3-5,3-4,6,7,4,3-4,3-4@Route 23(grass),26-34,38-45,26-34,34-38,38-45,26-34,34-38,38-45,26-34,34-38,32-34,44,26-34,34-44,32-34,34-42,33-43@Victory Road(cave),22-44,39-41,22-44,39-41,42-50,22-44,39-41,42-50,36-45,43,33-41,33-41,33-35,35-45,35,41-46,41-46@Cerulean Cave,52,53,52,46-55,55,52-54,49-54,49,55,45,46,49,46,53-60,54,52,50,52-60,56,52,50-55,52-61,46,55,30-50,40-55,30-55,40-55,38-39,39-40,38,39-40,38,51-56,51-56,@Cerulean Cave(Mewtwo),70@";
    private final String kantoConnections ="Route 1,Pallet Town,Viridian City@Route 2,Viridian City,Viridian City,Diglett's Cave@Viridian Forest,Route 2,Pewter City@Route 3,Pewter City,Mt. Moon@Mt. Moon,Route 3,Route 4@Route 4,Mt. Moon,Cerulean City@Route 24,Cerulean Cave,Cerulean City,Route 25@Route 25,Route 24,Sea Cottage@Route 5,Saffron City,Cerulean City@Route 6,Saffron City,Vermillion City@Route 11,Route 12,Vermillion City@Diglett's Cave,Route 2,Route 11@Route 9,Rock Tunnel,Route 9@Rock Tunnel,Rock Tunnel B1F,Route 10,Route 9@Rock Tunnel B1F,Rock Tunnel@Route 10,Rock Tunnel,Lavender Town,Power Plant@Pokemon Tower,Lavender Town@Route 8,Lavender Town,Saffron City@Route 7,Saffron City,Celadon City@Route 12,Lavender Town,Route 11,Route 13@Route 13,Route 12,Route 14@Route 14,Route 13,Route 15@Route 15,Route 14,Fuchsia City@Route 18,Route 17,Fuchsia City@Route 17,Route 18,Route 16@Route 16,Route 18,Route 17@Power Plant,Route 10@Route 19,Fuchsia City,Seaform Island(water)@Seafoam Islands(water),Route 19,Seafoam Islands(cave),Route 20@Seafoam Islands(cave),Seaform Island(water)@Route 20,Seaform Island(water)@Pokemon Mansion,Cinnabar Island@Route 21(water),Cinnabar Island,Route 21(grass)@Route 21(grass),Pallet Town,Route 21(water)@Route 22,Viridian City,Pokemon League Reception Gate@Route 23,Pokemon League Reception Gate@Victory Road,Route 23,Indigo Plateau@Cerulean Cave,Route 24,Cerulean Cave(Mewtwo)@Cerulean Cave(Mewtwo),Cerulean Cave@";
    private final String kantoTrainers = "Route 1,none@Route 2,none@Viridian Forest,Bug Catcher Rick,Bug Catcher Rick,Bug Catcher Doug,Bug Catcher Doug,Bug Catcher Doug,Bug Catcher Anthony@Route 3,Lass Janice,Lass Janice,Bug Catcher Colton,Bug Catcher Colton,Bug Catcher Colton,Youngster Ben,Youngster Ben,Bug Catcher Greg,Bug Catcher Greg,Bug Catcher Greg,Bug Catcher Greg,Youngster Calvin,Lass Sally,Lass Sally,Bug Catcher James,Bug Catcher James,Lass Robin@Mt. Moon,Bug Catcher Kent,Bug Catcher Kent,Lass Iris,Super Nerd Jovan,Super Nerd Jovan,Bug Catcher Robby,Bug Catcher Robby,Bug Catcher Robby,Lass Miriam,Lass Miriam,Youngster Josh,Youngster Josh,Youngster Josh,Hiker Marcos,Hiker Marcos,Hiker Marcos,Team Rocket Grunt Colton ,Team Rocket Grunt Colton ,Team Rocket Grunt Colton ,Team Rocket Grunt Greg,Team Rocket Grunt Greg,Team Rocket Grunt Ben,Team Rocket Grunt Ben,Team Rocket Grunt Steve,Team Rocket Grunt Steve,Super Nerd Miguel,Super Nerd Miguel,Super Nerd Miguel,Rocket Jessie & James,Rocket Jessie & James,Rocket Jessie & James@Route 4,Coach Trainer Oberon@Route 24,Bug Catcher Cale,Bug Catcher Cale,Bug Catcher Cale,Bug Catcher Cale,Lass Ali,Lass Ali,Lass Ali,Youngster Timmy,Youngster Timmy,Lass Reli,Lass Reli,Camper Ethan,Team Rocket Grunt John,Team Rocket Grunt John,Camper Shane,Camper Shane@Route 25,Hiker Franklin,Hiker Franklin,Hiker Wayne,Youngster Joey,Youngster Joey,Youngster Dan,Picnicker Kelsey,Picnicker Kelsey,Hiker Nob,Hiker Nob,Hiker Nob,Hiker Nob,Camper Flint,Camper Flint,Youngster Chad,Youngster Chad,Lass Haley,Lass Haley,Lass Haley@Route 5,none@Route 6,Bug Catcher Keigo,Bug Catcher Keigo,Bug Catcher Keigo,Camper Ricky,Picnicker Nancy,Picnicker Nancy,Bug Catcher Elijah,Picnicker Isabelle,Picnicker Isabelle,Picnicker Isabelle,Camper Jeff,Camper Jeff@Route 11,Youngster Eddie,Gamer Hugo,Gamer Hugo,Engineer Bernie,Engineer Bernie,Engineer Bernie,Youngster Dave,Youngster Dave,Youngster Dillon,Youngster Dillon,Gamer Jasper,Gamer Jasper,Engineer Braxton,Gamer Darian,Gamer Darian,Youngster Yasu,Youngster Yasu,Youngster Yasu,Gamer Dirk,Gamer Dirk@Diglett's Cave,none@Route 9,Picnicker Alicia,Picnicker Alicia,Picnicker Alicia,Hiker Jeremy,Hiker Jeremy,Camper Chris,Camper Chris,Bug Catcher Brent,Bug Catcher Brent,Bug Catcher Brent,Hiker Alan,Hiker Alan,Bug Catcher Conner,Bug Catcher Conner,Bug Catcher Conner,Camper Drew,Camper Drew,Camper Drew,Camper Drew,Hiker Brice,Hiker Brice,Hiker Brice,Picnicker Caitlin@Rock Tunnel,\tPokéManiac Ashton,PokéManiac Ashton,PokéManiac Winston,Picnicker Martha,Picnicker Martha,PokéManiac Steve,PokéManiac Steve,Hiker Allen,Hiker Eric,Hiker Eric,Hiker Lenny,Hiker Lenny,Hiker Lenny,Hiker Lenny,Hiker Oliver,Hiker Oliver,Hiker Oliver@Rock Tunnel B1F,Hiker Lucas,Hiker Lucas,Picnicker Sofia,Picnicker Sofia,Picnicker Sofia,Hiker Dudley,Hiker Dudley,Hiker Dudley,PokéManiac Cooper,PokéManiac Cooper,PokéManiac Cooper,Picnicker Leah,Picnicker Leah,Picnicker Ariana,Picnicker Ariana,Picnicker Ariana,Picnicker Ariana,Picnicker Dana,Picnicker Dana,Picnicker Dana@Route 10,Picnicker Heidi,Picnicker Heidi,PokéManiac Mark,PokéManiac Mark,Picnicker Carol,Picnicker Carol,Hiker Clark,Hiker Clark,Hiker Trent,Hiker Trent,PokéManiac Herman,PokéManiac Herman@Pokémon Tower,Channeler Hope,Channeler Patricia,Channeler Carly,Channeler Laurel,Channeler Laurel,Channeler Jody,Channeler Paula,Channeler Ruth,Channeler Tammy,Channeler Karina,Channeler Janae,Channeler Angelica,Channeler Angelica,Channeler Angelica,Channeler Jennifer,Channeler Emilia,Team Rocket Grunt 1,Team Rocket Grunt 1,Team Rocket Grunt 1,Team Rocket Grunt 2,Team Rocket Grunt 2,Team Rocket Grunt 3,Team Rocket Grunt 3,Team Rocket Grunt 3,Team Rocket Grunt 3@Route 8,Lass Julia,Lass Julia,Gamer Rich,Gamer Rich,Super Nerd Gleen,Super Nerd Gleen,Super Nerd Gleen,Twins Eli & Anne,Twins Eli & Anne,Lass Paige,Lass Paige,Super Nerd Leslie,Lass Andrea,Lass Andrea,Lass Andrea,Lass Megan,Lass Megan,Lass Megan,Lass Megan,Lass Megan,Biker Jaren,Biker Jaren,Biker Ricardo,Biker Ricardo,Biker Ricardo,Gamer Stan,Gamer Stan,Gamer Stan,Super Nerd Aidan,Super Nerd Aidan,Super Nerd Aidan,Super Nerd Aidan@Route 7,none@Route 12,Fisherman Ned,Fisherman Ned,Fisherman Ned,Fisherman Chip,Fisherman Chip,Fisherman Hank,Fisherman Elliot,Fisherman Elliot,Fisherman Elliot,Fisherman Elliot,Young Couple Gia & Jes,Young Couple Gia & Jes,Rocker Luca,Rocker Luca,Camper Justin,Camper Justin,Fisherman Andrew,Fisherman Andrew@Route 13,Picnicker Alma,Picnicker Alma,Picnicker Alma,Bird Keeper Sebastian,Bird Keeper Sebastian,Picnicker Susie,Picnicker Susie,Picnicker Susie,Picnicker Susie,Picnicker Susie,Beauty Lola,Beauty Lola,Beauty Lola,Beauty Sheila,Beauty Sheila,Picnicker Valerie,Picnicker Valerie,Picnicker Gwen,Picnicker Gwen,Picnicker Gwen,Picnicker Gwen,Bird Keeper Robert,Bird Keeper Robert,Bird Keeper Robert,Bird Keeper Robert,Bird Keeper Perry,Bird Keeper Perry,Bird Keeper Perry,Bird Keeper Perry,Bird Keeper Perry,Biker Jared,Biker Jared,Biker Jared@Route 14,Bird Keeper Carter,Bird Keeper Carter,Bird Keeper Carter,Bird Keeper Mitch,Bird Keeper Mitch,Bird Keeper Mitch,Bird Keeper Mitch,Bird Keeper Marlon,Bird Keeper Marlon,Bird Keeper Marlon,Bird Keeper Beck,Bird Keeper Beck,Bird Keeper Donald,Bird Keeper Benny,Bird Keeper Benny,Twins Kiri & Jan,Twins Kiri & Jan,Biker Gerald,Biker Gerald,Biker Malik,Biker Malik,Biker Isaac,Biker Isaac,Biker Isaac,Biker Lukas,Biker Lukas,Biker Lukas,Biker Lukas@Route 15,Picnicker Becky,Picnicker Becky,Crush Kin Ron & Mya,Crush Kin Ron & Mya,Picnicker Celia,Biker Ernest,Biker Ernest,Biker Ernest,Biker Ernest,Biker Ernest,Biker Alex,Biker Alex,Biker Alex,Beauty Grace,Beauty Grace,Beauty Olivia,Beauty Olivia,Picnicker Kindra,Picnicker Kindra,Picnicker Kindra,Bird Keeper Chester,Bird Keeper Chester,Bird Keeper Chester,Bird Keeper Edwin,Bird Keeper Edwin,Bird Keeper Edwin,Bird Keeper Edwin,Picnicker Yazmin,Picnicker Yazmin,Picnicker Yazmin@Route 18,Bird Keeper Jacob,Bird Keeper Jacob,Bird Keeper Jacob,Bird Keeper Jacob,Bird Keeper Wilton,Bird Keeper Wilton,Bird Keeper Ramiro@Route 17,Cue Ball Isaiah,Cue Ball Isaiah,Biker Virgil,Biker Virgil,Biker Virgil,Cue Ball Raul,Cue Ball Raul,Biker Billy,Cue Ball Jamal,Cue Ball Jamal,Cue Ball Jamal,Cue Ball Jamal,Biker Nikolas,Biker Nikolas,Cue Ball Zeek,Cue Ball Corey,Cue Ball Corey,Biker Jaxon,Biker Jaxon,Biker William,Biker William,Biker William,Biker William,Biker William@Route 16,Young Couple Lea & Jed,Young Couple Lea & Jed,Biker Lao,Biker Lao,Cue Ball Koji,Cue Ball Koji,Cue Ball Koji,Cue Ball Luke,Cue Ball Luke,Biker Hideo,Biker Ruben,Biker Ruben,Biker Ruben,Cue Ball Camron,Cue Ball Camron@Power Plant,none@Route 19,Swimmer♂ Richard,Swimmer♂ Richard,Swimmer♂ Reece,Swimmer♂ Reece,Swimmer♂ Reece,Swimmer♂ Tony,Swimmer♂ Tony,Swimmer♂ David,Swimmer♂ David,Swimmer♂ David,Swimmer♂ Douglas,Swimmer♂ Douglas,Swimmer♂ Douglas,Swimmer♂ Douglas,Swimmer♂ Matthew,Swimmer♂ Matthew,Sis and Brow Lia & Luc,Sis and Brow Lia & Luc,Swimmer♂ Axle,Swimmer♂ Axle,Swimmer♂ Axle,Swimmer♂ Axle,Swimmer♂ Axle,Swimmer♀ Alice,Swimmer♀ Alice,Swimmer♀ Anya,Swimmer♀ Anya,Swimmer♀ Anya,Swimmer♀ Anya,Swimmer♀ Anya,Swimmer♀ Connie,Swimmer♀ Connie,Swimmer♀ Connie@Seafoam Islands(water),none@Seafoam Islands(cave),none@Route 20,Swimmer♂ Barry,Swimmer♂ Barry,Swimmer♂ Darrin,Swimmer♂ Darrin,Swimmer♂ Darrin,Swimmer♂ Darrin,Swimmer♀ Shirley,Swimmer♀ Shirley,Swimmer♀ Shirley,Swimmer♀ Tiffany,Picnicker Irene,Picnicker Irene,Picnicker Irene,Bird Keeper Roger,Bird Keeper Roger,Bird Keeper Roger,Swimmer♀ Nora,Swimmer♀ Nora,Swimmer♀ Nora,Swimmer♂ Dean,Picnicker Missy,Picnicker Missy,Swimmer♀ Melissa,Swimmer♀ Melissa@Pokémon Mansion,none@Route 21(water),Sis and Bro Lil & Ian,Sis and Bro Lil & Ian,Swimmer♂ Spencer,Swimmer♂ Spencer,Swimmer♂ Jack,Swimmer♂ Roland,Swimmer♂ Roland,Swimmer♂ Roland,Swimmer♂ Jerome,Swimmer♂ Jerome@Route 21(grass),Fisherman Wade,Fisherman Wade,Fisherman Wade,Fisherman Wade,Fisherman Wade,Fisherman Wade,Fisherman Ronald,Fisherman Ronald,Fisherman Ronald,Fisherman Ronald,Fisherman Claude,Fisherman Claude,Fisherman Nolan,Fisherman Nolan@Route 22,none@Route 23,none@Victory Road,Cooltrainer Naomi,Cooltrainer Naomi,Cooltrainer Naomi,Cooltrainer Naomi,Cooltrainer Naomi,Cooltrainer Rolando,Cooltrainer Rolando,Cooltrainer Rolando,Cooltrainer Rolando,Cooltrainer Rolando,Black Belt Daisuke,Black Belt Daisuke,Black Belt Daisuke,Juggler Nelson,Juggler Nelson,Juggler Nelson,Juggler Nelson,Tamer Vincent,Tamer Vincent,Juggler Gregory,Cooltrainer George,Cooltrainer George,Cooltrainer George,Cooltrainer George,Cooltrainer George,PokéManiac Dawson,PokéManiac Dawson,PokéManiac Dawson,Cooltrainer Alexa,Cooltrainer Alexa,Cooltrainer Alexa,Cooltrainer Alexa,Cooltrainer Alexa,Cooltrainer Colby,Cooltrainer Colby,Cooltrainer Colby,Cooltrainer Colby,Cooltrainer Colby,Cooltrainer Caroline,Cooltrainer Caroline,Cooltrainer Caroline,Cooltrainer Caroline,Cooltrainer Caroline,Cool Couple Ray & Tyra,Cool Couple Ray & Tyra@Cerulean Cave,none@Cerulean Cave(Mewtwo),none@";
    private final String kantoTrainerPokemons = "Route 1,none@Route 2,none@Viridian Forest,Weedle,Caterpie,Weedle,Kakuna,Weedle,Weedle@Route 3,Pidgey,Pidgey,Caterpie,Weedle,Caterpie,Tattata,Ekans,Weedle,Kakuna,Caterpie,Metapod,Spearow,Rattata,Nidoran♀,Caterpie,Metapod,Jigglypuff@Mt. Moon,Weedle,Kakuna,Clefairy,Magnemite,Voltorb,Caterpie,Metapod,Caterpie,Oddish,Bellsprout,Rattata,Rattata,Zubat,Geodude,Geodude,Onix,Sandshrew,Rattata,Zubat,Zubat,Ekans,Rattata,Sandshrew,Rattata,Zubat,Grimer,Voltorb,Koffing,Ekans,Koffing,Meowth@Route 4,Meowth@Route 24,Caterpie,Weedle,Metapod,Kakuna,Pidgey,Oddish,Bellsprout,Sandshrew,Ekans,Nidoran♂,Nidoran♀,Mankey,Ekans,Zubat,Rattata,Ekans@Route 25,Machop,Geodude,Onix,Rattata,Spearow,Slowpoké,Nidoran♂,Nidoran♀,Geodude,Geodude,Machop,Geodude,Rattata,Ekans,Ekans,Sandshrew,Oddish,Pidgey,Oddish@Route 5,none@Route 6,Weedle,Caterpie,Weedle,Squirtle,Rattata,Pikachu,Butterfree,Pidgey,Pidgey,Pidgey,Spearow,Raticate@Route 11,Ekans,Poliwag,Horsea,Magnemite,Magnemite,Magneton,Nidoran♂,Nidorino,Sandshrew,Zubat,Bellsprout,Oddish,Magnemite,Growlithe,Vulpix,Rattata,Rattata,Raticate,Voltorb,Magnemite@Diglett's Cave,none@Route 9,Oddish,Bellsprout,Oddish,Bellsprout,Machop,Onix,Growlithe,Charmander,Beedrill,Beedrill,Geodude,Onix,Caterpie,Weedle,Venonat,Rattata,Sandshrew,Ekans,Sandshrew,Geodude,Geodude,Machop,Meowth@Rock Tunnel,Cubone,Slowpoke,Slowpoke,Oddish,Bulbasaur,Charmander,Cubone,Geodude,Machop,Onix,Geodude,Machop,Geodude,Geodude,Onix,Onix,Geodude@Rock Tunnel B1F,Geodude,Graveler,Jigglypuff,Pidgey,Meowth,Geodude,Geodude,Graveler,Slowpoke,Slowpoke,Slowpoke,Bellsprout,Clefairy,Pidgey,Rattata,Rattata,Bellsprout,Meowth,Oddish,Pidgey@Route 10,Pikachu,Clefairy,Rhyhorn,Lickitung,Pidgey,Pidgeotto,Geodude,Onix,Onix,Graveler,Cubone,Slowpoke@Pokémon Tower,Gastly,Gastly,Gastly,Gastly,Gastly,Gastly,Gastly,Gastly,Haunter,Gastly,Gastly,Gastly,Gastly,Gastly,Gastly,Gastly,Zubat,Zubat,Golbat,Koffing,Drowzee,Zubat,Rattata,Raticate,Zubat@Route 8,Clefairy,Clefairy,Growlithe,Vulpix,Grimer,Muk,Grimer,Clefairy,Jigglypuff,Nidoran♀,Nidorina,Koffing,Meowth,Meowth,Meowth,Pidgey,Rattata,Nidoran♂,Meowth,Pikachu,Grimer,Grimer,Koffing,Koffing,Grimer,Poliwag,Poliwag,Poliwhirl,Voltorb,Voltorb,Magnemite,Koffing@Route 7,none@Route 12,Goldeen,Poliwag,Goldeen,Tentacool,Goldeen,Goldeen,Poliwag,Shellder,Goldeen,Horsea,Nidoran♂,Nidoran♀,Voltorb,Electrode,Nidoran♂,Nidoran♀,Magikarp,Magikarp@Route 13,Goldeen,Poliwag,Horsea,Pidgey,Pidgeotto,Pidgey,Meowth,Rattata,Pikachu,Meowth,Rattata,Pikachu,Rattata,Clefairy,Meowth,Poliwag,Poliwag,Pidgey,Meowth,Pidgey,Pidgeotto,Pidgey,Pidgeotto,Spearow,Fearow,Spearow,Pidgey,Pidgey,Spearow,Spearow,Koffing,Koffing,Koffing@Route 14,Pidgey,Doduo,Pidgeotto,Pidgey,Spearow,Pidgey,Fearow,Spearow,Doduo,Fearow,Pidgeotto,Fearow,Farfetch'd,Spearow,Fearow,Charmander,Squirtle,Koffing,Muk,Koffing,Grimer,Grimer,Grimer,Koffing,Koffing,Koffing,Grimer,Koffing@Route 15,Pikachu,Raichu,Hitmonchan,Hitmonlee,Clefairy,Koffing,Koffing,Weezing,Koffing,Grimer,Koffing,Grimer,Weezing,Pidgeotto,Wigglytuff,Bulbasaur,Ivysaur,Gloom,Oddish,Oddish,Dodrio,Doduo,Doduo,Pidgeotto,Farfetch'd,Doduo,Pidgey,Bellsprout,Oddish,Tangela@Route 18,Spearow,Spearow,Fearow,Spearow,Spearow,Fearow,Dodrio@Route 17,Machop,Machamp,Weezing,Koffing,Weezing,Mankey,Primeape,Muk,Mankey,Mankey,Machamp,Machop,Voltorb,Voltorb,Machoke,Primeape,Machoke,Weezing,Muk,Koffing,Weezing,Koffing,Weezing,Koffing@Route 16,Rapidash,Ninetales,Grimer,Koffing,Machop,Mankey,Machop,Mankey,Machop,Weezing,Weezing,Koffing,Weezing,Mankey,Machop@Power Plant,none@Route 19,Tentacool,Shellder,Goldeen,Horsea,Staryu,Horsea,Horsea,Goldeen,Shellder,Seaking,Horsea,Tentacool,Tentacool,Goldeen,Poliwag,Poliwhirl,Goldeen,Seaking,Tentacool,Tentacool,Staryu,Horsea,Tentacruel,Goldeen,Seaking,Poliwag,Goldeen,Seaking,Goldeen,Poliwag,Staryu,Staryu,Staryu@Seafoam Islands(water),none@Seafoam Islands(cave),none@Route 20,Shellder,Cloyster,Horsea,Horsea,Horsea,Seadra,Seadra,Horsea,Seadra,Seaking,Tentacool,Horsea,Seel,Fearow,Fearow,Pidgeotto,Shellder,Shellder,Cloyster,Staryu,Goldeen,Seaking,Poliwag,Seaking@Pokémon Mansion,none@Route 21(water),Seadra,Starmie,Seadra,Tentacruel,Starmie,Poliwhirl,Tentacool,Seadra,Staryu,Wartortle@Route 21(grass),Magikarp,Magikarp,Magikarp,Magikarp,Magikarp,Magikarp,Seaking,Goldeen,Seaking,Seaking,Shellder,Cloyster,Seaking,Goldeen@Route 22,none@Route 23,none@Victory Road,Persian,Ponyta,Rapidash,Vulpix,Ninetales,Raticate,Ivysaur,Wartortle,Charmeleon,Charizard,Machoke,Machop,Machoke,Drowzee,Hypno,Kadabra,Kadabra,Persian,Golduck,Mr. Mime,Exeggutor,Sandslash,Cloyster,Electrode,Arcanine,Charmeleon,Lapras,Lickitung,Clefairy,Jigglypuff,Persian,Dewgong,Chansey,Kingler,Poliwhirl,Tentacruel,Seadra,Blastoise,Bellsprout,Weepinbell,Victreebel,Paras,Parasect,Nidoking,Nidoqueen@Cerulean Cave,none@Cerulean Cave(Mewtwo),none@";
    private final String kantoTrainerPokemonLevels = "Route 1,none@Route 2,none@Viridian Forest,6,6,7,7,7,9@Route 3,9,9,10,10,10,11,11,9,9,9,9,14,10,10,11,11,14@Mt. Moon,11,11,14,11,11,10,10,10,11,11,10,10,10,10,10,10,11,11,11,11,11,13,13,13,13,12,12,12,14,14,14@Route 4,13@Route 24,10,10,10,10,12,12,12,14,14,16,16,18,15,15,14,15@Route 25,15,15,17,15,15,17,15,15,13,13,13,13,14,14,14,14,13,13,13@Route 5,none@Route 6,16,16,16,20,16,16,20,16,16,16,16,16@Route 11,21,18,18,18,18,18,18,18,19,19,18,18,21,18,18,17,17,17,18,18@Diglett's Cave,none@Route 9,18,18,18,18,20,20,21,21,19,19,21,21,20,20,20,19,19,19,19,20,20,20,23@Rock Tunnel,23,23,25,22,22,22,22,25,20,20,19,19,19,19,20,20,20@Rock Tunnel B1F,21,21,21,21,21,21,21,21,20,20,20,22,22,19,19,19,19,20,20,20@Route 10,20,20,29,29,21,21,21,21,19,19,20,20@Pokémon Tower,23,22,24,23,23,22,24,22,23,24,22,22,22,22,24,24,25,25,25,26,26,23,23,23,23@Route 8,22,22,24,24,22,22,22,22,22,23,23,26,24,24,24,19,19,19,19,19,24,24,22,22,23,22,22,22,20,20,20,20@Route 7,none@Route 12,22,22,22,24,24,27,21,21,21,21,24,24,29,29,29,29,24,24@Route 13,28,28,28,29,24,24,24,24,24,24,27,27,27,29,29,30,30,27,27,27,27,26,26,26,26,25,25,25,25,25,28,28,28@Route 14,28,28,28,26,26,26,26,28,28,28,29,29,33,29,29,29,29,29,29,29,29,28,28,28,26,26,26,26@Route 15,29,29,29,29,33,25,25,25,25,25,28,28,28,29,29,29,29,28,28,29,28,28,28,26,26,26,26,29,29,29@Route 18,26,26,26,26,29,29,34@Route 17,29,29,28,28,28,29,29,33,26,26,26,26,29,29,33,29,29,29,29,25,25,25,25,25@Route 16,29,29,29,29,28,28,28,29,29,33,28,28,28,29,29@Power Plant,none@Route 19,30,30,29,29,29,30,30,29,29,29,27,27,27,27,30,30,30,30,27,27,27,27,27,30,30,27,27,27,27,27,29,29,29@Seafoam Islands(water),none@Seafoam Islands(cave),none@Route 20,31,31,28,28,28,28,30,30,30,35,30,30,30,30,30,30,30,30,30,35,31,31,31,31@Pokémon Mansion,none@Route 21(water),33,33,33,33,37,32,32,32,33,33@Route 21(grass),27,27,27,27,27,27,28,28,28,28,31,31,33,33@Route 22,none@Route 23,none@Victory Road,42,42,42,42,42,42,42,42,42,42,43,43,43,41,41,41,41,44,44,48,42,42,42,42,42,40,40,40,42,42,42,42,42,41,42,42,42,43,42,42,42,42,42,45,45@Cerulean Cave,none@Cerulean Cave(Mewtwo),none@";
    
    private Random random = new Random();
    /*Route information */
    public String name = "";
    public String region = "";
    private String[] routePokemon;
    private int[] routePokemonPercents;
    private String[] routePokemonLevels;
    private String[] routeConnections;
    private Trainer[] routeTrainers;
    private String[] routeTrainerPokemon;
    private int[] routeTrainerPokemonLevels;
    

    /* removed changed keep findRoute(String) to not need to be seperate from findRouteInfo(String)
    private int kantoPokemonIndex = 0;
    private int kantoPokemonSpawnPercentIndex = 0;
    private int kantoPokemonSpawnLevelsIndex = 0;
    private int kantoTrainersIndex = 0;
    private int kantoTrainerPokemonIndex = 0;
    private int kantoTrainerPokemonLevelsIndex = 0; 
    */

    public Route(String region, String name, ArrayList<Pokemon> pokemonList) {

        this.name = name;
        this.region = region;
        String routePokemon ="";
        String routePokemonPercents ="";
        String routePokemonLevels ="";
        String routeConnections ="";
        String routeTrainer ="";
        String[] routeTrainers;
        String routeTrainerPokemon ="";
        String routeTrainerPokemonLevels ="";
        String[] temp;

        /*Kanto Region(Red, Blue, Green, Yellow) */
        if(region.equalsIgnoreCase("Kanto")){
            //parse out the pokemon found on the route
            routePokemon = findRoute(kantoPokemon);
            temp = routePokemon.split(",");
            this.routePokemon = new String[temp.length-1];
            for(int i = 1; i < temp.length; i++) {
                this.routePokemon[i] = temp[i];
            }

            //parse out the pokemon spawn rates on the route
            routePokemonPercents = findRoute(kantoPokemonSpawnPercent);
            temp = routePokemonPercents.split(",");
            this.routePokemonPercents = new int[temp.length-1];
            for(int i = 1; i < temp.length; i++){
                this.routePokemonPercents[i] = Integer.parseInt(temp[i]);
            }

            //parse out the pokemon spawn levels on the route
            routePokemonLevels = findRoute(kantoPokemonSpawnLevels);
            temp = routePokemonLevels.split(",");
            for(int i = 1; i < temp.length; i++) {
                this.routePokemonLevels[i-1] = temp[i];
            }

            //parse out route connections
            routeConnections = findRoute(kantoConnections);
            temp = routeConnections.split(",");
            for(int i = 1; i < temp.length; i++) {
                this.routeConnections[i-1] = temp[i];
            }

            //parse out the route Trainers
            routeTrainer = findRoute(kantoTrainers);
            temp = routeTrainer.split(",");
            routeTrainers = temp;

            //parse out the route Trainer's Pokemon(s)
            routeTrainerPokemon = findRoute(kantoTrainerPokemons);
            temp = routeTrainerPokemon.split(",");
            for(int i = 1; i < temp.length; i++) {
                this.routeTrainerPokemon[i-1] = temp[i];
            }

            //parse out the route Trainer's Pokemon Level(s)
            routeTrainerPokemonLevels = findRoute(kantoTrainerPokemonLevels);
            temp = routeTrainerPokemonLevels.split(",");
            this.routeTrainerPokemonLevels = new int[temp.length-1];
            for(int i = 1; i < temp.length; i++){
                this.routeTrainerPokemonLevels[i-1] = Integer.parseInt(temp[i]);
            }
            

            //create the trainer
            String last = routeTrainers[0];
            if(!last.equalsIgnoreCase("none")){
                int numTrainers = 1;
                for (int i = 1; i < routeTrainers.length; i++) {
                    if(!routeTrainers[i].equalsIgnoreCase(last)){
                        last = routeTrainers[i];
                        numTrainers++;
                    }
                }
                createTrainers(routeTrainers, numTrainers, pokemonList);
            }
        
        }
        if(routePokemon.equals("") || routePokemonPercents.equals("") || routePokemonLevels.equals("")){
            System.out.println("ERROR: route not found");
            System.out.println("routePokemon = " + routePokemon);
            System.out.println("routePokemonPercents = " + routePokemonPercents);
            System.out.println("routePokemonLevels = " + routePokemonLevels);
            System.out.println("routePokemonLevels = " + routePokemonLevels);
            System.out.println("routeConnections = " + routeConnections);
            System.out.println("routeTrainerPokemon = " + routeTrainerPokemon);
            System.out.println("routeTrainerPokemonLevels = " + routeTrainerPokemonLevels + "\n\n\n");
            System.out.println("Since something went wrong this route is now route 1 it said it was \"" + name + "\" but something about that didn't work. Enjoy the easy route. ;)\n");
            //need to make it so error routes become route 1
        }
        else{
            System.out.println("Route: " + name + " was made succefully.");
        }
    }

    /**
     * @param trainers
     * @param numTrainers
     * @param pokemonList
     * creates the trainers on the route
     * 
     *      private Trainer[] routeTrainers;
            private String[] routeTrainerPokemon;
            private int[] routeTrainerPokemonLevels;
     */
    private void createTrainers(String[] trainers, int numTrainers, ArrayList<Pokemon> pokemonList) {
        this.routeTrainers = new Trainer[numTrainers];
        String current = trainers[0];
        int num = 0;

        /*Make the first trainer and give them their first pokemon */
        if(current.contains("♀")){
            this.routeTrainers[num] = new Trainer(trainers[num], false);
        }
        else{
            this.routeTrainers[num] = new Trainer(trainers[num], true);
        }
        this.routeTrainers[num].addPokemon(makePokemon(pokemonList, routeTrainerPokemon[num], routeTrainerPokemonLevels[num]));
        

        for (int i = 1; i < trainers.length; i++) {
            if(current.equalsIgnoreCase(trainers[i])){
                this.routeTrainers[num].addPokemon(makePokemon(pokemonList, routeTrainerPokemon[i], routeTrainerPokemonLevels[i]));
            }
            else{
                num++;
                current = trainers[i];
                if(current.contains("♀")){
                    this.routeTrainers[num] = new Trainer(current, false);
                }
                else{
                    this.routeTrainers[num] = new Trainer(current, true);
                }
                this.routeTrainers[num].addPokemon(makePokemon(pokemonList, routeTrainerPokemon[i], routeTrainerPokemonLevels[i]));
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
        p.levelTo(1);
        return p;
    }

    /**
     * @param info
     * @return The route/cave info of given string
     */
    private String findRoute(String info){
        int index = 0;
        int i = 0;
        for(i = 0; i < info.length() - name.length() ; i++){
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
    }

    /**
     * Deprecated
     * @param routeInfo
     * @param index
     * @return part of the string that is about the route 
     
    private String getRouteInfo(String routeInfo, int index){
        int i = 0;
        String temp = "";
        while(info.charAt(i) != '@'){
            temp = info.substring(index, i);
            i++;
        }
        if(temp.length() > 0)
            return temp;

        return "";
    }*/

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

    /**
     * @return connections to the route(cities/route/caves)
     */
    public String[] connections(){
        return routeConnections;
    }

}
