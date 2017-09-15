package com.example.kelseyde.olympicgames.Medals;

import java.util.ArrayList;

public abstract class Medal {

    private MedalType medalType;

    public Medal(MedalType medalType) {
        this.medalType = medalType;
    }

    //getters and setters

    public MedalType getMedalType() {
        return medalType;
    }

    public void setMedalType(MedalType medalType) {
        this.medalType = medalType;
    }

    //methods

}
