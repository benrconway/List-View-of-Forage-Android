package com.example.user.foragelistview;

import java.util.ArrayList;

/**
 * Created by user on 20/09/2017.
 */

public class FavouriteForage {
    private ArrayList<Forage> guide;

    public FavouriteForage(){
        this.guide = new ArrayList<>();
        guide.add(new Forage(Edible.FRUIT, "Blackberry", "Summer"));
        guide.add(new Forage(Edible.MUSHROOM, "Chantarelles", "Autumn"));
        guide.add(new Forage(Edible.MUSHROOM, "Cep", "Autumn"));
        guide.add(new Forage(Edible.MUSHROOM, "Giant Polypore", "Autumn"));
        guide.add(new Forage(Edible.FRUIT, "Blueberry", "Summer"));
        guide.add(new Forage(Edible.FRUIT, "Raspberry", "Summer"));
        guide.add(new Forage(Edible.GREENS, "Samphire", "Spring"));
        guide.add(new Forage(Edible.FRUIT, "Strawberry", "Summer"));
        guide.add(new Forage(Edible.GREENS, "Fool's Watercress", "Winter"));
        guide.add(new Forage(Edible.GREENS, "Greater Plantain", "Winter"));
        guide.add(new Forage(Edible.GREENS, "Rose-bay Willow Herb", "Spring"));
        guide.add(new Forage(Edible.GREENS, "Ground Elder", "Spring"));
        guide.add(new Forage(Edible.MUSHROOM, "Hedgehog Fungus", "Autumn"));
        guide.add(new Forage(Edible.GREENS, "Chickweed", "Spring"));
        guide.add(new Forage(Edible.GREENS, "Herb Robert", "Spring"));
        guide.add(new Forage(Edible.GREENS, "Nettle", "Spring"));
        guide.add(new Forage(Edible.MUSHROOM, "Dryad's Saddle", "Summer"));
    }

    public ArrayList<Forage> getGuide() {
        return new ArrayList<>(guide);
    }
}
