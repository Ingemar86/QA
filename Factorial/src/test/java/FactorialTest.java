import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class FactorialTest {

    @Test
    void testCalculateFactorial_PositiveNumber() {
        assertEquals(120, Factorial.calculateFactorial(5), "Факториал 5 должен быть 120");
    }

    @Test
    void testCalculateFactorial_Zero() {
        assertEquals(1, Factorial.calculateFactorial(0), "Факториал 0 должен быть 1");
    }

    @Test
    void testCalculateFactorial_NegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateFactorial(-1);
        });
        assertEquals("Факториал отрицательного числа не существует.", exception.getMessage());
    }

    @Test
    void testCalculateFactorial_LargeNumber() {
        assertEquals(2432902008176640000L, Factorial.calculateFactorial(20), "Факториал 20 должен быть 2432902008176640000");
    }
}
