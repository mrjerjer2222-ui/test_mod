package io.github.mrjerjer2222_ui.java;

public class Core {

    public static void main(String[] args) {
        String firstName = "lemillion";
        String lastName = "robin";
        String personName = firstName + " " + lastName;
        System.out.println(personName);
        boolean isAPerson = isAPersonValue(firstName);
        System.out.println(isAPerson);
        System.out.println();
        System.out.println(firstName);
        doSomething();

    }

    static boolean isAPersonValue(String value) {

        value += "robin";
        return value.equalsIgnoreCase("lemillion");

    }
    static void doSomething() {
        System.out.println("did something");
        System.out.println("did something");
        System.out.println("did another thing");

    }
}
