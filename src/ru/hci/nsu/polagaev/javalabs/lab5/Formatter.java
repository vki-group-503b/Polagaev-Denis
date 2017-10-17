package ru.hci.nsu.polagaev.javalabs.lab5;

class Formatter {
    public static void main(String[] args) {
        double t = 17.36;
        String p = new String();
        String s = p.format("Температура в новосибирске = ${0}.",t);
        System.out.println(s);
    }
}