package com.example.calc;
import org.junit.Assert;
import org.junit.Test;

public class ViewModelTest{

@Test
    void testMakeOperationSuma(){
    ViewModel viewModel = new ViewModel();

    Operacion operacion = new Operacion(5.0, 5.0, TipoOperacion.SUMA);

    Double resultado = viewModel.makeOperation(operacion);
    Assert.assertNotNull(resultado);
    Asser.assertEquals(10.0)


    }

}
