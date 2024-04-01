package com.telran.prof.hometask.CardPocker;

import java.util.*;

public class Batch {
   private List<Rank> ranks = Arrays.asList(Rank.values());
    private List<Suits> suits = Arrays.asList(Suits.values());
    public List<String> deckTemp;

    public List<Rank> getRanks() {
        return ranks;
    }

    public List<Suits> getSuits() {
        return suits;
    }

    public Batch() {

        deckTemp = new ArrayList<>(getlotOfCards());
    }

    public List<String> getDeckTemp() {
        return deckTemp;
    }

    final Random random = new Random();

    public List<String> getlotOfCards() {

        List<String> deckTemp = new ArrayList<>();

        for (int i = 0; i < ranks.size(); i++) {
            for (int j = 0; j < suits.size(); j++) {
                deckTemp.add(0, ranks.get(i) + " " + suits.get(j));
            }
        }
        int a = ranks.size() * suits.size();
        Stack deckSteck = new Stack();
        // deck shuffling
        for (int i = 0; i < a; i++) {
            int card = i + (random.nextInt(0, a - i));
            String str = deckTemp.get(card);
            deckTemp.set(card, deckTemp.get(i));
            deckTemp.set(i, str);
        }
        return deckTemp;
    }
}
