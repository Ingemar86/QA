


public class FactorialTest {

    // факториа 0
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.factorial(0), "Факториал 0 должен быть 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, Factorial.factorial(5), "Факториал 5 должен быть 120");
    }

    @Test
    public void testFactorialOfLargerNumber() {
        assertEquals(720, Factorial.factorial(6), "Факториал 6 должен быть 720");
    }

    // Тестирование отрицательных чисел (ошибка)
    @Test
    public void testFactorialOfNegativeNumber() {
        assertEquals(1, Factorial.factorial(-1), "Факториал отрицательного числа не существует");
    }
}
