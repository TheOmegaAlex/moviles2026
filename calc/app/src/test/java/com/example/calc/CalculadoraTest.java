package com.example.calc;

import org.junit.Assert;
import org.junit.Test;
public class CalculadoraTest {

    @Test
    public void testOperationSuma() {
        ICalculadora calculadora = new CalculadoraImpl();
        Double result = calculadora.suma(5,5);
        Assert.assertEquals(10.0,result);
    }
}
