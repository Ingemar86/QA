// Исключение для ошибки размера массива
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

// Исключение для ошибки данных
class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

// Класс для валидации и обработки массива
public class ArrayValidator {

    // Приватный метод для проверки правильности размера массива
    private static void validateArray(String[][] array) throws MyArraySizeException {
        // Проверка, что массив имеет размер 4x4
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива: количество строк должно быть 4.");
        }

        // Проверка, что каждая строка имеет 4 элемента
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Неверный размер массива: каждая строка должна содержать 4 элемента.");
            }
        }
    }

    // Метод для суммирования элементов массива с валидацией
    public static void sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Сначала проверяем размер массива
        validateArray(array);

        int totalSum = 0; // Переменная для хранения суммы

        // Пробежимся по каждому элементу массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    // Преобразуем строку в целое число
                    totalSum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    // Если преобразование не удалось, выбрасываем исключение с деталями
                    throw new MyArrayDataException("Ошибка преобразования в число в ячейке [" + i + "][" + j + "]: '" + array[i][j] + "' не является числом.");
                }
            }
        }

        // Выводим сумму элементов массива
        System.out.println("Сумма элементов массива: " + totalSum);
    }
}
