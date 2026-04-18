package com.example.calc;

import static com.example.calc.TipoOperacion.*;

public class ViewModel{


   private ICalculadora calculadora = new CalculadoraImpl();
    /* public Double suma(double x, double y) { return calculadora.suma(x,y);}
    public Double resta(double x, double y) { return calculadora.resta(x,y); }
    public Double mult(double x, double y) { return calculadora.mult(x,y); }
    public Double div(double x, double y) {
        if (y == 0) throw new ArithmeticException("División entre cero");
        return calculadora.div(x,y);
    } */

    ViewModel(){}

    Double makeOperation(Operacion operacion){
        switch(operacion.getTipoOperacion()){
            case SUMA:
            case RESTA:
            case MULT:
            case DIV:


        }
    return 1.0;
    }

    /* // makeOp que aparece en el pizarrón
    public Double makeOp(TipoOperacion op, double x, double y) {
        switch (op) {
            case SUMA:  return suma(x, y);
            case RESTA: return resta(x, y);
            case MULT:  return mult(x, y);
            case DIV:   return div(x, y);
            default: throw new IllegalArgumentException("Operación no válida");
        }
    } */
}
