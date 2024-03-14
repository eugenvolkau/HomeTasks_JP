package com.telran.prof.hometask.cardGameOchko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Batch {

    List<Rank> ranks = Arrays.asList(Rank.values());
    List<Suits> suits = Arrays.asList(Suits.values());
    public List<String> deckTemp;

    public Batch() {

        deckTemp = new ArrayList<>(lotOfCards());
    }

    public List<String> getDeckTemp() {
        return deckTemp;
    }

    public void setDeckTemp(List<String> deckTemp) {
        this.deckTemp = deckTemp;
    }

    final Random random = new Random();

    public List<String> lotOfCards() {

        List<String> deckTemp = new ArrayList<>();

        for (int i = 0; i < ranks.size(); i++) {
            for (int j = 0; j < suits.size(); j++) {
                deckTemp.add(0,ranks.get(i) + " " + suits.get(j));
                            }
        }
int a = ranks.size()*suits.size();
        // deck shuffling
        for (int i = 0; i < a; i++) {
            int card = i + (random.nextInt(0,a - i));
            String str = deckTemp.get(card);
            deckTemp.set(card, deckTemp.get(i));
            deckTemp.set(i, str);
        }
 return deckTemp;
    }
}
