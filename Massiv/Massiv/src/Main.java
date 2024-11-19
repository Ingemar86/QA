public class Main {
    public static void main(String[] args) {
        String[][] array1 = {
                { "1", "1", "1", "1" },
                { "1", "1", "1", "1" },
                { "1", "1", "1", "1" },
                // { "A", "1", "1", "1" },
                { "1", "1", "1", "1" }
        };
        try {
            int res = ArrrayValidator.arrayCheck(array1);
            System.out.println("Сумма массива:" + res);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка:" + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка:" + e.getMessage());
        }
    }

}