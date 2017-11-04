package ru.hci.nsu.polagaev.javalabs.Lab9;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> stringLinked = new LinkedList<>();
        stringLinked.addLast("Привет");
        stringLinked.addLast("Денис");
        stringLinked.addLast("Полагаев");
        stringLinked.addLast("Михайлович");
        stringLinked.addFirst("agag");
        System.out.println("Элементов в списке " + stringLinked.size());

        stringLinked.removeLast();
        stringLinked.removeFirst();

        for (String s :stringLinked){
            System.out.println(s);
        }
    }
}
