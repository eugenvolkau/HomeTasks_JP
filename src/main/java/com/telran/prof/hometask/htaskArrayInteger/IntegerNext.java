package com.telran.prof.hometask.htaskArrayInteger;

import java.util.Iterator;

public class IntegerNext<I extends Number> {
    private Integer[] tools;

    public IntegerNext(Integer[] tools) {
        this.tools = tools;
    }

    public Iterator<Integer> iterator() {
        return new StepToStep();
    }

    private class StepToStep implements Iterator<Integer> {
        int cursor;

        @Override
        public boolean hasNext() {
            return cursor < tools.length;
        }

        @Override
        public Integer next() {
            int i = cursor;
            cursor = i + 1;
            return tools[i];
        }
    }

}
