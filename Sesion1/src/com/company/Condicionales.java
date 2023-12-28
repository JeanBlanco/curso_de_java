package com.company;

public class Condicionales {

    public static void main(String[] args) {

        int edad = 19;
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }



        String dia = "sabado";

        if(dia.equals("Lunes")){
            System.out.println("segundo dia de la semana");
        }else if(dia.equals("Martes")){
            System.out.println("Tercer dia de la semana");
        }else if(dia.equals("Miercoles")){
            System.out.println("cuarto dia dia de la semana");
        }else if(dia.equals("jueves")){
            System.out.println("quinto dia  dia de la semana");
        }else if(dia.equals("viernes")){
            System.out.println("sexto dia de la semana");
        }else if(dia.equals("sabado")){
            System.out.println("septimo dia  dia de la semana");
        }else{
            System.out.println("Este dia no esta en tu calendario");
        }
   }
}
