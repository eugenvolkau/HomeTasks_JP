package com.telran.prof.hometask.htaskArrayList;

import java.util.Iterator;

public class AnLagerOfNext {

   private String[] tools;

    public AnLagerOfNext(String[] tools){
        this.tools=tools;
    }

    public Iterator<String> iterator(){

        return new StepByStep();
    }

    private class StepByStep implements Iterator<String>{
        int cursor;

        @Override
        public boolean hasNext() {
            return cursor < tools.length;
        }

        @Override
        public String next() {
            int i = cursor;
            cursor=i+1;

            return tools[i];
        }
   }

}
