package com.telran.prof.hometask.ht18032024.Solitaer;

import java.util.Objects;

public class Decker {
    private Enum suit;
    private Enum range;


    public Decker(Enum r, Enum d) {
        this.suit = r;
        this.range = d;
    }

    public Enum getSuit() {
        return suit;
    }

    public void setSuit(Enum suit) {
        this.suit = suit;
    }

    public Enum getRange() {
        return range;
    }

    public void setRange(Enum range) {
        this.range = range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Decker)) return false;
        Decker decker = (Decker) o;
        return range == decker.range;
    }

    @Override
    public int hashCode() {
        return Objects.hash(range);
    }

    @Override
    public String toString() {
        return "Decker{" +
                "r=" + suit +
                ", d=" + range +
                '}';
    }
}
