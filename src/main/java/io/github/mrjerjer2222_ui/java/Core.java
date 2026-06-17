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
        int x = 99;
        x *=5;
        System.out.println(x);
        System.out.println(xIsANumber(x, true));
        System.out.println(xIsANumber(x, false));

    }

    static int xIsANumber(int value, boolean first) {
        if (first) {
            return value /= 2;
        }
        else if (!first && value <=300) {
            return value /= 3;
        }
        else {
            return 0;
        }

//        return -1;
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
