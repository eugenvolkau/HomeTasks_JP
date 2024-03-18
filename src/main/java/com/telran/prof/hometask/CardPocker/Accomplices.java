package com.telran.prof.hometask.CardPocker;

import java.util.Scanner;

public class Accomplices {

    final Scanner sc = new Scanner(System.in);

    int players;

    public int playaccomp(int numberOfCards, int cardsForPlayer) {
        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("players   " + players);
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }
        return players;
    }
}