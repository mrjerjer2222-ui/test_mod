package io.github.mrjerjer2222_ui.java;

public class Human extends Entity{
    Human(String nameGiven) {
        super(nameGiven);
    }
    @Override
    public String toString() {
        return this.name + " is a human with health " + this.health;
    }
}
