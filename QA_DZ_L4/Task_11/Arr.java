
import java.util.Arrays;

public class Arr {

    public static void main(String[] args) {

        int[] arr = new int[100];


        for (int i = 0; i < arr.length; i++) {

            arr[i] = i + 1;
        }
        System.out.println("Заполненный массив: " + Arrays.toString(arr));
    }
}