package com.example.intento;

public class Fibonacci {

    public static long ecuacion(int n) {
        double phi  =  (1 + Math.sqrt(5)) / 2;
        double psi  =  (1 - Math.sqrt(5)) / 2;
        double sqrt5 = Math.sqrt(5);

        return Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5);
    }

}