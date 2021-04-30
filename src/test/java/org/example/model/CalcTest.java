package org.example.model;

import org.example.models.Calc;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {


    @Test
    @DisplayName("Test Sum")
    public void test_sum() {
        int a = 2;
        int b = 3;
        int sumActual = Calc.sum(a, b);
        int expected = 5;
        assertEquals(expected, sumActual);
    }
}
