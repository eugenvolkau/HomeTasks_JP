//Дописать свой собственный класс очередь : Интерфейс и часть реализации
// сделали на уроке. Доделать методы peekTail,peekHead, isEmpty, добавить
// проверки на границы индексов во все методы реализованные на уроке.
//   После реализации методов, выполнить сравнение собственного класса и
//   оригинального ArrayDeque,
//        А именно, запустить один и тот же набор операций для обоих классов :
//        a) Добавить 10 элементов в начало.
//        b) Добавить 12 элементов в конец.
//        (используйте цикл для добавления)
//
//        с) удалить 4 элемента с хвоста.
//        d) удалить 2 элемента с головы.
//
//        Вывести результат в консоль.
//        Для обоих реализаций - результат должен совпадать.
//
//        5)*Опционально, добавить итератор в собственную очередь.



package com.telran.prof.hometask.ht18032024.adequeNeue;

import java.util.NoSuchElementException;

public class ExeQuetion implements NeueAdeQue {
    private final Integer[] elements;
    private int head;
    private int tail;

    public  ExeQuetion(int capacity){
        if (capacity<1){
            throw new IllegalArgumentException("Capacity more than 1 ");
        }
        this.elements=new Integer[capacity];
        this.head=(capacity-1)/2;
        this.tail=head;
    }
    @Override
    public void addToHead(Integer element) {
        head=head-1;
        elements[head]=element;
    }

    @Override
    public void addToTail(Integer element) {
        elements[tail]=element;
        tail++;
    }

    @Override
    public Integer poolHead() {
        final Integer h;
        h=elements[head];
        if (elements[head]!= null) {
            elements[head] = null;
head++;
        }
        return h;
    }

    @Override
    public Integer poolTail() {
        if (elements[tail-1] == null)
            throw new NoSuchElementException();
       int h=elements[tail-1];
            elements[tail-1]=null;
tail--;
        return h;
    }

    @Override
    public Integer peekHead() {
        return elements[head];
    }

    @Override
    public Integer peekTail() {
        return elements[tail-1];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isEmty() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = tail-1; i >= head ; i--) {
            sb.append(elements[i]).append(" ");;

        }
        return sb.toString();
    }
}

