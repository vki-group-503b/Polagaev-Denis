package ru.hci.nsu.polagaev.javalabs.lab5;

import java.util.Formatter;

public class Formatterr {
    public static void main(String[] args) {
        String yourName = "Igor", name = "Jarvis", description = "AI from some movie";
        StringBuffer buffer = new StringBuffer();
        Formatter formatter = new Formatter();
        formatter.format("Hello, %s. My name is %s,\nI am  %s - %s.", yourName, name, name, description);
        System.out.println(formatter);
    }
}
