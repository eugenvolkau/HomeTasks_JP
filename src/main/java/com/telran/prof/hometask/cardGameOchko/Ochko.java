package com.telran.prof.hometask.cardGameOchko;
import java.util.*;

public class Ochko {

    public static void main(String[] args) {

        Batch batch = new Batch();
        batch.lotOfCards();
        Accomplices accomp = new Accomplices();

        final int cardsForPlayer = 5;
        int players;
        final Scanner sc = new Scanner(System.in);

        List<Rank> ranks = Arrays.asList(Rank.values());
        List<Suits> suits = Arrays.asList(Suits.values());

        final int numberOfCards = suits.size() * ranks.size();

        players = accomp.playaccomp(numberOfCards, cardsForPlayer);
        List<String> deck1 = new ArrayList<>();
        deck1 = batch.getDeckTemp();

        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck1.get(i));
            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }

}

