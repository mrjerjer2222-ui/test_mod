package io.github.mrjerjer2222_ui.java;

public class Person {

    static final int YEAR = 2026;
    float health = 20.0f;
    final String name;

    Person(String nameGiven) {
        this.name = nameGiven;

    }

    public static void main(String[] args) {
        System.out.println(Person.YEAR);


        Person person1 = new Person("lemillion");
        Person person2 = new Person("Jason");
        person2.health -= 2.0f;

        System.out.println("p1 " + person1.toString());
        System.out.println("p2 " + person2.toString());
    }

    @Override
    public String toString() {
        return this.name + " with health " + this.health;
    }
}
