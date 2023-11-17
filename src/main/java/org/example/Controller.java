package org.example;

import java.util.Scanner;

public class Controller {
    public void start() {
        Scanner main_menu = new Scanner(System.in);
        System.out.println("Welcome to the main menu. Please select an option below.");

        //while loop to keep the program running until the user decides to exit
        //Option1: Start Game
        //option 2: Settings
        //option 3: Exit

        while (true) {
            System.out.println("1. Start Game");
            System.out.println("2. Settings");
            System.out.println("3. Exit");
            int user_input = main_menu.nextInt();
            if (user_input == 1) {
                //Inherit Game_Mode class
                Game_Mode.Mode();
                break;
            } else if (user_input == 2) {
                System.out.println("Settings...");
                break;
            } else if (user_input == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

    }


}
