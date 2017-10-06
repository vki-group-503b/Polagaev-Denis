package ru.hci.nsu.polagaev.javalabs.lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        {
            while (true) {
                // Для проверки ( 8 + 2 * 5 ) / ( 1 + 3 * 2 - 4 )
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите вырожения, Каждый оператор должен разделяться пробелом : ");
                String infix = scanner.nextLine();
                String postfix = ReversePolishNotation.convert(infix);
                System.out.println("Выражение в постфиксной : " + postfix);
                System.out.println("Посчитанное вырожение : " + Calculation.calculation(postfix));
                System.out.println("Ходите перевести ещё 1-да, 2-нет : ");
                String s = scanner.next();
                if (s.equals("2")) {
                    break;
                }
            }
        }
    }
}
