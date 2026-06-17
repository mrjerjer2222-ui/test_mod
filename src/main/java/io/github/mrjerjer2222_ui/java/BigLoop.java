package io.github.mrjerjer2222_ui.java;

public class BigLoop {
    public static void main(String[] args) {
        int countdown = 30;

        do {
            doTheThing(countdown);
            countdown--;
        } while (countdown > 0);
    }
    static void doTheThing(int countdown) {
        System.out.println("hello " + countdown);

    }
}
