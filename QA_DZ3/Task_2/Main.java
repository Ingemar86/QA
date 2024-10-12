public class Main {
    public static void main(String[] args) {

        checkSumSign(5, 5);
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        System.out.println(sum >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }
}