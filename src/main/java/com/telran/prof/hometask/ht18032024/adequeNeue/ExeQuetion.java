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

import java.util.*;

public class ExeQuetion implements NeueAdeQue {
    private static Integer[] elements;
    private int head;
    private int tail;

    public ExeQuetion(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity more than 1 ");
        }
        this.elements = new Integer[capacity];
        this.head = (capacity - 1) / 2;
        this.tail = head;
    }

    @Override
    public void addToHead(Integer element) {
        head = head - 1;
        elements[head] = element;
    }

    @Override
    public void addToTail(Integer element) {
        if (elements[tail - 1] == null)
            throw new NoSuchElementException();
        elements[tail] = element;
        tail++;
    }

    @Override
    public Integer poolHead() {
        if (elements[head] == null)
            throw new NoSuchElementException();
        int h = elements[head];
        elements[head] = null;
        head++;

        return h;
    }

    @Override
    public Integer poolTail() {
        if (elements[tail - 1] == null)
            throw new NoSuchElementException();
        int h = elements[tail - 1];
        elements[tail - 1] = null;
        tail--;
        return h;
    }

    @Override
    public Integer peekHead() {
        return elements[head];
    }

    @Override
    public Integer peekTail() {
        return elements[tail - 1];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public Iterator<Integer> iterator() {
        return new DeqIterator();
    }

    private class DeqIterator implements Iterator<Integer> {
        int cursor;
        int remaining = size();
        int lastRet;

        static final int inc(int i, int modulus) {
            if (++i >= modulus) i = 0;
            return i;
        }

        public int size() {
            return sub(tail, head, elements.length);
        }

        static final int sub(int i, int j, int modulus) {
            if ((i -= j) < 0) i += modulus;
            return i;
        }

        public final boolean hasNext() {
            return remaining > 0;
        }

        public Integer next() {
            if (elements[head] == null) {
                System.out.println(" this is the end ");
                System.exit(0);
            }

            cursor = inc(lastRet = cursor, elements.length);
            return elements[head++];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = tail - 1; i >= head; i--) {
            sb.append(elements[i]).append(" ");

        }
        return sb.toString();
    }
}

