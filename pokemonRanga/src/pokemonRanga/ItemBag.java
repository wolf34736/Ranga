package pokemonRanga;

import java.util.ArrayList;

public class ItemBag {
    private ArrayList<Healing> healing = new ArrayList<>();
    private ArrayList<Integer> healingNum = new ArrayList<>();
    private ArrayList<Pokeball> balls = new ArrayList<>();
    private ArrayList<Integer> ballsNum = new ArrayList<>();
    private ArrayList<String> TMs = new ArrayList<>();
    private ArrayList<String> HMs = new ArrayList<>();
    

    public ItemBag(){
        healing.add(new Healing("potion"));
        healingNum.add(1);

    }

}
