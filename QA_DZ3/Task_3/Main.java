public class Main {
    public static void main(String[] args) {
        printColor(99);
    }

    public static void printColor(int value) {
        System.out.println(value < 0 ? "Красный" : (value <= 100 ? "Желтый" : "Зеленый"));
    }
}