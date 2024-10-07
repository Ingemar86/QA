public class Main {
    public static void main(String[] args) {
        printStringMultipleTimes("Как дела?", 11);
    }
    public static void printStringMultipleTimes(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

}
