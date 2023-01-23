// Задание 1.
// Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        System.out.println(n);
        int sum = n;
        int mult = n;
        while (n > 1) {
            sum = sum + (n - 1);
            n--;
            mult = mult * n;
        }
        System.out.printf("Сумма чисел от 1 до n = %d", sum);
        System.out.println();
        System.out.printf("Произведение чисел от 1 до n = %d", mult);

        iScanner.close();
    }
}
