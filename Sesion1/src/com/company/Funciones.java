package com.company;

public class Funciones {

    public static void main(String[] args) {
        //Funcion sin parametro y sin tipo de retorno
        showMenu();

        // Funcion sin parametro y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);

        //Funcion con parametros sin retorno
        imprimirMiNombre("Programer");

        // Funcion con nparametro y con tipo de retorno
        String nombre = "Jean";
        String apellido = "Blanco";
        String saludo = obtenerSaludo(nombre,apellido);
        System.out.println(saludo);

        int resultado = suma(45 , 50);
        System.out.println(resultado);

    }

    static int suma(int operador1, int operador2){
        return operador1 + operador2;
    }

     static String obtenerSaludo(String nombre, String apellido) {
        return "Hello, " + nombre + " " + apellido;
    }

    static void imprimirMiNombre(String name) {
        System.out.println("Como estas " + name);
    }


    static  void  showMenu(){
        System.out.println("Bienvenidos a la tienda de zapatos");
        System.out.println("1 - ver zapatos");
        System.out.println("2 - comprar zapatillas ");
        System.out.println("3 - salir");
    }

    static  String getMenu(){
        System.out.println("imprimiendo texto de prueba");
        return  "Bienvenidos a la tienda de zapatos: \n 1 - ver zapatos.....";
    }
}
