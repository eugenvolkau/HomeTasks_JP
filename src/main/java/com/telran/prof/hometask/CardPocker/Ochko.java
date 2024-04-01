package com.telran.prof.hometask.CardPocker;

import java.util.*;

public class Ochko {

    public static void main(String[] args) {
        Batch batch = new Batch();
        batch.getlotOfCards();
        Accomplices accomp = new Accomplices();
        final int cardsForPlayer = 5;
        int players;

        final int numberOfCards = batch.getSuits().size() * batch.getRanks().size();
        players = accomp.playaccomp(numberOfCards, cardsForPlayer);
        List<String> deck1;
        deck1 = batch.getDeckTemp();
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck1.get(i));
            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}