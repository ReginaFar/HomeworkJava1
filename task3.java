// Задание 3.
// Реализовать простой калькулятор (операции + - / * )
// Пример работы программы:
// Введите число 1: 2
// Введите число 2: 3
// Введите операцию: +
// Ответ: 5
// Введите число 1: 2
// Введите число 2: 3
// Введите операцию: а
// Ответ: Такой операции нет

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int num1 = iScanner.nextInt();
        int num2 = iScanner.nextInt();
        System.out.println("Введите операцию (+, -, *, /): ");
        char operation = iScanner.next().charAt(0);
        int result = 0;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Такой операции нет!");
        }
        System.out.printf(num1 + " " + operation + " " + num2 + " = " + result);
        iScanner.close();
    }
}
