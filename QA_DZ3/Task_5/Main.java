import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        checkUserSumInRange();
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkUserSumInRange() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        boolean result = isSumInRange(num1, num2);
        System.out.println("Результат: " + result);

        scanner.close();
    }
}