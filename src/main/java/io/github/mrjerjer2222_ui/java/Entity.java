package io.github.mrjerjer2222_ui.java;

public class Entity {

    static final int YEAR = 2026;
    float health = 20.0f;
    final String name;

    Entity(String nameGiven) {
        this.name = nameGiven;

    }

    public static void main(String[] args) {
        System.out.println(Entity.YEAR);

        Entity[] entities = new Entity[]{new Cow("cow"), new Human("human")};
        entities[1].health -= 2.0f;
        for (int i = 0; i < entities.length; i++) {
            System.out.println(i + " " + entities[i].toString());
        }
    }

    @Override
    public String toString() {
        return this.name + " with health " + this.health;
    }
}
