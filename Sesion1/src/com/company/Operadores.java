package com.company;

public class Operadores {

    public static void main(String[] args) {

        //Aritmeticos

        int numero1 = 13;
        int numero2 = 52;
        int resultadoSuma = numero1 + numero2;

        System.out.println(resultadoSuma);

        int resultadoResta = numero1 - numero2;
        System.out.println(resultadoResta);


        /*
        Comparacion:

        < menor que
        > mayor que
        >= mayor o igual que
        <= menor o igual que
        == igual que
         */

        boolean resultado1 = numero1 < numero2;
        System.out.println(resultado1);
        boolean resutado2 = numero1 > numero2;
        System.out.println(resutado2);

        /*
        Operadores logicos

        an = &&
        0r ||
         */

        int edad = 17;
        boolean carnetJoven = edad >= 15 && edad <= 26;
        System.out.println(carnetJoven);
    }
}
