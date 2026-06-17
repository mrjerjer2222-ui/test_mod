package io.github.mrjerjer2222_ui.java;

public class Cow extends Entity{
    Cow(String nameGiven) {
        super(nameGiven);
    }
    @Override
    public String toString() {
        return this.name + " is a cow with health " + this.health;
    }
}
