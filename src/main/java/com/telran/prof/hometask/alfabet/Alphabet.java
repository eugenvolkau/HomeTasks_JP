package com.telran.prof.hometask.alfabet;

public class Alphabet {
    private String name;
    int k = 27;
    char[] arrchar_eng = new char[27];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printAlphabet() {
        System.out.println("Alphabet    " + name);
    }
}

