// Factorial.java
import java.util.Scanner;

public class 6 {
    // Метод для вычисления факториала с помощью рекурсии
    public static long factorial(int n) {
        if (n == 0) {
            return 1; // факториал 0 равен 1
        } else {
            return n * factorial(n - 1); // Рекурсивный случай
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим число
        System.out.print("Введите число для вычисления факториала: ");
        int num = scanner.nextInt();

        // Проверка на числа с минусовым знаком
        if (num < 0) {
            System.out.println("Факториал не существует для отрицательных чисел.");
        } else {
            // Результат
            long result = factorial(num);
            System.out.println("Факториал числа " + num + " равен " + result);
        }

        scanner.close();
    }
}
