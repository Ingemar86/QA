public class Main {
    public static void main(String[] args) {
        demoIsNegative(-2);
    }
    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void demoIsNegative(int number) {
        boolean result = isNegative(number);
        System.out.println("Результат: " + result);
    }
}
