import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    // Тест для положительного числа
    @Test
    public void testCalculateFactorial_PositiveNumber() {
        long result = Factorial.calculateFactorial(5);
        Assert.assertEquals(result, 120, "Факториал числа 5 должен быть 120");
    }

    // Тест для числа 0
    @Test
    public void testCalculateFactorial_Zero() {
        long result = Factorial.calculateFactorial(0);
        Assert.assertEquals(result, 1, "Факториал числа 0 должен быть 1");
    }

    // Тест для отрицательного числа (должен выбрасываться исключение)
    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Факториал отрицательного числа не существует.")
    public void testCalculateFactorial_NegativeNumber() {
        Factorial.calculateFactorial(-1);
    }

    // Тест для большого числа
    @Test
    public void testCalculateFactorial_LargeNumber() {
        long result = Factorial.calculateFactorial(20);
        Assert.assertEquals(result, 2432902008176640000L, "Факториал числа 20 должен быть 2432902008176640000");
    }
}
