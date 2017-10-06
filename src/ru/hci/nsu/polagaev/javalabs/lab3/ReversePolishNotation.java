package ru.hci.nsu.polagaev.javalabs.lab3;

import java.util.Scanner;
import java.util.Stack;

class ReversePolishNotation {
    public static void main(String args[]) {
        System.out.println("Введите выражение : ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        ReversePolishNotation infix = new ReversePolishNotation();
        System.out.println("Выражение в постфиксной : " + infix.convert(str));
    }

    private static String convert(String expression) {
        Stack<Character> s = new Stack();
        String result = new String();
        for (int i = 0; i < expression.length(); i++) {
            char temp = expression.charAt(i);
            if (temp >= 'a' && temp <= 'z' || temp >= '0' && temp <= '9') {
                result += temp;
            } else if (temp == '(') {
                s.push(temp);
            } else if (temp == ')') {
                while (!s.empty() && s.peek() != '(') {
                    result += s.pop();
                }
                s.pop();
            } else if (temp == '+' || temp == '-') {
                while (!s.empty() && s.peek() != '(') {
                    result += s.pop();
                }
                s.push(temp);
            } else if (temp == '*' || temp == '/') {
                while (!s.empty() && (s.peek() == '*' || s.peek() == '/')) {
                    result += s.pop();
                }
                s.push(temp);
            }
        }
        while (!s.empty()) {
            result += s.pop();
        }
        return result;
    }
}
