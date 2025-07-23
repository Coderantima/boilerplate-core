package com.example.boilerplate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorTest {
  @Test
  void testAdd() {
    Calculator calc = new Calculator();
    assertEquals(5, calc.add(2, 3));
  }

  @Test
  void testMultiplyWithMock() {
    Calculator calc = Mockito.mock(Calculator.class);
    Mockito.when(calc.multiply(3, 4)).thenReturn(12);
    assertEquals(12, calc.multiply(3, 4));
    Mockito.verify(calc).multiply(3, 4);
  }
}
