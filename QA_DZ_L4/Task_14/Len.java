
import java.util.Arrays;

public class Len {
    public static void main(String[] args) {
        System.out.println("Результат: " + Arrays.toString(createArray(5, 3)));
    }
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}