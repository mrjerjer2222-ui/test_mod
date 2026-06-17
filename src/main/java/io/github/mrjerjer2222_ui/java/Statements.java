package io.github.mrjerjer2222_ui.java;

import java.util.Arrays;

public class Statements {

    public static void main(String[] args) {

        int x = 55, y = 12, z = 11;
        int[] position = new int[]{x, y, z};
        x = 20;
        System.out.println(x + " " + y + " " + z);

        position[2] = 43;

        System.out.println(Arrays.toString(position));
        for (int i = 0; i < position.length; i++) {
            System.out.println(i + " " + position[i]);
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }


    }
}
