package ru.hci.nsu.polagaev.javalabs.Lab4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class WorkingWithFile {
    private int numbersofwords;
    private int numberofrows;
    private int numberofcharacters;
    private HashMap<Character, Integer> hashmap = new HashMap<>();

    private WorkingWithFile() throws IOException {
        File file = new File("F:\\JavaLabs\\src\\ru\\hci\\nsu\\polagaev\\javalabs\\Lab4\\file.txt");
        if (file.createNewFile()) {
            System.out.println("Файл создан: ");
        }else System.out.println("Файл существует: ");
        Scanner scanner = new Scanner(new FileInputStream(file));
        while (scanner.hasNextLine()) {
            numberofrows++;
            Scanner row = new Scanner(scanner.nextLine());
            while (row.hasNext()) {
                numbersofwords++;
                String word = row.next();
                for (char letter : word.toCharArray()) {
                    if (Character.isLetter(letter)) {
                        numberofcharacters++;
                        letter = Character.toUpperCase(letter);
                        int count = 0;
                        if (hashmap.containsKey(letter)) {
                            count = hashmap.get(letter);
                        }
                        hashmap.put(letter, count + 1);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        WorkingWithFile ecs = new WorkingWithFile();
        System.out.println("Число строк: " + ecs.numberofrows);
        System.out.println("Число слов: " + ecs.numbersofwords);
        System.out.println("Число букв: " + ecs.numberofcharacters);
        for (HashMap.Entry<Character, Integer> entry : ecs.hashmap.entrySet()) {
            System.out.printf("Буква: %s:%d%n", entry.getKey(), entry.getValue());
        }
    }
}
