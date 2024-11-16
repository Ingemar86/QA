public class Main {

    public static void main(String[] args) {
        // Пример двумерного массива с корректными данными
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Пример двумерного массива с некорректным элементом (ошибка данных)
        String[][] invalidArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "abc", "12"},
                {"13", "14", "15", "16"}
        };

        // Пример двумерного массива с некорректным размером
        String[][] invalidSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        try {
            // Вызов метода для массива с корректными данными
            System.out.println("Проверка массива с корректными данными:");
            ArrayValidator.sumArray(validArray);

            // Вызов метода для массива с некорректными данными (ошибка преобразования)
            System.out.println("\nПроверка массива с некорректными данными:");
            ArrayValidator.sumArray(invalidArray);

        } catch (MyArraySizeException e) {
            System.err.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Ошибка данных: " + e.getMessage());
        }

        try {
            // Вызов метода для массива с некорректным размером
            System.out.println("\nПроверка массива с некорректным размером:");
            ArrayValidator.sumArray(invalidSizeArray);

        } catch (MyArraySizeException e) {
            System.err.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Ошибка данных: " + e.getMessage());
        }
    }
}
