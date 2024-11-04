// Определяем пользовательское исключение MyAggragDataException, расширяющее класс Exception
class MyAggragDataException extends Exception {
    public MyAggragDataException(String message) {
        super(message); // Передаем сообщение в родительский класс Exception
    }
}

// Определяем пользовательское исключение MyAggragSizeException
class MyAggragSizeException extends Exception {
    public MyAggragSizeException(String message) {
        super(message); // Передаем сообщение в родительский класс Exception
    }
}

// Главный класс, в котором будут находиться методы валидации и суммирования
public class ArrayValidator {

    // Метод для валидации двумерного строкового массива
    public static void validateArray(String[][] array) throws MyAggragSizeException {
        if (array.length != 4) {
            throw new MyAggragSizeException("Количество строк должно быть 4"); // Проверяем количество строк
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyAggragSizeException("Количество столбцов должно быть 4"); // Проверяем количество столбцов
            }
        }
    }

    // Метод для суммирования элементов массива после их преобразования в int
    public static int sumArray(String[][] array) throws MyAggragDataException {
        int sum = 0; // Переменная для хранения суммы
        for (int i = 0; i < array.length; i++) { // Проходим по строкам
            for (int j = 0; j < array[i].length; j++) { // Проходим по столбцам
                try {
                    // Пробуем преобразовать элемент массива в int
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    // Если не удалось, выбрасываем исключение с детализацией
                    throw new MyAggragDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum; // Возвращаем общую сумму
    }

    // Метод main для запуска программы
    public static void main(String[] args) {
        // Пример корректного массива 4x4
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Пример некорректного массива (нечисловое значение)
        String[][] invalidArray = {
                {"1", "2", "x", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Обработка корректного массива
        try {
            validateArray(validArray); // Проверка корректности массива
            int totalSum = sumArray(validArray); // Суммирование элементов
            System.out.println("Сумма элементов массива: " + totalSum); // Вывод суммы
        } catch (MyAggragSizeException | MyAggragDataException e) {
            System.out.println("Ошибка: " + e.getMessage()); // Вывод сообщения об ошибке
        }

        // Обработка некорректного массива
        try {
            validateArray(invalidArray); // Проверка корректности массива
            int totalSum = sumArray(invalidArray); // Попытка суммирования элементов
            System.out.println("Сумма элементов массива: " + totalSum); // Этот код не выполнится
        } catch (MyAggragSizeException | MyAggragDataException e) {
            System.out.println("Ошибка: " + e.getMessage()); // Вывод сообщения об ошибке
        }
    }
}
