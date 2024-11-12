import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class FactorialCalculatorTestNG {

    @Test
    public void testFactorialOfZero() {
        // Факториал 0 должен быть равен 1
        assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        // Проверим несколько простых значений
        assertEquals(FactorialCalculator.factorial(1), 1); // 1! = 1
        assertEquals(FactorialCalculator.factorial(2), 2); // 2! = 2
        assertEquals(FactorialCalculator.factorial(3), 6); // 3! = 6
        assertEquals(FactorialCalculator.factorial(5), 120); // 5! = 120
    }

    @Test
    public void testFactorialOfLargeNumber() {
        // Проверим для более большого числа
        assertEquals(FactorialCalculator.factorial(10), 3628800); // 10! = 3628800
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        // Проверка на отрицательное число
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-1);
        });
        assertEquals(thrown.getMessage(), "Факториал для отрицательных чисел не существует.");
    }
}
