package com.example.user.foragelistview;

/**
 * Created by user on 20/09/2017.
 */

public class Forage {
    private Enum<Edible> type;
    private String name;
    private Enum<Season> seasonAvailable;

    public Forage(Enum<Edible> type, String name, Enum<Season> seasonAvailable){
        this.type = type;
        this.name = name;
        this.seasonAvailable = seasonAvailable;
    }

    public Enum<Edible> getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Enum<Season> getSeasonAvailable() {
        return seasonAvailable;
    }

}
