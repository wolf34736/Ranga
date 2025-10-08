package pokemonRanga;

import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {
    public String name;
    public boolean boy;
    public Pokemon[] team = new Pokemon[6];
    public ArrayList<Pokemon> box = new ArrayList<>();
    public ItemBag iventory;
    public Badge kantoEarned[]  = new Badge[8];


    /**
     * @param name
     * @param boy
     */
    public Trainer(String name, boolean boy){
        this.name = name;
        this.boy = boy;
        for(int i = 0; i < team.length; i++){
            team[i] = null;
        }
    }


    

    /**
     * removes a pokemon from team if it exist and adds it to the box
     * says an error message if it didn't work
     * @param p
     * @return
     */
    public boolean removePokemon(String p){
        
        for(int i = 0; i < team.length; i++){
            if(team[i].getNameShown().equalsIgnoreCase(p)){
                box.add(team[i]);
                team[i] = null;
                return true;
            }
        }
        System.out.println(p + "isn't on the team");
        return false;
    }

    /**
     * adds a pokemon to trainer's team or box(calls to teamFull)
     * @param p
     */
    public void addPokemon(Pokemon p){
        int total = 0;
        for(Pokemon t: team){
            if(t != null)
                total++;
        }
        if(total < 6){
            team[total] = p;
        }
        else{
            teamFull(p);
        }
    }

    /**
     * handle when the trainers team is full
     * can replace one pokemon with the new pokemon 'p'
     * can send it to the box
     * @param p
     */
    private void teamFull(Pokemon p){
        
        String numbers = "123456";
        String choice = askQuestion("Do you want to replace or send to the box? answer with \"replace\" or \"box\"");
        if(choice.equalsIgnoreCase("replace")){
            do{
                int total = 0;
                for(Pokemon t: team){
                    total++;
                    System.out.println(total + ") " + t.getNameShown());
                }
                choice = askQuestion("Which pokemon do you want to switch out?(1-6)");
                if(!numbers.contains(choice.charAt(0) + ""))
                    System.out.println("You entered an invalid answer you should type 1, 2, 3, 4, 5, or 6");
            }
            while (!numbers.contains(choice.charAt(0) + ""));
            int slot = Integer.parseInt(choice.charAt(0) + "");
            box.add(team[slot]);
            System.out.println(team[slot].getNameShown() + " has been sent to the box.\n" + p.getNameShown() + " has been added to the team.");
            team[slot] = p;
        }
        else if(choice.equalsIgnoreCase("box")){
            box.add(p);
            System.out.println(p.getNameShown() + " was sent to the box.");
        }
        teamFull(p);
    }

    /**
     * handles answering questions and returns the answer
     * @param question
     * @return answer
     */
    private String askQuestion(String question){
        Scanner input = new Scanner(System.in);
        System.out.println(question);
        String s = input.nextLine();
        input.close();
        return s;
    }
}
