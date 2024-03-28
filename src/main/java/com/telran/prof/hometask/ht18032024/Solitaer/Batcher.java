package com.telran.prof.hometask.ht18032024.Solitaer;

import java.util.*;

public class Batcher {

    private List<Range> ranges = Arrays.asList(Range.values());
    private List<Suit> suits = Arrays.asList(Suit.values());
    final Random random = new Random();

    public List<Decker> batcher() {
        final int a = ranges.size() * suits.size();
        List<Decker> deckTemp = new ArrayList<>();
        for (int i = 0; i < suits.size(); i++) {
            for (int j = 0; j < ranges.size(); j++) {
                Decker deck = new Decker(suits.get(i), ranges.get(j));
                //System.out.println(deck);
                deckTemp.add(deck);
            }
        }
        Decker str;
        for (int i = 0; i < a; i++) {
            int card = i + (random.nextInt(0, a - i));
            str = deckTemp.get(card);
            deckTemp.set(card, deckTemp.get(i));
            deckTemp.set(i, str);
        }
        return deckTemp;
    }
}
