package com.company;

public class Character {

    protected String characterType;
    protected int lifeMax;
    protected int life;
    protected int atk;

    public Character(String characterType, int lifeMax, int life, int atk) {
        this.characterType = characterType;
        this.lifeMax = lifeMax;
        this.life = life;
        this.atk = atk;
    }

    public String getCharacterType() {
        return characterType;
    }

    public int getLifeMax() {
        return lifeMax;
    }

    public int getLife() {
        return life;
    }

    public int getAtk() {
        return atk;
    }
}
