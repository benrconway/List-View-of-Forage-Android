package com.example.user.foragelistview;

import java.util.ArrayList;

/**
 * Created by user on 20/09/2017.
 */

public class FavouriteForage {
    private ArrayList<Forage> guide;

    public FavouriteForage(){
        this.guide = new ArrayList<>();
        guide.add(new Forage(Edible.FRUIT, "Blackberry", Season.SUMMER));
        guide.add(new Forage(Edible.MUSHROOM, "Chantarelles", Season.AUTUMN));
        guide.add(new Forage(Edible.MUSHROOM, "Cep", Season.AUTUMN));
        guide.add(new Forage(Edible.MUSHROOM, "Giant Polypore", Season.AUTUMN));
        guide.add(new Forage(Edible.FRUIT, "Blueberry", Season.SUMMER));
        guide.add(new Forage(Edible.FRUIT, "Raspberry", Season.SUMMER));
        guide.add(new Forage(Edible.GREENS, "Samphire", Season.SPRING));
        guide.add(new Forage(Edible.FRUIT, "Strawberry", Season.SUMMER));
        guide.add(new Forage(Edible.GREENS, "Fool's Watercress", Season.WINTER));
        guide.add(new Forage(Edible.GREENS, "Greater Plantain", Season.WINTER));
        guide.add(new Forage(Edible.GREENS, "Rose-bay Willow Herb", Season.SPRING));
        guide.add(new Forage(Edible.GREENS, "Ground Elder", Season.SPRING));
        guide.add(new Forage(Edible.MUSHROOM, "Hedgehog Fungus", Season.AUTUMN));
        guide.add(new Forage(Edible.GREENS, "Chickweed", Season.SPRING));
        guide.add(new Forage(Edible.GREENS, "Herb Robert", Season.SPRING));
        guide.add(new Forage(Edible.GREENS, "Nettle", Season.SPRING));
        guide.add(new Forage(Edible.MUSHROOM, "Dryad's Saddle", Season.SUMMER));
    }

    public ArrayList<Forage> getGuide() {
        return new ArrayList<Forage>(guide);
    }
}
