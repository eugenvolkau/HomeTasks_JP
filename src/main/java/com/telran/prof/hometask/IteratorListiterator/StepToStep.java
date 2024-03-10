package com.telran.prof.hometask.IteratorListiterator;

import java.util.Iterator;


public class StepToStep implements Iterator<Integer> {
    int cursor;
    private Integer[] particle;

    public StepToStep(Integer[] particle) {
        this.particle = particle;
    }

    public StepToStep() {
    }

    public Iterator<Integer> iterator() {
        return new StepToStep();
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



