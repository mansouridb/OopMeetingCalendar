package org.example.model;

import org.example.models.Calc;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {


    @Test
    @DisplayName("Test Sum")
    public void test_sum() {
        int sumActual = Calc.sum(2, 3);
        int expected = 5;
        assertEquals(expected, sumActual);
    }
}
