package ru.hci.nsu.polagaev.javalabs.Lab9;


import java.util.Iterator;

public class LinkedList<E> implements Linked<E>, Iterable<E>, DescendingIterator<E> {

    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    public LinkedList() {
        last = new Node<E>(null, first, null);
        first = new Node<E>(null, null, last);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = last;
        prev.setCurrentElement(e);
        last = new Node<E>(null, prev, null);
        prev.setNextElement(last);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = first;
        next.setCurrentElement(e);
        first = new Node<E>(null, null, next);
        next.setPrevElement(first);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();
    }

    @Override
    public void removeLast() {
        Node<E> prev = last;
        prev.getCurrentElement();
        prev.setNextElement(null);
        size--;
    }

    @Override
    public void removeFirst() {
        Node<E> next = first;
        next.getCurrentElement();
        next.setPrevElement(null);
        size--;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = first.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<>() {
            int counter = size - 1;

            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public E next() {
                return getElementByIndex(counter--);
            }
        };
    }
}