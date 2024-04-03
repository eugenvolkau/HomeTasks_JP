package com.telran.prof.hometask.ht18032024.adequeNeue;

public interface NeueAdeQue {
    void addToHead(Integer element);
    void addToTail(Integer element);

    Integer poolHead();
    Integer poolTail();

    Integer peekHead();

    Integer peekTail();
    boolean isEmpty();

    boolean isEmty();

}
