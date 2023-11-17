package org.example;

import org.example.Single_Player.Single_Mode;

import java.util.Scanner;

public class Game_Mode {

    public static void Mode() {
        Scanner Game_Mode = new Scanner(System.in);
        System.out.println("Select game mode:");
        System.out.println("1. Single Player");
        System.out.println("2. Multiplayer");
        final int game_mode = Game_Mode.nextInt();

        if (game_mode == 1) {
            System.out.println("Starting single player game...");
            Single_Mode.Beginning();
        } else if (game_mode == 2) {
            System.out.println("Starting multiplayer game...");
        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }
}


