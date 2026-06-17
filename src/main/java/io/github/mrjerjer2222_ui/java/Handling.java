package io.github.mrjerjer2222_ui.java;

import java.util.Arrays;

public class Handling {
    public static void main(String[] args) {
        int[] position = new int[] {0, 0, 0};

        try {
            position[0] =55;
        } catch (Exception e) {
            System.out.println("exception caught");
        } finally {
            System.out.println("ran final statement");
        }

        System.out.println(Arrays.toString(position));
    }
}
