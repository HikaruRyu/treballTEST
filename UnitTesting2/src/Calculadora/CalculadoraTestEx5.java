package Calculadora;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTestEx5 {


        @Test
         void testExceptionIsThrown() {
            Calculadora.Calculator tester = new Calculator();
            assertThrows(IllegalArgumentException.class, () -> tester.multiply(1000, 5));
        }

        @Test
        void testMultiply() {
            Calculator tester = new Calculator();
            assertEquals(50, tester.multiply(10, 5), "10 x 5 must be 50");
        }
    }
}
