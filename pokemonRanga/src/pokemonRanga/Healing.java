package pokemonRanga;

class Healing {
    public String name;
    public boolean healStatus = false;
    public boolean healHP = false;
    public int heals = 0;
    public String statusHealed = "none";


    public Healing(String s){
        name = s;
        s = s.toLowerCase();
        // potions
        if(s.contains("potion")){
            healHP = true;
            if(s.contains("max")){
                heals = Integer.MAX_VALUE;
            }
            else if(s.contains("hyper")){
                heals = 120;
            }
            else if(s.contains("super")){
                heals = 60;
            }
        }
        //full restore
        else if(s.contains("restore")){
                healHP = true;
                heals = Integer.MAX_VALUE;
                statusHealed = "all non-volatile";
                healStatus = true;
        }
        //status healers with "heal" in name
        else if(s.contains("heal")){
            if(s.contains("full")){

                statusHealed = "all non-volatile";
                healStatus = true;
            }
            else if(s.contains("burn")){
                statusHealed = "burn";
                healStatus = true;
            }
            else if(s.contains("ice")){
                statusHealed = "freeze";
                healStatus = true;
            }
            else if(s.contains("paralyze")){
                statusHealed = "paralysis";
                healStatus = true;
            }
        }
        //Antidote for poison
        else if(s.contains("antidote")){
            statusHealed = "poison";
            healStatus = true;
        }
        //Antidote for sleep
        else if(s.contains("awakening")){
            statusHealed = "sleep";
            healStatus = true;
        }
    }
    
}
