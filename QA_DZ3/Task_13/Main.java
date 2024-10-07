public class Main {
    public static void main(String[] args) {
        fillDiagonal();
    }
    public static void fillDiagonal() {
        int size = 5;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }
        System.out.println("13). Массив с диагональю:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
