package ru.hci.nsu.polagaev.javalabs.Lab9;

import java.util.LinkedList;

public class MyLinkedList {

    LinkedList<Value> linkedList = new LinkedList<>();

    public void addFirst(int value) { //добавляет элемент в начало списка
        linkedList.addFirst(new Value(value));
    }

    public void addLast(int value) { // добавляет элемент в конец списка
        linkedList.addLast(new Value(value));
    }

    public int getFirst() { // получает первый элемент
        Value First = linkedList.getFirst();
        return First.getValue();
    }

    public int getLast() { // получает последний элемент
        Value Last = linkedList.getLast();
        return Last.getValue();
    }

    public void removeFirst() { // удаляет первый элемент из начала списка
        linkedList.removeFirst();
    }

    public void removeLast() { // удаляет последний элемент из конца списка
        linkedList.removeLast();
    }

    public void add(int value) { // добавляет элемент
        linkedList.add(new Value(value));
    }

    public void print_list() { // выводит список
        for (Value value : linkedList) {
            System.out.println(value.getValue());
        }
    }
}

class Main {  // Для теста потом удалю
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(10);
        myLinkedList.add(5);
        myLinkedList.add(10);
        myLinkedList.print_list();
        System.out.println("\n");
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.getFirst());
    }
}
