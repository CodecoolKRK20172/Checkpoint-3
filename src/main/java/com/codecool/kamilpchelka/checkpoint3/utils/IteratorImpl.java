package com.codecool.kamilpchelka.checkpoint3.utils;

public class IteratorImpl<E> implements Iterator {

    private E[] array;
    private int currentIndex = 0;

    public IteratorImpl(E[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length && array[currentIndex] != null;
    }

    @Override
    public E next() {
        return array[currentIndex++];
    }
}
