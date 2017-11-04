package ru.hci.nsu.polagaev.javalabs.Lab9;

public interface Linked<E> {
    void addLast(E e);
    void removeLast();
    void addFirst(E e);
    void removeFirst();
    int size();

    E getElementByIndex(int current);
}
