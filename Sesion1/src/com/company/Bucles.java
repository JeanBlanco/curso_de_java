package com.company;

public class Bucles {

    public static void main(String[] args) {
        // For
/*
        for(int i = 0; i <10; i++){
            System.out.println("El valor de i es: " + i);

         }

        String[] nombres = {"Jean", "Carlos", "Programer"};
        for(int i = 0; i < nombres.length; i++  ){
            System.out.println(nombres[i]);
        }

        int suma = 0;
        int[] numeros = {5,6,8,9,4};
        for (int i = 0; i < numeros.length; i++){
            suma = suma + numeros[i];
            System.out.println(suma);
        }

 */
/*

        //ForEach
        String[] nombres = {"Jean", "Carlos", "Programer"};
        for (String nombre: nombres){
            System.out.println(nombre);
        }

        int[] numeros = {5,6,8,9,4};
        int suma = 0;
        for(int numero : numeros){
            suma += numero;
            System.out.println(suma);
        }
        // en esta Linea solo me muestra la suma total, en la de arriba me muestrasla lista de los numeros y la suma paso a paso
        System.out.println(suma);

 */

        //while

        int contador = 0;
        while (contador < 10){
            contador++;
            if (contador == 5){
                break;
               // continue; continua el ciclo pero saltandose el nuemero 5
            }
            System.out.println("El valor del contador es :" + contador);
        }


    }

}
