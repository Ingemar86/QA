public class Main {
    public static void main(String[] args) {
        CheckLeapYear(2024);
    }
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void CheckLeapYear(int year) {
        boolean result = isLeapYear(year);
        System.out.println("Год " + year + " високосный: " + result);
    }
}
