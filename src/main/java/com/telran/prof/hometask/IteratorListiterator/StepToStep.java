package com.telran.prof.hometask.IteratorListiterator;

import java.util.Iterator;
import java.util.ListIterator;


abstract class StepToStep implements ListIterator<Integer> {
    int cursor;
    private Integer[] particle;

    public StepToStep(Integer[] particle) {
        this.particle = particle;
    }

    public StepToStep() {
    }

    @Override
    public boolean hasNext() {
        return cursor < particle.length;
    }

    @Override
    public Integer next() {
        int i = cursor;
        cursor = i + 1;
        return particle[i];
    }
}



